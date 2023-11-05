package com.Google.oauth.api;


import io.restassured.response.Response;

import java.util.HashMap;

import static com.Google.oauth.api.SpecBuilder.getrequestspec;
import static com.Google.oauth.api.SpecBuilder.getresponsespec;
import static io.restassured.RestAssured.given;


public class RestResource {

    public static Response Get(String path,String accesstoken){
        return given().spec(getrequestspec()).
                basePath("/gmail/v1").
                header("Authorization","Bearer " + accesstoken).
                when().
                get(path).
                then().
                spec(getresponsespec()).
                extract().response();


    }


    public static Response post(String path ,HashMap payload,String acctoken){
         return  given().spec(getrequestspec()).
                basePath("/gmail/v1").
                 header("Authorization","Bearer " + acctoken).
                body(payload).
                when().
                post(path).
                then().
                spec(getresponsespec()).extract().response();
    }

}
