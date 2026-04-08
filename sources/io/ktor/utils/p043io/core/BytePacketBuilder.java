package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/core/BytePacketBuilder;", "Lio/ktor/utils/io/core/BytePacketBuilderPlatformBase;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class BytePacketBuilder extends BytePacketBuilderPlatformBase {
    /* JADX INFO: renamed from: H */
    public final void m17483H(String str) {
        super.mo17449d(str);
    }

    /* JADX INFO: renamed from: L */
    public final ByteReadPacket m17484L() throws EOFException {
        int iM17455n = m17455n();
        ChunkBuffer chunkBufferM17457x = m17457x();
        return chunkBufferM17457x == null ? ByteReadPacket.f47360d : new ByteReadPacket(chunkBufferM17457x, iM17455n, this.f47340b);
    }

    @Override // io.ktor.utils.p043io.core.AbstractOutput, java.lang.Appendable
    public final Appendable append(char c2) throws EOFException {
        super.mo17448b(c2);
        return this;
    }

    @Override // io.ktor.utils.p043io.core.AbstractOutput
    /* JADX INFO: renamed from: b */
    public final AbstractOutput mo17448b(char c2) throws EOFException {
        super.mo17448b(c2);
        return this;
    }

    @Override // io.ktor.utils.p043io.core.AbstractOutput
    /* JADX INFO: renamed from: d */
    public final AbstractOutput mo17449d(CharSequence charSequence) {
        super.mo17449d(charSequence);
        return this;
    }

    @Override // io.ktor.utils.p043io.core.AbstractOutput
    /* JADX INFO: renamed from: g */
    public final AbstractOutput mo17450g(CharSequence charSequence, int i, int i2) {
        AbstractOutput abstractOutputMo17450g = super.mo17450g(charSequence, i, i2);
        if (abstractOutputMo17450g != null) {
            return (BytePacketBuilder) abstractOutputMo17450g;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
    }

    @Override // io.ktor.utils.p043io.core.AbstractOutput
    /* JADX INFO: renamed from: k */
    public final void mo17454k(ByteBuffer source, int i, int i2) {
        Intrinsics.m18599g(source, "source");
    }

    public final String toString() {
        return "BytePacketBuilder(" + m17455n() + " bytes written)";
    }

    @Override // io.ktor.utils.p043io.core.AbstractOutput, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.mo17449d(charSequence);
        return this;
    }

    @Override // io.ktor.utils.p043io.core.AbstractOutput, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        AbstractOutput abstractOutputMo17450g = super.mo17450g(charSequence, i, i2);
        if (abstractOutputMo17450g != null) {
            return (BytePacketBuilder) abstractOutputMo17450g;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
    }

    @Override // io.ktor.utils.p043io.core.AbstractOutput
    /* JADX INFO: renamed from: j */
    public final void mo17453j() {
    }
}
