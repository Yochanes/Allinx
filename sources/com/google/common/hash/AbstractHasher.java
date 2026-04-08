package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractHasher implements Hasher {
    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putBoolean(boolean z2) {
        return putBoolean(z2);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putBytes(ByteBuffer byteBuffer) {
        return putBytes(byteBuffer);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putChar(char c2) {
        return putChar(c2);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putDouble(double d) {
        return putDouble(d);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putFloat(float f) {
        return putFloat(f);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putInt(int i) {
        return putInt(i);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putLong(long j) {
        return putLong(j);
    }

    @Override // com.google.common.hash.Hasher
    @CanIgnoreReturnValue
    public <T> Hasher putObject(@ParametricNullness T t, Funnel<? super T> funnel) {
        funnel.funnel(t, this);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putShort(short s) {
        return putShort(s);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putString(CharSequence charSequence, Charset charset) {
        return putString(charSequence, charset);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putUnencodedChars(CharSequence charSequence) {
        return putUnencodedChars(charSequence);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putBoolean(boolean z2) {
        return putByte(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putBytes(byte[] bArr) {
        return putBytes(bArr);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putChar(char c2) {
        putByte((byte) c2);
        putByte((byte) (c2 >>> '\b'));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putDouble(double d) {
        return putLong(Double.doubleToRawLongBits(d));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putFloat(float f) {
        return putInt(Float.floatToRawIntBits(f));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putInt(int i) {
        putByte((byte) i);
        putByte((byte) (i >>> 8));
        putByte((byte) (i >>> 16));
        putByte((byte) (i >>> 24));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putLong(long j) {
        for (int i = 0; i < 64; i += 8) {
            putByte((byte) (j >>> i));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putShort(short s) {
        putByte((byte) s);
        putByte((byte) (s >>> 8));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putString(CharSequence charSequence, Charset charset) {
        return putBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            putChar(charSequence.charAt(i));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ PrimitiveSink putBytes(byte[] bArr, int i, int i2) {
        return putBytes(bArr, i, i2);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(byte[] bArr) {
        return putBytes(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            putByte(bArr[i + i3]);
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            putBytes(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            Java8Compatibility.position(byteBuffer, byteBuffer.limit());
            return this;
        }
        for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
            putByte(byteBuffer.get());
        }
        return this;
    }
}
