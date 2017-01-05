package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FM_REPORT_ALT_THERAPY_TB database table.
 * 
 */
@Entity
@Table(name="FM_REPORT_ALT_THERAPY_TB")
@NamedQuery(name="FmReportAltTherapyTb.findAll", query="SELECT f FROM FmReportAltTherapyTb f")
public class FmReportAltTherapyTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FM_REPORT_ALT_THERAPY_TB_ROWID_GENERATOR", sequenceName="FM_REPORT_ALT_THERAPY_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FM_REPORT_ALT_THERAPY_TB_ROWID_GENERATOR")
	@Column(name="ROW_ID")
	private long rowId;

	@Column(name="APPROVED_USES")
	private String approvedUses;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_TS")
	private Date deleteTs;

	private String effect;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Column(name="FDA_APPROVED")
	private String fdaApproved;

	@Column(name="GENERIC_NAME")
	private String genericName;

	@Column(name="\"INCLUDE\"")
	private String include;

	@Column(name="INCLUDE_IN_SUMMARY")
	private String includeInSummary;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	private String name;

	@Lob
	private String rationale;

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

	//bi-directional many-to-one association to FmReportRefLkTb
	@OneToMany(mappedBy="fmReportAltTherapyTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportRefLkTb> fmReportRefLkTbs;

	public FmReportAltTherapyTb() {
	}

	public long getRowId() {
		return this.rowId;
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	public String getApprovedUses() {
		return this.approvedUses;
	}

	public void setApprovedUses(String approvedUses) {
		this.approvedUses = approvedUses;
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

	public String getEffect() {
		return this.effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public BigDecimal getEtlProcId() {
		return this.etlProcId;
	}

	public void setEtlProcId(BigDecimal etlProcId) {
		this.etlProcId = etlProcId;
	}

	public String getFdaApproved() {
		return this.fdaApproved;
	}

	public void setFdaApproved(String fdaApproved) {
		this.fdaApproved = fdaApproved;
	}

	public String getGenericName() {
		return this.genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getInclude() {
		return this.include;
	}

	public void setInclude(String include) {
		this.include = include;
	}

	public String getIncludeInSummary() {
		return this.includeInSummary;
	}

	public void setIncludeInSummary(String includeInSummary) {
		this.includeInSummary = includeInSummary;
	}

	public Date getInsertTs() {
		return this.insertTs;
	}

	public void setInsertTs(Date insertTs) {
		this.insertTs = insertTs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRationale() {
		return this.rationale;
	}

	public void setRationale(String rationale) {
		this.rationale = rationale;
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

	public List<FmReportRefLkTb> getFmReportRefLkTbs() {
		return this.fmReportRefLkTbs;
	}

	public void setFmReportRefLkTbs(List<FmReportRefLkTb> fmReportRefLkTbs) {
		this.fmReportRefLkTbs = fmReportRefLkTbs;
	}

	public FmReportRefLkTb addFmReportRefLkTb(FmReportRefLkTb fmReportRefLkTb) {
		getFmReportRefLkTbs().add(fmReportRefLkTb);
		fmReportRefLkTb.setFmReportAltTherapyTb(this);

		return fmReportRefLkTb;
	}

	public FmReportRefLkTb removeFmReportRefLkTb(FmReportRefLkTb fmReportRefLkTb) {
		getFmReportRefLkTbs().remove(fmReportRefLkTb);
		fmReportRefLkTb.setFmReportAltTherapyTb(null);

		return fmReportRefLkTb;
	}

}