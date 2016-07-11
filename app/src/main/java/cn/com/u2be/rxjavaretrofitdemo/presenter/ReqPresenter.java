package cn.com.u2be.rxjavaretrofitdemo.presenter;

import cn.com.u2be.rxjavaretrofitdemo.view.ReqView;

/**
 * Created by alek on 2016/7/11.
 */
public class ReqPresenter {

    private ReqView view;


    public ReqPresenter(ReqView view) {
        this.view = view;
    }

    public void requestUri(String uri) {

    }


    public void cancelRequest() {

        view.showData("Request is Canceled!");
    }


}
