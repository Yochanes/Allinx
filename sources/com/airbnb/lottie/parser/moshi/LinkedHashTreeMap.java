package com.airbnb.lottie.parser.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: a */
    public int f34846a;

    /* JADX INFO: renamed from: b */
    public int f34847b;

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C24261 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class AvlBuilder<K, V> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AvlIterator<K, V> {
    }

    /* JADX INFO: compiled from: Proguard */
    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$EntrySet$1 */
        /* JADX INFO: compiled from: Proguard */
        class C24271 extends LinkedHashTreeMap<Object, Object>.LinkedTreeMapIterator<Map.Entry<Object, Object>> {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Object key;
            if (!(obj instanceof Map.Entry) || (key = ((Map.Entry) obj).getKey()) == null) {
                return false;
            }
            try {
                key.hashCode();
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            new C24271();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Object key;
            if (!(obj instanceof Map.Entry) || (key = ((Map.Entry) obj).getKey()) == null) {
                return false;
            }
            try {
                key.hashCode();
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class KeySet extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$KeySet$1 */
        /* JADX INFO: compiled from: Proguard */
        class C24281 extends LinkedHashTreeMap<Object, Object>.LinkedTreeMapIterator<Object> {
            @Override // com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.LinkedTreeMapIterator, java.util.Iterator
            public final Object next() {
                m12729a();
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            new C24281();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                obj.hashCode();
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public Node f34848a;

        /* JADX INFO: renamed from: b */
        public Node f34849b;

        /* JADX INFO: renamed from: c */
        public int f34850c;

        public LinkedTreeMapIterator() {
            throw null;
        }

        /* JADX INFO: renamed from: a */
        public final Node m12729a() {
            Node node = this.f34848a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.getClass();
            if (node == null) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.f34847b != this.f34850c) {
                throw new ConcurrentModificationException();
            }
            this.f34848a = node.f34855d;
            this.f34849b = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Node node = this.f34848a;
            LinkedHashTreeMap.this.getClass();
            return node != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return m12729a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node node = this.f34849b;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.m12725c(node, true);
            this.f34849b = null;
            this.f34850c = linkedHashTreeMap.f34847b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public Node f34852a;

        /* JADX INFO: renamed from: b */
        public Node f34853b;

        /* JADX INFO: renamed from: c */
        public Node f34854c;

        /* JADX INFO: renamed from: d */
        public Node f34855d;

        /* JADX INFO: renamed from: f */
        public Node f34856f;

        /* JADX INFO: renamed from: g */
        public Object f34857g;

        /* JADX INFO: renamed from: i */
        public int f34858i;

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            throw null;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f34857g;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object obj2 = this.f34857g;
            this.f34857g = obj;
            return obj2;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12725c(Node node, boolean z2) {
        Node node2;
        Node node3;
        int i;
        if (z2) {
            Node node4 = node.f34856f;
            node4.f34855d = node.f34855d;
            node.f34855d.f34856f = node4;
            node.f34856f = null;
            node.f34855d = null;
        }
        Node node5 = node.f34853b;
        Node node6 = node.f34854c;
        Node node7 = node.f34852a;
        int i2 = 0;
        if (node5 != null && node6 != null) {
            if (node5.f34858i > node6.f34858i) {
                Node node8 = node5.f34854c;
                while (true) {
                    Node node9 = node8;
                    node3 = node5;
                    node5 = node9;
                    if (node5 == null) {
                        break;
                    } else {
                        node8 = node5.f34854c;
                    }
                }
            } else {
                Node node10 = node6.f34853b;
                while (true) {
                    node2 = node6;
                    node6 = node10;
                    if (node6 == null) {
                        break;
                    } else {
                        node10 = node6.f34853b;
                    }
                }
                node3 = node2;
            }
            m12725c(node3, false);
            Node node11 = node.f34853b;
            if (node11 != null) {
                i = node11.f34858i;
                node3.f34853b = node11;
                node11.f34852a = node3;
                node.f34853b = null;
            } else {
                i = 0;
            }
            Node node12 = node.f34854c;
            if (node12 != null) {
                i2 = node12.f34858i;
                node3.f34854c = node12;
                node12.f34852a = node3;
                node.f34854c = null;
            }
            node3.f34858i = Math.max(i, i2) + 1;
            m12726e(node, node3);
            return;
        }
        if (node5 != null) {
            m12726e(node, node5);
            node.f34853b = null;
        } else if (node6 != null) {
            m12726e(node, node6);
            node.f34854c = null;
        } else {
            m12726e(node, null);
        }
        while (true) {
            if (node7 == null) {
                break;
            }
            Node node13 = node7.f34853b;
            Node node14 = node7.f34854c;
            int i3 = node13 != null ? node13.f34858i : 0;
            int i4 = node14 != null ? node14.f34858i : 0;
            int i5 = i3 - i4;
            if (i5 != -2) {
                if (i5 != 2) {
                    if (i5 != 0) {
                        node7.f34858i = Math.max(i3, i4) + 1;
                        break;
                    }
                    node7.f34858i = i3 + 1;
                } else {
                    Node node15 = node13.f34853b;
                    Node node16 = node13.f34854c;
                    int i6 = (node15 != null ? node15.f34858i : 0) - (node16 != null ? node16.f34858i : 0);
                    if (i6 == 1 || i6 == 0) {
                        m12728g(node7);
                    } else {
                        m12727f(node13);
                        m12728g(node7);
                    }
                }
            } else {
                Node node17 = node14.f34853b;
                Node node18 = node14.f34854c;
                int i7 = (node17 != null ? node17.f34858i : 0) - (node18 != null ? node18.f34858i : 0);
                if (i7 == -1 || i7 == 0) {
                    m12727f(node7);
                } else {
                    m12728g(node14);
                    m12727f(node7);
                }
            }
            node7 = node7.f34852a;
        }
        this.f34846a--;
        this.f34847b++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill((Object[]) null, (Object) null);
        this.f34846a = 0;
        this.f34847b++;
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            obj.hashCode();
            throw null;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12726e(Node node, Node node2) {
        Node node3 = node.f34852a;
        node.f34852a = null;
        if (node2 != null) {
            node2.f34852a = node3;
        }
        node3.getClass();
        if (node3.f34853b == node) {
            node3.f34853b = node2;
        } else {
            node3.f34854c = node2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m12727f(Node node) {
        Node node2 = node.f34853b;
        Node node3 = node.f34854c;
        Node node4 = node3.f34853b;
        Node node5 = node3.f34854c;
        node.f34854c = node4;
        if (node4 != null) {
            node4.f34852a = node;
        }
        m12726e(node, node3);
        node3.f34853b = node;
        node.f34852a = node3;
        int iMax = Math.max(node2 != null ? node2.f34858i : 0, node4 != null ? node4.f34858i : 0) + 1;
        node.f34858i = iMax;
        node3.f34858i = Math.max(iMax, node5 != null ? node5.f34858i : 0) + 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m12728g(Node node) {
        Node node2 = node.f34853b;
        Node node3 = node.f34854c;
        Node node4 = node2.f34853b;
        Node node5 = node2.f34854c;
        node.f34853b = node5;
        if (node5 != null) {
            node5.f34852a = node;
        }
        m12726e(node, node2);
        node2.f34854c = node;
        node.f34852a = node2;
        int iMax = Math.max(node3 != null ? node3.f34858i : 0, node5 != null ? node5.f34858i : 0) + 1;
        node.f34858i = iMax;
        node2.f34858i = Math.max(iMax, node4 != null ? node4.f34858i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            try {
                obj.hashCode();
                throw null;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj != null) {
            try {
                obj.hashCode();
                throw null;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f34846a;
    }
}
