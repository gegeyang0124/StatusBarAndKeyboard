package com.yz.testbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE); //隐藏状态栏
        setContentView(R.layout.activity_main);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//隐藏状态栏

//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN); //隐藏状态栏
//        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN); //显示状态栏

        /*//清单文件中要设置主题为NoActionBar
        StatusBarUtils.with(this)
                .setColor(Color.BLUE)
                .init();*/

       /* //清单文件中要设置主题为NoActionBar
        // 在布局文件中设置的第一个view的背景图片则为当前状态栏背景图片
        StatusBarUtils.with(this)
                .init();*/

/*        //清单文件中要设置主题为NoActionBar
//R.id.rl_content为主页面布局
//代码中设置的为主页面状态栏
//在侧滑页面布局文件中设置的第一个view的背景图片则为侧滑状态栏背景图片
        StatusBarUtils.with(this)
                .setDrawerLayoutContentId(true, R.id.rl_content)
                .setColor(getResources().getColor(R.color.blue))
                .init();*/

        //当前案例含ActionBar
        StatusBarUtils.with(this)
//                .setIsFullScreen(true)
//                .setIsActionBar(true)
                .clearActionBarShadow()
                .setDrawable(getResources().getDrawable(R.drawable.shape))
                .init();

        /*StatusBarUtils.with(this)
                .setIsHideStatus(true)
                .init();*/

        Button btnOne = (Button) findViewById(R.id.btn_one);
        btnOne.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                startActivity(new Intent(this,StatusBarKeyboardActivity.class));
                break;
        }
    }
}
