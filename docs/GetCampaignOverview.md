
# GetCampaignOverview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID of the campaign | 
**name** | **String** | Name of the campaign | 
**subject** | **String** | Subject of the campaign. Only available if &#x60;abTesting&#x60; flag of the campaign is &#x60;false&#x60; |  [optional]
**previewText** | **String** | Preview text or preheader of the email campaign |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of campaign | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the campaign | 
**scheduledAt** | **String** | UTC date-time on which campaign is scheduled (YYYY-MM-DDTHH:mm:ss.SSSZ) |  [optional]
**abTesting** | **Boolean** | Status of A/B Test for the campaign. abTesting &#x3D; false means it is disabled, &amp; abTesting &#x3D; true means it is enabled. |  [optional]
**subjectA** | **String** | Subject A of the ab-test campaign. Only available if &#x60;abTesting&#x60; flag of the campaign is &#x60;true&#x60; |  [optional]
**subjectB** | **String** | Subject B of the ab-test campaign. Only available if &#x60;abTesting&#x60; flag of the campaign is &#x60;true&#x60; |  [optional]
**splitRule** | **Integer** | The size of your ab-test groups. Only available if &#x60;abTesting&#x60; flag of the campaign is &#x60;true&#x60; |  [optional]
**winnerCriteria** | **String** | Criteria for the winning version. Only available if &#x60;abTesting&#x60; flag of the campaign is &#x60;true&#x60; |  [optional]
**winnerDelay** | **Integer** | The duration of the test in hours at the end of which the winning version will be sent. Only available if &#x60;abTesting&#x60; flag of the campaign is &#x60;true&#x60; |  [optional]
**sendAtBestTime** | **Boolean** | It is true if you have chosen to send your campaign at best time, otherwise it is false |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CLASSIC | &quot;classic&quot;
TRIGGER | &quot;trigger&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DRAFT | &quot;draft&quot;
SENT | &quot;sent&quot;
ARCHIVE | &quot;archive&quot;
QUEUED | &quot;queued&quot;
SUSPENDED | &quot;suspended&quot;
IN_PROCESS | &quot;in_process&quot;



