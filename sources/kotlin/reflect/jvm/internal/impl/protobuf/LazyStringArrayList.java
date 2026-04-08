package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LazyStringArrayList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* JADX INFO: renamed from: b */
    public static final UnmodifiableLazyStringList f54125b = new UnmodifiableLazyStringList(new LazyStringArrayList());

    /* JADX INFO: renamed from: a */
    public final ArrayList f54126a;

    public LazyStringArrayList() {
        this.f54126a = new ArrayList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: L */
    public final void mo19712L(ByteString byteString) {
        this.f54126a.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f54126a.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f54126a.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f54126a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f54126a;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strM19634q = byteString.m19634q();
            if (byteString.mo19629j()) {
                arrayList.set(i, strM19634q);
            }
            return strM19634q;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = Internal.f54120a;
        try {
            String str = new String(bArr, "UTF-8");
            if (Utf8.m19728c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final ByteString getByteString(int i) {
        ByteString literalByteString;
        ArrayList arrayList = this.f54126a;
        Object obj = arrayList.get(i);
        if (obj instanceof ByteString) {
            literalByteString = (ByteString) obj;
        } else if (obj instanceof String) {
            literalByteString = ByteString.m19623d((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            literalByteString = new LiteralByteString(bArr2);
        }
        if (literalByteString != obj) {
            arrayList.set(i, literalByteString);
        }
        return literalByteString;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f54126a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final UnmodifiableLazyStringList getUnmodifiableView() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.f54126a.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof ByteString) {
            return ((ByteString) objRemove).m19634q();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = Internal.f54120a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f54126a.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof ByteString) {
            return ((ByteString) obj2).m19634q();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = Internal.f54120a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54126a.size();
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f54126a = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f54126a.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
