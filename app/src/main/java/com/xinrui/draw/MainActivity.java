package com.xinrui.draw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_one) Button btn_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_one})
    public void onClick(View view){
        Intent intent;
        switch(view.getId()){
            case R.id.btn_one:
                intent=new Intent(this,DrawOneActivity.class);
                startActivity(intent);
                break;
        }
    }
}
