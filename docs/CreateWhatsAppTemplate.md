
# CreateWhatsAppTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the template | 
**language** | **String** | Language of the template. For Example : **en** for English  | 
**category** | [**CategoryEnum**](#CategoryEnum) | Category of the template | 
**mediaUrl** | **String** | Absolute url of the media file **(no local file)** for the header. **Use this field in you want to add media in Template header and headerText is empty.** Allowed extensions for media files are: #### jpeg | png | mp4 | pdf  |  [optional]
**bodyText** | **String** | Body of the template. **Maximum allowed characters are 1024** | 
**headerText** | **String** | Text content of the header in the template.  **Maximum allowed characters are 45** **Use this field to add text content in template header and if mediaUrl is empty**  |  [optional]
**source** | [**SourceEnum**](#SourceEnum) | source of the template |  [optional]


<a name="CategoryEnum"></a>
## Enum: CategoryEnum
Name | Value
---- | -----
MARKETING | &quot;MARKETING&quot;
UTILITY | &quot;UTILITY&quot;


<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
AUTOMATION | &quot;Automation&quot;
CONVERSATIONS | &quot;Conversations&quot;



