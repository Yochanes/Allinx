package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.AbstractC0455a;
import com.google.common.base.Ascii;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ExifInterface {

    /* JADX INFO: renamed from: H */
    public static final String[] f24409H;

    /* JADX INFO: renamed from: I */
    public static final int[] f24410I;

    /* JADX INFO: renamed from: J */
    public static final byte[] f24411J;

    /* JADX INFO: renamed from: K */
    public static final ExifTag f24412K;

    /* JADX INFO: renamed from: L */
    public static final ExifTag[][] f24413L;

    /* JADX INFO: renamed from: M */
    public static final ExifTag[] f24414M;

    /* JADX INFO: renamed from: N */
    public static final HashMap[] f24415N;

    /* JADX INFO: renamed from: O */
    public static final HashMap[] f24416O;

    /* JADX INFO: renamed from: P */
    public static final Set f24417P;

    /* JADX INFO: renamed from: Q */
    public static final HashMap f24418Q;

    /* JADX INFO: renamed from: R */
    public static final Charset f24419R;

    /* JADX INFO: renamed from: S */
    public static final byte[] f24420S;

    /* JADX INFO: renamed from: T */
    public static final byte[] f24421T;

    /* JADX INFO: renamed from: U */
    public static final Pattern f24422U;

    /* JADX INFO: renamed from: V */
    public static final Pattern f24423V;

    /* JADX INFO: renamed from: W */
    public static final Pattern f24424W;

    /* JADX INFO: renamed from: a */
    public final String f24436a;

    /* JADX INFO: renamed from: b */
    public final FileDescriptor f24437b;

    /* JADX INFO: renamed from: c */
    public final AssetManager.AssetInputStream f24438c;

    /* JADX INFO: renamed from: d */
    public int f24439d;

    /* JADX INFO: renamed from: e */
    public final boolean f24440e;

    /* JADX INFO: renamed from: f */
    public final HashMap[] f24441f;

    /* JADX INFO: renamed from: g */
    public final HashSet f24442g;

    /* JADX INFO: renamed from: h */
    public ByteOrder f24443h;

    /* JADX INFO: renamed from: i */
    public boolean f24444i;

    /* JADX INFO: renamed from: j */
    public boolean f24445j;

    /* JADX INFO: renamed from: k */
    public int f24446k;

    /* JADX INFO: renamed from: l */
    public int f24447l;

    /* JADX INFO: renamed from: m */
    public int f24448m;

    /* JADX INFO: renamed from: n */
    public int f24449n;

    /* JADX INFO: renamed from: o */
    public ExifAttribute f24450o;

    /* JADX INFO: renamed from: p */
    public static final boolean f24425p = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: q */
    public static final List f24426q = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: r */
    public static final List f24427r = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: s */
    public static final int[] f24428s = {8, 8, 8};

    /* JADX INFO: renamed from: t */
    public static final int[] f24429t = {8};

    /* JADX INFO: renamed from: u */
    public static final byte[] f24430u = {-1, -40, -1};

    /* JADX INFO: renamed from: v */
    public static final byte[] f24431v = {102, 116, 121, 112};

    /* JADX INFO: renamed from: w */
    public static final byte[] f24432w = {109, 105, 102, 49};

    /* JADX INFO: renamed from: x */
    public static final byte[] f24433x = {104, 101, 105, 99};

    /* JADX INFO: renamed from: y */
    public static final byte[] f24434y = {97, 118, 105, 102};

    /* JADX INFO: renamed from: z */
    public static final byte[] f24435z = {97, 118, 105, 115};

    /* JADX INFO: renamed from: A */
    public static final byte[] f24402A = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: B */
    public static final byte[] f24403B = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: C */
    public static final byte[] f24404C = {-119, 80, 78, 71, Ascii.f42534CR, 10, Ascii.SUB, 10};

    /* JADX INFO: renamed from: D */
    public static final byte[] f24405D = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: E */
    public static final byte[] f24406E = {82, 73, 70, 70};

    /* JADX INFO: renamed from: F */
    public static final byte[] f24407F = {87, 69, 66, 80};

    /* JADX INFO: renamed from: G */
    public static final byte[] f24408G = {69, 88, 73, 70};

    /* JADX INFO: compiled from: Proguard */
    public static class ByteOrderedDataOutputStream extends FilterOutputStream {
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ExifAttribute {

        /* JADX INFO: renamed from: a */
        public final int f24458a;

        /* JADX INFO: renamed from: b */
        public final int f24459b;

        /* JADX INFO: renamed from: c */
        public final long f24460c;

        /* JADX INFO: renamed from: d */
        public final byte[] f24461d;

        public ExifAttribute(byte[] bArr, int i, int i2) {
            this(-1L, bArr, i, i2);
        }

        /* JADX INFO: renamed from: a */
        public static ExifAttribute m8879a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new ExifAttribute(new byte[]{(byte) (str.charAt(0) - '0')}, 1, 1);
            }
            byte[] bytes = str.getBytes(ExifInterface.f24419R);
            return new ExifAttribute(bytes, 1, bytes.length);
        }

        /* JADX INFO: renamed from: b */
        public static ExifAttribute m8880b(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(ExifInterface.f24419R);
            return new ExifAttribute(bytes, 2, bytes.length);
        }

        /* JADX INFO: renamed from: c */
        public static ExifAttribute m8881c(long j, ByteOrder byteOrder) {
            return m8882d(new long[]{j}, byteOrder);
        }

        /* JADX INFO: renamed from: d */
        public static ExifAttribute m8882d(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f24410I[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new ExifAttribute(byteBufferWrap.array(), 4, jArr.length);
        }

        /* JADX INFO: renamed from: e */
        public static ExifAttribute m8883e(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f24410I[5] * rationalArr.length]);
            byteBufferWrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                byteBufferWrap.putInt((int) rational.f24466a);
                byteBufferWrap.putInt((int) rational.f24467b);
            }
            return new ExifAttribute(byteBufferWrap.array(), 5, rationalArr.length);
        }

        /* JADX INFO: renamed from: f */
        public static ExifAttribute m8884f(int i, ByteOrder byteOrder) {
            return m8885g(new int[]{i}, byteOrder);
        }

        /* JADX INFO: renamed from: g */
        public static ExifAttribute m8885g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f24410I[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new ExifAttribute(byteBufferWrap.array(), 3, iArr.length);
        }

        /* JADX INFO: renamed from: h */
        public final double m8886h(ByteOrder byteOrder) throws Throwable {
            Object objM8889k = m8889k(byteOrder);
            if (objM8889k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM8889k instanceof String) {
                return Double.parseDouble((String) objM8889k);
            }
            if (objM8889k instanceof long[]) {
                if (((long[]) objM8889k).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM8889k instanceof int[]) {
                if (((int[]) objM8889k).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM8889k instanceof double[]) {
                double[] dArr = (double[]) objM8889k;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM8889k instanceof Rational[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            Rational[] rationalArr = (Rational[]) objM8889k;
            if (rationalArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            Rational rational = rationalArr[0];
            return rational.f24466a / rational.f24467b;
        }

        /* JADX INFO: renamed from: i */
        public final int m8887i(ByteOrder byteOrder) throws Throwable {
            Object objM8889k = m8889k(byteOrder);
            if (objM8889k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM8889k instanceof String) {
                return Integer.parseInt((String) objM8889k);
            }
            if (objM8889k instanceof long[]) {
                long[] jArr = (long[]) objM8889k;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM8889k instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM8889k;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: j */
        public final String m8888j(ByteOrder byteOrder) throws Throwable {
            Object objM8889k = m8889k(byteOrder);
            if (objM8889k == null) {
                return null;
            }
            if (objM8889k instanceof String) {
                return (String) objM8889k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objM8889k instanceof long[]) {
                long[] jArr = (long[]) objM8889k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM8889k instanceof int[]) {
                int[] iArr = (int[]) objM8889k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM8889k instanceof double[]) {
                double[] dArr = (double[]) objM8889k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objM8889k instanceof Rational[])) {
                return null;
            }
            Rational[] rationalArr = (Rational[]) objM8889k;
            while (i < rationalArr.length) {
                sb.append(rationalArr[i].f24466a);
                sb.append('/');
                sb.append(rationalArr[i].f24467b);
                i++;
                if (i != rationalArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:16:0x0033 */
        /* JADX WARN: Removed duplicated region for block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r15v24, types: [androidx.exifinterface.media.ExifInterface$Rational[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [androidx.exifinterface.media.ExifInterface$Rational[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Serializable m8889k(ByteOrder byteOrder) throws Throwable {
            ByteOrderedDataInputStream byteOrderedDataInputStream;
            InputStream inputStream;
            byte b2;
            String string;
            int length = 0;
            byte[] bArr = this.f24461d;
            InputStream inputStream2 = null;
            try {
                try {
                    try {
                        byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
                        try {
                            byteOrderedDataInputStream.f24455c = byteOrder;
                            int i = this.f24458a;
                            int i2 = this.f24459b;
                            switch (i) {
                                case 1:
                                case 6:
                                    if (bArr.length != 1 || (b2 = bArr[0]) < 0 || b2 > 1) {
                                        String str = new String(bArr, ExifInterface.f24419R);
                                        try {
                                            byteOrderedDataInputStream.close();
                                            return str;
                                        } catch (IOException e) {
                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                            return str;
                                        }
                                    }
                                    String str2 = new String(new char[]{(char) (b2 + 48)});
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return str2;
                                    } catch (IOException e2) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                        return str2;
                                    }
                                case 2:
                                case 7:
                                    if (i2 >= ExifInterface.f24411J.length) {
                                        int i3 = 0;
                                        while (true) {
                                            byte[] bArr2 = ExifInterface.f24411J;
                                            if (i3 >= bArr2.length) {
                                                length = bArr2.length;
                                            } else if (bArr[i3] == bArr2[i3]) {
                                                i3++;
                                            }
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    try {
                                        while (length < i2) {
                                            byte b3 = bArr[length];
                                            if (b3 == 0) {
                                                string = sb.toString();
                                                byteOrderedDataInputStream.close();
                                                return string;
                                            }
                                            if (b3 >= 32) {
                                                sb.append((char) b3);
                                            } else {
                                                sb.append('?');
                                            }
                                            length++;
                                        }
                                        byteOrderedDataInputStream.close();
                                        return string;
                                    } catch (IOException e3) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                        return string;
                                    }
                                    string = sb.toString();
                                case 3:
                                    ?? r15 = new int[i2];
                                    while (length < i2) {
                                        r15[length] = byteOrderedDataInputStream.readUnsignedShort();
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r15;
                                    } catch (IOException e4) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                        return r15;
                                    }
                                case 4:
                                    ?? r152 = new long[i2];
                                    while (length < i2) {
                                        r152[length] = ((long) byteOrderedDataInputStream.readInt()) & 4294967295L;
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r152;
                                    } catch (IOException e5) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                        return r152;
                                    }
                                case 5:
                                    ?? r153 = new Rational[i2];
                                    while (length < i2) {
                                        r153[length] = new Rational(((long) byteOrderedDataInputStream.readInt()) & 4294967295L, ((long) byteOrderedDataInputStream.readInt()) & 4294967295L);
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r153;
                                    } catch (IOException e6) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                        return r153;
                                    }
                                case 8:
                                    ?? r154 = new int[i2];
                                    while (length < i2) {
                                        r154[length] = byteOrderedDataInputStream.readShort();
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r154;
                                    } catch (IOException e7) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                        return r154;
                                    }
                                case 9:
                                    ?? r155 = new int[i2];
                                    while (length < i2) {
                                        r155[length] = byteOrderedDataInputStream.readInt();
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r155;
                                    } catch (IOException e8) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                        return r155;
                                    }
                                case 10:
                                    ?? r156 = new Rational[i2];
                                    while (length < i2) {
                                        r156[length] = new Rational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r156;
                                    } catch (IOException e9) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                        return r156;
                                    }
                                case 11:
                                    ?? r157 = new double[i2];
                                    while (length < i2) {
                                        r157[length] = byteOrderedDataInputStream.readFloat();
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r157;
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                        return r157;
                                    }
                                case TYPE_BYTES_VALUE:
                                    ?? r158 = new double[i2];
                                    while (length < i2) {
                                        r158[length] = byteOrderedDataInputStream.readDouble();
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r158;
                                    } catch (IOException e11) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                        return r158;
                                    }
                                default:
                                    byteOrderedDataInputStream.close();
                                    return null;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            Log.w("ExifInterface", "IOException occurred during reading a value", e);
                            if (byteOrderedDataInputStream != null) {
                                byteOrderedDataInputStream.close();
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e14) {
                    e = e14;
                    byteOrderedDataInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream2 != null) {
                    }
                    throw th;
                }
            } catch (IOException e15) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(ExifInterface.f24409H[this.f24458a]);
            sb.append(", data length:");
            return AbstractC0000a.m11h(this.f24461d.length, ")", sb);
        }

        public ExifAttribute(long j, byte[] bArr, int i, int i2) {
            this.f24458a = i;
            this.f24459b = i2;
            this.f24460c = j;
            this.f24461d = bArr;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ExifStreamType {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IfdType {
    }

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public static class Rational {

        /* JADX INFO: renamed from: a */
        public final long f24466a;

        /* JADX INFO: renamed from: b */
        public final long f24467b;

        public Rational(long j, long j2) {
            if (j2 == 0) {
                this.f24466a = 0L;
                this.f24467b = 1L;
            } else {
                this.f24466a = j;
                this.f24467b = j2;
            }
        }

        public final String toString() {
            return this.f24466a + RemoteSettings.FORWARD_SLASH_STRING + this.f24467b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f24409H = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f24410I = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f24411J = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ExifTag[] exifTagArr = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag(256, 3, 4, "ImageWidth"), new ExifTag(257, 3, 4, "ImageLength"), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag(273, 3, 4, "StripOffsets"), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag(278, 3, 4, "RowsPerStrip"), new ExifTag(279, 3, 4, "StripByteCounts"), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7), new ExifTag("Xmp", 700, 1)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("SensitivityType", 34864, 3), new ExifTag("StandardOutputSensitivity", 34865, 4), new ExifTag("RecommendedExposureIndex", 34866, 4), new ExifTag("ISOSpeed", 34867, 4), new ExifTag("ISOSpeedLatitudeyyy", 34868, 4), new ExifTag("ISOSpeedLatitudezzz", 34869, 4), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("OffsetTime", 36880, 2), new ExifTag("OffsetTimeOriginal", 36881, 2), new ExifTag("OffsetTimeDigitized", 36882, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag(40962, 3, 4, "PixelXDimension"), new ExifTag(40963, 3, 4, "PixelYDimension"), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("CameraOwnerName", 42032, 2), new ExifTag("BodySerialNumber", 42033, 2), new ExifTag("LensSpecification", 42034, 5), new ExifTag("LensMake", 42035, 2), new ExifTag("LensModel", 42036, 2), new ExifTag("Gamma", 42240, 5), new ExifTag("DNGVersion", 50706, 1), new ExifTag(50720, 3, 4, "DefaultCropSize")};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag(2, 5, 10, "GPSLatitude"), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag(4, 5, 10, "GPSLongitude"), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3), new ExifTag("GPSHPositioningError", 31, 5)};
        ExifTag[] exifTagArr4 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        ExifTag[] exifTagArr5 = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag(256, 3, 4, "ThumbnailImageWidth"), new ExifTag(257, 3, 4, "ThumbnailImageLength"), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag(273, 3, 4, "StripOffsets"), new ExifTag("ThumbnailOrientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag(278, 3, 4, "RowsPerStrip"), new ExifTag(279, 3, 4, "StripByteCounts"), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag(50720, 3, 4, "DefaultCropSize")};
        f24412K = new ExifTag("StripOffsets", 273, 3);
        f24413L = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, new ExifTag[]{new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)}, new ExifTag[]{new ExifTag("PreviewImageStart", 257, 4), new ExifTag("PreviewImageLength", 258, 4)}, new ExifTag[]{new ExifTag("AspectFrame", 4371, 3)}, new ExifTag[]{new ExifTag("ColorSpace", 55, 3)}};
        f24414M = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
        f24415N = new HashMap[10];
        f24416O = new HashMap[10];
        f24417P = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f24418Q = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f24419R = charsetForName;
        f24420S = "Exif\u0000\u0000".getBytes(charsetForName);
        f24421T = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            ExifTag[][] exifTagArr6 = f24413L;
            if (i >= exifTagArr6.length) {
                HashMap map = f24418Q;
                ExifTag[] exifTagArr7 = f24414M;
                map.put(Integer.valueOf(exifTagArr7[0].f24462a), 5);
                map.put(Integer.valueOf(exifTagArr7[1].f24462a), 1);
                map.put(Integer.valueOf(exifTagArr7[2].f24462a), 2);
                map.put(Integer.valueOf(exifTagArr7[3].f24462a), 3);
                map.put(Integer.valueOf(exifTagArr7[4].f24462a), 7);
                map.put(Integer.valueOf(exifTagArr7[5].f24462a), 8);
                Pattern.compile(".*[1-9].*");
                f24422U = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f24423V = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f24424W = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f24415N[i] = new HashMap();
            f24416O[i] = new HashMap();
            for (ExifTag exifTag : exifTagArr6[i]) {
                f24415N[i].put(Integer.valueOf(exifTag.f24462a), exifTag);
                f24416O[i].put(exifTag.f24463b, exifTag);
            }
            i++;
        }
    }

    public ExifInterface(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z2;
        ExifTag[][] exifTagArr = f24413L;
        this.f24441f = new HashMap[exifTagArr.length];
        this.f24442g = new HashSet(exifTagArr.length);
        this.f24443h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f24438c = null;
        this.f24436a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z2 = true;
            } catch (Exception unused) {
                if (f24425p) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z2 = false;
            }
            if (z2) {
                this.f24437b = fileInputStream.getFD();
            } else {
                this.f24437b = null;
            }
            m8872t(fileInputStream);
            ExifInterfaceUtils.m8891a(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            ExifInterfaceUtils.m8891a(fileInputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static double m8847b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: q */
    public static Pair m8848q(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairM8848q = m8848q(strArrSplit[0]);
            if (((Integer) pairM8848q.first).intValue() == 2) {
                return pairM8848q;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairM8848q2 = m8848q(strArrSplit[i]);
                int iIntValue = (((Integer) pairM8848q2.first).equals(pairM8848q.first) || ((Integer) pairM8848q2.second).equals(pairM8848q.first)) ? ((Integer) pairM8848q.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairM8848q.second).intValue() == -1 || !(((Integer) pairM8848q2.first).equals(pairM8848q.second) || ((Integer) pairM8848q2.second).equals(pairM8848q.second))) ? -1 : ((Integer) pairM8848q.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairM8848q = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairM8848q = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairM8848q;
        }
        if (!str.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
            try {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    /* JADX INFO: renamed from: w */
    public static ByteOrder m8849w(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        short s = byteOrderedDataInputStream.readShort();
        boolean z2 = f24425p;
        if (s == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04a9  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8850A(String str, String str2) {
        String str3;
        boolean z2;
        ExifTag exifTag;
        int i;
        int i2;
        int i3;
        String str4;
        HashMap[] mapArr;
        int i4;
        String str5;
        Rational rational;
        long j;
        long j2;
        double d;
        String strReplaceAll = str2;
        boolean zEquals = "ISOSpeedRatings".equals(str);
        boolean z3 = f24425p;
        String str6 = "ExifInterface";
        if (zEquals) {
            if (z3) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        } else {
            str3 = str;
        }
        if (strReplaceAll == null) {
            z2 = z3;
        } else if (!f24417P.contains(str3) || strReplaceAll.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
            z2 = z3;
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f24422U.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) {
                boolean zFind = f24423V.matcher(strReplaceAll).find();
                boolean zFind2 = f24424W.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
        } else {
            try {
                double d2 = Double.parseDouble(strReplaceAll);
                long j3 = 1;
                if (d2 >= 9.223372036854776E18d || d2 <= -9.223372036854776E18d) {
                    z2 = z3;
                    rational = new Rational(d2 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
                } else {
                    double dAbs = Math.abs(d2);
                    long j4 = 0;
                    long j5 = 1;
                    double d3 = dAbs;
                    long j6 = 0;
                    while (true) {
                        double d4 = d3 % 1.0d;
                        z2 = z3;
                        long j7 = (long) (d3 - d4);
                        j = (j7 * j3) + j6;
                        j2 = (j7 * j4) + j5;
                        d3 = 1.0d / d4;
                        d = d2;
                        if (Math.abs(dAbs - (j / j2)) <= 1.0E-8d * dAbs) {
                            break;
                        }
                        j6 = j3;
                        d2 = d;
                        j3 = j;
                        j5 = j4;
                        j4 = j2;
                        z3 = z2;
                    }
                    if (d < 0.0d) {
                        j = -j;
                    }
                    rational = new Rational(j, j2);
                }
                strReplaceAll = rational.toString();
            } catch (NumberFormatException unused) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
        }
        boolean zEquals2 = "Xmp".equals(str3);
        HashMap[] mapArr2 = this.f24441f;
        int i5 = 12;
        int i6 = 9;
        int i7 = 4;
        int i8 = 0;
        if (zEquals2) {
            boolean z4 = mapArr2[0].containsKey("Xmp") || mapArr2[5].containsKey("Xmp");
            int i9 = this.f24439d;
            char c2 = i9 != 4 ? (i9 == 9 || i9 == 15 || i9 == 12 || i9 == 13) ? (char) 2 : (char) 1 : (char) 3;
            if ((c2 == 2 && (this.f24450o != null || !z4)) || (c2 == 3 && !z4)) {
                this.f24450o = strReplaceAll != null ? ExifAttribute.m8879a(strReplaceAll) : null;
                return;
            }
        }
        int i10 = 0;
        while (i10 < f24413L.length) {
            if ((i10 == i7 && !this.f24444i) || (exifTag = (ExifTag) f24416O[i10].get(str3)) == null) {
                i3 = i10;
                str4 = str6;
                mapArr = mapArr2;
                i4 = i6;
                i2 = i8;
            } else if (strReplaceAll == null) {
                mapArr2[i10].remove(str3);
                i3 = i10;
                str4 = str6;
                mapArr = mapArr2;
                i4 = i6;
                i2 = i8;
            } else {
                Pair pairM8848q = m8848q(strReplaceAll);
                int iIntValue = ((Integer) pairM8848q.first).intValue();
                int i11 = exifTag.f24464c;
                if (i11 == iIntValue || i11 == ((Integer) pairM8848q.second).intValue()) {
                    i = i6;
                    i2 = i8;
                    int[] iArr = f24410I;
                    switch (i11) {
                        case 1:
                            i3 = i10;
                            str4 = str6;
                            mapArr = mapArr2;
                            i4 = i;
                            mapArr[i3].put(str3, ExifAttribute.m8879a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i3 = i10;
                            str4 = str6;
                            mapArr = mapArr2;
                            i4 = i;
                            mapArr[i3].put(str3, ExifAttribute.m8880b(strReplaceAll));
                            break;
                        case 3:
                            i3 = i10;
                            str4 = str6;
                            mapArr = mapArr2;
                            i4 = i;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit.length];
                            for (int i12 = i2; i12 < strArrSplit.length; i12++) {
                                iArr2[i12] = Integer.parseInt(strArrSplit[i12]);
                            }
                            mapArr[i3].put(str3, ExifAttribute.m8885g(iArr2, this.f24443h));
                            break;
                        case 4:
                            i3 = i10;
                            str4 = str6;
                            mapArr = mapArr2;
                            i4 = i;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i13 = i2; i13 < strArrSplit2.length; i13++) {
                                jArr[i13] = Long.parseLong(strArrSplit2[i13]);
                            }
                            mapArr[i3].put(str3, ExifAttribute.m8882d(jArr, this.f24443h));
                            break;
                        case 5:
                            i3 = i10;
                            str4 = str6;
                            mapArr = mapArr2;
                            i4 = i;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            Rational[] rationalArr = new Rational[strArrSplit3.length];
                            for (int i14 = i2; i14 < strArrSplit3.length; i14++) {
                                String[] strArrSplit4 = strArrSplit3[i14].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                                rationalArr[i14] = new Rational((long) Double.parseDouble(strArrSplit4[i2]), (long) Double.parseDouble(strArrSplit4[1]));
                            }
                            mapArr[i3].put(str3, ExifAttribute.m8883e(rationalArr, this.f24443h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (z2) {
                                Log.d(str6, "Data format isn't one of expected formats: " + i11);
                            }
                            i3 = i10;
                            str4 = str6;
                            mapArr = mapArr2;
                            i4 = i;
                            break;
                        case 9:
                            i3 = i10;
                            str4 = str6;
                            mapArr = mapArr2;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int length = strArrSplit5.length;
                            int[] iArr3 = new int[length];
                            for (int i15 = i2; i15 < strArrSplit5.length; i15++) {
                                iArr3[i15] = Integer.parseInt(strArrSplit5[i15]);
                            }
                            HashMap map = mapArr[i3];
                            ByteOrder byteOrder = this.f24443h;
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i] * length]);
                            byteBufferWrap.order(byteOrder);
                            for (int i16 = i2; i16 < length; i16++) {
                                byteBufferWrap.putInt(iArr3[i16]);
                            }
                            byte[] bArrArray = byteBufferWrap.array();
                            i4 = i;
                            map.put(str3, new ExifAttribute(bArrArray, i4, length));
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            int length2 = strArrSplit6.length;
                            Rational[] rationalArr2 = new Rational[length2];
                            int i17 = i2;
                            while (i17 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i17].split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                                rationalArr2[i17] = new Rational((long) Double.parseDouble(strArrSplit7[i2]), (long) Double.parseDouble(strArrSplit7[1]));
                                i17++;
                                str6 = str6;
                                i10 = i10;
                                iArr = iArr;
                                mapArr2 = mapArr2;
                            }
                            i3 = i10;
                            int[] iArr4 = iArr;
                            str4 = str6;
                            mapArr = mapArr2;
                            HashMap map2 = mapArr[i3];
                            ByteOrder byteOrder2 = this.f24443h;
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr4[10] * length2]);
                            byteBufferWrap2.order(byteOrder2);
                            for (int i18 = i2; i18 < length2; i18++) {
                                Rational rational2 = rationalArr2[i18];
                                byteBufferWrap2.putInt((int) rational2.f24466a);
                                byteBufferWrap2.putInt((int) rational2.f24467b);
                            }
                            map2.put(str3, new ExifAttribute(byteBufferWrap2.array(), 10, length2));
                            i4 = i;
                            break;
                        case TYPE_BYTES_VALUE:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            int length3 = strArrSplit8.length;
                            double[] dArr = new double[length3];
                            for (int i19 = i2; i19 < strArrSplit8.length; i19++) {
                                dArr[i19] = Double.parseDouble(strArrSplit8[i19]);
                            }
                            HashMap map3 = mapArr2[i10];
                            ByteOrder byteOrder3 = this.f24443h;
                            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i5] * length3]);
                            byteBufferWrap3.order(byteOrder3);
                            for (int i20 = i2; i20 < length3; i20++) {
                                byteBufferWrap3.putDouble(dArr[i20]);
                            }
                            map3.put(str3, new ExifAttribute(byteBufferWrap3.array(), i5, length3));
                            i3 = i10;
                            str4 = str6;
                            mapArr = mapArr2;
                            i4 = i;
                            break;
                    }
                } else {
                    int i21 = exifTag.f24465d;
                    if (i21 != -1 && (i21 == ((Integer) pairM8848q.first).intValue() || i21 == ((Integer) pairM8848q.second).intValue())) {
                        i11 = i21;
                    } else if (i11 != 1 && i11 != 7 && i11 != 2) {
                        i2 = i8;
                        if (z2) {
                            StringBuilder sbM23t = AbstractC0000a.m23t("Given tag (", str3, ") value didn't match with one of expected formats: ");
                            String[] strArr = f24409H;
                            sbM23t.append(strArr[i11]);
                            if (i21 == -1) {
                                i = i6;
                                str5 = "";
                            } else {
                                i = i6;
                                str5 = ", " + strArr[i21];
                            }
                            sbM23t.append(str5);
                            sbM23t.append(" (guess: ");
                            sbM23t.append(strArr[((Integer) pairM8848q.first).intValue()]);
                            sbM23t.append(((Integer) pairM8848q.second).intValue() != -1 ? ", " + strArr[((Integer) pairM8848q.second).intValue()] : "");
                            sbM23t.append(")");
                            Log.d(str6, sbM23t.toString());
                            i3 = i10;
                            str4 = str6;
                            mapArr = mapArr2;
                            i4 = i;
                        } else {
                            i3 = i10;
                            str4 = str6;
                            mapArr = mapArr2;
                            i4 = i6;
                        }
                    }
                    i = i6;
                    i2 = i8;
                    int[] iArr5 = f24410I;
                    switch (i11) {
                    }
                }
            }
            i10 = i3 + 1;
            i8 = i2;
            i6 = i4;
            str6 = str4;
            mapArr2 = mapArr;
            i5 = 12;
            i7 = 4;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8851B(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        ExifAttribute exifAttribute;
        int iM8887i;
        HashMap map = this.f24441f[4];
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("Compression");
        if (exifAttribute2 == null) {
            m8870r(byteOrderedDataInputStream, map);
            return;
        }
        int iM8887i2 = exifAttribute2.m8887i(this.f24443h);
        if (iM8887i2 != 1) {
            if (iM8887i2 == 6) {
                m8870r(byteOrderedDataInputStream, map);
                return;
            } else if (iM8887i2 != 7) {
                return;
            }
        }
        ExifAttribute exifAttribute3 = (ExifAttribute) map.get("BitsPerSample");
        if (exifAttribute3 != null) {
            int[] iArr = (int[]) exifAttribute3.m8889k(this.f24443h);
            int[] iArr2 = f24428s;
            if (Arrays.equals(iArr2, iArr) || (this.f24439d == 3 && (exifAttribute = (ExifAttribute) map.get("PhotometricInterpretation")) != null && (((iM8887i = exifAttribute.m8887i(this.f24443h)) == 1 && Arrays.equals(iArr, f24429t)) || (iM8887i == 6 && Arrays.equals(iArr, iArr2))))) {
                ExifAttribute exifAttribute4 = (ExifAttribute) map.get("StripOffsets");
                ExifAttribute exifAttribute5 = (ExifAttribute) map.get("StripByteCounts");
                if (exifAttribute4 == null || exifAttribute5 == null) {
                    return;
                }
                long[] jArrM8892b = ExifInterfaceUtils.m8892b(exifAttribute4.m8889k(this.f24443h));
                long[] jArrM8892b2 = ExifInterfaceUtils.m8892b(exifAttribute5.m8889k(this.f24443h));
                if (jArrM8892b == null || jArrM8892b.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM8892b2 == null || jArrM8892b2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM8892b.length != jArrM8892b2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM8892b2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f24445j = true;
                this.f24444i = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM8892b.length; i3++) {
                    int i4 = (int) jArrM8892b[i3];
                    int i5 = (int) jArrM8892b2[i3];
                    if (i3 < jArrM8892b.length - 1 && i4 + i5 != jArrM8892b[i3 + 1]) {
                        this.f24445j = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        byteOrderedDataInputStream.m8878a(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            byteOrderedDataInputStream.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.f24445j) {
                    long j3 = jArrM8892b[0];
                    return;
                }
                return;
            }
        }
        if (f24425p) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m8852C(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f24441f;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = f24425p;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[i].get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[i].get("ImageWidth");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[i2].get("ImageLength");
        ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[i2].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (exifAttribute3 == null || exifAttribute4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM8887i = exifAttribute.m8887i(this.f24443h);
        int iM8887i2 = exifAttribute2.m8887i(this.f24443h);
        int iM8887i3 = exifAttribute3.m8887i(this.f24443h);
        int iM8887i4 = exifAttribute4.m8887i(this.f24443h);
        if (iM8887i >= iM8887i3 || iM8887i2 >= iM8887i4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: D */
    public final void m8853D(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws Throwable {
        ExifAttribute exifAttributeM8884f;
        ExifAttribute exifAttributeM8884f2;
        HashMap[] mapArr = this.f24441f;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[i].get("DefaultCropSize");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[i].get("SensorTopBorder");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[i].get("SensorLeftBorder");
        ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[i].get("SensorBottomBorder");
        ExifAttribute exifAttribute5 = (ExifAttribute) mapArr[i].get("SensorRightBorder");
        if (exifAttribute != null) {
            if (exifAttribute.f24458a == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute.m8889k(this.f24443h);
                if (rationalArr == null || rationalArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                    return;
                } else {
                    exifAttributeM8884f = ExifAttribute.m8883e(new Rational[]{rationalArr[0]}, this.f24443h);
                    exifAttributeM8884f2 = ExifAttribute.m8883e(new Rational[]{rationalArr[1]}, this.f24443h);
                }
            } else {
                int[] iArr = (int[]) exifAttribute.m8889k(this.f24443h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                exifAttributeM8884f = ExifAttribute.m8884f(iArr[0], this.f24443h);
                exifAttributeM8884f2 = ExifAttribute.m8884f(iArr[1], this.f24443h);
            }
            mapArr[i].put("ImageWidth", exifAttributeM8884f);
            mapArr[i].put("ImageLength", exifAttributeM8884f2);
            return;
        }
        if (exifAttribute2 != null && exifAttribute3 != null && exifAttribute4 != null && exifAttribute5 != null) {
            int iM8887i = exifAttribute2.m8887i(this.f24443h);
            int iM8887i2 = exifAttribute4.m8887i(this.f24443h);
            int iM8887i3 = exifAttribute5.m8887i(this.f24443h);
            int iM8887i4 = exifAttribute3.m8887i(this.f24443h);
            if (iM8887i2 <= iM8887i || iM8887i3 <= iM8887i4) {
                return;
            }
            ExifAttribute exifAttributeM8884f3 = ExifAttribute.m8884f(iM8887i2 - iM8887i, this.f24443h);
            ExifAttribute exifAttributeM8884f4 = ExifAttribute.m8884f(iM8887i3 - iM8887i4, this.f24443h);
            mapArr[i].put("ImageLength", exifAttributeM8884f3);
            mapArr[i].put("ImageWidth", exifAttributeM8884f4);
            return;
        }
        ExifAttribute exifAttribute6 = (ExifAttribute) mapArr[i].get("ImageLength");
        ExifAttribute exifAttribute7 = (ExifAttribute) mapArr[i].get("ImageWidth");
        if (exifAttribute6 == null || exifAttribute7 == null) {
            ExifAttribute exifAttribute8 = (ExifAttribute) mapArr[i].get("JPEGInterchangeFormat");
            ExifAttribute exifAttribute9 = (ExifAttribute) mapArr[i].get("JPEGInterchangeFormatLength");
            if (exifAttribute8 == null || exifAttribute9 == null) {
                return;
            }
            int iM8887i5 = exifAttribute8.m8887i(this.f24443h);
            int iM8887i6 = exifAttribute8.m8887i(this.f24443h);
            seekableByteOrderedDataInputStream.m8890b(iM8887i5);
            byte[] bArr = new byte[iM8887i6];
            seekableByteOrderedDataInputStream.readFully(bArr);
            m8861h(new ByteOrderedDataInputStream(bArr), iM8887i5, i);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m8854E() throws Throwable {
        m8852C(0, 5);
        m8852C(0, 4);
        m8852C(5, 4);
        HashMap[] mapArr = this.f24441f;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("PixelXDimension");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[1].get("PixelYDimension");
        if (exifAttribute != null && exifAttribute2 != null) {
            mapArr[0].put("ImageWidth", exifAttribute);
            mapArr[0].put("ImageLength", exifAttribute2);
        }
        if (mapArr[4].isEmpty() && m8871s(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m8871s(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m8877z(0, "ThumbnailOrientation", "Orientation");
        m8877z(0, "ThumbnailImageLength", "ImageLength");
        m8877z(0, "ThumbnailImageWidth", "ImageWidth");
        m8877z(5, "ThumbnailOrientation", "Orientation");
        m8877z(5, "ThumbnailImageLength", "ImageLength");
        m8877z(5, "ThumbnailImageWidth", "ImageWidth");
        m8877z(4, "Orientation", "ThumbnailOrientation");
        m8877z(4, "ImageLength", "ThumbnailImageLength");
        m8877z(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: a */
    public final void m8855a() {
        String strM8856c = m8856c("DateTimeOriginal");
        HashMap[] mapArr = this.f24441f;
        if (strM8856c != null && m8856c("DateTime") == null) {
            mapArr[0].put("DateTime", ExifAttribute.m8880b(strM8856c));
        }
        if (m8856c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", ExifAttribute.m8881c(0L, this.f24443h));
        }
        if (m8856c("ImageLength") == null) {
            mapArr[0].put("ImageLength", ExifAttribute.m8881c(0L, this.f24443h));
        }
        if (m8856c("Orientation") == null) {
            mapArr[0].put("Orientation", ExifAttribute.m8881c(0L, this.f24443h));
        }
        if (m8856c("LightSource") == null) {
            mapArr[1].put("LightSource", ExifAttribute.m8881c(0L, this.f24443h));
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m8856c(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttributeM8859f = m8859f(str);
        if (exifAttributeM8859f != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = exifAttributeM8859f.f24458a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                Rational[] rationalArr = (Rational[]) exifAttributeM8859f.m8889k(this.f24443h);
                if (rationalArr == null || rationalArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
                    return null;
                }
                Rational rational = rationalArr[0];
                Integer numValueOf = Integer.valueOf((int) (rational.f24466a / rational.f24467b));
                Rational rational2 = rationalArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (rational2.f24466a / rational2.f24467b));
                Rational rational3 = rationalArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (rational3.f24466a / rational3.f24467b)));
            }
            if (!f24417P.contains(str)) {
                return exifAttributeM8859f.m8888j(this.f24443h);
            }
            try {
                return Double.toString(exifAttributeM8859f.m8886h(this.f24443h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final double m8857d(String str, double d) {
        ExifAttribute exifAttributeM8859f = m8859f(str);
        if (exifAttributeM8859f != null) {
            try {
                return exifAttributeM8859f.m8886h(this.f24443h);
            } catch (NumberFormatException unused) {
            }
        }
        return d;
    }

    /* JADX INFO: renamed from: e */
    public final int m8858e(int i, String str) {
        ExifAttribute exifAttributeM8859f = m8859f(str);
        if (exifAttributeM8859f == null) {
            return i;
        }
        try {
            return exifAttributeM8859f.m8887i(this.f24443h);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: f */
    public final ExifAttribute m8859f(String str) {
        ExifAttribute exifAttribute;
        int i;
        ExifAttribute exifAttribute2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f24425p) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.f24439d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (exifAttribute2 = this.f24450o) != null)) {
            return exifAttribute2;
        }
        for (int i2 = 0; i2 < f24413L.length; i2++) {
            ExifAttribute exifAttribute3 = (ExifAttribute) this.f24441f[i2].get(str);
            if (exifAttribute3 != null) {
                return exifAttribute3;
            }
        }
        if (!"Xmp".equals(str) || (exifAttribute = this.f24450o) == null) {
            return null;
        }
        return exifAttribute;
    }

    /* JADX INFO: renamed from: g */
    public final void m8860g(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i2 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new C16441(seekableByteOrderedDataInputStream));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f24441f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", ExifAttribute.m8884f(Integer.parseInt(strExtractMetadata), this.f24443h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", ExifAttribute.m8884f(Integer.parseInt(strExtractMetadata3), this.f24443h));
                }
                int i3 = 1;
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i3 = 6;
                    } else if (i4 == 180) {
                        i3 = 3;
                    } else if (i4 == 270) {
                        i3 = 8;
                    }
                    mapArr[0].put("Orientation", ExifAttribute.m8884f(i3, this.f24443h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    seekableByteOrderedDataInputStream.m8890b(i5);
                    byte[] bArr = new byte[6];
                    seekableByteOrderedDataInputStream.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, f24420S)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    seekableByteOrderedDataInputStream.readFully(bArr2);
                    this.f24446k = i7;
                    m8875x(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    seekableByteOrderedDataInputStream.m8890b(j);
                    byte[] bArr3 = new byte[i10];
                    seekableByteOrderedDataInputStream.readFully(bArr3);
                    this.f24450o = new ExifAttribute(j, bArr3, 1, i10);
                }
                if (f24425p) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } finally {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x009d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a A[LOOP:0: B:10:0x0033->B:56:0x014a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0151 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8861h(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m8861h(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0 A[RETURN] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m8862i(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        ByteOrderedDataInputStream byteOrderedDataInputStream;
        int i2;
        ByteOrderedDataInputStream byteOrderedDataInputStream2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        byte[] bArr;
        long j2;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr3 = f24430u;
            if (i7 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i7] != bArr3[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    if (bArr2[i8] != bytes[i8]) {
                        ByteOrderedDataInputStream byteOrderedDataInputStream3 = null;
                        try {
                            byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr2);
                            try {
                                try {
                                    j = byteOrderedDataInputStream.readInt();
                                    bArr = new byte[4];
                                    byteOrderedDataInputStream.readFully(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                byteOrderedDataInputStream3 = byteOrderedDataInputStream;
                                if (byteOrderedDataInputStream3 != null) {
                                    byteOrderedDataInputStream3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            byteOrderedDataInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, f24431v)) {
                            if (j == 1) {
                                j = byteOrderedDataInputStream.readLong();
                                j2 = 16;
                                if (j < 16) {
                                    byteOrderedDataInputStream.close();
                                    i = 0;
                                    i2 = 0;
                                }
                            } else {
                                j2 = 8;
                            }
                            i = 0;
                            long j3 = 5000;
                            if (j > j3) {
                                j = j3;
                            }
                            long j4 = j - j2;
                            if (j4 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    for (long j5 = 0; j5 < j4 / 4; j5++) {
                                        try {
                                            byteOrderedDataInputStream.readFully(bArr4);
                                            if (j5 != 1) {
                                                if (Arrays.equals(bArr4, f24432w)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, f24433x)) {
                                                    z3 = true;
                                                } else if (Arrays.equals(bArr4, f24434y) || Arrays.equals(bArr4, f24435z)) {
                                                    z4 = true;
                                                }
                                                if (z2) {
                                                    if (z3) {
                                                        byteOrderedDataInputStream.close();
                                                        i2 = 12;
                                                        break;
                                                    }
                                                    if (z4) {
                                                        byteOrderedDataInputStream.close();
                                                        i2 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                            byteOrderedDataInputStream.close();
                                            i2 = i;
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    if (f24425p) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                    if (byteOrderedDataInputStream != null) {
                                    }
                                    i2 = i;
                                    if (i2 == 0) {
                                    }
                                }
                            }
                            byteOrderedDataInputStream.close();
                            i2 = i;
                        }
                        if (i2 == 0) {
                            return i2;
                        }
                        try {
                            byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr2);
                        } catch (Exception unused2) {
                            byteOrderedDataInputStream2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            ByteOrder byteOrderM8849w = m8849w(byteOrderedDataInputStream2);
                            this.f24443h = byteOrderM8849w;
                            byteOrderedDataInputStream2.f24455c = byteOrderM8849w;
                            short s = byteOrderedDataInputStream2.readShort();
                            i3 = (s == 20306 || s == 21330) ? 1 : i;
                            byteOrderedDataInputStream2.close();
                        } catch (Exception unused3) {
                            if (byteOrderedDataInputStream2 != null) {
                                byteOrderedDataInputStream2.close();
                            }
                            i3 = i;
                        } catch (Throwable th4) {
                            th = th4;
                            byteOrderedDataInputStream3 = byteOrderedDataInputStream2;
                            if (byteOrderedDataInputStream3 != null) {
                                byteOrderedDataInputStream3.close();
                            }
                            throw th;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        try {
                            ByteOrderedDataInputStream byteOrderedDataInputStream4 = new ByteOrderedDataInputStream(bArr2);
                            try {
                                ByteOrder byteOrderM8849w2 = m8849w(byteOrderedDataInputStream4);
                                this.f24443h = byteOrderM8849w2;
                                byteOrderedDataInputStream4.f24455c = byteOrderM8849w2;
                                i4 = byteOrderedDataInputStream4.readShort() == 85 ? 1 : i;
                                byteOrderedDataInputStream4.close();
                            } catch (Exception unused4) {
                                byteOrderedDataInputStream3 = byteOrderedDataInputStream4;
                                if (byteOrderedDataInputStream3 != null) {
                                    byteOrderedDataInputStream3.close();
                                }
                                i4 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                byteOrderedDataInputStream3 = byteOrderedDataInputStream4;
                                if (byteOrderedDataInputStream3 != null) {
                                    byteOrderedDataInputStream3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused5) {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i4 != 0) {
                            return 10;
                        }
                        int i9 = i;
                        while (true) {
                            byte[] bArr5 = f24404C;
                            if (i9 >= bArr5.length) {
                                i5 = 1;
                                break;
                            }
                            if (bArr2[i9] != bArr5[i9]) {
                                i5 = i;
                                break;
                            }
                            i9++;
                        }
                        if (i5 != 0) {
                            return 13;
                        }
                        int i10 = i;
                        while (true) {
                            byte[] bArr6 = f24406E;
                            if (i10 >= bArr6.length) {
                                int i11 = i;
                                while (true) {
                                    byte[] bArr7 = f24407F;
                                    if (i11 >= bArr7.length) {
                                        i6 = 1;
                                        break;
                                    }
                                    if (bArr2[bArr6.length + i11 + 4] != bArr7[i11]) {
                                        break;
                                    }
                                    i11++;
                                }
                            } else {
                                if (bArr2[i10] != bArr6[i10]) {
                                    break;
                                }
                                i10++;
                            }
                        }
                        i6 = i;
                        if (i6 != 0) {
                            return 14;
                        }
                        return i;
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8863j(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        int i;
        int i2;
        m8866m(seekableByteOrderedDataInputStream);
        HashMap[] mapArr = this.f24441f;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("MakerNote");
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.f24461d);
            seekableByteOrderedDataInputStream2.f24455c = this.f24443h;
            byte[] bArr = f24402A;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.m8890b(0L);
            byte[] bArr3 = f24403B;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.m8890b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.m8890b(12L);
            }
            m8876y(seekableByteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[7].get("PreviewImageStart");
            ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[7].get("PreviewImageLength");
            if (exifAttribute2 != null && exifAttribute3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", exifAttribute2);
                mapArr[5].put("JPEGInterchangeFormatLength", exifAttribute3);
            }
            ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[8].get("AspectFrame");
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.m8889k(this.f24443h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                ExifAttribute exifAttributeM8884f = ExifAttribute.m8884f(i5, this.f24443h);
                ExifAttribute exifAttributeM8884f2 = ExifAttribute.m8884f(i6, this.f24443h);
                mapArr[0].put("ImageWidth", exifAttributeM8884f);
                mapArr[0].put("ImageLength", exifAttributeM8884f2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m8864k(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (f24425p) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f24455c = ByteOrder.BIG_ENDIAN;
        int i = byteOrderedDataInputStream.f24454b;
        byteOrderedDataInputStream.m8878a(f24404C.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int i2 = byteOrderedDataInputStream.readInt();
                int i3 = byteOrderedDataInputStream.readInt();
                int i4 = byteOrderedDataInputStream.f24454b;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z2) {
                    this.f24446k = i6;
                    byte[] bArr = new byte[i2];
                    byteOrderedDataInputStream.readFully(bArr);
                    int i7 = byteOrderedDataInputStream.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    m8875x(0, bArr);
                    m8854E();
                    m8851B(new ByteOrderedDataInputStream(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = f24405D;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        byteOrderedDataInputStream.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = byteOrderedDataInputStream.f24454b - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            byteOrderedDataInputStream.readFully(bArr4);
                            this.f24450o = new ExifAttribute(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                byteOrderedDataInputStream.m8878a(i5 - byteOrderedDataInputStream.f24454b);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8865l(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        boolean z2 = f24425p;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.m8878a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.readFully(bArr);
        byteOrderedDataInputStream.readFully(bArr2);
        byteOrderedDataInputStream.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        byteOrderedDataInputStream.m8878a(i - byteOrderedDataInputStream.f24454b);
        byteOrderedDataInputStream.readFully(bArr4);
        m8861h(new ByteOrderedDataInputStream(bArr4), i, 5);
        byteOrderedDataInputStream.m8878a(i3 - byteOrderedDataInputStream.f24454b);
        byteOrderedDataInputStream.f24455c = ByteOrder.BIG_ENDIAN;
        int i4 = byteOrderedDataInputStream.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (unsignedShort == f24412K.f24462a) {
                short s = byteOrderedDataInputStream.readShort();
                short s2 = byteOrderedDataInputStream.readShort();
                ExifAttribute exifAttributeM8884f = ExifAttribute.m8884f(s, this.f24443h);
                ExifAttribute exifAttributeM8884f2 = ExifAttribute.m8884f(s2, this.f24443h);
                HashMap[] mapArr = this.f24441f;
                mapArr[0].put("ImageLength", exifAttributeM8884f);
                mapArr[0].put("ImageWidth", exifAttributeM8884f2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.m8878a(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m8866m(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        m8873u(seekableByteOrderedDataInputStream);
        m8876y(seekableByteOrderedDataInputStream, 0);
        m8853D(seekableByteOrderedDataInputStream, 0);
        m8853D(seekableByteOrderedDataInputStream, 5);
        m8853D(seekableByteOrderedDataInputStream, 4);
        m8854E();
        if (this.f24439d == 8) {
            HashMap[] mapArr = this.f24441f;
            ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("MakerNote");
            if (exifAttribute != null) {
                SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.f24461d);
                seekableByteOrderedDataInputStream2.f24455c = this.f24443h;
                seekableByteOrderedDataInputStream2.m8878a(6);
                m8876y(seekableByteOrderedDataInputStream2, 9);
                ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[9].get("ColorSpace");
                if (exifAttribute2 != null) {
                    mapArr[1].put("ColorSpace", exifAttribute2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8867n(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        if (f24425p) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        m8866m(seekableByteOrderedDataInputStream);
        HashMap[] mapArr = this.f24441f;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[0].get("JpgFromRaw");
        if (exifAttribute != null) {
            m8861h(new ByteOrderedDataInputStream(exifAttribute.f24461d), (int) exifAttribute.f24460c, 5);
        }
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[0].get("ISO");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[1].get("PhotographicSensitivity");
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", exifAttribute2);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m8868o(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        byte[] bArr = f24420S;
        byte[] bArr2 = new byte[bArr.length];
        seekableByteOrderedDataInputStream.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = seekableByteOrderedDataInputStream.f24453a.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.f24446k = bArr.length;
                m8875x(0, bArrCopyOf2);
                return true;
            }
            i += i2;
            seekableByteOrderedDataInputStream.f24454b += i2;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m8869p(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (f24425p) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f24455c = ByteOrder.LITTLE_ENDIAN;
        byteOrderedDataInputStream.m8878a(f24406E.length);
        int i = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = f24407F;
        byteOrderedDataInputStream.m8878a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int i2 = byteOrderedDataInputStream.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f24408G, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    byteOrderedDataInputStream.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f24420S;
                    if (ExifInterfaceUtils.m8893c(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.f24446k = i3;
                    m8875x(0, bArrCopyOfRange);
                    m8851B(new ByteOrderedDataInputStream(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.m8878a(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8870r(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap map) throws Throwable {
        ExifAttribute exifAttribute = (ExifAttribute) map.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("JPEGInterchangeFormatLength");
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int iM8887i = exifAttribute.m8887i(this.f24443h);
        int iM8887i2 = exifAttribute2.m8887i(this.f24443h);
        if (this.f24439d == 7) {
            iM8887i += this.f24447l;
        }
        if (iM8887i > 0 && iM8887i2 > 0) {
            this.f24444i = true;
            if (this.f24436a == null && this.f24438c == null && this.f24437b == null) {
                byteOrderedDataInputStream.m8878a(iM8887i);
                byteOrderedDataInputStream.readFully(new byte[iM8887i2]);
            }
        }
        if (f24425p) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM8887i + ", length: " + iM8887i2);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m8871s(HashMap map) {
        ExifAttribute exifAttribute = (ExifAttribute) map.get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.m8887i(this.f24443h) <= 512 && exifAttribute2.m8887i(this.f24443h) <= 512;
    }

    /* JADX INFO: renamed from: t */
    public final void m8872t(InputStream inputStream) {
        boolean z2 = f24425p;
        for (int i = 0; i < f24413L.length; i++) {
            try {
                try {
                    this.f24441f[i] = new HashMap();
                } finally {
                    m8855a();
                    if (z2) {
                        m8874v();
                    }
                }
            } catch (IOException | UnsupportedOperationException e) {
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m8855a();
                if (z2) {
                    m8874v();
                    return;
                }
                return;
            }
        }
        boolean z3 = this.f24440e;
        if (!z3) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f24439d = m8862i(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.f24439d;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream);
            int i3 = this.f24439d;
            if (i3 == 4) {
                m8861h(byteOrderedDataInputStream, 0, 0);
            } else if (i3 == 13) {
                m8864k(byteOrderedDataInputStream);
            } else if (i3 == 9) {
                m8865l(byteOrderedDataInputStream);
            } else if (i3 == 14) {
                m8869p(byteOrderedDataInputStream);
            }
        } else {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(inputStream);
            if (!z3) {
                int i4 = this.f24439d;
                if (i4 == 12 || i4 == 15) {
                    m8860g(seekableByteOrderedDataInputStream, i4);
                } else if (i4 == 7) {
                    m8863j(seekableByteOrderedDataInputStream);
                } else if (i4 == 10) {
                    m8867n(seekableByteOrderedDataInputStream);
                } else {
                    m8866m(seekableByteOrderedDataInputStream);
                }
            } else if (!m8868o(seekableByteOrderedDataInputStream)) {
                if (z2) {
                    return;
                } else {
                    return;
                }
            }
            seekableByteOrderedDataInputStream.m8890b(this.f24446k);
            m8851B(seekableByteOrderedDataInputStream);
        }
        m8855a();
        if (z2) {
            m8874v();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8873u(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        ByteOrder byteOrderM8849w = m8849w(seekableByteOrderedDataInputStream);
        this.f24443h = byteOrderM8849w;
        seekableByteOrderedDataInputStream.f24455c = byteOrderM8849w;
        int unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
        int i = this.f24439d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = seekableByteOrderedDataInputStream.readInt();
        if (i2 < 8) {
            throw new IOException(AbstractC0000a.m9f(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            seekableByteOrderedDataInputStream.m8878a(i3);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m8874v() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f24441f;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "The size of tag group[", "]: ");
            sbM20q.append(mapArr[i].size());
            Log.d("ExifInterface", sbM20q.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                ExifAttribute exifAttribute = (ExifAttribute) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + exifAttribute.toString() + ", tagValue: '" + exifAttribute.m8888j(this.f24443h) + "'");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m8875x(int i, byte[] bArr) throws IOException {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        m8873u(seekableByteOrderedDataInputStream);
        m8876y(seekableByteOrderedDataInputStream, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8876y(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws IOException {
        HashMap[] mapArr;
        short s;
        boolean z2;
        short s2;
        HashMap[] mapArr2;
        HashSet hashSet;
        long j;
        boolean z3;
        int i2;
        HashSet hashSet2;
        int i3;
        int i4;
        int unsignedShort;
        long j2;
        int i5 = i;
        Integer numValueOf = Integer.valueOf(seekableByteOrderedDataInputStream.f24454b);
        HashSet hashSet3 = this.f24442g;
        hashSet3.add(numValueOf);
        short s3 = seekableByteOrderedDataInputStream.readShort();
        boolean z4 = f24425p;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s3));
        }
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            mapArr = this.f24441f;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort3 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int i6 = seekableByteOrderedDataInputStream.readInt();
            long j3 = ((long) seekableByteOrderedDataInputStream.f24454b) + 4;
            ExifTag exifTag = (ExifTag) f24415N[i5].get(Integer.valueOf(unsignedShort2));
            if (z4) {
                s = s3;
                z2 = z4;
                s2 = s4;
                mapArr2 = mapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i5), Integer.valueOf(unsignedShort2), exifTag != null ? exifTag.f24463b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            } else {
                s = s3;
                z2 = z4;
                s2 = s4;
                mapArr2 = mapArr;
            }
            if (exifTag != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f24410I;
                    if (unsignedShort3 < iArr.length) {
                        int i7 = exifTag.f24464c;
                        if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i2 = exifTag.f24465d) == unsignedShort3 || (((i7 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i7;
                            }
                            hashSet = hashSet3;
                            j = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j < 0 || j > 2147483647L) {
                                if (z2) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i6);
                                }
                                z3 = false;
                                if (z3) {
                                    seekableByteOrderedDataInputStream.m8890b(j3);
                                } else {
                                    if (j > 4) {
                                        int i8 = seekableByteOrderedDataInputStream.readInt();
                                        if (z2) {
                                            hashSet2 = hashSet;
                                            Log.d("ExifInterface", "seek to data offset: " + i8);
                                        } else {
                                            hashSet2 = hashSet;
                                        }
                                        if (this.f24439d != 7) {
                                            i3 = unsignedShort2;
                                            i4 = i6;
                                            seekableByteOrderedDataInputStream.m8890b(i8);
                                        } else {
                                            if ("MakerNote".equals(exifTag.f24463b)) {
                                                this.f24447l = i8;
                                            } else {
                                                if (i5 == 6 && "ThumbnailImage".equals(exifTag.f24463b)) {
                                                    this.f24448m = i8;
                                                    this.f24449n = i6;
                                                    ExifAttribute exifAttributeM8884f = ExifAttribute.m8884f(6, this.f24443h);
                                                    i3 = unsignedShort2;
                                                    ExifAttribute exifAttributeM8881c = ExifAttribute.m8881c(this.f24448m, this.f24443h);
                                                    i4 = i6;
                                                    ExifAttribute exifAttributeM8881c2 = ExifAttribute.m8881c(this.f24449n, this.f24443h);
                                                    mapArr2[4].put("Compression", exifAttributeM8884f);
                                                    mapArr2[4].put("JPEGInterchangeFormat", exifAttributeM8881c);
                                                    mapArr2[4].put("JPEGInterchangeFormatLength", exifAttributeM8881c2);
                                                }
                                                seekableByteOrderedDataInputStream.m8890b(i8);
                                            }
                                            i3 = unsignedShort2;
                                            i4 = i6;
                                            seekableByteOrderedDataInputStream.m8890b(i8);
                                        }
                                    } else {
                                        hashSet2 = hashSet;
                                        i3 = unsignedShort2;
                                        i4 = i6;
                                    }
                                    Integer num = (Integer) f24418Q.get(Integer.valueOf(i3));
                                    if (z2) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                                    }
                                    if (num != null) {
                                        if (unsignedShort3 != 3) {
                                            if (unsignedShort3 == 4) {
                                                j2 = ((long) seekableByteOrderedDataInputStream.readInt()) & 4294967295L;
                                            } else if (unsignedShort3 == 8) {
                                                unsignedShort = seekableByteOrderedDataInputStream.readShort();
                                            } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                                                unsignedShort = seekableByteOrderedDataInputStream.readInt();
                                            } else {
                                                j2 = -1;
                                            }
                                            if (z2) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j2), exifTag.f24463b));
                                            }
                                            int i9 = seekableByteOrderedDataInputStream.f24457f;
                                            if (j2 > 0 || (i9 != -1 && j2 >= i9)) {
                                                hashSet = hashSet2;
                                                if (z2) {
                                                    String strM2238m = AbstractC0455a.m2238m(j2, "Skip jump into the IFD since its offset is invalid: ");
                                                    if (i9 != -1) {
                                                        strM2238m = strM2238m + " (total length: " + i9 + ")";
                                                    }
                                                    Log.d("ExifInterface", strM2238m);
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                                    seekableByteOrderedDataInputStream.m8890b(j2);
                                                    m8876y(seekableByteOrderedDataInputStream, num.intValue());
                                                } else if (z2) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                                                }
                                            }
                                            seekableByteOrderedDataInputStream.m8890b(j3);
                                        } else {
                                            unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                                        }
                                        j2 = unsignedShort;
                                        if (z2) {
                                        }
                                        int i92 = seekableByteOrderedDataInputStream.f24457f;
                                        if (j2 > 0) {
                                            hashSet = hashSet2;
                                            if (z2) {
                                            }
                                            seekableByteOrderedDataInputStream.m8890b(j3);
                                        }
                                    } else {
                                        hashSet = hashSet2;
                                        int i10 = seekableByteOrderedDataInputStream.f24454b + this.f24446k;
                                        byte[] bArr = new byte[(int) j];
                                        seekableByteOrderedDataInputStream.readFully(bArr);
                                        ExifAttribute exifAttribute = new ExifAttribute(i10, bArr, unsignedShort3, i4);
                                        mapArr2[i].put(exifTag.f24463b, exifAttribute);
                                        String str = exifTag.f24463b;
                                        if ("DNGVersion".equals(str)) {
                                            this.f24439d = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && exifAttribute.m8888j(this.f24443h).contains("PENTAX")) || ("Compression".equals(str) && exifAttribute.m8887i(this.f24443h) == 65535)) {
                                            this.f24439d = 8;
                                        }
                                        if (seekableByteOrderedDataInputStream.f24454b != j3) {
                                            seekableByteOrderedDataInputStream.m8890b(j3);
                                        }
                                    }
                                }
                                s4 = (short) (s2 + 1);
                                i5 = i;
                                hashSet3 = hashSet;
                                s3 = s;
                                z4 = z2;
                            } else {
                                z3 = true;
                                if (z3) {
                                }
                                s4 = (short) (s2 + 1);
                                i5 = i;
                                hashSet3 = hashSet;
                                s3 = s;
                                z4 = z2;
                            }
                        } else if (z2) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f24409H[unsignedShort3] + ") is unexpected for tag: " + exifTag.f24463b);
                        }
                    }
                }
                hashSet = hashSet3;
                if (z2) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j = 0;
                z3 = false;
                if (z3) {
                }
                s4 = (short) (s2 + 1);
                i5 = i;
                hashSet3 = hashSet;
                s3 = s;
                z4 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            hashSet = hashSet3;
            j = 0;
            z3 = false;
            if (z3) {
            }
            s4 = (short) (s2 + 1);
            i5 = i;
            hashSet3 = hashSet;
            s3 = s;
            z4 = z2;
        }
        HashSet hashSet4 = hashSet3;
        boolean z5 = z4;
        int i11 = seekableByteOrderedDataInputStream.readInt();
        if (z5) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j4 = i11;
        if (j4 <= 0) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(i11))) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        seekableByteOrderedDataInputStream.m8890b(j4);
        if (mapArr[4].isEmpty()) {
            m8876y(seekableByteOrderedDataInputStream, 4);
        } else if (mapArr[5].isEmpty()) {
            m8876y(seekableByteOrderedDataInputStream, 5);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m8877z(int i, String str, String str2) {
        HashMap[] mapArr = this.f24441f;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (ExifAttribute) map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ByteOrderedDataInputStream extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a */
        public final DataInputStream f24453a;

        /* JADX INFO: renamed from: b */
        public int f24454b;

        /* JADX INFO: renamed from: c */
        public ByteOrder f24455c;

        /* JADX INFO: renamed from: d */
        public byte[] f24456d;

        /* JADX INFO: renamed from: f */
        public final int f24457f;

        public ByteOrderedDataInputStream(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f24457f = bArr.length;
        }

        /* JADX INFO: renamed from: a */
        public final void m8878a(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                DataInputStream dataInputStream = this.f24453a;
                int i3 = i - i2;
                int iSkip = (int) dataInputStream.skip(i3);
                if (iSkip <= 0) {
                    if (this.f24456d == null) {
                        this.f24456d = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
                    }
                    iSkip = dataInputStream.read(this.f24456d, 0, Math.min(UserMetadata.MAX_INTERNAL_KEY_SIZE, i3));
                    if (iSkip == -1) {
                        throw new EOFException(AbstractC0000a.m10g(i, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i2 += iSkip;
            }
            this.f24454b += i2;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f24453a.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f24454b++;
            return this.f24453a.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f24454b++;
            return this.f24453a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f24454b++;
            int i = this.f24453a.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f24454b += 2;
            return this.f24453a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f24454b += i2;
            this.f24453a.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f24454b += 4;
            DataInputStream dataInputStream = this.f24453a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f24455c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f24455c);
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j;
            long j2;
            this.f24454b += 8;
            DataInputStream dataInputStream = this.f24453a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            int i6 = dataInputStream.read();
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f24455c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                j = (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8);
                j2 = i;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    throw new IOException("Invalid byte order: " + this.f24455c);
                }
                j = (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8);
                j2 = i8;
            }
            return j + j2;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f24454b += 2;
            DataInputStream dataInputStream = this.f24453a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f24455c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i << 8) + i2);
            }
            throw new IOException("Invalid byte order: " + this.f24455c);
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f24454b += 2;
            return this.f24453a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f24454b++;
            return this.f24453a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f24454b += 2;
            DataInputStream dataInputStream = this.f24453a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f24455c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i2 << 8) + i;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i << 8) + i2;
            }
            throw new IOException("Invalid byte order: " + this.f24455c);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public ByteOrderedDataInputStream(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f24453a.read(bArr, i, i2);
            this.f24454b += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f24454b += bArr.length;
            this.f24453a.readFully(bArr);
        }

        public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f24453a = dataInputStream;
            dataInputStream.mark(0);
            this.f24454b = 0;
            this.f24455c = byteOrder;
            this.f24457f = inputStream instanceof ByteOrderedDataInputStream ? ((ByteOrderedDataInputStream) inputStream).f24457f : -1;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        public SeekableByteOrderedDataInputStream(byte[] bArr) {
            super(bArr);
            this.f24453a.mark(Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: b */
        public final void m8890b(long j) throws IOException {
            int i = this.f24454b;
            if (i > j) {
                this.f24454b = 0;
                this.f24453a.reset();
            } else {
                j -= (long) i;
            }
            m8878a((int) j);
        }

        public SeekableByteOrderedDataInputStream(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f24453a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ExifTag {

        /* JADX INFO: renamed from: a */
        public final int f24462a;

        /* JADX INFO: renamed from: b */
        public final String f24463b;

        /* JADX INFO: renamed from: c */
        public final int f24464c;

        /* JADX INFO: renamed from: d */
        public final int f24465d;

        public ExifTag(String str, int i, int i2) {
            this.f24463b = str;
            this.f24462a = i;
            this.f24464c = i2;
            this.f24465d = -1;
        }

        public ExifTag(int i, int i2, int i3, String str) {
            this.f24463b = str;
            this.f24462a = i;
            this.f24464c = i2;
            this.f24465d = i3;
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.ExifInterface$1 */
    /* JADX INFO: compiled from: Proguard */
    class C16441 extends MediaDataSource {

        /* JADX INFO: renamed from: a */
        public long f24451a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SeekableByteOrderedDataInputStream f24452b;

        public C16441(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
            this.f24452b = seekableByteOrderedDataInputStream;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f24451a;
                SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = this.f24452b;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) seekableByteOrderedDataInputStream.f24453a.available())) {
                        return -1;
                    }
                    seekableByteOrderedDataInputStream.m8890b(j);
                    this.f24451a = j;
                }
                if (i2 > seekableByteOrderedDataInputStream.f24453a.available()) {
                    i2 = seekableByteOrderedDataInputStream.f24453a.available();
                }
                int i3 = seekableByteOrderedDataInputStream.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f24451a += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f24451a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public ExifInterface(InputStream inputStream) throws IOException {
        ExifTag[][] exifTagArr = f24413L;
        this.f24441f = new HashMap[exifTagArr.length];
        this.f24442g = new HashSet(exifTagArr.length);
        this.f24443h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f24436a = null;
            this.f24440e = false;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f24438c = (AssetManager.AssetInputStream) inputStream;
                this.f24437b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f24438c = null;
                    this.f24437b = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (f24425p) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    this.f24438c = null;
                    this.f24437b = null;
                }
            } else {
                this.f24438c = null;
                this.f24437b = null;
            }
            m8872t(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
