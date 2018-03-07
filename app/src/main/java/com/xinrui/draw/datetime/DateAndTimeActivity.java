package com.xinrui.draw.datetime;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.xinrui.draw.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DateAndTimeActivity extends AppCompatActivity {

    @BindView(R.id.datePicker) Button datePicker;
    @BindView(R.id.timePicker) Button timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.datePicker,R.id.timePicker})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.datePicker:
                DialogFragment dialogFragment=new DatePickerFragment();
                dialogFragment.show(getFragmentManager(),"datePicker");
                break;
            case R.id.timePicker:
                DialogFragment timePickFragment=new TimePickerFragment();
                timePickFragment.show(getFragmentManager(),"timePicker");
                break;
        }
    }
}
