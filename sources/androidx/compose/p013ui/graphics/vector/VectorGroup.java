package androidx.compose.p013ui.graphics.vector;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final String f18145a;

    /* JADX INFO: renamed from: b */
    public final float f18146b;

    /* JADX INFO: renamed from: c */
    public final float f18147c;

    /* JADX INFO: renamed from: d */
    public final float f18148d;

    /* JADX INFO: renamed from: f */
    public final float f18149f;

    /* JADX INFO: renamed from: g */
    public final float f18150g;

    /* JADX INFO: renamed from: i */
    public final float f18151i;

    /* JADX INFO: renamed from: j */
    public final float f18152j;

    /* JADX INFO: renamed from: n */
    public final List f18153n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f18154o;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"androidx/compose/ui/graphics/vector/VectorGroup$iterator$1", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public final class C12281 implements Iterator<VectorNode>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public final Iterator f18155a;

        public C12281(VectorGroup vectorGroup) {
            this.f18155a = vectorGroup.f18154o.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18155a.hasNext();
        }

        @Override // java.util.Iterator
        public final VectorNode next() {
            return (VectorNode) this.f18155a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public VectorGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.f18145a = str;
        this.f18146b = f;
        this.f18147c = f2;
        this.f18148d = f3;
        this.f18149f = f4;
        this.f18150g = f5;
        this.f18151i = f6;
        this.f18152j = f7;
        this.f18153n = list;
        this.f18154o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VectorGroup)) {
            return false;
        }
        VectorGroup vectorGroup = (VectorGroup) obj;
        return Intrinsics.m18594b(this.f18145a, vectorGroup.f18145a) && this.f18146b == vectorGroup.f18146b && this.f18147c == vectorGroup.f18147c && this.f18148d == vectorGroup.f18148d && this.f18149f == vectorGroup.f18149f && this.f18150g == vectorGroup.f18150g && this.f18151i == vectorGroup.f18151i && this.f18152j == vectorGroup.f18152j && Intrinsics.m18594b(this.f18153n, vectorGroup.f18153n) && Intrinsics.m18594b(this.f18154o, vectorGroup.f18154o);
    }

    public final int hashCode() {
        return this.f18154o.hashCode() + AbstractC0455a.m2233h(this.f18153n, AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(this.f18145a.hashCode() * 31, this.f18146b, 31), this.f18147c, 31), this.f18148d, 31), this.f18149f, 31), this.f18150g, 31), this.f18151i, 31), this.f18152j, 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<VectorNode> iterator() {
        return new C12281(this);
    }
}
