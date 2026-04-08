package io.ktor.network.tls;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.nio.charset.Charset;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-network-tls"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class KeysKt {

    /* JADX INFO: renamed from: a */
    public static final byte[] f46144a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f46145b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f46146c;

    /* JADX INFO: renamed from: d */
    public static final byte[] f46147d;

    static {
        Charset charset = Charsets.f55167a;
        byte[] bytes = "master secret".getBytes(charset);
        Intrinsics.m18598f(bytes, "(this as java.lang.String).getBytes(charset)");
        f46144a = bytes;
        byte[] bytes2 = "key expansion".getBytes(charset);
        Intrinsics.m18598f(bytes2, "(this as java.lang.String).getBytes(charset)");
        f46145b = bytes2;
        byte[] bytes3 = "client finished".getBytes(charset);
        Intrinsics.m18598f(bytes3, "(this as java.lang.String).getBytes(charset)");
        f46146c = bytes3;
        byte[] bytes4 = "server finished".getBytes(charset);
        Intrinsics.m18598f(bytes4, "(this as java.lang.String).getBytes(charset)");
        f46147d = bytes4;
    }

    /* JADX INFO: renamed from: a */
    public static final SecretKeySpec m17116a(CipherSuite suite, byte[] bArr) {
        Intrinsics.m18599g(suite, "suite");
        return new SecretKeySpec(bArr, suite.f46122b * 2, suite.f46121a, StringsKt.m20423U(suite.f46127g, RemoteSettings.FORWARD_SLASH_STRING));
    }

    /* JADX INFO: renamed from: b */
    public static final SecretKeySpec m17117b(CipherSuite suite, byte[] bArr) {
        Intrinsics.m18599g(suite, "suite");
        int i = suite.f46122b * 2;
        int i2 = suite.f46121a;
        return new SecretKeySpec(bArr, i + i2, i2, StringsKt.m20423U(suite.f46127g, RemoteSettings.FORWARD_SLASH_STRING));
    }
}
