package cn.com.u2be.rxjavaretrofitdemo.model.service;

import java.util.List;

import cn.com.u2be.rxjavaretrofitdemo.entity.Contact;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by alek on 2016/7/11.
 */
public interface ContactService {

    @GET("/contact")
    Call<List<Contact>> getAll(@Query("user") String user, @Query("password") String pwd);

    @GET("/contact")
    Observable<List<Contact>> rxGetAll(@Query("user") String user, @Query("password") String pwd);

}
