package com.example.club;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<EmployeeBean> EMPLOYEE_LIST = new ArrayList<EmployeeBean>();

    void print()
    {
        System.out.println("hello github");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        Log.i("check","pass1");
        for(int i=0;i<=50;i++) {
            Log.i("check","pass2");
            EmployeeBean employee = new EmployeeBean("EmpId"+i);
            EMPLOYEE_LIST .add(employee );
        }
        Log.i("check","pass3");
        ListView listView;
        listView = (ListView) findViewById(R.id.listView);
        Log.i("check","pass4");
        //ListViewAdapter adap = new ListViewAdapter(this, EMPLOYEE_LIST);
        listView.setAdapter(new ListViewAdapter(this, EMPLOYEE_LIST));
        Log.i("check","pass5");
    }


}
