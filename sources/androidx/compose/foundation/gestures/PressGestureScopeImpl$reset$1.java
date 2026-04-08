package androidx.compose.foundation.gestures;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m18559f = "TapGestureDetector.kt", m18560l = {531}, m18561m = MetricTracker.Object.RESET)
final class PressGestureScopeImpl$reset$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public PressGestureScopeImpl f5840a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5841b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ PressGestureScopeImpl f5842c;

    /* JADX INFO: renamed from: d */
    public int f5843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$reset$1(PressGestureScopeImpl pressGestureScopeImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5842c = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5841b = obj;
        this.f5843d |= Integer.MIN_VALUE;
        return this.f5842c.m2638s(this);
    }
}
