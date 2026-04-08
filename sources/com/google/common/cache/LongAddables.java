package com.google.common.cache;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
final class LongAddables {
    private static final Supplier<LongAddable> SUPPLIER;

    /* JADX INFO: renamed from: com.google.common.cache.LongAddables$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C41501 implements Supplier<LongAddable> {
        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ LongAddable get() {
            return get();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public LongAddable get() {
            return new LongAdder();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LongAddables$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C41512 implements Supplier<LongAddable> {
        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ LongAddable get() {
            return get();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public LongAddable get() {
            return new PureJavaLongAddable(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        private PureJavaLongAddable() {
        }

        @Override // com.google.common.cache.LongAddable
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // com.google.common.cache.LongAddable
        public void increment() {
            getAndIncrement();
        }

        @Override // com.google.common.cache.LongAddable
        public long sum() {
            return get();
        }

        public /* synthetic */ PureJavaLongAddable(C41501 c41501) {
            this();
        }
    }

    static {
        Supplier<LongAddable> c41512;
        try {
            new LongAdder();
            c41512 = new C41501();
        } catch (Throwable unused) {
            c41512 = new C41512();
        }
        SUPPLIER = c41512;
    }

    public static LongAddable create() {
        return SUPPLIER.get();
    }
}
