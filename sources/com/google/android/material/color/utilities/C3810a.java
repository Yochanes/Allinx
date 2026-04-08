package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3810a implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42450a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42451b;

    public /* synthetic */ C3810a(Object obj, int i) {
        this.f42450a = i;
        this.f42451b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f42450a) {
            case 0:
                return DynamicColor.m14515b((TonalPalette) this.f42451b, (DynamicScheme) obj);
            case 1:
                return DynamicColor.m14514a((Hct) this.f42451b, (DynamicScheme) obj);
            default:
                return TemperatureCache.m14678a((TemperatureCache) this.f42451b, (Hct) obj);
        }
    }
}
