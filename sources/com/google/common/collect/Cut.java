package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    private static final long serialVersionUID = 0;
    final C endpoint;

    /* JADX INFO: renamed from: com.google.common.collect.Cut$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C41851 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType;

        static {
            int[] iArr = new int[BoundType.values().length];
            $SwitchMap$com$google$common$collect$BoundType = iArr;
            try {
                iArr[BoundType.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$collect$BoundType[BoundType.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class AboveAll extends Cut<Comparable<?>> {
        private static final AboveAll INSTANCE = new AboveAll();
        private static final long serialVersionUID = 0;

        private AboveAll() {
            super("");
        }

        public static /* synthetic */ AboveAll access$100() {
            return INSTANCE;
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.collect.Cut
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> endpoint() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> greatestValueBelow(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.maxValue();
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        public boolean isLessThan(Comparable<?> comparable) {
            return false;
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> leastValueAbove(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        public String toString() {
            return "+∞";
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsLowerBound() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsUpperBound() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withLowerBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withUpperBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut<Comparable<?>>) obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        public AboveValue(C c2) {
            super((Comparable) Preconditions.checkNotNull(c2));
        }

        @Override // com.google.common.collect.Cut
        public Cut<C> canonical(DiscreteDomain<C> discreteDomain) {
            Comparable comparableLeastValueAbove = leastValueAbove(discreteDomain);
            return comparableLeastValueAbove != null ? Cut.belowValue(comparableLeastValueAbove) : Cut.aboveAll();
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
            sb.append('(');
            sb.append(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(']');
        }

        @Override // com.google.common.collect.Cut
        public C greatestValueBelow(DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return ~this.endpoint.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public boolean isLessThan(C c2) {
            return Range.compareOrThrow(this.endpoint, c2) < 0;
        }

        @Override // com.google.common.collect.Cut
        @CheckForNull
        public C leastValueAbove(DiscreteDomain<C> discreteDomain) {
            return (C) discreteDomain.next(this.endpoint);
        }

        public String toString() {
            return RemoteSettings.FORWARD_SLASH_STRING + this.endpoint + "\\";
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsLowerBound() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsUpperBound() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        public Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C41851.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                Comparable next = discreteDomain.next(this.endpoint);
                return next == null ? Cut.belowAll() : Cut.belowValue(next);
            }
            if (i == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C41851.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i != 2) {
                throw new AssertionError();
            }
            Comparable next = discreteDomain.next(this.endpoint);
            return next == null ? Cut.aboveAll() : Cut.belowValue(next);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BelowAll extends Cut<Comparable<?>> {
        private static final BelowAll INSTANCE = new BelowAll();
        private static final long serialVersionUID = 0;

        private BelowAll() {
            super("");
        }

        public static /* synthetic */ BelowAll access$000() {
            return INSTANCE;
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> canonical(DiscreteDomain<Comparable<?>> discreteDomain) {
            try {
                return Cut.belowValue(discreteDomain.minValue());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.Cut
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> endpoint() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> greatestValueBelow(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        public boolean isLessThan(Comparable<?> comparable) {
            return true;
        }

        @Override // com.google.common.collect.Cut
        public Comparable<?> leastValueAbove(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.minValue();
        }

        public String toString() {
            return "-∞";
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsLowerBound() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsUpperBound() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withLowerBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public Cut<Comparable<?>> withUpperBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut<Comparable<?>>) obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        public BelowValue(C c2) {
            super((Comparable) Preconditions.checkNotNull(c2));
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public void describeAsLowerBound(StringBuilder sb) {
            sb.append('[');
            sb.append(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        public void describeAsUpperBound(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(')');
        }

        @Override // com.google.common.collect.Cut
        @CheckForNull
        public C greatestValueBelow(DiscreteDomain<C> discreteDomain) {
            return (C) discreteDomain.previous(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return this.endpoint.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public boolean isLessThan(C c2) {
            return Range.compareOrThrow(this.endpoint, c2) <= 0;
        }

        @Override // com.google.common.collect.Cut
        public C leastValueAbove(DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        public String toString() {
            return "\\" + this.endpoint + RemoteSettings.FORWARD_SLASH_STRING;
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsLowerBound() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        public BoundType typeAsUpperBound() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        public Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C41851.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i != 2) {
                throw new AssertionError();
            }
            Comparable comparablePrevious = discreteDomain.previous(this.endpoint);
            return comparablePrevious == null ? Cut.belowAll() : new AboveValue(comparablePrevious);
        }

        @Override // com.google.common.collect.Cut
        public Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C41851.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                Comparable comparablePrevious = discreteDomain.previous(this.endpoint);
                return comparablePrevious == null ? Cut.aboveAll() : new AboveValue(comparablePrevious);
            }
            if (i == 2) {
                return this;
            }
            throw new AssertionError();
        }
    }

    public Cut(C c2) {
        this.endpoint = c2;
    }

    public static <C extends Comparable> Cut<C> aboveAll() {
        return AboveAll.access$100();
    }

    public static <C extends Comparable> Cut<C> aboveValue(C c2) {
        return new AboveValue(c2);
    }

    public static <C extends Comparable> Cut<C> belowAll() {
        return BelowAll.access$000();
    }

    public static <C extends Comparable> Cut<C> belowValue(C c2) {
        return new BelowValue(c2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Cut) obj);
    }

    public abstract void describeAsLowerBound(StringBuilder sb);

    public abstract void describeAsUpperBound(StringBuilder sb);

    public C endpoint() {
        return this.endpoint;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Cut) {
            try {
                if (compareTo((Cut) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @CheckForNull
    public abstract C greatestValueBelow(DiscreteDomain<C> discreteDomain);

    public abstract int hashCode();

    public abstract boolean isLessThan(C c2);

    @CheckForNull
    public abstract C leastValueAbove(DiscreteDomain<C> discreteDomain);

    public abstract BoundType typeAsLowerBound();

    public abstract BoundType typeAsUpperBound();

    public abstract Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain);

    public abstract Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain);

    public int compareTo(Cut<C> cut) {
        if (cut == belowAll()) {
            return 1;
        }
        if (cut == aboveAll()) {
            return -1;
        }
        int iCompareOrThrow = Range.compareOrThrow(this.endpoint, cut.endpoint);
        return iCompareOrThrow != 0 ? iCompareOrThrow : Boolean.compare(this instanceof AboveValue, cut instanceof AboveValue);
    }

    public Cut<C> canonical(DiscreteDomain<C> discreteDomain) {
        return this;
    }
}
