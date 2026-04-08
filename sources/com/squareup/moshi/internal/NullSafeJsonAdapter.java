package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NullSafeJsonAdapter<T> extends JsonAdapter<T> {
    public final String toString() {
        return ((Object) null) + ".nullSafe()";
    }
}
