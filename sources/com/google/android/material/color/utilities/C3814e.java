package com.google.android.material.color.utilities;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.function.Function;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3814e implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42456a;

    public /* synthetic */ C3814e(int i) {
        this.f42456a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f42456a) {
            case 0:
                return MaterialDynamicColors.m14671x1(dynamicScheme);
            case 1:
                return MaterialDynamicColors.m14617f2(dynamicScheme);
            case 2:
                return MaterialDynamicColors.m14560O1(dynamicScheme);
            case 3:
                return MaterialDynamicColors.m14630k(dynamicScheme);
            case 4:
                return MaterialDynamicColors.m14604c1(dynamicScheme);
            case 5:
                return MaterialDynamicColors.m14535G0(dynamicScheme);
            case 6:
                return MaterialDynamicColors.m14627j(dynamicScheme);
            case 7:
                return MaterialDynamicColors.m14656s1(dynamicScheme);
            case 8:
                return MaterialDynamicColors.m14605c2(dynamicScheme);
            case 9:
                return MaterialDynamicColors.m14663v(dynamicScheme);
            case 10:
                return MaterialDynamicColors.m14591Z(dynamicScheme);
            case 11:
                return MaterialDynamicColors.m14637m0(dynamicScheme);
            case TYPE_BYTES_VALUE:
                return MaterialDynamicColors.m14536G1(dynamicScheme);
            case 13:
                return MaterialDynamicColors.m14653r1(dynamicScheme);
            case 14:
                return MaterialDynamicColors.m14565Q0(dynamicScheme);
            case 15:
                return MaterialDynamicColors.m14581V1(dynamicScheme);
            case 16:
                return MaterialDynamicColors.m14657t(dynamicScheme);
            case 17:
                return MaterialDynamicColors.m14521B1(dynamicScheme);
            case 18:
                return MaterialDynamicColors.m14595a0(dynamicScheme);
            case 19:
                return MaterialDynamicColors.m14609d2(dynamicScheme);
            case 20:
                return MaterialDynamicColors.m14608d1(dynamicScheme);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return MaterialDynamicColors.m14667w0(dynamicScheme);
            case 22:
                return MaterialDynamicColors.m14533F1(dynamicScheme);
            case ConnectionResult.API_DISABLED /* 23 */:
                return MaterialDynamicColors.m14618g(dynamicScheme);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return MaterialDynamicColors.m14662u1(dynamicScheme);
            case BuildConfig.VERSION_CODE /* 25 */:
                return MaterialDynamicColors.m14552M(dynamicScheme);
            case 26:
                return MaterialDynamicColors.m14603c0(dynamicScheme);
            case 27:
                return MaterialDynamicColors.m14547K0(dynamicScheme);
            case 28:
                return MaterialDynamicColors.m14550L0(dynamicScheme);
            default:
                return MaterialDynamicColors.m14576U(dynamicScheme);
        }
    }
}
