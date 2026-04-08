package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.StartedLazily$command$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m18559f = "SharingStarted.kt", m18560l = {154}, m18561m = "emit")
final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ StartedLazily$command$1.C63231 f56163b;

    /* JADX INFO: renamed from: c */
    public int f56164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1$1$emit$1(StartedLazily$command$1.C63231 c63231, Continuation continuation) {
        super(continuation);
        this.f56163b = c63231;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56162a = obj;
        this.f56164c |= Integer.MIN_VALUE;
        return this.f56163b.m20801a(0, this);
    }
}
