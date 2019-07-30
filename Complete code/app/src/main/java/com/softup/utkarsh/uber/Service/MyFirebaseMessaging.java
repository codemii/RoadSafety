package com.softup.utkarsh.uber.Service;

import android.content.Intent;

import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.softup.utkarsh.uber.CustommerCall;

public class MyFirebaseMessaging extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        LatLng customer_location = new Gson().fromJson(remoteMessage.getNotification().getBody(),LatLng.class);

        Intent intent = new Intent(getBaseContext(), CustommerCall.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("lat",customer_location.latitude);
        intent.putExtra("lng",customer_location.longitude);
        intent.putExtra("customer",remoteMessage.getNotification().getTitle());

          startActivity(intent);

    }
}
