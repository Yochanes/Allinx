package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.Utf8;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f24022c = 0;

    /* JADX INFO: renamed from: b */
    public final ArrayList f24023b;

    /* JADX INFO: compiled from: Proguard */
    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            int i2 = LazyStringArrayList.f24022c;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            int i2 = LazyStringArrayList.f24022c;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            int i2 = LazyStringArrayList.f24022c;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            int i2 = LazyStringArrayList.f24022c;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    static {
        new LazyStringArrayList(10).f23839a = false;
    }

    public LazyStringArrayList(int i) {
        this(new ArrayList(i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m8301a();
        this.f24023b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f24023b.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m8301a();
        this.f24023b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f24023b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            byteString.getClass();
            String strMo8359q = byteString.size() == 0 ? "" : byteString.mo8359q(Internal.f24003a);
            if (byteString.mo8353k()) {
                arrayList.set(i, strMo8359q);
            }
            return strMo8359q;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, Internal.f24003a);
        Utf8.Processor processor = Utf8.f24162a;
        if (Utf8.f24162a.mo8717f(0, bArr, 0, bArr.length) == 0) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final Object getRaw(int i) {
        return this.f24023b.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f24023b);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final LazyStringList getUnmodifiableView() {
        return this.f23839a ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final boolean isModifiable() {
        return this.f23839a;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i) {
        ArrayList arrayList = this.f24023b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new LazyStringArrayList(arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8301a();
        Object objRemove = this.f24023b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ByteString)) {
            return new String((byte[]) objRemove, Internal.f24003a);
        }
        ByteString byteString = (ByteString) objRemove;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.mo8359q(Internal.f24003a);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m8301a();
        Object obj2 = this.f24023b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, Internal.f24003a);
        }
        ByteString byteString = (ByteString) obj2;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.mo8359q(Internal.f24003a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24023b.size();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    /* JADX INFO: renamed from: u */
    public final void mo8527u(ByteString byteString) {
        m8301a();
        this.f24023b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    public LazyStringArrayList(ArrayList arrayList) {
        this.f24023b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m8301a();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f24023b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
