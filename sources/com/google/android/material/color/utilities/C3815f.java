package com.google.android.material.color.utilities;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.function.Function;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3815f implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42457a;

    public /* synthetic */ C3815f(int i) {
        this.f42457a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f42457a) {
            case 0:
                return MaterialDynamicColors.m14596a1(dynamicScheme);
            case 1:
                return MaterialDynamicColors.m14557N1(dynamicScheme);
            case 2:
                return MaterialDynamicColors.m14647p1(dynamicScheme);
            case 3:
                return MaterialDynamicColors.m14602c(dynamicScheme);
            case 4:
                return MaterialDynamicColors.m14559O0(dynamicScheme);
            case 5:
                return MaterialDynamicColors.m14628j0(dynamicScheme);
            case 6:
                return MaterialDynamicColors.m14539H1(dynamicScheme);
            case 7:
                return MaterialDynamicColors.m14569R1(dynamicScheme);
            case 8:
                return MaterialDynamicColors.m14598b(dynamicScheme);
            case 9:
                return MaterialDynamicColors.m14634l0(dynamicScheme);
            case 10:
                return MaterialDynamicColors.m14589Y0(dynamicScheme);
            case 11:
                return MaterialDynamicColors.m14531F(dynamicScheme);
            case TYPE_BYTES_VALUE:
                return MaterialDynamicColors.m14574T0(dynamicScheme);
            case 13:
                return MaterialDynamicColors.m14668w1(dynamicScheme);
            case 14:
                return MaterialDynamicColors.m14562P0(dynamicScheme);
            case 15:
                return MaterialDynamicColors.m14585X(dynamicScheme);
            case 16:
                return MaterialDynamicColors.m14524C1(dynamicScheme);
            case 17:
                return MaterialDynamicColors.m14567R(dynamicScheme);
            case 18:
                return MaterialDynamicColors.m14658t0(dynamicScheme);
            case 19:
                return MaterialDynamicColors.m14664v0(dynamicScheme);
            case 20:
                return MaterialDynamicColors.m14549L(dynamicScheme);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return MaterialDynamicColors.m14590Y1(dynamicScheme);
            case 22:
                return MaterialDynamicColors.m14561P(dynamicScheme);
            case ConnectionResult.API_DISABLED /* 23 */:
                return MaterialDynamicColors.m14606d(dynamicScheme);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return MaterialDynamicColors.m14546K(dynamicScheme);
            case BuildConfig.VERSION_CODE /* 25 */:
                return MaterialDynamicColors.m14571S0(dynamicScheme);
            case 26:
                return MaterialDynamicColors.m14586X0(dynamicScheme);
            case 27:
                return MaterialDynamicColors.m14646p0(dynamicScheme);
            case 28:
                return MaterialDynamicColors.m14622h0(dynamicScheme);
            default:
                return MaterialDynamicColors.m14584W1(dynamicScheme);
        }
    }
}
