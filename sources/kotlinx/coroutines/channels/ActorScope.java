package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ObsoleteCoroutinesApi
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/channels/ActorScope;", "E", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface ActorScope<E> extends CoroutineScope, ReceiveChannel<E> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: e */
    ChannelCoroutine m20661e();
}
