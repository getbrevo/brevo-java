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
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Body10
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class Body10 {
  @SerializedName("name")
  private String name = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("taskTypeId")
  private String taskTypeId = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("done")
  private Boolean done = null;

  @SerializedName("assignToId")
  private String assignToId = null;

  @SerializedName("contactsIds")
  private List<Integer> contactsIds = null;

  @SerializedName("dealsIds")
  private List<String> dealsIds = null;

  @SerializedName("companiesIds")
  private List<String> companiesIds = null;

  public Body10 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of task
   * @return name
  **/
  @ApiModelProperty(example = "Task: Connect with client", value = "Name of task")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body10 duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of task in milliseconds [1 minute &#x3D; 60000 ms]
   * @return duration
  **/
  @ApiModelProperty(example = "600000", value = "Duration of task in milliseconds [1 minute = 60000 ms]")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Body10 taskTypeId(String taskTypeId) {
    this.taskTypeId = taskTypeId;
    return this;
  }

   /**
   * Id for type of task e.g Call / Email / Meeting etc.
   * @return taskTypeId
  **/
  @ApiModelProperty(example = "61a5cd07ca1347c82306ad09", value = "Id for type of task e.g Call / Email / Meeting etc.")
  public String getTaskTypeId() {
    return taskTypeId;
  }

  public void setTaskTypeId(String taskTypeId) {
    this.taskTypeId = taskTypeId;
  }

  public Body10 date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Task date/time
   * @return date
  **/
  @ApiModelProperty(example = "2021-11-01T17:44:54.668Z", value = "Task date/time")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Body10 notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes added to a task
   * @return notes
  **/
  @ApiModelProperty(example = "In communication with client for resolution of queries.", value = "Notes added to a task")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Body10 done(Boolean done) {
    this.done = done;
    return this;
  }

   /**
   * Task marked as done
   * @return done
  **/
  @ApiModelProperty(example = "false", value = "Task marked as done")
  public Boolean isDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

  public Body10 assignToId(String assignToId) {
    this.assignToId = assignToId;
    return this;
  }

   /**
   * To assign a task to a user you can use either the account email or ID.
   * @return assignToId
  **/
  @ApiModelProperty(example = "5faab4b7f195bb3c4c31e62a", value = "To assign a task to a user you can use either the account email or ID.")
  public String getAssignToId() {
    return assignToId;
  }

  public void setAssignToId(String assignToId) {
    this.assignToId = assignToId;
  }

  public Body10 contactsIds(List<Integer> contactsIds) {
    this.contactsIds = contactsIds;
    return this;
  }

  public Body10 addContactsIdsItem(Integer contactsIdsItem) {
    if (this.contactsIds == null) {
      this.contactsIds = new ArrayList<Integer>();
    }
    this.contactsIds.add(contactsIdsItem);
    return this;
  }

   /**
   * Contact ids for contacts linked to this task
   * @return contactsIds
  **/
  @ApiModelProperty(example = "[1,2,3]", value = "Contact ids for contacts linked to this task")
  public List<Integer> getContactsIds() {
    return contactsIds;
  }

  public void setContactsIds(List<Integer> contactsIds) {
    this.contactsIds = contactsIds;
  }

  public Body10 dealsIds(List<String> dealsIds) {
    this.dealsIds = dealsIds;
    return this;
  }

  public Body10 addDealsIdsItem(String dealsIdsItem) {
    if (this.dealsIds == null) {
      this.dealsIds = new ArrayList<String>();
    }
    this.dealsIds.add(dealsIdsItem);
    return this;
  }

   /**
   * Deal ids for deals a task is linked to
   * @return dealsIds
  **/
  @ApiModelProperty(example = "[\"61a5ce58c5d4795761045990\",\"61a5ce58c5d4795761045991\",\"61a5ce58c5d4795761045992\"]", value = "Deal ids for deals a task is linked to")
  public List<String> getDealsIds() {
    return dealsIds;
  }

  public void setDealsIds(List<String> dealsIds) {
    this.dealsIds = dealsIds;
  }

  public Body10 companiesIds(List<String> companiesIds) {
    this.companiesIds = companiesIds;
    return this;
  }

  public Body10 addCompaniesIdsItem(String companiesIdsItem) {
    if (this.companiesIds == null) {
      this.companiesIds = new ArrayList<String>();
    }
    this.companiesIds.add(companiesIdsItem);
    return this;
  }

   /**
   * Companies ids for companies a task is linked to
   * @return companiesIds
  **/
  @ApiModelProperty(example = "[\"61a5ce58c5d4795761045990\",\"61a5ce58c5d4795761045991\",\"61a5ce58c5d4795761045992\"]", value = "Companies ids for companies a task is linked to")
  public List<String> getCompaniesIds() {
    return companiesIds;
  }

  public void setCompaniesIds(List<String> companiesIds) {
    this.companiesIds = companiesIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Body10 body10 = (Body10) o;
    return ObjectUtils.equals(this.name, body10.name) &&
    ObjectUtils.equals(this.duration, body10.duration) &&
    ObjectUtils.equals(this.taskTypeId, body10.taskTypeId) &&
    ObjectUtils.equals(this.date, body10.date) &&
    ObjectUtils.equals(this.notes, body10.notes) &&
    ObjectUtils.equals(this.done, body10.done) &&
    ObjectUtils.equals(this.assignToId, body10.assignToId) &&
    ObjectUtils.equals(this.contactsIds, body10.contactsIds) &&
    ObjectUtils.equals(this.dealsIds, body10.dealsIds) &&
    ObjectUtils.equals(this.companiesIds, body10.companiesIds);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, duration, taskTypeId, date, notes, done, assignToId, contactsIds, dealsIds, companiesIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body10 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    taskTypeId: ").append(toIndentedString(taskTypeId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    assignToId: ").append(toIndentedString(assignToId)).append("\n");
    sb.append("    contactsIds: ").append(toIndentedString(contactsIds)).append("\n");
    sb.append("    dealsIds: ").append(toIndentedString(dealsIds)).append("\n");
    sb.append("    companiesIds: ").append(toIndentedString(companiesIds)).append("\n");
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

