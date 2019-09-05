package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthoringExchangeOutputModel
 */
public class BQAuthoringExchangeOutputModel   {
  private String authoringExchangeActionTaskReference = null;

  private Object authoringExchangeActionTaskRecord = null;

  private String authoringExchangeActionResponse = null;

  private String authoringInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Authoring instance exchange service call 
   * @return authoringExchangeActionTaskReference
  **/

  public String getAuthoringExchangeActionTaskReference() {
    return authoringExchangeActionTaskReference;
  }

  public void setAuthoringExchangeActionTaskReference(String authoringExchangeActionTaskReference) {
    this.authoringExchangeActionTaskReference = authoringExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return authoringExchangeActionTaskRecord
  **/

  public Object getAuthoringExchangeActionTaskRecord() {
    return authoringExchangeActionTaskRecord;
  }

  public void setAuthoringExchangeActionTaskRecord(Object authoringExchangeActionTaskRecord) {
    this.authoringExchangeActionTaskRecord = authoringExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return authoringExchangeActionResponse
  **/

  public String getAuthoringExchangeActionResponse() {
    return authoringExchangeActionResponse;
  }

  public void setAuthoringExchangeActionResponse(String authoringExchangeActionResponse) {
    this.authoringExchangeActionResponse = authoringExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Authoring instance (e.g. accepted, rejected, verified) 
   * @return authoringInstanceStatus
  **/

  public String getAuthoringInstanceStatus() {
    return authoringInstanceStatus;
  }

  public void setAuthoringInstanceStatus(String authoringInstanceStatus) {
    this.authoringInstanceStatus = authoringInstanceStatus;
  }


}

