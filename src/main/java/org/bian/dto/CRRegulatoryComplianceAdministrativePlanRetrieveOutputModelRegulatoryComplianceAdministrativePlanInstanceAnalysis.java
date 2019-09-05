package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis
 */
public class CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis   {
  private String regulatoryComplianceAdministrativePlanInstanceAnalysisData = null;

  private String regulatoryComplianceAdministrativePlanInstanceAnalysisReportType = null;

  private Object regulatoryComplianceAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return regulatoryComplianceAdministrativePlanInstanceAnalysisData
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceAnalysisData() {
    return regulatoryComplianceAdministrativePlanInstanceAnalysisData;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceAnalysisData(String regulatoryComplianceAdministrativePlanInstanceAnalysisData) {
    this.regulatoryComplianceAdministrativePlanInstanceAnalysisData = regulatoryComplianceAdministrativePlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return regulatoryComplianceAdministrativePlanInstanceAnalysisReport
  **/

  public Object getRegulatoryComplianceAdministrativePlanInstanceAnalysisReport() {
    return regulatoryComplianceAdministrativePlanInstanceAnalysisReport;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceAnalysisReport(Object regulatoryComplianceAdministrativePlanInstanceAnalysisReport) {
    this.regulatoryComplianceAdministrativePlanInstanceAnalysisReport = regulatoryComplianceAdministrativePlanInstanceAnalysisReport;
  }


}

