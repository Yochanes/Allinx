package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface ContinuationInterceptor extends CoroutineContext.Element {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Key implements CoroutineContext.Key<ContinuationInterceptor> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Key f51580a = new Key();
    }

    /* JADX INFO: renamed from: C0 */
    DispatchedContinuation mo18548C0(ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: k */
    void mo18549k(Continuation continuation);
}
