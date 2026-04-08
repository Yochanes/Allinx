package io.ktor.utils.p043io;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.utils.p043io.core.ByteOrder;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00062"}, m18302d2 = {"Lio/ktor/utils/io/ByteChannelSequentialBaseSharedState;", "", "", MetricTracker.Action.CLOSED, "Z", "getClosed", "()Z", "setClosed", "(Z)V", "Lio/ktor/utils/io/core/ByteOrder;", "readByteOrder", "Lio/ktor/utils/io/core/ByteOrder;", "getReadByteOrder", "()Lio/ktor/utils/io/core/ByteOrder;", "setReadByteOrder", "(Lio/ktor/utils/io/core/ByteOrder;)V", "writeByteOrder", "getWriteByteOrder", "setWriteByteOrder", "", "totalBytesRead", "J", "getTotalBytesRead", "()J", "setTotalBytesRead", "(J)V", "totalBytesWritten", "getTotalBytesWritten", "setTotalBytesWritten", "", "closedCause", "Ljava/lang/Throwable;", "getClosedCause", "()Ljava/lang/Throwable;", "setClosedCause", "(Ljava/lang/Throwable;)V", "", "lastReadAvailable", "I", "getLastReadAvailable", "()I", "setLastReadAvailable", "(I)V", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "lastReadView", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "getLastReadView", "()Lio/ktor/utils/io/core/internal/ChunkBuffer;", "setLastReadView", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;)V", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ByteChannelSequentialBaseSharedState {
    private volatile boolean closed;

    @Nullable
    private volatile Throwable closedCause;
    private volatile int lastReadAvailable;

    @NotNull
    private volatile ChunkBuffer lastReadView;

    @NotNull
    private volatile ByteOrder readByteOrder;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;

    @NotNull
    private volatile ByteOrder writeByteOrder;
}
