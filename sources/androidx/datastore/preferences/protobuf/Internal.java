package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedInputStream;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Internal {

    /* JADX INFO: renamed from: a */
    public static final Charset f24003a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f24004b;

    /* JADX INFO: compiled from: Proguard */
    public interface BooleanList extends ProtobufList<Boolean> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface DoubleList extends ProtobufList<Double> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface EnumLite {
        int getNumber();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface EnumLiteMap<T extends EnumLite> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface EnumVerifier {
        boolean isInRange(int i);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface FloatList extends ProtobufList<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface IntList extends ProtobufList<Integer> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ListAdapter<F, T> extends AbstractList<T> {

        /* JADX INFO: compiled from: Proguard */
        public interface Converter<F, T> {
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface LongList extends ProtobufList<Long> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f24005a = 0;

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Internal$MapAdapter$1 */
        /* JADX INFO: compiled from: Proguard */
        final class C15711 implements Converter<Integer, EnumLite> {
        }

        /* JADX INFO: compiled from: Proguard */
        public interface Converter<A, B> {
        }

        /* JADX INFO: compiled from: Proguard */
        public class EntryAdapter implements Map.Entry<K, V> {
            @Override // java.util.Map.Entry
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Map.Entry) {
                    throw null;
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public final Object getKey() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final Object getValue() {
                int i = MapAdapter.f24005a;
                throw null;
            }

            @Override // java.util.Map.Entry
            public final int hashCode() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final Object setValue(Object obj) {
                int i = MapAdapter.f24005a;
                throw null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw null;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                throw null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList mutableCopyWithCapacity(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f24004b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new CodedInputStream.ArrayDecoder(bArr, 0, 0, false).mo8372h(0);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8515a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m8516b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: c */
    public static MessageLite m8517c(Object obj, Object obj2) {
        GeneratedMessageLite.Builder builder = ((MessageLite) obj).toBuilder();
        MessageLite messageLite = (MessageLite) obj2;
        if (!builder.f23989a.getClass().isInstance(messageLite)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        builder.getClass();
        builder.mo8513f();
        GeneratedMessageLite.Builder.m8510h(builder.f23990b, (GeneratedMessageLite) ((AbstractMessageLite) messageLite));
        return builder.buildPartial();
    }
}
