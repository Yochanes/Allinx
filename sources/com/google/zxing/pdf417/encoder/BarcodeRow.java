package com.google.zxing.pdf417.encoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class BarcodeRow {
    private int currentLocation = 0;
    private final byte[] row;

    public BarcodeRow(int i) {
        this.row = new byte[i];
    }

    public void addBar(boolean z2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.currentLocation;
            this.currentLocation = i3 + 1;
            set(i3, z2);
        }
    }

    public byte[] getScaledRow(int i) {
        int length = this.row.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.row[i2 / i];
        }
        return bArr;
    }

    public void set(int i, byte b2) {
        this.row[i] = b2;
    }

    private void set(int i, boolean z2) {
        this.row[i] = z2 ? (byte) 1 : (byte) 0;
    }
}
