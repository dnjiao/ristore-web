package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FM_REPORT_ALT_TB database table.
 * 
 */
@Entity
@Table(name="FM_REPORT_ALT_TB")
@NamedQuery(name="FmReportAltTb.findAll", query="SELECT f FROM FmReportAltTb f")
public class FmReportAltTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FM_REPORT_ALT_TB_ROWID_GENERATOR", sequenceName="FM_REPORT_ALT_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FM_REPORT_ALT_TB_ROWID_GENERATOR")
	@Column(name="ROW_ID")
	private long rowId;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_TS")
	private Date deleteTs;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Column(name="\"INCLUDE\"")
	private String include;

	private String indication;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	@Lob
	private String interpretation;

	private String name;

	private String relavance;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Lob
	@Column(name="TRIAL_NOTE")
	private String trialNote;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	//bi-directional many-to-one association to FmReportAltPropertyTb
	@OneToMany(mappedBy="fmReportAltTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportAltPropertyTb> fmReportAltPropertyTbs;

	//bi-directional many-to-one association to FmReportGeneTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_GENE_ID")
	private FmReportGeneTb fmReportGeneTb;

	//bi-directional many-to-one association to FmReportTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ID")
	private FmReportTb fmReportTb;

	//bi-directional many-to-one association to FmReportAltTherapyTb
	@OneToMany(mappedBy="fmReportAltTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportAltTherapyTb> fmReportAltTherapyTbs;

	//bi-directional many-to-one association to FmReportAltTrialLkTb
	@OneToMany(mappedBy="fmReportAltTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportAltTrialLkTb> fmReportAltTrialLkTbs;

	//bi-directional many-to-one association to FmReportRefLkTb
	@OneToMany(mappedBy="fmReportAltTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportRefLkTb> fmReportRefLkTbs;

	public FmReportAltTb() {
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

	public String getInclude() {
		return this.include;
	}

	public void setInclude(String include) {
		this.include = include;
	}

	public String getIndication() {
		return this.indication;
	}

	public void setIndication(String indication) {
		this.indication = indication;
	}

	public Date getInsertTs() {
		return this.insertTs;
	}

	public void setInsertTs(Date insertTs) {
		this.insertTs = insertTs;
	}

	public String getInterpretation() {
		return this.interpretation;
	}

	public void setInterpretation(String interpretation) {
		this.interpretation = interpretation;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelavance() {
		return this.relavance;
	}

	public void setRelavance(String relavance) {
		this.relavance = relavance;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getTrialNote() {
		return this.trialNote;
	}

	public void setTrialNote(String trialNote) {
		this.trialNote = trialNote;
	}

	public Date getUpdateTs() {
		return this.updateTs;
	}

	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}

	public List<FmReportAltPropertyTb> getFmReportAltPropertyTbs() {
		return this.fmReportAltPropertyTbs;
	}

	public void setFmReportAltPropertyTbs(List<FmReportAltPropertyTb> fmReportAltPropertyTbs) {
		this.fmReportAltPropertyTbs = fmReportAltPropertyTbs;
	}

	public FmReportAltPropertyTb addFmReportAltPropertyTb(FmReportAltPropertyTb fmReportAltPropertyTb) {
		getFmReportAltPropertyTbs().add(fmReportAltPropertyTb);
		fmReportAltPropertyTb.setFmReportAltTb(this);

		return fmReportAltPropertyTb;
	}

	public FmReportAltPropertyTb removeFmReportAltPropertyTb(FmReportAltPropertyTb fmReportAltPropertyTb) {
		getFmReportAltPropertyTbs().remove(fmReportAltPropertyTb);
		fmReportAltPropertyTb.setFmReportAltTb(null);

		return fmReportAltPropertyTb;
	}

	public FmReportGeneTb getFmReportGeneTb() {
		return this.fmReportGeneTb;
	}

	public void setFmReportGeneTb(FmReportGeneTb fmReportGeneTb) {
		this.fmReportGeneTb = fmReportGeneTb;
	}

	public FmReportTb getFmReportTb() {
		return this.fmReportTb;
	}

	public void setFmReportTb(FmReportTb fmReportTb) {
		this.fmReportTb = fmReportTb;
	}

	public List<FmReportAltTherapyTb> getFmReportAltTherapyTbs() {
		return this.fmReportAltTherapyTbs;
	}

	public void setFmReportAltTherapyTbs(List<FmReportAltTherapyTb> fmReportAltTherapyTbs) {
		this.fmReportAltTherapyTbs = fmReportAltTherapyTbs;
	}

	public FmReportAltTherapyTb addFmReportAltTherapyTb(FmReportAltTherapyTb fmReportAltTherapyTb) {
		getFmReportAltTherapyTbs().add(fmReportAltTherapyTb);
		fmReportAltTherapyTb.setFmReportAltTb(this);

		return fmReportAltTherapyTb;
	}

	public FmReportAltTherapyTb removeFmReportAltTherapyTb(FmReportAltTherapyTb fmReportAltTherapyTb) {
		getFmReportAltTherapyTbs().remove(fmReportAltTherapyTb);
		fmReportAltTherapyTb.setFmReportAltTb(null);

		return fmReportAltTherapyTb;
	}

	public List<FmReportAltTrialLkTb> getFmReportAltTrialLkTbs() {
		return this.fmReportAltTrialLkTbs;
	}

	public void setFmReportAltTrialLkTbs(List<FmReportAltTrialLkTb> fmReportAltTrialLkTbs) {
		this.fmReportAltTrialLkTbs = fmReportAltTrialLkTbs;
	}

	public FmReportAltTrialLkTb addFmReportAltTrialLkTb(FmReportAltTrialLkTb fmReportAltTrialLkTb) {
		getFmReportAltTrialLkTbs().add(fmReportAltTrialLkTb);
		fmReportAltTrialLkTb.setFmReportAltTb(this);

		return fmReportAltTrialLkTb;
	}

	public FmReportAltTrialLkTb removeFmReportAltTrialLkTb(FmReportAltTrialLkTb fmReportAltTrialLkTb) {
		getFmReportAltTrialLkTbs().remove(fmReportAltTrialLkTb);
		fmReportAltTrialLkTb.setFmReportAltTb(null);

		return fmReportAltTrialLkTb;
	}

	public List<FmReportRefLkTb> getFmReportRefLkTbs() {
		return this.fmReportRefLkTbs;
	}

	public void setFmReportRefLkTbs(List<FmReportRefLkTb> fmReportRefLkTbs) {
		this.fmReportRefLkTbs = fmReportRefLkTbs;
	}

	public FmReportRefLkTb addFmReportRefLkTb(FmReportRefLkTb fmReportRefLkTb) {
		getFmReportRefLkTbs().add(fmReportRefLkTb);
		fmReportRefLkTb.setFmReportAltTb(this);

		return fmReportRefLkTb;
	}

	public FmReportRefLkTb removeFmReportRefLkTb(FmReportRefLkTb fmReportRefLkTb) {
		getFmReportRefLkTbs().remove(fmReportRefLkTb);
		fmReportRefLkTb.setFmReportAltTb(null);

		return fmReportRefLkTb;
	}

}