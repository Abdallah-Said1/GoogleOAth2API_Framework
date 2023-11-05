package com.Google.oauth.tests;

import com.Google.oauth.pojo.ErrorRoot;
import com.Google.oauth.pojo.ProfileUser;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.util.Base64;
import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Epic("Google Oauth 2.0")
@Feature("GmailApi Test")
public class GmailApi {

    @Description("Get user profile information ")
    @Test
    public void UserProfile(){

          Response response = com.Google.oauth.applicationapi.GmailApi.Get();
          assertThat(response.statusCode(),equalTo(200));
          ProfileUser responseProfileUser = response.as(ProfileUser.class);
          assertThat(responseProfileUser.getEmailAddress(),equalTo("abdallahsaid7422@gmail.com"));

    }
    @Description("Send Message from Resource owner to client  ")
    @Test
    public void UserSendMessage(){


         String msg="From: abdallahsaid7422@gmail.com\n" +
                 "To: abdallahsaid@gmail.com\n" +
                 "Subject:  Rest assured Test Email\n" +
                 "\n" +
                 "Hello My Friend I Send Message From RestAssured";

         String base64 = Base64.getUrlEncoder().encodeToString(msg.getBytes());

         HashMap<String,String> payload = new HashMap<>();
         payload.put("raw",base64);

         Response response = com.Google.oauth.applicationapi.GmailApi.post(payload);
         assertThat(response.statusCode(),equalTo(200));


    }

    // negative scenario
    @Test
    public void UserProfileWithExpiredToken (){
    String invalid_token="123";

        Response response = com.Google.oauth.applicationapi.GmailApi.Get(invalid_token);
        assertThat(response.statusCode(),equalTo(401));
        ErrorRoot errorrr = response.as(ErrorRoot.class);

        assertThat(errorrr.getError().getCode(),equalTo(401));
        assertThat(errorrr.getError().getStatus(),equalTo("UNAUTHENTICATED"));


    }









}
