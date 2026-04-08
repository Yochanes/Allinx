package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/LazyKt__LazyJVMKt", "kotlin/LazyKt__LazyKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class LazyKt extends LazyKt__LazyKt {
    /* JADX INFO: renamed from: a */
    public static Lazy m18298a(LazyThreadSafetyMode lazyThreadSafetyMode, Function0 initializer) {
        Intrinsics.m18599g(initializer, "initializer");
        int iOrdinal = lazyThreadSafetyMode.ordinal();
        if (iOrdinal == 0) {
            return new SynchronizedLazyImpl(initializer);
        }
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f51454a;
        if (iOrdinal == 1) {
            SafePublicationLazyImpl safePublicationLazyImpl = new SafePublicationLazyImpl();
            safePublicationLazyImpl.f51434a = initializer;
            safePublicationLazyImpl._value = uninitialized_value;
            return safePublicationLazyImpl;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        UnsafeLazyImpl unsafeLazyImpl = new UnsafeLazyImpl();
        unsafeLazyImpl.f51460a = initializer;
        unsafeLazyImpl.f51461b = uninitialized_value;
        return unsafeLazyImpl;
    }

    /* JADX INFO: renamed from: b */
    public static Lazy m18299b(Function0 initializer) {
        Intrinsics.m18599g(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer);
    }
}
