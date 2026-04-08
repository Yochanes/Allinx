package com.engagelab.privates.push.global;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.C2485m;
import com.engagelab.privates.common.utils.DeviceUtil;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTJpushGlobal {
    public static String getUserLanguage(Context context) {
        String strM13050s = C2485m.m13050s(context);
        return TextUtils.isEmpty(strM13050s) ? DeviceUtil.getLanguage(context) : strM13050s;
    }
}
