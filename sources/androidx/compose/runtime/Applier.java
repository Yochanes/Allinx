package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/Applier;", "N", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface Applier<N> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    default void mo4195a(Object obj, Function2 function2) {
        function2.invoke(mo4191i(), obj);
    }

    /* JADX INFO: renamed from: b */
    void mo4196b(int i, Object obj);

    /* JADX INFO: renamed from: c */
    void mo4189c(Object obj);

    /* JADX INFO: renamed from: d */
    default void mo4197d() {
        Object objMo4191i = mo4191i();
        ComposeNodeLifecycleCallback composeNodeLifecycleCallback = objMo4191i instanceof ComposeNodeLifecycleCallback ? (ComposeNodeLifecycleCallback) objMo4191i : null;
        if (composeNodeLifecycleCallback != null) {
            composeNodeLifecycleCallback.mo4207k();
        }
    }

    /* JADX INFO: renamed from: e */
    void mo4198e(int i, int i2, int i3);

    /* JADX INFO: renamed from: f */
    void mo4199f(int i, int i2);

    /* JADX INFO: renamed from: g */
    void mo4190g();

    /* JADX INFO: renamed from: h */
    void mo4200h(int i, Object obj);

    /* JADX INFO: renamed from: i */
    Object mo4191i();
}
