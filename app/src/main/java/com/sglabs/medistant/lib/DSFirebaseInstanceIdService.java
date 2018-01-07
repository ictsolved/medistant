package com.sglabs.medistant.lib;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class DSFirebaseInstanceIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String instanceId = FirebaseInstanceId.getInstance().getToken();
    }
}
