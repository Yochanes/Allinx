package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class WeakClassLoaderBox {

    /* JADX INFO: renamed from: a */
    public final WeakReference f51958a;

    /* JADX INFO: renamed from: b */
    public final int f51959b;

    public WeakClassLoaderBox(ClassLoader classLoader) {
        this.f51958a = new WeakReference(classLoader);
        this.f51959b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WeakClassLoaderBox) && this.f51958a.get() == ((WeakClassLoaderBox) obj).f51958a.get();
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF51959b() {
        return this.f51959b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f51958a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
