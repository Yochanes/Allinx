package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ProjectionDecoder {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m10757a(ParsableByteArray parsableByteArray) {
        char c2;
        ArrayList arrayList;
        boolean z2;
        int i;
        Object mesh;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (parsableByteArray2.m9568u() == 0) {
            char c3 = 7;
            parsableByteArray2.m9547H(7);
            int iM9554g = parsableByteArray2.m9554g();
            boolean z3 = true;
            if (iM9554g == 1684433976) {
                ParsableByteArray parsableByteArray3 = new ParsableByteArray();
                Inflater inflater = new Inflater(true);
                try {
                    if (!Util.m9593C(parsableByteArray2, parsableByteArray3, inflater)) {
                        return null;
                    }
                    inflater.end();
                    parsableByteArray2 = parsableByteArray3;
                } finally {
                    inflater.end();
                }
            } else if (iM9554g == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i2 = parsableByteArray2.f25645b;
            int i3 = parsableByteArray2.f25646c;
            while (i2 < i3) {
                int iM9554g2 = parsableByteArray2.m9554g() + i2;
                if (iM9554g2 > i2 && iM9554g2 <= i3) {
                    if (parsableByteArray2.m9554g() == 1835365224) {
                        int iM9554g3 = parsableByteArray2.m9554g();
                        if (iM9554g3 > 10000) {
                            c2 = c3;
                            ArrayList arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z2 = z3;
                            i = i3;
                            mesh = arrayList4;
                            if (mesh != null) {
                                return arrayList;
                            }
                            arrayList3.add(mesh);
                        } else {
                            float[] fArr = new float[iM9554g3];
                            for (int i4 = 0; i4 < iM9554g3; i4++) {
                                fArr[i4] = Float.intBitsToFloat(parsableByteArray2.m9554g());
                            }
                            int iM9554g4 = parsableByteArray2.m9554g();
                            if (iM9554g4 <= 32000) {
                                double dLog = Math.log(2.0d);
                                c2 = c3;
                                ArrayList arrayList5 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iM9554g3) * 2.0d) / dLog);
                                z2 = z3;
                                byte[] bArr = parsableByteArray2.f25644a;
                                ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, bArr.length);
                                parsableBitArray.m9536m(parsableByteArray2.f25645b * 8);
                                float[] fArr2 = new float[iM9554g4 * 5];
                                int i5 = 5;
                                int[] iArr = new int[5];
                                ArrayList arrayList6 = arrayList5;
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < iM9554g4) {
                                        int i8 = 0;
                                        while (i8 < i5) {
                                            int i9 = iArr[i8];
                                            int iM9530g = parsableBitArray.m9530g(iCeil);
                                            int i10 = i9 + ((iM9530g >> 1) ^ (-(iM9530g & 1)));
                                            if (i10 >= iM9554g3 || i10 < 0) {
                                                break;
                                            }
                                            fArr2[i7] = fArr[i10];
                                            iArr[i8] = i10;
                                            i8++;
                                            i7++;
                                            i5 = 5;
                                        }
                                        i6++;
                                        i5 = 5;
                                    } else {
                                        parsableBitArray.m9536m((parsableBitArray.m9528e() + 7) & (-8));
                                        int i11 = 32;
                                        int iM9530g2 = parsableBitArray.m9530g(32);
                                        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[iM9530g2];
                                        int i12 = 0;
                                        while (i12 < iM9530g2) {
                                            int iM9530g3 = parsableBitArray.m9530g(8);
                                            int iM9530g4 = parsableBitArray.m9530g(8);
                                            int iM9530g5 = parsableBitArray.m9530g(i11);
                                            if (iM9530g5 <= 128000) {
                                                int i13 = iM9530g2;
                                                float[] fArr3 = fArr2;
                                                int iCeil2 = (int) Math.ceil(Math.log(((double) iM9554g4) * 2.0d) / dLog);
                                                float[] fArr4 = new float[iM9530g5 * 3];
                                                float[] fArr5 = new float[iM9530g5 * 2];
                                                i = i3;
                                                int i14 = 0;
                                                int i15 = 0;
                                                while (i14 < iM9530g5) {
                                                    int iM9530g6 = parsableBitArray.m9530g(iCeil2);
                                                    ParsableBitArray parsableBitArray2 = parsableBitArray;
                                                    int i16 = i15 + ((iM9530g6 >> 1) ^ (-(iM9530g6 & 1)));
                                                    if (i16 >= 0 && i16 < iM9554g4) {
                                                        int i17 = i14 * 3;
                                                        int i18 = i16 * 5;
                                                        fArr4[i17] = fArr3[i18];
                                                        fArr4[i17 + 1] = fArr3[i18 + 1];
                                                        fArr4[i17 + 2] = fArr3[i18 + 2];
                                                        int i19 = i14 * 2;
                                                        fArr5[i19] = fArr3[i18 + 3];
                                                        fArr5[i19 + 1] = fArr3[i18 + 4];
                                                        i14++;
                                                        i15 = i16;
                                                        parsableBitArray = parsableBitArray2;
                                                    }
                                                }
                                                subMeshArr[i12] = new Projection.SubMesh(iM9530g3, iM9530g4, fArr4, fArr5);
                                                i12++;
                                                iM9530g2 = i13;
                                                fArr2 = fArr3;
                                                i3 = i;
                                                parsableBitArray = parsableBitArray;
                                                i11 = 32;
                                            }
                                        }
                                        i = i3;
                                        mesh = new Projection.Mesh(subMeshArr);
                                        arrayList = arrayList6;
                                    }
                                }
                                i = i3;
                                mesh = arrayList6;
                                arrayList = arrayList6;
                                break;
                            }
                            if (mesh != null) {
                            }
                        }
                    } else {
                        c2 = c3;
                        arrayList = arrayList2;
                        z2 = z3;
                        i = i3;
                    }
                    parsableByteArray2.m9546G(iM9554g2);
                    i2 = iM9554g2;
                    c3 = c2;
                    z3 = z2;
                    arrayList2 = arrayList;
                    i3 = i;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }
}
