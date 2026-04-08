package io.ktor.utils.p043io.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.ktor.utils.p043io.pool.DirectByteBufferPool;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class ObjectPoolKt {

    /* JADX INFO: renamed from: a */
    public static final int f47402a;

    /* JADX INFO: renamed from: b */
    public static final DirectByteBufferPool f47403b;

    /* JADX INFO: renamed from: c */
    public static final ObjectPoolKt$BufferObjectPool$1 f47404c;

    /* JADX INFO: renamed from: d */
    public static final ObjectPoolKt$BufferObjectNoPool$1 f47405d;

    static {
        int iM17558a = UtilsKt.m17558a(4096, "BufferSize");
        f47402a = iM17558a;
        int iM17558a2 = UtilsKt.m17558a(2048, "BufferPoolSize");
        int iM17558a3 = UtilsKt.m17558a(UserMetadata.MAX_ATTRIBUTE_SIZE, "BufferObjectPoolSize");
        f47403b = new DirectByteBufferPool(iM17558a2, iM17558a);
        f47404c = new ObjectPoolKt$BufferObjectPool$1(iM17558a3);
        f47405d = new ObjectPoolKt$BufferObjectNoPool$1();
    }
}
