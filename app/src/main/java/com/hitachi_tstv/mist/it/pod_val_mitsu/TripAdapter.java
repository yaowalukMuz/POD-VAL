package com.hitachi_tstv.mist.it.pod_val_mitsu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Yaowaluk on 15/09/2560.
 */

public class TripAdapter extends BaseAdapter {

    Context context;
    String planNoString;
    String[] jobNoStrings;
    String[][] startTripStrings, endTripStrings;
    TripViewHolder tripViewHolder;

    public TripAdapter(Context context, String planNoString, String[] jobNoStrings, String[][] startTripStrings, String[][] endTripStrings) {
        this.context = context;
        this.planNoString = planNoString;
        this.jobNoStrings = jobNoStrings;
        this.startTripStrings = startTripStrings;
        this.endTripStrings = endTripStrings;
    }
    @Override
    public int getCount() {
        //return jobNoStrings.length;
        return 3;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.trip_listview, null);
            tripViewHolder = new TripViewHolder(view);
            view.setTag(tripViewHolder);
        }else{
            tripViewHolder = (TripViewHolder) view.getTag();
        }
        tripViewHolder.stationStartTL.setText("111111");
        tripViewHolder.stationEndJobTL.setText("22222");

        return view;
    }

    static class TripViewHolder {
        @BindView(R.id.imageView)
        ImageView imageView;
        @BindView(R.id.imgStartTL)
        ImageView imgStartTL;
        @BindView(R.id.stationStartTL)
        TextView stationStartTL;
        @BindView(R.id.imgEndTL)
        ImageView imgEndTL;
        @BindView(R.id.stationEndJobTL)
        TextView stationEndJobTL;

        TripViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
