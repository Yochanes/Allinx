package androidx.compose.p013ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, m18302d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi29;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "Landroid/view/View;", "view", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "a", "(Landroid/view/View;[F)V", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class CalculateMatrixToWindowApi29 implements CalculateMatrixToWindow {

    /* JADX INFO: renamed from: a */
    public final Matrix f19319a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final int[] f19320b = new int[2];

    @Override // androidx.compose.p013ui.platform.CalculateMatrixToWindow
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public void mo6102a(@NotNull View view, @NotNull float[] matrix) {
        Matrix matrix2 = this.f19319a;
        matrix2.reset();
        AbstractC1311g.m6230g(view, matrix2);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f19320b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix2.postTranslate(iArr[0] - i, iArr[1] - i2);
        AndroidMatrixConversions_androidKt.m5119b(matrix2, matrix);
    }
}
