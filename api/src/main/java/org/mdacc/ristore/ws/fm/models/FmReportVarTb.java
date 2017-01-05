package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FM_REPORT_VAR_TB database table.
 * 
 */
@Entity
@Table(name="FM_REPORT_VAR_TB")
@NamedQuery(name="FmReportVarTb.findAll", query="SELECT f FROM FmReportVarTb f")
public class FmReportVarTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FM_REPORT_VAR_TB_ROWID_GENERATOR", sequenceName="FM_REPORT_VAR_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FM_REPORT_VAR_TB_ROWID_GENERATOR")
	@Column(name="ROW_ID")
	private long rowId;

	private String comments;

	@Column(name="COPY_NUMBER_IS_EQUIVOCAL")
	private String copyNumberIsEquivocal;

	@Column(name="COPY_NUMBER_NUMBER_OF_EXONS")
	private String copyNumberNumberOfExons;

	@Column(name="COPY_NUMBER_POSITION")
	private String copyNumberPosition;

	@Column(name="COPY_NUMBER_RATIO")
	private BigDecimal copyNumberRatio;

	@Column(name="COPY_NUMBER_SEGMENT_LENGTH")
	private BigDecimal copyNumberSegmentLength;

	@Column(name="COPY_NUMBER_STATUS")
	private String copyNumberStatus;

	@Column(name="COPY_NUMBER_TYPE")
	private String copyNumberType;

	@Column(name="COPY_NUMBER_VALUE")
	private BigDecimal copyNumberValue;
	
	@Column(name="COPY_NUMBER_GENE_NAME")
	private String copyNumberGeneName;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_TS")
	private Date deleteTs;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	@Column(name="NON_HUMAN_ORGANISM")
	private String nonHumanOrganism;

	@Column(name="NON_HUMAN_READS_PER_MILLION")
	private BigDecimal nonHumanReadsPerMillion;

	@Column(name="NON_HUMAN_STATUS")
	private String nonHumanStatus;

	@Column(name="REARRANGEMENT_DESCRIPTION")
	private String rearrangementDescription;

	@Column(name="REARRANGEMENT_IN_FRAME")
	private String rearrangementInFrame;

	@Column(name="REARRANGEMENT_OTHER_GENE")
	private String rearrangementOtherGene;

	@Column(name="REARRANGEMENT_POSITION1")
	private String rearrangementPosition1;

	@Column(name="REARRANGEMENT_POSITION2")
	private String rearrangementPosition2;

	@Column(name="REARRANGEMENT_READ_PAIRS")
	private BigDecimal rearrangementReadPairs;

	@Column(name="REARRANGEMENT_STATUS")
	private String rearrangementStatus;

	@Column(name="REARRANGEMENT_TARGETED_GENE")
	private String rearrangementTargetedGene;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Column(name="\"TYPE\"")
	private String type;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	@Column(name="VARIANT_CDS_EFFECT")
	private String variantCdsEffect;

	@Column(name="VARIANT_DEPTH")
	private BigDecimal variantDepth;

	@Column(name="VARIANT_FUNCTIONAL_EFFECT")
	private String variantFunctionalEffect;

	@Column(name="VARIANT_GENE_NAME")
	private String variantGeneName;

	@Column(name="VARIANT_IS_SUBCLONAL")
	private String variantIsSubclonal;

	@Column(name="VARIANT_PERCENT_READS")
	private BigDecimal variantPercentReads;

	@Column(name="VARIANT_POSITION")
	private String variantPosition;

	@Column(name="VARIANT_PROTEIN_EFFECT")
	private String variantProteinEffect;

	@Column(name="VARIANT_STATUS")
	private String variantStatus;

	@Column(name="VARIANT_STRAND")
	private String variantStrand;

	@Column(name="VARIANT_TRANSCRIPT")
	private String variantTranscript;

	//bi-directional many-to-one association to FmReportVarSampleTb
	@OneToMany(mappedBy="fmReportVarTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportVarSampleTb> fmReportVarSampleTbs;

	//bi-directional many-to-one association to FmReportTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ID")
	private FmReportTb fmReportTb;
	
	public FmReportVarTb() {
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

	public String getCopyNumberIsEquivocal() {
		return this.copyNumberIsEquivocal;
	}

	public void setCopyNumberIsEquivocal(String copyNumberIsEquivocal) {
		this.copyNumberIsEquivocal = copyNumberIsEquivocal;
	}

	public String getCopyNumberNumberOfExons() {
		return this.copyNumberNumberOfExons;
	}

	public void setCopyNumberNumberOfExons(String copyNumberNumberOfExons) {
		this.copyNumberNumberOfExons = copyNumberNumberOfExons;
	}

	public String getCopyNumberPosition() {
		return this.copyNumberPosition;
	}

	public void setCopyNumberPosition(String copyNumberPosition) {
		this.copyNumberPosition = copyNumberPosition;
	}

	public BigDecimal getCopyNumberRatio() {
		return this.copyNumberRatio;
	}

	public void setCopyNumberRatio(BigDecimal copyNumberRatio) {
		this.copyNumberRatio = copyNumberRatio;
	}

	public BigDecimal getCopyNumberSegmentLength() {
		return this.copyNumberSegmentLength;
	}

	public void setCopyNumberSegmentLength(BigDecimal copyNumberSegmentLength) {
		this.copyNumberSegmentLength = copyNumberSegmentLength;
	}

	public String getCopyNumberStatus() {
		return this.copyNumberStatus;
	}

	public void setCopyNumberStatus(String copyNumberStatus) {
		this.copyNumberStatus = copyNumberStatus;
	}

	public String getCopyNumberType() {
		return this.copyNumberType;
	}

	public void setCopyNumberType(String copyNumberType) {
		this.copyNumberType = copyNumberType;
	}

	public BigDecimal getCopyNumberValue() {
		return this.copyNumberValue;
	}

	public void setCopyNumberValue(BigDecimal copyNumberValue) {
		this.copyNumberValue = copyNumberValue;
	}

	public String getCopyNumberGeneName() {
		return copyNumberGeneName;
	}

	public void setCopyNumberGeneName(String copyNumberGeneName) {
		this.copyNumberGeneName = copyNumberGeneName;
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

	public String getNonHumanOrganism() {
		return this.nonHumanOrganism;
	}

	public void setNonHumanOrganism(String nonHumanOrganism) {
		this.nonHumanOrganism = nonHumanOrganism;
	}

	public BigDecimal getNonHumanReadsPerMillion() {
		return this.nonHumanReadsPerMillion;
	}

	public void setNonHumanReadsPerMillion(BigDecimal nonHumanReadsPerMillion) {
		this.nonHumanReadsPerMillion = nonHumanReadsPerMillion;
	}

	public String getNonHumanStatus() {
		return this.nonHumanStatus;
	}

	public void setNonHumanStatus(String nonHumanStatus) {
		this.nonHumanStatus = nonHumanStatus;
	}

	public String getRearrangementDescription() {
		return this.rearrangementDescription;
	}

	public void setRearrangementDescription(String rearrangementDescription) {
		this.rearrangementDescription = rearrangementDescription;
	}

	public String getRearrangementInFrame() {
		return this.rearrangementInFrame;
	}

	public void setRearrangementInFrame(String rearrangementInFrame) {
		this.rearrangementInFrame = rearrangementInFrame;
	}

	public String getRearrangementOtherGene() {
		return this.rearrangementOtherGene;
	}

	public void setRearrangementOtherGene(String rearrangementOtherGene) {
		this.rearrangementOtherGene = rearrangementOtherGene;
	}

	public String getRearrangementPosition1() {
		return this.rearrangementPosition1;
	}

	public void setRearrangementPosition1(String rearrangementPosition1) {
		this.rearrangementPosition1 = rearrangementPosition1;
	}

	public String getRearrangementPosition2() {
		return this.rearrangementPosition2;
	}

	public void setRearrangementPosition2(String rearrangementPosition2) {
		this.rearrangementPosition2 = rearrangementPosition2;
	}

	public BigDecimal getRearrangementReadPairs() {
		return this.rearrangementReadPairs;
	}

	public void setRearrangementReadPairs(BigDecimal rearrangementReadPairs) {
		this.rearrangementReadPairs = rearrangementReadPairs;
	}

	public String getRearrangementStatus() {
		return this.rearrangementStatus;
	}

	public void setRearrangementStatus(String rearrangementStatus) {
		this.rearrangementStatus = rearrangementStatus;
	}

	public String getRearrangementTargetedGene() {
		return this.rearrangementTargetedGene;
	}

	public void setRearrangementTargetedGene(String rearrangementTargetedGene) {
		this.rearrangementTargetedGene = rearrangementTargetedGene;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
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

	public String getVariantCdsEffect() {
		return this.variantCdsEffect;
	}

	public void setVariantCdsEffect(String variantCdsEffect) {
		this.variantCdsEffect = variantCdsEffect;
	}

	public BigDecimal getVariantDepth() {
		return this.variantDepth;
	}

	public void setVariantDepth(BigDecimal variantDepth) {
		this.variantDepth = variantDepth;
	}

	public String getVariantFunctionalEffect() {
		return this.variantFunctionalEffect;
	}

	public void setVariantFunctionalEffect(String variantFunctionalEffect) {
		this.variantFunctionalEffect = variantFunctionalEffect;
	}

	public String getVariantGeneName() {
		return this.variantGeneName;
	}

	public void setVariantGeneName(String variantGeneName) {
		this.variantGeneName = variantGeneName;
	}

	public String getVariantIsSubclonal() {
		return this.variantIsSubclonal;
	}

	public void setVariantIsSubclonal(String variantIsSubclonal) {
		this.variantIsSubclonal = variantIsSubclonal;
	}

	public BigDecimal getVariantPercentReads() {
		return this.variantPercentReads;
	}

	public void setVariantPercentReads(BigDecimal variantPercentReads) {
		this.variantPercentReads = variantPercentReads;
	}

	public String getVariantPosition() {
		return this.variantPosition;
	}

	public void setVariantPosition(String variantPosition) {
		this.variantPosition = variantPosition;
	}

	public String getVariantProteinEffect() {
		return this.variantProteinEffect;
	}

	public void setVariantProteinEffect(String variantProteinEffect) {
		this.variantProteinEffect = variantProteinEffect;
	}

	public String getVariantStatus() {
		return this.variantStatus;
	}

	public void setVariantStatus(String variantStatus) {
		this.variantStatus = variantStatus;
	}

	public String getVariantStrand() {
		return this.variantStrand;
	}

	public void setVariantStrand(String variantStrand) {
		this.variantStrand = variantStrand;
	}

	public String getVariantTranscript() {
		return this.variantTranscript;
	}

	public void setVariantTranscript(String variantTranscript) {
		this.variantTranscript = variantTranscript;
	}

	public List<FmReportVarSampleTb> getFmReportVarSampleTbs() {
		return this.fmReportVarSampleTbs;
	}

	public void setFmReportVarSampleTbs(List<FmReportVarSampleTb> fmReportVarSampleTbs) {
		this.fmReportVarSampleTbs = fmReportVarSampleTbs;
	}

	public FmReportVarSampleTb addFmReportVarSampleTb(FmReportVarSampleTb fmReportVarSampleTb) {
		getFmReportVarSampleTbs().add(fmReportVarSampleTb);
		fmReportVarSampleTb.setFmReportVarTb(this);

		return fmReportVarSampleTb;
	}

	public FmReportVarSampleTb removeFmReportVarSampleTb(FmReportVarSampleTb fmReportVarSampleTb) {
		getFmReportVarSampleTbs().remove(fmReportVarSampleTb);
		fmReportVarSampleTb.setFmReportVarTb(null);

		return fmReportVarSampleTb;
	}

	public FmReportTb getFmReportTb() {
		return this.fmReportTb;
	}

	public void setFmReportTb(FmReportTb fmReportTb) {
		this.fmReportTb = fmReportTb;
	}



}