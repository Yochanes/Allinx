package com.android.volley.toolbox;

import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class NetworkUtility {

    /* JADX INFO: compiled from: Proguard */
    public static class RetryInfo {

        /* JADX INFO: renamed from: a */
        public final String f35023a;

        /* JADX INFO: renamed from: b */
        public final VolleyError f35024b;

        public RetryInfo(String str, VolleyError volleyError) {
            this.f35023a = str;
            this.f35024b = volleyError;
        }
    }

    /* JADX INFO: renamed from: a */
    public static NetworkResponse m12845a(Request request, List list) {
        Cache.Entry entry = request.f34953q;
        if (entry == null) {
            return new NetworkResponse(304, null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((Header) it.next()).f34930a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = entry.f34911h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (Header header : entry.f34911h) {
                    if (!treeSet.contains(header.f34930a)) {
                        arrayList.add(header);
                    }
                }
            }
        } else if (!entry.f34910g.isEmpty()) {
            for (Map.Entry entry2 : entry.f34910g.entrySet()) {
                if (!treeSet.contains(entry2.getKey())) {
                    arrayList.add(new Header((String) entry2.getKey(), (String) entry2.getValue()));
                }
            }
        }
        return new NetworkResponse(304, entry.f34904a, true, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m12846b(InputStream inputStream, int i, ByteArrayPool byteArrayPool) throws Throwable {
        byte[] bArrM12819a;
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(byteArrayPool, i);
        try {
            bArrM12819a = byteArrayPool.m12819a(UserMetadata.MAX_ATTRIBUTE_SIZE);
            while (true) {
                try {
                    int i2 = inputStream.read(bArrM12819a);
                    if (i2 == -1) {
                        break;
                    }
                    poolingByteArrayOutputStream.write(bArrM12819a, 0, i2);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        VolleyLog.m12811d("Error occurred when closing InputStream", new Object[0]);
                    }
                    byteArrayPool.m12820b(bArrM12819a);
                    poolingByteArrayOutputStream.close();
                    throw th;
                }
            }
            byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                VolleyLog.m12811d("Error occurred when closing InputStream", new Object[0]);
            }
            byteArrayPool.m12820b(bArrM12819a);
            poolingByteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrM12819a = null;
        }
    }
}
