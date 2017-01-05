package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SPECIMEN_TB database table.
 * 
 */
@Entity
@Table(name="SPECIMEN_TB")
@NamedQueries({
	@NamedQuery(name="SpecimenTb.findAll", query="SELECT s FROM SpecimenTb s"),
	@NamedQuery(name="SpecimenTb.findBySpecimenNo", query="select s from SpecimenTb s where s.specimenNo = :specimenNo"),
})

public class SpecimenTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SPECIMEN_TB_ROWID_GENERATOR", sequenceName="SPECIMEN_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SPECIMEN_TB_ROWID_GENERATOR")
	@Column(name="ROW_ID")
	private long rowId;

	@Column(name="CNV_FILE")
	private String cnvFile;

	@Temporal(TemporalType.DATE)
	@Column(name="COLLECTION_DATE")
	private Date collectionDate;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_TS")
	private Date deleteTs;

	private String diagnosis;

	@Column(name="DISEASE_SITE")
	private String diseaseSite;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Column(name="FILE_LOAD_ID")
	private BigDecimal fileLoadId;

	@Column(name="FOREIGN_ID")
	private BigDecimal foreignId;

	@Column(name="FOREIGN_REPORT_ID")
	private BigDecimal foreignReportId;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	private String mrn;

	private String platform;

	private String project;

	private String protocol;

	@Column(name="PROTOCOL_ACC_NO")
	private String protocolAccNo;

	@Column(name="RNA_EXON_FILE")
	private String rnaExonFile;

	@Column(name="RNA_GENE_FILE")
	private String rnaGeneFile;

	@Column(name="RNA_JUNCTION_FILE")
	private String rnaJunctionFile;

	@Column(name="RNA_TRANSCRIPT_FILE")
	private String rnaTranscriptFile;

	@Column(name="S_NO")
	private String sNo;

	@Column(name="SAMPLE_TYPE")
	private String sampleType;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Column(name="SPECIMEN_NO", unique = true)
	private String specimenNo;

	@Column(name="SPECIMEN_SOURCE")
	private String specimenSource;

	private String subproject;

	@Column(name="TISSUE_ID")
	private String tissueId;

	@Column(name="TISSUE_STATION_SEQ")
	private String tissueStationSeq;

	@Column(name="UMB_PROTOCOL")
	private String umbProtocol;

	@Column(name="UMB_PROTOCOL_ACC_NO")
	private String umbProtocolAccNo;

	@Column(name="UMB_PROTOCOL_COLLECTION_NO")
	private String umbProtocolCollectionNo;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	@Column(name="VCF_FILE")
	private String vcfFile;

	//bi-directional many-to-one association to FmReportTb
	@OneToOne(mappedBy="specimenTb", cascade=CascadeType.ALL)
	private FmReportTb fmReportTb;
	
	public SpecimenTb() {
	}

	public long getRowId() {
		return this.rowId;
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	public String getCnvFile() {
		return this.cnvFile;
	}

	public void setCnvFile(String cnvFile) {
		this.cnvFile = cnvFile;
	}

	public Date getCollectionDate() {
		return this.collectionDate;
	}

	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDeleteTs() {
		return this.deleteTs;
	}

	public void setDeleteTs(Date deleteTs) {
		this.deleteTs = deleteTs;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDiseaseSite() {
		return this.diseaseSite;
	}

	public void setDiseaseSite(String diseaseSite) {
		this.diseaseSite = diseaseSite;
	}

	public BigDecimal getEtlProcId() {
		return this.etlProcId;
	}

	public void setEtlProcId(BigDecimal etlProcId) {
		this.etlProcId = etlProcId;
	}

	public BigDecimal getFileLoadId() {
		return this.fileLoadId;
	}

	public void setFileLoadId(BigDecimal fileLoadId) {
		this.fileLoadId = fileLoadId;
	}

	public BigDecimal getForeignId() {
		return this.foreignId;
	}

	public void setForeignId(BigDecimal foreignId) {
		this.foreignId = foreignId;
	}

	public BigDecimal getForeignReportId() {
		return this.foreignReportId;
	}

	public void setForeignReportId(BigDecimal foreignReportId) {
		this.foreignReportId = foreignReportId;
	}

	public Date getInsertTs() {
		return this.insertTs;
	}

	public void setInsertTs(Date insertTs) {
		this.insertTs = insertTs;
	}

	public String getMrn() {
		return this.mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getProtocolAccNo() {
		return this.protocolAccNo;
	}

	public void setProtocolAccNo(String protocolAccNo) {
		this.protocolAccNo = protocolAccNo;
	}

	public String getRnaExonFile() {
		return this.rnaExonFile;
	}

	public void setRnaExonFile(String rnaExonFile) {
		this.rnaExonFile = rnaExonFile;
	}

	public String getRnaGeneFile() {
		return this.rnaGeneFile;
	}

	public void setRnaGeneFile(String rnaGeneFile) {
		this.rnaGeneFile = rnaGeneFile;
	}

	public String getRnaJunctionFile() {
		return this.rnaJunctionFile;
	}

	public void setRnaJunctionFile(String rnaJunctionFile) {
		this.rnaJunctionFile = rnaJunctionFile;
	}

	public String getRnaTranscriptFile() {
		return this.rnaTranscriptFile;
	}

	public void setRnaTranscriptFile(String rnaTranscriptFile) {
		this.rnaTranscriptFile = rnaTranscriptFile;
	}

	public String getSNo() {
		return this.sNo;
	}

	public void setSNo(String sNo) {
		this.sNo = sNo;
	}

	public String getSampleType() {
		return this.sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getSpecimenNo() {
		return this.specimenNo;
	}

	public void setSpecimenNo(String specimenNo) {
		this.specimenNo = specimenNo;
	}

	public String getSpecimenSource() {
		return this.specimenSource;
	}

	public void setSpecimenSource(String specimenSource) {
		this.specimenSource = specimenSource;
	}

	public String getSubproject() {
		return this.subproject;
	}

	public void setSubproject(String subproject) {
		this.subproject = subproject;
	}

	public String getTissueId() {
		return this.tissueId;
	}

	public void setTissueId(String tissueId) {
		this.tissueId = tissueId;
	}

	public String getTissueStationSeq() {
		return this.tissueStationSeq;
	}

	public void setTissueStationSeq(String tissueStationSeq) {
		this.tissueStationSeq = tissueStationSeq;
	}

	public String getUmbProtocol() {
		return this.umbProtocol;
	}

	public void setUmbProtocol(String umbProtocol) {
		this.umbProtocol = umbProtocol;
	}

	public String getUmbProtocolAccNo() {
		return this.umbProtocolAccNo;
	}

	public void setUmbProtocolAccNo(String umbProtocolAccNo) {
		this.umbProtocolAccNo = umbProtocolAccNo;
	}

	public String getUmbProtocolCollectionNo() {
		return this.umbProtocolCollectionNo;
	}

	public void setUmbProtocolCollectionNo(String umbProtocolCollectionNo) {
		this.umbProtocolCollectionNo = umbProtocolCollectionNo;
	}

	public Date getUpdateTs() {
		return this.updateTs;
	}

	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}

	public String getVcfFile() {
		return this.vcfFile;
	}

	public void setVcfFile(String vcfFile) {
		this.vcfFile = vcfFile;
	}

	public FmReportTb getFmReportTb() {
		return fmReportTb;
	}

	public void setFmReportTb(FmReportTb fmReportTb) {
		this.fmReportTb = fmReportTb;
	}


}