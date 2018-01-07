package com.sglabs.medistant.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.sglabs.medistant.R;
import com.sglabs.medistant.lib.DSLocationTracker;

import java.util.ArrayList;

public class HealthPlacesActivity extends AppCompatActivity {
    public LinearLayout mMainLayout;

    public Toolbar appBar;

    public GoogleMap mapView1;

    public ArrayList<Marker> mapView1Markers;

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public HealthPlacesActivity getContext() {
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.health_places);

        mMainLayout = (LinearLayout) findViewById(R.id.health_places);

        this.setup();

        if (ContextCompat.checkSelfPermission(
                HealthPlacesActivity.this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED
                && ContextCompat.checkSelfPermission(
                HealthPlacesActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            if (!(ActivityCompat.checkSelfPermission(
                    HealthPlacesActivity.this, Manifest.permission.ACCESS_FINE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED
                    || ActivityCompat.checkSelfPermission(
                    HealthPlacesActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED)) {
                ActivityCompat.requestPermissions(
                        HealthPlacesActivity.this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        1001);
            } else {
                new DSLocationTracker(
                        HealthPlacesActivity.this,
                        new DSLocationTracker.DSLocationEventHandler() {
                            @Override
                            public void onLocationChanged(Location location) {
                            }

                            @Override
                            public void onFailure() {
                                Toast.makeText(
                                        HealthPlacesActivity.this,
                                        "Failed to Update Location",
                                        Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                        .trackOnce(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
            }
        } else {
            ActivityCompat.requestPermissions(
                    HealthPlacesActivity.this,
                    new String[]{
                            Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION
                    },
                    1000);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#FF00897B"));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    private void setup() {
        appBar = (Toolbar) findViewById(R.id.app_bar4);

        HealthPlacesActivity.this.setSupportActionBar(appBar);

        for (int i = 0; i < appBar.getChildCount(); ++i) {
            View child = appBar.getChildAt(i);
            if (child instanceof TextView) {
                child.setBackgroundColor(Color.TRANSPARENT);
                break;
            }
        }

        appBar.setNavigationIcon(ContextCompat.getDrawable(getContext(), R.drawable.back_btn_ffffffff));

        appBar
                .getNavigationIcon()
                .mutate()
                .setColorFilter(Color.parseColor("#FFFFFFFF"), PorterDuff.Mode.SRC_ATOP);

        appBar.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view1) {
                        HealthPlacesActivity activity = HealthPlacesActivity.this;
                        Intent transitionIntent = new Intent(activity, HomeActivity.class);
                        activity.startActivity(transitionIntent);
                    }
                });

        int playServicesConnectionResult =
                GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);

        if (playServicesConnectionResult != ConnectionResult.SUCCESS) {
            Log.d("DS", "API availability: " + playServicesConnectionResult);
            Toast.makeText(
                    this, "Required Google Play Services Unavailable on this Device", Toast.LENGTH_LONG)
                    .show();
            GoogleApiAvailability.getInstance()
                    .getErrorDialog(this, playServicesConnectionResult, playServicesConnectionResult);
        } else {
            MapFragment mapFragment =
                    (MapFragment) this.getFragmentManager().findFragmentById(R.id.map_view1);
            mapFragment.getMapAsync(
                    new OnMapReadyCallback() {
                        @Override
                        public void onMapReady(GoogleMap m) {
                            HealthPlacesActivity.this.initializeMap(m);
                        }
                    });
        }
    }

    public void initializeMap(GoogleMap m) {
        this.mapView1 = m;

        this.mapView1Markers = new ArrayList<Marker>();

        this.mapView1.setOnMapLongClickListener(
                new GoogleMap.OnMapLongClickListener() {
                    @Override
                    public void onMapLongClick(LatLng touchLocation) {
                    }
                });

        this.mapView1.setOnMarkerClickListener(
                new GoogleMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(Marker view) {
                        final GoogleMap mapView = HealthPlacesActivity.this.mapView1;
                        return false;
                    }
                });

        mapView1.getUiSettings().setZoomControlsEnabled(true);

        mapView1.getUiSettings().setZoomGesturesEnabled(true);

        mapView1.getUiSettings().setRotateGesturesEnabled(true);

        mapView1.setBuildingsEnabled(true);

        mapView1.setTrafficEnabled(true);

        mapView1.getUiSettings().setMyLocationButtonEnabled(true);

        mapView1.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        mapView1.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(0, 0), 2));

        if (!(ActivityCompat.checkSelfPermission(
                HealthPlacesActivity.this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED
                || ActivityCompat.checkSelfPermission(
                HealthPlacesActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION)
                == PackageManager.PERMISSION_GRANTED)) {
            ActivityCompat.requestPermissions(
                    HealthPlacesActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1002);
        } else {
            try {
                this.mapView1.setMyLocationEnabled(true);
            } catch (SecurityException e) {
            }
        }

        Marker marker =
                HealthPlacesActivity.this.mapView1.addMarker(
                        new MarkerOptions()
                                .title("Tilganga Eye Hospital")
                                .position(new LatLng(27.705612182617188d, 85.35045623779297d)));

        HealthPlacesActivity.this.mapView1Markers.add(marker);
    }

    @Override
    public void onRequestPermissionsResult(
            int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1002: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    try {
                        HealthPlacesActivity.this.mapView1.setMyLocationEnabled(true);
                    } catch (SecurityException e) {
                    }
                } else {
                }
            }
        }

        if (requestCode == 1000) {
            boolean mergedGrantResults = true;
            for (int grantResult : grantResults) {
                mergedGrantResults &= (grantResult == PackageManager.PERMISSION_GRANTED);
            }
            if (mergedGrantResults) {
                if (!(ActivityCompat.checkSelfPermission(
                        HealthPlacesActivity.this, Manifest.permission.ACCESS_FINE_LOCATION)
                        == PackageManager.PERMISSION_GRANTED
                        || ActivityCompat.checkSelfPermission(
                        HealthPlacesActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION)
                        == PackageManager.PERMISSION_GRANTED)) {
                    ActivityCompat.requestPermissions(
                            HealthPlacesActivity.this,
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                            1001);
                } else {
                    new DSLocationTracker(
                            HealthPlacesActivity.this,
                            new DSLocationTracker.DSLocationEventHandler() {
                                @Override
                                public void onLocationChanged(Location location) {
                                }

                                @Override
                                public void onFailure() {
                                    Toast.makeText(
                                            HealthPlacesActivity.this,
                                            "Failed to Update Location",
                                            Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })
                            .trackOnce(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
                }
            } else {
                Toast.makeText(HealthPlacesActivity.this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
