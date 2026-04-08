package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.state.WidgetFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/constraintlayout/compose/MotionRenderDebug;", "", "Companion", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MotionRenderDebug {

    /* JADX INFO: renamed from: a */
    public float[] f21022a;

    /* JADX INFO: renamed from: b */
    public int[] f21023b;

    /* JADX INFO: renamed from: c */
    public float[] f21024c;

    /* JADX INFO: renamed from: d */
    public Path f21025d;

    /* JADX INFO: renamed from: e */
    public Paint f21026e;

    /* JADX INFO: renamed from: f */
    public Paint f21027f;

    /* JADX INFO: renamed from: g */
    public Paint f21028g;

    /* JADX INFO: renamed from: h */
    public Paint f21029h;

    /* JADX INFO: renamed from: i */
    public int f21030i;

    /* JADX INFO: renamed from: j */
    public int f21031j;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m18302d2 = {"Landroidx/constraintlayout/compose/MotionRenderDebug$Companion;", "", "", "DEBUG_PATH_TICKS_PER_MS", "I", "DEBUG_SHOW_NONE", "DEBUG_SHOW_PATH", "DEBUG_SHOW_PROGRESS", "MAX_KEY_FRAMES", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public final void m6784a(Canvas canvas, int i, Motion motion, int i2, int i3) {
        MotionWidget motionWidget = motion.f21275a;
        if (motionWidget != null) {
            WidgetFrame widgetFrame = motionWidget.f21332a;
            int i4 = widgetFrame.f21736d;
            int i5 = widgetFrame.f21737e;
        }
        int i6 = i - 1;
        for (int i7 = 1; i7 < i6; i7++) {
            int i8 = i7 * 2;
            float[] fArr = this.f21024c;
            float f = fArr[i8];
            float f2 = fArr[i8 + 1];
            Path path = this.f21025d;
            Intrinsics.m18596d(path);
            path.reset();
            Path path2 = this.f21025d;
            Intrinsics.m18596d(path2);
            float f3 = 10;
            path2.moveTo(f, f2 + f3);
            Path path3 = this.f21025d;
            Intrinsics.m18596d(path3);
            path3.lineTo(f + f3, f2);
            Path path4 = this.f21025d;
            Intrinsics.m18596d(path4);
            path4.lineTo(f, f2 - f3);
            Path path5 = this.f21025d;
            Intrinsics.m18596d(path5);
            path5.lineTo(f - f3, f2);
            Path path6 = this.f21025d;
            Intrinsics.m18596d(path6);
            path6.close();
            Paint paint = this.f21029h;
            Path path7 = this.f21025d;
            Intrinsics.m18596d(path7);
            canvas.drawPath(path7, paint);
        }
        float[] fArr2 = this.f21022a;
        Intrinsics.m18596d(fArr2);
        if (fArr2.length > 1) {
            float[] fArr3 = this.f21022a;
            Intrinsics.m18596d(fArr3);
            float f4 = fArr3[0];
            float[] fArr4 = this.f21022a;
            Intrinsics.m18596d(fArr4);
            float f5 = fArr4[1];
            Paint paint2 = this.f21027f;
            canvas.drawCircle(f4, f5, 8.0f, paint2);
            float[] fArr5 = this.f21022a;
            Intrinsics.m18596d(fArr5);
            Intrinsics.m18596d(this.f21022a);
            float f6 = fArr5[r8.length - 2];
            float[] fArr6 = this.f21022a;
            Intrinsics.m18596d(fArr6);
            float[] fArr7 = this.f21022a;
            Intrinsics.m18596d(fArr7);
            canvas.drawCircle(f6, fArr6[fArr7.length - 1], 8.0f, paint2);
        }
    }
}
