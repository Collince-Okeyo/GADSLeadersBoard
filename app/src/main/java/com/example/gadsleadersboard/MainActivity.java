package com.example.gadsleadersboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        APIService api = RetrofitClients.getRetrofit().create(APIService.class);
        Call<List<GadsModel>> call = api.getResult();

        call.enqueue(new Callback<List<GadsModel>>() {
            @Override
            public void onResponse(Call<List<GadsModel>> call, Response<List<GadsModel>> response) {

            }

            @Override
            public void onFailure(Call<List<GadsModel>> call, Throwable t) {

            }
        });

    }
}
/*
    RecyclerView recyclerView;
    Adapter adapter;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        APIService api = RetrofitClients.getRetrofit().create(APIService.class);
        Call<List<Model>> call = api.getResult();

        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {

                addDataList(response.body());
                Log.d(TAG, "onResponse: "+response.message());
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed Loading Data", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void addDataList(List<Model> list){
        recyclerView = findViewById(R.id.recyCler);
        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);
    }*/