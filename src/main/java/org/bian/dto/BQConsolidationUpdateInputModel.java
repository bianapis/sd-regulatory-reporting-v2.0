package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQConsolidationUpdateInputModelConsolidationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQConsolidationUpdateInputModel
 */
public class BQConsolidationUpdateInputModel   {
  private BQConsolidationUpdateInputModelConsolidationInstanceRecord consolidationInstanceRecord = null;

  private Object consolidationUpdateActionTaskRecord = null;

  private String consolidationUpdateActionRequest = null;


  /**
   * Get consolidationInstanceRecord
   * @return consolidationInstanceRecord
  **/

  public BQConsolidationUpdateInputModelConsolidationInstanceRecord getConsolidationInstanceRecord() {
    return consolidationInstanceRecord;
  }

  public void setConsolidationInstanceRecord(BQConsolidationUpdateInputModelConsolidationInstanceRecord consolidationInstanceRecord) {
    this.consolidationInstanceRecord = consolidationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return consolidationUpdateActionTaskRecord
  **/

  public Object getConsolidationUpdateActionTaskRecord() {
    return consolidationUpdateActionTaskRecord;
  }

  public void setConsolidationUpdateActionTaskRecord(Object consolidationUpdateActionTaskRecord) {
    this.consolidationUpdateActionTaskRecord = consolidationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return consolidationUpdateActionRequest
  **/

  public String getConsolidationUpdateActionRequest() {
    return consolidationUpdateActionRequest;
  }

  public void setConsolidationUpdateActionRequest(String consolidationUpdateActionRequest) {
    this.consolidationUpdateActionRequest = consolidationUpdateActionRequest;
  }


}

