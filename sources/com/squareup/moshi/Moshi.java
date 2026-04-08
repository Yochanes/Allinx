package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Moshi {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f43420b;

    /* JADX INFO: renamed from: a */
    public final List f43421a;

    /* JADX INFO: renamed from: com.squareup.moshi.Moshi$1 */
    /* JADX INFO: compiled from: Proguard */
    class C50281 implements JsonAdapter.Factory {
    }

    /* JADX INFO: renamed from: com.squareup.moshi.Moshi$2 */
    /* JADX INFO: compiled from: Proguard */
    class C50292 implements JsonAdapter.Factory {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final ArrayList f43422a = new ArrayList();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Lookup<T> extends JsonAdapter<T> {
        public final String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class LookupChain {
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f43420b = arrayList;
        arrayList.add(StandardJsonAdapters.f43423a);
        arrayList.add(CollectionJsonAdapter.f43382a);
        arrayList.add(MapJsonAdapter.f43419a);
        arrayList.add(ArrayJsonAdapter.f43380a);
        arrayList.add(ClassJsonAdapter.f43381a);
    }

    public Moshi(Builder builder) {
        new ThreadLocal();
        new LinkedHashMap();
        ArrayList arrayList = builder.f43422a;
        int size = arrayList.size();
        ArrayList arrayList2 = f43420b;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f43421a = Collections.unmodifiableList(arrayList3);
    }
}
