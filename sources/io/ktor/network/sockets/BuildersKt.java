package io.ktor.network.sockets;

import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-network"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class BuildersKt {
    /* JADX INFO: renamed from: a */
    public static final SocketBuilder m17097a(SelectorManager selector) {
        Intrinsics.m18599g(selector, "selector");
        return new SocketBuilder(selector, new SocketOptions.GeneralSocketOptions(new HashMap()));
    }
}
