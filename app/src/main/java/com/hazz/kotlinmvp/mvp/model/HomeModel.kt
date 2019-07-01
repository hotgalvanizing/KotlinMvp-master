package com.hazz.kotlinmvp.mvp.model

import com.hazz.kotlinmvp.mvp.model.bean.HomeBean
import com.hazz.kotlinmvp.net.RetrofitJsonManager
import com.hazz.kotlinmvp.net.RetrofitManager
import com.hazz.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Call

/**
 * Created by xuhao on 2017/11/21.
 * desc: 首页精选 model
 */

class HomeModel {

    /**
     * 获取首页 Banner 数据
     */
    fun requestHomeData(num: Int): Observable<HomeBean> {
        return RetrofitManager.service.getFirstHomeData(num)
                .compose(SchedulerUtils.ioToMain())
    }

    /**
     * 获取首页Banner Json数据
     */
    fun requestHomeJosn(num: Int): Call<ResponseBody> {
        return RetrofitJsonManager.service.getFirstHomeJson(num)
    }

    /**
     * 加载更多
     */
    fun loadMoreData(url: String): Observable<HomeBean> {

        return RetrofitManager.service.getMoreHomeData(url)
                .compose(SchedulerUtils.ioToMain())
    }

    /**
     * 加载更多 json数据
     */
    fun loadMoreJson(url: String): Call<ResponseBody> {
        return RetrofitJsonManager.service.getMoreHomeJson(url)
    }


}
