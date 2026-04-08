package io.ktor.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "e", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CryptoKt__CryptoJvmKt$getDigestFunction$2 extends Lambda implements Function1<String, byte[]> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws NoSuchAlgorithmException {
        String e = (String) obj;
        Intrinsics.m18599g(e, "e");
        MessageDigest.getInstance(null);
        throw null;
    }
}
