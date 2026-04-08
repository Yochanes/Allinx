package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.PathMeasure;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PathComponent extends VNode {

    /* JADX INFO: renamed from: b */
    public Brush f17998b;

    /* JADX INFO: renamed from: c */
    public float f17999c = 1.0f;

    /* JADX INFO: renamed from: d */
    public List f18000d;

    /* JADX INFO: renamed from: e */
    public float f18001e;

    /* JADX INFO: renamed from: f */
    public float f18002f;

    /* JADX INFO: renamed from: g */
    public Brush f18003g;

    /* JADX INFO: renamed from: h */
    public int f18004h;

    /* JADX INFO: renamed from: i */
    public int f18005i;

    /* JADX INFO: renamed from: j */
    public float f18006j;

    /* JADX INFO: renamed from: k */
    public float f18007k;

    /* JADX INFO: renamed from: l */
    public float f18008l;

    /* JADX INFO: renamed from: m */
    public float f18009m;

    /* JADX INFO: renamed from: n */
    public boolean f18010n;

    /* JADX INFO: renamed from: o */
    public boolean f18011o;

    /* JADX INFO: renamed from: p */
    public boolean f18012p;

    /* JADX INFO: renamed from: q */
    public Stroke f18013q;

    /* JADX INFO: renamed from: r */
    public final AndroidPath f18014r;

    /* JADX INFO: renamed from: s */
    public AndroidPath f18015s;

    /* JADX INFO: renamed from: t */
    public final Object f18016t;

    public PathComponent() {
        int i = VectorKt.f18156a;
        this.f18000d = EmptyList.f51496a;
        this.f18001e = 1.0f;
        this.f18004h = 0;
        this.f18005i = 0;
        this.f18006j = 4.0f;
        this.f18008l = 1.0f;
        this.f18010n = true;
        this.f18011o = true;
        AndroidPath androidPathM5161a = AndroidPath_androidKt.m5161a();
        this.f18014r = androidPathM5161a;
        this.f18015s = androidPathM5161a;
        this.f18016t = LazyKt.m18298a(LazyThreadSafetyMode.f51423c, PathComponent$pathMeasure$2.f18017a);
    }

    @Override // androidx.compose.p013ui.graphics.vector.VNode
    /* JADX INFO: renamed from: a */
    public final void mo5473a(DrawScope drawScope) {
        Stroke stroke;
        if (this.f18010n) {
            PathParserKt.m5500b(this.f18000d, this.f18014r);
            m5497e();
        } else if (this.f18012p) {
            m5497e();
        }
        this.f18010n = false;
        this.f18012p = false;
        Brush brush = this.f17998b;
        if (brush != null) {
            DrawScope.m5370E0(drawScope, this.f18015s, brush, this.f17999c, null, 56);
        }
        Brush brush2 = this.f18003g;
        if (brush2 != null) {
            Stroke stroke2 = this.f18013q;
            if (this.f18011o || stroke2 == null) {
                Stroke stroke3 = new Stroke(this.f18002f, this.f18006j, this.f18004h, this.f18005i, null, 16);
                this.f18013q = stroke3;
                this.f18011o = false;
                stroke = stroke3;
            } else {
                stroke = stroke2;
            }
            DrawScope.m5370E0(drawScope, this.f18015s, brush2, this.f18001e, stroke, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX INFO: renamed from: e */
    public final void m5497e() {
        float f = this.f18007k;
        AndroidPath androidPath = this.f18014r;
        if (f == 0.0f && this.f18008l == 1.0f) {
            this.f18015s = androidPath;
            return;
        }
        if (Intrinsics.m18594b(this.f18015s, androidPath)) {
            this.f18015s = AndroidPath_androidKt.m5161a();
        } else {
            int iMo5147i = this.f18015s.mo5147i();
            this.f18015s.mo5151n();
            this.f18015s.mo5145g(iMo5147i);
        }
        ?? r0 = this.f18016t;
        ((PathMeasure) r0.getValue()).mo5160b(androidPath);
        float length = ((PathMeasure) r0.getValue()).getLength();
        float f2 = this.f18007k;
        float f3 = this.f18009m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.f18008l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((PathMeasure) r0.getValue()).mo5159a(f4, f5, this.f18015s);
        } else {
            ((PathMeasure) r0.getValue()).mo5159a(f4, length, this.f18015s);
            ((PathMeasure) r0.getValue()).mo5159a(0.0f, f5, this.f18015s);
        }
    }

    public final String toString() {
        return this.f18014r.toString();
    }
}
