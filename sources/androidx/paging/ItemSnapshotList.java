package androidx.paging;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/ItemSnapshotList;", "T", "Lkotlin/collections/AbstractList;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ItemSnapshotList<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: a */
    public final int f30716a;

    /* JADX INFO: renamed from: b */
    public final int f30717b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f30718c;

    public ItemSnapshotList(ArrayList arrayList, int i, int i2) {
        this.f30716a = i;
        this.f30717b = i2;
        this.f30718c = arrayList;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: c */
    public final int getF16756c() {
        return this.f30718c.size() + this.f30716a + this.f30717b;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f30716a;
        if (i >= 0 && i < i2) {
            return null;
        }
        ArrayList arrayList = this.f30718c;
        if (i < arrayList.size() + i2 && i2 <= i) {
            return arrayList.get(i - i2);
        }
        int size = arrayList.size() + i2;
        if (i < getF16756c() && size <= i) {
            return null;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Illegal attempt to access index ", " in ItemSnapshotList of size ");
        sbM20q.append(getF16756c());
        throw new IndexOutOfBoundsException(sbM20q.toString());
    }
}
