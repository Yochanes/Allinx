package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.ripple.RippleAnimation", m18559f = "RippleAnimation.kt", m18560l = {77, 79, 80}, m18561m = "animate")
final class RippleAnimation$animate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public RippleAnimation f11870a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f11871b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ RippleAnimation f11872c;

    /* JADX INFO: renamed from: d */
    public int f11873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$animate$1(RippleAnimation rippleAnimation, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11872c = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11871b = obj;
        this.f11873d |= Integer.MIN_VALUE;
        return this.f11872c.m3833a(this);
    }
}
