package androidx.emoji2.text.flatbuffer;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import me.jessyan.retrofiturlmanager.BuildConfig;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FlexBuffers {

    /* JADX INFO: renamed from: a */
    public static final ArrayReadWriteBuf f24355a;

    /* JADX INFO: compiled from: Proguard */
    public static class Blob extends Sized {

        /* JADX INFO: renamed from: e */
        public static final Blob f24356e = new Blob(FlexBuffers.f24355a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        /* JADX INFO: renamed from: a */
        public final StringBuilder mo8824a(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.f24360a.mo8819a(this.f24361b, this.f24369d));
            sb.append('\"');
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final String toString() {
            return this.f24360a.mo8819a(this.f24361b, this.f24369d);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FlexBufferException extends RuntimeException {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Key extends Object {

        /* JADX INFO: renamed from: d */
        public static final Key f24357d = new Key(FlexBuffers.f24355a, 0, 0);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        /* JADX INFO: renamed from: a */
        public final StringBuilder mo8824a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.f24361b == this.f24361b && key.f24362c == this.f24362c;
        }

        public final int hashCode() {
            return this.f24361b ^ this.f24362c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final String toString() {
            int i = this.f24361b;
            int i2 = i;
            while (true) {
                ReadBuf readBuf = this.f24360a;
                if (readBuf.get(i2) == 0) {
                    return readBuf.mo8819a(i, i2 - i);
                }
                i2++;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class KeyVector {

        /* JADX INFO: renamed from: a */
        public final TypedVector f24358a;

        public KeyVector(TypedVector typedVector) {
            this.f24358a = typedVector;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            int i = 0;
            while (true) {
                TypedVector typedVector = this.f24358a;
                int i2 = typedVector.f24369d;
                if (i >= i2) {
                    sb.append("]");
                    return sb.toString();
                }
                typedVector.mo8829b(i).m8828d(sb);
                if (i != i2 - 1) {
                    sb.append(", ");
                }
                i++;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Map extends Vector {

        /* JADX INFO: renamed from: f */
        public static final Map f24359f = new Map(FlexBuffers.f24355a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        /* JADX INFO: renamed from: a */
        public final StringBuilder mo8824a(StringBuilder sb) {
            Key key;
            sb.append("{ ");
            int i = this.f24362c;
            int i2 = this.f24361b;
            int i3 = i2 - (i * 3);
            ReadBuf readBuf = this.f24360a;
            KeyVector keyVector = new KeyVector(new TypedVector(readBuf, FlexBuffers.m8820a(readBuf, i3, i), (int) FlexBuffers.m8822c(readBuf, i3 + i, i), 4));
            Vector vector = new Vector(readBuf, i2, i);
            int i4 = 0;
            while (true) {
                int i5 = this.f24369d;
                if (i4 >= i5) {
                    sb.append(" }");
                    return sb;
                }
                sb.append('\"');
                TypedVector typedVector = keyVector.f24358a;
                if (i4 >= typedVector.f24369d) {
                    key = Key.f24357d;
                } else {
                    int i6 = typedVector.f24361b;
                    int i7 = typedVector.f24362c;
                    ReadBuf readBuf2 = typedVector.f24360a;
                    key = new Key(readBuf2, FlexBuffers.m8820a(readBuf2, (i4 * i7) + i6, i7), 1);
                }
                sb.append(key.toString());
                sb.append("\" : ");
                sb.append(vector.mo8829b(i4).toString());
                if (i4 != i5 - 1) {
                    sb.append(", ");
                }
                i4++;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Object {

        /* JADX INFO: renamed from: a */
        public final ReadBuf f24360a;

        /* JADX INFO: renamed from: b */
        public final int f24361b;

        /* JADX INFO: renamed from: c */
        public final int f24362c;

        public Object(ReadBuf readBuf, int i, int i2) {
            this.f24360a = readBuf;
            this.f24361b = i;
            this.f24362c = i2;
        }

        /* JADX INFO: renamed from: a */
        public abstract StringBuilder mo8824a(StringBuilder sb);

        public String toString() {
            return mo8824a(new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)).toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Reference {

        /* JADX INFO: renamed from: f */
        public static final Reference f24363f = new Reference(FlexBuffers.f24355a, 0, 1, 0);

        /* JADX INFO: renamed from: a */
        public final ReadBuf f24364a;

        /* JADX INFO: renamed from: b */
        public final int f24365b;

        /* JADX INFO: renamed from: c */
        public final int f24366c;

        /* JADX INFO: renamed from: d */
        public final int f24367d;

        /* JADX INFO: renamed from: e */
        public final int f24368e;

        public Reference(ReadBuf readBuf, int i, int i2, int i3) {
            this(readBuf, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        /* JADX INFO: renamed from: a */
        public final String m8825a() {
            int i = this.f24368e;
            boolean z2 = i == 5;
            int i2 = this.f24367d;
            int i3 = this.f24365b;
            ReadBuf readBuf = this.f24364a;
            if (z2) {
                int iM8820a = FlexBuffers.m8820a(readBuf, i3, this.f24366c);
                return readBuf.mo8819a(iM8820a, (int) FlexBuffers.m8823d(readBuf, iM8820a - i2, i2));
            }
            if (i != 4) {
                return "";
            }
            int iM8820a2 = FlexBuffers.m8820a(readBuf, i3, i2);
            int i4 = iM8820a2;
            while (readBuf.get(i4) != 0) {
                i4++;
            }
            return readBuf.mo8819a(iM8820a2, i4 - iM8820a2);
        }

        /* JADX INFO: renamed from: b */
        public final long m8826b() {
            int i = this.f24365b;
            ReadBuf readBuf = this.f24364a;
            int i2 = this.f24366c;
            int i3 = this.f24368e;
            if (i3 == 2) {
                return FlexBuffers.m8823d(readBuf, i, i2);
            }
            if (i3 == 1) {
                return FlexBuffers.m8822c(readBuf, i, i2);
            }
            if (i3 == 3) {
                return (long) FlexBuffers.m8821b(readBuf, i, i2);
            }
            if (i3 == 10) {
                return m8827c().f24369d;
            }
            if (i3 == 26) {
                return (int) FlexBuffers.m8822c(readBuf, i, i2);
            }
            if (i3 == 5) {
                return Long.parseLong(m8825a());
            }
            int i4 = this.f24367d;
            if (i3 == 6) {
                return FlexBuffers.m8822c(readBuf, FlexBuffers.m8820a(readBuf, i, i2), i4);
            }
            if (i3 == 7) {
                return FlexBuffers.m8823d(readBuf, FlexBuffers.m8820a(readBuf, i, i2), i4);
            }
            if (i3 != 8) {
                return 0L;
            }
            return (long) FlexBuffers.m8821b(readBuf, FlexBuffers.m8820a(readBuf, i, i2), i2);
        }

        /* JADX INFO: renamed from: c */
        public final Vector m8827c() {
            int i = this.f24368e;
            int i2 = this.f24367d;
            int i3 = this.f24366c;
            int i4 = this.f24365b;
            ReadBuf readBuf = this.f24364a;
            return (i == 10 || i == 9) ? new Vector(readBuf, FlexBuffers.m8820a(readBuf, i4, i3), i2) : i == 15 ? new TypedVector(readBuf, FlexBuffers.m8820a(readBuf, i4, i3), i2, 4) : ((i < 11 || i > 15) && i != 36) ? Vector.f24371e : new TypedVector(readBuf, FlexBuffers.m8820a(readBuf, i4, i3), i2, i - 10);
        }

        /* JADX INFO: renamed from: d */
        public final StringBuilder m8828d(StringBuilder sb) {
            long jM8823d;
            double dM8821b;
            int iM8822c;
            long jM8822c;
            int i;
            double dM8821b2;
            long jM8823d2;
            int i2 = this.f24368e;
            if (i2 != 36) {
                int i3 = this.f24367d;
                int i4 = this.f24366c;
                int i5 = this.f24365b;
                ReadBuf readBuf = this.f24364a;
                boolean z2 = true;
                switch (i2) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        if (i2 == 1) {
                            jM8823d = FlexBuffers.m8822c(readBuf, i5, i4);
                        } else if (i2 != 2) {
                            if (i2 == 3) {
                                dM8821b = FlexBuffers.m8821b(readBuf, i5, i4);
                            } else if (i2 == 5) {
                                try {
                                    jM8823d = Long.parseLong(m8825a());
                                } catch (NumberFormatException unused) {
                                    jM8823d = 0;
                                }
                                break;
                            } else if (i2 == 6) {
                                jM8823d = FlexBuffers.m8822c(readBuf, FlexBuffers.m8820a(readBuf, i5, i4), i3);
                            } else if (i2 == 7) {
                                jM8823d = FlexBuffers.m8823d(readBuf, FlexBuffers.m8820a(readBuf, i5, i4), i4);
                            } else if (i2 != 8) {
                                if (i2 != 10) {
                                    if (i2 == 26) {
                                        iM8822c = (int) FlexBuffers.m8822c(readBuf, i5, i4);
                                    }
                                    jM8823d = 0;
                                } else {
                                    iM8822c = m8827c().f24369d;
                                }
                                jM8823d = iM8822c;
                            } else {
                                dM8821b = FlexBuffers.m8821b(readBuf, FlexBuffers.m8820a(readBuf, i5, i4), i3);
                            }
                            jM8823d = (long) dM8821b;
                        } else {
                            jM8823d = FlexBuffers.m8823d(readBuf, i5, i4);
                        }
                        sb.append(jM8823d);
                        return sb;
                    case 2:
                    case 7:
                        sb.append(m8826b());
                        return sb;
                    case 3:
                    case 8:
                        if (i2 == 3) {
                            dM8821b2 = FlexBuffers.m8821b(readBuf, i5, i4);
                        } else {
                            if (i2 == 1) {
                                jM8822c = FlexBuffers.m8822c(readBuf, i5, i4);
                            } else if (i2 == 2) {
                                jM8823d2 = FlexBuffers.m8823d(readBuf, i5, i4);
                                dM8821b2 = jM8823d2;
                            } else if (i2 == 5) {
                                dM8821b2 = Double.parseDouble(m8825a());
                            } else if (i2 == 6) {
                                jM8822c = FlexBuffers.m8822c(readBuf, FlexBuffers.m8820a(readBuf, i5, i4), i3);
                            } else if (i2 == 7) {
                                jM8823d2 = FlexBuffers.m8823d(readBuf, FlexBuffers.m8820a(readBuf, i5, i4), i3);
                                dM8821b2 = jM8823d2;
                            } else if (i2 == 8) {
                                dM8821b2 = FlexBuffers.m8821b(readBuf, FlexBuffers.m8820a(readBuf, i5, i4), i3);
                            } else if (i2 != 10) {
                                if (i2 != 26) {
                                    dM8821b2 = 0.0d;
                                }
                                jM8823d2 = FlexBuffers.m8823d(readBuf, i5, i4);
                                dM8821b2 = jM8823d2;
                            } else {
                                i = m8827c().f24369d;
                                dM8821b2 = i;
                            }
                            i = (int) jM8822c;
                            dM8821b2 = i;
                        }
                        sb.append(dM8821b2);
                        return sb;
                    case 4:
                        Key key = i2 == 4 ? new Key(readBuf, FlexBuffers.m8820a(readBuf, i5, i4), i3) : Key.f24357d;
                        sb.append('\"');
                        key.mo8824a(sb);
                        sb.append('\"');
                        return sb;
                    case 5:
                        sb.append('\"');
                        sb.append(m8825a());
                        sb.append('\"');
                        return sb;
                    case 9:
                        (i2 == 9 ? new Map(readBuf, FlexBuffers.m8820a(readBuf, i5, i4), i3) : Map.f24359f).mo8824a(sb);
                        return sb;
                    case 10:
                        m8827c().mo8824a(sb);
                        return sb;
                    case 11:
                    case TYPE_BYTES_VALUE:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        throw new FlexBufferException(AbstractC0000a.m9f(i2, "not_implemented:"));
                    case BuildConfig.VERSION_CODE /* 25 */:
                        ((i2 == 25 || i2 == 5) ? new Blob(readBuf, FlexBuffers.m8820a(readBuf, i5, i4), i3) : Blob.f24356e).mo8824a(sb);
                        return sb;
                    case 26:
                        if (i2 != 26 ? m8826b() == 0 : readBuf.get(i5) == 0) {
                            z2 = false;
                        }
                        sb.append(z2);
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(m8827c());
            return sb;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            m8828d(sb);
            return sb.toString();
        }

        public Reference(ReadBuf readBuf, int i, int i2, int i3, int i4) {
            this.f24364a = readBuf;
            this.f24365b = i;
            this.f24366c = i2;
            this.f24367d = i3;
            this.f24368e = i4;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Sized extends Object {

        /* JADX INFO: renamed from: d */
        public final int f24369d;

        public Sized(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
            this.f24369d = (int) FlexBuffers.m8822c(readBuf, i - i2, i2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class TypedVector extends Vector {

        /* JADX INFO: renamed from: f */
        public final int f24370f;

        static {
            new TypedVector(FlexBuffers.f24355a, 1, 1, 1);
        }

        public TypedVector(ReadBuf readBuf, int i, int i2, int i3) {
            super(readBuf, i, i2);
            this.f24370f = i3;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        /* JADX INFO: renamed from: b */
        public final Reference mo8829b(int i) {
            if (i >= this.f24369d) {
                return Reference.f24363f;
            }
            return new Reference(this.f24360a, (i * this.f24362c) + this.f24361b, this.f24362c, 1, this.f24370f);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Unsigned {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Vector extends Sized {

        /* JADX INFO: renamed from: e */
        public static final Vector f24371e = new Vector(FlexBuffers.f24355a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        /* JADX INFO: renamed from: a */
        public StringBuilder mo8824a(StringBuilder sb) {
            sb.append("[ ");
            int i = 0;
            while (true) {
                int i2 = this.f24369d;
                if (i >= i2) {
                    sb.append(" ]");
                    return sb;
                }
                mo8829b(i).m8828d(sb);
                if (i != i2 - 1) {
                    sb.append(", ");
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: b */
        public Reference mo8829b(int i) {
            long j = this.f24369d;
            long j2 = i;
            if (j2 >= j) {
                return Reference.f24363f;
            }
            int i2 = this.f24361b;
            int i3 = this.f24362c;
            long j3 = j * ((long) i3);
            ReadBuf readBuf = this.f24360a;
            return new Reference(readBuf, (i * i3) + i2, i3, readBuf.get((int) (j3 + ((long) i2) + j2)) & UnsignedBytes.MAX_VALUE);
        }
    }

    static {
        ArrayReadWriteBuf arrayReadWriteBuf = new ArrayReadWriteBuf();
        arrayReadWriteBuf.f24354a = new byte[]{0};
        f24355a = arrayReadWriteBuf;
    }

    /* JADX INFO: renamed from: a */
    public static int m8820a(ReadBuf readBuf, int i, int i2) {
        return (int) (((long) i) - m8823d(readBuf, i, i2));
    }

    /* JADX INFO: renamed from: b */
    public static double m8821b(ReadBuf readBuf, int i, int i2) {
        if (i2 == 4) {
            return readBuf.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i);
    }

    /* JADX INFO: renamed from: c */
    public static long m8822c(ReadBuf readBuf, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = readBuf.get(i);
        } else if (i2 == 2) {
            i3 = readBuf.getShort(i);
        } else {
            if (i2 != 4) {
                if (i2 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i);
            }
            i3 = readBuf.getInt(i);
        }
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public static long m8823d(ReadBuf readBuf, int i, int i2) {
        if (i2 == 1) {
            return readBuf.get(i) & UnsignedBytes.MAX_VALUE;
        }
        if (i2 == 2) {
            return readBuf.getShort(i) & 65535;
        }
        if (i2 == 4) {
            return ((long) readBuf.getInt(i)) & 4294967295L;
        }
        if (i2 != 8) {
            return -1L;
        }
        return readBuf.getLong(i);
    }
}
