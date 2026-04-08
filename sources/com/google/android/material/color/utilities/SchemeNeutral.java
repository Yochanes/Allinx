package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public class SchemeNeutral extends DynamicScheme {
    public SchemeNeutral(Hct hct, boolean z2, double d) {
        super(hct, Variant.NEUTRAL, z2, d, TonalPalette.fromHueAndChroma(hct.getHue(), 12.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 8.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 2.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 2.0d));
    }
}
