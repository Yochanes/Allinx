package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.BitMatrix;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class DataMask {
    private static final /* synthetic */ DataMask[] $VALUES;
    public static final DataMask DATA_MASK_000;
    public static final DataMask DATA_MASK_001;
    public static final DataMask DATA_MASK_010;
    public static final DataMask DATA_MASK_011;
    public static final DataMask DATA_MASK_100;
    public static final DataMask DATA_MASK_101;
    public static final DataMask DATA_MASK_110;
    public static final DataMask DATA_MASK_111;

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DataMask$1 */
    /* JADX INFO: compiled from: Proguard */
    public enum C49571 extends DataMask {
        public C49571(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        public boolean isMasked(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DataMask$2 */
    /* JADX INFO: compiled from: Proguard */
    public enum C49582 extends DataMask {
        public C49582(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        public boolean isMasked(int i, int i2) {
            return (i & 1) == 0;
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DataMask$3 */
    /* JADX INFO: compiled from: Proguard */
    public enum C49593 extends DataMask {
        public C49593(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        public boolean isMasked(int i, int i2) {
            return i2 % 3 == 0;
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DataMask$4 */
    /* JADX INFO: compiled from: Proguard */
    public enum C49604 extends DataMask {
        public C49604(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        public boolean isMasked(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DataMask$5 */
    /* JADX INFO: compiled from: Proguard */
    public enum C49615 extends DataMask {
        public C49615(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        public boolean isMasked(int i, int i2) {
            return (((i2 / 3) + (i / 2)) & 1) == 0;
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DataMask$6 */
    /* JADX INFO: compiled from: Proguard */
    public enum C49626 extends DataMask {
        public C49626(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        public boolean isMasked(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DataMask$7 */
    /* JADX INFO: compiled from: Proguard */
    public enum C49637 extends DataMask {
        public C49637(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        public boolean isMasked(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DataMask$8 */
    /* JADX INFO: compiled from: Proguard */
    public enum C49648 extends DataMask {
        public C49648(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        public boolean isMasked(int i, int i2) {
            return ((((i * i2) % 3) + (i + i2)) & 1) == 0;
        }
    }

    static {
        C49571 c49571 = new C49571("DATA_MASK_000", 0);
        DATA_MASK_000 = c49571;
        C49582 c49582 = new C49582("DATA_MASK_001", 1);
        DATA_MASK_001 = c49582;
        C49593 c49593 = new C49593("DATA_MASK_010", 2);
        DATA_MASK_010 = c49593;
        C49604 c49604 = new C49604("DATA_MASK_011", 3);
        DATA_MASK_011 = c49604;
        C49615 c49615 = new C49615("DATA_MASK_100", 4);
        DATA_MASK_100 = c49615;
        C49626 c49626 = new C49626("DATA_MASK_101", 5);
        DATA_MASK_101 = c49626;
        C49637 c49637 = new C49637("DATA_MASK_110", 6);
        DATA_MASK_110 = c49637;
        C49648 c49648 = new C49648("DATA_MASK_111", 7);
        DATA_MASK_111 = c49648;
        $VALUES = new DataMask[]{c49571, c49582, c49593, c49604, c49615, c49626, c49637, c49648};
    }

    private DataMask(String str, int i) {
    }

    public static DataMask valueOf(String str) {
        return (DataMask) Enum.valueOf(DataMask.class, str);
    }

    public static DataMask[] values() {
        return (DataMask[]) $VALUES.clone();
    }

    public abstract boolean isMasked(int i, int i2);

    public final void unmaskBitMatrix(BitMatrix bitMatrix, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (isMasked(i2, i3)) {
                    bitMatrix.flip(i3, i2);
                }
            }
        }
    }

    public /* synthetic */ DataMask(String str, int i, C49571 c49571) {
        this(str, i);
    }
}
