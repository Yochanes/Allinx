package io.ktor.utils.p043io.core;

import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class BufferKt {
    /* JADX INFO: renamed from: a */
    public static final void m17472a(int i, int i2) throws EOFException {
        throw new EOFException("Unable to discard " + i + " bytes: only " + i2 + " available for writing");
    }

    /* JADX INFO: renamed from: b */
    public static final void m17473b(int i, int i2) throws EOFException {
        throw new EOFException("Unable to discard " + i + " bytes: only " + i2 + " available for reading");
    }
}
