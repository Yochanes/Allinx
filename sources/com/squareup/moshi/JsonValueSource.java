package com.squareup.moshi;

import io.intercom.android.sdk.metrics.MetricTracker;
import okio.Buffer;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class JsonValueSource implements Source {
    static {
        ByteString.Companion companion = ByteString.f57840d;
        ByteString.Companion.m21633c("[]{}\"'/#");
        ByteString.Companion.m21633c("'\\");
        ByteString.Companion.m21633c("\"\\");
        ByteString.Companion.m21633c("\r\n");
        ByteString.Companion.m21633c(Marker.ANY_MARKER);
        ByteString.Companion companion2 = ByteString.f57840d;
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: J0 */
    public final long mo12415J0(Buffer buffer, long j) {
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF57877b() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
