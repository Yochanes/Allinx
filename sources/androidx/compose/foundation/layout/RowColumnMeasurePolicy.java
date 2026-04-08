package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface RowColumnMeasurePolicy {
    /* JADX INFO: renamed from: a */
    void mo2751a(int i, int[] iArr, int[] iArr2, MeasureScope measureScope);

    /* JADX INFO: renamed from: b */
    MeasureResult mo2752b(Placeable[] placeableArr, MeasureScope measureScope, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6);

    /* JADX INFO: renamed from: c */
    long mo2753c(int i, int i2, int i3, int i4, boolean z2);

    /* JADX INFO: renamed from: d */
    int mo2754d(Placeable placeable);

    /* JADX INFO: renamed from: e */
    int mo2755e(Placeable placeable);
}
