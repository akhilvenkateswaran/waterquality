package com.example.dell.waterquality;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by DELL on 29-01-2018.
 */

public class CustomAdapter extends RecyclerView.Adapter {

    Context mContext;
    LayoutInflater inflater;
    QualityParameter qp;

    List<QualityParameter> qualityParametersList = Collections.emptyList();

    CustomAdapter(Context context,List<QualityParameter> qualityParametersList)
    {
        mContext = context;
        inflater = LayoutInflater.from(mContext);
        this.qualityParametersList = qualityParametersList;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=inflater.inflate(R.layout.single_data_display, parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyHolder myHolder = (MyHolder)holder;
        qp = qualityParametersList.get(position);

        myHolder.tempValueTextView.setText(String.valueOf(qp.temperature));
        myHolder.phValueTextView.setText(String.valueOf(qp.ph));
        myHolder.orpValueTextView.setText(String.valueOf(qp.orp));
        myHolder.qualityValueTextView.setText(qp.quality);




    }

    @Override
    public int getItemCount() {
        return qualityParametersList.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        TextView tempValueTextView,phValueTextView,orpValueTextView,qualityValueTextView;



        public MyHolder(View itemView) {
            super(itemView);

            tempValueTextView = (TextView)itemView.findViewById(R.id.tempValueTextView);
            phValueTextView = (TextView)itemView.findViewById(R.id.phValueTextView);
            orpValueTextView = (TextView)itemView.findViewById(R.id.orpValueTextView);
            qualityValueTextView = (TextView)itemView.findViewById(R.id.qualityValueTextView);
        }
    }
}


