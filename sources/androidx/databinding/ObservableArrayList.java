package androidx.databinding;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableArrayList<T> extends ArrayList<T> implements ObservableList<T> {
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        super.add(obj);
        size();
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        size();
        boolean zAddAll = super.addAll(collection);
        if (zAddAll) {
            size();
        }
        return zAddAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        size();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        super.remove(iIndexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i, int i2) {
        super.removeRange(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        boolean zAddAll = super.addAll(i, collection);
        if (zAddAll) {
            collection.size();
        }
        return zAddAll;
    }
}
