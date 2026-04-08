package com.engagelab.privates.push.platform.google.business;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.engagelab.privates.push.api.PlatformTokenMessage;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.platform.google.callback.MTGoogleListener;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTGoogleBusiness {
    private static final String TAG = "MTGoogleBusiness";
    private static volatile MTGoogleBusiness instance;

    public static MTGoogleBusiness getInstance() {
        if (instance == null) {
            synchronized (MTGoogleBusiness.class) {
                instance = new MTGoogleBusiness();
            }
        }
        return instance;
    }

    public void init(Context context) {
        try {
            int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context);
            if (iIsGooglePlayServicesAvailable == 0) {
                MTCommonLog.m13010d(TAG, "support google push");
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new MTGoogleListener(context));
            } else {
                MTCommonLog.m13011e(TAG, "not support google push, code:" + iIsGooglePlayServicesAvailable);
                onNode(context, 3002, iIsGooglePlayServicesAvailable, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 1);
            }
        } catch (Throwable th) {
            MTCommonLog.m13011e(TAG, "init failed " + th.getMessage());
        }
    }

    public void onNode(Context context, int i, int i2, int i3, int i4) {
        Bundle bundle = new Bundle();
        bundle.putByte(MTPushConstants.PlatformNode.KEY_PLATFORM, (byte) 8);
        bundle.putInt("code", i);
        bundle.putInt(MTPushConstants.PlatformNode.KEY_M_CODE, i2);
        bundle.putInt("type", i3);
        bundle.putInt("from", i4);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.ON_PLATFORM_NODE, bundle);
    }

    public void onToken(Context context, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.m13010d(TAG, "onToken:token is empty");
            return;
        }
        PlatformTokenMessage token = new PlatformTokenMessage().setPlatform((byte) 8).setToken(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", token);
        MTPushPrivatesApi.init(context);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.ON_PLATFORM_TOKEN, bundle);
        onNode(context, MTPushConstants.PlatformNode.CODE_GET_TOKEN_SUCCESS, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_SUCCESS, i);
    }
}
