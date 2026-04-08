package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
class VersionedParcelStream extends VersionedParcel {

    /* JADX INFO: renamed from: m */
    public static final Charset f32421m = Charset.forName("UTF-16");

    /* JADX INFO: renamed from: d */
    public final DataInputStream f32422d;

    /* JADX INFO: renamed from: e */
    public final DataOutputStream f32423e;

    /* JADX INFO: renamed from: f */
    public final DataInputStream f32424f;

    /* JADX INFO: renamed from: g */
    public DataOutputStream f32425g;

    /* JADX INFO: renamed from: h */
    public FieldBuffer f32426h;

    /* JADX INFO: renamed from: i */
    public boolean f32427i;

    /* JADX INFO: renamed from: j */
    public int f32428j;

    /* JADX INFO: renamed from: k */
    public int f32429k;

    /* JADX INFO: renamed from: l */
    public int f32430l;

    /* JADX INFO: compiled from: Proguard */
    public static class FieldBuffer {

        /* JADX INFO: renamed from: a */
        public final ByteArrayOutputStream f32432a;

        /* JADX INFO: renamed from: b */
        public final DataOutputStream f32433b;

        /* JADX INFO: renamed from: c */
        public final int f32434c;

        /* JADX INFO: renamed from: d */
        public final DataOutputStream f32435d;

        public FieldBuffer(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f32432a = byteArrayOutputStream;
            this.f32433b = new DataOutputStream(byteArrayOutputStream);
            this.f32434c = i;
            this.f32435d = dataOutputStream;
        }
    }

    public VersionedParcelStream(InputStream inputStream, OutputStream outputStream, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f32428j = 0;
        this.f32429k = -1;
        this.f32430l = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new C22401(inputStream)) : null;
        this.f32422d = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f32423e = dataOutputStream;
        this.f32424f = dataInputStream;
        this.f32425g = dataOutputStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: a */
    public final void mo12036a() {
        FieldBuffer fieldBuffer = this.f32426h;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.f32432a.size() != 0) {
                    FieldBuffer fieldBuffer2 = this.f32426h;
                    fieldBuffer2.f32433b.flush();
                    ByteArrayOutputStream byteArrayOutputStream = fieldBuffer2.f32432a;
                    int size = byteArrayOutputStream.size();
                    int i = fieldBuffer2.f32434c << 16;
                    int i2 = size >= 65535 ? 65535 : size;
                    DataOutputStream dataOutputStream = fieldBuffer2.f32435d;
                    dataOutputStream.writeInt(i | i2);
                    if (size >= 65535) {
                        dataOutputStream.writeInt(size);
                    }
                    byteArrayOutputStream.writeTo(dataOutputStream);
                }
                this.f32426h = null;
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: b */
    public final VersionedParcel mo12037b() {
        return new VersionedParcelStream(this.f32424f, this.f32425g, this.f32410a, this.f32411b, this.f32412c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: g */
    public final boolean mo12042g() {
        try {
            return this.f32424f.readBoolean();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: h */
    public final byte[] mo12043h() {
        DataInputStream dataInputStream = this.f32424f;
        try {
            int i = dataInputStream.readInt();
            if (i <= 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            dataInputStream.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: i */
    public final CharSequence mo12044i() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: j */
    public final boolean mo12045j(int i) {
        while (true) {
            try {
                int i2 = this.f32429k;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    break;
                }
                int i3 = this.f32428j;
                int i4 = this.f32430l;
                DataInputStream dataInputStream = this.f32422d;
                if (i3 < i4) {
                    dataInputStream.skip(i4 - i3);
                }
                this.f32430l = -1;
                int i5 = dataInputStream.readInt();
                this.f32428j = 0;
                int i6 = i5 & 65535;
                if (i6 == 65535) {
                    i6 = dataInputStream.readInt();
                }
                this.f32429k = (i5 >> 16) & 65535;
                this.f32430l = i6;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: k */
    public final int mo12046k() {
        try {
            return this.f32424f.readInt();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: l */
    public final Parcelable mo12047l() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: m */
    public final String mo12048m() {
        DataInputStream dataInputStream = this.f32424f;
        try {
            int i = dataInputStream.readInt();
            if (i <= 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            dataInputStream.readFully(bArr);
            return new String(bArr, f32421m);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: o */
    public final void mo12050o(int i) {
        mo12036a();
        FieldBuffer fieldBuffer = new FieldBuffer(i, this.f32423e);
        this.f32426h = fieldBuffer;
        this.f32425g = fieldBuffer.f32433b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: p */
    public final void mo12051p(boolean z2, boolean z3) {
        if (!z2) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f32427i = z3;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: q */
    public final void mo12052q(boolean z2) {
        try {
            this.f32425g.writeBoolean(z2);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: r */
    public final void mo12053r(byte[] bArr) {
        try {
            if (bArr == null) {
                this.f32425g.writeInt(-1);
            } else {
                this.f32425g.writeInt(bArr.length);
                this.f32425g.write(bArr);
            }
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: s */
    public final void mo12054s(CharSequence charSequence) {
        if (!this.f32427i) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: t */
    public final void mo12055t(int i) {
        try {
            this.f32425g.writeInt(i);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: u */
    public final void mo12056u(Parcelable parcelable) {
        if (!this.f32427i) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: v */
    public final void mo12057v(String str) {
        try {
            if (str == null) {
                this.f32425g.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(f32421m);
            this.f32425g.writeInt(bytes.length);
            this.f32425g.write(bytes);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* JADX INFO: renamed from: androidx.versionedparcelable.VersionedParcelStream$1 */
    /* JADX INFO: compiled from: Proguard */
    class C22401 extends FilterInputStream {
        public C22401(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
            int i = versionedParcelStream.f32430l;
            if (i != -1 && versionedParcelStream.f32428j >= i) {
                throw new IOException();
            }
            int i2 = super.read();
            versionedParcelStream.f32428j++;
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j) throws IOException {
            VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
            int i = versionedParcelStream.f32430l;
            if (i != -1 && versionedParcelStream.f32428j >= i) {
                throw new IOException();
            }
            long jSkip = super.skip(j);
            if (jSkip > 0) {
                versionedParcelStream.f32428j += (int) jSkip;
            }
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
            int i3 = versionedParcelStream.f32430l;
            if (i3 != -1 && versionedParcelStream.f32428j >= i3) {
                throw new IOException();
            }
            int i4 = super.read(bArr, i, i2);
            if (i4 > 0) {
                versionedParcelStream.f32428j += i4;
            }
            return i4;
        }
    }
}
