package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQConsolidationCaptureInputModelConsolidationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQConsolidationCaptureOutputModel
 */
public class BQConsolidationCaptureOutputModel   {
  private BQConsolidationCaptureInputModelConsolidationInstanceRecord consolidationInstanceRecord = null;

  private String consolidationCaptureActionTaskReference = null;

  private Object consolidationCaptureActionTaskRecord = null;

  private String consolidationCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get consolidationInstanceRecord
   * @return consolidationInstanceRecord
  **/

  public BQConsolidationCaptureInputModelConsolidationInstanceRecord getConsolidationInstanceRecord() {
    return consolidationInstanceRecord;
  }

  public void setConsolidationInstanceRecord(BQConsolidationCaptureInputModelConsolidationInstanceRecord consolidationInstanceRecord) {
    this.consolidationInstanceRecord = consolidationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Consolidation instance capture service call 
   * @return consolidationCaptureActionTaskReference
  **/

  public String getConsolidationCaptureActionTaskReference() {
    return consolidationCaptureActionTaskReference;
  }

  public void setConsolidationCaptureActionTaskReference(String consolidationCaptureActionTaskReference) {
    this.consolidationCaptureActionTaskReference = consolidationCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return consolidationCaptureActionTaskRecord
  **/

  public Object getConsolidationCaptureActionTaskRecord() {
    return consolidationCaptureActionTaskRecord;
  }

  public void setConsolidationCaptureActionTaskRecord(Object consolidationCaptureActionTaskRecord) {
    this.consolidationCaptureActionTaskRecord = consolidationCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Consolidation structured input transaction/record 
   * @return consolidationCaptureRecordReference
  **/

  public String getConsolidationCaptureRecordReference() {
    return consolidationCaptureRecordReference;
  }

  public void setConsolidationCaptureRecordReference(String consolidationCaptureRecordReference) {
    this.consolidationCaptureRecordReference = consolidationCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

