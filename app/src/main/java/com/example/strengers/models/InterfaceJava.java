package com.example.strengers.models;

import android.webkit.JavascriptInterface;

import com.example.strengers.activites.CallActivity;

public class InterfaceJava {

        CallActivity callActivity;

        public InterfaceJava(CallActivity callActivity) {
            this.callActivity = callActivity;
        }

        @JavascriptInterface
        public void onPeerConnected(){
            callActivity.onPeerConnected();
        }

    }

