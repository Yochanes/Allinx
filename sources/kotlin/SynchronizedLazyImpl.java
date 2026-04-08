package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class SynchronizedLazyImpl<T> implements Lazy<T>, Serializable {

    /* JADX INFO: renamed from: a */
    public Function0 f51436a;

    /* JADX INFO: renamed from: b */
    public volatile Object f51437b;

    /* JADX INFO: renamed from: c */
    public final Object f51438c;

    public SynchronizedLazyImpl(Function0 initializer) {
        Intrinsics.m18599g(initializer, "initializer");
        this.f51436a = initializer;
        this.f51437b = UNINITIALIZED_VALUE.f51454a;
        this.f51438c = this;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f51437b;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f51454a;
        if (obj != uninitialized_value) {
            return obj;
        }
        synchronized (this.f51438c) {
            objInvoke = this.f51437b;
            if (objInvoke == uninitialized_value) {
                Function0 function0 = this.f51436a;
                Intrinsics.m18596d(function0);
                objInvoke = function0.invoke();
                this.f51437b = objInvoke;
                this.f51436a = null;
            }
        }
        return objInvoke;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f51437b != UNINITIALIZED_VALUE.f51454a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
