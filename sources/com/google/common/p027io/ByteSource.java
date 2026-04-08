package com.google.common.p027io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public abstract class ByteSource {

    /* JADX INFO: compiled from: Proguard */
    public class AsCharSource extends CharSource {
        final Charset charset;

        public AsCharSource(Charset charset) {
            this.charset = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.p027io.CharSource
        public ByteSource asByteSource(Charset charset) {
            return charset.equals(this.charset) ? ByteSource.this : super.asByteSource(charset);
        }

        @Override // com.google.common.p027io.CharSource
        public Reader openStream() {
            return new InputStreamReader(ByteSource.this.openStream(), this.charset);
        }

        @Override // com.google.common.p027io.CharSource
        public String read() {
            return new String(ByteSource.this.read(), this.charset);
        }

        public String toString() {
            return ByteSource.this.toString() + ".asCharSource(" + this.charset + ")";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ByteArrayByteSource extends ByteSource {
        final byte[] bytes;
        final int length;
        final int offset;

        public ByteArrayByteSource(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // com.google.common.p027io.ByteSource
        public long copyTo(OutputStream outputStream) throws IOException {
            outputStream.write(this.bytes, this.offset, this.length);
            return this.length;
        }

        @Override // com.google.common.p027io.ByteSource
        public HashCode hash(HashFunction hashFunction) {
            return hashFunction.hashBytes(this.bytes, this.offset, this.length);
        }

        @Override // com.google.common.p027io.ByteSource
        public boolean isEmpty() {
            return this.length == 0;
        }

        @Override // com.google.common.p027io.ByteSource
        public InputStream openBufferedStream() {
            return openStream();
        }

        @Override // com.google.common.p027io.ByteSource
        public InputStream openStream() {
            return new ByteArrayInputStream(this.bytes, this.offset, this.length);
        }

        @Override // com.google.common.p027io.ByteSource
        public byte[] read() {
            byte[] bArr = this.bytes;
            int i = this.offset;
            return Arrays.copyOfRange(bArr, i, this.length + i);
        }

        @Override // com.google.common.p027io.ByteSource
        public long size() {
            return this.length;
        }

        @Override // com.google.common.p027io.ByteSource
        public Optional<Long> sizeIfKnown() {
            return Optional.m14762of(Long.valueOf(this.length));
        }

        @Override // com.google.common.p027io.ByteSource
        public ByteSource slice(long j, long j2) {
            Preconditions.checkArgument(j >= 0, "offset (%s) may not be negative", j);
            Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            long jMin = Math.min(j, this.length);
            return new ByteArrayByteSource(this.bytes, this.offset + ((int) jMin), (int) Math.min(j2, ((long) this.length) - jMin));
        }

        public String toString() {
            return "ByteSource.wrap(" + Ascii.truncate(BaseEncoding.base16().encode(this.bytes, this.offset, this.length), 30, "...") + ")";
        }

        public ByteArrayByteSource(byte[] bArr, int i, int i2) {
            this.bytes = bArr;
            this.offset = i;
            this.length = i2;
        }

        @Override // com.google.common.p027io.ByteSource
        @ParametricNullness
        public <T> T read(ByteProcessor<T> byteProcessor) {
            byteProcessor.processBytes(this.bytes, this.offset, this.length);
            return byteProcessor.getResult();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatenatedByteSource extends ByteSource {
        final Iterable<? extends ByteSource> sources;

        public ConcatenatedByteSource(Iterable<? extends ByteSource> iterable) {
            this.sources = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.p027io.ByteSource
        public boolean isEmpty() {
            Iterator<? extends ByteSource> it = this.sources.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p027io.ByteSource
        public InputStream openStream() {
            return new MultiInputStream(this.sources.iterator());
        }

        @Override // com.google.common.p027io.ByteSource
        public long size() {
            Iterator<? extends ByteSource> it = this.sources.iterator();
            long size = 0;
            while (it.hasNext()) {
                size += it.next().size();
                if (size < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return size;
        }

        @Override // com.google.common.p027io.ByteSource
        public Optional<Long> sizeIfKnown() {
            Iterable<? extends ByteSource> iterable = this.sources;
            if (!(iterable instanceof Collection)) {
                return Optional.absent();
            }
            Iterator<? extends ByteSource> it = iterable.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Optional<Long> optionalSizeIfKnown = it.next().sizeIfKnown();
                if (!optionalSizeIfKnown.isPresent()) {
                    return Optional.absent();
                }
                jLongValue += optionalSizeIfKnown.get().longValue();
                if (jLongValue < 0) {
                    return Optional.m14762of(Long.MAX_VALUE);
                }
            }
            return Optional.m14762of(Long.valueOf(jLongValue));
        }

        public String toString() {
            return "ByteSource.concat(" + this.sources + ")";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyByteSource extends ByteArrayByteSource {
        static final EmptyByteSource INSTANCE = new EmptyByteSource();

        public EmptyByteSource() {
            super(new byte[0]);
        }

        @Override // com.google.common.p027io.ByteSource
        public CharSource asCharSource(Charset charset) {
            Preconditions.checkNotNull(charset);
            return CharSource.empty();
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource, com.google.common.p027io.ByteSource
        public byte[] read() {
            return this.bytes;
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class SlicedByteSource extends ByteSource {
        final long length;
        final long offset;

        public SlicedByteSource(long j, long j2) {
            Preconditions.checkArgument(j >= 0, "offset (%s) may not be negative", j);
            Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            this.offset = j;
            this.length = j2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: X */
        private InputStream sliceStream(InputStream inputStream) throws X, IOException {
            long j = this.offset;
            if (j > 0) {
                try {
                    if (ByteStreams.skipUpTo(inputStream, j) < this.offset) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return ByteStreams.limit(inputStream, this.length);
        }

        @Override // com.google.common.p027io.ByteSource
        public boolean isEmpty() {
            return this.length == 0 || super.isEmpty();
        }

        @Override // com.google.common.p027io.ByteSource
        public InputStream openBufferedStream() {
            return sliceStream(ByteSource.this.openBufferedStream());
        }

        @Override // com.google.common.p027io.ByteSource
        public InputStream openStream() {
            return sliceStream(ByteSource.this.openStream());
        }

        @Override // com.google.common.p027io.ByteSource
        public Optional<Long> sizeIfKnown() {
            Optional<Long> optionalSizeIfKnown = ByteSource.this.sizeIfKnown();
            if (!optionalSizeIfKnown.isPresent()) {
                return Optional.absent();
            }
            long jLongValue = optionalSizeIfKnown.get().longValue();
            return Optional.m14762of(Long.valueOf(Math.min(this.length, jLongValue - Math.min(this.offset, jLongValue))));
        }

        @Override // com.google.common.p027io.ByteSource
        public ByteSource slice(long j, long j2) {
            Preconditions.checkArgument(j >= 0, "offset (%s) may not be negative", j);
            Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            long j3 = this.length - j;
            return j3 <= 0 ? ByteSource.empty() : ByteSource.this.slice(this.offset + j, Math.min(j2, j3));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ByteSource.this.toString());
            sb.append(".slice(");
            sb.append(this.offset);
            sb.append(", ");
            return AbstractC0000a.m12i(this.length, ")", sb);
        }
    }

    public static ByteSource concat(Iterable<? extends ByteSource> iterable) {
        return new ConcatenatedByteSource(iterable);
    }

    private long countBySkipping(InputStream inputStream) {
        long j = 0;
        while (true) {
            long jSkipUpTo = ByteStreams.skipUpTo(inputStream, 2147483647L);
            if (jSkipUpTo <= 0) {
                return j;
            }
            j += jSkipUpTo;
        }
    }

    public static ByteSource empty() {
        return EmptyByteSource.INSTANCE;
    }

    public static ByteSource wrap(byte[] bArr) {
        return new ByteArrayByteSource(bArr);
    }

    public CharSource asCharSource(Charset charset) {
        return new AsCharSource(charset);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public boolean contentEquals(ByteSource byteSource) throws X {
        int i;
        Preconditions.checkNotNull(byteSource);
        byte[] bArrCreateBuffer = ByteStreams.createBuffer();
        byte[] bArrCreateBuffer2 = ByteStreams.createBuffer();
        Closer closerCreate = Closer.create();
        try {
            InputStream inputStream = (InputStream) closerCreate.register(openStream());
            InputStream inputStream2 = (InputStream) closerCreate.register(byteSource.openStream());
            do {
                i = ByteStreams.read(inputStream, bArrCreateBuffer, 0, bArrCreateBuffer.length);
                if (i == ByteStreams.read(inputStream2, bArrCreateBuffer2, 0, bArrCreateBuffer2.length) && Arrays.equals(bArrCreateBuffer, bArrCreateBuffer2)) {
                }
                return false;
            } while (i == bArrCreateBuffer.length);
            closerCreate.close();
            return true;
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @CanIgnoreReturnValue
    public long copyTo(OutputStream outputStream) throws X {
        Preconditions.checkNotNull(outputStream);
        try {
            return ByteStreams.copy((InputStream) Closer.create().register(openStream()), outputStream);
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public HashCode hash(HashFunction hashFunction) throws X {
        Hasher hasherNewHasher = hashFunction.newHasher();
        copyTo(Funnels.asOutputStream(hasherNewHasher));
        return hasherNewHasher.hash();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public boolean isEmpty() throws X {
        Optional<Long> optionalSizeIfKnown = sizeIfKnown();
        if (optionalSizeIfKnown.isPresent()) {
            return optionalSizeIfKnown.get().longValue() == 0;
        }
        try {
            return ((InputStream) Closer.create().register(openStream())).read() == -1;
        } finally {
        }
    }

    public InputStream openBufferedStream() {
        InputStream inputStreamOpenStream = openStream();
        return inputStreamOpenStream instanceof BufferedInputStream ? (BufferedInputStream) inputStreamOpenStream : new BufferedInputStream(inputStreamOpenStream);
    }

    public abstract InputStream openStream();

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public byte[] read() throws X {
        Closer closerCreate = Closer.create();
        try {
            InputStream inputStream = (InputStream) closerCreate.register(openStream());
            Optional<Long> optionalSizeIfKnown = sizeIfKnown();
            return optionalSizeIfKnown.isPresent() ? ByteStreams.toByteArray(inputStream, optionalSizeIfKnown.get().longValue()) : ByteStreams.toByteArray(inputStream);
        } catch (Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } finally {
                closerCreate.close();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public long size() throws X {
        Optional<Long> optionalSizeIfKnown = sizeIfKnown();
        if (optionalSizeIfKnown.isPresent()) {
            return optionalSizeIfKnown.get().longValue();
        }
        Closer closerCreate = Closer.create();
        try {
            return countBySkipping((InputStream) closerCreate.register(openStream()));
        } catch (IOException unused) {
            closerCreate.close();
            try {
                return ByteStreams.exhaust((InputStream) Closer.create().register(openStream()));
            } finally {
            }
        } finally {
        }
    }

    public Optional<Long> sizeIfKnown() {
        return Optional.absent();
    }

    public ByteSource slice(long j, long j2) {
        return new SlicedByteSource(j, j2);
    }

    public static ByteSource concat(Iterator<? extends ByteSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    public static ByteSource concat(ByteSource... byteSourceArr) {
        return concat(ImmutableList.copyOf(byteSourceArr));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @CanIgnoreReturnValue
    public long copyTo(ByteSink byteSink) throws X {
        Preconditions.checkNotNull(byteSink);
        Closer closerCreate = Closer.create();
        try {
            return ByteStreams.copy((InputStream) closerCreate.register(openStream()), (OutputStream) closerCreate.register(byteSink.openStream()));
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T read(ByteProcessor<T> byteProcessor) throws X {
        Preconditions.checkNotNull(byteProcessor);
        try {
            return (T) ByteStreams.readBytes((InputStream) Closer.create().register(openStream()), byteProcessor);
        } finally {
        }
    }
}
