package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18302d2 = {"<anonymous>", "R", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "it", "", "invoke", "(J)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SuspendAnimationKt$callWithFrameNanos$2 extends Lambda implements Function1<Long, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lambda f4591a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$callWithFrameNanos$2(Function1 function1) {
        super(1);
        this.f4591a = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.f4591a.invoke(Long.valueOf(((Number) obj).longValue()));
    }
}
