package io.ktor.util;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import io.ktor.utils.p043io.core.BytePacketBuilder;
import io.ktor.utils.p043io.core.PacketJVMKt;
import io.ktor.utils.p043io.core.StringsKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"io/ktor/util/CryptoKt__CryptoJvmKt", "io/ktor/util/CryptoKt__CryptoKt"}, m18303k = 4, m18304mv = {1, 4, 2})
public final class CryptoKt {
    /* JADX INFO: renamed from: a */
    public static final String m17166a() {
        String str = (String) NonceKt.f46474b.poll();
        if (str != null) {
            return str;
        }
        ((JobSupport) NonceKt.f46475c).start();
        return (String) BuildersKt.m20508d(EmptyCoroutineContext.f51581a, new CryptoKt__CryptoJvmKt$generateNonceBlocking$1(2, null));
    }

    /* JADX INFO: renamed from: b */
    public static final byte[] m17167b(int i) {
        char[] cArr = CryptoKt__CryptoKt.f46447a;
        BytePacketBuilder bytePacketBuilderM17503a = PacketJVMKt.m17503a();
        while (bytePacketBuilderM17503a.m17455n() < i) {
            try {
                StringsKt.m17511e(bytePacketBuilderM17503a, m17166a());
            } catch (Throwable th) {
                bytePacketBuilderM17503a.close();
                throw th;
            }
        }
        return StringsKt.m17508b(bytePacketBuilderM17503a.m17484L(), i);
    }

    /* JADX INFO: renamed from: c */
    public static final String m17168c(byte[] bytes) {
        char[] cArr = CryptoKt__CryptoKt.f46447a;
        Intrinsics.m18599g(bytes, "bytes");
        char[] cArr2 = new char[bytes.length * 2];
        int i = 0;
        for (byte b2 : bytes) {
            int i2 = i + 1;
            int i3 = (b2 & UnsignedBytes.MAX_VALUE) >> 4;
            char[] cArr3 = CryptoKt__CryptoKt.f46447a;
            cArr2[i] = cArr3[i3];
            i += 2;
            cArr2[i2] = cArr3[b2 & Ascii.f42543SI];
        }
        return new String(cArr2);
    }
}
