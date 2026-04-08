package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface LazyListLayoutInfo {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    default long mo2929a() {
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    default int mo2930b() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    default Orientation mo2931c() {
        return Orientation.f5829a;
    }

    /* JADX INFO: renamed from: d */
    default int mo2932d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    int mo2933e();

    /* JADX INFO: renamed from: f */
    default int mo2934f() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    List mo2935g();

    /* JADX INFO: renamed from: h */
    default boolean mo2936h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    int mo2937i();

    /* JADX INFO: renamed from: j */
    int mo2938j();
}
