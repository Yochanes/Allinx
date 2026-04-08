package io.ktor.network.sockets;

import io.ktor.utils.p043io.ByteBufferChannel;
import io.ktor.utils.p043io.ReaderJob;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/sockets/AWritable;", "", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface AWritable {
    /* JADX INFO: renamed from: a */
    ReaderJob mo17096a(ByteBufferChannel byteBufferChannel);
}
