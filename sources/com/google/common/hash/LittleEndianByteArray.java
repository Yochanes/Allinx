package com.google.common.hash;

import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
final class LittleEndianByteArray {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final LittleEndianBytes byteArray;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static abstract class JavaLittleEndianBytes implements LittleEndianBytes {
        public static final JavaLittleEndianBytes INSTANCE = new C44351("INSTANCE", 0);
        private static final /* synthetic */ JavaLittleEndianBytes[] $VALUES = $values();

        /* JADX INFO: renamed from: com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes$1 */
        /* JADX INFO: compiled from: Proguard */
        public enum C44351 extends JavaLittleEndianBytes {
            public C44351(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i) {
                return Longs.fromBytes(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
                long j2 = 255;
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i + i2] = (byte) ((j & j2) >> (i2 * 8));
                    j2 <<= 8;
                }
            }
        }

        private static /* synthetic */ JavaLittleEndianBytes[] $values() {
            return new JavaLittleEndianBytes[]{INSTANCE};
        }

        private JavaLittleEndianBytes(String str, int i) {
        }

        public static JavaLittleEndianBytes valueOf(String str) {
            return (JavaLittleEndianBytes) Enum.valueOf(JavaLittleEndianBytes.class, str);
        }

        public static JavaLittleEndianBytes[] values() {
            return (JavaLittleEndianBytes[]) $VALUES.clone();
        }

        public /* synthetic */ JavaLittleEndianBytes(String str, int i, C44341 c44341) {
            this(str, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface LittleEndianBytes {
        long getLongLittleEndian(byte[] bArr, int i);

        void putLongLittleEndian(byte[] bArr, int i, long j);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static abstract class UnsafeByteArray implements LittleEndianBytes {
        private static final int BYTE_ARRAY_BASE_OFFSET;
        private static final Unsafe theUnsafe;
        public static final UnsafeByteArray UNSAFE_LITTLE_ENDIAN = new C44361("UNSAFE_LITTLE_ENDIAN", 0);
        public static final UnsafeByteArray UNSAFE_BIG_ENDIAN = new C44372("UNSAFE_BIG_ENDIAN", 1);
        private static final /* synthetic */ UnsafeByteArray[] $VALUES = $values();

        /* JADX INFO: renamed from: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$1 */
        /* JADX INFO: compiled from: Proguard */
        public enum C44361 extends UnsafeByteArray {
            public C44361(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i) {
                return UnsafeByteArray.access$200().getLong(bArr, ((long) i) + ((long) UnsafeByteArray.access$100()));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
                UnsafeByteArray.access$200().putLong(bArr, ((long) i) + ((long) UnsafeByteArray.access$100()), j);
            }
        }

        /* JADX INFO: renamed from: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$2 */
        /* JADX INFO: compiled from: Proguard */
        public enum C44372 extends UnsafeByteArray {
            public C44372(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i) {
                return Long.reverseBytes(UnsafeByteArray.access$200().getLong(bArr, ((long) i) + ((long) UnsafeByteArray.access$100())));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
                UnsafeByteArray.access$200().putLong(bArr, ((long) i) + ((long) UnsafeByteArray.access$100()), Long.reverseBytes(j));
            }
        }

        private static /* synthetic */ UnsafeByteArray[] $values() {
            return new UnsafeByteArray[]{UNSAFE_LITTLE_ENDIAN, UNSAFE_BIG_ENDIAN};
        }

        static {
            Unsafe unsafe = getUnsafe();
            theUnsafe = unsafe;
            BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        private UnsafeByteArray(String str, int i) {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Unsafe m14993a() {
            return lambda$getUnsafe$0();
        }

        public static /* synthetic */ int access$100() {
            return BYTE_ARRAY_BASE_OFFSET;
        }

        public static /* synthetic */ Unsafe access$200() {
            return theUnsafe;
        }

        private static Unsafe getUnsafe() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new C4443a());
            }
        }

        private static /* synthetic */ Unsafe lambda$getUnsafe$0() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public static UnsafeByteArray valueOf(String str) {
            return (UnsafeByteArray) Enum.valueOf(UnsafeByteArray.class, str);
        }

        public static UnsafeByteArray[] values() {
            return (UnsafeByteArray[]) $VALUES.clone();
        }

        public /* synthetic */ UnsafeByteArray(String str, int i, C44341 c44341) {
            this(str, i);
        }
    }

    static {
        LittleEndianBytes littleEndianBytes = JavaLittleEndianBytes.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                littleEndianBytes = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? UnsafeByteArray.UNSAFE_LITTLE_ENDIAN : UnsafeByteArray.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        byteArray = littleEndianBytes;
    }

    private LittleEndianByteArray() {
    }

    public static int load32(byte[] bArr, int i) {
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static long load64(byte[] bArr, int i) {
        return byteArray.getLongLittleEndian(bArr, i);
    }

    public static long load64Safely(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, 8);
        long j = 0;
        for (int i3 = 0; i3 < iMin; i3++) {
            j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
        }
        return j;
    }

    public static void store64(byte[] bArr, int i, long j) {
        byteArray.putLongLittleEndian(bArr, i, j);
    }

    public static boolean usingUnsafe() {
        return byteArray instanceof UnsafeByteArray;
    }
}
