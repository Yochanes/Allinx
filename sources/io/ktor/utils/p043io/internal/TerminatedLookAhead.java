package io.ktor.utils.p043io.internal;

import io.ktor.utils.p043io.LookAheadSuspendSession;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/TerminatedLookAhead;", "Lio/ktor/utils/io/LookAheadSuspendSession;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class TerminatedLookAhead implements LookAheadSuspendSession {

    /* JADX INFO: renamed from: b */
    public static final TerminatedLookAhead f47442b = new TerminatedLookAhead();

    @Override // io.ktor.utils.p043io.LookAheadSuspendSession
    /* JADX INFO: renamed from: a */
    public final Object mo17290a(int i, ContinuationImpl continuationImpl) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "atLeast parameter shouldn't be negative: ").toString());
        }
        if (i <= 4088) {
            return Boolean.FALSE;
        }
        throw new IllegalArgumentException(AbstractC0000a.m9f(i, "atLeast parameter shouldn't be larger than max buffer size of 4088: ").toString());
    }

    @Override // io.ktor.utils.p043io.LookAheadSession
    /* JADX INFO: renamed from: f */
    public final ByteBuffer mo17302f(int i, int i2) {
        return null;
    }

    @Override // io.ktor.utils.p043io.LookAheadSession
    /* JADX INFO: renamed from: w */
    public final void mo17337w(int i) {
        if (i > 0) {
            throw new IllegalStateException(AbstractC0000a.m10g(i, "Unable to mark ", " bytes consumed for already terminated channel"));
        }
    }
}
