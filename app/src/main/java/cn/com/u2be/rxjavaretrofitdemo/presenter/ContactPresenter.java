package cn.com.u2be.rxjavaretrofitdemo.presenter;

import android.util.Log;

import java.util.List;

import cn.com.u2be.rxjavaretrofitdemo.entity.Contact;
import cn.com.u2be.rxjavaretrofitdemo.model.service.ContactService;
import cn.com.u2be.rxjavaretrofitdemo.view.ContactView;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by alek on 2016/7/11.
 */
public class ContactPresenter {

    private static final String TAG = ContactPresenter.class.getName();
    private ContactView view;


    public ContactPresenter(ContactView view) {
        this.view = view;
    }

    public void reqAllContacts() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.u2be.com.cn")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();


        ContactService contactService = retrofit.create(ContactService.class);
        contactService.rxGetAll("1", "1")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Contact>>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG, "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, e.getMessage());
                    }

                    @Override
                    public void onNext(List<Contact> contacts) {
                        view.showContacts(contacts);
                    }
                });


    }

}
