package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelConsolidationInstanceRecord
 */
public class CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelConsolidationInstanceRecord   {
  private String regulatoryReportTypeContentRequirements = null;

  private String sourceBusinessUnitEmployeeReference = null;

  private String sourceProductServiceReference = null;

  private String sourceCustomerReference = null;

  private String sourceTransactionRecords = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the source content required for a report type 
   * @return regulatoryReportTypeContentRequirements
  **/

  public String getRegulatoryReportTypeContentRequirements() {
    return regulatoryReportTypeContentRequirements;
  }

  public void setRegulatoryReportTypeContentRequirements(String regulatoryReportTypeContentRequirements) {
    this.regulatoryReportTypeContentRequirements = regulatoryReportTypeContentRequirements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the source of production information being assembled 
   * @return sourceBusinessUnitEmployeeReference
  **/

  public String getSourceBusinessUnitEmployeeReference() {
    return sourceBusinessUnitEmployeeReference;
  }

  public void setSourceBusinessUnitEmployeeReference(String sourceBusinessUnitEmployeeReference) {
    this.sourceBusinessUnitEmployeeReference = sourceBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the source service or product for content if appropriate 
   * @return sourceProductServiceReference
  **/

  public String getSourceProductServiceReference() {
    return sourceProductServiceReference;
  }

  public void setSourceProductServiceReference(String sourceProductServiceReference) {
    this.sourceProductServiceReference = sourceProductServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the bank customer that is subject of the source content if appropriate 
   * @return sourceCustomerReference
  **/

  public String getSourceCustomerReference() {
    return sourceCustomerReference;
  }

  public void setSourceCustomerReference(String sourceCustomerReference) {
    this.sourceCustomerReference = sourceCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The possibly extensive collection of production transaction records assembled for reporting  
   * @return sourceTransactionRecords
  **/

  public String getSourceTransactionRecords() {
    return sourceTransactionRecords;
  }

  public void setSourceTransactionRecords(String sourceTransactionRecords) {
    this.sourceTransactionRecords = sourceTransactionRecords;
  }


}

