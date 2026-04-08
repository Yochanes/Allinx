package com.exchange.allin.utils.devicelibrary.utils;

import android.text.TextUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class PhoneUtils {

    /* JADX INFO: compiled from: Proguard */
    public static class MethodNotFoundException extends Exception {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SimInfo {
        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof SimInfo)) {
                return false;
            }
            if (TextUtils.isEmpty(null)) {
                return true;
            }
            throw null;
        }

        public final String toString() {
            return "SimInfo{mCarrierName=null, mIccId=null, mSimSlotIndex=0, mNumber=null, mCountryIso=null, mImei=null, mImsi=null}";
        }
    }
}
