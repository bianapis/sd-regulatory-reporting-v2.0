package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthoringRetrieveOutputModelAuthoringInstanceAnalysis
 */
public class BQAuthoringRetrieveOutputModelAuthoringInstanceAnalysis   {
  private Object authoringInstanceAnalysisRecord = null;

  private String authoringInstanceAnalysisReportType = null;

  private String authoringInstanceAnalysisParameters = null;

  private Object authoringInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return authoringInstanceAnalysisRecord
  **/

  public Object getAuthoringInstanceAnalysisRecord() {
    return authoringInstanceAnalysisRecord;
  }

  public void setAuthoringInstanceAnalysisRecord(Object authoringInstanceAnalysisRecord) {
    this.authoringInstanceAnalysisRecord = authoringInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return authoringInstanceAnalysisReportType
  **/

  public String getAuthoringInstanceAnalysisReportType() {
    return authoringInstanceAnalysisReportType;
  }

  public void setAuthoringInstanceAnalysisReportType(String authoringInstanceAnalysisReportType) {
    this.authoringInstanceAnalysisReportType = authoringInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return authoringInstanceAnalysisParameters
  **/

  public String getAuthoringInstanceAnalysisParameters() {
    return authoringInstanceAnalysisParameters;
  }

  public void setAuthoringInstanceAnalysisParameters(String authoringInstanceAnalysisParameters) {
    this.authoringInstanceAnalysisParameters = authoringInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return authoringInstanceAnalysisReport
  **/

  public Object getAuthoringInstanceAnalysisReport() {
    return authoringInstanceAnalysisReport;
  }

  public void setAuthoringInstanceAnalysisReport(Object authoringInstanceAnalysisReport) {
    this.authoringInstanceAnalysisReport = authoringInstanceAnalysisReport;
  }


}

