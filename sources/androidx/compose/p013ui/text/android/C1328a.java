package androidx.compose.p013ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.ui.text.android.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1328a implements Layout.TextInclusionStrategy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2 f20169a;

    public /* synthetic */ C1328a(Function2 function2) {
        this.f20169a = function2;
    }

    @Override // android.text.Layout.TextInclusionStrategy
    public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
        return ((Boolean) this.f20169a.invoke(rectF, rectF2)).booleanValue();
    }
}
