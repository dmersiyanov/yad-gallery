package com.mersiyanov.dmitry.yadg.network;

import com.mersiyanov.dmitry.yadg.pojo.ResponseFileList;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface YaDiskApi {

    @Headers({"Authorization: OAuth AQAAAAAAyzDHAATzcz1kz5Y72UNGurKlusPcD5c",
            "Accept: application/json",
            "Content-Type: application/json",
    })
    @GET("files?media_type=image")
    Single<ResponseFileList> getImagesList();

}
