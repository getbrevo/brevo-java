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
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import java.io.IOException;

/**
 * CreateWhatsAppTemplate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class CreateWhatsAppTemplate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("language")
  private String language = null;

  /**
   * Category of the template
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    MARKETING("MARKETING"),
    
    UTILITY("UTILITY");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("mediaUrl")
  private String mediaUrl = null;

  @SerializedName("bodyText")
  private String bodyText = null;

  @SerializedName("headerText")
  private String headerText = null;

  /**
   * source of the template
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    AUTOMATION("Automation"),
    
    CONVERSATIONS("Conversations");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("source")
  private SourceEnum source = null;

  public CreateWhatsAppTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the template
   * @return name
  **/
  @ApiModelProperty(example = "Test template", required = true, value = "Name of the template")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateWhatsAppTemplate language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language of the template. For Example : **en** for English 
   * @return language
  **/
  @ApiModelProperty(example = "en", required = true, value = "Language of the template. For Example : **en** for English ")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CreateWhatsAppTemplate category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Category of the template
   * @return category
  **/
  @ApiModelProperty(example = "MARKETING", required = true, value = "Category of the template")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public CreateWhatsAppTemplate mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * Absolute url of the media file **(no local file)** for the header. **Use this field in you want to add media in Template header and headerText is empty.** Allowed extensions for media files are: #### jpeg | png | mp4 | pdf 
   * @return mediaUrl
  **/
  @ApiModelProperty(example = "https://attachment.domain.com", value = "Absolute url of the media file **(no local file)** for the header. **Use this field in you want to add media in Template header and headerText is empty.** Allowed extensions for media files are: #### jpeg | png | mp4 | pdf ")
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public CreateWhatsAppTemplate bodyText(String bodyText) {
    this.bodyText = bodyText;
    return this;
  }

   /**
   * Body of the template. **Maximum allowed characters are 1024**
   * @return bodyText
  **/
  @ApiModelProperty(example = "making it look like readable English", required = true, value = "Body of the template. **Maximum allowed characters are 1024**")
  public String getBodyText() {
    return bodyText;
  }

  public void setBodyText(String bodyText) {
    this.bodyText = bodyText;
  }

  public CreateWhatsAppTemplate headerText(String headerText) {
    this.headerText = headerText;
    return this;
  }

   /**
   * Text content of the header in the template.  **Maximum allowed characters are 45** **Use this field to add text content in template header and if mediaUrl is empty** 
   * @return headerText
  **/
  @ApiModelProperty(example = "Test WhatsApp Campaign", value = "Text content of the header in the template.  **Maximum allowed characters are 45** **Use this field to add text content in template header and if mediaUrl is empty** ")
  public String getHeaderText() {
    return headerText;
  }

  public void setHeaderText(String headerText) {
    this.headerText = headerText;
  }

  public CreateWhatsAppTemplate source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * source of the template
   * @return source
  **/
  @ApiModelProperty(value = "source of the template")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CreateWhatsAppTemplate createWhatsAppTemplate = (CreateWhatsAppTemplate) o;
    return ObjectUtils.equals(this.name, createWhatsAppTemplate.name) &&
    ObjectUtils.equals(this.language, createWhatsAppTemplate.language) &&
    ObjectUtils.equals(this.category, createWhatsAppTemplate.category) &&
    ObjectUtils.equals(this.mediaUrl, createWhatsAppTemplate.mediaUrl) &&
    ObjectUtils.equals(this.bodyText, createWhatsAppTemplate.bodyText) &&
    ObjectUtils.equals(this.headerText, createWhatsAppTemplate.headerText) &&
    ObjectUtils.equals(this.source, createWhatsAppTemplate.source);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, language, category, mediaUrl, bodyText, headerText, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWhatsAppTemplate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
    sb.append("    headerText: ").append(toIndentedString(headerText)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

