package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/paging/SimpleProducerScope;", "T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/SendChannel;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface SimpleProducerScope<T> extends CoroutineScope, SendChannel<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: y0 */
    Object mo11410y0(Function0 function0, ContinuationImpl continuationImpl);
}
