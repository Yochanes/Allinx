package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ArgbEvaluator implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM4a = AbstractC0000a.m4a(f3, f2, f, f2);
        float fM4a2 = AbstractC0000a.m4a(fPow4, fPow, f, fPow);
        float fM4a3 = AbstractC0000a.m4a(fPow5, fPow2, f, fPow2);
        float fM4a4 = AbstractC0000a.m4a(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fM4a2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM4a3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM4a4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM4a * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
