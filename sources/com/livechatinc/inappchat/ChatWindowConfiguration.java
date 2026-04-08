package com.livechatinc.inappchat;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ChatWindowConfiguration implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f43303a;

    /* JADX INFO: renamed from: b */
    public final String f43304b;

    /* JADX INFO: renamed from: c */
    public final String f43305c;

    /* JADX INFO: renamed from: d */
    public final String f43306d;

    /* JADX INFO: renamed from: f */
    public final HashMap f43307f;

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: a */
        public String f43308a;

        /* JADX INFO: renamed from: b */
        public String f43309b;

        /* JADX INFO: renamed from: c */
        public String f43310c;

        /* JADX INFO: renamed from: d */
        public String f43311d;

        /* JADX INFO: renamed from: e */
        public HashMap f43312e;
    }

    public ChatWindowConfiguration(String str, String str2, String str3, String str4, HashMap map) {
        this.f43303a = str;
        this.f43304b = str2;
        this.f43305c = str3;
        this.f43306d = str4;
        this.f43307f = map;
    }

    /* JADX INFO: renamed from: a */
    public final HashMap m15400a() {
        HashMap map = new HashMap();
        map.put("KEY_LICENCE_NUMBER", this.f43303a);
        String str = this.f43304b;
        if (str == null) {
            str = "0";
        }
        map.put("KEY_GROUP_ID", str);
        String str2 = this.f43305c;
        if (!TextUtils.isEmpty(str2)) {
            map.put("KEY_VISITOR_NAME", str2);
        }
        String str3 = this.f43306d;
        if (!TextUtils.isEmpty(str3)) {
            map.put("KEY_VISITOR_EMAIL", str3);
        }
        HashMap map2 = this.f43307f;
        if (map2 != null) {
            for (String str4 : map2.keySet()) {
                map.put(AbstractC0000a.m13j("#LCcustomParam_", str4), map2.get(str4));
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ChatWindowConfiguration chatWindowConfiguration = (ChatWindowConfiguration) obj;
            if (!this.f43303a.equals(chatWindowConfiguration.f43303a)) {
                return false;
            }
            String str = chatWindowConfiguration.f43304b;
            String str2 = this.f43304b;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = chatWindowConfiguration.f43305c;
            String str4 = this.f43305c;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = chatWindowConfiguration.f43306d;
            String str6 = this.f43306d;
            if (str6 == null ? str5 != null : !str6.equals(str5)) {
                return false;
            }
            HashMap map = chatWindowConfiguration.f43307f;
            HashMap map2 = this.f43307f;
            if (map2 != null) {
                return map2.equals(map);
            }
            if (map == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f43303a.hashCode() * 31;
        String str = this.f43304b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f43305c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f43306d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        HashMap map = this.f43307f;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "licenceNumber='" + this.f43303a + "'\ngroupId='" + this.f43304b + "'\nvisitorName='" + this.f43305c + "'\nvisitorEmail='" + this.f43306d + "'\ncustomVariables=" + this.f43307f;
    }
}
