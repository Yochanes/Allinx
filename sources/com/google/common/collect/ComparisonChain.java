package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {
    private static final ComparisonChain ACTIVE = new C41811();
    private static final ComparisonChain LESS = new InactiveComparisonChain(-1);
    private static final ComparisonChain GREATER = new InactiveComparisonChain(1);

    /* JADX INFO: renamed from: com.google.common.collect.ComparisonChain$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C41811 extends ComparisonChain {
        public C41811() {
            super(null);
        }

        public ComparisonChain classify(int i) {
            return i < 0 ? ComparisonChain.access$100() : i > 0 ? ComparisonChain.access$200() : ComparisonChain.access$300();
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return classify(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z2, boolean z3) {
            return classify(Boolean.compare(z2, z3));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z2, boolean z3) {
            return classify(Boolean.compare(z3, z2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator) {
            return classify(comparator.compare(t, t2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i, int i2) {
            return classify(Integer.compare(i, i2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j, long j2) {
            return classify(Long.compare(j, j2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f, float f2) {
            return classify(Float.compare(f, f2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d, double d2) {
            return classify(Double.compare(d, d2));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InactiveComparisonChain extends ComparisonChain {
        final int result;

        public InactiveComparisonChain(int i) {
            super(null);
            this.result = i;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d, double d2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return this.result;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f, float f2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j, long j2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z2, boolean z3) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z2, boolean z3) {
            return this;
        }
    }

    public /* synthetic */ ComparisonChain(C41811 c41811) {
        this();
    }

    public static /* synthetic */ ComparisonChain access$100() {
        return LESS;
    }

    public static /* synthetic */ ComparisonChain access$200() {
        return GREATER;
    }

    public static /* synthetic */ ComparisonChain access$300() {
        return ACTIVE;
    }

    public static ComparisonChain start() {
        return ACTIVE;
    }

    public abstract ComparisonChain compare(double d, double d2);

    public abstract ComparisonChain compare(float f, float f2);

    public abstract ComparisonChain compare(int i, int i2);

    public abstract ComparisonChain compare(long j, long j2);

    @Deprecated
    public final ComparisonChain compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> ComparisonChain compare(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator);

    public abstract ComparisonChain compareFalseFirst(boolean z2, boolean z3);

    public abstract ComparisonChain compareTrueFirst(boolean z2, boolean z3);

    public abstract int result();

    private ComparisonChain() {
    }
}
