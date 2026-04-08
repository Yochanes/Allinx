package com.google.android.material.color.utilities;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.function.Function;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3811b implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42452a;

    public /* synthetic */ C3811b(int i) {
        this.f42452a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f42452a) {
            case 0:
                return MaterialDynamicColors.m14641n1(dynamicScheme);
            case 1:
                return MaterialDynamicColors.m14601b2(dynamicScheme);
            case 2:
                return MaterialDynamicColors.m14555N(dynamicScheme);
            case 3:
                return MaterialDynamicColors.m14633l(dynamicScheme);
            case 4:
                return MaterialDynamicColors.m14639n(dynamicScheme);
            case 5:
                return MaterialDynamicColors.m14640n0(dynamicScheme);
            case 6:
                return MaterialDynamicColors.m14654s(dynamicScheme);
            case 7:
                return MaterialDynamicColors.m14610e(dynamicScheme);
            case 8:
                return MaterialDynamicColors.m14534G(dynamicScheme);
            case 9:
                return MaterialDynamicColors.m14599b0(dynamicScheme);
            case 10:
                return MaterialDynamicColors.m14611e0(dynamicScheme);
            case 11:
                return MaterialDynamicColors.m14532F0(dynamicScheme);
            case TYPE_BYTES_VALUE:
                return MaterialDynamicColors.m14624i(dynamicScheme);
            case 13:
                return MaterialDynamicColors.m14529E0(dynamicScheme);
            case 14:
                return MaterialDynamicColors.m14613e2(dynamicScheme);
            case 15:
                return MaterialDynamicColors.m14523C0(dynamicScheme);
            case 16:
                return MaterialDynamicColors.m14579V(dynamicScheme);
            case 17:
                return MaterialDynamicColors.m14597a2(dynamicScheme);
            case 18:
                return MaterialDynamicColors.m14652r0(dynamicScheme);
            case 19:
                return MaterialDynamicColors.m14645p(dynamicScheme);
            case 20:
                return MaterialDynamicColors.m14659t1(dynamicScheme);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return MaterialDynamicColors.m14575T1(dynamicScheme);
            case 22:
                return MaterialDynamicColors.m14619g0(dynamicScheme);
            case ConnectionResult.API_DISABLED /* 23 */:
                return MaterialDynamicColors.m14676z0(dynamicScheme);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return MaterialDynamicColors.m14588Y(dynamicScheme);
            case BuildConfig.VERSION_CODE /* 25 */:
                return MaterialDynamicColors.m14583W0(dynamicScheme);
            case 26:
                return MaterialDynamicColors.m14540I(dynamicScheme);
            case 27:
                return MaterialDynamicColors.m14537H(dynamicScheme);
            case 28:
                return MaterialDynamicColors.m14666w(dynamicScheme);
            default:
                return MaterialDynamicColors.m14542I1(dynamicScheme);
        }
    }
}
