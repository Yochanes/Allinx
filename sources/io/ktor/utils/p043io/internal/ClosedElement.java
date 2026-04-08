package io.ktor.utils.p043io.internal;

import io.ktor.utils.p043io.ClosedWriteChannelException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/internal/ClosedElement;", "", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ClosedElement {

    /* JADX INFO: renamed from: b */
    public static final ClosedElement f47400b = new ClosedElement(null);

    /* JADX INFO: renamed from: a */
    public final Throwable f47401a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/ClosedElement$Companion;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public ClosedElement(Throwable th) {
        this.f47401a = th;
    }

    /* JADX INFO: renamed from: a */
    public final Throwable m17537a() {
        Throwable th = this.f47401a;
        return th != null ? th : new ClosedWriteChannelException("The channel was closed");
    }

    public final String toString() {
        return "Closed[" + m17537a() + ']';
    }
}
