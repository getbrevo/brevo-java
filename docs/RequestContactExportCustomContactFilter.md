
# RequestContactExportCustomContactFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionForContacts** | [**ActionForContactsEnum**](#ActionForContactsEnum) | Mandatory if neither actionForEmailCampaigns nor actionForSmsCampaigns is passed. This will export the contacts on the basis of the provided action, restricted to the contacts selected by the other filters below. * allContacts - Fetch all the selected contacts. * subscribed &amp; unsubscribed - Fetch the subscribed / unsubscribed (blacklisted via any means) contacts among the selected contacts. * unsubscribedPerList - Fetch the contacts that are unsubscribed from the given listId only; this action requires listId. The selection must be narrowed by at least one of listId, segmentId, modifiedSince or createdSince. Any of them can be combined with the action, so for example unsubscribed together with modifiedSince exports the contacts that are currently blocklisted and were modified after the given date-time, with no list or segment involved.  |  [optional]
**actionForEmailCampaigns** | [**ActionForEmailCampaignsEnum**](#ActionForEmailCampaignsEnum) | Mandatory if neither actionForContacts nor actionForSmsCampaigns is passed. This will export the contacts on the basis of provided action applied on email campaigns. * openers &amp; nonOpeners - emailCampaignId is mandatory. Fetch the list of readers / non-readers for a particular email campaign. * clickers &amp; nonClickers - emailCampaignId is mandatory. Fetch the list of clickers / non-clickers for a particular email campaign. * unsubscribed - emailCampaignId is mandatory. Fetch the list of all unsubscribed (blacklisted via any means) contacts for a particular email campaign. * hardBounces &amp; softBounces - emailCampaignId is optional. Fetch the list of hard bounces / soft bounces for a particular / all email campaign(s).  |  [optional]
**actionForSmsCampaigns** | [**ActionForSmsCampaignsEnum**](#ActionForSmsCampaignsEnum) | Mandatory if neither actionForContacts nor actionForEmailCampaigns is passed. This will export the contacts on the basis of provided action applied on sms campaigns. * unsubscribed - Fetch the list of all unsubscribed (blacklisted via any means) contacts for all / particular sms campaigns. * hardBounces &amp; softBounces - Fetch the list of hard bounces / soft bounces for all / particular sms campaigns.  |  [optional]
**listId** | **Long** | ID of the list. Considered only if actionForContacts is passed. At least one of listId, segmentId, modifiedSince or createdSince must be provided; listId and segmentId cannot be used together. |  [optional]
**segmentId** | **Long** | ID of the segment. Considered only if actionForContacts is passed. At least one of listId, segmentId, modifiedSince or createdSince must be provided; listId and segmentId cannot be used together. |  [optional]
**emailCampaignId** | **Long** | Considered only if actionForEmailCampaigns is passed, ignored otherwise. Mandatory if action is one of the following - openers, nonOpeners, clickers, nonClickers, unsubscribed. The id of the email campaign for which the corresponding action shall be applied in the filter. |  [optional]
**smsCampaignId** | **Long** | Considered only if actionForSmsCampaigns is passed, ignored otherwise. The id of sms campaign for which the corresponding action shall be applied in the filter. |  [optional]
**createdSince** | [**OffsetDateTime**] | Considered only if actionForContacts is passed, ignored otherwise. Exports only the contacts created after the given date-time. The value must be a full RFC 3339 date-time: a date-only value such as 2026-10-01 is rejected, and so is a value without a timezone, so pass either the Z suffix or an explicit +HH:MM offset. |  [optional]
**modifiedSince** | [**OffsetDateTime**] | Considered only if actionForContacts is passed, ignored otherwise. Exports only the contacts modified after the given date-time. The value must be a full RFC 3339 date-time: a date-only value such as 2026-10-01 is rejected, and so is a value without a timezone, so pass either the Z suffix or an explicit +HH:MM offset. Note that a contact's modification date changes on any update, not only on a subscription change. |  [optional]


<a name="ActionForContactsEnum"></a>
## Enum: ActionForContactsEnum
Name | Value
---- | -----
ALLCONTACTS | &quot;allContacts&quot;
SUBSCRIBED | &quot;subscribed&quot;
UNSUBSCRIBED | &quot;unsubscribed&quot;
UNSUBSCRIBEDPERLIST | &quot;unsubscribedPerList&quot;


<a name="ActionForEmailCampaignsEnum"></a>
## Enum: ActionForEmailCampaignsEnum
Name | Value
---- | -----
OPENERS | &quot;openers&quot;
NONOPENERS | &quot;nonOpeners&quot;
CLICKERS | &quot;clickers&quot;
NONCLICKERS | &quot;nonClickers&quot;
UNSUBSCRIBED | &quot;unsubscribed&quot;
HARDBOUNCES | &quot;hardBounces&quot;
SOFTBOUNCES | &quot;softBounces&quot;


<a name="ActionForSmsCampaignsEnum"></a>
## Enum: ActionForSmsCampaignsEnum
Name | Value
---- | -----
HARDBOUNCES | &quot;hardBounces&quot;
SOFTBOUNCES | &quot;softBounces&quot;
UNSUBSCRIBED | &quot;unsubscribed&quot;



