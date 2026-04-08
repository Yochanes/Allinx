package com.google.common.base;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@DoNotMock("Use Optional.of(value) or Optional.absent()")
@GwtCompatible(serializable = BuildConfig.IS_FOR_ENGAGELAB)
@ElementTypesAreNonnullByDefault
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.base.Optional$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C41111 implements Iterable<T> {
        final /* synthetic */ Iterable val$optionals;

        /* JADX INFO: renamed from: com.google.common.base.Optional$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends AbstractIterator<T> {
            private final Iterator<? extends Optional<? extends T>> iterator;

            public AnonymousClass1() {
                this.iterator = (Iterator) Preconditions.checkNotNull(C41111.this.val$optionals.iterator());
            }

            @Override // com.google.common.base.AbstractIterator
            @CheckForNull
            public T computeNext() {
                while (this.iterator.hasNext()) {
                    Optional<? extends T> next = this.iterator.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return endOfData();
            }
        }

        public C41111(Iterable iterable) {
            this.val$optionals = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new AnonymousClass1();
        }
    }

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> fromNullable(@CheckForNull T t) {
        return t == null ? absent() : new Present(t);
    }

    /* JADX INFO: renamed from: of */
    public static <T> Optional<T> m14762of(T t) {
        return new Present(Preconditions.checkNotNull(t));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new C41111(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@CheckForNull Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* JADX INFO: renamed from: or */
    public abstract Optional<T> mo14754or(Optional<? extends T> optional);

    /* JADX INFO: renamed from: or */
    public abstract T mo14755or(Supplier<? extends T> supplier);

    /* JADX INFO: renamed from: or */
    public abstract T mo14756or(T t);

    @CheckForNull
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
