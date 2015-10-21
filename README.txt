How to test this OAuth2 Service
-------------------------------

1. Open RestClient in FireFox or Chrome

2. Enter following URL in request URL box:
	http://localhost:8080/spring-oauth2-poc/public/login?email=e&password=p
	(This is to test whether public APIs are working fine or not)

3. You will get following response:
	{"userId":"sampleUserId","securityKey":"secretKey","clientId":"sampleClientId","clientSecret":"clientSecretKey"}

4. Then open another RestClient tab

5. Enter following URL to get OAuth2 Access Token:
	http://localhost:7080/spring-oauth2-poc/oauth/token?grant_type=password&scope=read write&username=sampleUserId&password=secretKey&clientId=sampleClientId&client_secret=clientSecretKey
	Param info:
		grant_type=password
		scope=read write
		username=sampleUserId
		password=secretKey
		clientId=sampleClientId
		client_secret=clientSecretKey

6. When you run, you will get following response (sample):
	{"access_token":"fc5bb50a-5f25-4b45-b2b7-b7196e2062db","token_type":"bearer","refresh_token":"cb3f6c77-6607-4372-90f4-0554b366b342","expires_in":43199,"scope":"read write"}
	
7. Now you can access private APIs using access_token.

8. Open another RestClient tab.

9. Enter this URL:
	http://localhost:7080/spring-oauth2-poc/private/profile?userId=1
	
	You need to enter HEADER information in http request. Following is HEADER for OAuth2.
		Authorization : Bearer fc5bb50a-5f25-4b45-b2b7-b7196e2062db
	In the above header, the header name is 'Authorization' and value is 'Bearer fc5bb50a-5f25-4b45-b2b7-b7196e2062db'.
	'fc5bb50a-5f25-4b45-b2b7-b7196e2062db' is the access_token returned by OAuth2 "/oauth/token" URL.

10. Now you run this request and you will get following response :
	{"userId":"dummyUserId","name":"dummyName","password":null,"dateOfBirth":1442201975029,"clientId":null,"clientSecret":null}

**MY TOMCAT WAS RUNNING ON 'LOCALHOST' WITH PORT '7080'.
	

	