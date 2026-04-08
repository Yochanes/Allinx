package io.intercom.android.nexus;

import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class EventData extends HashMap<String, Object> {
    public EventData() {
    }

    public long optLong(String str) {
        return optLong(str, -1L);
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public EventData(int i) {
        super(i);
    }

    public long optLong(String str, long j) {
        Object obj = get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    public String optString(String str, String str2) {
        Object obj = get(str);
        return obj instanceof String ? (String) obj : str2;
    }
}
