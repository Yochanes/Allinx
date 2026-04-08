package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3816g implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42458a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialDynamicColors f42459b;

    public /* synthetic */ C3816g(MaterialDynamicColors materialDynamicColors, int i) {
        this.f42458a = i;
        this.f42459b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f42458a) {
            case 0:
                return MaterialDynamicColors.m14650q1(this.f42459b, (DynamicScheme) obj);
            case 1:
                return MaterialDynamicColors.m14665v1(this.f42459b, (DynamicScheme) obj);
            case 2:
                return MaterialDynamicColors.m14621h(this.f42459b, (DynamicScheme) obj);
            case 3:
                return MaterialDynamicColors.m14545J1(this.f42459b, (DynamicScheme) obj);
            case 4:
                return MaterialDynamicColors.m14517A0(this.f42459b, (DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.m14616f1(this.f42459b, (DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.m14655s0(this.f42459b, (DynamicScheme) obj);
            case 7:
                return MaterialDynamicColors.m14594a(this.f42459b, (DynamicScheme) obj);
            case 8:
                return MaterialDynamicColors.m14614f(this.f42459b, (DynamicScheme) obj);
            case 9:
                return MaterialDynamicColors.m14673y0(this.f42459b, (DynamicScheme) obj);
            default:
                return this.f42459b.highestSurface((DynamicScheme) obj);
        }
    }
}
