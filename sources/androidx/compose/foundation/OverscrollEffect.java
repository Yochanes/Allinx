package androidx.compose.foundation;

import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/OverscrollEffect;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface OverscrollEffect {
    /* JADX INFO: renamed from: C */
    default DelegatableNode mo2413C() {
        return new OverscrollEffect$node$1();
    }

    /* JADX INFO: renamed from: D */
    long mo2414D(long j, int i, Function1 function1);

    /* JADX INFO: renamed from: E */
    Object mo2415E(long j, Function2 function2, Continuation continuation);

    /* JADX INFO: renamed from: F */
    boolean mo2416F();
}
