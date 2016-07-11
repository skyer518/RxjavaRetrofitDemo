package cn.com.u2be.rxjavaretrofitdemo.view;

import java.util.List;

import cn.com.u2be.rxjavaretrofitdemo.entity.Contact;

/**
 * Created by alek on 2016/7/11.
 */
public interface ContactView {

    void showLoading();

    void showContacts(List<Contact> contactList);


}
