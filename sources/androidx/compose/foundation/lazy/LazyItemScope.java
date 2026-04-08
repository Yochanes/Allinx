package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@LazyScopeMarker
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/LazyItemScope;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface LazyItemScope {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    Modifier mo2902a();

    /* JADX INFO: renamed from: b */
    Modifier mo2903b();

    /* JADX INFO: renamed from: c */
    default Modifier mo2904c(Modifier modifier, SpringSpec springSpec, SpringSpec springSpec2) {
        return modifier;
    }
}
