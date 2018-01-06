package com.test.java;

import com.jayway.restassured.response.Response;

public class ResponseHolder {

    public static Response response;

    public static void setResponse(Response resp){
        response = resp;

    }
    public static Response getResponse(){
        return response;
    }

}
