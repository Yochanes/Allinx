package androidx.compose.p013ui.graphics.vector;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Matrix;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class GroupComponent extends VNode {

    /* JADX INFO: renamed from: b */
    public float[] f17945b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f17946c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f17947d = true;

    /* JADX INFO: renamed from: e */
    public long f17948e = Color.f17583k;

    /* JADX INFO: renamed from: f */
    public List f17949f;

    /* JADX INFO: renamed from: g */
    public boolean f17950g;

    /* JADX INFO: renamed from: h */
    public AndroidPath f17951h;

    /* JADX INFO: renamed from: i */
    public Lambda f17952i;

    /* JADX INFO: renamed from: j */
    public final Function1 f17953j;

    /* JADX INFO: renamed from: k */
    public String f17954k;

    /* JADX INFO: renamed from: l */
    public float f17955l;

    /* JADX INFO: renamed from: m */
    public float f17956m;

    /* JADX INFO: renamed from: n */
    public float f17957n;

    /* JADX INFO: renamed from: o */
    public float f17958o;

    /* JADX INFO: renamed from: p */
    public float f17959p;

    /* JADX INFO: renamed from: q */
    public float f17960q;

    /* JADX INFO: renamed from: r */
    public float f17961r;

    /* JADX INFO: renamed from: s */
    public boolean f17962s;

    public GroupComponent() {
        int i = VectorKt.f18156a;
        this.f17949f = EmptyList.f51496a;
        this.f17950g = true;
        this.f17953j = new GroupComponent$wrappedListener$1(this);
        this.f17954k = "";
        this.f17958o = 1.0f;
        this.f17959p = 1.0f;
        this.f17962s = true;
    }

    @Override // androidx.compose.p013ui.graphics.vector.VNode
    /* JADX INFO: renamed from: a */
    public final void mo5473a(DrawScope drawScope) {
        if (this.f17962s) {
            float[] fArrM5228a = this.f17945b;
            if (fArrM5228a == null) {
                fArrM5228a = Matrix.m5228a();
                this.f17945b = fArrM5228a;
            } else {
                Matrix.m5231d(fArrM5228a);
            }
            Matrix.m5233f(fArrM5228a, this.f17960q + this.f17956m, this.f17961r + this.f17957n);
            float f = this.f17955l;
            if (fArrM5228a.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrM5228a[0];
                float f3 = fArrM5228a[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrM5228a[1];
                float f8 = fArrM5228a[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrM5228a[2];
                float f12 = fArrM5228a[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrM5228a[3];
                float f16 = fArrM5228a[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrM5228a[0] = f4;
                fArrM5228a[1] = f9;
                fArrM5228a[2] = f13;
                fArrM5228a[3] = f17;
                fArrM5228a[4] = f6;
                fArrM5228a[5] = f10;
                fArrM5228a[6] = f14;
                fArrM5228a[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.f17958o;
            float f19 = this.f17959p;
            if (fArrM5228a.length >= 16) {
                fArrM5228a[0] = fArrM5228a[0] * f18;
                fArrM5228a[1] = fArrM5228a[1] * f18;
                fArrM5228a[2] = fArrM5228a[2] * f18;
                fArrM5228a[3] = fArrM5228a[3] * f18;
                fArrM5228a[4] = fArrM5228a[4] * f19;
                fArrM5228a[5] = fArrM5228a[5] * f19;
                fArrM5228a[6] = fArrM5228a[6] * f19;
                fArrM5228a[7] = fArrM5228a[7] * f19;
                fArrM5228a[8] = fArrM5228a[8] * 1.0f;
                fArrM5228a[9] = fArrM5228a[9] * 1.0f;
                fArrM5228a[10] = fArrM5228a[10] * 1.0f;
                fArrM5228a[11] = fArrM5228a[11] * 1.0f;
            }
            Matrix.m5233f(fArrM5228a, -this.f17956m, -this.f17957n);
            this.f17962s = false;
        }
        if (this.f17950g) {
            if (!this.f17949f.isEmpty()) {
                AndroidPath androidPathM5161a = this.f17951h;
                if (androidPathM5161a == null) {
                    androidPathM5161a = AndroidPath_androidKt.m5161a();
                    this.f17951h = androidPathM5161a;
                }
                PathParserKt.m5500b(this.f17949f, androidPathM5161a);
            }
            this.f17950g = false;
        }
        CanvasDrawScope$drawContext$1 f17768b = drawScope.getF17768b();
        long jM5358d = f17768b.m5358d();
        f17768b.m5355a().mo5098i();
        try {
            CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = f17768b.f17775a;
            float[] fArr = this.f17945b;
            if (fArr != null) {
                canvasDrawScopeKt$asDrawTransform$1.f17778a.m5355a().mo5101l(fArr);
            }
            AndroidPath androidPath = this.f17951h;
            if (!this.f17949f.isEmpty() && androidPath != null) {
                canvasDrawScopeKt$asDrawTransform$1.m5363a(androidPath);
            }
            ArrayList arrayList = this.f17946c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((VNode) arrayList.get(i)).mo5473a(drawScope);
            }
        } finally {
            AbstractC0455a.m2224C(f17768b, jM5358d);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.p013ui.graphics.vector.VNode
    /* JADX INFO: renamed from: b */
    public final Function1 getF18080a() {
        return this.f17952i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.graphics.vector.VNode
    /* JADX INFO: renamed from: d */
    public final void mo5475d(Function1 function1) {
        this.f17952i = (Lambda) function1;
    }

    /* JADX INFO: renamed from: e */
    public final void m5476e(int i, VNode vNode) {
        ArrayList arrayList = this.f17946c;
        if (i < arrayList.size()) {
            arrayList.set(i, vNode);
        } else {
            arrayList.add(vNode);
        }
        m5478g(vNode);
        vNode.mo5475d(this.f17953j);
        m5501c();
    }

    /* JADX INFO: renamed from: f */
    public final void m5477f(long j) {
        if (this.f17947d && j != 16) {
            long j2 = this.f17948e;
            if (j2 == 16) {
                this.f17948e = j;
                return;
            }
            int i = VectorKt.f18156a;
            if (Color.m5186h(j2) == Color.m5186h(j) && Color.m5185g(j2) == Color.m5185g(j) && Color.m5183e(j2) == Color.m5183e(j)) {
                return;
            }
            this.f17947d = false;
            this.f17948e = Color.f17583k;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5478g(VNode vNode) {
        if (!(vNode instanceof PathComponent)) {
            if (vNode instanceof GroupComponent) {
                GroupComponent groupComponent = (GroupComponent) vNode;
                if (groupComponent.f17947d && this.f17947d) {
                    m5477f(groupComponent.f17948e);
                    return;
                } else {
                    this.f17947d = false;
                    this.f17948e = Color.f17583k;
                    return;
                }
            }
            return;
        }
        PathComponent pathComponent = (PathComponent) vNode;
        Brush brush = pathComponent.f17998b;
        if (this.f17947d && brush != null) {
            if (brush instanceof SolidColor) {
                m5477f(((SolidColor) brush).f17675a);
            } else {
                this.f17947d = false;
                this.f17948e = Color.f17583k;
            }
        }
        Brush brush2 = pathComponent.f18003g;
        if (this.f17947d && brush2 != null) {
            if (brush2 instanceof SolidColor) {
                m5477f(((SolidColor) brush2).f17675a);
            } else {
                this.f17947d = false;
                this.f17948e = Color.f17583k;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5479h(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = this.f17946c;
            if (i < arrayList.size()) {
                ((VNode) arrayList.get(i)).mo5475d(null);
                arrayList.remove(i);
            }
        }
        m5501c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f17954k);
        ArrayList arrayList = this.f17946c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            VNode vNode = (VNode) arrayList.get(i);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
