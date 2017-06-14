package com.aaagame.proframework.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aaagame.proframework.R;

import org.xutils.view.annotation.Event;

public class T_TestFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.t_fragment_test, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
        initData();
        reqData();
    }

    //=============================初始化view
    private void initView() {

    }

    //=============================初始化监听
    private void initListener() {

    }

    @Event(value = {})
    private void setClick(View view) {
        switch (view.getId()) {
            default:
                break;
        }
    }

    //=============================初始化数据和变量
    private void initData() {

    }

    //=============================网络请求数据
    private void reqData() {
    }
    //=============================其他操作
}
