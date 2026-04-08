package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.constraintlayout.compose.TransitionHandler", m18559f = "TransitionHandler.kt", m18560l = {74}, m18561m = "updateProgressWhileTouchUp")
final class TransitionHandler$updateProgressWhileTouchUp$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public TransitionHandler f21040a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f21041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransitionHandler f21042c;

    /* JADX INFO: renamed from: d */
    public int f21043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionHandler$updateProgressWhileTouchUp$1(TransitionHandler transitionHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f21042c = transitionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21041b = obj;
        this.f21043d |= Integer.MIN_VALUE;
        return this.f21042c.m6787a(this);
    }
}
