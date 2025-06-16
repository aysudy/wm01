# wm01
wm01
All Files
Recents
Notes
Canvas
Integrations
Synced
Trash
My Collections

Favorites

Drag items here for quick access

Get Box Drive
Search files and folders




9

All Files
API Control Plane - Kong and KongKonnect Gateway




New

Share
Type
NAME
UPDATED
SIZE



Sharing

Details
Aryell Hutagalung
Owner

Aysu Yanar
Editor


Siddharth Sethi
Editor


Sury Nagarajan
Editor


Nami Ono
Editor


+2 People

Shared Link
People in your company


File Request
Create Link

README.txt
API Control Plane - Kong and KongKonnect Gateway
·
Updated May 24, 2025 by Aryell Hutagalung

18


Box AI

Open


Share
README
------

1) Package name:
      {packageName}
2) Package type:
      webMethods Integration Server package
3) webMethods version 11.1
4) Package description:
      Agent (REST based) of webMethods API Control Plane for Kong (community) Gateway and Kong Konnect Gateway.
5) Orchestration reference:
      https://www.ibm.com/docs/en/wm-api-control-plane-saas/11.1.0?topic=approaches-rest-api-based-implementation
6) Orchestration reflected services:
	A) KongKonnect
       1. ipass.controlplane.agent.sequence.KongKonnect:S1_RegisterRuntime_KongKonnect
       2. ipass.controlplane.agent.sequence.KongKonnect:S2_PublishAssetsAPI_KongKonnect
       3. ipass.controlplane.agent.sequence.KongKonnect:S3_HeartbeatSync_KongKonnect
       4. ipass.controlplane.agent.sequence.KongKonnect:S4_MetricsSync_KongKonnect
       5. ipass.controlplane.agent.sequence.KongKonnect:S5_AssetsSync_KongKonnect
	B) Kong(community)
       1. ipass.controlplane.agent.sequence.Kong:S1_RegisterRuntime_Kong
       2. ipass.controlplane.agent.sequence.Kong:S2_PublishAssetsAPI_Kong
       3. ipass.controlplane.agent.sequence.Kong:S3_HeartbeatSync_Kong
       4. ipass.controlplane.agent.sequence.Kong:S4_MetricsSync_Kong
       5. ipass.controlplane.agent.sequence.Kong:S5_UpdateRtmAPIs_Kong
7) notes:
      - Wm ControlPlane tenant host (var name): ControlPlane_BaseUrl
            Sury tenant: https://presalesglobacpdev.apicp-az-eu.webmethods.io
      - no input required to run the services.
      - only one Runtime (runtimeId) per Kong type of gateway managed in the package variables.
      - to manage more than one Runtime (runtimeId) per Kong type of gateway, required code modification to use cache/persistent data store.
8) Run:
	1) Run #6.1 (6.A.1 | 6.B.1)
	2) Run #6.2 (6.A.2 | 6.B.2)
	3) Register scheduler KongKonnect:
		per interval := variale value of {ControlPlane_HeartBeatSynchIntervalSeconds}
		A) Hearthbeat
			ipass.controlplane.agent.scheduler.KongKonnect:SchedulerSync_S3_S5
		B) Metrics
			ipass.controlplane.agent.scheduler.KongKonnect:SchedulerSync_S4
	4) Register scheduler Kong (community):
		per interval := variale value of {ControlPlane_HeartBeatSynchIntervalSeconds}
		A) Hearthbeat
			ipass.controlplane.agent.scheduler.Kong:SchedulerSync_S3_S5
		B) Metrics
			ipass.controlplane.agent.scheduler.Kong:SchedulerSync_S4
9) Package self-contained:
      - Global Variables:
	      - ControlPlane_*
	      - KongKonnect_*
          - AgentScheduler_*
		  - Kong_*
10) Newly/latest Created Control Plane runtime id (global variable name):
		A) KongKonnect: ControlPlane_KongKonnectRuntimeId
		B) Kong (community): ControlPlane_KongRuntimeId
   Don't update the value of these var by manually.. it is used by the IS package.
11) Global Variables:
    A) KONG
    ------
       1. KongKonnect tenant Controlplane Id (var name): KongKonnect_ControlPlaneId
          Aysu tenant id: 4bda7e7f-610a-4215-8252-edddcd373f5e
       2. KongKonnect tenant TOken (var name): KongKonnect_Token
          Aysu tenant token: kpat_2wfYhLOhtxFK5quS7b5RtzRFY8gJKeUA9sZwD80ZTnf5eGpFB
       3. KongKonnect tenant location (var name): KongKonnect_Location
       4. KongKonnect time_range of analytics (var name): KongKonnect_kanalyticsTimeRange
         (valid Kong values: 15m, 1h, 6h, 12h, 24h, 7d, current_week, previous_week, 30d, current_month, previous_month)

    B) Wm ControlPlane
    -----------------
       1. Wm ControlPlane tenant host (var name): ControlPlane_BaseUrl
          Sury tenant: https://presalesglobacpdev.apicp-az-eu.webmethods.io
       2. Wm ControlPlane user (var name): ControlPlane_Username
       3. Wm ControlPlane pwd (var name): ControlPlane_Password
12) Kong (community) via Prometheus metrics doesn't provide:
	1. Latency information per group status code, ex: 2XX, 3XX, 4XX, and 5XX.
	2. Aggregation of transactions latency: thus this latence calculated on the IS services.





Send to Outlook
Share with Slack
Contribute to Lighthouse
Sync file to Lighthouse
Add (STAGING) Contribute to Lighthouse


