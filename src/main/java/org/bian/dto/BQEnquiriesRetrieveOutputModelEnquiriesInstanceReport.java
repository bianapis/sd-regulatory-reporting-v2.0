package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEnquiriesRetrieveOutputModelEnquiriesInstanceReport
 */
public class BQEnquiriesRetrieveOutputModelEnquiriesInstanceReport   {
  private Object enquiriesInstanceReportRecord = null;

  private String enquiriesInstanceReportType = null;

  private String enquiriesInstanceReportParameters = null;

  private Object enquiriesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return enquiriesInstanceReportRecord
  **/

  public Object getEnquiriesInstanceReportRecord() {
    return enquiriesInstanceReportRecord;
  }

  public void setEnquiriesInstanceReportRecord(Object enquiriesInstanceReportRecord) {
    this.enquiriesInstanceReportRecord = enquiriesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return enquiriesInstanceReportType
  **/

  public String getEnquiriesInstanceReportType() {
    return enquiriesInstanceReportType;
  }

  public void setEnquiriesInstanceReportType(String enquiriesInstanceReportType) {
    this.enquiriesInstanceReportType = enquiriesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return enquiriesInstanceReportParameters
  **/

  public String getEnquiriesInstanceReportParameters() {
    return enquiriesInstanceReportParameters;
  }

  public void setEnquiriesInstanceReportParameters(String enquiriesInstanceReportParameters) {
    this.enquiriesInstanceReportParameters = enquiriesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return enquiriesInstanceReport
  **/

  public Object getEnquiriesInstanceReport() {
    return enquiriesInstanceReport;
  }

  public void setEnquiriesInstanceReport(Object enquiriesInstanceReport) {
    this.enquiriesInstanceReport = enquiriesInstanceReport;
  }


}

