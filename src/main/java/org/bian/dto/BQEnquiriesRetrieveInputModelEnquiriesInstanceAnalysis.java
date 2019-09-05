package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEnquiriesRetrieveInputModelEnquiriesInstanceAnalysis
 */
public class BQEnquiriesRetrieveInputModelEnquiriesInstanceAnalysis   {
  private String enquiriesInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return enquiriesInstanceAnalysisReference
  **/

  public String getEnquiriesInstanceAnalysisReference() {
    return enquiriesInstanceAnalysisReference;
  }

  public void setEnquiriesInstanceAnalysisReference(String enquiriesInstanceAnalysisReference) {
    this.enquiriesInstanceAnalysisReference = enquiriesInstanceAnalysisReference;
  }


}

