package androidx.paging;

import androidx.paging.DataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.WrapperDataSource", m18559f = "WrapperDataSource.jvm.kt", m18560l = {68}, m18561m = "load$suspendImpl")
final class WrapperDataSource$load$1<Key, ValueFrom, ValueTo> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public WrapperDataSource f31375a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31376b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WrapperDataSource f31377c;

    /* JADX INFO: renamed from: d */
    public int f31378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperDataSource$load$1(WrapperDataSource wrapperDataSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31377c = wrapperDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WrapperDataSource$load$1<Key, ValueFrom, ValueTo> wrapperDataSource$load$1;
        this.f31376b = obj;
        this.f31378d |= Integer.MIN_VALUE;
        WrapperDataSource wrapperDataSource = this.f31377c;
        if (this instanceof WrapperDataSource$load$1) {
            int i = this.f31378d;
            if ((i & Integer.MIN_VALUE) != 0) {
                this.f31378d = i - Integer.MIN_VALUE;
                wrapperDataSource$load$1 = this;
            } else {
                wrapperDataSource$load$1 = new WrapperDataSource$load$1<>(wrapperDataSource, this);
            }
        }
        Object obj2 = wrapperDataSource$load$1.f31376b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = wrapperDataSource$load$1.f31378d;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            wrapperDataSource.getClass();
            wrapperDataSource$load$1.f31375a = wrapperDataSource;
            wrapperDataSource$load$1.f31378d = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        WrapperDataSource wrapperDataSource2 = wrapperDataSource$load$1.f31375a;
        ResultKt.m18313b(obj2);
        DataSource.BaseResult result = (DataSource.BaseResult) obj2;
        wrapperDataSource2.getClass();
        Intrinsics.m18599g(result, "result");
        Intrinsics.m18599g(null, "function");
        result.getClass();
        Intrinsics.m18599g(null, "function");
        Intrinsics.m18599g(null, "source");
        throw null;
    }
}
