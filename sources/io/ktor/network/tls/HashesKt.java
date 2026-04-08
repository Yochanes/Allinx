package io.ktor.network.tls;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-network-tls"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class HashesKt {
    /* JADX INFO: renamed from: a */
    public static final byte[] m17115a(SecretKeySpec secret, byte[] label, byte[] bArr, int i) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.m18599g(secret, "secret");
        Intrinsics.m18599g(label, "label");
        byte[] bArrM18353T = ArraysKt.m18353T(label, bArr);
        Mac mac = Mac.getInstance(secret.getAlgorithm());
        Intrinsics.m18598f(mac, "Mac.getInstance(secret.algorithm)");
        if (i < 12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byte[] bArrM18353T2 = new byte[0];
        byte[] bArrDoFinal = bArrM18353T;
        while (bArrM18353T2.length < i) {
            mac.reset();
            mac.init(secret);
            mac.update(bArrDoFinal);
            bArrDoFinal = mac.doFinal();
            Intrinsics.m18598f(bArrDoFinal, "mac.doFinal()");
            mac.reset();
            mac.init(secret);
            mac.update(bArrDoFinal);
            mac.update(bArrM18353T);
            byte[] bArrDoFinal2 = mac.doFinal();
            Intrinsics.m18598f(bArrDoFinal2, "mac.doFinal()");
            bArrM18353T2 = ArraysKt.m18353T(bArrM18353T2, bArrDoFinal2);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArrM18353T2, i);
        Intrinsics.m18598f(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf;
    }
}
