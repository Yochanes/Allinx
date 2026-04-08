package androidx.paging;

import androidx.paging.FlowExtKt$simpleRunningReduce$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", m18559f = "FlowExt.kt", m18560l = {73, 76}, m18561m = "emit")
final class FlowExtKt$simpleRunningReduce$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f30673a;

    /* JADX INFO: renamed from: b */
    public Ref.ObjectRef f30674b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30675c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FlowExtKt$simpleRunningReduce$1.C20511 f30676d;

    /* JADX INFO: renamed from: f */
    public int f30677f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleRunningReduce$1$1$emit$1(FlowExtKt$simpleRunningReduce$1.C20511 c20511, Continuation continuation) {
        super(continuation);
        this.f30676d = c20511;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30675c = obj;
        this.f30677f |= Integer.MIN_VALUE;
        return this.f30676d.emit(null, this);
    }
}
