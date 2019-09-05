package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthoringRetrieveOutputModelAuthoringInstanceReport
 */
public class BQAuthoringRetrieveOutputModelAuthoringInstanceReport   {
  private Object authoringInstanceReportRecord = null;

  private String authoringInstanceReportType = null;

  private String authoringInstanceReportParameters = null;

  private Object authoringInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return authoringInstanceReportRecord
  **/

  public Object getAuthoringInstanceReportRecord() {
    return authoringInstanceReportRecord;
  }

  public void setAuthoringInstanceReportRecord(Object authoringInstanceReportRecord) {
    this.authoringInstanceReportRecord = authoringInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return authoringInstanceReportType
  **/

  public String getAuthoringInstanceReportType() {
    return authoringInstanceReportType;
  }

  public void setAuthoringInstanceReportType(String authoringInstanceReportType) {
    this.authoringInstanceReportType = authoringInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return authoringInstanceReportParameters
  **/

  public String getAuthoringInstanceReportParameters() {
    return authoringInstanceReportParameters;
  }

  public void setAuthoringInstanceReportParameters(String authoringInstanceReportParameters) {
    this.authoringInstanceReportParameters = authoringInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return authoringInstanceReport
  **/

  public Object getAuthoringInstanceReport() {
    return authoringInstanceReport;
  }

  public void setAuthoringInstanceReport(Object authoringInstanceReport) {
    this.authoringInstanceReport = authoringInstanceReport;
  }


}

