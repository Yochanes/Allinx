package androidx.compose.p013ui.geometry;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "ui-geometry_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableRect {

    /* JADX INFO: renamed from: a */
    public float f17520a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f17521b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f17522c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f17523d = 0.0f;

    /* JADX INFO: renamed from: a */
    public final void m5049a(float f, float f2, float f3, float f4) {
        this.f17520a = Math.max(f, this.f17520a);
        this.f17521b = Math.max(f2, this.f17521b);
        this.f17522c = Math.min(f3, this.f17522c);
        this.f17523d = Math.min(f4, this.f17523d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5050b() {
        return (this.f17520a >= this.f17522c) | (this.f17521b >= this.f17523d);
    }

    public final String toString() {
        return "MutableRect(" + GeometryUtilsKt.m5048a(this.f17520a) + ", " + GeometryUtilsKt.m5048a(this.f17521b) + ", " + GeometryUtilsKt.m5048a(this.f17522c) + ", " + GeometryUtilsKt.m5048a(this.f17523d) + ')';
    }
}
