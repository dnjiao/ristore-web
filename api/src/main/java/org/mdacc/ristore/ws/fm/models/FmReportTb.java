package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FM_REPORT_TB database table.
 * 
 */
@Entity
@NamedEntityGraph(
		name = "FmReportGraph", 
		attributeNodes = { 
		  @NamedAttributeNode("fileLoadId"),
		  @NamedAttributeNode("frBlockId"),
		  @NamedAttributeNode("frCollectionDate"),
		  @NamedAttributeNode("frDiagnosis"),
		  @NamedAttributeNode("frFullName"),
		  @NamedAttributeNode("frReportId"),
		  @NamedAttributeNode("specimenTb")})
@Table(name="FM_REPORT_TB")
public class FmReportTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FM_REPORT_TB_ROWID_GENERATOR", sequenceName="FM_REPORT_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FM_REPORT_TB_ROWID_GENERATOR")
	@Column(name="ROW_ID")
	private long rowId;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_TS")
	private Date deleteTs;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Column(name="FR_ALTERATION_COUNT")
	private BigDecimal frAlterationCount;

	@Column(name="FR_BLOCK_ID")
	private String frBlockId;

	@Temporal(TemporalType.DATE)
	@Column(name="FR_COLLECTION_DATE")
	private Date frCollectionDate;

	@Column(name="FR_COPIED_PHYSICIAN")
	private String frCopiedPhysician;

	@Temporal(TemporalType.DATE)
	@Column(name="FR_CORRECTION_DATE")
	private Date frCorrectionDate;

	@Column(name="FR_DIAGNOSIS")
	private String frDiagnosis;

	@Temporal(TemporalType.DATE)
	@Column(name="FR_DOB")
	private Date frDob;

	@Column(name="FR_FACILITY_ID")
	private String frFacilityId;

	@Column(name="FR_FACILITY_NAME")
	private String frFacilityName;

	@Column(name="FR_FIRST_NAME")
	private String frFirstName;

	@Column(name="FR_FM_ID")
	private String frFmId;

	@Column(name="FR_FULL_NAME")
	private String frFullName;

	@Column(name="FR_GENDER")
	private String frGender;

	@Column(name="FR_LAST_NAME")
	private String frLastName;

	@Column(name="FR_ORDERING_MD")
	private String frOrderingMd;

	@Column(name="FR_ORDERING_MD_ID")
	private String frOrderingMdId;

	@Column(name="FR_PATHOLOGIST")
	private String frPathologist;

	@Temporal(TemporalType.DATE)
	@Column(name="FR_RECEIVE_DATE")
	private Date frReceiveDate;

	@Column(name="FR_REPORT_ID")
	private String frReportId;

	@Column(name="FR_RESISTIVE_COUNT")
	private BigDecimal frResistiveCount;

	@Column(name="FR_SAMPLE_ID")
	private String frSampleId;

	@Column(name="FR_SAMPLE_NAME")
	private String frSampleName;

	@Column(name="FR_SENSITIZING_COUNT")
	private BigDecimal frSensitizingCount;

	@Column(name="FR_SPEC_FORMAT")
	private String frSpecFormat;

	@Column(name="FR_SPEC_SITE")
	private String frSpecSite;

	@Lob
	@Column(name="FR_SUMMARY")
	private String frSummary;

	@Column(name="FR_TRF_NUMBER")
	private String frTrfNumber;

	@Column(name="FR_TRIAL_COUNT")
	private BigDecimal frTrialCount;

	@Column(name="FR_VERSION")
	private BigDecimal frVersion;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	@Column(name="REFERENCE_ID")
	private String referenceId;

	@Column(name="REPORT_PDF")
	private String reportPdf;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	@Column(name="VR_DISEASE")
	private String vrDisease;

	@Column(name="VR_DISEASE_ONTOLOGY")
	private String vrDiseaseOntology;

	@Column(name="VR_FLOWCELL_ANALYSIS")
	private BigDecimal vrFlowcellAnalysis;

	@Column(name="VR_GENDER")
	private String vrGender;

	@Column(name="VR_PATHOLOGY_DIAGNOSIS")
	private String vrPathologyDiagnosis;

	@Column(name="VR_PERCENT_TUMOR_NUCLEI")
	private String vrPercentTumorNuclei;

	@Column(name="VR_PIPELINE_VERSION")
	private String vrPipelineVersion;

	@Column(name="VR_PURITY_ASSESSMENT")
	private BigDecimal vrPurityAssessment;

	@Column(name="VR_QUALITY_CONTROL_STATUS")
	private String vrQualityControlStatus;

	@Column(name="VR_SPECIMEN")
	private String vrSpecimen;

	@Column(name="VR_STANDARD_NUCLEIC_ACID_TYPE")
	private String vrStandardNucleicAcidType;

	@Column(name="VR_STUDY")
	private String vrStudy;

	@Column(name="VR_TEST_REQUEST")
	private String vrTestRequest;

	@Column(name="VR_TEST_TYPE")
	private String vrTestType;

	@Column(name="VR_TISSUE_OF_ORIGIN")
	private String vrTissueOfOrigin;
	
	@Column(name="FILE_LOAD_ID")
	private BigDecimal fileLoadId;

	//bi-directional many-to-one association to FmReportAltPropertyTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportAltPropertyTb> fmReportAltPropertyTbs;

	//bi-directional many-to-one association to FmReportAltTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportAltTb> fmReportAltTbs;

	//bi-directional many-to-one association to FmReportAltTherapyTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportAltTherapyTb> fmReportAltTherapyTbs;

	//bi-directional many-to-one association to FmReportAltTrialLkTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportAltTrialLkTb> fmReportAltTrialLkTbs;

	//bi-directional many-to-one association to FmReportAppTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportAppTb> fmReportAppTbs;

	//bi-directional many-to-one association to FmReportGeneTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportGeneTb> fmReportGeneTbs;

	//bi-directional many-to-one association to FmReportPertNegTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportPertNegTb> fmReportPertNegTbs;

	//bi-directional many-to-one association to FmReportReferenceTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportReferenceTb> fmReportReferenceTbs;

	//bi-directional many-to-one association to FmReportRefLkTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportRefLkTb> fmReportRefLkTbs;

	//bi-directional many-to-one association to FmReportSampleTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportSampleTb> fmReportSampleTbs;

	//bi-directional many-to-one association to FmReportSignatureTb
	@OneToMany(mappedBy="fmReportTb", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportSignatureTb> fmReportSignatureTbs;

	//bi-directional many-to-one association to SpecimenTb
	@OneToOne
	@JoinColumn(name="SPECIMEN_ID")
	private SpecimenTb specimenTb;

	//bi-directional many-to-one association to FmReportTrialTb
	@OneToMany(mappedBy="fmReportTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportTrialTb> fmReportTrialTbs;

	//bi-directional many-to-one association to FmReportVarPropertyTb
	@OneToMany(mappedBy="fmReportTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportVarPropertyTb> fmReportVarPropertyTbs;

	//bi-directional many-to-one association to FmReportVarSampleTb
	@OneToMany(mappedBy="fmReportTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportVarSampleTb> fmReportVarSampleTbs;

	//bi-directional many-to-one association to FmReportVarTb
	@OneToMany(mappedBy="fmReportTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportVarTb> fmReportVarTbs;

	//bi-directional many-to-one association to FmReportAmendmendTb
	@OneToMany(mappedBy="fmReportTb", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<FmReportAmendmendTb> fmReportAmendmendTbs;
	
	@Column(name="FR_STAGING_ID")
	private String frStagingId;
	
	@Column(name="FR_CLINICAL_ID")
	private String frClinicalId;
	
	@Column(name="FR_PERFORMANCE_DATA_ID")
	private String frPerformanceDataId;

	public FmReportTb() {
	}
	
	public void removeAllChildren() {
		fmReportAltPropertyTbs.clear();
		fmReportAltTbs.clear();
		fmReportAltTherapyTbs.clear();
		fmReportAltTrialLkTbs.clear();
		fmReportAppTbs.clear();
		fmReportGeneTbs.clear();
		fmReportPertNegTbs.clear();
		fmReportReferenceTbs.clear();
		fmReportRefLkTbs.clear();
		fmReportSampleTbs.clear();
		fmReportSignatureTbs.clear();
		fmReportTrialTbs.clear();
		fmReportVarPropertyTbs.clear();
		fmReportVarSampleTbs.clear();
		fmReportVarTbs.clear();
		fmReportAmendmendTbs.clear();
	}
	
	public void setChildrenDeleteTs(Date date) {
		for (FmReportAltPropertyTb tb : fmReportAltPropertyTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportAltTb tb : fmReportAltTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportAltTherapyTb tb : fmReportAltTherapyTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportAltTrialLkTb tb : fmReportAltTrialLkTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportAppTb tb : fmReportAppTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportGeneTb tb : fmReportGeneTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportPertNegTb tb : fmReportPertNegTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportReferenceTb tb : fmReportReferenceTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportRefLkTb tb : fmReportRefLkTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportSampleTb tb : fmReportSampleTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportSignatureTb tb : fmReportSignatureTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportTrialTb tb : fmReportTrialTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportVarPropertyTb tb : fmReportVarPropertyTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportVarSampleTb tb : fmReportVarSampleTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportVarTb tb : fmReportVarTbs) {
			tb.setDeleteTs(date);
		}
		for (FmReportAmendmendTb tb : fmReportAmendmendTbs) {
			tb.setDeleteTs(date);
		}
		
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

	public BigDecimal getFrAlterationCount() {
		return this.frAlterationCount;
	}

	public void setFrAlterationCount(BigDecimal frAlterationCount) {
		this.frAlterationCount = frAlterationCount;
	}

	public String getFrBlockId() {
		return this.frBlockId;
	}

	public void setFrBlockId(String frBlockId) {
		this.frBlockId = frBlockId;
	}

	public Date getFrCollectionDate() {
		return this.frCollectionDate;
	}

	public void setFrCollectionDate(Date frCollectionDate) {
		this.frCollectionDate = frCollectionDate;
	}

	public String getFrCopiedPhysician() {
		return this.frCopiedPhysician;
	}

	public void setFrCopiedPhysician(String frCopiedPhysician) {
		this.frCopiedPhysician = frCopiedPhysician;
	}

	public Date getFrCorrectionDate() {
		return this.frCorrectionDate;
	}

	public void setFrCorrectionDate(Date frCorrectionDate) {
		this.frCorrectionDate = frCorrectionDate;
	}

	public String getFrDiagnosis() {
		return this.frDiagnosis;
	}

	public void setFrDiagnosis(String frDiagnosis) {
		this.frDiagnosis = frDiagnosis;
	}

	public Date getFrDob() {
		return this.frDob;
	}

	public void setFrDob(Date frDob) {
		this.frDob = frDob;
	}

	public String getFrFacilityId() {
		return this.frFacilityId;
	}

	public void setFrFacilityId(String frFacilityId) {
		this.frFacilityId = frFacilityId;
	}

	public String getFrFacilityName() {
		return this.frFacilityName;
	}

	public void setFrFacilityName(String frFacilityName) {
		this.frFacilityName = frFacilityName;
	}

	public String getFrFirstName() {
		return this.frFirstName;
	}

	public void setFrFirstName(String frFirstName) {
		this.frFirstName = frFirstName;
	}

	public String getFrFmId() {
		return this.frFmId;
	}

	public void setFrFmId(String frFmId) {
		this.frFmId = frFmId;
	}

	public String getFrFullName() {
		return this.frFullName;
	}

	public void setFrFullName(String frFullName) {
		this.frFullName = frFullName;
	}

	public String getFrGender() {
		return this.frGender;
	}

	public void setFrGender(String frGender) {
		this.frGender = frGender;
	}

	public String getFrLastName() {
		return this.frLastName;
	}

	public void setFrLastName(String frLastName) {
		this.frLastName = frLastName;
	}

	public String getFrOrderingMd() {
		return this.frOrderingMd;
	}

	public void setFrOrderingMd(String frOrderingMd) {
		this.frOrderingMd = frOrderingMd;
	}

	public String getFrOrderingMdId() {
		return this.frOrderingMdId;
	}

	public void setFrOrderingMdId(String frOrderingMdId) {
		this.frOrderingMdId = frOrderingMdId;
	}

	public String getFrPathologist() {
		return this.frPathologist;
	}

	public void setFrPathologist(String frPathologist) {
		this.frPathologist = frPathologist;
	}

	public Date getFrReceiveDate() {
		return this.frReceiveDate;
	}

	public void setFrReceiveDate(Date frReceiveDate) {
		this.frReceiveDate = frReceiveDate;
	}

	public String getFrReportId() {
		return this.frReportId;
	}

	public void setFrReportId(String frReportId) {
		this.frReportId = frReportId;
	}

	public BigDecimal getFrResistiveCount() {
		return this.frResistiveCount;
	}

	public void setFrResistiveCount(BigDecimal frResistiveCount) {
		this.frResistiveCount = frResistiveCount;
	}

	public String getFrSampleId() {
		return this.frSampleId;
	}

	public void setFrSampleId(String frSampleId) {
		this.frSampleId = frSampleId;
	}

	public String getFrSampleName() {
		return this.frSampleName;
	}

	public void setFrSampleName(String frSampleName) {
		this.frSampleName = frSampleName;
	}

	public BigDecimal getFrSensitizingCount() {
		return this.frSensitizingCount;
	}

	public void setFrSensitizingCount(BigDecimal frSensitizingCount) {
		this.frSensitizingCount = frSensitizingCount;
	}

	public String getFrSpecFormat() {
		return this.frSpecFormat;
	}

	public void setFrSpecFormat(String frSpecFormat) {
		this.frSpecFormat = frSpecFormat;
	}

	public String getFrSpecSite() {
		return this.frSpecSite;
	}

	public void setFrSpecSite(String frSpecSite) {
		this.frSpecSite = frSpecSite;
	}

	public String getFrSummary() {
		return this.frSummary;
	}

	public void setFrSummary(String frSummary) {
		this.frSummary = frSummary;
	}

	public String getFrTrfNumber() {
		return this.frTrfNumber;
	}

	public void setFrTrfNumber(String frTrfNumber) {
		this.frTrfNumber = frTrfNumber;
	}

	public BigDecimal getFrTrialCount() {
		return this.frTrialCount;
	}

	public void setFrTrialCount(BigDecimal frTrialCount) {
		this.frTrialCount = frTrialCount;
	}

	public BigDecimal getFrVersion() {
		return this.frVersion;
	}

	public void setFrVersion(BigDecimal frVersion) {
		this.frVersion = frVersion;
	}

	public Date getInsertTs() {
		return this.insertTs;
	}

	public void setInsertTs(Date insertTs) {
		this.insertTs = insertTs;
	}

	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getReportPdf() {
		return this.reportPdf;
	}

	public void setReportPdf(String reportPdf) {
		this.reportPdf = reportPdf;
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

	public String getVrDisease() {
		return this.vrDisease;
	}

	public void setVrDisease(String vrDisease) {
		this.vrDisease = vrDisease;
	}

	public String getVrDiseaseOntology() {
		return this.vrDiseaseOntology;
	}

	public void setVrDiseaseOntology(String vrDiseaseOntology) {
		this.vrDiseaseOntology = vrDiseaseOntology;
	}

	public BigDecimal getVrFlowcellAnalysis() {
		return this.vrFlowcellAnalysis;
	}

	public void setVrFlowcellAnalysis(BigDecimal vrFlowcellAnalysis) {
		this.vrFlowcellAnalysis = vrFlowcellAnalysis;
	}

	public String getVrGender() {
		return this.vrGender;
	}

	public void setVrGender(String vrGender) {
		this.vrGender = vrGender;
	}

	public String getVrPathologyDiagnosis() {
		return this.vrPathologyDiagnosis;
	}

	public void setVrPathologyDiagnosis(String vrPathologyDiagnosis) {
		this.vrPathologyDiagnosis = vrPathologyDiagnosis;
	}

	public String getVrPercentTumorNuclei() {
		return this.vrPercentTumorNuclei;
	}

	public void setVrPercentTumorNuclei(String vrPercentTumorNuclei) {
		this.vrPercentTumorNuclei = vrPercentTumorNuclei;
	}

	public String getVrPipelineVersion() {
		return this.vrPipelineVersion;
	}

	public void setVrPipelineVersion(String vrPipelineVersion) {
		this.vrPipelineVersion = vrPipelineVersion;
	}

	public BigDecimal getVrPurityAssessment() {
		return this.vrPurityAssessment;
	}

	public void setVrPurityAssessment(BigDecimal vrPurityAssessment) {
		this.vrPurityAssessment = vrPurityAssessment;
	}

	public String getVrQualityControlStatus() {
		return this.vrQualityControlStatus;
	}

	public void setVrQualityControlStatus(String vrQualityControlStatus) {
		this.vrQualityControlStatus = vrQualityControlStatus;
	}

	public String getVrSpecimen() {
		return this.vrSpecimen;
	}

	public void setVrSpecimen(String vrSpecimen) {
		this.vrSpecimen = vrSpecimen;
	}

	public String getVrStandardNucleicAcidType() {
		return this.vrStandardNucleicAcidType;
	}

	public void setVrStandardNucleicAcidType(String vrStandardNucleicAcidType) {
		this.vrStandardNucleicAcidType = vrStandardNucleicAcidType;
	}

	public String getVrStudy() {
		return this.vrStudy;
	}

	public void setVrStudy(String vrStudy) {
		this.vrStudy = vrStudy;
	}

	public String getVrTestRequest() {
		return this.vrTestRequest;
	}

	public void setVrTestRequest(String vrTestRequest) {
		this.vrTestRequest = vrTestRequest;
	}

	public String getVrTestType() {
		return this.vrTestType;
	}

	public void setVrTestType(String vrTestType) {
		this.vrTestType = vrTestType;
	}

	public String getVrTissueOfOrigin() {
		return this.vrTissueOfOrigin;
	}

	public void setVrTissueOfOrigin(String vrTissueOfOrigin) {
		this.vrTissueOfOrigin = vrTissueOfOrigin;
	}

	public BigDecimal getFileLoadId() {
		return fileLoadId;
	}

	public void setFileLoadId(BigDecimal fileLoadId) {
		this.fileLoadId = fileLoadId;
	}

	public List<FmReportAltPropertyTb> getFmReportAltPropertyTbs() {
		return this.fmReportAltPropertyTbs;
	}

	public void setFmReportAltPropertyTbs(List<FmReportAltPropertyTb> fmReportAltPropertyTbs) {
		this.fmReportAltPropertyTbs = fmReportAltPropertyTbs;
	}

	public FmReportAltPropertyTb addFmReportAltPropertyTb(FmReportAltPropertyTb fmReportAltPropertyTb) {
		getFmReportAltPropertyTbs().add(fmReportAltPropertyTb);
		fmReportAltPropertyTb.setFmReportTb(this);

		return fmReportAltPropertyTb;
	}

	public FmReportAltPropertyTb removeFmReportAltPropertyTb(FmReportAltPropertyTb fmReportAltPropertyTb) {
		getFmReportAltPropertyTbs().remove(fmReportAltPropertyTb);
		fmReportAltPropertyTb.setFmReportTb(null);

		return fmReportAltPropertyTb;
	}

	public List<FmReportAltTb> getFmReportAltTbs() {
		return this.fmReportAltTbs;
	}

	public void setFmReportAltTbs(List<FmReportAltTb> fmReportAltTbs) {
		this.fmReportAltTbs = fmReportAltTbs;
	}

	public FmReportAltTb addFmReportAltTb(FmReportAltTb fmReportAltTb) {
		getFmReportAltTbs().add(fmReportAltTb);
		fmReportAltTb.setFmReportTb(this);

		return fmReportAltTb;
	}

	public FmReportAltTb removeFmReportAltTb(FmReportAltTb fmReportAltTb) {
		getFmReportAltTbs().remove(fmReportAltTb);
		fmReportAltTb.setFmReportTb(null);

		return fmReportAltTb;
	}

	public List<FmReportAltTherapyTb> getFmReportAltTherapyTbs() {
		return this.fmReportAltTherapyTbs;
	}

	public void setFmReportAltTherapyTbs(List<FmReportAltTherapyTb> fmReportAltTherapyTbs) {
		this.fmReportAltTherapyTbs = fmReportAltTherapyTbs;
	}

	public FmReportAltTherapyTb addFmReportAltTherapyTb(FmReportAltTherapyTb fmReportAltTherapyTb) {
		getFmReportAltTherapyTbs().add(fmReportAltTherapyTb);
		fmReportAltTherapyTb.setFmReportTb(this);

		return fmReportAltTherapyTb;
	}

	public FmReportAltTherapyTb removeFmReportAltTherapyTb(FmReportAltTherapyTb fmReportAltTherapyTb) {
		getFmReportAltTherapyTbs().remove(fmReportAltTherapyTb);
		fmReportAltTherapyTb.setFmReportTb(null);

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
		fmReportAltTrialLkTb.setFmReportTb(this);

		return fmReportAltTrialLkTb;
	}

	public FmReportAltTrialLkTb removeFmReportAltTrialLkTb(FmReportAltTrialLkTb fmReportAltTrialLkTb) {
		getFmReportAltTrialLkTbs().remove(fmReportAltTrialLkTb);
		fmReportAltTrialLkTb.setFmReportTb(null);

		return fmReportAltTrialLkTb;
	}

	public List<FmReportAppTb> getFmReportAppTbs() {
		return this.fmReportAppTbs;
	}

	public void setFmReportAppTbs(List<FmReportAppTb> fmReportAppTbs) {
		this.fmReportAppTbs = fmReportAppTbs;
	}

	public FmReportAppTb addFmReportAppTb(FmReportAppTb fmReportAppTb) {
		getFmReportAppTbs().add(fmReportAppTb);
		fmReportAppTb.setFmReportTb(this);

		return fmReportAppTb;
	}

	public FmReportAppTb removeFmReportAppTb(FmReportAppTb fmReportAppTb) {
		getFmReportAppTbs().remove(fmReportAppTb);
		fmReportAppTb.setFmReportTb(null);

		return fmReportAppTb;
	}

	public List<FmReportGeneTb> getFmReportGeneTbs() {
		return this.fmReportGeneTbs;
	}

	public void setFmReportGeneTbs(List<FmReportGeneTb> fmReportGeneTbs) {
		this.fmReportGeneTbs = fmReportGeneTbs;
	}

	public FmReportGeneTb addFmReportGeneTb(FmReportGeneTb fmReportGeneTb) {
		getFmReportGeneTbs().add(fmReportGeneTb);
		fmReportGeneTb.setFmReportTb(this);

		return fmReportGeneTb;
	}

	public FmReportGeneTb removeFmReportGeneTb(FmReportGeneTb fmReportGeneTb) {
		getFmReportGeneTbs().remove(fmReportGeneTb);
		fmReportGeneTb.setFmReportTb(null);

		return fmReportGeneTb;
	}

	public List<FmReportPertNegTb> getFmReportPertNegTbs() {
		return this.fmReportPertNegTbs;
	}

	public void setFmReportPertNegTbs(List<FmReportPertNegTb> fmReportPertNegTbs) {
		this.fmReportPertNegTbs = fmReportPertNegTbs;
	}

	public FmReportPertNegTb addFmReportPertNegTb(FmReportPertNegTb fmReportPertNegTb) {
		getFmReportPertNegTbs().add(fmReportPertNegTb);
		fmReportPertNegTb.setFmReportTb(this);

		return fmReportPertNegTb;
	}

	public FmReportPertNegTb removeFmReportPertNegTb(FmReportPertNegTb fmReportPertNegTb) {
		getFmReportPertNegTbs().remove(fmReportPertNegTb);
		fmReportPertNegTb.setFmReportTb(null);

		return fmReportPertNegTb;
	}

	public List<FmReportReferenceTb> getFmReportReferenceTbs() {
		return this.fmReportReferenceTbs;
	}

	public void setFmReportReferenceTbs(List<FmReportReferenceTb> fmReportReferenceTbs) {
		this.fmReportReferenceTbs = fmReportReferenceTbs;
	}

	public FmReportReferenceTb addFmReportReferenceTb(FmReportReferenceTb fmReportReferenceTb) {
		getFmReportReferenceTbs().add(fmReportReferenceTb);
		fmReportReferenceTb.setFmReportTb(this);

		return fmReportReferenceTb;
	}

	public FmReportReferenceTb removeFmReportReferenceTb(FmReportReferenceTb fmReportReferenceTb) {
		getFmReportReferenceTbs().remove(fmReportReferenceTb);
		fmReportReferenceTb.setFmReportTb(null);

		return fmReportReferenceTb;
	}

	public List<FmReportRefLkTb> getFmReportRefLkTbs() {
		return this.fmReportRefLkTbs;
	}

	public void setFmReportRefLkTbs(List<FmReportRefLkTb> fmReportRefLkTbs) {
		this.fmReportRefLkTbs = fmReportRefLkTbs;
	}

	public FmReportRefLkTb addFmReportRefLkTb(FmReportRefLkTb fmReportRefLkTb) {
		getFmReportRefLkTbs().add(fmReportRefLkTb);
		fmReportRefLkTb.setFmReportTb(this);

		return fmReportRefLkTb;
	}

	public FmReportRefLkTb removeFmReportRefLkTb(FmReportRefLkTb fmReportRefLkTb) {
		getFmReportRefLkTbs().remove(fmReportRefLkTb);
		fmReportRefLkTb.setFmReportTb(null);

		return fmReportRefLkTb;
	}

	public List<FmReportSampleTb> getFmReportSampleTbs() {
		return this.fmReportSampleTbs;
	}

	public void setFmReportSampleTbs(List<FmReportSampleTb> fmReportSampleTbs) {
		this.fmReportSampleTbs = fmReportSampleTbs;
	}

	public FmReportSampleTb addFmReportSampleTb(FmReportSampleTb fmReportSampleTb) {
		getFmReportSampleTbs().add(fmReportSampleTb);
		fmReportSampleTb.setFmReportTb(this);

		return fmReportSampleTb;
	}

	public FmReportSampleTb removeFmReportSampleTb(FmReportSampleTb fmReportSampleTb) {
		getFmReportSampleTbs().remove(fmReportSampleTb);
		fmReportSampleTb.setFmReportTb(null);

		return fmReportSampleTb;
	}

	public List<FmReportSignatureTb> getFmReportSignatureTbs() {
		return this.fmReportSignatureTbs;
	}

	public void setFmReportSignatureTbs(List<FmReportSignatureTb> fmReportSignatureTbs) {
		this.fmReportSignatureTbs = fmReportSignatureTbs;
	}

	public FmReportSignatureTb addFmReportSignatureTb(FmReportSignatureTb fmReportSignatureTb) {
		getFmReportSignatureTbs().add(fmReportSignatureTb);
		fmReportSignatureTb.setFmReportTb(this);

		return fmReportSignatureTb;
	}

	public FmReportSignatureTb removeFmReportSignatureTb(FmReportSignatureTb fmReportSignatureTb) {
		getFmReportSignatureTbs().remove(fmReportSignatureTb);
		fmReportSignatureTb.setFmReportTb(null);

		return fmReportSignatureTb;
	}

	public SpecimenTb getSpecimenTb() {
		return this.specimenTb;
	}

	public void setSpecimenTb(SpecimenTb specimenTb) {
		this.specimenTb = specimenTb;
	}

	public List<FmReportTrialTb> getFmReportTrialTbs() {
		return this.fmReportTrialTbs;
	}

	public void setFmReportTrialTbs(List<FmReportTrialTb> fmReportTrialTbs) {
		this.fmReportTrialTbs = fmReportTrialTbs;
	}

	public FmReportTrialTb addFmReportTrialTb(FmReportTrialTb fmReportTrialTb) {
		getFmReportTrialTbs().add(fmReportTrialTb);
		fmReportTrialTb.setFmReportTb(this);

		return fmReportTrialTb;
	}

	public FmReportTrialTb removeFmReportTrialTb(FmReportTrialTb fmReportTrialTb) {
		getFmReportTrialTbs().remove(fmReportTrialTb);
		fmReportTrialTb.setFmReportTb(null);

		return fmReportTrialTb;
	}

	public List<FmReportVarPropertyTb> getFmReportVarPropertyTbs() {
		return this.fmReportVarPropertyTbs;
	}

	public void setFmReportVarPropertyTbs(List<FmReportVarPropertyTb> fmReportVarPropertyTbs) {
		this.fmReportVarPropertyTbs = fmReportVarPropertyTbs;
	}

	public FmReportVarPropertyTb addFmReportVarPropertyTb(FmReportVarPropertyTb fmReportVarPropertyTb) {
		getFmReportVarPropertyTbs().add(fmReportVarPropertyTb);
		fmReportVarPropertyTb.setFmReportTb(this);

		return fmReportVarPropertyTb;
	}

	public FmReportVarPropertyTb removeFmReportVarPropertyTb(FmReportVarPropertyTb fmReportVarPropertyTb) {
		getFmReportVarPropertyTbs().remove(fmReportVarPropertyTb);
		fmReportVarPropertyTb.setFmReportTb(null);

		return fmReportVarPropertyTb;
	}

	public List<FmReportVarSampleTb> getFmReportVarSampleTbs() {
		return this.fmReportVarSampleTbs;
	}

	public void setFmReportVarSampleTbs(List<FmReportVarSampleTb> fmReportVarSampleTbs) {
		this.fmReportVarSampleTbs = fmReportVarSampleTbs;
	}

	public FmReportVarSampleTb addFmReportVarSampleTb(FmReportVarSampleTb fmReportVarSampleTb) {
		getFmReportVarSampleTbs().add(fmReportVarSampleTb);
		fmReportVarSampleTb.setFmReportTb(this);

		return fmReportVarSampleTb;
	}

	public FmReportVarSampleTb removeFmReportVarSampleTb(FmReportVarSampleTb fmReportVarSampleTb) {
		getFmReportVarSampleTbs().remove(fmReportVarSampleTb);
		fmReportVarSampleTb.setFmReportTb(null);

		return fmReportVarSampleTb;
	}

	public List<FmReportVarTb> getFmReportVarTbs() {
		return this.fmReportVarTbs;
	}

	public void setFmReportVarTbs(List<FmReportVarTb> fmReportVarTbs) {
		this.fmReportVarTbs = fmReportVarTbs;
	}

	public FmReportVarTb addFmReportVarTb(FmReportVarTb fmReportVarTb) {
		getFmReportVarTbs().add(fmReportVarTb);
		fmReportVarTb.setFmReportTb(this);

		return fmReportVarTb;
	}

	public FmReportVarTb removeFmReportVarTb(FmReportVarTb fmReportVarTb) {
		getFmReportVarTbs().remove(fmReportVarTb);
		fmReportVarTb.setFmReportTb(null);

		return fmReportVarTb;
	}

	public List<FmReportAmendmendTb> getFmReportAmendmendTbs() {
		return this.fmReportAmendmendTbs;
	}

	public void setFmReportAmendmendTbs(List<FmReportAmendmendTb> fmReportAmendmendTbs) {
		this.fmReportAmendmendTbs = fmReportAmendmendTbs;
	}

	public FmReportAmendmendTb addFmReportAmendmendTb(FmReportAmendmendTb fmReportAmendmendTb) {
		getFmReportAmendmendTbs().add(fmReportAmendmendTb);
		fmReportAmendmendTb.setFmReportTb(this);

		return fmReportAmendmendTb;
	}

	public FmReportAmendmendTb removeFmReportAmendmendTb(FmReportAmendmendTb fmReportAmendmendTb) {
		getFmReportAmendmendTbs().remove(fmReportAmendmendTb);
		fmReportAmendmendTb.setFmReportTb(null);

		return fmReportAmendmendTb;
	}

	public String getFrStagingId() {
		return frStagingId;
	}

	public void setFrStagingId(String frStagingId) {
		this.frStagingId = frStagingId;
	}

	public String getFrClinicalId() {
		return frClinicalId;
	}

	public void setFrClinicalId(String frClinicalId) {
		this.frClinicalId = frClinicalId;
	}

	public String getFrPerformanceDataId() {
		return frPerformanceDataId;
	}

	public void setFrPerformanceDataId(String frPerformanceDataId) {
		this.frPerformanceDataId = frPerformanceDataId;
	}
	
}