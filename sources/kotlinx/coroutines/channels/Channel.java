package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/coroutines/channels/Channel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Factory", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface Channel<E> extends SendChannel<E>, ReceiveChannel<E> {

    /* JADX INFO: renamed from: m */
    public static final Factory f55445m = Factory.f55446a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/channels/Channel$Factory;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Factory {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Factory f55446a = new Factory();

        /* JADX INFO: renamed from: b */
        public static final int f55447b = (int) SystemPropsKt.m20854b(64, 1, 2147483646, "kotlinx.coroutines.channels.defaultBuffer");
    }
}
