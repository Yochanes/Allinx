package com.google.android.material.color.utilities;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.function.Function;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3813d implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42455a;

    public /* synthetic */ C3813d(int i) {
        this.f42455a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f42455a) {
            case 0:
                return MaterialDynamicColors.m14674y1(dynamicScheme);
            case 1:
                return MaterialDynamicColors.m14568R0(dynamicScheme);
            case 2:
                return MaterialDynamicColors.m14526D0(dynamicScheme);
            case 3:
                return MaterialDynamicColors.m14626i1(dynamicScheme);
            case 4:
                return MaterialDynamicColors.m14648q(dynamicScheme);
            case 5:
                return MaterialDynamicColors.m14675z(dynamicScheme);
            case 6:
                return MaterialDynamicColors.m14554M1(dynamicScheme);
            case 7:
                return MaterialDynamicColors.m14644o1(dynamicScheme);
            case 8:
                return MaterialDynamicColors.m14635l1(dynamicScheme);
            case 9:
                return MaterialDynamicColors.m14553M0(dynamicScheme);
            case 10:
                return MaterialDynamicColors.m14629j1(dynamicScheme);
            case 11:
                return MaterialDynamicColors.m14632k1(dynamicScheme);
            case TYPE_BYTES_VALUE:
                return MaterialDynamicColors.m14516A(dynamicScheme);
            case 13:
                return MaterialDynamicColors.m14541I0(dynamicScheme);
            case 14:
                return MaterialDynamicColors.m14556N0(dynamicScheme);
            case 15:
                return MaterialDynamicColors.m14577U0(dynamicScheme);
            case 16:
                return MaterialDynamicColors.m14573T(dynamicScheme);
            case 17:
                return MaterialDynamicColors.m14578U1(dynamicScheme);
            case 18:
                return MaterialDynamicColors.m14582W(dynamicScheme);
            case 19:
                return MaterialDynamicColors.m14651r(dynamicScheme);
            case 20:
                return MaterialDynamicColors.m14527D1(dynamicScheme);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return MaterialDynamicColors.m14607d0(dynamicScheme);
            case 22:
                return MaterialDynamicColors.m14631k0(dynamicScheme);
            case ConnectionResult.API_DISABLED /* 23 */:
                return MaterialDynamicColors.m14661u0(dynamicScheme);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return MaterialDynamicColors.m14558O(dynamicScheme);
            case BuildConfig.VERSION_CODE /* 25 */:
                return MaterialDynamicColors.m14670x0(dynamicScheme);
            case 26:
                return MaterialDynamicColors.m14649q0(dynamicScheme);
            case 27:
                return MaterialDynamicColors.m14600b1(dynamicScheme);
            case 28:
                return MaterialDynamicColors.m14544J0(dynamicScheme);
            default:
                return MaterialDynamicColors.m14528E(dynamicScheme);
        }
    }
}
