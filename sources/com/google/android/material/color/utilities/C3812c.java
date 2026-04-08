package com.google.android.material.color.utilities;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.function.Function;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3812c implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialDynamicColors f42454b;

    public /* synthetic */ C3812c(MaterialDynamicColors materialDynamicColors, int i) {
        this.f42453a = i;
        this.f42454b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f42453a) {
            case 0:
                return MaterialDynamicColors.m14593Z1(this.f42454b, (DynamicScheme) obj);
            case 1:
                return MaterialDynamicColors.m14522C(this.f42454b, (DynamicScheme) obj);
            case 2:
                return MaterialDynamicColors.m14518A1(this.f42454b, (DynamicScheme) obj);
            case 3:
                return MaterialDynamicColors.m14566Q1(this.f42454b, (DynamicScheme) obj);
            case 4:
                return MaterialDynamicColors.m14551L1(this.f42454b, (DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.m14620g1(this.f42454b, (DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.m14625i0(this.f42454b, (DynamicScheme) obj);
            case 7:
                return MaterialDynamicColors.m14636m(this.f42454b, (DynamicScheme) obj);
            case 8:
                return MaterialDynamicColors.m14548K1(this.f42454b, (DynamicScheme) obj);
            case 9:
                return MaterialDynamicColors.m14520B0(this.f42454b, (DynamicScheme) obj);
            case 10:
                return MaterialDynamicColors.m14580V0(this.f42454b, (DynamicScheme) obj);
            case 11:
                return MaterialDynamicColors.m14525D(this.f42454b, (DynamicScheme) obj);
            case TYPE_BYTES_VALUE:
                return MaterialDynamicColors.m14519B(this.f42454b, (DynamicScheme) obj);
            case 13:
                return MaterialDynamicColors.m14643o0(this.f42454b, (DynamicScheme) obj);
            case 14:
                return MaterialDynamicColors.m14587X1(this.f42454b, (DynamicScheme) obj);
            case 15:
                return MaterialDynamicColors.m14638m1(this.f42454b, (DynamicScheme) obj);
            case 16:
                return MaterialDynamicColors.m14538H0(this.f42454b, (DynamicScheme) obj);
            case 17:
                return MaterialDynamicColors.m14672y(this.f42454b, (DynamicScheme) obj);
            case 18:
                return MaterialDynamicColors.m14677z1(this.f42454b, (DynamicScheme) obj);
            case 19:
                return MaterialDynamicColors.m14570S(this.f42454b, (DynamicScheme) obj);
            case 20:
                return MaterialDynamicColors.m14642o(this.f42454b, (DynamicScheme) obj);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return MaterialDynamicColors.m14592Z0(this.f42454b, (DynamicScheme) obj);
            case 22:
                return MaterialDynamicColors.m14530E1(this.f42454b, (DynamicScheme) obj);
            case ConnectionResult.API_DISABLED /* 23 */:
                return MaterialDynamicColors.m14564Q(this.f42454b, (DynamicScheme) obj);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return MaterialDynamicColors.m14660u(this.f42454b, (DynamicScheme) obj);
            case BuildConfig.VERSION_CODE /* 25 */:
                return MaterialDynamicColors.m14572S1(this.f42454b, (DynamicScheme) obj);
            case 26:
                return MaterialDynamicColors.m14615f0(this.f42454b, (DynamicScheme) obj);
            case 27:
                return MaterialDynamicColors.m14669x(this.f42454b, (DynamicScheme) obj);
            case 28:
                return MaterialDynamicColors.m14612e1(this.f42454b, (DynamicScheme) obj);
            default:
                return MaterialDynamicColors.m14543J(this.f42454b, (DynamicScheme) obj);
        }
    }
}
