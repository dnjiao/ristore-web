package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FM_REPORT_SAMPLE_TB database table.
 * 
 */
@Entity
@Table(name="FM_REPORT_SAMPLE_TB")
@NamedQuery(name="FmReportSampleTb.findAll", query="SELECT f FROM FmReportSampleTb f")
public class FmReportSampleTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FM_REPORT_SAMPLE_TB_ROWID_GENERATOR", sequenceName="FM_REPORT_SAMPLE_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FM_REPORT_SAMPLE_TB_ROWID_GENERATOR")
	@Column(name="ROW_ID")
	private long rowId;

	@Column(name="BAIT_SET")
	private String baitSet;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_TS")
	private Date deleteTs;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	@Column(name="MEAN_EXON_DEPTH")
	private BigDecimal meanExonDepth;

	private String name;

	@Column(name="NUCLEIC_ACID_TYPE")
	private String nucleicAcidType;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	private String tissue;

	@Column(name="\"TYPE\"")
	private String type;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	//bi-directional many-to-one association to FmReportTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ID")
	private FmReportTb fmReportTb;

	public FmReportSampleTb() {
	}

	public long getRowId() {
		return this.rowId;
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	public String getBaitSet() {
		return this.baitSet;
	}

	public void setBaitSet(String baitSet) {
		this.baitSet = baitSet;
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

	public BigDecimal getEtlProcId() {
		return this.etlProcId;
	}

	public void setEtlProcId(BigDecimal etlProcId) {
		this.etlProcId = etlProcId;
	}

	public Date getInsertTs() {
		return this.insertTs;
	}

	public void setInsertTs(Date insertTs) {
		this.insertTs = insertTs;
	}

	public BigDecimal getMeanExonDepth() {
		return this.meanExonDepth;
	}

	public void setMeanExonDepth(BigDecimal meanExonDepth) {
		this.meanExonDepth = meanExonDepth;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNucleicAcidType() {
		return this.nucleicAcidType;
	}

	public void setNucleicAcidType(String nucleicAcidType) {
		this.nucleicAcidType = nucleicAcidType;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getTissue() {
		return this.tissue;
	}

	public void setTissue(String tissue) {
		this.tissue = tissue;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getUpdateTs() {
		return this.updateTs;
	}

	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}

	public FmReportTb getFmReportTb() {
		return this.fmReportTb;
	}

	public void setFmReportTb(FmReportTb fmReportTb) {
		this.fmReportTb = fmReportTb;
	}

}