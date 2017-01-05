package org.mdacc.ristore.ws.fm.vo;

import java.util.Date;

import org.mdacc.ristore.ws.fm.models.FmReportTb;

public class FmReportVO {
	private String frBlockId;
	private Date frCollectionDate;
	private String frDiagnosis;
	private String frFullName;
	private String frReportId;
	private String filename;
	private String filepath;
	private String mrn;
	
	
	public FmReportVO() {
		super();
	}

	public FmReportVO(FmReportTb fmReport) {
		this.frBlockId = fmReport.getFrBlockId();
		this.frCollectionDate = fmReport.getFrCollectionDate();
		this.frDiagnosis = fmReport.getFrDiagnosis();
		this.frFullName = fmReport.getFrFullName();
		this.frReportId = fmReport.getFrReportId();
		
		this.mrn = fmReport.getSpecimenTb().getMrn();
	}

	public String getFrBlockId() {
		return frBlockId;
	}

	public void setFrBlockId(String frBlockId) {
		this.frBlockId = frBlockId;
	}

	public Date getFrCollectionDate() {
		return frCollectionDate;
	}

	public void setFrCollectionDate(Date frCollectionDate) {
		this.frCollectionDate = frCollectionDate;
	}

	public String getFrDiagnosis() {
		return frDiagnosis;
	}

	public void setFrDiagnosis(String frDiagnosis) {
		this.frDiagnosis = frDiagnosis;
	}

	public String getFrFullName() {
		return frFullName;
	}

	public void setFrFullName(String frFullName) {
		this.frFullName = frFullName;
	}

	public String getFrReportId() {
		return frReportId;
	}

	public void setFrReportId(String frReportId) {
		this.frReportId = frReportId;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filepath) {
		this.filename = filepath;
	}

	public String getMrn() {
		return mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
}
