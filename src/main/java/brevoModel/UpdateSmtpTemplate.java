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
 * UpdateSmtpTemplate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class UpdateSmtpTemplate {
  @SerializedName("tag")
  private String tag = null;

  @SerializedName("sender")
  private UpdateSmtpTemplateSender sender = null;

  @SerializedName("templateName")
  private String templateName = null;

  @SerializedName("htmlContent")
  private String htmlContent = null;

  @SerializedName("htmlUrl")
  private String htmlUrl = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("replyTo")
  private String replyTo = null;

  @SerializedName("toField")
  private String toField = null;

  @SerializedName("attachmentUrl")
  private String attachmentUrl = null;

  @SerializedName("isActive")
  private Boolean isActive = null;

  public UpdateSmtpTemplate tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tag of the template
   * @return tag
  **/
  @ApiModelProperty(example = "OrderConfirmation", value = "Tag of the template")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public UpdateSmtpTemplate sender(UpdateSmtpTemplateSender sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")
  public UpdateSmtpTemplateSender getSender() {
    return sender;
  }

  public void setSender(UpdateSmtpTemplateSender sender) {
    this.sender = sender;
  }

  public UpdateSmtpTemplate templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Name of the template
   * @return templateName
  **/
  @ApiModelProperty(example = "Order Confirmation - EN", value = "Name of the template")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public UpdateSmtpTemplate htmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

   /**
   * Required if htmlUrl is empty. If the template is designed using Drag &amp; Drop editor via HTML content, then the design page will not have Drag &amp; Drop editor access for that template. Body of the message (HTML must have more than 10 characters)
   * @return htmlContent
  **/
  @ApiModelProperty(example = "The order n°xxxxx has been confirmed. Thanks for your purchase", value = "Required if htmlUrl is empty. If the template is designed using Drag & Drop editor via HTML content, then the design page will not have Drag & Drop editor access for that template. Body of the message (HTML must have more than 10 characters)")
  public String getHtmlContent() {
    return htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public UpdateSmtpTemplate htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Required if htmlContent is empty. URL to the body of the email (HTML)
   * @return htmlUrl
  **/
  @ApiModelProperty(example = "https://html.domain.com", value = "Required if htmlContent is empty. URL to the body of the email (HTML)")
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public UpdateSmtpTemplate subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the email
   * @return subject
  **/
  @ApiModelProperty(example = "Thanks for your purchase !", value = "Subject of the email")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public UpdateSmtpTemplate replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Email on which campaign recipients will be able to reply to
   * @return replyTo
  **/
  @ApiModelProperty(example = "support@myshop.com", value = "Email on which campaign recipients will be able to reply to")
  public String getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }

  public UpdateSmtpTemplate toField(String toField) {
    this.toField = toField;
    return this;
  }

   /**
   * To personalize the «To» Field. If you want to include the first name and last name of your recipient, add {FNAME} {LNAME}. These contact attributes must already exist in your Brevo account. If input parameter &#39;params&#39; used please use {{contact.FNAME}} {{contact.LNAME}} for personalization
   * @return toField
  **/
  @ApiModelProperty(example = "{FNAME} {LNAME}", value = "To personalize the «To» Field. If you want to include the first name and last name of your recipient, add {FNAME} {LNAME}. These contact attributes must already exist in your Brevo account. If input parameter 'params' used please use {{contact.FNAME}} {{contact.LNAME}} for personalization")
  public String getToField() {
    return toField;
  }

  public void setToField(String toField) {
    this.toField = toField;
  }

  public UpdateSmtpTemplate attachmentUrl(String attachmentUrl) {
    this.attachmentUrl = attachmentUrl;
    return this;
  }

   /**
   * Absolute url of the attachment (no local file). Extension allowed: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps
   * @return attachmentUrl
  **/
  @ApiModelProperty(example = "https://attachment.domain.com", value = "Absolute url of the attachment (no local file). Extension allowed: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps")
  public String getAttachmentUrl() {
    return attachmentUrl;
  }

  public void setAttachmentUrl(String attachmentUrl) {
    this.attachmentUrl = attachmentUrl;
  }

  public UpdateSmtpTemplate isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Status of the template. isActive &#x3D; false means template is inactive, isActive &#x3D; true means template is active
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "Status of the template. isActive = false means template is inactive, isActive = true means template is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    UpdateSmtpTemplate updateSmtpTemplate = (UpdateSmtpTemplate) o;
    return ObjectUtils.equals(this.tag, updateSmtpTemplate.tag) &&
    ObjectUtils.equals(this.sender, updateSmtpTemplate.sender) &&
    ObjectUtils.equals(this.templateName, updateSmtpTemplate.templateName) &&
    ObjectUtils.equals(this.htmlContent, updateSmtpTemplate.htmlContent) &&
    ObjectUtils.equals(this.htmlUrl, updateSmtpTemplate.htmlUrl) &&
    ObjectUtils.equals(this.subject, updateSmtpTemplate.subject) &&
    ObjectUtils.equals(this.replyTo, updateSmtpTemplate.replyTo) &&
    ObjectUtils.equals(this.toField, updateSmtpTemplate.toField) &&
    ObjectUtils.equals(this.attachmentUrl, updateSmtpTemplate.attachmentUrl) &&
    ObjectUtils.equals(this.isActive, updateSmtpTemplate.isActive);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(tag, sender, templateName, htmlContent, htmlUrl, subject, replyTo, toField, attachmentUrl, isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSmtpTemplate {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    toField: ").append(toIndentedString(toField)).append("\n");
    sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

