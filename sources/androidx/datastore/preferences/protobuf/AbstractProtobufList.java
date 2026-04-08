package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractProtobufList<E> extends AbstractList<E> implements Internal.ProtobufList<E> {

    /* JADX INFO: renamed from: a */
    public boolean f23839a = true;

    /* JADX INFO: renamed from: a */
    public final void m8301a() {
        if (!this.f23839a) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m8301a();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m8301a();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m8301a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public boolean isModifiable() {
        return this.f23839a;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final void makeImmutable() {
        this.f23839a = false;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        m8301a();
        return super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        m8301a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        m8301a();
        return super.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        m8301a();
        return super.set(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        m8301a();
        super.add(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        m8301a();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m8301a();
        return super.remove(obj);
    }
}
