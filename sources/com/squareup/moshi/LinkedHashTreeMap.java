package com.squareup.moshi;

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
/* JADX INFO: loaded from: classes3.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i */
    public static final Comparator f43392i = new C50241();

    /* JADX INFO: renamed from: a */
    public Node[] f43393a;

    /* JADX INFO: renamed from: b */
    public int f43394b;

    /* JADX INFO: renamed from: c */
    public int f43395c;

    /* JADX INFO: renamed from: d */
    public int f43396d;

    /* JADX INFO: renamed from: f */
    public EntrySet f43397f;

    /* JADX INFO: renamed from: g */
    public KeySet f43398g;

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C50241 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class AvlBuilder<K, V> {

        /* JADX INFO: renamed from: a */
        public Node f43399a;

        /* JADX INFO: renamed from: b */
        public int f43400b;

        /* JADX INFO: renamed from: c */
        public int f43401c;

        /* JADX INFO: renamed from: d */
        public int f43402d;

        /* JADX INFO: renamed from: a */
        public final void m15421a(Node node) {
            node.f43412c = null;
            node.f43410a = null;
            node.f43411b = null;
            node.f43418n = 1;
            int i = this.f43400b;
            if (i > 0) {
                int i2 = this.f43402d;
                if ((i2 & 1) == 0) {
                    this.f43402d = i2 + 1;
                    this.f43400b = i - 1;
                    this.f43401c++;
                }
            }
            node.f43410a = this.f43399a;
            this.f43399a = node;
            int i3 = this.f43402d;
            int i4 = i3 + 1;
            this.f43402d = i4;
            int i5 = this.f43400b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f43402d = i3 + 2;
                this.f43400b = i5 - 1;
                this.f43401c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f43402d & i7) != i7) {
                    return;
                }
                int i8 = this.f43401c;
                if (i8 == 0) {
                    Node node2 = this.f43399a;
                    Node node3 = node2.f43410a;
                    Node node4 = node3.f43410a;
                    node3.f43410a = node4.f43410a;
                    this.f43399a = node3;
                    node3.f43411b = node4;
                    node3.f43412c = node2;
                    node3.f43418n = node2.f43418n + 1;
                    node4.f43410a = node3;
                    node2.f43410a = node3;
                } else if (i8 == 1) {
                    Node node5 = this.f43399a;
                    Node node6 = node5.f43410a;
                    this.f43399a = node6;
                    node6.f43412c = node5;
                    node6.f43418n = node5.f43418n + 1;
                    node5.f43410a = node6;
                    this.f43401c = 0;
                } else if (i8 == 2) {
                    this.f43401c = 0;
                }
                i6 *= 2;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AvlIterator<K, V> {

        /* JADX INFO: renamed from: a */
        public Node f43403a;
    }

    /* JADX INFO: compiled from: Proguard */
    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$EntrySet$1 */
        /* JADX INFO: compiled from: Proguard */
        class C50251 extends LinkedHashTreeMap<Object, Object>.LinkedTreeMapIterator<Map.Entry<Object, Object>> {
        }

        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[RETURN] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean contains(Object obj) {
            Node nodeM15416c;
            Object obj2;
            Object value;
            if (obj instanceof Map.Entry) {
                LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Node node = null;
                if (key != null) {
                    try {
                        nodeM15416c = linkedHashTreeMap.m15416c(key, false);
                    } catch (ClassCastException unused) {
                        nodeM15416c = null;
                    }
                    if (nodeM15416c != null && ((obj2 = nodeM15416c.f43417j) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        node = nodeM15416c;
                    }
                    if (node == null) {
                        return true;
                    }
                } else {
                    nodeM15416c = null;
                    if (nodeM15416c != null) {
                        node = nodeM15416c;
                    }
                    if (node == null) {
                    }
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new C50251();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean remove(Object obj) {
            Node nodeM15416c;
            Object obj2;
            Object value;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                Object key = entry.getKey();
                Node node = null;
                if (key != null) {
                    try {
                        nodeM15416c = linkedHashTreeMap.m15416c(key, false);
                    } catch (ClassCastException unused) {
                        nodeM15416c = null;
                    }
                    if (nodeM15416c != null && ((obj2 = nodeM15416c.f43417j) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        node = nodeM15416c;
                    }
                    if (node != null) {
                        linkedHashTreeMap.m15417e(node, true);
                        return true;
                    }
                } else {
                    nodeM15416c = null;
                    if (nodeM15416c != null) {
                        node = nodeM15416c;
                    }
                    if (node != null) {
                    }
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedHashTreeMap.this.f43394b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class KeySet extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$KeySet$1 */
        /* JADX INFO: compiled from: Proguard */
        class C50261 extends LinkedHashTreeMap<Object, Object>.LinkedTreeMapIterator<Object> {
            @Override // com.squareup.moshi.LinkedHashTreeMap.LinkedTreeMapIterator, java.util.Iterator
            public final Object next() {
                return m15422a().f43415g;
            }
        }

        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new C50261();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            Node nodeM15416c = null;
            if (obj != null) {
                try {
                    nodeM15416c = linkedHashTreeMap.m15416c(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (nodeM15416c != null) {
                linkedHashTreeMap.m15417e(nodeM15416c, true);
            }
            return nodeM15416c != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedHashTreeMap.this.f43394b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public Node f43406a;

        /* JADX INFO: renamed from: b */
        public Node f43407b;

        /* JADX INFO: renamed from: c */
        public int f43408c;

        public LinkedTreeMapIterator() {
            LinkedHashTreeMap.this.getClass();
            throw null;
        }

        /* JADX INFO: renamed from: a */
        public final Node m15422a() {
            Node node = this.f43406a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (node == null) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.f43395c != this.f43408c) {
                throw new ConcurrentModificationException();
            }
            this.f43406a = node.f43413d;
            this.f43407b = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f43406a != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return m15422a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node node = this.f43407b;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.m15417e(node, true);
            this.f43407b = null;
            this.f43408c = linkedHashTreeMap.f43395c;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public Node f43410a;

        /* JADX INFO: renamed from: b */
        public Node f43411b;

        /* JADX INFO: renamed from: c */
        public Node f43412c;

        /* JADX INFO: renamed from: d */
        public Node f43413d;

        /* JADX INFO: renamed from: f */
        public Node f43414f;

        /* JADX INFO: renamed from: g */
        public final Object f43415g;

        /* JADX INFO: renamed from: i */
        public final int f43416i;

        /* JADX INFO: renamed from: j */
        public Object f43417j;

        /* JADX INFO: renamed from: n */
        public int f43418n = 1;

        public Node(Node node, Object obj, int i, Node node2, Node node3) {
            this.f43410a = node;
            this.f43415g = obj;
            this.f43416i = i;
            this.f43413d = node2;
            this.f43414f = node3;
            node3.f43413d = this;
            node2.f43414f = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f43415g;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f43417j;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f43415g;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f43417j;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object obj = this.f43415g;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f43417j;
            return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object obj2 = this.f43417j;
            this.f43417j = obj;
            return obj2;
        }

        public final String toString() {
            return this.f43415g + "=" + this.f43417j;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Node m15416c(Object obj, boolean z2) {
        Node[] nodeArr = this.f43393a;
        int iHashCode = obj.hashCode();
        int i = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        Node node = nodeArr[((i >>> 4) ^ ((i >>> 7) ^ i)) & (nodeArr.length - 1)];
        Comparable comparable = null;
        if (node != null) {
            while (true) {
                Object obj2 = node.f43415g;
                comparable.getClass();
                int iCompareTo = comparable.compareTo(obj2);
                if (iCompareTo == 0) {
                    return node;
                }
                Node node2 = iCompareTo < 0 ? node.f43411b : node.f43412c;
                if (node2 == null) {
                    break;
                }
                node = node2;
            }
        }
        if (!z2) {
            return null;
        }
        if (node == null) {
            throw null;
        }
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f43393a, (Object) null);
        this.f43394b = 0;
        this.f43395c++;
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Node nodeM15416c = null;
        if (obj != null) {
            try {
                nodeM15416c = m15416c(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return nodeM15416c != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m15417e(Node node, boolean z2) {
        Node node2;
        Node node3;
        int i;
        if (z2) {
            Node node4 = node.f43414f;
            node4.f43413d = node.f43413d;
            node.f43413d.f43414f = node4;
            node.f43414f = null;
            node.f43413d = null;
        }
        Node node5 = node.f43411b;
        Node node6 = node.f43412c;
        Node node7 = node.f43410a;
        int i2 = 0;
        if (node5 != null && node6 != null) {
            if (node5.f43418n > node6.f43418n) {
                Node node8 = node5.f43412c;
                while (true) {
                    Node node9 = node8;
                    node3 = node5;
                    node5 = node9;
                    if (node5 == null) {
                        break;
                    } else {
                        node8 = node5.f43412c;
                    }
                }
            } else {
                Node node10 = node6.f43411b;
                while (true) {
                    node2 = node6;
                    node6 = node10;
                    if (node6 == null) {
                        break;
                    } else {
                        node10 = node6.f43411b;
                    }
                }
                node3 = node2;
            }
            m15417e(node3, false);
            Node node11 = node.f43411b;
            if (node11 != null) {
                i = node11.f43418n;
                node3.f43411b = node11;
                node11.f43410a = node3;
                node.f43411b = null;
            } else {
                i = 0;
            }
            Node node12 = node.f43412c;
            if (node12 != null) {
                i2 = node12.f43418n;
                node3.f43412c = node12;
                node12.f43410a = node3;
                node.f43412c = null;
            }
            node3.f43418n = Math.max(i, i2) + 1;
            m15418f(node, node3);
            return;
        }
        if (node5 != null) {
            m15418f(node, node5);
            node.f43411b = null;
        } else if (node6 != null) {
            m15418f(node, node6);
            node.f43412c = null;
        } else {
            m15418f(node, null);
        }
        while (true) {
            if (node7 == null) {
                break;
            }
            Node node13 = node7.f43411b;
            Node node14 = node7.f43412c;
            int i3 = node13 != null ? node13.f43418n : 0;
            int i4 = node14 != null ? node14.f43418n : 0;
            int i5 = i3 - i4;
            if (i5 != -2) {
                if (i5 != 2) {
                    if (i5 != 0) {
                        node7.f43418n = Math.max(i3, i4) + 1;
                        break;
                    }
                    node7.f43418n = i3 + 1;
                } else {
                    Node node15 = node13.f43411b;
                    Node node16 = node13.f43412c;
                    int i6 = (node15 != null ? node15.f43418n : 0) - (node16 != null ? node16.f43418n : 0);
                    if (i6 == 1 || i6 == 0) {
                        m15420h(node7);
                    } else {
                        m15419g(node13);
                        m15420h(node7);
                    }
                }
            } else {
                Node node17 = node14.f43411b;
                Node node18 = node14.f43412c;
                int i7 = (node17 != null ? node17.f43418n : 0) - (node18 != null ? node18.f43418n : 0);
                if (i7 == -1 || i7 == 0) {
                    m15419g(node7);
                } else {
                    m15420h(node14);
                    m15419g(node7);
                }
            }
            node7 = node7.f43410a;
        }
        this.f43394b--;
        this.f43395c++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        EntrySet entrySet = this.f43397f;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.f43397f = entrySet2;
        return entrySet2;
    }

    /* JADX INFO: renamed from: f */
    public final void m15418f(Node node, Node node2) {
        Node node3 = node.f43410a;
        node.f43410a = null;
        if (node2 != null) {
            node2.f43410a = node3;
        }
        if (node3 == null) {
            this.f43393a[node.f43416i & (r0.length - 1)] = node2;
        } else if (node3.f43411b == node) {
            node3.f43411b = node2;
        } else {
            node3.f43412c = node2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15419g(Node node) {
        Node node2 = node.f43411b;
        Node node3 = node.f43412c;
        Node node4 = node3.f43411b;
        Node node5 = node3.f43412c;
        node.f43412c = node4;
        if (node4 != null) {
            node4.f43410a = node;
        }
        m15418f(node, node3);
        node3.f43411b = node;
        node.f43410a = node3;
        int iMax = Math.max(node2 != null ? node2.f43418n : 0, node4 != null ? node4.f43418n : 0) + 1;
        node.f43418n = iMax;
        node3.f43418n = Math.max(iMax, node5 != null ? node5.f43418n : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Node nodeM15416c;
        if (obj != null) {
            try {
                nodeM15416c = m15416c(obj, false);
            } catch (ClassCastException unused) {
                nodeM15416c = null;
            }
        } else {
            nodeM15416c = null;
        }
        if (nodeM15416c != null) {
            return nodeM15416c.f43417j;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m15420h(Node node) {
        Node node2 = node.f43411b;
        Node node3 = node.f43412c;
        Node node4 = node2.f43411b;
        Node node5 = node2.f43412c;
        node.f43411b = node5;
        if (node5 != null) {
            node5.f43410a = node;
        }
        m15418f(node, node2);
        node2.f43412c = node;
        node.f43410a = node2;
        int iMax = Math.max(node3 != null ? node3.f43418n : 0, node5 != null ? node5.f43418n : 0) + 1;
        node.f43418n = iMax;
        node2.f43418n = Math.max(iMax, node4 != null ? node4.f43418n : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        KeySet keySet = this.f43398g;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.f43398g = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        Node nodeM15416c = m15416c(obj, true);
        Object obj3 = nodeM15416c.f43417j;
        nodeM15416c.f43417j = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Node nodeM15416c;
        if (obj != null) {
            try {
                nodeM15416c = m15416c(obj, false);
            } catch (ClassCastException unused) {
                nodeM15416c = null;
            }
        } else {
            nodeM15416c = null;
        }
        if (nodeM15416c != null) {
            m15417e(nodeM15416c, true);
        }
        if (nodeM15416c != null) {
            return nodeM15416c.f43417j;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f43394b;
    }
}
