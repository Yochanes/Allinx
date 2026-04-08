package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public class SchemeMonochrome extends DynamicScheme {
    public SchemeMonochrome(Hct hct, boolean z2, double d) {
        super(hct, Variant.MONOCHROME, z2, d, TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d));
    }
}
