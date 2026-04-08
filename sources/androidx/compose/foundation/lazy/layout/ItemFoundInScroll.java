package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ItemFoundInScroll extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final int f7189a;

    /* JADX INFO: renamed from: b */
    public final AnimationState f7190b;

    public ItemFoundInScroll(int i, AnimationState animationState) {
        this.f7189a = i;
        this.f7190b = animationState;
    }
}
