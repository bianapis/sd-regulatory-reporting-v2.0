package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord
 */
public class CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord   {
  private String regulatoryComplianceAdministrativePlanInstanceReportReference = null;

  private String regulatoryComplianceAdministrativePlanInstanceReportType = null;

  private String regulatoryComplianceAdministrativePlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return regulatoryComplianceAdministrativePlanInstanceReportReference
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceReportReference() {
    return regulatoryComplianceAdministrativePlanInstanceReportReference;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceReportReference(String regulatoryComplianceAdministrativePlanInstanceReportReference) {
    this.regulatoryComplianceAdministrativePlanInstanceReportReference = regulatoryComplianceAdministrativePlanInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return regulatoryComplianceAdministrativePlanInstanceReportParameters
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceReportParameters() {
    return regulatoryComplianceAdministrativePlanInstanceReportParameters;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceReportParameters(String regulatoryComplianceAdministrativePlanInstanceReportParameters) {
    this.regulatoryComplianceAdministrativePlanInstanceReportParameters = regulatoryComplianceAdministrativePlanInstanceReportParameters;
  }


}

