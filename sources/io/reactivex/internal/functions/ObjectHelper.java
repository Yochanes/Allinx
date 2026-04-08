package io.reactivex.internal.functions;

import io.reactivex.functions.BiPredicate;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObjectHelper {

    /* JADX INFO: compiled from: Proguard */
    public static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        @Override // io.reactivex.functions.BiPredicate
        /* JADX INFO: renamed from: a */
        public final boolean mo15433a(Object obj, Object obj2) {
            return ObjectHelper.m17627a(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17627a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m17628b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m17629c(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
