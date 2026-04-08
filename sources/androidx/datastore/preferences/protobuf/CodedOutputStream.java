package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends ByteOutput {

    /* JADX INFO: renamed from: b */
    public static final Logger f23901b = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f23902c = UnsafeUtil.f24157f;

    /* JADX INFO: renamed from: a */
    public CodedOutputStreamWriter f23903a;

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {

        /* JADX INFO: renamed from: d */
        public final byte[] f23904d;

        /* JADX INFO: renamed from: e */
        public final int f23905e;

        /* JADX INFO: renamed from: f */
        public int f23906f;

        public AbstractBufferedEncoder(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f23904d = bArr;
            this.f23905e = bArr.length;
        }

        /* JADX INFO: renamed from: M */
        public final void m8465M(byte b2) {
            int i = this.f23906f;
            this.f23906f = i + 1;
            this.f23904d[i] = b2;
        }

        /* JADX INFO: renamed from: N */
        public final void m8466N(int i) {
            int i2 = this.f23906f;
            int i3 = i2 + 1;
            this.f23906f = i3;
            byte[] bArr = this.f23904d;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f23906f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f23906f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f23906f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        /* JADX INFO: renamed from: O */
        public final void m8467O(long j) {
            int i = this.f23906f;
            int i2 = i + 1;
            this.f23906f = i2;
            byte[] bArr = this.f23904d;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.f23906f = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.f23906f = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.f23906f = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.f23906f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f23906f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f23906f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f23906f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        /* JADX INFO: renamed from: P */
        public final void m8468P(int i, int i2) {
            m8469Q((i << 3) | i2);
        }

        /* JADX INFO: renamed from: Q */
        public final void m8469Q(int i) {
            boolean z2 = CodedOutputStream.f23902c;
            byte[] bArr = this.f23904d;
            if (z2) {
                while ((i & (-128)) != 0) {
                    int i2 = this.f23906f;
                    this.f23906f = i2 + 1;
                    UnsafeUtil.m8672k(bArr, i2, (byte) ((i & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    i >>>= 7;
                }
                int i3 = this.f23906f;
                this.f23906f = i3 + 1;
                UnsafeUtil.m8672k(bArr, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                int i4 = this.f23906f;
                this.f23906f = i4 + 1;
                bArr[i4] = (byte) ((i & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                i >>>= 7;
            }
            int i5 = this.f23906f;
            this.f23906f = i5 + 1;
            bArr[i5] = (byte) i;
        }

        /* JADX INFO: renamed from: R */
        public final void m8470R(long j) {
            boolean z2 = CodedOutputStream.f23902c;
            byte[] bArr = this.f23904d;
            if (z2) {
                while ((j & (-128)) != 0) {
                    int i = this.f23906f;
                    this.f23906f = i + 1;
                    UnsafeUtil.m8672k(bArr, i, (byte) ((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    j >>>= 7;
                }
                int i2 = this.f23906f;
                this.f23906f = i2 + 1;
                UnsafeUtil.m8672k(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                int i3 = this.f23906f;
                this.f23906f = i3 + 1;
                bArr[i3] = (byte) ((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                j >>>= 7;
            }
            int i4 = this.f23906f;
            this.f23906f = i4 + 1;
            bArr[i4] = (byte) j;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ArrayEncoder extends CodedOutputStream {

        /* JADX INFO: renamed from: d */
        public final byte[] f23907d;

        /* JADX INFO: renamed from: e */
        public final int f23908e;

        /* JADX INFO: renamed from: f */
        public int f23909f;

        public ArrayEncoder(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.f23907d = bArr;
            this.f23909f = 0;
            this.f23908e = i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: A */
        public final void mo8448A(int i) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f23907d;
                int i2 = this.f23909f;
                int i3 = i2 + 1;
                this.f23909f = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.f23909f = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.f23909f = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f23909f = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23909f), Integer.valueOf(this.f23908e), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: B */
        public final void mo8449B(long j) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f23907d;
                int i = this.f23909f;
                int i2 = i + 1;
                this.f23909f = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.f23909f = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.f23909f = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.f23909f = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.f23909f = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.f23909f = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.f23909f = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f23909f = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23909f), Integer.valueOf(this.f23908e), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: C */
        public final void mo8450C(int i) throws OutOfSpaceException {
            if (i >= 0) {
                mo8458K(i);
            } else {
                mo8459L(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D */
        public final void mo8451D(int i, MessageLite messageLite) throws OutOfSpaceException {
            mo8457J(i, 2);
            mo8453F(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E */
        public final void mo8452E(int i, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            mo8457J(i, 2);
            mo8458K(((AbstractMessageLite) messageLite).m8297e(schema));
            schema.mo8564e(messageLite, this.f23903a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F */
        public final void mo8453F(MessageLite messageLite) throws OutOfSpaceException {
            mo8458K(messageLite.getSerializedSize());
            messageLite.mo8508b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G */
        public final void mo8454G(int i, MessageLite messageLite) throws OutOfSpaceException {
            mo8457J(1, 3);
            writeUInt32(2, i);
            mo8451D(3, messageLite);
            mo8457J(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H */
        public final void mo8455H(int i, ByteString byteString) throws OutOfSpaceException {
            mo8457J(1, 3);
            writeUInt32(2, i);
            mo8460c(3, byteString);
            mo8457J(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I */
        public final void mo8456I(String str) throws OutOfSpaceException {
            int i = this.f23909f;
            try {
                int iM8444s = CodedOutputStream.m8444s(str.length() * 3);
                int iM8444s2 = CodedOutputStream.m8444s(str.length());
                byte[] bArr = this.f23907d;
                int i2 = this.f23908e;
                if (iM8444s2 != iM8444s) {
                    mo8458K(Utf8.m8704d(str));
                    int i3 = this.f23909f;
                    this.f23909f = Utf8.f24162a.mo8715d(str, bArr, i3, i2 - i3);
                    return;
                }
                int i4 = i + iM8444s2;
                this.f23909f = i4;
                int iMo8715d = Utf8.f24162a.mo8715d(str, bArr, i4, i2 - i4);
                this.f23909f = i;
                mo8458K((iMo8715d - i) - iM8444s2);
                this.f23909f = iMo8715d;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f23909f = i;
                m8461w(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J */
        public final void mo8457J(int i, int i2) throws OutOfSpaceException {
            mo8458K((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: K */
        public final void mo8458K(int i) throws OutOfSpaceException {
            byte[] bArr = this.f23907d;
            boolean z2 = CodedOutputStream.f23902c;
            int i2 = this.f23908e;
            if (z2 && !Android.m8304a()) {
                int i3 = this.f23909f;
                if (i2 - i3 >= 5) {
                    if ((i & (-128)) == 0) {
                        this.f23909f = i3 + 1;
                        UnsafeUtil.m8672k(bArr, i3, (byte) i);
                        return;
                    }
                    this.f23909f = i3 + 1;
                    UnsafeUtil.m8672k(bArr, i3, (byte) (i | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    int i4 = i >>> 7;
                    if ((i4 & (-128)) == 0) {
                        int i5 = this.f23909f;
                        this.f23909f = i5 + 1;
                        UnsafeUtil.m8672k(bArr, i5, (byte) i4);
                        return;
                    }
                    int i6 = this.f23909f;
                    this.f23909f = i6 + 1;
                    UnsafeUtil.m8672k(bArr, i6, (byte) (i4 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    int i7 = i >>> 14;
                    if ((i7 & (-128)) == 0) {
                        int i8 = this.f23909f;
                        this.f23909f = i8 + 1;
                        UnsafeUtil.m8672k(bArr, i8, (byte) i7);
                        return;
                    }
                    int i9 = this.f23909f;
                    this.f23909f = i9 + 1;
                    UnsafeUtil.m8672k(bArr, i9, (byte) (i7 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    int i10 = i >>> 21;
                    if ((i10 & (-128)) == 0) {
                        int i11 = this.f23909f;
                        this.f23909f = i11 + 1;
                        UnsafeUtil.m8672k(bArr, i11, (byte) i10);
                        return;
                    } else {
                        int i12 = this.f23909f;
                        this.f23909f = i12 + 1;
                        UnsafeUtil.m8672k(bArr, i12, (byte) (i10 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                        int i13 = this.f23909f;
                        this.f23909f = i13 + 1;
                        UnsafeUtil.m8672k(bArr, i13, (byte) (i >>> 28));
                        return;
                    }
                }
            }
            while ((i & (-128)) != 0) {
                try {
                    int i14 = this.f23909f;
                    this.f23909f = i14 + 1;
                    bArr[i14] = (byte) ((i & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23909f), Integer.valueOf(i2), 1), e);
                }
            }
            int i15 = this.f23909f;
            this.f23909f = i15 + 1;
            bArr[i15] = (byte) i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: L */
        public final void mo8459L(long j) throws OutOfSpaceException {
            byte[] bArr = this.f23907d;
            boolean z2 = CodedOutputStream.f23902c;
            int i = this.f23908e;
            if (z2 && i - this.f23909f >= 10) {
                while ((j & (-128)) != 0) {
                    int i2 = this.f23909f;
                    this.f23909f = i2 + 1;
                    UnsafeUtil.m8672k(bArr, i2, (byte) ((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    j >>>= 7;
                }
                int i3 = this.f23909f;
                this.f23909f = i3 + 1;
                UnsafeUtil.m8672k(bArr, i3, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i4 = this.f23909f;
                    this.f23909f = i4 + 1;
                    bArr[i4] = (byte) ((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23909f), Integer.valueOf(i), 1), e);
                }
            }
            int i5 = this.f23909f;
            this.f23909f = i5 + 1;
            bArr[i5] = (byte) j;
        }

        /* JADX INFO: renamed from: M */
        public final void m8471M(byte[] bArr, int i, int i2) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i, this.f23907d, this.f23909f, i2);
                this.f23909f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23909f), Integer.valueOf(this.f23908e), Integer.valueOf(i2)), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: c */
        public final void mo8460c(int i, ByteString byteString) throws OutOfSpaceException {
            mo8457J(i, 2);
            mo8464z(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        /* JADX INFO: renamed from: g */
        public final void mo8339g(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f23907d, this.f23909f, iRemaining);
                this.f23909f += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23909f), Integer.valueOf(this.f23908e), Integer.valueOf(iRemaining)), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        /* JADX INFO: renamed from: h */
        public final void mo8340h(byte[] bArr, int i, int i2) throws OutOfSpaceException {
            m8471M(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z2) throws OutOfSpaceException {
            mo8457J(i, 0);
            mo8462x(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) throws OutOfSpaceException {
            mo8457J(i, 5);
            mo8448A(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) throws OutOfSpaceException {
            mo8457J(i, 1);
            mo8449B(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) throws OutOfSpaceException {
            mo8457J(i, 0);
            mo8450C(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, String str) throws OutOfSpaceException {
            mo8457J(i, 2);
            mo8456I(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) throws OutOfSpaceException {
            mo8457J(i, 0);
            mo8458K(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) throws OutOfSpaceException {
            mo8457J(i, 0);
            mo8459L(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x */
        public final void mo8462x(byte b2) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f23907d;
                int i = this.f23909f;
                this.f23909f = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23909f), Integer.valueOf(this.f23908e), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: y */
        public final void mo8463y(int i, byte[] bArr) throws OutOfSpaceException {
            mo8458K(i);
            m8471M(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: z */
        public final void mo8464z(ByteString byteString) throws OutOfSpaceException {
            mo8458K(byteString.size());
            byteString.mo8360r(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: A */
        public final void mo8448A(int i) {
            m8472S(4);
            m8466N(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: B */
        public final void mo8449B(long j) {
            m8472S(8);
            m8467O(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: C */
        public final void mo8450C(int i) {
            if (i >= 0) {
                mo8458K(i);
            } else {
                mo8459L(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D */
        public final void mo8451D(int i, MessageLite messageLite) {
            mo8457J(i, 2);
            mo8453F(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E */
        public final void mo8452E(int i, MessageLite messageLite, Schema schema) {
            mo8457J(i, 2);
            mo8458K(((AbstractMessageLite) messageLite).m8297e(schema));
            schema.mo8564e(messageLite, this.f23903a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F */
        public final void mo8453F(MessageLite messageLite) {
            mo8458K(messageLite.getSerializedSize());
            messageLite.mo8508b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G */
        public final void mo8454G(int i, MessageLite messageLite) {
            mo8457J(1, 3);
            writeUInt32(2, i);
            mo8451D(3, messageLite);
            mo8457J(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H */
        public final void mo8455H(int i, ByteString byteString) {
            mo8457J(1, 3);
            writeUInt32(2, i);
            mo8460c(3, byteString);
            mo8457J(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I */
        public final void mo8456I(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iM8444s = CodedOutputStream.m8444s(length);
            int i = iM8444s + length;
            int i2 = this.f23905e;
            if (i > i2) {
                mo8458K(Utf8.f24162a.mo8715d(str, new byte[length], 0, length));
                if (this.f23906f > 0) {
                    throw null;
                }
                throw null;
            }
            int i3 = this.f23906f;
            if (i > i2 - i3) {
                throw null;
            }
            try {
                int iM8444s2 = CodedOutputStream.m8444s(str.length());
                byte[] bArr = this.f23904d;
                if (iM8444s2 != iM8444s) {
                    int iM8704d = Utf8.m8704d(str);
                    m8469Q(iM8704d);
                    this.f23906f = Utf8.f24162a.mo8715d(str, bArr, this.f23906f, iM8704d);
                    return;
                }
                int i4 = i3 + iM8444s2;
                this.f23906f = i4;
                int iMo8715d = Utf8.f24162a.mo8715d(str, bArr, i4, i2 - i4);
                this.f23906f = i3;
                m8469Q((iMo8715d - i3) - iM8444s2);
                this.f23906f = iMo8715d;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f23906f = i3;
                m8461w(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J */
        public final void mo8457J(int i, int i2) {
            mo8458K((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: K */
        public final void mo8458K(int i) {
            m8472S(5);
            m8469Q(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: L */
        public final void mo8459L(long j) {
            m8472S(10);
            m8470R(j);
        }

        /* JADX INFO: renamed from: S */
        public final void m8472S(int i) {
            if (this.f23905e - this.f23906f < i) {
                throw null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: c */
        public final void mo8460c(int i, ByteString byteString) {
            mo8457J(i, 2);
            mo8464z(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        /* JADX INFO: renamed from: g */
        public final void mo8339g(ByteBuffer byteBuffer) {
            if (this.f23906f > 0) {
                throw null;
            }
            byteBuffer.remaining();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        /* JADX INFO: renamed from: h */
        public final void mo8340h(byte[] bArr, int i, int i2) {
            if (this.f23906f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z2) {
            m8472S(11);
            m8468P(i, 0);
            m8465M(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) {
            m8472S(14);
            m8468P(i, 5);
            m8466N(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) {
            m8472S(18);
            m8468P(i, 1);
            m8467O(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) {
            m8472S(20);
            m8468P(i, 0);
            if (i2 >= 0) {
                m8469Q(i2);
            } else {
                m8470R(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, String str) throws OutOfSpaceException {
            mo8457J(i, 2);
            mo8456I(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) {
            m8472S(20);
            m8468P(i, 0);
            m8469Q(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) {
            m8472S(20);
            m8468P(i, 0);
            m8470R(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x */
        public final void mo8462x(byte b2) {
            if (this.f23906f == this.f23905e) {
                throw null;
            }
            m8465M(b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: y */
        public final void mo8463y(int i, byte[] bArr) {
            mo8458K(i);
            if (this.f23906f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: z */
        public final void mo8464z(ByteString byteString) {
            mo8458K(byteString.size());
            byteString.mo8360r(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class HeapNioEncoder extends ArrayEncoder {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str));
        }

        public OutOfSpaceException(RuntimeException runtimeException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {

        /* JADX INFO: renamed from: g */
        public final OutputStream f23910g;

        public OutputStreamEncoder(OutputStream outputStream, int i) {
            super(i);
            this.f23910g = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: A */
        public final void mo8448A(int i) {
            m8474T(4);
            m8466N(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: B */
        public final void mo8449B(long j) {
            m8474T(8);
            m8467O(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: C */
        public final void mo8450C(int i) {
            if (i >= 0) {
                mo8458K(i);
            } else {
                mo8459L(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D */
        public final void mo8451D(int i, MessageLite messageLite) {
            mo8457J(i, 2);
            mo8453F(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E */
        public final void mo8452E(int i, MessageLite messageLite, Schema schema) {
            mo8457J(i, 2);
            mo8458K(((AbstractMessageLite) messageLite).m8297e(schema));
            schema.mo8564e(messageLite, this.f23903a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F */
        public final void mo8453F(MessageLite messageLite) {
            mo8458K(messageLite.getSerializedSize());
            messageLite.mo8508b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G */
        public final void mo8454G(int i, MessageLite messageLite) {
            mo8457J(1, 3);
            writeUInt32(2, i);
            mo8451D(3, messageLite);
            mo8457J(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H */
        public final void mo8455H(int i, ByteString byteString) {
            mo8457J(1, 3);
            writeUInt32(2, i);
            mo8460c(3, byteString);
            mo8457J(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I */
        public final void mo8456I(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iM8444s = CodedOutputStream.m8444s(length);
                int i = iM8444s + length;
                int i2 = this.f23905e;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iMo8715d = Utf8.f24162a.mo8715d(str, bArr, 0, length);
                    mo8458K(iMo8715d);
                    m8475U(bArr, 0, iMo8715d);
                    return;
                }
                if (i > i2 - this.f23906f) {
                    m8473S();
                }
                int iM8444s2 = CodedOutputStream.m8444s(str.length());
                int i3 = this.f23906f;
                byte[] bArr2 = this.f23904d;
                try {
                    try {
                        if (iM8444s2 == iM8444s) {
                            int i4 = i3 + iM8444s2;
                            this.f23906f = i4;
                            int iMo8715d2 = Utf8.f24162a.mo8715d(str, bArr2, i4, i2 - i4);
                            this.f23906f = i3;
                            m8469Q((iMo8715d2 - i3) - iM8444s2);
                            this.f23906f = iMo8715d2;
                        } else {
                            int iM8704d = Utf8.m8704d(str);
                            m8469Q(iM8704d);
                            this.f23906f = Utf8.f24162a.mo8715d(str, bArr2, this.f23906f, iM8704d);
                        }
                    } catch (Utf8.UnpairedSurrogateException e) {
                        this.f23906f = i3;
                        throw e;
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                m8461w(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J */
        public final void mo8457J(int i, int i2) {
            mo8458K((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: K */
        public final void mo8458K(int i) {
            m8474T(5);
            m8469Q(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: L */
        public final void mo8459L(long j) {
            m8474T(10);
            m8470R(j);
        }

        /* JADX INFO: renamed from: S */
        public final void m8473S() {
            this.f23910g.write(this.f23904d, 0, this.f23906f);
            this.f23906f = 0;
        }

        /* JADX INFO: renamed from: T */
        public final void m8474T(int i) {
            if (this.f23905e - this.f23906f < i) {
                m8473S();
            }
        }

        /* JADX INFO: renamed from: U */
        public final void m8475U(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f23906f;
            int i4 = this.f23905e;
            int i5 = i4 - i3;
            byte[] bArr2 = this.f23904d;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f23906f += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f23906f = i4;
            m8473S();
            if (i7 > i4) {
                this.f23910g.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.f23906f = i7;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: c */
        public final void mo8460c(int i, ByteString byteString) {
            mo8457J(i, 2);
            mo8464z(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        /* JADX INFO: renamed from: g */
        public final void mo8339g(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.f23906f;
            int i2 = this.f23905e;
            int i3 = i2 - i;
            byte[] bArr = this.f23904d;
            if (i3 >= iRemaining) {
                byteBuffer.get(bArr, i, iRemaining);
                this.f23906f += iRemaining;
                return;
            }
            byteBuffer.get(bArr, i, i3);
            int i4 = iRemaining - i3;
            this.f23906f = i2;
            m8473S();
            while (i4 > i2) {
                byteBuffer.get(bArr, 0, i2);
                this.f23910g.write(bArr, 0, i2);
                i4 -= i2;
            }
            byteBuffer.get(bArr, 0, i4);
            this.f23906f = i4;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        /* JADX INFO: renamed from: h */
        public final void mo8340h(byte[] bArr, int i, int i2) throws IOException {
            m8475U(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z2) {
            m8474T(11);
            m8468P(i, 0);
            m8465M(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) {
            m8474T(14);
            m8468P(i, 5);
            m8466N(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) {
            m8474T(18);
            m8468P(i, 1);
            m8467O(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) {
            m8474T(20);
            m8468P(i, 0);
            if (i2 >= 0) {
                m8469Q(i2);
            } else {
                m8470R(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, String str) throws IOException {
            mo8457J(i, 2);
            mo8456I(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) {
            m8474T(20);
            m8468P(i, 0);
            m8469Q(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) {
            m8474T(20);
            m8468P(i, 0);
            m8470R(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x */
        public final void mo8462x(byte b2) {
            if (this.f23906f == this.f23905e) {
                m8473S();
            }
            m8465M(b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: y */
        public final void mo8463y(int i, byte[] bArr) throws IOException {
            mo8458K(i);
            m8475U(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: z */
        public final void mo8464z(ByteString byteString) {
            mo8458K(byteString.size());
            byteString.mo8360r(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: A */
        public final void mo8448A(int i) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: B */
        public final void mo8449B(long j) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: C */
        public final void mo8450C(int i) {
            if (i >= 0) {
                mo8458K(i);
                throw null;
            }
            mo8459L(i);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D */
        public final void mo8451D(int i, MessageLite messageLite) {
            mo8457J(i, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E */
        public final void mo8452E(int i, MessageLite messageLite, Schema schema) {
            mo8457J(i, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F */
        public final void mo8453F(MessageLite messageLite) {
            mo8458K(messageLite.getSerializedSize());
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G */
        public final void mo8454G(int i, MessageLite messageLite) {
            mo8457J(1, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H */
        public final void mo8455H(int i, ByteString byteString) {
            mo8457J(1, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I */
        public final void mo8456I(String str) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J */
        public final void mo8457J(int i, int i2) {
            mo8458K((i << 3) | i2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: K */
        public final void mo8458K(int i) {
            if ((i & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: L */
        public final void mo8459L(long j) {
            if ((j & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: c */
        public final void mo8460c(int i, ByteString byteString) {
            mo8457J(i, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        /* JADX INFO: renamed from: g */
        public final void mo8339g(ByteBuffer byteBuffer) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        /* JADX INFO: renamed from: h */
        public final void mo8340h(byte[] bArr, int i, int i2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z2) {
            mo8457J(i, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) {
            mo8457J(i, 5);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) {
            mo8457J(i, 1);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) {
            mo8457J(i, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, String str) {
            mo8457J(i, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) {
            mo8457J(i, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) {
            mo8457J(i, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x */
        public final void mo8462x(byte b2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: y */
        public final void mo8463y(int i, byte[] bArr) {
            mo8458K(i);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: z */
        public final void mo8464z(ByteString byteString) {
            mo8458K(byteString.size());
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {

        /* JADX INFO: renamed from: d */
        public long f23911d;

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: A */
        public final void mo8448A(int i) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: B */
        public final void mo8449B(long j) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: C */
        public final void mo8450C(int i) throws OutOfSpaceException {
            if (i >= 0) {
                mo8458K(i);
            } else {
                mo8459L(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D */
        public final void mo8451D(int i, MessageLite messageLite) throws OutOfSpaceException {
            mo8457J(i, 2);
            mo8453F(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E */
        public final void mo8452E(int i, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            mo8457J(i, 2);
            mo8458K(((AbstractMessageLite) messageLite).m8297e(schema));
            schema.mo8564e(messageLite, this.f23903a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F */
        public final void mo8453F(MessageLite messageLite) throws OutOfSpaceException {
            mo8458K(messageLite.getSerializedSize());
            messageLite.mo8508b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G */
        public final void mo8454G(int i, MessageLite messageLite) throws OutOfSpaceException {
            mo8457J(1, 3);
            writeUInt32(2, i);
            mo8451D(3, messageLite);
            mo8457J(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H */
        public final void mo8455H(int i, ByteString byteString) throws OutOfSpaceException {
            mo8457J(1, 3);
            writeUInt32(2, i);
            mo8460c(3, byteString);
            mo8457J(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I */
        public final void mo8456I(String str) throws OutOfSpaceException {
            long j = this.f23911d;
            try {
                if (CodedOutputStream.m8444s(str.length()) == CodedOutputStream.m8444s(str.length() * 3)) {
                    throw null;
                }
                mo8458K(Utf8.m8704d(str));
                throw null;
            } catch (Utf8.UnpairedSurrogateException unused) {
                this.f23911d = j;
                throw null;
            } catch (IllegalArgumentException e) {
                throw new OutOfSpaceException(e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J */
        public final void mo8457J(int i, int i2) throws OutOfSpaceException {
            mo8458K((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: K */
        public final void mo8458K(int i) throws OutOfSpaceException {
            if (this.f23911d <= 0) {
                while ((i & (-128)) != 0) {
                    long j = this.f23911d;
                    this.f23911d = j + 1;
                    UnsafeUtil.m8671j(j, (byte) ((i & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    i >>>= 7;
                }
                long j2 = this.f23911d;
                this.f23911d = 1 + j2;
                UnsafeUtil.m8671j(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.f23911d;
                if (j3 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f23911d), 0L, 1));
                }
                if ((i & (-128)) == 0) {
                    this.f23911d = 1 + j3;
                    UnsafeUtil.m8671j(j3, (byte) i);
                    return;
                } else {
                    this.f23911d = j3 + 1;
                    UnsafeUtil.m8671j(j3, (byte) ((i & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    i >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: L */
        public final void mo8459L(long j) throws OutOfSpaceException {
            if (this.f23911d <= 0) {
                while ((j & (-128)) != 0) {
                    long j2 = this.f23911d;
                    this.f23911d = j2 + 1;
                    UnsafeUtil.m8671j(j2, (byte) ((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    j >>>= 7;
                }
                long j3 = this.f23911d;
                this.f23911d = 1 + j3;
                UnsafeUtil.m8671j(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.f23911d;
                if (j4 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f23911d), 0L, 1));
                }
                if ((j & (-128)) == 0) {
                    this.f23911d = 1 + j4;
                    UnsafeUtil.m8671j(j4, (byte) j);
                    return;
                } else {
                    this.f23911d = j4 + 1;
                    UnsafeUtil.m8671j(j4, (byte) ((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    j >>>= 7;
                }
            }
        }

        /* JADX INFO: renamed from: M */
        public final void m8476M(byte[] bArr, int i, int i2) throws OutOfSpaceException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = 0 - j;
                long j3 = this.f23911d;
                if (j2 >= j3) {
                    UnsafeUtil.f24155d.mo8680d(bArr, i, j3, j);
                    this.f23911d += j;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f23911d), 0L, Integer.valueOf(i2)));
            }
            throw new NullPointerException("value");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: c */
        public final void mo8460c(int i, ByteString byteString) throws OutOfSpaceException {
            mo8457J(i, 2);
            mo8464z(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        /* JADX INFO: renamed from: g */
        public final void mo8339g(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                byteBuffer.remaining();
                throw null;
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        /* JADX INFO: renamed from: h */
        public final void mo8340h(byte[] bArr, int i, int i2) throws OutOfSpaceException {
            m8476M(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z2) throws OutOfSpaceException {
            mo8457J(i, 0);
            mo8462x(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) throws OutOfSpaceException {
            mo8457J(i, 5);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) throws OutOfSpaceException {
            mo8457J(i, 1);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) throws OutOfSpaceException {
            mo8457J(i, 0);
            mo8450C(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, String str) throws OutOfSpaceException {
            mo8457J(i, 2);
            mo8456I(str);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) throws OutOfSpaceException {
            mo8457J(i, 0);
            mo8458K(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) throws OutOfSpaceException {
            mo8457J(i, 0);
            mo8459L(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x */
        public final void mo8462x(byte b2) throws OutOfSpaceException {
            long j = this.f23911d;
            if (j >= 0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f23911d), 0L, 1));
            }
            this.f23911d = 1 + j;
            UnsafeUtil.m8671j(j, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: y */
        public final void mo8463y(int i, byte[] bArr) throws OutOfSpaceException {
            mo8458K(i);
            m8476M(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: z */
        public final void mo8464z(ByteString byteString) throws OutOfSpaceException {
            mo8458K(byteString.size());
            byteString.mo8360r(this);
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m8434i(int i, ByteString byteString) {
        return m8435j(byteString) + m8442q(i);
    }

    /* JADX INFO: renamed from: j */
    public static int m8435j(ByteString byteString) {
        int size = byteString.size();
        return m8444s(size) + size;
    }

    /* JADX INFO: renamed from: k */
    public static int m8436k(int i) {
        return m8442q(i) + 4;
    }

    /* JADX INFO: renamed from: l */
    public static int m8437l(int i) {
        return m8442q(i) + 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m8438m(int i, MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).m8297e(schema) + (m8442q(i) * 2);
    }

    /* JADX INFO: renamed from: n */
    public static int m8439n(int i) {
        if (i >= 0) {
            return m8444s(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: o */
    public static int m8440o(LazyFieldLite lazyFieldLite) {
        int size = lazyFieldLite.f24021b != null ? lazyFieldLite.f24021b.size() : lazyFieldLite.f24020a != null ? lazyFieldLite.f24020a.getSerializedSize() : 0;
        return m8444s(size) + size;
    }

    /* JADX INFO: renamed from: p */
    public static int m8441p(String str) {
        int length;
        try {
            length = Utf8.m8704d(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.f24003a).length;
        }
        return m8444s(length) + length;
    }

    /* JADX INFO: renamed from: q */
    public static int m8442q(int i) {
        return m8444s(i << 3);
    }

    /* JADX INFO: renamed from: r */
    public static int m8443r(int i, int i2) {
        return m8444s(i2) + m8442q(i);
    }

    /* JADX INFO: renamed from: s */
    public static int m8444s(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: t */
    public static int m8445t(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: u */
    public static int m8446u(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: v */
    public static long m8447v(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo8448A(int i);

    /* JADX INFO: renamed from: B */
    public abstract void mo8449B(long j);

    /* JADX INFO: renamed from: C */
    public abstract void mo8450C(int i);

    /* JADX INFO: renamed from: D */
    public abstract void mo8451D(int i, MessageLite messageLite);

    /* JADX INFO: renamed from: E */
    public abstract void mo8452E(int i, MessageLite messageLite, Schema schema);

    /* JADX INFO: renamed from: F */
    public abstract void mo8453F(MessageLite messageLite);

    /* JADX INFO: renamed from: G */
    public abstract void mo8454G(int i, MessageLite messageLite);

    /* JADX INFO: renamed from: H */
    public abstract void mo8455H(int i, ByteString byteString);

    /* JADX INFO: renamed from: I */
    public abstract void mo8456I(String str);

    /* JADX INFO: renamed from: J */
    public abstract void mo8457J(int i, int i2);

    /* JADX INFO: renamed from: K */
    public abstract void mo8458K(int i);

    /* JADX INFO: renamed from: L */
    public abstract void mo8459L(long j);

    /* JADX INFO: renamed from: c */
    public abstract void mo8460c(int i, ByteString byteString);

    /* JADX INFO: renamed from: w */
    public final void m8461w(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws OutOfSpaceException {
        f23901b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f24003a);
        try {
            mo8458K(bytes.length);
            mo8340h(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public abstract void writeBool(int i, boolean z2);

    public abstract void writeFixed32(int i, int i2);

    public abstract void writeFixed64(int i, long j);

    public abstract void writeInt32(int i, int i2);

    public abstract void writeString(int i, String str);

    public abstract void writeUInt32(int i, int i2);

    public abstract void writeUInt64(int i, long j);

    /* JADX INFO: renamed from: x */
    public abstract void mo8462x(byte b2);

    /* JADX INFO: renamed from: y */
    public abstract void mo8463y(int i, byte[] bArr);

    /* JADX INFO: renamed from: z */
    public abstract void mo8464z(ByteString byteString);
}
