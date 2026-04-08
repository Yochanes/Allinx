package com.android.volley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class NetworkResponse {

    /* JADX INFO: renamed from: a */
    public final int f34937a;

    /* JADX INFO: renamed from: b */
    public final byte[] f34938b;

    /* JADX INFO: renamed from: c */
    public final Map f34939c;

    /* JADX INFO: renamed from: d */
    public final List f34940d;

    /* JADX INFO: renamed from: e */
    public final boolean f34941e;

    public NetworkResponse(int i, byte[] bArr, Map map, List list, boolean z2) {
        this.f34937a = i;
        this.f34938b = bArr;
        this.f34939c = map;
        if (list == null) {
            this.f34940d = null;
        } else {
            this.f34940d = Collections.unmodifiableList(list);
        }
        this.f34941e = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    public NetworkResponse(int i, byte[] bArr, boolean z2, List list) {
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Header header = (Header) it.next();
                treeMap.put(header.f34930a, header.f34931b);
            }
        }
        this(i, bArr, treeMap, list, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public NetworkResponse(byte[] bArr, Map map) {
        ?? arrayList;
        if (map == null) {
            arrayList = 0;
        } else if (map.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new Header((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(200, bArr, map, arrayList, false);
    }
}
