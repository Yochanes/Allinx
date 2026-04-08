package androidx.compose.foundation.lazy;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.p032m5.conversation.states.ConversationUiStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@LazyScopeMarker
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface LazyListScope {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2960a(LazyListScope lazyListScope, Function3 function3, int i) {
        lazyListScope.mo2917f((i & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, function3);
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m2961e(LazyListScope lazyListScope, int i, ComposableLambdaImpl composableLambdaImpl) {
        lazyListScope.mo2915c(i, null, LazyListScope$items$1.f6879a, composableLambdaImpl);
    }

    /* JADX INFO: renamed from: c */
    default void mo2915c(int i, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        throw new IllegalStateException("The method is not implemented");
    }

    /* JADX INFO: renamed from: d */
    default void mo2916d(ComposableLambdaImpl composableLambdaImpl) {
        mo2917f(null, new ComposableLambdaImpl(628101784, new LazyListScope$stickyHeader$2(composableLambdaImpl), true));
    }

    /* JADX INFO: renamed from: f */
    default void mo2917f(Object obj, Function3 function3) {
        throw new IllegalStateException("The method is not implemented");
    }
}
