package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class DiscreteDomain<C extends Comparable> {
    final boolean supportsFastOffset;

    /* JADX INFO: compiled from: Proguard */
    public static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {
        private static final long serialVersionUID = 0;
        private static final BigIntegerDomain INSTANCE = new BigIntegerDomain();
        private static final BigInteger MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
        private static final BigInteger MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);

        public BigIntegerDomain() {
            super(true, null);
        }

        public static /* synthetic */ BigIntegerDomain access$300() {
            return INSTANCE;
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(Comparable comparable, Comparable comparable2) {
            return distance((BigInteger) comparable, (BigInteger) comparable2);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Comparable next(Comparable comparable) {
            return next((BigInteger) comparable);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Comparable offset(Comparable comparable, long j) {
            return offset((BigInteger) comparable, j);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Comparable previous(Comparable comparable) {
            return previous((BigInteger) comparable);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(MIN_LONG).min(MAX_LONG).longValue();
        }

        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        public BigInteger offset(BigInteger bigInteger, long j) {
            CollectPreconditions.checkNonnegative(j, "distance");
            return bigInteger.add(BigInteger.valueOf(j));
        }

        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {
        private static final IntegerDomain INSTANCE = new IntegerDomain();
        private static final long serialVersionUID = 0;

        public IntegerDomain() {
            super(true, null);
        }

        public static /* synthetic */ IntegerDomain access$000() {
            return INSTANCE;
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(Comparable comparable, Comparable comparable2) {
            return distance((Integer) comparable, (Integer) comparable2);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Comparable maxValue() {
            return maxValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Comparable minValue() {
            return minValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        public /* bridge */ /* synthetic */ Comparable next(Comparable comparable) {
            return next((Integer) comparable);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Comparable offset(Comparable comparable, long j) {
            return offset((Integer) comparable, j);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        public /* bridge */ /* synthetic */ Comparable previous(Comparable comparable) {
            return previous((Integer) comparable);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        public long distance(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @CheckForNull
        public Integer next(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        public Integer offset(Integer num, long j) {
            CollectPreconditions.checkNonnegative(j, "distance");
            return Integer.valueOf(Ints.checkedCast(num.longValue() + j));
        }

        @CheckForNull
        public Integer previous(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LongDomain extends DiscreteDomain<Long> implements Serializable {
        private static final LongDomain INSTANCE = new LongDomain();
        private static final long serialVersionUID = 0;

        public LongDomain() {
            super(true, null);
        }

        public static /* synthetic */ LongDomain access$200() {
            return INSTANCE;
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ long distance(Comparable comparable, Comparable comparable2) {
            return distance((Long) comparable, (Long) comparable2);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Comparable maxValue() {
            return maxValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Comparable minValue() {
            return minValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        public /* bridge */ /* synthetic */ Comparable next(Comparable comparable) {
            return next((Long) comparable);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public /* bridge */ /* synthetic */ Comparable offset(Comparable comparable, long j) {
            return offset((Long) comparable, j);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        public /* bridge */ /* synthetic */ Comparable previous(Comparable comparable) {
            return previous((Long) comparable);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        public long distance(Long l, Long l2) {
            long jLongValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l2.longValue() >= l.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @CheckForNull
        public Long next(Long l) {
            long jLongValue = l.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        public Long offset(Long l, long j) {
            CollectPreconditions.checkNonnegative(j, "distance");
            long jLongValue = l.longValue() + j;
            if (jLongValue < 0) {
                Preconditions.checkArgument(l.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        @CheckForNull
        public Long previous(Long l) {
            long jLongValue = l.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }
    }

    public /* synthetic */ DiscreteDomain(boolean z2, C41881 c41881) {
        this(z2);
    }

    public static DiscreteDomain<BigInteger> bigIntegers() {
        return BigIntegerDomain.access$300();
    }

    public static DiscreteDomain<Integer> integers() {
        return IntegerDomain.access$000();
    }

    public static DiscreteDomain<Long> longs() {
        return LongDomain.access$200();
    }

    public abstract long distance(C c2, C c3);

    @CanIgnoreReturnValue
    public C maxValue() {
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    public C minValue() {
        throw new NoSuchElementException();
    }

    @CheckForNull
    public abstract C next(C c2);

    public C offset(C c2, long j) {
        CollectPreconditions.checkNonnegative(j, "distance");
        C c3 = c2;
        for (long j2 = 0; j2 < j; j2++) {
            c3 = (C) next(c3);
            if (c3 == null) {
                throw new IllegalArgumentException("overflowed computing offset(" + c2 + ", " + j + ")");
            }
        }
        return c3;
    }

    @CheckForNull
    public abstract C previous(C c2);

    public DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean z2) {
        this.supportsFastOffset = z2;
    }
}
