package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEnquiriesRetrieveInputModelEnquiriesInstanceAnalysis;
import org.bian.dto.BQEnquiriesRetrieveInputModelEnquiriesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEnquiriesRetrieveInputModel
 */
public class BQEnquiriesRetrieveInputModel   {
  private Object enquiriesRetrieveActionTaskRecord = null;

  private String enquiriesRetrieveActionRequest = null;

  private BQEnquiriesRetrieveInputModelEnquiriesInstanceReport enquiriesInstanceReport = null;

  private BQEnquiriesRetrieveInputModelEnquiriesInstanceAnalysis enquiriesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return enquiriesRetrieveActionTaskRecord
  **/

  public Object getEnquiriesRetrieveActionTaskRecord() {
    return enquiriesRetrieveActionTaskRecord;
  }

  public void setEnquiriesRetrieveActionTaskRecord(Object enquiriesRetrieveActionTaskRecord) {
    this.enquiriesRetrieveActionTaskRecord = enquiriesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return enquiriesRetrieveActionRequest
  **/

  public String getEnquiriesRetrieveActionRequest() {
    return enquiriesRetrieveActionRequest;
  }

  public void setEnquiriesRetrieveActionRequest(String enquiriesRetrieveActionRequest) {
    this.enquiriesRetrieveActionRequest = enquiriesRetrieveActionRequest;
  }


  /**
   * Get enquiriesInstanceReport
   * @return enquiriesInstanceReport
  **/

  public BQEnquiriesRetrieveInputModelEnquiriesInstanceReport getEnquiriesInstanceReport() {
    return enquiriesInstanceReport;
  }

  public void setEnquiriesInstanceReport(BQEnquiriesRetrieveInputModelEnquiriesInstanceReport enquiriesInstanceReport) {
    this.enquiriesInstanceReport = enquiriesInstanceReport;
  }


  /**
   * Get enquiriesInstanceAnalysis
   * @return enquiriesInstanceAnalysis
  **/

  public BQEnquiriesRetrieveInputModelEnquiriesInstanceAnalysis getEnquiriesInstanceAnalysis() {
    return enquiriesInstanceAnalysis;
  }

  public void setEnquiriesInstanceAnalysis(BQEnquiriesRetrieveInputModelEnquiriesInstanceAnalysis enquiriesInstanceAnalysis) {
    this.enquiriesInstanceAnalysis = enquiriesInstanceAnalysis;
  }


}

