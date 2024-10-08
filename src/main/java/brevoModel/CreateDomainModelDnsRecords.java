/*
 * Brevo API
 * Brevo provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/brevo  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  |
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@brevo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package brevoModel;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

/**
 * CreateDomainModelDnsRecords
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class CreateDomainModelDnsRecords {
  @SerializedName("dkim_record")
  private CreateDomainModelDnsRecordsDkimRecord dkimRecord = null;

  @SerializedName("brevo_code")
  private CreateDomainModelDnsRecordsDkimRecord brevoCode = null;

  @SerializedName("dmarc_record")
  private CreateDomainModelDnsRecordsDkimRecord dmarcRecord = null;

  public CreateDomainModelDnsRecords dkimRecord(CreateDomainModelDnsRecordsDkimRecord dkimRecord) {
    this.dkimRecord = dkimRecord;
    return this;
  }

   /**
   * Get dkimRecord
   * @return dkimRecord
  **/
  @ApiModelProperty(value = "")
  public CreateDomainModelDnsRecordsDkimRecord getDkimRecord() {
    return dkimRecord;
  }

  public void setDkimRecord(CreateDomainModelDnsRecordsDkimRecord dkimRecord) {
    this.dkimRecord = dkimRecord;
  }

  public CreateDomainModelDnsRecords brevoCode(CreateDomainModelDnsRecordsDkimRecord brevoCode) {
    this.brevoCode = brevoCode;
    return this;
  }

   /**
   * Get brevoCode
   * @return brevoCode
  **/
  @ApiModelProperty(value = "")
  public CreateDomainModelDnsRecordsDkimRecord getBrevoCode() {
    return brevoCode;
  }

  public void setBrevoCode(CreateDomainModelDnsRecordsDkimRecord brevoCode) {
    this.brevoCode = brevoCode;
  }

  public CreateDomainModelDnsRecords dmarcRecord(CreateDomainModelDnsRecordsDkimRecord dmarcRecord) {
    this.dmarcRecord = dmarcRecord;
    return this;
  }

   /**
   * Get dmarcRecord
   * @return dmarcRecord
  **/
  @ApiModelProperty(value = "")
  public CreateDomainModelDnsRecordsDkimRecord getDmarcRecord() {
    return dmarcRecord;
  }

  public void setDmarcRecord(CreateDomainModelDnsRecordsDkimRecord dmarcRecord) {
    this.dmarcRecord = dmarcRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CreateDomainModelDnsRecords createDomainModelDnsRecords = (CreateDomainModelDnsRecords) o;
    return ObjectUtils.equals(this.dkimRecord, createDomainModelDnsRecords.dkimRecord) &&
    ObjectUtils.equals(this.brevoCode, createDomainModelDnsRecords.brevoCode) &&
    ObjectUtils.equals(this.dmarcRecord, createDomainModelDnsRecords.dmarcRecord);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(dkimRecord, brevoCode, dmarcRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDomainModelDnsRecords {\n");
    
    sb.append("    dkimRecord: ").append(toIndentedString(dkimRecord)).append("\n");
    sb.append("    brevoCode: ").append(toIndentedString(brevoCode)).append("\n");
    sb.append("    dmarcRecord: ").append(toIndentedString(dmarcRecord)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

