package androidx.compose.material3.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material3/internal/MapDraggableAnchors;", "T", "Landroidx/compose/material3/internal/DraggableAnchors;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {

    /* JADX INFO: renamed from: a */
    public final Object f15618a;

    public MapDraggableAnchors(Map map) {
        this.f15618a = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material3.internal.DraggableAnchors
    /* JADX INFO: renamed from: a */
    public final Object mo4161a(float f, boolean z2) {
        T next;
        Iterator<T> it = this.f15618a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z2 ? fFloatValue - f : f - fFloatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z2 ? fFloatValue2 - f : f - fFloatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material3.internal.DraggableAnchors
    /* JADX INFO: renamed from: b */
    public final Object mo4162b(float f) {
        T next;
        Iterator<T> it = this.f15618a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material3.internal.DraggableAnchors
    /* JADX INFO: renamed from: c */
    public final float mo4163c(Object obj) {
        Float f = (Float) this.f15618a.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material3.internal.DraggableAnchors
    /* JADX INFO: renamed from: d */
    public final float mo4164d() {
        Float fM18419T = CollectionsKt.m18419T(this.f15618a.values());
        if (fM18419T != null) {
            return fM18419T.floatValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material3.internal.DraggableAnchors
    /* JADX INFO: renamed from: e */
    public final boolean mo4165e(Object obj) {
        return this.f15618a.containsKey(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapDraggableAnchors)) {
            return false;
        }
        return Intrinsics.m18594b(this.f15618a, ((MapDraggableAnchors) obj).f15618a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material3.internal.DraggableAnchors
    /* JADX INFO: renamed from: f */
    public final float mo4166f() {
        Float fM18417R = CollectionsKt.m18417R(this.f15618a.values());
        if (fM18417R != null) {
            return fM18417R.floatValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final int getSize() {
        return this.f15618a.size();
    }

    public final int hashCode() {
        return this.f15618a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f15618a + ')';
    }
}
