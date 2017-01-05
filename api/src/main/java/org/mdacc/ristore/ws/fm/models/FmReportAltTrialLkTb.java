package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FM_REPORT_ALT_TRIAL_LK_TB database table.
 * 
 */
@Entity
@Table(name="FM_REPORT_ALT_TRIAL_LK_TB")
@NamedQuery(name="FmReportAltTrialLkTb.findAll", query="SELECT f FROM FmReportAltTrialLkTb f")
public class FmReportAltTrialLkTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FM_REPORT_ALT_TRIAL_LK_TB_ROWID_GENERATOR", sequenceName="FM_REPORT_ALT_TRIAL_LK_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FM_REPORT_ALT_TRIAL_LK_TB_ROWID_GENERATOR")
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

	@Column(name="NCT_ID")
	private String nctId;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	//bi-directional many-to-one association to FmReportAltTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ALT_ID")
	private FmReportAltTb fmReportAltTb;

	//bi-directional many-to-one association to FmReportTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ID")
	private FmReportTb fmReportTb;

	public FmReportAltTrialLkTb() {
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

	public String getNctId() {
		return this.nctId;
	}

	public void setNctId(String nctId) {
		this.nctId = nctId;
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

	public FmReportAltTb getFmReportAltTb() {
		return this.fmReportAltTb;
	}

	public void setFmReportAltTb(FmReportAltTb fmReportAltTb) {
		this.fmReportAltTb = fmReportAltTb;
	}

	public FmReportTb getFmReportTb() {
		return this.fmReportTb;
	}

	public void setFmReportTb(FmReportTb fmReportTb) {
		this.fmReportTb = fmReportTb;
	}

}