package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@InternalComposeApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class MovableContentStateReference {

    /* JADX INFO: renamed from: a */
    public final MovableContent f16402a;

    /* JADX INFO: renamed from: b */
    public final Object f16403b;

    /* JADX INFO: renamed from: c */
    public final CompositionImpl f16404c;

    /* JADX INFO: renamed from: d */
    public final SlotTable f16405d;

    /* JADX INFO: renamed from: e */
    public final Anchor f16406e;

    /* JADX INFO: renamed from: f */
    public Object f16407f;

    /* JADX INFO: renamed from: g */
    public final PersistentCompositionLocalMap f16408g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f16409h;

    public MovableContentStateReference(MovableContent movableContent, Object obj, CompositionImpl compositionImpl, SlotTable slotTable, Anchor anchor, List list, PersistentCompositionLocalMap persistentCompositionLocalMap, ArrayList arrayList) {
        this.f16402a = movableContent;
        this.f16403b = obj;
        this.f16404c = compositionImpl;
        this.f16405d = slotTable;
        this.f16406e = anchor;
        this.f16407f = list;
        this.f16408g = persistentCompositionLocalMap;
        this.f16409h = arrayList;
    }
}
