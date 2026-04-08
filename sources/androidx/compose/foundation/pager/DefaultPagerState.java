package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/pager/DefaultPagerState;", "Landroidx/compose/foundation/pager/PagerState;", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DefaultPagerState extends PagerState {

    /* JADX INFO: renamed from: K */
    public static final SaverKt$Saver$1 f7662K = ListSaverKt.m4749a(DefaultPagerState$Companion$Saver$2.f7665a, DefaultPagerState$Companion$Saver$1.f7664a);

    /* JADX INFO: renamed from: J */
    public final MutableState f7663J;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/pager/DefaultPagerState$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public DefaultPagerState(int i, float f, Function0 function0) {
        super(i, f);
        this.f7663J = SnapshotStateKt.m4525g(function0);
    }

    @Override // androidx.compose.foundation.pager.PagerState
    /* JADX INFO: renamed from: m */
    public final int mo3139m() {
        return ((Number) ((Function0) ((SnapshotMutableStateImpl) this.f7663J).getF20325a()).invoke()).intValue();
    }
}
