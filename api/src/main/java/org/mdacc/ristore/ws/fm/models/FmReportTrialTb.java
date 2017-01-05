package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FM_REPORT_TRIAL_TB database table.
 * 
 */
@Entity
@Table(name="FM_REPORT_TRIAL_TB")
@NamedQuery(name="FmReportTrialTb.findAll", query="SELECT f FROM FmReportTrialTb f")
public class FmReportTrialTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FM_REPORT_TRIAL_TB_ROWID_GENERATOR", sequenceName="FM_REPORT_TRIAL_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FM_REPORT_TRIAL_TB_ROWID_GENERATOR")
	@Column(name="ROW_ID")
	private long rowId;

	@Column(name="ALTERATION_NAME")
	private String alterationName;

	private String comments;

	@Lob
	private String condition;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_TS")
	private Date deleteTs;

	private String eligibility;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Column(name="GENE_NAME")
	private String geneName;

	@Column(name="\"INCLUDE\"")
	private String include;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	private String locations;

	@Column(name="NCT_ID")
	private String nctId;

	@Lob
	private String note;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Column(name="STUDY_PHASE")
	private String studyPhase;

	@Lob
	private String summary;

	private String target;

	private String title;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	//bi-directional many-to-one association to FmReportTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ID")
	private FmReportTb fmReportTb;

	public FmReportTrialTb() {
	}

	public long getRowId() {
		return this.rowId;
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	public String getAlterationName() {
		return this.alterationName;
	}

	public void setAlterationName(String alterationName) {
		this.alterationName = alterationName;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Date getDeleteTs() {
		return this.deleteTs;
	}

	public void setDeleteTs(Date deleteTs) {
		this.deleteTs = deleteTs;
	}

	public String getEligibility() {
		return this.eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public BigDecimal getEtlProcId() {
		return this.etlProcId;
	}

	public void setEtlProcId(BigDecimal etlProcId) {
		this.etlProcId = etlProcId;
	}

	public String getGeneName() {
		return this.geneName;
	}

	public void setGeneName(String geneName) {
		this.geneName = geneName;
	}

	public String getInclude() {
		return this.include;
	}

	public void setInclude(String include) {
		this.include = include;
	}

	public Date getInsertTs() {
		return this.insertTs;
	}

	public void setInsertTs(Date insertTs) {
		this.insertTs = insertTs;
	}

	public String getLocations() {
		return this.locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public String getNctId() {
		return this.nctId;
	}

	public void setNctId(String nctId) {
		this.nctId = nctId;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getStudyPhase() {
		return this.studyPhase;
	}

	public void setStudyPhase(String studyPhase) {
		this.studyPhase = studyPhase;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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