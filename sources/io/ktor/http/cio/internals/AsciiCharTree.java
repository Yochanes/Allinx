package io.ktor.http.cio.internals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/http/cio/internals/AsciiCharTree;", "", "T", "Companion", "Node", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class AsciiCharTree<T> {

    /* JADX INFO: renamed from: a */
    public final Node f45880a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/cio/internals/AsciiCharTree$Companion;", "", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static AsciiCharTree m17029a(List list) {
            return m17030b(list, AsciiCharTree$Companion$build$1.f45881a, AsciiCharTree$Companion$build$2.f45882a);
        }

        /* JADX INFO: renamed from: b */
        public static AsciiCharTree m17030b(List from, Function1 function1, Function2 function2) {
            T t;
            Intrinsics.m18599g(from, "from");
            List list = from;
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    Comparable comparable = (Comparable) function1.invoke(next);
                    do {
                        T next2 = it.next();
                        Comparable comparable2 = (Comparable) function1.invoke(next2);
                        if (comparable.compareTo(comparable2) < 0) {
                            next = next2;
                            comparable = comparable2;
                        }
                    } while (it.hasNext());
                }
                t = next;
            } else {
                t = null;
            }
            if (t == null || ((Integer) function1.invoke(t)) == null) {
                throw new NoSuchElementException("Unable to build char tree from an empty list");
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((Number) function1.invoke(it2.next())).intValue() == 0) {
                        throw new IllegalArgumentException("There should be no empty entries");
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            m17031c(arrayList, from, 0, function1, function2);
            arrayList.trimToSize();
            return new AsciiCharTree(new Node((char) 0, EmptyList.f51496a, arrayList));
        }

        /* JADX INFO: renamed from: c */
        public static void m17031c(ArrayList arrayList, List list, int i, Function1 function1, Function2 function2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : list) {
                Character ch = (Character) function2.invoke(t, Integer.valueOf(i));
                ch.getClass();
                Object arrayList2 = linkedHashMap.get(ch);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(ch, arrayList2);
                }
                ((List) arrayList2).add(t);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                char cCharValue = ((Character) entry.getKey()).charValue();
                List list2 = (List) entry.getValue();
                int i2 = i + 1;
                ArrayList arrayList3 = new ArrayList();
                List list3 = list2;
                ArrayList arrayList4 = new ArrayList();
                for (T t2 : list3) {
                    if (((Number) function1.invoke(t2)).intValue() > i2) {
                        arrayList4.add(t2);
                    }
                }
                m17031c(arrayList3, arrayList4, i2, function1, function2);
                arrayList3.trimToSize();
                ArrayList arrayList5 = new ArrayList();
                for (T t3 : list3) {
                    if (((Number) function1.invoke(t3)).intValue() == i2) {
                        arrayList5.add(t3);
                    }
                }
                arrayList.add(new Node(cCharValue, arrayList5, arrayList3));
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "T", "", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Node<T> {

        /* JADX INFO: renamed from: a */
        public final Node[] f45883a;

        /* JADX INFO: renamed from: b */
        public final char f45884b;

        /* JADX INFO: renamed from: c */
        public final Object f45885c;

        /* JADX INFO: renamed from: d */
        public final ArrayList f45886d;

        public Node(char c2, List list, ArrayList arrayList) {
            this.f45884b = c2;
            this.f45885c = list;
            this.f45886d = arrayList;
            Node[] nodeArr = new Node[256];
            for (int i = 0; i < 256; i++) {
                Iterator<T> it = this.f45886d.iterator();
                Node node = null;
                boolean z2 = false;
                Node node2 = null;
                while (true) {
                    if (it.hasNext()) {
                        T next = it.next();
                        if (((Node) next).f45884b == i) {
                            if (z2) {
                                break;
                            }
                            z2 = true;
                            node2 = next;
                        }
                    } else if (z2) {
                        node = node2;
                    }
                }
                nodeArr[i] = node;
            }
            this.f45883a = nodeArr;
        }
    }

    public AsciiCharTree(Node node) {
        this.f45880a = node;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m17027b(AsciiCharTree asciiCharTree, CharSequence charSequence, int i, int i2, Function2 function2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return asciiCharTree.m17028a(charSequence, i, i2, (i3 & 8) == 0, function2);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final List m17028a(CharSequence sequence, int i, int i2, boolean z2, Function2 function2) {
        Intrinsics.m18599g(sequence, "sequence");
        if (sequence.length() == 0) {
            throw new IllegalArgumentException("Couldn't search in char tree for empty string");
        }
        Node node = this.f45880a;
        while (i < i2) {
            char cCharAt = sequence.charAt(i);
            if (((Boolean) function2.invoke(Character.valueOf(cCharAt), Integer.valueOf(cCharAt))).booleanValue()) {
                break;
            }
            Node[] nodeArr = node.f45883a;
            Node node2 = nodeArr[cCharAt];
            node = node2 != null ? node2 : z2 ? nodeArr[Character.toLowerCase(cCharAt)] : null;
            if (node == null) {
                return EmptyList.f51496a;
            }
            i++;
        }
        return node.f45885c;
    }
}
