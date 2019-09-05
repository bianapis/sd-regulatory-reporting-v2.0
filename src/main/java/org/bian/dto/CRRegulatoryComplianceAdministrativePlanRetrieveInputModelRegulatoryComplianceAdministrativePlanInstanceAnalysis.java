package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis
 */
public class CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis   {
  private String regulatoryComplianceAdministrativePlanInstanceAnalysisReference = null;

  private String regulatoryComplianceAdministrativePlanInstanceAnalysisReportType = null;

  private String regulatoryComplianceAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return regulatoryComplianceAdministrativePlanInstanceAnalysisReference
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceAnalysisReference() {
    return regulatoryComplianceAdministrativePlanInstanceAnalysisReference;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceAnalysisReference(String regulatoryComplianceAdministrativePlanInstanceAnalysisReference) {
    this.regulatoryComplianceAdministrativePlanInstanceAnalysisReference = regulatoryComplianceAdministrativePlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return regulatoryComplianceAdministrativePlanInstanceAnalysisReportType
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceAnalysisReportType() {
    return regulatoryComplianceAdministrativePlanInstanceAnalysisReportType;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceAnalysisReportType(String regulatoryComplianceAdministrativePlanInstanceAnalysisReportType) {
    this.regulatoryComplianceAdministrativePlanInstanceAnalysisReportType = regulatoryComplianceAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return regulatoryComplianceAdministrativePlanInstanceAnalysisParameters
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceAnalysisParameters() {
    return regulatoryComplianceAdministrativePlanInstanceAnalysisParameters;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceAnalysisParameters(String regulatoryComplianceAdministrativePlanInstanceAnalysisParameters) {
    this.regulatoryComplianceAdministrativePlanInstanceAnalysisParameters = regulatoryComplianceAdministrativePlanInstanceAnalysisParameters;
  }


}

