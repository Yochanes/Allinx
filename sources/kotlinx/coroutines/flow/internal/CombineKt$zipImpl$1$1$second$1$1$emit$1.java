package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", m18559f = "Combine.kt", m18560l = {87}, m18561m = "emit")
final class CombineKt$zipImpl$1$1$second$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56281a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CombineKt$zipImpl$1$1$second$1.C63321 f56282b;

    /* JADX INFO: renamed from: c */
    public int f56283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$second$1$1$emit$1(CombineKt$zipImpl$1$1$second$1.C63321 c63321, Continuation continuation) {
        super(continuation);
        this.f56282b = c63321;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56281a = obj;
        this.f56283c |= Integer.MIN_VALUE;
        return this.f56282b.emit(null, this);
    }
}
