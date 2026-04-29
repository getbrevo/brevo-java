
# SendTransacSms

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationPrefix** | **String** | A recognizable prefix will ensure your audience knows who you are. Recommended by U.S. carriers. This will be added as your Brand Name before the message content. **Prefer verifying maximum length of 160 characters including this prefix in message content to avoid multiple sending of same sms.** |  [optional]
**recipient** | **String** | Mobile number to send SMS with the country code |
**sender** | **String** | Name of the sender. **The number of characters is limited to 11 for alphanumeric characters and 15 for numeric characters**  |
**tag** | **String** | Tag of the message. Can be a string or an array of strings (e.g., &quot;accountValidation&quot; or [&quot;tag1&quot;, &quot;tag2&quot;]). |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the SMS. Marketing SMS messages are those sent typically with marketing content. Transactional SMS messages are sent to individuals and are triggered in response to some action, such as a sign-up, purchase, etc. |  [optional]
**unicodeEnabled** | **Boolean** | Format of the message. It indicates whether the content should be treated as unicode or not.  |  [optional]
**webUrl** | **String** | Webhook to call for each event triggered by the message (delivered etc.) |  [optional]
**templateId** | **Integer** | Template ID to send SMS with the template. When provided, overrides the content parameter. Either &#39;templateId&#39; or &#39;content&#39; must be provided, but not both. |  [optional]
**content** | **String** | Content of the message. If more than **160 characters** long, will be sent as multiple text messages. Either &#39;templateId&#39; or &#39;content&#39; must be provided, but not both. Mandatory if &#39;templateId&#39; is not passed, ignored if &#39;templateId&#39; is passed.  |  [optional]
**params** | **Map&lt;String, Object&gt;** | Pass the set of attributes to customize the template. For example, {&quot;FNAME&quot;:&quot;Joe&quot;, &quot;LNAME&quot;:&quot;Doe&quot;}. These are the placeholder variables in the template that will be replaced with the corresponding values passed in the params object. Applicable only if &#x60;templateId&#x60; is used. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRANSACTIONAL | &quot;transactional&quot;
MARKETING | &quot;marketing&quot;



