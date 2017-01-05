package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FM_REPORT_GENE_TB database table.
 * 
 */
@Entity
@Table(name="FM_REPORT_GENE_TB")
@NamedQuery(name="FmReportGeneTb.findAll", query="SELECT f FROM FmReportGeneTb f")
public class FmReportGeneTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FM_REPORT_GENE_TB_ROWID_GENERATOR", sequenceName="FM_REPORT_GENE_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FM_REPORT_GENE_TB_ROWID_GENERATOR")
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

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	private String name;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	//bi-directional many-to-one association to FmReportAltTb
	@OneToMany(mappedBy="fmReportGeneTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportAltTb> fmReportAltTbs;

	//bi-directional many-to-one association to FmReportTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ID")
	private FmReportTb fmReportTb;

	//bi-directional many-to-one association to FmReportRefLkTb
	@OneToMany(mappedBy="fmReportGeneTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportRefLkTb> fmReportRefLkTbs;

	public FmReportGeneTb() {
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

	public List<FmReportAltTb> getFmReportAltTbs() {
		return this.fmReportAltTbs;
	}

	public void setFmReportAltTbs(List<FmReportAltTb> fmReportAltTbs) {
		this.fmReportAltTbs = fmReportAltTbs;
	}

	public FmReportAltTb addFmReportAltTb(FmReportAltTb fmReportAltTb) {
		getFmReportAltTbs().add(fmReportAltTb);
		fmReportAltTb.setFmReportGeneTb(this);

		return fmReportAltTb;
	}

	public FmReportAltTb removeFmReportAltTb(FmReportAltTb fmReportAltTb) {
		getFmReportAltTbs().remove(fmReportAltTb);
		fmReportAltTb.setFmReportGeneTb(null);

		return fmReportAltTb;
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
		fmReportRefLkTb.setFmReportGeneTb(this);

		return fmReportRefLkTb;
	}

	public FmReportRefLkTb removeFmReportRefLkTb(FmReportRefLkTb fmReportRefLkTb) {
		getFmReportRefLkTbs().remove(fmReportRefLkTb);
		fmReportRefLkTb.setFmReportGeneTb(null);

		return fmReportRefLkTb;
	}

}