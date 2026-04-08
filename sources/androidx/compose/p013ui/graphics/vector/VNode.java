package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class VNode {

    /* JADX INFO: renamed from: a */
    public Function1 f18080a;

    /* JADX INFO: renamed from: a */
    public abstract void mo5473a(DrawScope drawScope);

    /* JADX INFO: renamed from: b, reason: from getter */
    public Function1 getF18080a() {
        return this.f18080a;
    }

    /* JADX INFO: renamed from: c */
    public final void m5501c() {
        Function1 f18080a = getF18080a();
        if (f18080a != null) {
            f18080a.invoke(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo5475d(Function1 function1) {
        this.f18080a = function1;
    }
}
