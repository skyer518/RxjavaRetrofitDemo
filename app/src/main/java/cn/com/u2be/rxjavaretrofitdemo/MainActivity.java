package cn.com.u2be.rxjavaretrofitdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.com.u2be.rxjavaretrofitdemo.view.impl.ContactActivity;
import cn.com.u2be.rxjavaretrofitdemo.view.impl.ReqActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);


    }

    @OnClick({R.id.btn_retrofit_rxjava, R.id.btn_volley, R.id.btn_ok_http})
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.btn_retrofit_rxjava:
                intent.setClass(this, ContactActivity.class);
                break;
            case R.id.btn_volley:
                intent.setClass(this, ReqActivity.class);
                break;
            case R.id.btn_ok_http:
                break;
        }

        startActivity(intent);
    }
}
