package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalCoroutinesApi
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/selects/SelectInstance;", "R", "", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface SelectInstance<R> {
    /* JADX INFO: renamed from: a */
    void mo20898a(DisposableHandle disposableHandle);

    /* JADX INFO: renamed from: c */
    boolean mo20899c(Object obj, Object obj2);

    /* JADX INFO: renamed from: e */
    void mo20900e(Object obj);
}
