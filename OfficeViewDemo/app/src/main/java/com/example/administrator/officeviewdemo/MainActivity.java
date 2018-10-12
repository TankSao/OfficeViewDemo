package com.example.administrator.officeviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.start)
    public void onViewClicked() {
        Intent intent = new Intent(MainActivity.this,OfficeViewActivity.class);
        //测试url
        String testUrl = "http://oss.rujiaowang.net/document/13566668888/%E3%80%90%E5%AD%A6%E6%A1%88%E3%80%916.1%20%E4%BA%BA%E7%9A%84%E8%AE%A4%E8%AF%86%E4%BB%8E%E4%BD%95%E8%80%8C%E6%9D%A5.doc";
        intent.putExtra("fileUrl",testUrl);
        startActivity(intent);
    }

}
