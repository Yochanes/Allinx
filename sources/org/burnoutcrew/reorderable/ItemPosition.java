package org.burnoutcrew.reorderable;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/burnoutcrew/reorderable/ItemPosition;", "", "reorderable"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
public final /* data */ class ItemPosition {

    /* JADX INFO: renamed from: a */
    public final int f58055a;

    /* JADX INFO: renamed from: b */
    public final Object f58056b;

    public ItemPosition(int i, Object obj) {
        this.f58055a = i;
        this.f58056b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemPosition)) {
            return false;
        }
        ItemPosition itemPosition = (ItemPosition) obj;
        return this.f58055a == itemPosition.f58055a && Intrinsics.m18594b(this.f58056b, itemPosition.f58056b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f58055a) * 31;
        Object obj = this.f58056b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ItemPosition(index=" + this.f58055a + ", key=" + this.f58056b + ')';
    }
}
