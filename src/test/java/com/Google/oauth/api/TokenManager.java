package com.Google.oauth.api;

import io.restassured.response.Response;

import java.util.HashMap;

import static com.Google.oauth.api.SpecBuilder.getresponsespec;
import static io.restassured.RestAssured.given;

public class TokenManager {
public static String renewtoken(){

    HashMap<String,String> parameter = new HashMap<String,String>();
    parameter.put("client_id","777676425405-0gp9ctq2vo8h9sfcej1lv9kd74cldomf.apps.googleusercontent.com");
    parameter.put("client_secret","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");
    parameter.put("grant_type","refresh_token");
    parameter.put("refresh_token","1//038cDbC9uN0lzCgYIARAAGAMSNwF-L9IrqGZ5Al-FrXstQWDaKkNeb3sJcuQ84oGCsIVdPKftlFkuEvhBNDF6VYUYjwItf8uozVc");

  Response response = given().
            baseUri("https://oauth2.googleapis.com").
                   formParams(parameter).
            when().post("/token").
            then().
                   spec(getresponsespec()).
                   extract().
                   response();
    if (response.statusCode() !=200){

        throw new RuntimeException(" !!! renew token failed");
    }
    return response.path("access_token");

}
}
