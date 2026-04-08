package com.google.common.collect;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
@ElementTypesAreNonnullByDefault
public final class Sets {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C42961<E> extends SetView<E> {
        final /* synthetic */ Set val$set1;
        final /* synthetic */ Set val$set2;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends AbstractIterator<E> {
            final Iterator<? extends E> itr1;
            final Iterator<? extends E> itr2;

            public AnonymousClass1() {
                this.itr1 = C42961.this.val$set1.iterator();
                this.itr2 = C42961.this.val$set2.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public E computeNext() {
                if (this.itr1.hasNext()) {
                    return this.itr1.next();
                }
                while (this.itr2.hasNext()) {
                    E next = this.itr2.next();
                    if (!C42961.this.val$set1.contains(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42961(Set set, Set set2) {
            super(null);
            this.val$set1 = set;
            this.val$set2 = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.val$set1.contains(obj) || this.val$set2.contains(obj);
        }

        @Override // com.google.common.collect.Sets.SetView
        public <S extends Set<E>> S copyInto(S s) {
            s.addAll(this.val$set1);
            s.addAll(this.val$set2);
            return s;
        }

        @Override // com.google.common.collect.Sets.SetView
        public ImmutableSet<E> immutableCopy() {
            return new ImmutableSet.Builder().addAll((Iterable) this.val$set1).addAll((Iterable) this.val$set2).build();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.val$set1.isEmpty() && this.val$set2.isEmpty();
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.val$set1.size();
            Iterator<E> it = this.val$set2.iterator();
            while (it.hasNext()) {
                if (!this.val$set1.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
            return new AnonymousClass1();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C42972<E> extends SetView<E> {
        final /* synthetic */ Set val$set1;
        final /* synthetic */ Set val$set2;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends AbstractIterator<E> {
            final Iterator<E> itr;

            public AnonymousClass1() {
                this.itr = C42972.this.val$set1.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public E computeNext() {
                while (this.itr.hasNext()) {
                    E next = this.itr.next();
                    if (C42972.this.val$set2.contains(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42972(Set set, Set set2) {
            super(null);
            this.val$set1 = set;
            this.val$set2 = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.val$set1.contains(obj) && this.val$set2.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.val$set1.containsAll(collection) && this.val$set2.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.val$set2, this.val$set1);
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.val$set1.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.val$set2.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
            return new AnonymousClass1();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C42983<E> extends SetView<E> {
        final /* synthetic */ Set val$set1;
        final /* synthetic */ Set val$set2;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends AbstractIterator<E> {
            final Iterator<E> itr;

            public AnonymousClass1() {
                this.itr = C42983.this.val$set1.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public E computeNext() {
                while (this.itr.hasNext()) {
                    E next = this.itr.next();
                    if (!C42983.this.val$set2.contains(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42983(Set set, Set set2) {
            super(null);
            this.val$set1 = set;
            this.val$set2 = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.val$set1.contains(obj) && !this.val$set2.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.val$set2.containsAll(this.val$set1);
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.val$set1.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!this.val$set2.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
            return new AnonymousClass1();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C42994<E> extends SetView<E> {
        final /* synthetic */ Set val$set1;
        final /* synthetic */ Set val$set2;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends AbstractIterator<E> {
            final /* synthetic */ C42994 this$0;
            final /* synthetic */ Iterator val$itr1;
            final /* synthetic */ Iterator val$itr2;

            public AnonymousClass1(C42994 c42994, Iterator it, Iterator it2) {
                this.val$itr1 = it;
                this.val$itr2 = it2;
                this.this$0 = c42994;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public E computeNext() {
                while (this.val$itr1.hasNext()) {
                    E e = (E) this.val$itr1.next();
                    if (!this.this$0.val$set2.contains(e)) {
                        return e;
                    }
                }
                while (this.val$itr2.hasNext()) {
                    E e2 = (E) this.val$itr2.next();
                    if (!this.this$0.val$set1.contains(e2)) {
                        return e2;
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42994(Set set, Set set2) {
            super(null);
            this.val$set1 = set;
            this.val$set2 = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.val$set2.contains(obj) ^ this.val$set1.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.val$set1.equals(this.val$set2);
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.val$set1.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!this.val$set2.contains(it.next())) {
                    i++;
                }
            }
            Iterator<E> it2 = this.val$set2.iterator();
            while (it2.hasNext()) {
                if (!this.val$set1.contains(it2.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
            return new AnonymousClass1(this, this.val$set1.iterator(), this.val$set2.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C43005<E> extends AbstractSet<Set<E>> {
        final /* synthetic */ ImmutableMap val$index;
        final /* synthetic */ int val$size;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends AbstractIterator<Set<E>> {
            final BitSet bits;

            /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Proguard */
            public class C64521 extends AbstractSet<E> {
                final /* synthetic */ AnonymousClass1 this$1;
                final /* synthetic */ BitSet val$copy;

                /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Proguard */
                public class C64531 extends AbstractIterator<E> {

                    /* JADX INFO: renamed from: i */
                    int f42586i = -1;

                    public C64531() {
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public E computeNext() {
                        int iNextSetBit = C64521.this.val$copy.nextSetBit(this.f42586i + 1);
                        this.f42586i = iNextSetBit;
                        return iNextSetBit == -1 ? endOfData() : C43005.this.val$index.keySet().asList().get(this.f42586i);
                    }
                }

                public C64521(AnonymousClass1 anonymousClass1, BitSet bitSet) {
                    this.val$copy = bitSet;
                    this.this$1 = anonymousClass1;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@CheckForNull Object obj) {
                    Integer num = (Integer) C43005.this.val$index.get(obj);
                    return num != null && this.val$copy.get(num.intValue());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new C64531();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return C43005.this.val$size;
                }
            }

            public AnonymousClass1() {
                this.bits = new BitSet(C43005.this.val$index.size());
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public /* bridge */ /* synthetic */ Object computeNext() {
                return computeNext();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Set<E> computeNext() {
                if (this.bits.isEmpty()) {
                    this.bits.set(0, C43005.this.val$size);
                } else {
                    int iNextSetBit = this.bits.nextSetBit(0);
                    int iNextClearBit = this.bits.nextClearBit(iNextSetBit);
                    if (iNextClearBit == C43005.this.val$index.size()) {
                        return endOfData();
                    }
                    int i = (iNextClearBit - iNextSetBit) - 1;
                    this.bits.set(0, i);
                    this.bits.clear(i, iNextClearBit);
                    this.bits.set(iNextClearBit);
                }
                return new C64521(this, (BitSet) this.bits.clone());
            }
        }

        public C43005(int i, ImmutableMap immutableMap) {
            this.val$size = i;
            this.val$index = immutableMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (set.size() == this.val$size && this.val$index.keySet().containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return IntMath.binomial(this.val$index.size(), this.val$size);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder("Sets.combinations(");
            sb.append(this.val$index.keySet());
            sb.append(", ");
            return AbstractC0000a.m11h(this.val$size, ")", sb);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {
        private final transient ImmutableList<ImmutableSet<E>> axes;
        private final transient CartesianList<E> delegate;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$CartesianSet$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C43011 extends ImmutableList<List<E>> {
            final /* synthetic */ ImmutableList val$axes;

            public C43011(ImmutableList immutableList) {
                this.val$axes = immutableList;
            }

            @Override // java.util.List
            public /* bridge */ /* synthetic */ Object get(int i) {
                return get(i);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.val$axes.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            @GwtIncompatible
            public Object writeReplace() {
                return super.writeReplace();
            }

            @Override // java.util.List
            public List<E> get(int i) {
                return ((ImmutableSet) this.val$axes.get(i)).asList();
            }
        }

        private CartesianSet(ImmutableList<ImmutableSet<E>> immutableList, CartesianList<E> cartesianList) {
            this.axes = immutableList;
            this.delegate = cartesianList;
        }

        public static <E> Set<List<E>> create(List<? extends Set<? extends E>> list) {
            ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
            Iterator<? extends Set<? extends E>> it = list.iterator();
            while (it.hasNext()) {
                ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) it.next());
                if (immutableSetCopyOf.isEmpty()) {
                    return ImmutableSet.m14872of();
                }
                builder.add(immutableSetCopyOf);
            }
            ImmutableList<E> immutableListBuild = builder.build();
            return new CartesianSet(immutableListBuild, new CartesianList(new C43011(immutableListBuild)));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (list.size() != this.axes.size()) {
                return false;
            }
            Iterator<E> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!this.axes.get(i).contains(it.next())) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
            return delegate();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof CartesianSet) {
                return this.axes.equals(((CartesianSet) obj).axes);
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i = 1;
            int size = size() - 1;
            for (int i2 = 0; i2 < this.axes.size(); i2++) {
                size = ~(~(size * 31));
            }
            UnmodifiableIterator<ImmutableSet<E>> it = this.axes.iterator();
            while (it.hasNext()) {
                ImmutableSet<E> next = it.next();
                i = ~(~((next.hashCode() * (size() / next.size())) + (i * 31)));
            }
            return ~(~(i + size));
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<List<E>> delegate() {
            return this.delegate;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @GwtIncompatible
    public static class DescendingSet<E> extends ForwardingNavigableSet<E> {
        private final NavigableSet<E> forward;

        public DescendingSet(NavigableSet<E> navigableSet) {
            this.forward = navigableSet;
        }

        private static <T> Ordering<T> reverse(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E ceiling(@ParametricNullness E e) {
            return this.forward.floor(e);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.forward.comparator();
            return comparator == null ? Ordering.natural().reverse() : reverse(comparator);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
            return delegate();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.forward.iterator();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.forward;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @ParametricNullness
        public E first() {
            return this.forward.last();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E floor(@ParametricNullness E e) {
            return this.forward.ceiling(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z2) {
            return this.forward.tailSet(e, z2).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E higher(@ParametricNullness E e) {
            return this.forward.lower(e);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.forward.descendingIterator();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @ParametricNullness
        public E last() {
            return this.forward.first();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E lower(@ParametricNullness E e) {
            return this.forward.higher(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return this.forward.pollLast();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return this.forward.pollFirst();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z2, @ParametricNullness E e2, boolean z3) {
            return this.forward.subSet(e2, z3, e, z2).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z2) {
            return this.forward.headSet(e, z2).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
            return delegate();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
            return standardHeadSet(e);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return standardSubSet(e, e2);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
            return standardTailSet(e);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Set delegate() {
            return delegate();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ SortedSet delegate() {
            return delegate();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public NavigableSet<E> delegate() {
            return this.forward;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @GwtIncompatible
    public static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        public FilteredNavigableSet(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
            super(navigableSet, predicate);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@ParametricNullness E e) {
            return (E) Iterables.find(unfiltered().tailSet(e, true), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.filter(unfiltered().descendingIterator(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return Sets.filter((NavigableSet) unfiltered().descendingSet(), (Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@ParametricNullness E e) {
            return (E) Iterators.find(unfiltered().headSet(e, true).descendingIterator(), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z2) {
            return Sets.filter((NavigableSet) unfiltered().headSet(e, z2), (Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@ParametricNullness E e) {
            return (E) Iterables.find(unfiltered().tailSet(e, false), this.predicate, null);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        @ParametricNullness
        public E last() {
            return (E) Iterators.find(unfiltered().descendingIterator(), this.predicate);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@ParametricNullness E e) {
            return (E) Iterators.find(unfiltered().headSet(e, false).descendingIterator(), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return (E) Iterables.removeFirstMatching(unfiltered(), this.predicate);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return (E) Iterables.removeFirstMatching(unfiltered().descendingSet(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z2, @ParametricNullness E e2, boolean z3) {
            return Sets.filter((NavigableSet) unfiltered().subSet(e, z2, e2, z3), (Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z2) {
            return Sets.filter((NavigableSet) unfiltered().tailSet(e, z2), (Predicate) this.predicate);
        }

        public NavigableSet<E> unfiltered() {
            return (NavigableSet) this.unfiltered;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        public FilteredSet(Set<E> set, Predicate<? super E> predicate) {
            super(set, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        public FilteredSortedSet(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
            super(sortedSet, predicate);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.unfiltered).comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E first() {
            return (E) Iterators.find(this.unfiltered.iterator(), this.predicate);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).headSet(e), this.predicate);
        }

        @ParametricNullness
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.unfiltered;
            while (true) {
                E e = (Object) sortedSetHeadSet.last();
                if (this.predicate.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).subSet(e, e2), this.predicate);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).tailSet(e), this.predicate);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.removeAllImpl(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PowerSet<E> extends AbstractSet<Set<E>> {
        final ImmutableMap<E, Integer> inputSet;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$PowerSet$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C43021 extends AbstractIndexedListIterator<Set<E>> {
            public C43021(int i) {
                super(i);
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public /* bridge */ /* synthetic */ Object get(int i) {
                return get(i);
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public Set<E> get(int i) {
                return new SubSet(PowerSet.this.inputSet, i);
            }
        }

        public PowerSet(Set<E> set) {
            Preconditions.checkArgument(set.size() <= 30, "Too many elements to create power set: %s > 30", set.size());
            this.inputSet = Maps.indexMap(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.inputSet.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return obj instanceof PowerSet ? this.inputSet.keySet().equals(((PowerSet) obj).inputSet.keySet()) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.inputSet.keySet().hashCode() << (this.inputSet.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new C43021(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.inputSet.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + this.inputSet + ")";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SetView<E> extends AbstractSet<E> {
        public /* synthetic */ SetView(C42961 c42961) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(@ParametricNullness E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        public <S extends Set<E>> S copyInto(S s) {
            s.addAll(this);
            return s;
        }

        public ImmutableSet<E> immutableCopy() {
            return ImmutableSet.copyOf((Collection) this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract UnmodifiableIterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private SetView() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubSet<E> extends AbstractSet<E> {
        private final ImmutableMap<E, Integer> inputSet;
        private final int mask;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$SubSet$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C43031 extends UnmodifiableIterator<E> {
            final ImmutableList<E> elements;
            int remainingSetBits;

            public C43031() {
                this.elements = SubSet.access$100(SubSet.this).keySet().asList();
                this.remainingSetBits = SubSet.access$200(SubSet.this);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.remainingSetBits != 0;
            }

            @Override // java.util.Iterator
            public E next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.remainingSetBits);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.remainingSetBits &= ~(1 << iNumberOfTrailingZeros);
                return this.elements.get(iNumberOfTrailingZeros);
            }
        }

        public SubSet(ImmutableMap<E, Integer> immutableMap, int i) {
            this.inputSet = immutableMap;
            this.mask = i;
        }

        public static /* synthetic */ ImmutableMap access$100(SubSet subSet) {
            return subSet.inputSet;
        }

        public static /* synthetic */ int access$200(SubSet subSet) {
            return subSet.mask;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            Integer num = this.inputSet.get(obj);
            if (num != null) {
                return ((1 << num.intValue()) & this.mask) != 0;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new C43031();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.mask);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        private final NavigableSet<E> delegate;

        @CheckForNull
        @LazyInit
        private transient UnmodifiableNavigableSet<E> descendingSet;
        private final SortedSet<E> unmodifiableDelegate;

        public UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) Preconditions.checkNotNull(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@ParametricNullness E e) {
            return this.delegate.ceiling(e);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
            return delegate();
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.unmodifiableIterator(this.delegate.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.descendingSet;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.descendingSet = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.descendingSet = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@ParametricNullness E e) {
            return this.delegate.floor(e);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z2) {
            return Sets.unmodifiableNavigableSet(this.delegate.headSet(e, z2));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@ParametricNullness E e) {
            return this.delegate.higher(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@ParametricNullness E e) {
            return this.delegate.lower(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z2, @ParametricNullness E e2, boolean z3) {
            return Sets.unmodifiableNavigableSet(this.delegate.subSet(e, z2, e2, z3));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z2) {
            return Sets.unmodifiableNavigableSet(this.delegate.tailSet(e, z2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
            return delegate();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Set delegate() {
            return delegate();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public SortedSet<E> delegate() {
            return this.unmodifiableDelegate;
        }
    }

    private Sets() {
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
        return CartesianSet.create(list);
    }

    public static <E> Set<Set<E>> combinations(Set<E> set, int i) {
        ImmutableMap immutableMapIndexMap = Maps.indexMap(set);
        CollectPreconditions.checkNonnegative(i, "size");
        Preconditions.checkArgument(i <= immutableMapIndexMap.size(), "size (%s) must be <= set.size() (%s)", i, immutableMapIndexMap.size());
        return i == 0 ? ImmutableSet.m14873of(ImmutableSet.m14872of()) : i == immutableMapIndexMap.size() ? ImmutableSet.m14873of(immutableMapIndexMap.keySet()) : new C43005(i, immutableMapIndexMap);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        Preconditions.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return makeComplementByHand(collection, collection.iterator().next().getDeclaringClass());
    }

    public static <E> SetView<E> difference(Set<E> set, Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C42983(set, set2);
    }

    public static boolean equalsImpl(Set<?> set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> filter(Set<E> set, Predicate<? super E> predicate) {
        if (set instanceof SortedSet) {
            return filter((SortedSet) set, (Predicate) predicate);
        }
        if (!(set instanceof FilteredSet)) {
            return new FilteredSet((Set) Preconditions.checkNotNull(set), (Predicate) Preconditions.checkNotNull(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) set;
        return new FilteredSet((Set) filteredSet.unfiltered, Predicates.and(filteredSet.predicate, predicate));
    }

    public static int hashCodeImpl(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    @GwtCompatible(serializable = BuildConfig.IS_FOR_ENGAGELAB)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(E e, E... eArr) {
        return ImmutableEnumSet.asImmutable(EnumSet.of((Enum) e, (Enum[]) eArr));
    }

    public static <E> SetView<E> intersection(Set<E> set, Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C42972(set, set2);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static <E extends Enum<E>> EnumSet<E> makeComplementByHand(Collection<E> collection, Class<E> cls) {
        EnumSet<E> enumSetAllOf = EnumSet.allOf(cls);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(cls);
        Iterables.addAll(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i) {
        return new HashSet<>(Maps.capacity(i));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return Collections.newSetFromMap(Maps.newIdentityHashMap());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new LinkedHashSet<>(Maps.capacity(i));
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    @GwtCompatible(serializable = false)
    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        return new PowerSet(set);
    }

    public static boolean removeAllImpl(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> navigableSet, Range<K> range) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            Preconditions.checkArgument(navigableSet.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            Comparable comparableLowerEndpoint = range.lowerEndpoint();
            BoundType boundTypeLowerBoundType = range.lowerBoundType();
            BoundType boundType = BoundType.CLOSED;
            return navigableSet.subSet(comparableLowerEndpoint, boundTypeLowerBoundType == boundType, range.upperEndpoint(), range.upperBoundType() == boundType);
        }
        if (range.hasLowerBound()) {
            return navigableSet.tailSet(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return navigableSet.headSet(range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        return (NavigableSet) Preconditions.checkNotNull(navigableSet);
    }

    public static <E> SetView<E> symmetricDifference(Set<? extends E> set, Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C42994(set, set2);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
        return Synchronized.navigableSet(navigableSet);
    }

    @IgnoreJRERequirement
    public static <E extends Enum<E>> Collector<E, ?, ImmutableSet<E>> toImmutableEnumSet() {
        return CollectCollectors.toImmutableEnumSet();
    }

    public static <E> SetView<E> union(Set<? extends E> set, Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C42961(set, set2);
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
        return cartesianProduct(Arrays.asList(setArr));
    }

    @GwtCompatible(serializable = BuildConfig.IS_FOR_ENGAGELAB)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(Iterable<E> iterable) {
        if (iterable instanceof ImmutableEnumSet) {
            return (ImmutableEnumSet) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return collection.isEmpty() ? ImmutableSet.m14872of() : ImmutableEnumSet.asImmutable(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (!it.hasNext()) {
            return ImmutableSet.m14872of();
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        Iterators.addAll(enumSetOf, it);
        return ImmutableEnumSet.asImmutable(enumSetOf);
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> iterable) {
        Set<E> setNewConcurrentHashSet = newConcurrentHashSet();
        Iterables.addAll(setNewConcurrentHashSet, iterable);
        return setNewConcurrentHashSet;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> iterable) {
        return new CopyOnWriteArraySet<>(iterable instanceof Collection ? (Collection) iterable : Lists.newArrayList(iterable));
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSetNewHashSetWithExpectedSize = newHashSetWithExpectedSize(eArr.length);
        Collections.addAll(hashSetNewHashSetWithExpectedSize, eArr);
        return hashSetNewHashSetWithExpectedSize;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> linkedHashSetNewLinkedHashSet = newLinkedHashSet();
        Iterables.addAll(linkedHashSetNewLinkedHashSet, iterable);
        return linkedHashSetNewLinkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
        TreeSet<E> treeSetNewTreeSet = newTreeSet();
        Iterables.addAll(treeSetNewTreeSet, iterable);
        return treeSetNewTreeSet;
    }

    public static boolean removeAllImpl(Set<?> set, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return Iterators.removeAll(set.iterator(), collection);
        }
        return removeAllImpl(set, collection.iterator());
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>((Collection) iterable);
        }
        return newHashSet(iterable.iterator());
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) Preconditions.checkNotNull(comparator));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        return makeComplementByHand(collection, cls);
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
        HashSet<E> hashSetNewHashSet = newHashSet();
        Iterators.addAll(hashSetNewHashSet, it);
        return hashSetNewHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> filter(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
        if (sortedSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) sortedSet;
            return new FilteredSortedSet((SortedSet) filteredSet.unfiltered, Predicates.and(filteredSet.predicate, predicate));
        }
        return new FilteredSortedSet((SortedSet) Preconditions.checkNotNull(sortedSet), (Predicate) Preconditions.checkNotNull(predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <E> NavigableSet<E> filter(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
        if (navigableSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) navigableSet;
            return new FilteredNavigableSet((NavigableSet) filteredSet.unfiltered, Predicates.and(filteredSet.predicate, predicate));
        }
        return new FilteredNavigableSet((NavigableSet) Preconditions.checkNotNull(navigableSet), (Predicate) Preconditions.checkNotNull(predicate));
    }
}
