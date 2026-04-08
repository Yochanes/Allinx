package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface Hasher extends PrimitiveSink {
    HashCode hash();

    @Deprecated
    int hashCode();

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBoolean(boolean z2);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putBoolean(boolean z2) {
        return putBoolean(z2);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putByte(byte b2);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putByte(byte b2) {
        return putByte(b2);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(byte[] bArr);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putBytes(byte[] bArr, int i, int i2);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putBytes(ByteBuffer byteBuffer) {
        return putBytes(byteBuffer);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putChar(char c2);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putChar(char c2) {
        return putChar(c2);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putDouble(double d);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putDouble(double d) {
        return putDouble(d);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putFloat(float f);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putFloat(float f) {
        return putFloat(f);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putInt(int i);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putInt(int i) {
        return putInt(i);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putLong(long j);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putLong(long j) {
        return putLong(j);
    }

    @CanIgnoreReturnValue
    <T> Hasher putObject(@ParametricNullness T t, Funnel<? super T> funnel);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putShort(short s);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putShort(short s) {
        return putShort(s);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putString(CharSequence charSequence, Charset charset);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putString(CharSequence charSequence, Charset charset) {
        return putString(charSequence, charset);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    Hasher putUnencodedChars(CharSequence charSequence);

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putUnencodedChars(CharSequence charSequence) {
        return putUnencodedChars(charSequence);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putBytes(byte[] bArr) {
        return putBytes(bArr);
    }

    @Override // com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default PrimitiveSink putBytes(byte[] bArr, int i, int i2) {
        return putBytes(bArr, i, i2);
    }
}
