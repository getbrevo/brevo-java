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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * List of stages
 */
@ApiModel(description = "List of stages")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class Pipeline {
  @SerializedName("pipeline")
  private String pipeline = null;

  @SerializedName("pipeline_name")
  private String pipelineName = null;

  @SerializedName("stages")
  private List<PipelineStage> stages = null;

  public Pipeline pipeline(String pipeline) {
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Pipeline id
   * @return pipeline
  **/
  @ApiModelProperty(example = "5ea675e3da0dd085acaea610", value = "Pipeline id")
  public String getPipeline() {
    return pipeline;
  }

  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }

  public Pipeline pipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
    return this;
  }

   /**
   * Pipeline Name
   * @return pipelineName
  **/
  @ApiModelProperty(example = "Sales Pipeline", value = "Pipeline Name")
  public String getPipelineName() {
    return pipelineName;
  }

  public void setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
  }

  public Pipeline stages(List<PipelineStage> stages) {
    this.stages = stages;
    return this;
  }

  public Pipeline addStagesItem(PipelineStage stagesItem) {
    if (this.stages == null) {
      this.stages = new ArrayList<PipelineStage>();
    }
    this.stages.add(stagesItem);
    return this;
  }

   /**
   * List of stages
   * @return stages
  **/
  @ApiModelProperty(value = "List of stages")
  public List<PipelineStage> getStages() {
    return stages;
  }

  public void setStages(List<PipelineStage> stages) {
    this.stages = stages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Pipeline pipeline = (Pipeline) o;
    return ObjectUtils.equals(this.pipeline, pipeline.pipeline) &&
    ObjectUtils.equals(this.pipelineName, pipeline.pipelineName) &&
    ObjectUtils.equals(this.stages, pipeline.stages);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(pipeline, pipelineName, stages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pipeline {\n");
    
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
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

