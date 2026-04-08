package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalCoroutinesApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface MainDispatcherFactory {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    MainCoroutineDispatcher mo20655a();

    /* JADX INFO: renamed from: b */
    int mo20656b();
}
