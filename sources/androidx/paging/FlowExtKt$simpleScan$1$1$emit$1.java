package androidx.paging;

import androidx.paging.FlowExtKt$simpleScan$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.FlowExtKt$simpleScan$1$1", m18559f = "FlowExt.kt", m18560l = {56, 57}, m18561m = "emit")
final class FlowExtKt$simpleScan$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f30686a;

    /* JADX INFO: renamed from: b */
    public Ref.ObjectRef f30687b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30688c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FlowExtKt$simpleScan$1.C20521 f30689d;

    /* JADX INFO: renamed from: f */
    public int f30690f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleScan$1$1$emit$1(FlowExtKt$simpleScan$1.C20521 c20521, Continuation continuation) {
        super(continuation);
        this.f30689d = c20521;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30688c = obj;
        this.f30690f |= Integer.MIN_VALUE;
        return this.f30689d.emit(null, this);
    }
}
