package io.ktor.http.cio;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.ktor.utils.p043io.pool.DefaultPool;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"io/ktor/http/cio/ChunkedTransferEncodingKt$ChunkSizeBufferPool$1", "Lio/ktor/utils/io/pool/DefaultPool;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ChunkedTransferEncodingKt$ChunkSizeBufferPool$1 extends DefaultPool<StringBuilder> {
    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: b */
    public final Object mo16936b(Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.setLength(0);
        return sb;
    }

    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: g */
    public final Object mo16937g() {
        return new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
    }
}
