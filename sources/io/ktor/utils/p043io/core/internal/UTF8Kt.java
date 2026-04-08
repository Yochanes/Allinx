package io.ktor.utils.p043io.core.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class UTF8Kt {
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ff, code lost:
    
        r0 = (short) (r6 - r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        if (r5 != r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0116, code lost:
    
        r7 = r4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        if (r7 <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
    
        if (r6 < r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        r8 = r6 + 1;
        r19 = r22.charAt(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        if (java.lang.Character.isHighSurrogate(r19) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012a, code lost:
    
        r6 = r8;
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012b, code lost:
    
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012e, code lost:
    
        if (r8 == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        if (java.lang.Character.isLowSurrogate(r22.charAt(r8)) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013b, code lost:
    
        r6 = r6 + 2;
        r19 = ((r19 - 55232) << 10) | (r22.charAt(r8) - 56320);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014a, code lost:
    
        r6 = r8;
        r8 = 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014d, code lost:
    
        if (r15 <= r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        if (127 < r8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0153, code lost:
    
        if (128 <= r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0156, code lost:
    
        if (2047 < r8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0158, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015a, code lost:
    
        if (2048 <= r8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (65535 < r8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
    
        r15 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        if (65536 > r8) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0163, code lost:
    
        if (1114111 < r8) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0165, code lost:
    
        r15 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
    
        if (r15 <= r7) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0169, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016d, code lost:
    
        if (r8 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0170, code lost:
    
        if (127 < r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0172, code lost:
    
        r21.put(r5, (byte) r8);
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0179, code lost:
    
        if (128 <= r8) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017c, code lost:
    
        if (2047 < r8) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017e, code lost:
    
        r21.put(r5, (byte) (((r8 >> 6) & 31) | 192));
        r21.put(r5 + 1, (byte) ((r8 & 63) | com.google.firebase.crashlytics.internal.metadata.UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0193, code lost:
    
        if (2048 <= r8) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0196, code lost:
    
        if (65535 < r8) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0198, code lost:
    
        r21.put(r5, (byte) (((r8 >> 12) & 15) | 224));
        r21.put(r5 + 1, (byte) (((r8 >> 6) & 63) | com.google.firebase.crashlytics.internal.metadata.UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
        r21.put(r5 + 2, (byte) ((r8 & 63) | com.google.firebase.crashlytics.internal.metadata.UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b8, code lost:
    
        if (65536 > r8) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
    
        if (1114111 < r8) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bc, code lost:
    
        r21.put(r5, (byte) (((r8 >> 18) & 7) | 240));
        r21.put(r5 + 1, (byte) (((r8 >> 12) & 63) | com.google.firebase.crashlytics.internal.metadata.UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
        r21.put(r5 + 2, (byte) (((r8 >> 6) & 63) | com.google.firebase.crashlytics.internal.metadata.UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
        r21.put(r5 + 3, (byte) ((r8 & 63) | com.google.firebase.crashlytics.internal.metadata.UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e7, code lost:
    
        r5 = r5 + r7;
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01eb, code lost:
    
        m17525b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ee, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ef, code lost:
    
        m17525b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f3, code lost:
    
        r0 = (short) (r6 - r23);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m17524a(ByteBuffer encodeUTF8, CharSequence text, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iCharAt;
        Intrinsics.m18599g(encodeUTF8, "$this$encodeUTF8");
        Intrinsics.m18599g(text, "text");
        int iMin = Math.min(i2, i + 65535);
        int i7 = i4;
        if (i7 > 65535) {
            i7 = 65535;
        }
        int i8 = i;
        int i9 = i3;
        while (i9 < i7 && i8 < iMin) {
            int i10 = i8 + 1;
            char cCharAt = text.charAt(i8);
            int i11 = cCharAt & 65535;
            if ((cCharAt & 65408) != 0) {
                int i12 = i7 - 3;
                while (true) {
                    int i13 = 1;
                    if (i12 - i9 <= 0 || i8 >= iMin) {
                        break;
                    }
                    int i14 = i8 + 1;
                    char cCharAt2 = text.charAt(i8);
                    if (!Character.isHighSurrogate(cCharAt2)) {
                        i8 = i14;
                        iCharAt = cCharAt2;
                    } else if (i14 == iMin || !Character.isLowSurrogate(text.charAt(i14))) {
                        i8 = i14;
                        i5 = 63;
                        if (i5 >= 0 && 127 >= i5) {
                            encodeUTF8.put(i9, (byte) i5);
                            i6 = 1;
                        } else if (128 <= i5 && 2047 >= i5) {
                            encodeUTF8.put(i9, (byte) (((i5 >> 6) & 31) | 192));
                            encodeUTF8.put(i9 + 1, (byte) ((i5 & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                            i6 = 2;
                        } else if (2048 <= i5 && 65535 >= i5) {
                            encodeUTF8.put(i9, (byte) (((i5 >> 12) & 15) | 224));
                            encodeUTF8.put(i9 + 1, (byte) (((i5 >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                            encodeUTF8.put(i9 + 2, (byte) ((i5 & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                            i6 = 3;
                        } else {
                            if (65536 > i5 || 1114111 < i5) {
                                break;
                            }
                            encodeUTF8.put(i9, (byte) (((i5 >> 18) & 7) | 240));
                            encodeUTF8.put(i9 + 1, (byte) (((i5 >> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                            encodeUTF8.put(i9 + 2, (byte) (((i5 >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                            encodeUTF8.put(i9 + 3, (byte) ((i5 & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                            i6 = 4;
                        }
                        i9 += i6;
                    } else {
                        i8 += 2;
                        iCharAt = ((cCharAt2 - 55232) << 10) | (text.charAt(i14) - 56320);
                    }
                    i5 = iCharAt;
                    if (i5 >= 0) {
                        encodeUTF8.put(i9, (byte) i5);
                        i6 = 1;
                    }
                    i9 += i6;
                }
                m17525b(i5);
                throw null;
            }
            encodeUTF8.put(i9, (byte) i11);
            i9++;
            i8 = i10;
        }
        short s = (short) (i8 - i);
        return ((s & 65535) << 16) | (((short) (i9 - i3)) & 65535);
    }

    /* JADX INFO: renamed from: b */
    public static final void m17525b(int i) {
        throw new IllegalArgumentException(AbstractC0000a.m10g(i, "Malformed code-point ", " found"));
    }
}
