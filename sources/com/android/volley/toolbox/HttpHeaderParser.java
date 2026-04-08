package com.android.volley.toolbox;

import android.util.Log;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyLog;
import com.google.common.net.HttpHeaders;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class HttpHeaderParser {
    /* JADX INFO: renamed from: a */
    public static Map m12839a(Cache.Entry entry) {
        if (entry == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        String str = entry.f34905b;
        if (str != null) {
            map.put(HttpHeaders.IF_NONE_MATCH, str);
        }
        long j = entry.f34907d;
        if (j > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(HttpHeaders.IF_MODIFIED_SINCE, simpleDateFormat.format(new Date(j)));
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static Cache.Entry m12840b(NetworkResponse networkResponse) {
        long j;
        boolean z2;
        long j2;
        long j3;
        long j4;
        long jM12842d;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = networkResponse.f34939c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get(HttpHeaders.DATE);
        long jM12842d2 = str != null ? m12842d(str) : 0L;
        String str2 = (String) map.get(HttpHeaders.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z2 = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z2 = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z2 = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get(HttpHeaders.EXPIRES);
        long jM12842d3 = str3 != null ? m12842d(str3) : j;
        String str4 = (String) map.get(HttpHeaders.LAST_MODIFIED);
        if (str4 != null) {
            j4 = jCurrentTimeMillis;
            jM12842d = m12842d(str4);
        } else {
            j4 = jCurrentTimeMillis;
            jM12842d = j;
        }
        String str5 = (String) map.get(HttpHeaders.ETAG);
        if (i != 0) {
            long j7 = (j2 * 1000) + j4;
            j6 = z2 ? j7 : (j3 * 1000) + j7;
            j5 = j7;
        } else {
            j5 = (jM12842d2 <= j || jM12842d3 < jM12842d2) ? j : (jM12842d3 - jM12842d2) + j4;
            j6 = j5;
        }
        Cache.Entry entry = new Cache.Entry();
        entry.f34904a = networkResponse.f34938b;
        entry.f34905b = str5;
        entry.f34909f = j5;
        entry.f34908e = j6;
        entry.f34906c = jM12842d2;
        entry.f34907d = jM12842d;
        entry.f34910g = map;
        entry.f34911h = networkResponse.f34940d;
        return entry;
    }

    /* JADX INFO: renamed from: c */
    public static String m12841c(String str, Map map) {
        String str2;
        if (map != null && (str2 = (String) map.get(HttpHeaders.CONTENT_TYPE)) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static long m12842d(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || CreateTicketViewModelKt.EmailId.equals(str)) {
                VolleyLog.m12811d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", VolleyLog.m12808a("Unable to parse dateStr: %s, falling back to 0", str), e);
            return 0L;
        }
    }
}
