package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.Rect;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public interface Canvas {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    void mo5090a(ArrayList arrayList, Paint paint);

    /* JADX INFO: renamed from: b */
    void mo5091b(float f, float f2);

    /* JADX INFO: renamed from: c */
    void mo5092c(Rect rect, Paint paint);

    /* JADX INFO: renamed from: d */
    void mo5093d(long j, long j2, Paint paint);

    /* JADX INFO: renamed from: e */
    void mo5094e(float f);

    /* JADX INFO: renamed from: f */
    void mo5095f(float f, float f2, float f3, float f4, Paint paint);

    /* JADX INFO: renamed from: g */
    void mo5096g(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint);

    /* JADX INFO: renamed from: h */
    void mo5097h(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);

    /* JADX INFO: renamed from: i */
    void mo5098i();

    /* JADX INFO: renamed from: j */
    void mo5099j();

    /* JADX INFO: renamed from: k */
    void mo5100k(Path path);

    /* JADX INFO: renamed from: l */
    void mo5101l(float[] fArr);

    /* JADX INFO: renamed from: m */
    void mo5102m(Path path, Paint paint);

    /* JADX INFO: renamed from: n */
    void mo5103n(float f, float f2, float f3, float f4, int i);

    /* JADX INFO: renamed from: o */
    void mo5104o(float f, float f2);

    /* JADX INFO: renamed from: p */
    default void m5176p(Rect rect) {
        mo5103n(rect.f17526a, rect.f17527b, rect.f17528c, rect.f17529d, 1);
    }

    /* JADX INFO: renamed from: q */
    void mo5105q(ImageBitmap imageBitmap, Paint paint);

    /* JADX INFO: renamed from: r */
    void mo5106r();

    /* JADX INFO: renamed from: s */
    void mo5107s(float f, long j, Paint paint);

    /* JADX INFO: renamed from: t */
    void mo5108t();

    /* JADX INFO: renamed from: u */
    void mo5109u(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);
}
