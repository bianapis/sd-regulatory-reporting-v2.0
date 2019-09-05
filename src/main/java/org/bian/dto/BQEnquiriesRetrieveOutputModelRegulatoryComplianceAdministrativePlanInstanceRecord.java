package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEnquiriesRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord
 */
public class BQEnquiriesRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord   {
  private String regulatoryAuthorityReference = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EwKVZcTGEeChad0JzLk7QA_1558299460  bian-reference: RegulatoryComplianceCheckInvolvement (as RegulatoryAuthority)  general-info: Reference to the interested regulatory reporting authority 
   * @return regulatoryAuthorityReference
  **/

  public String getRegulatoryAuthorityReference() {
    return regulatoryAuthorityReference;
  }

  public void setRegulatoryAuthorityReference(String regulatoryAuthorityReference) {
    this.regulatoryAuthorityReference = regulatoryAuthorityReference;
  }


}

