package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: b */
    public int f16570b;

    /* JADX INFO: renamed from: d */
    public int f16572d;

    /* JADX INFO: renamed from: f */
    public int f16573f;

    /* JADX INFO: renamed from: i */
    public boolean f16575i;

    /* JADX INFO: renamed from: j */
    public int f16576j;

    /* JADX INFO: renamed from: o */
    public HashMap f16578o;

    /* JADX INFO: renamed from: p */
    public MutableIntObjectMap f16579p;

    /* JADX INFO: renamed from: a */
    public int[] f16569a = new int[0];

    /* JADX INFO: renamed from: c */
    public Object[] f16571c = new Object[0];

    /* JADX INFO: renamed from: g */
    public final Object f16574g = new Object();

    /* JADX INFO: renamed from: n */
    public ArrayList f16577n = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int m4456c(Anchor anchor) {
        if (this.f16575i) {
            ComposerKt.m4316c("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.m4194a()) {
            PreconditionsKt.m4402a("Anchor refers to a group that was removed");
        }
        return anchor.f16211a;
    }

    /* JADX INFO: renamed from: e */
    public final void m4457e() {
        this.f16578o = new HashMap();
    }

    /* JADX INFO: renamed from: f */
    public final SlotReader m4458f() {
        if (this.f16575i) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f16573f++;
        return new SlotReader(this);
    }

    /* JADX INFO: renamed from: g */
    public final SlotWriter m4459g() {
        if (this.f16575i) {
            ComposerKt.m4316c("Cannot start a writer when another writer is pending");
        }
        if (this.f16573f > 0) {
            ComposerKt.m4316c("Cannot start a writer when a reader is pending");
        }
        this.f16575i = true;
        this.f16576j++;
        return new SlotWriter(this);
    }

    @Override // java.lang.Iterable
    public final Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.f16570b);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4460j(Anchor anchor) {
        int iM4465e;
        return anchor.m4194a() && (iM4465e = SlotTableKt.m4465e(this.f16577n, anchor.f16211a, this.f16570b)) >= 0 && Intrinsics.m18594b(this.f16577n.get(iM4465e), anchor);
    }
}
