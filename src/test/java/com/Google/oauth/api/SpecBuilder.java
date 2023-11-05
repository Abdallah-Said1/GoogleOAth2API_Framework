package com.Google.oauth.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder {



    public  static RequestSpecification getrequestspec(){

     return new RequestSpecBuilder().
                setBaseUri("https://gmail.googleapis.com").

                setContentType(ContentType.JSON).
                log(LogDetail.ALL).build();

    }


    public static ResponseSpecification getresponsespec(){

        return new ResponseSpecBuilder().
                log(LogDetail.ALL)
                .build();


    }


}
