package io.ktor.utils.p043io.core;

import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/core/Input;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface Input extends Closeable {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: F */
    long mo17428F(ByteBuffer byteBuffer, long j, long j2, long j3, long j4);

    /* JADX INFO: renamed from: f0 */
    boolean mo17435f0();

    /* JADX INFO: renamed from: p0 */
    long mo17442p0(long j);
}
