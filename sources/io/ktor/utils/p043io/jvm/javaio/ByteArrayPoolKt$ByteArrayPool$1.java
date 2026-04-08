package io.ktor.utils.p043io.jvm.javaio;

import io.ktor.utils.p043io.pool.DefaultPool;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"io/ktor/utils/io/jvm/javaio/ByteArrayPoolKt$ByteArrayPool$1", "Lio/ktor/utils/io/pool/DefaultPool;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ByteArrayPoolKt$ByteArrayPool$1 extends DefaultPool<byte[]> {
    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: g */
    public final Object mo16937g() {
        return new byte[4096];
    }
}
