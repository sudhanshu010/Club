package com.example.club;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private List<EmployeeBean> employeeList;


    void print()
    {
        System.out.println("hello github");
    }

    public ListViewAdapter(Context context, List<EmployeeBean> employeeList) {
        this.context = context;
        this.employeeList = employeeList;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        //Log.i("check","pass7");
        View row = convertView;
        EmployeeBeanHolder holder = null;
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        //Log.i("check","pass6");
        if(row == null)
        {row = inflater.inflate(R.layout.activity_main, parent, false);}
        //Log.i("check","pass7");

        holder = new EmployeeBeanHolder();
        holder.employeeBean = employeeList.get(position);
        holder.tvEmpId = (TextView) row.findViewById(R.id.tvEmpId);


        row.setTag(holder);
        holder.tvEmpId.setText(holder.employeeBean.getEmpId());


        if (position % 2 == 0) {
            row.setBackgroundColor(Color.rgb(213, 229, 241));
        } else {
            row.setBackgroundColor(Color.rgb(255, 255, 255));
        }

        return row;
    }

    public static class EmployeeBeanHolder {
        EmployeeBean employeeBean;
        TextView tvEmpId;
        TextView tvName;
        TextView tvStatus;
    }

    @Override
    public int getCount() {
        return employeeList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
