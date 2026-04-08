package com.engagelab.privates.core.api;

import com.engagelab.privates.common.annotation.AllClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class Outputer {
    private byte[] array;
    private int pos;
    private int saved_pos;

    public Outputer(int i) {
        this.array = new byte[i];
        this.pos = 0;
        this.saved_pos = -1;
    }

    private void need(int i) {
        byte[] bArr = this.array;
        int length = bArr.length;
        int i2 = this.pos;
        if (length - i2 >= i) {
            return;
        }
        int length2 = bArr.length * 2;
        int i3 = i + i2;
        if (length2 < i3) {
            length2 = i3;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.array = bArr2;
    }

    public int current() {
        return this.pos;
    }

    public void jump(int i) {
        if (i > this.pos) {
            throw new IllegalArgumentException("cannot jump past end of data");
        }
        this.pos = i;
    }

    public void restore() {
        int i = this.saved_pos;
        if (i < 0) {
            throw new IllegalStateException("no previous state");
        }
        this.pos = i;
        this.saved_pos = -1;
    }

    public void save() {
        this.saved_pos = this.pos;
    }

    public byte[] toByteArray() {
        int i = this.pos;
        byte[] bArr = new byte[i];
        System.arraycopy(this.array, 0, bArr, 0, i);
        return bArr;
    }

    public void writeByteArray(byte[] bArr, int i, int i2) {
        need(i2);
        System.arraycopy(bArr, i, this.array, this.pos, i2);
        this.pos += i2;
    }

    public void writeByteArrayIncludeLength(byte[] bArr) {
        writeU16(bArr.length);
        writeByteArray(bArr, 0, bArr.length);
    }

    public void writeCountedString(byte[] bArr) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException("Invalid counted string");
        }
        need(bArr.length + 1);
        byte[] bArr2 = this.array;
        int i = this.pos;
        this.pos = i + 1;
        bArr2[i] = (byte) (255 & bArr.length);
        writeByteArray(bArr, 0, bArr.length);
    }

    public void writeU16(int i) {
        check(i, 16);
        need(2);
        byte[] bArr = this.array;
        int i2 = this.pos;
        int i3 = i2 + 1;
        this.pos = i3;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        this.pos = i2 + 2;
        bArr[i3] = (byte) (i & 255);
    }

    public void writeU16At(int i, int i2) {
        check(i, 16);
        if (i2 > this.pos - 2) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        byte[] bArr = this.array;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    public void writeU32(long j) {
        check(j, 32);
        need(4);
        byte[] bArr = this.array;
        int i = this.pos;
        int i2 = i + 1;
        this.pos = i2;
        bArr[i] = (byte) ((j >>> 24) & 255);
        int i3 = i + 2;
        this.pos = i3;
        bArr[i2] = (byte) ((j >>> 16) & 255);
        int i4 = i + 3;
        this.pos = i4;
        bArr[i3] = (byte) ((j >>> 8) & 255);
        this.pos = i + 4;
        bArr[i4] = (byte) (j & 255);
    }

    public void writeU32At(long j, int i) {
        check(j, 32);
        if (i > this.pos - 4) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        byte[] bArr = this.array;
        bArr[i] = (byte) ((j >>> 24) & 255);
        bArr[i + 1] = (byte) ((j >>> 16) & 255);
        bArr[i + 2] = (byte) ((j >>> 8) & 255);
        bArr[i + 3] = (byte) (j & 255);
    }

    public void writeU64(long j) {
        need(8);
        byte[] bArr = this.array;
        int i = this.pos;
        int i2 = i + 1;
        this.pos = i2;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i + 2;
        this.pos = i3;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i + 3;
        this.pos = i4;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i + 4;
        this.pos = i5;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i + 5;
        this.pos = i6;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i + 6;
        this.pos = i7;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i + 7;
        this.pos = i8;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        this.pos = i + 8;
        bArr[i8] = (byte) (j & 255);
    }

    public void writeU64At(long j, int i) {
        check(j, 64);
        if (i > this.pos - 8) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        byte[] bArr = this.array;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
    }

    public void writeU8(int i) {
        check(i, 8);
        need(1);
        byte[] bArr = this.array;
        int i2 = this.pos;
        this.pos = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    public void writeU8At(int i, int i2) {
        check(i, 8);
        if (i2 > this.pos - 1) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        this.array[i2] = (byte) (i & 255);
    }

    public void writeByteArray(byte[] bArr) {
        writeByteArray(bArr, 0, bArr.length);
    }

    public Outputer() {
        this(32);
    }

    private void check(long j, int i) {
    }
}
