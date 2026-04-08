package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public final class CorePalette {

    /* JADX INFO: renamed from: a1 */
    public TonalPalette f42432a1;

    /* JADX INFO: renamed from: a2 */
    public TonalPalette f42433a2;

    /* JADX INFO: renamed from: a3 */
    public TonalPalette f42434a3;
    public TonalPalette error;

    /* JADX INFO: renamed from: n1 */
    public TonalPalette f42435n1;

    /* JADX INFO: renamed from: n2 */
    public TonalPalette f42436n2;

    private CorePalette(int i, boolean z2) {
        Hct hctFromInt = Hct.fromInt(i);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z2) {
            this.f42432a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f42433a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f42434a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f42435n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f42436n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f42432a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f42433a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f42434a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f42435n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f42436n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i) {
        return new CorePalette(i, true);
    }

    /* JADX INFO: renamed from: of */
    public static CorePalette m14513of(int i) {
        return new CorePalette(i, false);
    }
}
