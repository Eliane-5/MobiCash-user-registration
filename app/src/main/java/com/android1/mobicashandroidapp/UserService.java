package com.android1.mobicashandroidapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserService {

    @GET("userInfo/")
    Call<List<User>> getAllUsers();

    @GET("userInfo/{email}")
    Call<List<User>> getUser();

    @POST("userInfo/")
    Call<User> addUser(@Body User user);
}
