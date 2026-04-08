package io.ktor.http;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import io.ktor.utils.p043io.charsets.EncodingKt;
import io.ktor.utils.p043io.core.BufferSharedState;
import io.ktor.utils.p043io.core.ByteReadPacket;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.core.internal.UnsafeKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-http"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class CodecsKt {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f45571a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f45572b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f45573c;

    /* JADX INFO: renamed from: d */
    public static final ArrayList f45574d;

    /* JADX INFO: renamed from: e */
    public static final List f45575e;

    /* JADX INFO: renamed from: f */
    public static final ArrayList f45576f;

    static {
        ArrayList arrayListM18425Z = CollectionsKt.m18425Z(CollectionsKt.m18423X(new CharRange('a', 'z'), new CharRange('A', 'Z')), new CharRange('0', '9'));
        ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(arrayListM18425Z, 10));
        Iterator it = arrayListM18425Z.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f45571a = arrayList;
        f45572b = CollectionsKt.m18425Z(CollectionsKt.m18423X(new CharRange('a', 'z'), new CharRange('A', 'Z')), new CharRange('0', '9'));
        f45573c = CollectionsKt.m18425Z(CollectionsKt.m18423X(new CharRange('a', 'f'), new CharRange('A', 'F')), new CharRange('0', '9'));
        List listM18414O = CollectionsKt.m18414O(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m18452r(listM18414O, 10));
        Iterator it2 = listM18414O.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f45574d = arrayList2;
        f45575e = CollectionsKt.m18414O(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~');
        List listM18414O2 = CollectionsKt.m18414O('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(CollectionsKt.m18452r(listM18414O2, 10));
        Iterator it3 = listM18414O2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f45576f = arrayList3;
        SetsKt.m18501e(ArraysKt.m18372h0(new Character[]{'!', '#', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~'}), SetsKt.m18501e(SetsKt.m18501e(CollectionsKt.m18399B0(new CharRange('a', 'z')), CollectionsKt.m18399B0(new CharRange('A', 'Z'))), CollectionsKt.m18399B0(new CharRange('0', '9'))));
    }

    /* JADX INFO: renamed from: a */
    public static final String m16939a(byte b2) {
        StringBuilder sb = new StringBuilder(3);
        int i = b2 & UnsignedBytes.MAX_VALUE;
        sb.append('%');
        int i2 = i >> 4;
        sb.append((char) ((i2 >= 0 && 9 >= i2) ? i2 + 48 : ((char) (i2 + 65)) - '\n'));
        int i3 = b2 & Ascii.f42543SI;
        sb.append((char) ((i3 >= 0 && 9 >= i3) ? i3 + 48 : ((char) (i3 + 65)) - '\n'));
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static final int m16940b(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static final String m16941c(String str, int i, int i2, boolean z2, Charset charset) throws URLDecodeException {
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (z2 && cCharAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char cCharAt2 = str.charAt(i3);
                    if (z2 && cCharAt2 == '+') {
                        sb.append(' ');
                        i3++;
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 >= i2) {
                                throw new URLDecodeException("Incomplete trailing HEX escape: " + str.subSequence(i3, str.length()).toString() + ", in " + ((CharSequence) str) + " at " + i3);
                            }
                            int i7 = i3 + 1;
                            int iM16940b = m16940b(str.charAt(i7));
                            int iM16940b2 = m16940b(str.charAt(i6));
                            if (iM16940b == -1 || iM16940b2 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((CharSequence) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((iM16940b * 16) + iM16940b2);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(new String(bArr, 0, i5, charset));
                    } else {
                        sb.append(cCharAt2);
                        i3++;
                    }
                }
                String string = sb.toString();
                Intrinsics.m18598f(string, "sb.toString()");
                return string;
            }
            i3++;
        }
        if (i == 0 && i2 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.m18598f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: d */
    public static String m16942d(String str) {
        int length = str.length();
        Charset charset = Charsets.f55167a;
        Intrinsics.m18599g(charset, "charset");
        return m16941c(str, 0, length, false, charset);
    }

    /* JADX INFO: renamed from: e */
    public static String m16943e(int i, int i2, int i3, String str) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z2 = (i3 & 4) == 0;
        Charset charset = Charsets.f55167a;
        Intrinsics.m18599g(charset, "charset");
        return m16941c(str, i, i2, z2, charset);
    }

    /* JADX INFO: renamed from: f */
    public static final String m16944f(String encodeURLParameter, boolean z2) throws Throwable {
        Intrinsics.m18599g(encodeURLParameter, "$this$encodeURLParameter");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = Charsets.f55167a.newEncoder();
        Intrinsics.m18598f(charsetEncoderNewEncoder, "Charsets.UTF_8.newEncoder()");
        m16947i(EncodingKt.m17419b(charsetEncoderNewEncoder, encodeURLParameter, 0, encodeURLParameter.length()), new CodecsKt$encodeURLParameter$$inlined$buildString$lambda$1(sb, z2));
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static final String m16945g(String encodeURLPath) throws Throwable {
        int i;
        Intrinsics.m18599g(encodeURLPath, "$this$encodeURLPath");
        StringBuilder sb = new StringBuilder();
        Charset charset = Charsets.f55167a;
        int i2 = 0;
        while (i2 < encodeURLPath.length()) {
            char cCharAt = encodeURLPath.charAt(i2);
            if (cCharAt != '/' && !f45572b.contains(Character.valueOf(cCharAt))) {
                if (!f45575e.contains(Character.valueOf(cCharAt))) {
                    if (cCharAt == '%' && (i = i2 + 2) < encodeURLPath.length()) {
                        ArrayList arrayList = f45573c;
                        int i3 = i2 + 1;
                        if (arrayList.contains(Character.valueOf(encodeURLPath.charAt(i3))) && arrayList.contains(Character.valueOf(encodeURLPath.charAt(i)))) {
                            sb.append(cCharAt);
                            sb.append(encodeURLPath.charAt(i3));
                            sb.append(encodeURLPath.charAt(i));
                            i2 += 3;
                        }
                    }
                    int i4 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                    CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                    Intrinsics.m18598f(charsetEncoderNewEncoder, "charset.newEncoder()");
                    int i5 = i4 + i2;
                    m16947i(EncodingKt.m17419b(charsetEncoderNewEncoder, encodeURLPath, i2, i5), new CodecsKt$encodeURLPath$1$1(sb));
                    i2 = i5;
                }
            }
            sb.append(cCharAt);
            i2++;
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: h */
    public static String m16946h(int i, String encodeURLQueryComponent) throws Throwable {
        boolean z2 = (i & 1) == 0;
        boolean z3 = (i & 2) == 0;
        Charset charset = Charsets.f55167a;
        Intrinsics.m18599g(encodeURLQueryComponent, "$this$encodeURLQueryComponent");
        Intrinsics.m18599g(charset, "charset");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.m18598f(charsetEncoderNewEncoder, "charset.newEncoder()");
        m16947i(EncodingKt.m17419b(charsetEncoderNewEncoder, encodeURLQueryComponent, 0, encodeURLQueryComponent.length()), new CodecsKt$encodeURLQueryComponent$$inlined$buildString$lambda$1(sb, z3, z2));
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: i */
    public static final void m16947i(ByteReadPacket byteReadPacket, Function1 function1) throws Throwable {
        boolean z2 = true;
        ChunkBuffer chunkBufferM17528c = UnsafeKt.m17528c(byteReadPacket, 1);
        if (chunkBufferM17528c == null) {
            return;
        }
        while (true) {
            try {
                BufferSharedState bufferSharedState = chunkBufferM17528c.f47348a;
                if (bufferSharedState.f47353b > bufferSharedState.f47352a) {
                    function1.invoke(Byte.valueOf(chunkBufferM17528c.m17463h()));
                } else {
                    try {
                        chunkBufferM17528c = UnsafeKt.m17529d(byteReadPacket, chunkBufferM17528c);
                        if (chunkBufferM17528c == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z2 = false;
                        if (z2) {
                            UnsafeKt.m17527b(byteReadPacket, chunkBufferM17528c);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
