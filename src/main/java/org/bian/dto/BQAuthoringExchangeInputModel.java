package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthoringExchangeInputModelAuthoringExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAuthoringExchangeInputModel
 */
public class BQAuthoringExchangeInputModel   {
  private String regulatoryComplianceAdministrativePlanInstanceReference = null;

  private String authoringInstanceReference = null;

  private Object authoringExchangeActionTaskRecord = null;

  private BQAuthoringExchangeInputModelAuthoringExchangeActionRequest authoringExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Regulatory Compliance Administrative Plan instance 
   * @return regulatoryComplianceAdministrativePlanInstanceReference
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceReference() {
    return regulatoryComplianceAdministrativePlanInstanceReference;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceReference(String regulatoryComplianceAdministrativePlanInstanceReference) {
    this.regulatoryComplianceAdministrativePlanInstanceReference = regulatoryComplianceAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Authoring instance 
   * @return authoringInstanceReference
  **/

  public String getAuthoringInstanceReference() {
    return authoringInstanceReference;
  }

  public void setAuthoringInstanceReference(String authoringInstanceReference) {
    this.authoringInstanceReference = authoringInstanceReference;
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
   * Get authoringExchangeActionRequest
   * @return authoringExchangeActionRequest
  **/

  public BQAuthoringExchangeInputModelAuthoringExchangeActionRequest getAuthoringExchangeActionRequest() {
    return authoringExchangeActionRequest;
  }

  public void setAuthoringExchangeActionRequest(BQAuthoringExchangeInputModelAuthoringExchangeActionRequest authoringExchangeActionRequest) {
    this.authoringExchangeActionRequest = authoringExchangeActionRequest;
  }


}

