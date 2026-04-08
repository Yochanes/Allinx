package io.ktor.http.cio;

import com.google.common.base.Ascii;
import io.ktor.http.HttpMethod;
import io.ktor.utils.p043io.core.BytePacketBuilder;
import io.ktor.utils.p043io.core.InsufficientSpaceException;
import io.ktor.utils.p043io.core.PacketJVMKt;
import io.ktor.utils.p043io.core.StringsKt;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/cio/RequestResponseBuilder;", "", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class RequestResponseBuilder {

    /* JADX INFO: renamed from: a */
    public final BytePacketBuilder f45876a = PacketJVMKt.m17503a();

    /* JADX INFO: renamed from: a */
    public final void m17025a(String name, String value) throws InsufficientSpaceException, EOFException {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(value, "value");
        BytePacketBuilder bytePacketBuilder = this.f45876a;
        bytePacketBuilder.m17483H(name);
        bytePacketBuilder.m17483H(": ");
        bytePacketBuilder.m17483H(value);
        bytePacketBuilder.m17458z(Ascii.f42534CR);
        bytePacketBuilder.m17458z((byte) 10);
    }

    /* JADX INFO: renamed from: b */
    public final void m17026b(HttpMethod method, String uri, String version) throws InsufficientSpaceException, EOFException {
        Intrinsics.m18599g(method, "method");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(version, "version");
        String str = method.f45665a;
        BytePacketBuilder bytePacketBuilder = this.f45876a;
        StringsKt.m17511e(bytePacketBuilder, str);
        bytePacketBuilder.m17458z((byte) 32);
        StringsKt.m17511e(bytePacketBuilder, uri);
        bytePacketBuilder.m17458z((byte) 32);
        StringsKt.m17511e(bytePacketBuilder, version);
        bytePacketBuilder.m17458z(Ascii.f42534CR);
        bytePacketBuilder.m17458z((byte) 10);
    }
}
