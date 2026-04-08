package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface LayoutCoordinates {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: C */
    long mo5617C(LayoutCoordinates layoutCoordinates, long j);

    /* JADX INFO: renamed from: H */
    LayoutCoordinates mo5618H();

    /* JADX INFO: renamed from: L */
    default void mo5619L(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    /* JADX INFO: renamed from: M */
    Rect mo5620M(LayoutCoordinates layoutCoordinates, boolean z2);

    /* JADX INFO: renamed from: R */
    long mo5621R(long j);

    /* JADX INFO: renamed from: S */
    default void mo5622S(LayoutCoordinates layoutCoordinates, float[] fArr) {
        InlineClassHelperKt.m5600e("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* JADX INFO: renamed from: Y */
    LayoutCoordinates mo5623Y();

    /* JADX INFO: renamed from: a */
    long mo5624a();

    /* JADX INFO: renamed from: g0 */
    default long mo5625g0(long j) {
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: m */
    boolean mo5626m();

    /* JADX INFO: renamed from: m0 */
    long mo5627m0(long j);

    /* JADX INFO: renamed from: z */
    long mo5628z(long j);
}
