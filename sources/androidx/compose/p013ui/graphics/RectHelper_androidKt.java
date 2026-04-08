package androidx.compose.p013ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.p013ui.unit.IntRect;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class RectHelper_androidKt {
    /* JADX INFO: renamed from: a */
    public static final Rect m5242a(androidx.compose.p013ui.geometry.Rect rect) {
        return new Rect((int) rect.f17526a, (int) rect.f17527b, (int) rect.f17528c, (int) rect.f17529d);
    }

    /* JADX INFO: renamed from: b */
    public static final Rect m5243b(IntRect intRect) {
        return new Rect(intRect.f20564a, intRect.f20565b, intRect.f20566c, intRect.f20567d);
    }

    /* JADX INFO: renamed from: c */
    public static final RectF m5244c(androidx.compose.p013ui.geometry.Rect rect) {
        return new RectF(rect.f17526a, rect.f17527b, rect.f17528c, rect.f17529d);
    }

    /* JADX INFO: renamed from: d */
    public static final androidx.compose.p013ui.geometry.Rect m5245d(Rect rect) {
        return new androidx.compose.p013ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: e */
    public static final androidx.compose.p013ui.geometry.Rect m5246e(RectF rectF) {
        return new androidx.compose.p013ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
