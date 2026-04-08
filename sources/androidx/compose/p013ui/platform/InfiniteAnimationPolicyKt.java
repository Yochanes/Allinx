package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.platform.InfiniteAnimationPolicy;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class InfiniteAnimationPolicyKt {
    /* JADX INFO: renamed from: a */
    public static final Object m6149a(Function1 function1, Continuation continuation) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) continuation.getF55239c().mo2464u(InfiniteAnimationPolicy.Key.f19443a);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.m4385a(continuation.getF55239c()).mo4202u0(function1, continuation);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(function1, null);
        return infiniteAnimationPolicy.m6148r0();
    }
}
