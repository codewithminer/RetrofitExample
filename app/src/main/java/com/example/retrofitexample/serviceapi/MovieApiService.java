package com.example.retrofitexample.serviceapi;

import com.example.retrofitexample.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {
    // Acts as a bridge between your app and the API

    // Call<ResponseType>: Represent a network request
    // and its response. 'ResponseType' should be replaced
    // with actual data model class that represents
    // the expected response from the API.

    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
