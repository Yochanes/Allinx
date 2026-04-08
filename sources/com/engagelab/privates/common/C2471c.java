package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.constants.MTCoreConstants;

/* JADX INFO: renamed from: com.engagelab.privates.common.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2471c {

    /* JADX INFO: renamed from: a */
    public static volatile C2471c f35123a;

    /* JADX INFO: renamed from: a */
    public static C2471c m12907a() {
        if (f35123a == null) {
            synchronized (C2471c.class) {
                try {
                    if (f35123a == null) {
                        f35123a = new C2471c();
                    }
                } finally {
                }
            }
        }
        return f35123a;
    }

    /* JADX INFO: renamed from: a */
    public void m12908a(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(MTCoreConstants.Config.APP_KEY)) {
            String string = bundle.getString(MTCoreConstants.Config.APP_KEY);
            MTCommonLog.m13010d("MTConfigBusiness", "app_key:" + string);
            if (!TextUtils.isEmpty(string)) {
                MTGlobal.setAppKey(string);
            }
        }
        if (bundle.containsKey(MTCoreConstants.Config.APP_CHANNEL)) {
            String string2 = bundle.getString(MTCoreConstants.Config.APP_CHANNEL);
            MTCommonLog.m13010d("MTConfigBusiness", "app_channel:" + string2);
            if (!TextUtils.isEmpty(string2)) {
                MTGlobal.setAppChannel(string2);
            }
        }
        if (bundle.containsKey(MTCoreConstants.Config.APP_SITE_NAME)) {
            String string3 = bundle.getString(MTCoreConstants.Config.APP_SITE_NAME);
            MTCommonLog.m13010d("MTConfigBusiness", "app_site_name:" + string3);
            if (!TextUtils.isEmpty(string3)) {
                MTGlobal.setAppSiteName(string3);
            }
        }
        if (bundle.containsKey(MTCoreConstants.Config.IS_SSL)) {
            boolean z2 = bundle.getBoolean(MTCoreConstants.Config.IS_SSL);
            MTCommonLog.m13010d("MTConfigBusiness", "is_ssl:" + z2);
            MTGlobal.setTcpSSL(z2);
        }
        if (bundle.containsKey(MTCoreConstants.Config.DEBUG_MODE)) {
            boolean z3 = bundle.getBoolean(MTCoreConstants.Config.DEBUG_MODE);
            MTGlobal.setDebugMode(z3);
            MTCommonLog.m13010d("MTConfigBusiness", "debug_mode:" + z3);
        }
    }
}
