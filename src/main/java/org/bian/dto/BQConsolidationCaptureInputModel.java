package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQConsolidationCaptureInputModelCaptureRecordType;
import org.bian.dto.BQConsolidationCaptureInputModelConsolidationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQConsolidationCaptureInputModel
 */
public class BQConsolidationCaptureInputModel   {
  private String regulatoryComplianceAdministrativePlanInstanceReference = null;

  private String consolidationInstanceReference = null;

  private BQConsolidationCaptureInputModelConsolidationInstanceRecord consolidationInstanceRecord = null;

  private Object consolidationCaptureActionTaskRecord = null;

  private BQConsolidationCaptureInputModelCaptureRecordType captureRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Consolidation instance 
   * @return consolidationInstanceReference
  **/

  public String getConsolidationInstanceReference() {
    return consolidationInstanceReference;
  }

  public void setConsolidationInstanceReference(String consolidationInstanceReference) {
    this.consolidationInstanceReference = consolidationInstanceReference;
  }


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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQConsolidationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQConsolidationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

