package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.runtime.PausableMonotonicFrameClock", m18559f = "PausableMonotonicFrameClock.kt", m18560l = {61, 62}, m18561m = "withFrameNanos")
final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public PausableMonotonicFrameClock f16422a;

    /* JADX INFO: renamed from: b */
    public Function1 f16423b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16424c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ PausableMonotonicFrameClock f16425d;

    /* JADX INFO: renamed from: f */
    public int f16426f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, Continuation continuation) {
        super(continuation);
        this.f16425d = pausableMonotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16424c = obj;
        this.f16426f |= Integer.MIN_VALUE;
        return this.f16425d.mo4202u0(null, this);
    }
}
