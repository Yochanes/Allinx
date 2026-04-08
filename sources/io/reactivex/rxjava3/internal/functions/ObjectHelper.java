package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.BiPredicate;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObjectHelper {

    /* JADX INFO: compiled from: Proguard */
    public static final class BiObjectPredicate implements BiPredicate<Object, Object> {
    }

    /* JADX INFO: renamed from: a */
    public static void m17964a(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
