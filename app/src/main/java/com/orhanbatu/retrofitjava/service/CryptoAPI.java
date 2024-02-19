package com.orhanbatu.retrofitjava.service;

import com.orhanbatu.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CryptoAPI {

    //Get, Post, Update, Delete gibi işlemler kullanılır

    @GET("orhanbatu/JSONDataSet/main/crypto.json")
    Observable<List<CryptoModel>> getData();
}
