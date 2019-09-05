package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecordRegulatoryReportingSchedule
 */
public class CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecordRegulatoryReportingSchedule   {
  private String regulationReference = null;

  private String regulatoryReportType = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9jSw8nltEeG7BsjMvd1mEw_1652971177  bian-reference: Regulation  general-info: Reference to the regulation for which content is being collected 
   * @return regulationReference
  **/

  public String getRegulationReference() {
    return regulationReference;
  }

  public void setRegulationReference(String regulationReference) {
    this.regulationReference = regulationReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDYMVMTGEeChad0JzLk7QA_-1222522700/elements/_FDh9UMTGEeChad0JzLk7QA_-463914375  bian-reference: RegulatoryReport (as Report).ReportType  general-info: The types of report, included in the reporting schedule 
   * @return regulatoryReportType
  **/

  public String getRegulatoryReportType() {
    return regulatoryReportType;
  }

  public void setRegulatoryReportType(String regulatoryReportType) {
    this.regulatoryReportType = regulatoryReportType;
  }


}

