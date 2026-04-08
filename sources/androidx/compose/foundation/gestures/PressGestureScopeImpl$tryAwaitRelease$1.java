package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m18559f = "TapGestureDetector.kt", m18560l = {544}, m18561m = "tryAwaitRelease")
final class PressGestureScopeImpl$tryAwaitRelease$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public PressGestureScopeImpl f5844a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5845b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ PressGestureScopeImpl f5846c;

    /* JADX INFO: renamed from: d */
    public int f5847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$tryAwaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5846c = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5845b = obj;
        this.f5847d |= Integer.MIN_VALUE;
        return this.f5846c.mo2634V(this);
    }
}
