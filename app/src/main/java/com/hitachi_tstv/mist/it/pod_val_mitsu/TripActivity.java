package com.hitachi_tstv.mist.it.pod_val_mitsu;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TripActivity extends AppCompatActivity {

    @BindView(R.id.dateBtnTrip)
    Button dateBtnTrip;
    @BindView(R.id.imgDriverTrip)
    ImageView imgDriverTrip;
    @BindView(R.id.truckIdLblTrip)
    TextView truckIdLblTrip;
    @BindView(R.id.truckIdValTrip)
    TextView truckIdValTrip;
    @BindView(R.id.truckTypeLblTrip)
    TextView truckTypeLblTrip;
    @BindView(R.id.truckTypeValTrip)
    TextView truckTypeValTrip;
    @BindView(R.id.driverNameLblTrip)
    TextView driverNameLblTrip;
    @BindView(R.id.driverNameValTrip)
    TextView driverNameValTrip;
    @BindView(R.id.tripListviewTrip)
    ListView tripListviewTrip;

    private String planNoString;
    private String[] jobNoStrings;
    private String[][] startTripStrings,endTripStrings;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip);
        ButterKnife.bind(this);

        TripAdapter tripAdapter = new TripAdapter(TripActivity.this,planNoString,jobNoStrings,startTripStrings,endTripStrings);
        tripListviewTrip.setAdapter(tripAdapter);
    }



}
