package com.google.protobuf;

import androidx.compose.animation.AbstractC0455a;
import com.google.common.base.Ascii;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    /* JADX INFO: compiled from: Proguard */
    public static class DecodeUtil {
        private DecodeUtil() {
        }

        public static /* synthetic */ void access$1000(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws InvalidProtocolBufferException {
            handleFourBytes(b2, b3, b4, b5, cArr, i);
        }

        public static /* synthetic */ boolean access$400(byte b2) {
            return isOneByte(b2);
        }

        public static /* synthetic */ void access$500(byte b2, char[] cArr, int i) {
            handleOneByte(b2, cArr, i);
        }

        public static /* synthetic */ boolean access$600(byte b2) {
            return isTwoBytes(b2);
        }

        public static /* synthetic */ void access$700(byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            handleTwoBytes(b2, b3, cArr, i);
        }

        public static /* synthetic */ boolean access$800(byte b2) {
            return isThreeBytes(b2);
        }

        public static /* synthetic */ void access$900(byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            handleThreeBytes(b2, b3, b4, cArr, i);
        }

        private static void handleFourBytes(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b3)) {
                if ((((b3 + 112) + (b2 << Ascii.f42537FS)) >> 30) == 0 && !isNotTrailingByte(b4) && !isNotTrailingByte(b5)) {
                    int iTrailingByteValue = ((b2 & 7) << 18) | (trailingByteValue(b3) << 12) | (trailingByteValue(b4) << 6) | trailingByteValue(b5);
                    cArr[i] = highSurrogate(iTrailingByteValue);
                    cArr[i + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        private static void handleOneByte(byte b2, char[] cArr, int i) {
            cArr[i] = (char) b2;
        }

        private static void handleThreeBytes(byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || isNotTrailingByte(b4)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b2 & Ascii.f42543SI) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4));
        }

        private static void handleTwoBytes(byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b2 < -62 || isNotTrailingByte(b3)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b2 & Ascii.f42546US) << 6) | trailingByteValue(b3));
        }

        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b2) {
            return b2 > -65;
        }

        private static boolean isOneByte(byte b2) {
            return b2 >= 0;
        }

        private static boolean isThreeBytes(byte b2) {
            return b2 < -16;
        }

        private static boolean isTwoBytes(byte b2) {
            return b2 < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b2) {
            return b2 & 63;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i, i2) : decodeUtf8Default(byteBuffer, i, i2);
        }

        public abstract String decodeUtf8(byte[] bArr, int i, int i2);

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = byteBuffer.get(i);
                if (!DecodeUtil.access$400(b2)) {
                    break;
                }
                i++;
                DecodeUtil.access$500(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = byteBuffer.get(i);
                if (DecodeUtil.access$400(b3)) {
                    int i7 = i5 + 1;
                    DecodeUtil.access$500(b3, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b4 = byteBuffer.get(i8);
                        if (!DecodeUtil.access$400(b4)) {
                            break;
                        }
                        i8++;
                        DecodeUtil.access$500(b4, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (DecodeUtil.access$600(b3)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.access$700(b3, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (DecodeUtil.access$800(b3)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    DecodeUtil.access$900(b3, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = byteBuffer.get(i6);
                    int i10 = i + 3;
                    byte b6 = byteBuffer.get(i + 2);
                    i += 4;
                    DecodeUtil.access$1000(b3, b5, b6, byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2);

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2);

        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i;
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i2 = 0;
            while (i2 < length) {
                try {
                    char cCharAt = charSequence.charAt(i2);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i2, (byte) cCharAt);
                    i2++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (Math.max(i2, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            }
            if (i2 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i2);
                return;
            }
            iPosition += i2;
            while (i2 < length) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i3 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i3, (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                        iPosition = i3;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i3;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (Math.max(i2, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i4 = i2 + 1;
                        if (i4 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i4);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i5 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        i = iPosition + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i5;
                                        i2 = i4;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (Math.max(i2, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                    try {
                                        byteBuffer.put(i5, (byte) (((codePoint >>> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                        iPosition += 3;
                                        byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                        i2 = i4;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i2 = i4;
                                        iPosition = i;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (Math.max(i2, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } else {
                                    i2 = i4;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new UnpairedSurrogateException(i2, length);
                    }
                    int i6 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i6, (byte) (((cCharAt2 >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                }
                i2++;
                iPosition++;
            }
            Java8Compatibility.position(byteBuffer, iPosition);
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i, int i2) {
            return partialIsValidUtf8(0, bArr, i, i2) == 0;
        }

        public final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i, byteBuffer, i2, i3) : partialIsValidUtf8Default(i, byteBuffer, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
        }

        public abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int partialIsValidUtf8Default(int i, ByteBuffer byteBuffer, int i2, int i3) {
            byte b2;
            int i4;
            int i5;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 >= -62) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        int i6 = i2 + 1;
                        byte b5 = byteBuffer.get(i2);
                        if (i6 >= i3) {
                            return Utf8.access$000(b3, b5);
                        }
                        i2 = i6;
                        b4 = b5;
                    }
                    if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                byte b6 = (byte) (~(i >> 8));
                if (b6 == 0) {
                    i4 = i2 + 1;
                    b6 = byteBuffer.get(i2);
                    if (i4 >= i3) {
                        return Utf8.access$000(b3, b6);
                    }
                    b2 = 0;
                } else {
                    b2 = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b2 == 0) {
                    int i7 = i4 + 1;
                    byte b7 = byteBuffer.get(i4);
                    if (i7 >= i3) {
                        return Utf8.access$100(b3, b6, b7);
                    }
                    b2 = b7;
                    i4 = i7;
                }
                if (b6 <= -65) {
                    if ((((b6 + 112) + (b3 << Ascii.f42537FS)) >> 30) == 0 && b2 <= -65) {
                        i2 = i4 + 1;
                    }
                }
                return -1;
                i2 = i5;
            }
            return partialIsValidUtf8(byteBuffer, i2, i3);
        }

        public abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            return partialIsValidUtf8(0, byteBuffer, i, i2) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            int iAccess$200 = i + Utf8.access$200(byteBuffer, i, i2);
            while (iAccess$200 < i2) {
                int i3 = iAccess$200 + 1;
                byte b2 = byteBuffer.get(iAccess$200);
                if (b2 >= 0) {
                    iAccess$200 = i3;
                } else if (b2 < -32) {
                    if (i3 >= i2) {
                        return b2;
                    }
                    if (b2 < -62 || byteBuffer.get(i3) > -65) {
                        return -1;
                    }
                    iAccess$200 += 2;
                } else {
                    if (b2 >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.access$300(byteBuffer, b2, i3, i2 - i3);
                        }
                        int i4 = iAccess$200 + 2;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 <= -65) {
                            if ((((b3 + 112) + (b2 << Ascii.f42537FS)) >> 30) == 0) {
                                int i5 = iAccess$200 + 3;
                                if (byteBuffer.get(i4) <= -65) {
                                    iAccess$200 += 4;
                                    if (byteBuffer.get(i5) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.access$300(byteBuffer, b2, i3, i2 - i3);
                    }
                    int i6 = iAccess$200 + 2;
                    byte b4 = byteBuffer.get(i3);
                    if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || byteBuffer.get(i6) > -65))) {
                        return -1;
                    }
                    iAccess$200 += 3;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super(AbstractC0455a.m2237l(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static /* synthetic */ int access$000(int i, int i2) {
        return incompleteStateFor(i, i2);
    }

    public static /* synthetic */ int access$100(int i, int i2, int i3) {
        return incompleteStateFor(i, i2, i3);
    }

    public static /* synthetic */ int access$1100(byte[] bArr, int i, int i2) {
        return incompleteStateFor(bArr, i, i2);
    }

    public static /* synthetic */ int access$1200(int i) {
        return incompleteStateFor(i);
    }

    public static /* synthetic */ int access$200(ByteBuffer byteBuffer, int i, int i2) {
        return estimateConsecutiveAscii(byteBuffer, i, i2);
    }

    public static /* synthetic */ int access$300(ByteBuffer byteBuffer, int i, int i2, int i3) {
        return incompleteStateFor(byteBuffer, i, i2, i3);
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) {
        return processor.decodeUtf8(byteBuffer, i, i2);
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(charSequence, bArr, i, i2);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    private static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & ASCII_MASK_LONG) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    private static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
        return processor.partialIsValidUtf8(i, bArr, i2, i3);
    }

    public static String decodeUtf8(byte[] bArr, int i, int i2) {
        return processor.decodeUtf8(bArr, i, i2);
    }

    private static int incompleteStateFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return processor.isValidUtf8(bArr, i, i2);
    }

    public static int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return processor.partialIsValidUtf8(i, byteBuffer, i2, i3);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            int i3 = 8 - (((int) j) & 7);
            while (i2 < i3) {
                long j2 = 1 + j;
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            while (true) {
                int i4 = i2 + 8;
                if (i4 > i || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j) & Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j += 8;
                i2 = i4;
            }
            while (i2 < i) {
                long j3 = j + 1;
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j3;
            }
            return i;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.access$1200(i);
            }
            if (i2 == 1) {
                return Utf8.access$000(i, UnsafeUtil.getByte(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.access$100(i, UnsafeUtil.getByte(bArr, j), UnsafeUtil.getByte(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i, i2, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i);
            long j = ((long) i2) + jAddressOffset;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (jAddressOffset < j) {
                byte b2 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.access$400(b2)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.access$500(b2, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (jAddressOffset < j) {
                long j2 = jAddressOffset + 1;
                byte b3 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.access$400(b3)) {
                    int i5 = i4 + 1;
                    DecodeUtil.access$500(b3, cArr, i4);
                    long j3 = j2;
                    while (j3 < j) {
                        byte b4 = UnsafeUtil.getByte(j3);
                        if (!DecodeUtil.access$400(b4)) {
                            break;
                        }
                        j3++;
                        DecodeUtil.access$500(b4, cArr, i5);
                        i5++;
                    }
                    i4 = i5;
                    jAddressOffset = j3;
                } else if (DecodeUtil.access$600(b3)) {
                    if (j2 >= j) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.access$700(b3, UnsafeUtil.getByte(j2), cArr, i4);
                    i4++;
                } else if (DecodeUtil.access$800(b3)) {
                    if (j2 >= j - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j4 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.access$900(b3, UnsafeUtil.getByte(j2), UnsafeUtil.getByte(j4), cArr, i4);
                    i4++;
                } else {
                    if (j2 >= j - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = UnsafeUtil.getByte(j2);
                    long j5 = jAddressOffset + 3;
                    byte b6 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.access$1000(b3, b5, b6, UnsafeUtil.getByte(j5), cArr, i4);
                    i4 += 2;
                }
            }
            return new String(cArr, 0, i4);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = ((long) i2) + j4;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 < 128 && j4 < j5) {
                    UnsafeUtil.putByte(bArr, j4, (byte) cCharAt2);
                    j3 = j5;
                    j2 = j;
                    j4 += j;
                } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        j3 = j5;
                        if (j4 > j3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.putByte(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                long j6 = j4 + 3;
                                UnsafeUtil.putByte(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                j4 += 4;
                                UnsafeUtil.putByte(bArr, j6, (byte) ((codePoint & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new UnpairedSurrogateException(i4 - 1, length);
                    }
                    UnsafeUtil.putByte(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    UnsafeUtil.putByte(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    j4 += 3;
                    UnsafeUtil.putByte(bArr, j7, (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    UnsafeUtil.putByte(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    j4 += 2;
                    UnsafeUtil.putByte(bArr, j8, (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j;
            char c2;
            long j2;
            long j3;
            long j4;
            int i;
            char c3;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i2 = 0;
            while (true) {
                j = 1;
                c2 = 128;
                if (i2 >= length || (cCharAt = charSequence.charAt(i2)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i2++;
                jPosition = 1 + jPosition;
            }
            if (i2 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i2 < length) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 >= c2 || jPosition >= jLimit) {
                    j2 = j;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j5 = jPosition + j2;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.putByte(j5, (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                        j3 = jAddressOffset;
                        j4 = jLimit;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            j3 = jAddressOffset;
                            j4 = jLimit;
                            if (jPosition > j4 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i)))) {
                                    throw new UnpairedSurrogateException(i2, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i3 = i2 + 1;
                            if (i3 != length) {
                                char cCharAt3 = charSequence.charAt(i3);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c3 = 128;
                                    UnsafeUtil.putByte(jPosition + j2, (byte) (((codePoint >>> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                    long j6 = jPosition + 3;
                                    UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                    jPosition += 4;
                                    UnsafeUtil.putByte(j6, (byte) ((codePoint & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                                    i2 = i3;
                                } else {
                                    i2 = i3;
                                }
                            }
                            throw new UnpairedSurrogateException(i2 - 1, length);
                        }
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        j3 = jAddressOffset;
                        long j7 = jPosition + 2;
                        j4 = jLimit;
                        UnsafeUtil.putByte(jPosition + j2, (byte) (((cCharAt2 >>> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                        jPosition += 3;
                        UnsafeUtil.putByte(j7, (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    }
                    c3 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    j3 = jAddressOffset;
                    j4 = jLimit;
                    c3 = c2;
                    jPosition += j;
                    j2 = j;
                }
                i2++;
                c2 = c3;
                j = j2;
                jAddressOffset = j3;
                jLimit = j4;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            byte b2;
            long j;
            if ((i2 | i3 | (bArr.length - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long j2 = i2;
            long j3 = i3;
            if (i != 0) {
                if (j2 >= j3) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 >= -62) {
                        long j4 = 1 + j2;
                        if (UnsafeUtil.getByte(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        long j5 = j2 + 1;
                        b4 = UnsafeUtil.getByte(bArr, j2);
                        if (j5 >= j3) {
                            return Utf8.access$000(b3, b4);
                        }
                        j2 = j5;
                    }
                    if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                        j = j2 + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    long j6 = j2 + 1;
                    b5 = UnsafeUtil.getByte(bArr, j2);
                    if (j6 >= j3) {
                        return Utf8.access$000(b3, b5);
                    }
                    b2 = 0;
                    j2 = j6;
                } else {
                    b2 = (byte) (i >> 16);
                }
                if (b2 == 0) {
                    long j7 = j2 + 1;
                    b2 = UnsafeUtil.getByte(bArr, j2);
                    if (j7 >= j3) {
                        return Utf8.access$100(b3, b5, b2);
                    }
                    j2 = j7;
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b3 << Ascii.f42537FS)) >> 30) == 0 && b2 <= -65) {
                        j = j2 + 1;
                    }
                }
                return -1;
                j2 = j;
            }
            return partialIsValidUtf8(bArr, j2, (int) (j3 - j2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            byte b2;
            long j;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i2);
            long j2 = ((long) (i3 - i2)) + jAddressOffset;
            if (i != 0) {
                if (jAddressOffset >= j2) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 >= -62) {
                        j = 1 + jAddressOffset;
                    }
                    return -1;
                }
                if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        long j3 = jAddressOffset + 1;
                        b4 = UnsafeUtil.getByte(jAddressOffset);
                        if (j3 >= j2) {
                            return Utf8.access$000(b3, b4);
                        }
                        jAddressOffset = j3;
                    }
                    if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                        j = 1 + jAddressOffset;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    long j4 = jAddressOffset + 1;
                    b5 = UnsafeUtil.getByte(jAddressOffset);
                    if (j4 >= j2) {
                        return Utf8.access$000(b3, b5);
                    }
                    b2 = 0;
                    jAddressOffset = j4;
                } else {
                    b2 = (byte) (i >> 16);
                }
                if (b2 == 0) {
                    long j5 = jAddressOffset + 1;
                    b2 = UnsafeUtil.getByte(jAddressOffset);
                    if (j5 >= j2) {
                        return Utf8.access$100(b3, b5, b2);
                    }
                    jAddressOffset = j5;
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b3 << Ascii.f42537FS)) >> 30) == 0 && b2 <= -65) {
                        j = 1 + jAddressOffset;
                    }
                }
                return -1;
                jAddressOffset = j;
            }
            return partialIsValidUtf8(jAddressOffset, (int) (j2 - jAddressOffset));
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = (int) ((-j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (UnsafeUtil.getByte(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (UnsafeUtil.getLong(j) & Utf8.ASCII_MASK_LONG) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.access$1200(i);
            }
            if (i2 == 1) {
                return Utf8.access$000(i, UnsafeUtil.getByte(j));
            }
            if (i2 == 2) {
                return Utf8.access$100(i, UnsafeUtil.getByte(j), UnsafeUtil.getByte(j + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int partialIsValidUtf8(byte[] bArr, long j, int i) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j, i);
            int i2 = i - iUnsafeEstimateConsecutiveAscii;
            long j2 = j + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b2 = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    long j3 = j2 + 1;
                    b2 = UnsafeUtil.getByte(bArr, j2);
                    if (b2 < 0) {
                        j2 = j3;
                        break;
                    }
                    i2--;
                    j2 = j3;
                }
                if (i2 != 0) {
                    int i3 = i2 - 1;
                    if (b2 >= -32) {
                        if (b2 >= -16) {
                            if (i3 < 3) {
                                return unsafeIncompleteStateFor(bArr, b2, j2, i3);
                            }
                            i2 -= 4;
                            long j4 = 1 + j2;
                            byte b3 = UnsafeUtil.getByte(bArr, j2);
                            if (b3 > -65) {
                                break;
                            }
                            if ((((b3 + 112) + (b2 << Ascii.f42537FS)) >> 30) != 0) {
                                break;
                            }
                            long j5 = 2 + j2;
                            if (UnsafeUtil.getByte(bArr, j4) > -65) {
                                break;
                            }
                            j2 += 3;
                            if (UnsafeUtil.getByte(bArr, j5) > -65) {
                                break;
                            }
                        } else {
                            if (i3 < 2) {
                                return unsafeIncompleteStateFor(bArr, b2, j2, i3);
                            }
                            i2 -= 3;
                            long j6 = 1 + j2;
                            byte b4 = UnsafeUtil.getByte(bArr, j2);
                            if (b4 > -65 || ((b2 == -32 && b4 < -96) || (b2 == -19 && b4 >= -96))) {
                                break;
                            }
                            j2 += 2;
                            if (UnsafeUtil.getByte(bArr, j6) > -65) {
                                break;
                            }
                        }
                    } else if (i3 != 0) {
                        i2 -= 2;
                        if (b2 < -62) {
                            break;
                        }
                        long j7 = 1 + j2;
                        if (UnsafeUtil.getByte(bArr, j2) > -65) {
                            break;
                        }
                        j2 = j7;
                    } else {
                        return b2;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int partialIsValidUtf8(long j, int i) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j, i);
            long j2 = j + ((long) iUnsafeEstimateConsecutiveAscii);
            int i2 = i - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b2 = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    long j3 = j2 + 1;
                    b2 = UnsafeUtil.getByte(j2);
                    if (b2 < 0) {
                        j2 = j3;
                        break;
                    }
                    i2--;
                    j2 = j3;
                }
                if (i2 != 0) {
                    int i3 = i2 - 1;
                    if (b2 >= -32) {
                        if (b2 >= -16) {
                            if (i3 < 3) {
                                return unsafeIncompleteStateFor(j2, b2, i3);
                            }
                            i2 -= 4;
                            long j4 = 1 + j2;
                            byte b3 = UnsafeUtil.getByte(j2);
                            if (b3 > -65) {
                                break;
                            }
                            if ((((b3 + 112) + (b2 << Ascii.f42537FS)) >> 30) != 0) {
                                break;
                            }
                            long j5 = 2 + j2;
                            if (UnsafeUtil.getByte(j4) > -65) {
                                break;
                            }
                            j2 += 3;
                            if (UnsafeUtil.getByte(j5) > -65) {
                                break;
                            }
                        } else {
                            if (i3 < 2) {
                                return unsafeIncompleteStateFor(j2, b2, i3);
                            }
                            i2 -= 3;
                            long j6 = 1 + j2;
                            byte b4 = UnsafeUtil.getByte(j2);
                            if (b4 > -65 || ((b2 == -32 && b4 < -96) || (b2 == -19 && b4 >= -96))) {
                                break;
                            }
                            j2 += 2;
                            if (UnsafeUtil.getByte(j6) > -65) {
                                break;
                            }
                        }
                    } else if (i3 != 0) {
                        i2 -= 2;
                        if (b2 < -62) {
                            break;
                        }
                        long j7 = 1 + j2;
                        if (UnsafeUtil.getByte(j2) > -65) {
                            break;
                        }
                        j2 = j7;
                    } else {
                        return b2;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }
    }

    private static int incompleteStateFor(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    private static int incompleteStateFor(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return incompleteStateFor(b2);
        }
        if (i3 == 1) {
            return incompleteStateFor(b2, bArr[i]);
        }
        if (i3 == 2) {
            return incompleteStateFor(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    private static int incompleteStateFor(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return incompleteStateFor(i);
        }
        if (i3 == 1) {
            return incompleteStateFor(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return incompleteStateFor(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i3 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 < -16) {
                        if (i3 >= i2 - 1) {
                            return Utf8.access$1100(bArr, i3, i2);
                        }
                        int i4 = i + 2;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            i += 3;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 2) {
                        return Utf8.access$1100(bArr, i3, i2);
                    }
                    int i5 = i + 2;
                    byte b4 = bArr[i3];
                    if (b4 <= -65) {
                        if ((((b4 + 112) + (b2 << Ascii.f42537FS)) >> 30) == 0) {
                            int i6 = i + 3;
                            if (bArr[i5] <= -65) {
                                i += 4;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (!DecodeUtil.access$400(b2)) {
                    break;
                }
                i++;
                DecodeUtil.access$500(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                if (DecodeUtil.access$400(b3)) {
                    int i7 = i5 + 1;
                    DecodeUtil.access$500(b3, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b4 = bArr[i8];
                        if (!DecodeUtil.access$400(b4)) {
                            break;
                        }
                        i8++;
                        DecodeUtil.access$500(b4, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (DecodeUtil.access$600(b3)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.access$700(b3, bArr[i6], cArr, i5);
                    i5++;
                } else if (DecodeUtil.access$800(b3)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    DecodeUtil.access$900(b3, bArr[i6], bArr[i9], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = bArr[i6];
                    int i10 = i + 3;
                    byte b6 = bArr[i + 2];
                    i += 4;
                    DecodeUtil.access$1000(b3, b5, b6, bArr[i10], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) {
            return decodeUtf8Default(byteBuffer, i, i2);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = charSequence.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = charSequence.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = charSequence.charAt(i6);
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
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                        }
                        int i9 = i6 + 1;
                        if (i9 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i9);
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

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            byte b2;
            int i4;
            int i5;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 >= -62) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        int i6 = i2 + 1;
                        byte b5 = bArr[i2];
                        if (i6 >= i3) {
                            return Utf8.access$000(b3, b5);
                        }
                        i2 = i6;
                        b4 = b5;
                    }
                    if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                byte b6 = (byte) (~(i >> 8));
                if (b6 == 0) {
                    i4 = i2 + 1;
                    b6 = bArr[i2];
                    if (i4 >= i3) {
                        return Utf8.access$000(b3, b6);
                    }
                    b2 = 0;
                } else {
                    b2 = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b2 == 0) {
                    int i7 = i4 + 1;
                    byte b7 = bArr[i4];
                    if (i7 >= i3) {
                        return Utf8.access$100(b3, b6, b7);
                    }
                    b2 = b7;
                    i4 = i7;
                }
                if (b6 <= -65) {
                    if ((((b6 + 112) + (b3 << Ascii.f42537FS)) >> 30) == 0 && b2 <= -65) {
                        i2 = i4 + 1;
                    }
                }
                return -1;
                i2 = i5;
            }
            return partialIsValidUtf8(bArr, i2, i3);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i2);
        }
    }
}
