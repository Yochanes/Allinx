package com.google.common.hash;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
final class LongAddables {
    private static final Supplier<LongAddable> SUPPLIER;

    /* JADX INFO: renamed from: com.google.common.hash.LongAddables$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C44381 implements Supplier<LongAddable> {
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

    /* JADX INFO: renamed from: com.google.common.hash.LongAddables$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C44392 implements Supplier<LongAddable> {
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

        @Override // com.google.common.hash.LongAddable
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // com.google.common.hash.LongAddable
        public void increment() {
            getAndIncrement();
        }

        @Override // com.google.common.hash.LongAddable
        public long sum() {
            return get();
        }

        public /* synthetic */ PureJavaLongAddable(C44381 c44381) {
            this();
        }
    }

    static {
        Supplier<LongAddable> c44392;
        try {
            new LongAdder();
            c44392 = new C44381();
        } catch (Throwable unused) {
            c44392 = new C44392();
        }
        SUPPLIER = c44392;
    }

    public static LongAddable create() {
        return SUPPLIER.get();
    }
}
