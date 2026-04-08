package io.ktor.client.request.forms;

import io.ktor.utils.p043io.charsets.CharsetJVMKt;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-client-core"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class FormDataContentKt {

    /* JADX INFO: renamed from: a */
    public static final byte[] f45509a;

    static {
        CharsetEncoder charsetEncoderNewEncoder = Charsets.f55167a.newEncoder();
        Intrinsics.m18598f(charsetEncoderNewEncoder, "charset.newEncoder()");
        f45509a = CharsetJVMKt.m17415c(charsetEncoderNewEncoder, "\r\n", 2);
    }
}
