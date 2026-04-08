package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Version {
    private static final Version[] VERSIONS = buildVersions();
    private final int dataRegionSizeColumns;
    private final int dataRegionSizeRows;
    private final ECBlocks ecBlocks;
    private final int symbolSizeColumns;
    private final int symbolSizeRows;
    private final int totalCodewords;
    private final int versionNumber;

    /* JADX INFO: compiled from: Proguard */
    public static final class ECB {
        private final int count;
        private final int dataCodewords;

        public /* synthetic */ ECB(int i, int i2, C49501 c49501) {
            this(i, i2);
        }

        public int getCount() {
            return this.count;
        }

        public int getDataCodewords() {
            return this.dataCodewords;
        }

        private ECB(int i, int i2) {
            this.count = i;
            this.dataCodewords = i2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ECBlocks {
        private final ECB[] ecBlocks;
        private final int ecCodewords;

        public /* synthetic */ ECBlocks(int i, ECB ecb, C49501 c49501) {
            this(i, ecb);
        }

        public ECB[] getECBlocks() {
            return this.ecBlocks;
        }

        public int getECCodewords() {
            return this.ecCodewords;
        }

        public /* synthetic */ ECBlocks(int i, ECB ecb, ECB ecb2, C49501 c49501) {
            this(i, ecb, ecb2);
        }

        private ECBlocks(int i, ECB ecb) {
            this.ecCodewords = i;
            this.ecBlocks = new ECB[]{ecb};
        }

        private ECBlocks(int i, ECB ecb, ECB ecb2) {
            this.ecCodewords = i;
            this.ecBlocks = new ECB[]{ecb, ecb2};
        }
    }

    private Version(int i, int i2, int i3, int i4, int i5, ECBlocks eCBlocks) {
        this.versionNumber = i;
        this.symbolSizeRows = i2;
        this.symbolSizeColumns = i3;
        this.dataRegionSizeRows = i4;
        this.dataRegionSizeColumns = i5;
        this.ecBlocks = eCBlocks;
        int eCCodewords = eCBlocks.getECCodewords();
        int dataCodewords = 0;
        for (ECB ecb : eCBlocks.getECBlocks()) {
            dataCodewords += (ecb.getDataCodewords() + eCCodewords) * ecb.getCount();
        }
        this.totalCodewords = dataCodewords;
    }

    private static Version[] buildVersions() {
        return new Version[]{new Version(1, 10, 10, 8, 8, new ECBlocks(5, new ECB(1, 3, null), (C49501) null)), new Version(2, 12, 12, 10, 10, new ECBlocks(7, new ECB(1, 5, null), (C49501) null)), new Version(3, 14, 14, 12, 12, new ECBlocks(10, new ECB(1, 8, null), (C49501) null)), new Version(4, 16, 16, 14, 14, new ECBlocks(12, new ECB(1, 12, null), (C49501) null)), new Version(5, 18, 18, 16, 16, new ECBlocks(14, new ECB(1, 18, null), (C49501) null)), new Version(6, 20, 20, 18, 18, new ECBlocks(18, new ECB(1, 22, null), (C49501) null)), new Version(7, 22, 22, 20, 20, new ECBlocks(20, new ECB(1, 30, null), (C49501) null)), new Version(8, 24, 24, 22, 22, new ECBlocks(24, new ECB(1, 36, null), (C49501) null)), new Version(9, 26, 26, 24, 24, new ECBlocks(28, new ECB(1, 44, null), (C49501) null)), new Version(10, 32, 32, 14, 14, new ECBlocks(36, new ECB(1, 62, null), (C49501) null)), new Version(11, 36, 36, 16, 16, new ECBlocks(42, new ECB(1, 86, null), (C49501) null)), new Version(12, 40, 40, 18, 18, new ECBlocks(48, new ECB(1, 114, null), (C49501) null)), new Version(13, 44, 44, 20, 20, new ECBlocks(56, new ECB(1, 144, null), (C49501) null)), new Version(14, 48, 48, 22, 22, new ECBlocks(68, new ECB(1, 174, null), (C49501) null)), new Version(15, 52, 52, 24, 24, new ECBlocks(42, new ECB(2, 102, null), (C49501) null)), new Version(16, 64, 64, 14, 14, new ECBlocks(56, new ECB(2, 140, null), (C49501) null)), new Version(17, 72, 72, 16, 16, new ECBlocks(36, new ECB(4, 92, null), (C49501) null)), new Version(18, 80, 80, 18, 18, new ECBlocks(48, new ECB(4, 114, null), (C49501) null)), new Version(19, 88, 88, 20, 20, new ECBlocks(56, new ECB(4, 144, null), (C49501) null)), new Version(20, 96, 96, 22, 22, new ECBlocks(68, new ECB(4, 174, null), (C49501) null)), new Version(21, 104, 104, 24, 24, new ECBlocks(56, new ECB(6, 136, null), (C49501) null)), new Version(22, 120, 120, 18, 18, new ECBlocks(68, new ECB(6, 175, null), (C49501) null)), new Version(23, 132, 132, 20, 20, new ECBlocks(62, new ECB(8, 163, null), (C49501) null)), new Version(24, 144, 144, 22, 22, new ECBlocks(62, new ECB(8, 156, null), new ECB(2, 155, null), null)), new Version(25, 8, 18, 6, 16, new ECBlocks(7, new ECB(1, 5, null), (C49501) null)), new Version(26, 8, 32, 6, 14, new ECBlocks(11, new ECB(1, 10, null), (C49501) null)), new Version(27, 12, 26, 10, 24, new ECBlocks(14, new ECB(1, 16, null), (C49501) null)), new Version(28, 12, 36, 10, 16, new ECBlocks(18, new ECB(1, 22, null), (C49501) null)), new Version(29, 16, 36, 14, 16, new ECBlocks(24, new ECB(1, 32, null), (C49501) null)), new Version(30, 16, 48, 14, 22, new ECBlocks(28, new ECB(1, 49, null), (C49501) null)), new Version(31, 8, 48, 6, 22, new ECBlocks(15, new ECB(1, 18, null), (C49501) null)), new Version(32, 8, 64, 6, 14, new ECBlocks(18, new ECB(1, 24, null), (C49501) null)), new Version(33, 8, 80, 6, 18, new ECBlocks(22, new ECB(1, 32, null), (C49501) null)), new Version(34, 8, 96, 6, 22, new ECBlocks(28, new ECB(1, 38, null), (C49501) null)), new Version(35, 8, 120, 6, 18, new ECBlocks(32, new ECB(1, 49, null), (C49501) null)), new Version(36, 8, 144, 6, 22, new ECBlocks(36, new ECB(1, 63, null), (C49501) null)), new Version(37, 12, 64, 10, 14, new ECBlocks(27, new ECB(1, 43, null), (C49501) null)), new Version(38, 12, 88, 10, 20, new ECBlocks(36, new ECB(1, 64, null), (C49501) null)), new Version(39, 16, 64, 14, 14, new ECBlocks(36, new ECB(1, 62, null), (C49501) null)), new Version(40, 20, 36, 18, 16, new ECBlocks(28, new ECB(1, 44, null), (C49501) null)), new Version(41, 20, 44, 18, 20, new ECBlocks(34, new ECB(1, 56, null), (C49501) null)), new Version(42, 20, 64, 18, 14, new ECBlocks(42, new ECB(1, 84, null), (C49501) null)), new Version(43, 22, 48, 20, 22, new ECBlocks(38, new ECB(1, 72, null), (C49501) null)), new Version(44, 24, 48, 22, 22, new ECBlocks(41, new ECB(1, 80, null), (C49501) null)), new Version(45, 24, 64, 22, 14, new ECBlocks(46, new ECB(1, 108, null), (C49501) null)), new Version(46, 26, 40, 24, 18, new ECBlocks(38, new ECB(1, 70, null), (C49501) null)), new Version(47, 26, 48, 24, 22, new ECBlocks(42, new ECB(1, 90, null), (C49501) null)), new Version(48, 26, 64, 24, 14, new ECBlocks(50, new ECB(1, 118, null), (C49501) null))};
    }

    public static Version getVersionForDimensions(int i, int i2) throws FormatException {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (Version version : VERSIONS) {
            if (version.symbolSizeRows == i && version.symbolSizeColumns == i2) {
                return version;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public int getDataRegionSizeColumns() {
        return this.dataRegionSizeColumns;
    }

    public int getDataRegionSizeRows() {
        return this.dataRegionSizeRows;
    }

    public ECBlocks getECBlocks() {
        return this.ecBlocks;
    }

    public int getSymbolSizeColumns() {
        return this.symbolSizeColumns;
    }

    public int getSymbolSizeRows() {
        return this.symbolSizeRows;
    }

    public int getTotalCodewords() {
        return this.totalCodewords;
    }

    public int getVersionNumber() {
        return this.versionNumber;
    }

    public String toString() {
        return String.valueOf(this.versionNumber);
    }
}
