package cn.com.u2be.rxjavaretrofitdemo.view.impl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.com.u2be.rxjavaretrofitdemo.R;

public class ReqActivity extends AppCompatActivity {

    @InjectView(R.id.et_url)
    EditText etUrl;
    @InjectView(R.id.btn_request)
    Button btnRequest;
    @InjectView(R.id.btn_cancel)
    Button btnCancel;
    @InjectView(R.id.ll_content)
    LinearLayout llContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        ButterKnife.inject(this);
        initView();
        loadData();
    }

    private void initView() {

    }

    private void loadData() {

    }

    @OnClick(R.id.btn_request)
    void onRequestClick(View v) {

    }


    @OnClick(R.id.btn_cancel)
    void onCancelClick(View v) {

    }

}
