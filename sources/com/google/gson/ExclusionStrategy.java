package com.google.gson;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface ExclusionStrategy {
    boolean shouldSkipClass(Class<?> cls);

    boolean shouldSkipField(FieldAttributes fieldAttributes);
}
