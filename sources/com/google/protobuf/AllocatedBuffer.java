package com.google.protobuf;

import java.nio.ByteBuffer;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
abstract class AllocatedBuffer {

    /* JADX INFO: renamed from: com.google.protobuf.AllocatedBuffer$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C48711 extends AllocatedBuffer {
        final /* synthetic */ ByteBuffer val$buffer;

        public C48711(ByteBuffer byteBuffer) {
            this.val$buffer = byteBuffer;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public byte[] array() {
            return this.val$buffer.array();
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int arrayOffset() {
            return this.val$buffer.arrayOffset();
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public boolean hasArray() {
            return this.val$buffer.hasArray();
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public boolean hasNioBuffer() {
            return true;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int limit() {
            return this.val$buffer.limit();
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public ByteBuffer nioBuffer() {
            return this.val$buffer;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int position() {
            return this.val$buffer.position();
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int remaining() {
            return this.val$buffer.remaining();
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public AllocatedBuffer position(int i) {
            Java8Compatibility.position(this.val$buffer, i);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.AllocatedBuffer$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C48722 extends AllocatedBuffer {
        private int position;
        final /* synthetic */ byte[] val$bytes;
        final /* synthetic */ int val$length;
        final /* synthetic */ int val$offset;

        public C48722(byte[] bArr, int i, int i2) {
            this.val$bytes = bArr;
            this.val$offset = i;
            this.val$length = i2;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public byte[] array() {
            return this.val$bytes;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int arrayOffset() {
            return this.val$offset;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public boolean hasArray() {
            return true;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public boolean hasNioBuffer() {
            return false;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int limit() {
            return this.val$length;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public ByteBuffer nioBuffer() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int position() {
            return this.position;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int remaining() {
            return this.val$length - this.position;
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public AllocatedBuffer position(int i) {
            if (i < 0 || i > this.val$length) {
                throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Invalid position: "));
            }
            this.position = i;
            return this;
        }
    }

    public static AllocatedBuffer wrap(byte[] bArr) {
        return wrapNoCheck(bArr, 0, bArr.length);
    }

    private static AllocatedBuffer wrapNoCheck(byte[] bArr, int i, int i2) {
        return new C48722(bArr, i, i2);
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    @CanIgnoreReturnValue
    public abstract AllocatedBuffer position(int i);

    public abstract int remaining();

    public static AllocatedBuffer wrap(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return wrapNoCheck(bArr, i, i2);
    }

    public static AllocatedBuffer wrap(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        return new C48711(byteBuffer);
    }
}
