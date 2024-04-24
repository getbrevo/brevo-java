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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import java.io.IOException;

/**
 * Optional. Use this object if you want to let Brevo send an email to the contact, with the payment request URL. If empty, no notifications (message and reminders) will be sent. 
 */
@ApiModel(description = "Optional. Use this object if you want to let Brevo send an email to the contact, with the payment request URL. If empty, no notifications (message and reminders) will be sent. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class Notification {
  /**
   * Channel used to send the notifications. 
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    EMAIL("email");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String text) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChannelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("channel")
  private ChannelEnum channel = null;

  @SerializedName("text")
  private String text = null;

  public Notification channel(ChannelEnum channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Channel used to send the notifications. 
   * @return channel
  **/
  @ApiModelProperty(example = "email", required = true, value = "Channel used to send the notifications. ")
  public ChannelEnum getChannel() {
    return channel;
  }

  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }

  public Notification text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Use this field if you want to give more context to your contact about the payment request. 
   * @return text
  **/
  @ApiModelProperty(example = "Please pay for your yoga class.", required = true, value = "Use this field if you want to give more context to your contact about the payment request. ")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Notification notification = (Notification) o;
    return ObjectUtils.equals(this.channel, notification.channel) &&
    ObjectUtils.equals(this.text, notification.text);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(channel, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

