package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEnquiriesRetrieveOutputModelEnquiriesInstanceAnalysis
 */
public class BQEnquiriesRetrieveOutputModelEnquiriesInstanceAnalysis   {
  private Object enquiriesInstanceAnalysisRecord = null;

  private String enquiriesInstanceAnalysisReportType = null;

  private String enquiriesInstanceAnalysisParameters = null;

  private Object enquiriesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return enquiriesInstanceAnalysisRecord
  **/

  public Object getEnquiriesInstanceAnalysisRecord() {
    return enquiriesInstanceAnalysisRecord;
  }

  public void setEnquiriesInstanceAnalysisRecord(Object enquiriesInstanceAnalysisRecord) {
    this.enquiriesInstanceAnalysisRecord = enquiriesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return enquiriesInstanceAnalysisReportType
  **/

  public String getEnquiriesInstanceAnalysisReportType() {
    return enquiriesInstanceAnalysisReportType;
  }

  public void setEnquiriesInstanceAnalysisReportType(String enquiriesInstanceAnalysisReportType) {
    this.enquiriesInstanceAnalysisReportType = enquiriesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return enquiriesInstanceAnalysisParameters
  **/

  public String getEnquiriesInstanceAnalysisParameters() {
    return enquiriesInstanceAnalysisParameters;
  }

  public void setEnquiriesInstanceAnalysisParameters(String enquiriesInstanceAnalysisParameters) {
    this.enquiriesInstanceAnalysisParameters = enquiriesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return enquiriesInstanceAnalysisReport
  **/

  public Object getEnquiriesInstanceAnalysisReport() {
    return enquiriesInstanceAnalysisReport;
  }

  public void setEnquiriesInstanceAnalysisReport(Object enquiriesInstanceAnalysisReport) {
    this.enquiriesInstanceAnalysisReport = enquiriesInstanceAnalysisReport;
  }


}

