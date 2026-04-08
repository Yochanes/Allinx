package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class CollectionJsonAdapter<C extends Collection<T>, T> extends JsonAdapter<C> {

    /* JADX INFO: renamed from: a */
    public static final JsonAdapter.Factory f43382a = new C50141();

    /* JADX INFO: renamed from: com.squareup.moshi.CollectionJsonAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C50141 implements JsonAdapter.Factory {
    }

    /* JADX INFO: renamed from: com.squareup.moshi.CollectionJsonAdapter$2 */
    /* JADX INFO: compiled from: Proguard */
    class C50152 extends CollectionJsonAdapter<Collection<Object>, Object> {
    }

    /* JADX INFO: renamed from: com.squareup.moshi.CollectionJsonAdapter$3 */
    /* JADX INFO: compiled from: Proguard */
    class C50163 extends CollectionJsonAdapter<Set<Object>, Object> {
    }

    public final String toString() {
        return ((Object) null) + ".collection()";
    }
}
