package androidx.profileinstaller;

import androidx.compose.animation.AbstractC0455a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ProfileTranscoder {

    /* JADX INFO: renamed from: a */
    public static final byte[] f31497a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f31498b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: a */
    public static byte[] m11503a(DexProfileData[] dexProfileDataArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            length += ((((dexProfileData.f31486g * 2) + 7) & (-8)) / 8) + (dexProfileData.f31484e * 2) + m11504b(dexProfileData.f31480a, dexProfileData.f31481b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + dexProfileData.f31485f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, ProfileVersion.f31508c)) {
            int length2 = dexProfileDataArr.length;
            while (i < length2) {
                DexProfileData dexProfileData2 = dexProfileDataArr[i];
                m11513k(byteArrayOutputStream, dexProfileData2, m11504b(dexProfileData2.f31480a, dexProfileData2.f31481b, bArr));
                m11512j(byteArrayOutputStream, dexProfileData2);
                i++;
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                m11513k(byteArrayOutputStream, dexProfileData3, m11504b(dexProfileData3.f31480a, dexProfileData3.f31481b, bArr));
            }
            int length3 = dexProfileDataArr.length;
            while (i < length3) {
                m11512j(byteArrayOutputStream, dexProfileDataArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: b */
    public static String m11504b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = ProfileVersion.f31510e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = ProfileVersion.f31509d;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC0000a.m19p(AbstractC0455a.m2244s(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m11505c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM11496d = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM11496d += (int) Encoding.m11496d(byteArrayInputStream, 2);
            iArr[i2] = iM11496d;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static DexProfileData[] m11506d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] bArr3 = ProfileVersion.f31511f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ProfileVersion.f31512g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM11496d = (int) Encoding.m11496d(fileInputStream, 2);
            byte[] bArrM11495c = Encoding.m11495c(fileInputStream, (int) Encoding.m11496d(fileInputStream, 4), (int) Encoding.m11496d(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM11495c);
            try {
                DexProfileData[] dexProfileDataArrM11508f = m11508f(byteArrayInputStream, bArr2, iM11496d, dexProfileDataArr);
                byteArrayInputStream.close();
                return dexProfileDataArrM11508f;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(ProfileVersion.f31506a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM11496d2 = (int) Encoding.m11496d(fileInputStream, 1);
        byte[] bArrM11495c2 = Encoding.m11495c(fileInputStream, (int) Encoding.m11496d(fileInputStream, 4), (int) Encoding.m11496d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM11495c2);
        try {
            DexProfileData[] dexProfileDataArrM11507e = m11507e(byteArrayInputStream2, iM11496d2, dexProfileDataArr);
            byteArrayInputStream2.close();
            return dexProfileDataArrM11507e;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static DexProfileData[] m11507e(ByteArrayInputStream byteArrayInputStream, int i, DexProfileData[] dexProfileDataArr) {
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i != dexProfileDataArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM11496d = (int) Encoding.m11496d(byteArrayInputStream, 2);
            iArr[i2] = (int) Encoding.m11496d(byteArrayInputStream, 2);
            strArr[i2] = new String(Encoding.m11494b(byteArrayInputStream, iM11496d), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            DexProfileData dexProfileData = dexProfileDataArr[i3];
            if (!dexProfileData.f31481b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            dexProfileData.f31484e = i4;
            dexProfileData.f31487h = m11505c(byteArrayInputStream, i4);
        }
        return dexProfileDataArr;
    }

    /* JADX INFO: renamed from: f */
    public static DexProfileData[] m11508f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, DexProfileData[] dexProfileDataArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i != dexProfileDataArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            Encoding.m11496d(byteArrayInputStream, 2);
            String str = new String(Encoding.m11494b(byteArrayInputStream, (int) Encoding.m11496d(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM11496d = Encoding.m11496d(byteArrayInputStream, 4);
            int iM11496d = (int) Encoding.m11496d(byteArrayInputStream, 2);
            DexProfileData dexProfileData = null;
            if (dexProfileDataArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= dexProfileDataArr.length) {
                        break;
                    }
                    if (dexProfileDataArr[i3].f31481b.equals(strSubstring)) {
                        dexProfileData = dexProfileDataArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (dexProfileData == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            dexProfileData.f31483d = jM11496d;
            int[] iArrM11505c = m11505c(byteArrayInputStream, iM11496d);
            if (Arrays.equals(bArr, ProfileVersion.f31510e)) {
                dexProfileData.f31484e = iM11496d;
                dexProfileData.f31487h = iArrM11505c;
            }
        }
        return dexProfileDataArr;
    }

    /* JADX INFO: renamed from: g */
    public static DexProfileData[] m11509g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ProfileVersion.f31507b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM11496d = (int) Encoding.m11496d(fileInputStream, 1);
        byte[] bArrM11495c = Encoding.m11495c(fileInputStream, (int) Encoding.m11496d(fileInputStream, 4), (int) Encoding.m11496d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM11495c);
        try {
            DexProfileData[] dexProfileDataArrM11510h = m11510h(byteArrayInputStream, str, iM11496d);
            byteArrayInputStream.close();
            return dexProfileDataArrM11510h;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static DexProfileData[] m11510h(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM11496d = (int) Encoding.m11496d(byteArrayInputStream, 2);
            int iM11496d2 = (int) Encoding.m11496d(byteArrayInputStream, 2);
            dexProfileDataArr[i2] = new DexProfileData(str, new String(Encoding.m11494b(byteArrayInputStream, iM11496d), StandardCharsets.UTF_8), Encoding.m11496d(byteArrayInputStream, 4), iM11496d2, (int) Encoding.m11496d(byteArrayInputStream, 4), (int) Encoding.m11496d(byteArrayInputStream, 4), new int[iM11496d2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            DexProfileData dexProfileData = dexProfileDataArr[i3];
            int iAvailable = byteArrayInputStream.available() - dexProfileData.f31485f;
            int iM11496d3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = dexProfileData.f31488i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM11496d3 += (int) Encoding.m11496d(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM11496d3), 1);
                for (int iM11496d4 = (int) Encoding.m11496d(byteArrayInputStream, 2); iM11496d4 > 0; iM11496d4--) {
                    Encoding.m11496d(byteArrayInputStream, 2);
                    int iM11496d5 = (int) Encoding.m11496d(byteArrayInputStream, 1);
                    if (iM11496d5 != 6 && iM11496d5 != 7) {
                        while (iM11496d5 > 0) {
                            Encoding.m11496d(byteArrayInputStream, 1);
                            for (int iM11496d6 = (int) Encoding.m11496d(byteArrayInputStream, 1); iM11496d6 > 0; iM11496d6--) {
                                Encoding.m11496d(byteArrayInputStream, 2);
                            }
                            iM11496d5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            dexProfileData.f31487h = m11505c(byteArrayInputStream, dexProfileData.f31484e);
            int i4 = dexProfileData.f31486g;
            BitSet bitSetValueOf = BitSet.valueOf(Encoding.m11494b(byteArrayInputStream, (((i4 * 2) + 7) & (-8)) / 8));
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bitSetValueOf.get(i5) ? 2 : 0;
                if (bitSetValueOf.get(i5 + i4)) {
                    i6 |= 4;
                }
                if (i6 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i5));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i5), Integer.valueOf(i6 | num.intValue()));
                }
            }
        }
        return dexProfileDataArr;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: i */
    public static boolean m11511i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = ProfileVersion.f31506a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = ProfileVersion.f31507b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM11503a = m11503a(dexProfileDataArr, bArr3);
                Encoding.m11497e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                Encoding.m11497e(byteArrayOutputStream, bArrM11503a.length, 4);
                byte[] bArrM11493a = Encoding.m11493a(bArrM11503a);
                Encoding.m11497e(byteArrayOutputStream, bArrM11493a.length, 4);
                byteArrayOutputStream.write(bArrM11493a);
                return true;
            }
            byte[] bArr4 = ProfileVersion.f31509d;
            if (Arrays.equals(bArr, bArr4)) {
                Encoding.m11497e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                for (DexProfileData dexProfileData : dexProfileDataArr) {
                    int size = dexProfileData.f31488i.size() * 4;
                    String strM11504b = m11504b(dexProfileData.f31480a, dexProfileData.f31481b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    Encoding.m11498f(byteArrayOutputStream, strM11504b.getBytes(charset).length);
                    Encoding.m11498f(byteArrayOutputStream, dexProfileData.f31487h.length);
                    Encoding.m11497e(byteArrayOutputStream, size, 4);
                    Encoding.m11497e(byteArrayOutputStream, dexProfileData.f31482c, 4);
                    byteArrayOutputStream.write(strM11504b.getBytes(charset));
                    Iterator it = dexProfileData.f31488i.keySet().iterator();
                    while (it.hasNext()) {
                        Encoding.m11498f(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        Encoding.m11498f(byteArrayOutputStream, 0);
                    }
                    for (int i2 : dexProfileData.f31487h) {
                        Encoding.m11498f(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = ProfileVersion.f31508c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM11503a2 = m11503a(dexProfileDataArr, bArr5);
                Encoding.m11497e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                Encoding.m11497e(byteArrayOutputStream, bArrM11503a2.length, 4);
                byte[] bArrM11493a2 = Encoding.m11493a(bArrM11503a2);
                Encoding.m11497e(byteArrayOutputStream, bArrM11493a2.length, 4);
                byteArrayOutputStream.write(bArrM11493a2);
                return true;
            }
            byte[] bArr6 = ProfileVersion.f31510e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            Encoding.m11498f(byteArrayOutputStream, dexProfileDataArr.length);
            for (DexProfileData dexProfileData2 : dexProfileDataArr) {
                String strM11504b2 = m11504b(dexProfileData2.f31480a, dexProfileData2.f31481b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                Encoding.m11498f(byteArrayOutputStream, strM11504b2.getBytes(charset2).length);
                TreeMap treeMap = dexProfileData2.f31488i;
                Encoding.m11498f(byteArrayOutputStream, treeMap.size());
                Encoding.m11498f(byteArrayOutputStream, dexProfileData2.f31487h.length);
                Encoding.m11497e(byteArrayOutputStream, dexProfileData2.f31482c, 4);
                byteArrayOutputStream.write(strM11504b2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    Encoding.m11498f(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : dexProfileData2.f31487h) {
                    Encoding.m11498f(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            Encoding.m11498f(byteArrayOutputStream2, dexProfileDataArr.length);
            int i4 = 2;
            int i5 = 2;
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                Encoding.m11497e(byteArrayOutputStream2, dexProfileData3.f31482c, 4);
                Encoding.m11497e(byteArrayOutputStream2, dexProfileData3.f31483d, 4);
                Encoding.m11497e(byteArrayOutputStream2, dexProfileData3.f31486g, 4);
                String strM11504b3 = m11504b(dexProfileData3.f31480a, dexProfileData3.f31481b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM11504b3.getBytes(charset3).length;
                Encoding.m11498f(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strM11504b3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(writableFileSection);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < dexProfileDataArr.length; i7++) {
                try {
                    DexProfileData dexProfileData4 = dexProfileDataArr[i7];
                    Encoding.m11498f(byteArrayOutputStream3, i7);
                    Encoding.m11498f(byteArrayOutputStream3, dexProfileData4.f31484e);
                    i6 = i6 + 4 + (dexProfileData4.f31484e * i4);
                    int[] iArr = dexProfileData4.f31487h;
                    int length3 = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        int i10 = iArr[i8];
                        Encoding.m11498f(byteArrayOutputStream3, i10 - i9);
                        i8++;
                        i4 = i4;
                        i9 = i10;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            WritableFileSection writableFileSection2 = new WritableFileSection(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(writableFileSection2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < dexProfileDataArr.length) {
                try {
                    DexProfileData dexProfileData5 = dexProfileDataArr[i11];
                    Iterator it3 = dexProfileData5.f31488i.entrySet().iterator();
                    int iIntValue = i;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m11514l(byteArrayOutputStream4, iIntValue, dexProfileData5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m11515m(byteArrayOutputStream4, dexProfileData5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            Encoding.m11498f(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            Encoding.m11497e(byteArrayOutputStream3, length4, 4);
                            Encoding.m11498f(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            WritableFileSection writableFileSection3 = new WritableFileSection(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(writableFileSection3);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList2.size() * 16));
            Encoding.m11497e(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                WritableFileSection writableFileSection4 = (WritableFileSection) arrayList2.get(i14);
                Encoding.m11497e(byteArrayOutputStream, writableFileSection4.f31513a.f31493a, 4);
                Encoding.m11497e(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = writableFileSection4.f31514b;
                if (writableFileSection4.f31515c) {
                    long length5 = bArr7.length;
                    byte[] bArrM11493a3 = Encoding.m11493a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM11493a3);
                    Encoding.m11497e(byteArrayOutputStream, bArrM11493a3.length, 4);
                    Encoding.m11497e(byteArrayOutputStream, length5, 4);
                    length = bArrM11493a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    Encoding.m11497e(byteArrayOutputStream, bArr7.length, 4);
                    Encoding.m11497e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m11512j(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) throws IOException {
        m11515m(byteArrayOutputStream, dexProfileData);
        int[] iArr = dexProfileData.f31487h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            Encoding.m11498f(byteArrayOutputStream, i3 - i2);
            i++;
            i2 = i3;
        }
        int i4 = dexProfileData.f31486g;
        byte[] bArr = new byte[(((i4 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dexProfileData.f31488i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i4;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: k */
    public static void m11513k(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        Encoding.m11498f(byteArrayOutputStream, str.getBytes(charset).length);
        Encoding.m11498f(byteArrayOutputStream, dexProfileData.f31484e);
        Encoding.m11497e(byteArrayOutputStream, dexProfileData.f31485f, 4);
        Encoding.m11497e(byteArrayOutputStream, dexProfileData.f31482c, 4);
        Encoding.m11497e(byteArrayOutputStream, dexProfileData.f31486g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: l */
    public static void m11514l(ByteArrayOutputStream byteArrayOutputStream, int i, DexProfileData dexProfileData) throws IOException {
        int iBitCount = Integer.bitCount(i & (-2));
        int i2 = dexProfileData.f31486g;
        byte[] bArr = new byte[(((iBitCount * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dexProfileData.f31488i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: m */
    public static void m11515m(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) throws IOException {
        int i = 0;
        for (Map.Entry entry : dexProfileData.f31488i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                Encoding.m11498f(byteArrayOutputStream, iIntValue - i);
                Encoding.m11498f(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
