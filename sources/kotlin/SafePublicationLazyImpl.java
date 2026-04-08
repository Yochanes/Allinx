package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\tR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m18302d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "b", "Ljava/lang/Object;", "_value", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class SafePublicationLazyImpl<T> implements Lazy<T>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f51433c = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "b");

    /* JADX INFO: renamed from: a */
    public volatile Function0 f51434a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile Object _value;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001Rd\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Lkotlin/SafePublicationLazyImpl$Companion;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/SafePublicationLazyImpl;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj = this._value;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f51454a;
        if (obj != uninitialized_value) {
            return obj;
        }
        Function0 function0 = this.f51434a;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f51433c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, uninitialized_value, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != uninitialized_value) {
                }
            }
            this.f51434a = null;
            return objInvoke;
        }
        return this._value;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this._value != UNINITIALIZED_VALUE.f51454a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
