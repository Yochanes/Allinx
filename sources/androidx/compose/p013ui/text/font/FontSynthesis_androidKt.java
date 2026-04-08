package androidx.compose.p013ui.text.font;

import android.graphics.Typeface;
import android.os.Build;
import androidx.activity.AbstractC0050i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FontSynthesis_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m6521a(int i, Object obj, Font font, FontWeight fontWeight, int i2) {
        Object[] objArr;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        if ((i & 1) == 0 || Intrinsics.m18594b(font.getWeight(), fontWeight)) {
            objArr = false;
        } else {
            FontWeight fontWeight2 = FontWeight.f20295d;
            if (fontWeight.m6523a(fontWeight2) >= 0 && Intrinsics.m18601i(font.getWeight().f20303a, fontWeight2.f20303a) < 0) {
                objArr = true;
            }
        }
        Object[] objArr2 = ((i & 2) == 0 || i2 == font.mo6510b()) ? false : true;
        if (objArr2 != true && objArr != true) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int i4 = objArr != false ? fontWeight.f20303a : font.getWeight().f20303a;
            if (objArr2 == false ? font.mo6510b() == 1 : i2 == 1) {
                z2 = true;
            }
            return AbstractC0050i.m198c((Typeface) obj, i4, z2);
        }
        Object[] objArr3 = objArr2 == true && i2 == 1;
        if (objArr3 == true && objArr == true) {
            i3 = 3;
        } else if (objArr == true) {
            i3 = 1;
        } else if (objArr3 != false) {
            i3 = 2;
        }
        return Typeface.create((Typeface) obj, i3);
    }
}
