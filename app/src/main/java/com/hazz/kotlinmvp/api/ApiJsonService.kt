package com.hazz.kotlinmvp.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface ApiJsonService {

    /**
     * 首页精选
     */
    @GET("v2/feed?")
    fun getFirstHomeJson(@Query("num") num: Int): Call<ResponseBody>

    /**
     * 根据 nextPageUrl 请求数据下一页数据
     */
    @GET
    fun getMoreHomeJson(@Url url: String): Call<ResponseBody>

}