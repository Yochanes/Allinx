package kotlin.reflect.jvm.internal.impl.protobuf;

import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class BoundedByteString extends LiteralByteString {

    /* JADX INFO: compiled from: Proguard */
    public class BoundedByteIterator implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a */
        public int f54073a;

        public BoundedByteIterator() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f54073a < 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i = this.f54073a;
            if (i >= 0) {
                throw new NoSuchElementException();
            }
            byte[] bArr = BoundedByteString.this.f54127b;
            this.f54073a = i + 1;
            return bArr[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: f */
    public final void mo19618f(byte[] bArr, int i, int i2, int i3) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        mo19619k();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: k */
    public final ByteString.ByteIterator mo19619k() {
        new BoundedByteIterator();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    /* JADX INFO: renamed from: s */
    public final byte mo19620s(int i) {
        if (i >= 0) {
            throw null;
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC2929c.m13702g(28, i, "Index too small: "));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int size() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    /* JADX INFO: renamed from: v */
    public final int mo19621v() {
        throw null;
    }
}
