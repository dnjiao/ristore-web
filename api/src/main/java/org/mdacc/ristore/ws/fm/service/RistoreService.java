package org.mdacc.ristore.ws.fm.service;

import java.util.List;

import org.mdacc.ristore.ws.fm.vo.FmReportVO;

public interface RistoreService {

	List<FmReportVO> findAllFmReports();
	List<FmReportVO> findFmReportsByBlockId(String blockId);
	List<FmReportVO> findFmReportsByReportId(String reportId);
	List<FmReportVO> findFmReportsByMrn(String mrn);
}
