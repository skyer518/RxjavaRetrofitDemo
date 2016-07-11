package cn.com.u2be.rxjavaretrofitdemo.view.impl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import cn.com.u2be.rxjavaretrofitdemo.R;
import cn.com.u2be.rxjavaretrofitdemo.adapter.ContactAdapter;
import cn.com.u2be.rxjavaretrofitdemo.entity.Contact;
import cn.com.u2be.rxjavaretrofitdemo.presenter.ContactPresenter;
import cn.com.u2be.rxjavaretrofitdemo.view.ContactView;

public class ContactActivity extends AppCompatActivity implements ContactView {

    private static final String TAG = ContactActivity.class.getName();

    @InjectView(R.id.rv_contacts)
    RecyclerView rvContacts;
    @InjectView(R.id.tv_none)
    TextView tvNone;
    @InjectView(R.id.pb_progerss)
    ProgressBar pbProgerss;

    ContactAdapter contactAdapter;

    ContactPresenter contactPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        ButterKnife.inject(this);
        initView();
        loadData();
    }

    private void initView() {
        contactAdapter = new ContactAdapter(new ArrayList<Contact>());
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
        rvContacts.setAdapter(contactAdapter);
    }

    private void loadData() {
        showLoading();
        contactPresenter = new ContactPresenter(this);
        contactPresenter.reqAllContacts();

    }


    @Override
    public void showLoading() {
        pbProgerss.setVisibility(View.VISIBLE);
        rvContacts.setVisibility(View.GONE);
    }

    @Override
    public void showContacts(List<Contact> contactList) {
        pbProgerss.setVisibility(View.GONE);
        rvContacts.setVisibility(View.VISIBLE);
        contactAdapter.setContacts(contactList);
        contactAdapter.notifyDataSetChanged();
    }
}
