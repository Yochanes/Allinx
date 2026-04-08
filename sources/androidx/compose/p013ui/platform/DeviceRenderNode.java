package androidx.compose.p013ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.p013ui.graphics.BlurEffect;
import androidx.compose.p013ui.graphics.CanvasHolder;
import androidx.compose.p013ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface DeviceRenderNode {
    /* JADX INFO: renamed from: A */
    void mo6108A(boolean z2);

    /* JADX INFO: renamed from: B */
    void mo6109B(CanvasHolder canvasHolder, Path path, Function1 function1);

    /* JADX INFO: renamed from: C */
    void mo6110C(int i);

    /* JADX INFO: renamed from: D */
    void mo6111D();

    /* JADX INFO: renamed from: E */
    void mo6112E(Matrix matrix);

    /* JADX INFO: renamed from: F */
    float mo6113F();

    /* JADX INFO: renamed from: a */
    float mo6114a();

    /* JADX INFO: renamed from: b */
    void mo6115b(float f);

    /* JADX INFO: renamed from: c */
    void mo6116c(float f);

    /* JADX INFO: renamed from: d */
    void mo6117d(float f);

    /* JADX INFO: renamed from: e */
    void mo6118e(float f);

    /* JADX INFO: renamed from: f */
    void mo6119f(float f);

    /* JADX INFO: renamed from: g */
    void mo6120g(float f);

    int getBottom();

    int getHeight();

    int getLeft();

    int getRight();

    int getTop();

    int getWidth();

    /* JADX INFO: renamed from: h */
    void mo6121h();

    /* JADX INFO: renamed from: i */
    void mo6122i(float f);

    /* JADX INFO: renamed from: j */
    void mo6123j(float f);

    /* JADX INFO: renamed from: k */
    void mo6124k(float f);

    /* JADX INFO: renamed from: l */
    boolean mo6125l();

    /* JADX INFO: renamed from: m */
    boolean mo6126m();

    /* JADX INFO: renamed from: n */
    void mo6127n(BlurEffect blurEffect);

    /* JADX INFO: renamed from: o */
    void mo6128o(int i);

    /* JADX INFO: renamed from: p */
    void mo6129p(Canvas canvas);

    /* JADX INFO: renamed from: q */
    void mo6130q(float f);

    /* JADX INFO: renamed from: r */
    void mo6131r(boolean z2);

    /* JADX INFO: renamed from: s */
    boolean mo6132s(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: t */
    void mo6133t(float f);

    /* JADX INFO: renamed from: u */
    void mo6134u(float f);

    /* JADX INFO: renamed from: v */
    void mo6135v(int i);

    /* JADX INFO: renamed from: w */
    void mo6136w(Outline outline);

    /* JADX INFO: renamed from: x */
    boolean mo6137x();

    /* JADX INFO: renamed from: y */
    void mo6138y(int i);

    /* JADX INFO: renamed from: z */
    boolean mo6139z();
}
