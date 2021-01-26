package com.example.gadsleadersboard;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("/api/skilliq/")
    Call<List<GadsModel>> getResult();
}
