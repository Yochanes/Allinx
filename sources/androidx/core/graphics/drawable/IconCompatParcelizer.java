package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        int iMo12046k = iconCompat.f23229a;
        if (versionedParcel.mo12045j(1)) {
            iMo12046k = versionedParcel.mo12046k();
        }
        iconCompat.f23229a = iMo12046k;
        byte[] bArrMo12043h = iconCompat.f23231c;
        if (versionedParcel.mo12045j(2)) {
            bArrMo12043h = versionedParcel.mo12043h();
        }
        iconCompat.f23231c = bArrMo12043h;
        Parcelable parcelableMo12047l = iconCompat.f23232d;
        if (versionedParcel.mo12045j(3)) {
            parcelableMo12047l = versionedParcel.mo12047l();
        }
        iconCompat.f23232d = parcelableMo12047l;
        int iMo12046k2 = iconCompat.f23233e;
        if (versionedParcel.mo12045j(4)) {
            iMo12046k2 = versionedParcel.mo12046k();
        }
        iconCompat.f23233e = iMo12046k2;
        int iMo12046k3 = iconCompat.f23234f;
        if (versionedParcel.mo12045j(5)) {
            iMo12046k3 = versionedParcel.mo12046k();
        }
        iconCompat.f23234f = iMo12046k3;
        Parcelable parcelableMo12047l2 = iconCompat.f23235g;
        if (versionedParcel.mo12045j(6)) {
            parcelableMo12047l2 = versionedParcel.mo12047l();
        }
        iconCompat.f23235g = (ColorStateList) parcelableMo12047l2;
        String strMo12048m = iconCompat.f23237i;
        if (versionedParcel.mo12045j(7)) {
            strMo12048m = versionedParcel.mo12048m();
        }
        iconCompat.f23237i = strMo12048m;
        String strMo12048m2 = iconCompat.f23238j;
        if (versionedParcel.mo12045j(8)) {
            strMo12048m2 = versionedParcel.mo12048m();
        }
        iconCompat.f23238j = strMo12048m2;
        iconCompat.f23236h = PorterDuff.Mode.valueOf(iconCompat.f23237i);
        switch (iconCompat.f23229a) {
            case -1:
                Parcelable parcelable = iconCompat.f23232d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f23230b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f23232d;
                if (parcelable2 != null) {
                    iconCompat.f23230b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.f23231c;
                iconCompat.f23230b = bArr;
                iconCompat.f23229a = 3;
                iconCompat.f23233e = 0;
                iconCompat.f23234f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f23231c, Charset.forName("UTF-16"));
                iconCompat.f23230b = str;
                if (iconCompat.f23229a == 2 && iconCompat.f23238j == null) {
                    iconCompat.f23238j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f23230b = iconCompat.f23231c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo12051p(true, true);
        boolean zM12041f = versionedParcel.m12041f();
        iconCompat.f23237i = iconCompat.f23236h.name();
        switch (iconCompat.f23229a) {
            case -1:
                if (zM12041f) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                iconCompat.f23232d = (Parcelable) iconCompat.f23230b;
                break;
            case 1:
            case 5:
                if (!zM12041f) {
                    iconCompat.f23232d = (Parcelable) iconCompat.f23230b;
                } else {
                    Bitmap bitmap = (Bitmap) iconCompat.f23230b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    iconCompat.f23231c = byteArrayOutputStream.toByteArray();
                }
                break;
            case 2:
                iconCompat.f23231c = ((String) iconCompat.f23230b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f23231c = (byte[]) iconCompat.f23230b;
                break;
            case 4:
            case 6:
                iconCompat.f23231c = iconCompat.f23230b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f23229a;
        if (-1 != i) {
            versionedParcel.mo12050o(1);
            versionedParcel.mo12055t(i);
        }
        byte[] bArr = iconCompat.f23231c;
        if (bArr != null) {
            versionedParcel.mo12050o(2);
            versionedParcel.mo12053r(bArr);
        }
        Parcelable parcelable = iconCompat.f23232d;
        if (parcelable != null) {
            versionedParcel.mo12050o(3);
            versionedParcel.mo12056u(parcelable);
        }
        int i2 = iconCompat.f23233e;
        if (i2 != 0) {
            versionedParcel.mo12050o(4);
            versionedParcel.mo12055t(i2);
        }
        int i3 = iconCompat.f23234f;
        if (i3 != 0) {
            versionedParcel.mo12050o(5);
            versionedParcel.mo12055t(i3);
        }
        ColorStateList colorStateList = iconCompat.f23235g;
        if (colorStateList != null) {
            versionedParcel.mo12050o(6);
            versionedParcel.mo12056u(colorStateList);
        }
        String str = iconCompat.f23237i;
        if (str != null) {
            versionedParcel.mo12050o(7);
            versionedParcel.mo12057v(str);
        }
        String str2 = iconCompat.f23238j;
        if (str2 != null) {
            versionedParcel.mo12050o(8);
            versionedParcel.mo12057v(str2);
        }
    }
}
