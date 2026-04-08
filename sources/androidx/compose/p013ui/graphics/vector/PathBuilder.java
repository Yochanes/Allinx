package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.vector.PathNode;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PathBuilder {

    /* JADX INFO: renamed from: a */
    public final ArrayList f17997a = new ArrayList(32);

    /* JADX INFO: renamed from: a */
    public final void m5485a() {
        this.f17997a.add(PathNode.Close.f18027c);
    }

    /* JADX INFO: renamed from: b */
    public final void m5486b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f17997a.add(new PathNode.CurveTo(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: c */
    public final void m5487c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f17997a.add(new PathNode.RelativeCurveTo(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: d */
    public final void m5488d(float f) {
        this.f17997a.add(new PathNode.HorizontalTo(f));
    }

    /* JADX INFO: renamed from: e */
    public final void m5489e(float f) {
        this.f17997a.add(new PathNode.RelativeHorizontalTo(f));
    }

    /* JADX INFO: renamed from: f */
    public final void m5490f(float f, float f2) {
        this.f17997a.add(new PathNode.LineTo(f, f2));
    }

    /* JADX INFO: renamed from: g */
    public final void m5491g(float f, float f2) {
        this.f17997a.add(new PathNode.RelativeLineTo(f, f2));
    }

    /* JADX INFO: renamed from: h */
    public final void m5492h(float f, float f2) {
        this.f17997a.add(new PathNode.MoveTo(f, f2));
    }

    /* JADX INFO: renamed from: i */
    public final void m5493i(float f, float f2, float f3, float f4) {
        this.f17997a.add(new PathNode.ReflectiveCurveTo(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: j */
    public final void m5494j(float f, float f2, float f3, float f4) {
        this.f17997a.add(new PathNode.RelativeReflectiveCurveTo(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: k */
    public final void m5495k(float f) {
        this.f17997a.add(new PathNode.VerticalTo(f));
    }

    /* JADX INFO: renamed from: l */
    public final void m5496l(float f) {
        this.f17997a.add(new PathNode.RelativeVerticalTo(f));
    }
}
