package com.Google.oauth.applicationapi;


import com.Google.oauth.api.RestResource;
import io.restassured.response.Response;

import java.util.HashMap;

import static com.Google.oauth.api.TokenManager.renewtoken;



public class GmailApi {


    public static Response Get(){
        return RestResource.Get("/users/abdallahsaid7422@gmail.com/profile",renewtoken());


    }
    public static Response Get(String token){
        return RestResource.Get("/users/abdallahsaid7422@gmail.com/profile",token);


    }

    public static Response post(HashMap payload){
        return RestResource.post("/users/abdallahsaid7422@gmail.com/messages/send",payload,renewtoken());


    }

}
