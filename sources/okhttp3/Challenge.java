package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Challenge;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Challenge {

    /* JADX INFO: renamed from: a */
    public final String f57039a;

    /* JADX INFO: renamed from: b */
    public final Map f57040b;

    public Challenge(String str, Map map) {
        String lowerCase;
        this.f57039a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale US = Locale.US;
                Intrinsics.m18598f(US, "US");
                lowerCase = str2.toLowerCase(US);
                Intrinsics.m18598f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str3);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.m18598f(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f57040b = mapUnmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return Intrinsics.m18594b(challenge.f57039a, this.f57039a) && Intrinsics.m18594b(challenge.f57040b, this.f57040b);
    }

    public final int hashCode() {
        return this.f57040b.hashCode() + AbstractC0000a.m5b(899, 31, this.f57039a);
    }

    public final String toString() {
        return this.f57039a + " authParams=" + this.f57040b;
    }
}
