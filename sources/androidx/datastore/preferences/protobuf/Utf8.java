package androidx.datastore.preferences.protobuf;

import androidx.compose.animation.AbstractC0455a;
import androidx.datastore.preferences.protobuf.UnsafeUtil;
import com.google.common.base.Ascii;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class Utf8 {

    /* JADX INFO: renamed from: a */
    public static final Processor f24162a;

    /* JADX INFO: compiled from: Proguard */
    public static class DecodeUtil {
        /* JADX INFO: renamed from: a */
        public static void m8707a(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!m8710d(b3)) {
                if ((((b3 + 112) + (b2 << Ascii.f42537FS)) >> 30) == 0 && !m8710d(b4) && !m8710d(b5)) {
                    int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                    cArr[i] = (char) ((i2 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.m8519b();
        }

        /* JADX INFO: renamed from: b */
        public static void m8708b(byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b2 < -62 || m8710d(b3)) {
                throw InvalidProtocolBufferException.m8519b();
            }
            cArr[i] = (char) (((b2 & Ascii.f42546US) << 6) | (b3 & 63));
        }

        /* JADX INFO: renamed from: c */
        public static void m8709c(byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m8710d(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || m8710d(b4)))) {
                throw InvalidProtocolBufferException.m8519b();
            }
            cArr[i] = (char) (((b2 & Ascii.f42543SI) << 12) | ((b3 & 63) << 6) | (b4 & 63));
        }

        /* JADX INFO: renamed from: d */
        public static boolean m8710d(byte b2) {
            return b2 > -65;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Processor {
        /* JADX INFO: renamed from: b */
        public static String m8711b(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = byteBuffer.get(i);
                if (b2 < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b2;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = byteBuffer.get(i);
                if (b3 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b3;
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b4 = byteBuffer.get(i8);
                        if (b4 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i7] = (char) b4;
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (b3 < -32) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.m8519b();
                    }
                    i += 2;
                    DecodeUtil.m8708b(b3, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (b3 < -16) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.m8519b();
                    }
                    int i9 = i + 2;
                    i += 3;
                    DecodeUtil.m8709c(b3, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.m8519b();
                    }
                    byte b5 = byteBuffer.get(i6);
                    int i10 = i + 3;
                    byte b6 = byteBuffer.get(i + 2);
                    i += 4;
                    DecodeUtil.m8707a(b3, b5, b6, byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        /* JADX INFO: renamed from: g */
        public static int m8712g(int i, ByteBuffer byteBuffer, int i2, int i3) {
            byte b2;
            int i4;
            byte b3;
            int i5;
            int i6 = i2;
            if (i != 0) {
                if (i6 >= i3) {
                    return i;
                }
                byte b4 = (byte) i;
                if (b4 < -32) {
                    if (b4 < -62) {
                        return -1;
                    }
                    int i7 = i6 + 1;
                    if (byteBuffer.get(i2) > -65) {
                        return -1;
                    }
                    i6 = i7;
                } else if (b4 < -16) {
                    byte b5 = (byte) (~(i >> 8));
                    if (b5 == 0) {
                        i5 = i6 + 1;
                        b3 = byteBuffer.get(i2);
                        if (i5 >= i3) {
                            return Utf8.m8705e(b4, b3);
                        }
                    } else {
                        b3 = b5;
                        i5 = i6;
                    }
                    if (b3 > -65) {
                        return -1;
                    }
                    if (b4 == -32 && b3 < -96) {
                        return -1;
                    }
                    if (b4 == -19 && b3 >= -96) {
                        return -1;
                    }
                    i6 = i5 + 1;
                    if (byteBuffer.get(i5) > -65) {
                        return -1;
                    }
                } else {
                    byte b6 = (byte) (~(i >> 8));
                    if (b6 == 0) {
                        i4 = i6 + 1;
                        b6 = byteBuffer.get(i2);
                        if (i4 >= i3) {
                            return Utf8.m8705e(b4, b6);
                        }
                        b2 = 0;
                    } else {
                        b2 = (byte) (i >> 16);
                        i4 = i6;
                    }
                    if (b2 == 0) {
                        int i8 = i4 + 1;
                        byte b7 = byteBuffer.get(i4);
                        if (i8 >= i3) {
                            return Utf8.m8706f(b4, b6, b7);
                        }
                        b2 = b7;
                        i4 = i8;
                    }
                    if (b6 > -65) {
                        return -1;
                    }
                    if ((((b6 + 112) + (b4 << Ascii.f42537FS)) >> 30) != 0 || b2 > -65) {
                        return -1;
                    }
                    i6 = i4 + 1;
                    if (byteBuffer.get(i4) > -65) {
                        return -1;
                    }
                }
            }
            Processor processor = Utf8.f24162a;
            int i9 = i3 - 7;
            int i10 = i6;
            while (i10 < i9 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
                i10 += 8;
            }
            int i11 = (i10 - i6) + i6;
            while (i11 < i3) {
                int i12 = i11 + 1;
                byte b8 = byteBuffer.get(i11);
                if (b8 >= 0) {
                    i11 = i12;
                } else if (b8 < -32) {
                    if (i12 >= i3) {
                        return b8;
                    }
                    if (b8 < -62 || byteBuffer.get(i12) > -65) {
                        return -1;
                    }
                    i11 += 2;
                } else if (b8 < -16) {
                    if (i12 >= i3 - 1) {
                        return Utf8.m8702b(byteBuffer, b8, i12, i3 - i12);
                    }
                    int i13 = i11 + 2;
                    byte b9 = byteBuffer.get(i12);
                    if (b9 > -65) {
                        return -1;
                    }
                    if (b8 == -32 && b9 < -96) {
                        return -1;
                    }
                    if ((b8 == -19 && b9 >= -96) || byteBuffer.get(i13) > -65) {
                        return -1;
                    }
                    i11 += 3;
                } else {
                    if (i12 >= i3 - 2) {
                        return Utf8.m8702b(byteBuffer, b8, i12, i3 - i12);
                    }
                    int i14 = i11 + 2;
                    byte b10 = byteBuffer.get(i12);
                    if (b10 > -65) {
                        return -1;
                    }
                    if ((((b10 + 112) + (b8 << Ascii.f42537FS)) >> 30) != 0) {
                        return -1;
                    }
                    int i15 = i11 + 3;
                    if (byteBuffer.get(i14) > -65) {
                        return -1;
                    }
                    i11 += 4;
                    if (byteBuffer.get(i15) > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public abstract String mo8713a(byte[] bArr, int i, int i2);

        /* JADX INFO: renamed from: c */
        public abstract String mo8714c(ByteBuffer byteBuffer, int i, int i2);

        /* JADX INFO: renamed from: d */
        public abstract int mo8715d(String str, byte[] bArr, int i, int i2);

        /* JADX INFO: renamed from: e */
        public final int m8716e(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? mo8718h(i, byteBuffer, i2, i3) : m8712g(i, byteBuffer, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return mo8717f(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
        }

        /* JADX INFO: renamed from: f */
        public abstract int mo8717f(int i, byte[] bArr, int i2, int i3);

        /* JADX INFO: renamed from: h */
        public abstract int mo8718h(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SafeProcessor extends Processor {
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /* JADX INFO: renamed from: a */
        public final String mo8713a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (b2 < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b2;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                if (b3 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b3;
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b4 = bArr[i8];
                        if (b4 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i7] = (char) b4;
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (b3 < -32) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.m8519b();
                    }
                    i += 2;
                    DecodeUtil.m8708b(b3, bArr[i6], cArr, i5);
                    i5++;
                } else if (b3 < -16) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.m8519b();
                    }
                    int i9 = i + 2;
                    i += 3;
                    DecodeUtil.m8709c(b3, bArr[i6], bArr[i9], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.m8519b();
                    }
                    byte b5 = bArr[i6];
                    int i10 = i + 3;
                    byte b6 = bArr[i + 2];
                    i += 4;
                    DecodeUtil.m8707a(b3, b5, b6, bArr[i10], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /* JADX INFO: renamed from: c */
        public final String mo8714c(ByteBuffer byteBuffer, int i, int i2) {
            return Processor.m8711b(byteBuffer, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /* JADX INFO: renamed from: d */
        public final int mo8715d(String str, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = str.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = str.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                        }
                        int i9 = i6 + 1;
                        if (i9 != str.length()) {
                            char cCharAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new UnpairedSurrogateException(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    i7 += 3;
                    bArr[i11] = (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                }
                i6++;
            }
            return i7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r13[r14] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        
            if (r13[r14] > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
        
            if (r13[r14] > (-65)) goto L50;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /* JADX INFO: renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int mo8717f(int i, byte[] bArr, int i2, int i3) {
            byte b2;
            int i4;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 >= -62) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        int i5 = i2 + 1;
                        byte b5 = bArr[i2];
                        if (i5 >= i3) {
                            return Utf8.m8705e(b3, b5);
                        }
                        i2 = i5;
                        b4 = b5;
                    }
                    if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                byte b6 = (byte) (~(i >> 8));
                if (b6 == 0) {
                    int i6 = i2 + 1;
                    b6 = bArr[i2];
                    if (i6 >= i3) {
                        return Utf8.m8705e(b3, b6);
                    }
                    i2 = i6;
                    b2 = 0;
                } else {
                    b2 = (byte) (i >> 16);
                }
                if (b2 == 0) {
                    int i7 = i2 + 1;
                    byte b7 = bArr[i2];
                    if (i7 >= i3) {
                        return Utf8.m8706f(b3, b6, b7);
                    }
                    i2 = i7;
                    b2 = b7;
                }
                if (b6 <= -65) {
                    if ((((b6 + 112) + (b3 << Ascii.f42537FS)) >> 30) == 0 && b2 <= -65) {
                        i4 = i2 + 1;
                    }
                }
                return -1;
                i2 = i4;
            }
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 < i3) {
                while (i2 < i3) {
                    int i8 = i2 + 1;
                    byte b8 = bArr[i2];
                    if (b8 < 0) {
                        if (b8 < -32) {
                            if (i8 >= i3) {
                                return b8;
                            }
                            if (b8 >= -62) {
                                i2 += 2;
                                if (bArr[i8] > -65) {
                                }
                            }
                            return -1;
                        }
                        if (b8 < -16) {
                            if (i8 >= i3 - 1) {
                                return Utf8.m8701a(bArr, i8, i3);
                            }
                            int i9 = i2 + 2;
                            byte b9 = bArr[i8];
                            if (b9 <= -65 && ((b8 != -32 || b9 >= -96) && (b8 != -19 || b9 < -96))) {
                                i2 += 3;
                                if (bArr[i9] > -65) {
                                }
                            }
                            return -1;
                        }
                        if (i8 >= i3 - 2) {
                            return Utf8.m8701a(bArr, i8, i3);
                        }
                        int i10 = i2 + 2;
                        byte b10 = bArr[i8];
                        if (b10 <= -65) {
                            if ((((b10 + 112) + (b8 << Ascii.f42537FS)) >> 30) == 0) {
                                int i11 = i2 + 3;
                                if (bArr[i10] <= -65) {
                                    i2 += 4;
                                    if (bArr[i11] > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    i2 = i8;
                }
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /* JADX INFO: renamed from: h */
        public final int mo8718h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return Processor.m8712g(i, byteBuffer, i2, i3);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super(AbstractC0455a.m2237l(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsafeProcessor extends Processor {
        /* JADX INFO: renamed from: i */
        public static int m8719i(long j, int i, int i2) {
            if (i2 == 0) {
                Processor processor = Utf8.f24162a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return Utf8.m8705e(i, UnsafeUtil.f24155d.mo8682f(j));
            }
            if (i2 != 2) {
                throw new AssertionError();
            }
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
            return Utf8.m8706f(i, memoryAccessor.mo8682f(j), memoryAccessor.mo8682f(j + 1));
        }

        /* JADX INFO: renamed from: j */
        public static int m8720j(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                Processor processor = Utf8.f24162a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return Utf8.m8705e(i, UnsafeUtil.m8667f(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.m8706f(i, UnsafeUtil.m8667f(bArr, j), UnsafeUtil.m8667f(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /* JADX INFO: renamed from: a */
        public final String mo8713a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte bM8667f = UnsafeUtil.m8667f(bArr, i);
                if (bM8667f < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) bM8667f;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte bM8667f2 = UnsafeUtil.m8667f(bArr, i);
                if (bM8667f2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) bM8667f2;
                    while (i6 < i3) {
                        byte bM8667f3 = UnsafeUtil.m8667f(bArr, i6);
                        if (bM8667f3 < 0) {
                            break;
                        }
                        i6++;
                        cArr[i7] = (char) bM8667f3;
                        i7++;
                    }
                    i5 = i7;
                    i = i6;
                } else if (bM8667f2 < -32) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.m8519b();
                    }
                    i += 2;
                    DecodeUtil.m8708b(bM8667f2, UnsafeUtil.m8667f(bArr, i6), cArr, i5);
                    i5++;
                } else if (bM8667f2 < -16) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.m8519b();
                    }
                    int i8 = i + 2;
                    i += 3;
                    DecodeUtil.m8709c(bM8667f2, UnsafeUtil.m8667f(bArr, i6), UnsafeUtil.m8667f(bArr, i8), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.m8519b();
                    }
                    byte bM8667f4 = UnsafeUtil.m8667f(bArr, i6);
                    int i9 = i + 3;
                    byte bM8667f5 = UnsafeUtil.m8667f(bArr, i + 2);
                    i += 4;
                    DecodeUtil.m8707a(bM8667f2, bM8667f4, bM8667f5, UnsafeUtil.m8667f(bArr, i9), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /* JADX INFO: renamed from: c */
        public final String mo8714c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            long j;
            byte bMo8682f;
            byte bMo8682f2;
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long jM8695l = UnsafeUtil.f24155d.m8695l(byteBuffer, UnsafeUtil.f24159h) + ((long) i);
            long j2 = ((long) i2) + jM8695l;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (true) {
                j = 1;
                if (jM8695l >= j2 || (bMo8682f2 = UnsafeUtil.f24155d.mo8682f(jM8695l)) < 0) {
                    break;
                }
                jM8695l++;
                cArr[i3] = (char) bMo8682f2;
                i3++;
            }
            int i4 = i3;
            while (jM8695l < j2) {
                long j3 = jM8695l + j;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
                byte bMo8682f3 = memoryAccessor.mo8682f(jM8695l);
                if (bMo8682f3 >= 0) {
                    int i5 = i4 + 1;
                    cArr[i4] = (char) bMo8682f3;
                    while (j3 < j2 && (bMo8682f = UnsafeUtil.f24155d.mo8682f(j3)) >= 0) {
                        j3 += j;
                        cArr[i5] = (char) bMo8682f;
                        i5++;
                    }
                    i4 = i5;
                    jM8695l = j3;
                } else {
                    if (!(bMo8682f3 < -32)) {
                        if (bMo8682f3 < -16) {
                            if (j3 >= j2 - j) {
                                throw InvalidProtocolBufferException.m8519b();
                            }
                            long j4 = jM8695l + 2;
                            jM8695l += 3;
                            DecodeUtil.m8709c(bMo8682f3, memoryAccessor.mo8682f(j3), memoryAccessor.mo8682f(j4), cArr, i4);
                            i4++;
                        } else {
                            if (j3 >= j2 - 2) {
                                throw InvalidProtocolBufferException.m8519b();
                            }
                            byte bMo8682f4 = memoryAccessor.mo8682f(j3);
                            long j5 = jM8695l + 3;
                            byte bMo8682f5 = memoryAccessor.mo8682f(jM8695l + 2);
                            jM8695l += 4;
                            DecodeUtil.m8707a(bMo8682f3, bMo8682f4, bMo8682f5, memoryAccessor.mo8682f(j5), cArr, i4);
                            i4 += 2;
                        }
                    } else {
                        if (j3 >= j2) {
                            throw InvalidProtocolBufferException.m8519b();
                        }
                        jM8695l += 2;
                        DecodeUtil.m8708b(bMo8682f3, memoryAccessor.mo8682f(j3), cArr, i4);
                        i4++;
                    }
                }
                j = 1;
            }
            return new String(cArr, 0, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /* JADX INFO: renamed from: d */
        public final int mo8715d(String str, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = ((long) i2) + j4;
            int length = str.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.m8672k(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128 && j4 < j5) {
                    UnsafeUtil.m8672k(bArr, j4, (byte) cCharAt2);
                    j3 = j5;
                    j2 = j;
                    j4 += j;
                } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        j3 = j5;
                        if (j4 > j3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.m8672k(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.m8672k(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                long j6 = j4 + 3;
                                UnsafeUtil.m8672k(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                j4 += 4;
                                UnsafeUtil.m8672k(bArr, j6, (byte) ((codePoint & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new UnpairedSurrogateException(i4 - 1, length);
                    }
                    UnsafeUtil.m8672k(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    UnsafeUtil.m8672k(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    j4 += 3;
                    UnsafeUtil.m8672k(bArr, j7, (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    UnsafeUtil.m8672k(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    j4 += 2;
                    UnsafeUtil.m8672k(bArr, j8, (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.m8667f(r23, r4) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.m8667f(r23, r4) > (-65)) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.m8667f(r23, r4) > (-65)) goto L54;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /* JADX INFO: renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int mo8717f(int i, byte[] bArr, int i2, int i3) {
            int i4;
            byte b2;
            int i5;
            byte bM8667f;
            long j;
            if ((i2 | i3 | (bArr.length - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long j2 = i2;
            long j3 = i3;
            if (i == 0) {
                i4 = -1;
                b2 = 0;
            } else {
                if (j2 >= j3) {
                    return i;
                }
                b2 = 0;
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 >= -62) {
                        j = j2 + 1;
                    }
                    return -1;
                }
                if (b3 < -16) {
                    byte bM8667f2 = (byte) (~(i >> 8));
                    if (bM8667f2 == 0) {
                        long j4 = j2 + 1;
                        bM8667f2 = UnsafeUtil.m8667f(bArr, j2);
                        if (j4 >= j3) {
                            return Utf8.m8705e(b3, bM8667f2);
                        }
                        j2 = j4;
                    }
                    if (bM8667f2 <= -65 && ((b3 != -32 || bM8667f2 >= -96) && (b3 != -19 || bM8667f2 < -96))) {
                        j = j2 + 1;
                    }
                    return -1;
                }
                i4 = -1;
                byte bM8667f3 = (byte) (~(i >> 8));
                if (bM8667f3 == 0) {
                    long j5 = j2 + 1;
                    bM8667f3 = UnsafeUtil.m8667f(bArr, j2);
                    if (j5 >= j3) {
                        return Utf8.m8705e(b3, bM8667f3);
                    }
                    bM8667f = 0;
                    j2 = j5;
                } else {
                    bM8667f = (byte) (i >> 16);
                }
                if (bM8667f == 0) {
                    long j6 = j2 + 1;
                    bM8667f = UnsafeUtil.m8667f(bArr, j2);
                    if (j6 >= j3) {
                        return Utf8.m8706f(b3, bM8667f3, bM8667f);
                    }
                    j2 = j6;
                }
                if (bM8667f3 <= -65) {
                    if ((((bM8667f3 + 112) + (b3 << Ascii.f42537FS)) >> 30) == 0 && bM8667f <= -65) {
                        j = j2 + 1;
                    }
                }
                return -1;
                i4 = -1;
                j2 = j;
            }
            int i6 = (int) (j3 - j2);
            if (i6 >= 16) {
                i5 = b2;
                long j7 = j2;
                while (true) {
                    if (i5 >= i6) {
                        i5 = i6;
                        break;
                    }
                    long j8 = j7 + 1;
                    if (UnsafeUtil.m8667f(bArr, j7) < 0) {
                        break;
                    }
                    i5++;
                    j7 = j8;
                }
            } else {
                i5 = b2;
            }
            int i7 = i6 - i5;
            long j9 = j2 + ((long) i5);
            while (true) {
                byte b4 = b2;
                while (true) {
                    if (i7 <= 0) {
                        break;
                    }
                    long j10 = j9 + 1;
                    byte bM8667f4 = UnsafeUtil.m8667f(bArr, j9);
                    if (bM8667f4 < 0) {
                        b4 = bM8667f4;
                        j9 = j10;
                        break;
                    }
                    i7--;
                    b4 = bM8667f4;
                    j9 = j10;
                }
                if (i7 != 0) {
                    int i8 = i7 - 1;
                    if (b4 >= -32) {
                        if (b4 >= -16) {
                            if (i8 >= 3) {
                                i7 -= 4;
                                long j11 = j9 + 1;
                                byte bM8667f5 = UnsafeUtil.m8667f(bArr, j9);
                                if (bM8667f5 > -65) {
                                    break;
                                }
                                if ((((bM8667f5 + 112) + (b4 << Ascii.f42537FS)) >> 30) != 0) {
                                    break;
                                }
                                long j12 = j9 + 2;
                                if (UnsafeUtil.m8667f(bArr, j11) > -65) {
                                    break;
                                }
                                j9 += 3;
                                if (UnsafeUtil.m8667f(bArr, j12) > -65) {
                                    break;
                                }
                            } else {
                                return m8720j(bArr, b4, j9, i8);
                            }
                        } else {
                            if (i8 < 2) {
                                return m8720j(bArr, b4, j9, i8);
                            }
                            i7 -= 3;
                            long j13 = j9 + 1;
                            byte bM8667f6 = UnsafeUtil.m8667f(bArr, j9);
                            if (bM8667f6 > -65 || ((b4 == -32 && bM8667f6 < -96) || (b4 == -19 && bM8667f6 >= -96))) {
                                break;
                            }
                            j9 += 2;
                            if (UnsafeUtil.m8667f(bArr, j13) > -65) {
                                break;
                            }
                        }
                    } else if (i8 != 0) {
                        i7 -= 2;
                        if (b4 < -62) {
                            break;
                        }
                        long j14 = j9 + 1;
                        if (UnsafeUtil.m8667f(bArr, j9) > -65) {
                            break;
                        }
                        j9 = j14;
                    } else {
                        return b4;
                    }
                } else {
                    return b2;
                }
            }
            return i4;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /* JADX INFO: renamed from: h */
        public final int mo8718h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            long j;
            byte b2;
            int i4;
            byte bMo8682f;
            long j2;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
            long jM8695l = memoryAccessor.m8695l(byteBuffer, UnsafeUtil.f24159h) + ((long) i2);
            long j3 = ((long) (i3 - i2)) + jM8695l;
            if (i == 0) {
                j = 1;
                b2 = 0;
            } else {
                if (jM8695l >= j3) {
                    return i;
                }
                b2 = 0;
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 < -62) {
                        return -1;
                    }
                    j2 = jM8695l + 1;
                    if (memoryAccessor.mo8682f(jM8695l) > -65) {
                        return -1;
                    }
                } else if (b3 < -16) {
                    byte bMo8682f2 = (byte) (~(i >> 8));
                    if (bMo8682f2 == 0) {
                        long j4 = jM8695l + 1;
                        bMo8682f2 = memoryAccessor.mo8682f(jM8695l);
                        if (j4 >= j3) {
                            return Utf8.m8705e(b3, bMo8682f2);
                        }
                        jM8695l = j4;
                    }
                    if (bMo8682f2 > -65) {
                        return -1;
                    }
                    if (b3 == -32 && bMo8682f2 < -96) {
                        return -1;
                    }
                    if (b3 == -19 && bMo8682f2 >= -96) {
                        return -1;
                    }
                    j2 = jM8695l + 1;
                    if (memoryAccessor.mo8682f(jM8695l) > -65) {
                        return -1;
                    }
                } else {
                    j = 1;
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        long j5 = jM8695l + 1;
                        byte bMo8682f3 = memoryAccessor.mo8682f(jM8695l);
                        if (j5 >= j3) {
                            return Utf8.m8705e(b3, bMo8682f3);
                        }
                        jM8695l = j5;
                        b4 = bMo8682f3;
                        bMo8682f = 0;
                    } else {
                        bMo8682f = (byte) (i >> 16);
                    }
                    if (bMo8682f == 0) {
                        long j6 = jM8695l + 1;
                        bMo8682f = memoryAccessor.mo8682f(jM8695l);
                        if (j6 >= j3) {
                            return Utf8.m8706f(b3, b4, bMo8682f);
                        }
                        jM8695l = j6;
                    }
                    if (b4 > -65) {
                        return -1;
                    }
                    if ((((b4 + 112) + (b3 << Ascii.f42537FS)) >> 30) != 0 || bMo8682f > -65) {
                        return -1;
                    }
                    long j7 = jM8695l + 1;
                    if (memoryAccessor.mo8682f(jM8695l) > -65) {
                        return -1;
                    }
                    jM8695l = j7;
                }
                j = 1;
                jM8695l = j2;
            }
            int i5 = (int) (j3 - jM8695l);
            if (i5 < 16) {
                i4 = b2;
            } else {
                int i6 = 8 - (((int) jM8695l) & 7);
                int i7 = i6;
                long j8 = jM8695l;
                while (true) {
                    if (i7 > 0) {
                        long j9 = j8 + j;
                        if (UnsafeUtil.f24155d.mo8682f(j8) < 0) {
                            i4 = i6 - i7;
                            break;
                        }
                        i7--;
                        j8 = j9;
                    } else {
                        int i8 = i5 - i6;
                        while (i8 >= 8 && (UnsafeUtil.f24155d.mo8686k(j8) & (-9187201950435737472L)) == 0) {
                            j8 += 8;
                            i8 -= 8;
                        }
                        i4 = i5 - i8;
                    }
                }
            }
            long j10 = jM8695l + ((long) i4);
            int i9 = i5 - i4;
            while (true) {
                byte b5 = b2;
                while (true) {
                    if (i9 <= 0) {
                        break;
                    }
                    long j11 = j10 + j;
                    byte bMo8682f4 = UnsafeUtil.f24155d.mo8682f(j10);
                    if (bMo8682f4 < 0) {
                        b5 = bMo8682f4;
                        j10 = j11;
                        break;
                    }
                    i9--;
                    b5 = bMo8682f4;
                    j10 = j11;
                }
                if (i9 == 0) {
                    return b2;
                }
                int i10 = i9 - 1;
                if (b5 < -32) {
                    if (i10 == 0) {
                        return b5;
                    }
                    i9 -= 2;
                    if (b5 < -62) {
                        return -1;
                    }
                    long j12 = j10 + j;
                    if (UnsafeUtil.f24155d.mo8682f(j10) > -65) {
                        return -1;
                    }
                    j10 = j12;
                } else if (b5 < -16) {
                    if (i10 < 2) {
                        return m8719i(j10, b5, i10);
                    }
                    i9 -= 3;
                    long j13 = j10 + j;
                    UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.f24155d;
                    byte bMo8682f5 = memoryAccessor2.mo8682f(j10);
                    if (bMo8682f5 > -65) {
                        return -1;
                    }
                    if (b5 == -32 && bMo8682f5 < -96) {
                        return -1;
                    }
                    if (b5 == -19 && bMo8682f5 >= -96) {
                        return -1;
                    }
                    j10 += 2;
                    if (memoryAccessor2.mo8682f(j13) > -65) {
                        return -1;
                    }
                } else {
                    if (i10 < 3) {
                        return m8719i(j10, b5, i10);
                    }
                    i9 -= 4;
                    long j14 = j10 + j;
                    UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.f24155d;
                    byte bMo8682f6 = memoryAccessor3.mo8682f(j10);
                    if (bMo8682f6 > -65) {
                        return -1;
                    }
                    if ((((bMo8682f6 + 112) + (b5 << Ascii.f42537FS)) >> 30) != 0) {
                        return -1;
                    }
                    long j15 = 2 + j10;
                    if (memoryAccessor3.mo8682f(j14) > -65) {
                        return -1;
                    }
                    j10 += 3;
                    if (memoryAccessor3.mo8682f(j15) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        f24162a = (UnsafeUtil.f24157f && UnsafeUtil.f24156e && !Android.m8304a()) ? new UnsafeProcessor() : new SafeProcessor();
    }

    /* JADX INFO: renamed from: a */
    public static int m8701a(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i3 == 1) {
            return m8705e(b2, bArr[i]);
        }
        if (i3 == 2) {
            return m8706f(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: b */
    public static int m8702b(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i3 == 1) {
            return m8705e(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return m8706f(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: c */
    public static String m8703c(ByteBuffer byteBuffer, int i, int i2) {
        Processor processor = f24162a;
        processor.getClass();
        if (byteBuffer.hasArray()) {
            return processor.mo8713a(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return byteBuffer.isDirect() ? processor.mo8714c(byteBuffer, i, i2) : Processor.m8711b(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public static int m8704d(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new UnpairedSurrogateException(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    /* JADX INFO: renamed from: e */
    public static int m8705e(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: f */
    public static int m8706f(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
