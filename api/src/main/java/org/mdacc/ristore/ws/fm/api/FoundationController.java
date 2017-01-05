package org.mdacc.ristore.ws.fm.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.mdacc.ristore.ws.fm.service.FmTrfService;
import org.mdacc.ristore.ws.fm.service.RistoreService;
import org.mdacc.ristore.ws.fm.vo.FmReportVO;
import org.mdacc.ristore.ws.fm.vo.TRFWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoundationController {
	
	@Autowired
	private RistoreService ristoreService;
	
	@Autowired
	private FmTrfService fmTrfService;
	
	
	@RequestMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }

	@RequestMapping(
			value = "/foundation/",
			method = RequestMethod.GET,
			produces = "application/json")
	public ResponseEntity<List<FmReportVO>> getAllFmReports() {
		List<FmReportVO> reports = ristoreService.findAllFmReports();
		if (reports == null) {
			return new ResponseEntity<List<FmReportVO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<FmReportVO>>(reports, HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/foundation/blockid/{blockid}",
			method = RequestMethod.GET,
			produces = "application/json")
	public ResponseEntity<List<FmReportVO>> getFmReportsByBlockId(@PathVariable String blockid) {
		List<FmReportVO> reports = ristoreService.findFmReportsByBlockId(blockid);
		if (reports.size() == 0) {
			return new ResponseEntity<List<FmReportVO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<FmReportVO>>(reports, HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/foundation/reportid/{reportid}",
			method = RequestMethod.GET,
			produces = "application/json")
	public ResponseEntity<List<FmReportVO>> getFmReportsByReportId(@PathVariable String reportid) {
		List<FmReportVO> reports = ristoreService.findFmReportsByReportId(reportid);
		if (reports.size() == 0) {
			return new ResponseEntity<List<FmReportVO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<FmReportVO>>(reports, HttpStatus.OK);
	}

	@RequestMapping(
			value = "/foundation/mrn/{mrn}",
			method = RequestMethod.GET,
			produces = "application/json")
	public ResponseEntity<List<FmReportVO>> getFmReportsByMrn(@PathVariable String mrn) {
		List<FmReportVO> fmReports = ristoreService.findFmReportsByMrn(mrn);
		if (fmReports.size() == 0) {
			return new ResponseEntity<List<FmReportVO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<FmReportVO>>(fmReports, HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/foundation/xml/{filepath}",
			method = RequestMethod.GET,
			produces = "application/xml")
	public ResponseEntity<byte[]> downloadXMLFile(@PathVariable String filepath) throws IOException {
/*		FileSystemResource xmlFile = new FileSystemResource("/rsrch1/rists/moonshot/data/prod/foundation/xml/" + filename + ".xml");
		byte [] content = new byte[(int)xmlFile.contentLength()];
        IOUtils.read(xmlFile.getInputStream(), content);

        return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType("application/octet-stream"))
            .contentLength(xmlFile.contentLength())
            .body(content);*/
		FileInputStream fileStream;
        fileStream = new FileInputStream(new File(filepath));
        byte[] content = IOUtils.toByteArray(fileStream);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/xml"));
        headers.setContentDispositionFormData(filepath, filepath);
        return new ResponseEntity<byte[]>(content, headers, HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/foundation/xml/reportid/{reportid}",
			method = RequestMethod.GET,
			produces = "application/xml")
	public ResponseEntity<byte[]> getXMLFileByReportId(@PathVariable String reportid) throws IOException {
		List<FmReportVO> reports = ristoreService.findFmReportsByReportId(reportid);
		if (reports.size() == 0) {
			return new ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
		}
		String filepath = reports.get(0).getFilepath();
		FileInputStream fileStream;
//        fileStream = new FileInputStream(new File("/rsrch1/rists/moonshot/data/prod/foundation/xml/TRF117982_08042016001105.xml"));
		fileStream = new FileInputStream(new File(filepath)); 
        byte[] content = IOUtils.toByteArray(fileStream);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/xml"));
        headers.setContentDispositionFormData(filepath, reportid + ".xml");
        return new ResponseEntity<byte[]>(content, headers, HttpStatus.OK);
		
	}
	
	@RequestMapping(
			value = "/foundation/trfs/sarc",
			method = { RequestMethod.POST, RequestMethod.GET },
			consumes = "application/json")
	public ResponseEntity<List<String>> updateTRFTable(@RequestBody final TRFWrapper trfs) {
		fmTrfService.saveTrfs(trfs.getTrfs(), "SARC");
		return new ResponseEntity<List<String>>(trfs.getTrfs(), HttpStatus.OK);
	}

}
