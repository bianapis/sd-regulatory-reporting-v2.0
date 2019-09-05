package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthoringRetrieveInputModelAuthoringInstanceAnalysis;
import org.bian.dto.BQAuthoringRetrieveInputModelAuthoringInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAuthoringRetrieveInputModel
 */
public class BQAuthoringRetrieveInputModel   {
  private Object authoringRetrieveActionTaskRecord = null;

  private String authoringRetrieveActionRequest = null;

  private BQAuthoringRetrieveInputModelAuthoringInstanceReport authoringInstanceReport = null;

  private BQAuthoringRetrieveInputModelAuthoringInstanceAnalysis authoringInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return authoringRetrieveActionTaskRecord
  **/

  public Object getAuthoringRetrieveActionTaskRecord() {
    return authoringRetrieveActionTaskRecord;
  }

  public void setAuthoringRetrieveActionTaskRecord(Object authoringRetrieveActionTaskRecord) {
    this.authoringRetrieveActionTaskRecord = authoringRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return authoringRetrieveActionRequest
  **/

  public String getAuthoringRetrieveActionRequest() {
    return authoringRetrieveActionRequest;
  }

  public void setAuthoringRetrieveActionRequest(String authoringRetrieveActionRequest) {
    this.authoringRetrieveActionRequest = authoringRetrieveActionRequest;
  }


  /**
   * Get authoringInstanceReport
   * @return authoringInstanceReport
  **/

  public BQAuthoringRetrieveInputModelAuthoringInstanceReport getAuthoringInstanceReport() {
    return authoringInstanceReport;
  }

  public void setAuthoringInstanceReport(BQAuthoringRetrieveInputModelAuthoringInstanceReport authoringInstanceReport) {
    this.authoringInstanceReport = authoringInstanceReport;
  }


  /**
   * Get authoringInstanceAnalysis
   * @return authoringInstanceAnalysis
  **/

  public BQAuthoringRetrieveInputModelAuthoringInstanceAnalysis getAuthoringInstanceAnalysis() {
    return authoringInstanceAnalysis;
  }

  public void setAuthoringInstanceAnalysis(BQAuthoringRetrieveInputModelAuthoringInstanceAnalysis authoringInstanceAnalysis) {
    this.authoringInstanceAnalysis = authoringInstanceAnalysis;
  }


}

