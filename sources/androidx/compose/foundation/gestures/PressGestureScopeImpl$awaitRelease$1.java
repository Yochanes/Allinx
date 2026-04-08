package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m18559f = "TapGestureDetector.kt", m18560l = {537}, m18561m = "awaitRelease")
final class PressGestureScopeImpl$awaitRelease$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f5837a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PressGestureScopeImpl f5838b;

    /* JADX INFO: renamed from: c */
    public int f5839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$awaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5838b = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5837a = obj;
        this.f5839c |= Integer.MIN_VALUE;
        return this.f5838b.mo2635z1(this);
    }
}
