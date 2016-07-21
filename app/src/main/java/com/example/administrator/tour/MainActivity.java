package com.example.administrator.tour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private HomeFragment homeFragment;
    private MyFragment myFragment;
    private ConnFragment connFragment;
    private DestFragment destFragment;
    private ArrayList<Fragment> fragments;
    private RadioGroup group;
    private RadioButton index;
    private RadioButton dest;
    private RadioButton conn;
    private RadioButton my;

    //定义FragmentManager对象
    FragmentManager fManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //实现对activity中的fragment的管理,通过调用activity中的getSupportFragmentManager()取得它的实例
        fManager = getSupportFragmentManager();
        initViews();
        setChioceItem(index);
    }

    //完成组件的初始化
    public void initViews()
    {
        group = (RadioGroup) findViewById(R.id.group);
        index = (RadioButton) findViewById(R.id.index);
        dest = (RadioButton) findViewById(R.id.dest);
        conn = (RadioButton) findViewById(R.id.conn);
        my = (RadioButton) findViewById(R.id.my);

        index.setOnClickListener(this);
        dest.setOnClickListener(this);
        conn.setOnClickListener(this);
        my.setOnClickListener(this);
    }

    //重写onClick事件
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.index:
                setChioceItem(index);
                break;
            case R.id.dest:
                setChioceItem(dest);
                break;
            case R.id.conn:
                setChioceItem(conn);
                break;
            case R.id.my:
                setChioceItem(my);
                break;
            default:
                break;
        }

    }


    //定义一个选中一个item后的处理
    public void setChioceItem(View view)
    {
        //重置选项+隐藏所有Fragment
        //FragmentTransaction是对fragment进行添加,移除,替换,以及执行其他动作
        //beginTransaction是开启一个事务  如果在此次执行中有错误,或想取消可以使用rollbacktraction回滚事务,则在开始事务后的操作全部都会取消
        //begin tran 的後面必須帶commit tran或 rollback tran 其中的一個
        //   如果是一个事务的结束用committransaction也是用于提交事务的代码
        FragmentTransaction transaction = fManager.beginTransaction();
        hideFragments(transaction);
        switch (view.getId()) {
            case R.id.index:
                if (homeFragment == null) {
                    // 如果homeFragment为空，则创建一个并添加到界面上
                    homeFragment = new HomeFragment();
                    transaction.add(R.id.content, homeFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(homeFragment);
                }
                break;

            case R.id.dest:
                if (destFragment == null) {
                    // 如果destFragment为空，则创建一个并添加到界面上
                    destFragment = new DestFragment();
                    transaction.add(R.id.content, destFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(destFragment);
                }
                break;

            case R.id.conn:

                if (connFragment == null) {
                    // 如果connFragment为空，则创建一个并添加到界面上
                    connFragment = new ConnFragment();
                    transaction.add(R.id.content, connFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(connFragment);
                }
                break;
            case R.id.my:

                if (myFragment == null) {
                    // 如果myFragment为空，则创建一个并添加到界面上
                    myFragment = new MyFragment();
                    transaction.add(R.id.content, myFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(myFragment);
                }
                break;
        }
        transaction.commit();
    }

    //隐藏所有的Fragment,避免fragment混乱
    private void hideFragments(FragmentTransaction transaction) {
        if (homeFragment != null) {
            transaction.hide(homeFragment);
        }
        if (destFragment != null) {
            transaction.hide(destFragment);
        }
        if (connFragment != null) {
            transaction.hide(connFragment);
        }
        if (myFragment != null) {
            transaction.hide(myFragment);
        }
    }


}

