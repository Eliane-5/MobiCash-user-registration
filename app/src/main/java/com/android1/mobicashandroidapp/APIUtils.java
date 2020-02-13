package com.android1.mobicashandroidapp;

import retrofit2.Retrofit;

public class APIUtils {

    private APIUtils(){};

    public static final String API_URL ="http://localhost:8080/userInfo";
    public static UserService getUserService(){
        return RetrofitClient.getClient(API_URL).create(UserService.class);
    }
}
