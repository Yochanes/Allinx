package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/constraintlayout/compose/MotionCarouselScopeImpl;", "Landroidx/constraintlayout/compose/MotionCarouselScope;", "Landroidx/constraintlayout/compose/MotionItemsProvider;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class MotionCarouselScopeImpl implements MotionCarouselScope, MotionItemsProvider {
    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    /* JADX INFO: renamed from: a */
    public final ComposableLambdaImpl mo6780a(int i) {
        return new ComposableLambdaImpl(752436001, new MotionCarouselScopeImpl$getContent$1(this, i), true);
    }
}
