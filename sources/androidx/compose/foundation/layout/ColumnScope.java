package androidx.compose.foundation.layout;

import androidx.compose.p013ui.BiasAlignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@LayoutScopeMarker
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/ColumnScope;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface ColumnScope {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ Modifier m2756a(Modifier modifier) {
        return ColumnScopeInstance.f6330a.m2758c(modifier, true);
    }

    /* JADX INFO: renamed from: b */
    Modifier mo2757b(Modifier modifier, BiasAlignment.Horizontal horizontal);
}
