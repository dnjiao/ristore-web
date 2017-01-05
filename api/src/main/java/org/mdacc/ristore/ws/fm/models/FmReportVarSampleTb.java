package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FM_REPORT_VAR_SAMPLE_TB database table.
 * 
 */
@Entity
@Table(name="FM_REPORT_VAR_SAMPLE_TB")
@NamedQuery(name="FmReportVarSampleTb.findAll", query="SELECT f FROM FmReportVarSampleTb f")
public class FmReportVarSampleTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FM_REPORT_VAR_SAMPLE_TB_ROWID_GENERATOR", sequenceName="FM_REPORT_VAR_SAMPLE_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FM_REPORT_VAR_SAMPLE_TB_ROWID_GENERATOR")
	@Column(name="ROW_ID")
	private long rowId;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_TS")
	private Date deleteTs;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	@Column(name="SAMPLE_NAME")
	private String sampleName;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	//bi-directional many-to-one association to FmReportTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ID")
	private FmReportTb fmReportTb;

	//bi-directional many-to-one association to FmReportVarTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_VAR_ID")
	private FmReportVarTb fmReportVarTb;

	public FmReportVarSampleTb() {
	}

	public long getRowId() {
		return this.rowId;
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
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

	public String getSampleName() {
		return this.sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
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

	public FmReportVarTb getFmReportVarTb() {
		return this.fmReportVarTb;
	}

	public void setFmReportVarTb(FmReportVarTb fmReportVarTb) {
		this.fmReportVarTb = fmReportVarTb;
	}

}