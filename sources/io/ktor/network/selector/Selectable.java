package io.ktor.network.selector;

import io.ktor.util.InternalAPI;
import java.io.Closeable;
import java.nio.channels.SelectableChannel;
import kotlin.Metadata;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/selector/Selectable;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/DisposableHandle;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface Selectable extends Closeable, DisposableHandle {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: A */
    InterestSuspensionsMap mo17085A();

    /* JADX INFO: renamed from: e */
    SelectableChannel mo17086e();

    /* JADX INFO: renamed from: k0 */
    int mo17087k0();

    /* JADX INFO: renamed from: t0 */
    void mo17088t0(SelectInterest selectInterest, boolean z2);
}
