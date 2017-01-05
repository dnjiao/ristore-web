package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FM_REPORT_AMENDMEND_TB database table.
 * 
 */
@Entity
@Table(name="FM_REPORT_AMENDMEND_TB")
@NamedQuery(name="FmReportAmendmendTb.findAll", query="SELECT f FROM FmReportAmendmendTb f")
public class FmReportAmendmendTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FM_REPORT_AMENDMEND_TB_ROWID_GENERATOR", sequenceName="FM_REPORT_AMENDMEND_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FM_REPORT_AMENDMEND_TB_ROWID_GENERATOR")
	@Column(name="ROW_ID")
	private long rowId;

	@Column(name="AMENDMEND_COMMENTS")
	private String amendmendComments;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_TS")
	private Date deleteTs;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	@Column(name="IS_SIGNED")
	private String isSigned;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFY_DATE")
	private Date modifyDate;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	private String text;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	//bi-directional many-to-one association to FmReportTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ID")
	private FmReportTb fmReportTb;

	public FmReportAmendmendTb() {
	}

	public long getRowId() {
		return this.rowId;
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	public String getAmendmendComments() {
		return this.amendmendComments;
	}

	public void setAmendmendComments(String amendmendComments) {
		this.amendmendComments = amendmendComments;
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

	public String getIsSigned() {
		return this.isSigned;
	}

	public void setIsSigned(String isSigned) {
		this.isSigned = isSigned;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
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