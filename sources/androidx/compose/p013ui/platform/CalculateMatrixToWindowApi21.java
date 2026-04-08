package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.compose.p013ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p013ui.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {

    /* JADX INFO: renamed from: a */
    public final float[] f19317a;

    /* JADX INFO: renamed from: b */
    public final int[] f19318b = new int[2];

    public CalculateMatrixToWindowApi21(float[] fArr) {
        this.f19317a = fArr;
    }

    @Override // androidx.compose.p013ui.platform.CalculateMatrixToWindow
    /* JADX INFO: renamed from: a */
    public final void mo6102a(View view, float[] fArr) {
        Matrix.m5231d(fArr);
        m6103b(view, fArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m6103b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z2 = parent instanceof View;
        float[] fArr2 = this.f19317a;
        if (z2) {
            m6103b((View) parent, fArr);
            Function1 function1 = AndroidComposeView_androidKt.f19233a;
            Matrix.m5231d(fArr2);
            Matrix.m5233f(fArr2, -view.getScrollX(), -view.getScrollY());
            AndroidComposeView_androidKt.m6088b(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            Matrix.m5231d(fArr2);
            Matrix.m5233f(fArr2, left, top);
            AndroidComposeView_androidKt.m6088b(fArr, fArr2);
        } else {
            int[] iArr = this.f19318b;
            view.getLocationInWindow(iArr);
            Function1 function12 = AndroidComposeView_androidKt.f19233a;
            Matrix.m5231d(fArr2);
            Matrix.m5233f(fArr2, -view.getScrollX(), -view.getScrollY());
            AndroidComposeView_androidKt.m6088b(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            Matrix.m5231d(fArr2);
            Matrix.m5233f(fArr2, f, f2);
            AndroidComposeView_androidKt.m6088b(fArr, fArr2);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AndroidMatrixConversions_androidKt.m5119b(matrix, fArr2);
        AndroidComposeView_androidKt.m6088b(fArr, fArr2);
    }
}
