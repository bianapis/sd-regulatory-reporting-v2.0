package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord
 */
public class CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord   {
  private String regulatoryComplianceAdministrativePlanInstanceReportData = null;

  private String regulatoryComplianceAdministrativePlanInstanceReportType = null;

  private Object regulatoryComplianceAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return regulatoryComplianceAdministrativePlanInstanceReportData
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceReportData() {
    return regulatoryComplianceAdministrativePlanInstanceReportData;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceReportData(String regulatoryComplianceAdministrativePlanInstanceReportData) {
    this.regulatoryComplianceAdministrativePlanInstanceReportData = regulatoryComplianceAdministrativePlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return regulatoryComplianceAdministrativePlanInstanceReportType
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceReportType() {
    return regulatoryComplianceAdministrativePlanInstanceReportType;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceReportType(String regulatoryComplianceAdministrativePlanInstanceReportType) {
    this.regulatoryComplianceAdministrativePlanInstanceReportType = regulatoryComplianceAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return regulatoryComplianceAdministrativePlanInstanceReport
  **/

  public Object getRegulatoryComplianceAdministrativePlanInstanceReport() {
    return regulatoryComplianceAdministrativePlanInstanceReport;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceReport(Object regulatoryComplianceAdministrativePlanInstanceReport) {
    this.regulatoryComplianceAdministrativePlanInstanceReport = regulatoryComplianceAdministrativePlanInstanceReport;
  }


}

