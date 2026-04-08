package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/pager/PagerLayoutInfo;", "", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PagerLayoutInfo {
    /* JADX INFO: renamed from: a */
    long mo3146a();

    /* JADX INFO: renamed from: b */
    int mo3147b();

    /* JADX INFO: renamed from: c */
    Orientation mo3148c();

    /* JADX INFO: renamed from: d */
    int mo3149d();

    /* JADX INFO: renamed from: e */
    List mo3150e();

    /* JADX INFO: renamed from: f */
    int mo3151f();

    /* JADX INFO: renamed from: g */
    SnapPosition mo3152g();

    int getPageSize();

    /* JADX INFO: renamed from: h */
    boolean mo3153h();
}
