package io.ktor.utils.p043io.pool;

import java.io.Closeable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/utils/io/pool/ObjectPool;", "", "T", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface ObjectPool<T> extends Closeable {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: G */
    Object mo17488G();

    /* JADX INFO: renamed from: N0 */
    void mo17522N0(Object obj);
}
