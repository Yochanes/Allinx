package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaClassFinderKt {
    /* JADX INFO: renamed from: a */
    public static final Class m19103a(ClassLoader classLoader, String fqName) {
        Intrinsics.m18599g(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
