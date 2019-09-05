package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthoringRetrieveInputModelAuthoringInstanceAnalysis
 */
public class BQAuthoringRetrieveInputModelAuthoringInstanceAnalysis   {
  private String authoringInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return authoringInstanceAnalysisReference
  **/

  public String getAuthoringInstanceAnalysisReference() {
    return authoringInstanceAnalysisReference;
  }

  public void setAuthoringInstanceAnalysisReference(String authoringInstanceAnalysisReference) {
    this.authoringInstanceAnalysisReference = authoringInstanceAnalysisReference;
  }


}

