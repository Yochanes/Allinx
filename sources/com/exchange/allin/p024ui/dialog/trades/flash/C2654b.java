package com.exchange.allin.p024ui.dialog.trades.flash;

import androidx.compose.runtime.MutableState;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.flash.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2654b implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36355a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f36356b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MutableState f36357c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MutableState f36358d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MutableState f36359f;

    public /* synthetic */ C2654b(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i) {
        this.f36355a = i;
        this.f36356b = mutableState;
        this.f36357c = mutableState2;
        this.f36358d = mutableState3;
        this.f36359f = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36355a) {
            case 0:
                MutableState mutableState = this.f36356b;
                int iIntValue = ((Number) mutableState.getValue()).intValue();
                mutableState.setValue(Integer.valueOf(iIntValue != 0 ? iIntValue != 1 ? 0 : -1 : 1));
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 1:
                this.f36356b.setValue(0);
                MutableState mutableState2 = this.f36357c;
                int iIntValue2 = ((Number) mutableState2.getValue()).intValue();
                mutableState2.setValue(Integer.valueOf(iIntValue2 != 0 ? iIntValue2 != 1 ? 0 : -1 : 1));
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 2:
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                MutableState mutableState3 = this.f36358d;
                int iIntValue3 = ((Number) mutableState3.getValue()).intValue();
                mutableState3.setValue(Integer.valueOf(iIntValue3 != 0 ? iIntValue3 != 1 ? 0 : -1 : 1));
                this.f36359f.setValue(0);
                break;
            case 3:
                int i = 0;
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                MutableState mutableState4 = this.f36359f;
                int iIntValue4 = ((Number) mutableState4.getValue()).intValue();
                if (iIntValue4 == 0) {
                    i = 1;
                } else if (iIntValue4 == 1) {
                    i = -1;
                }
                mutableState4.setValue(Integer.valueOf(i));
                break;
            case 4:
                MutableState mutableState5 = this.f36356b;
                int iIntValue5 = ((Number) mutableState5.getValue()).intValue();
                mutableState5.setValue(Integer.valueOf(iIntValue5 != 0 ? iIntValue5 != 1 ? 0 : -1 : 1));
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 5:
                this.f36356b.setValue(0);
                MutableState mutableState6 = this.f36357c;
                int iIntValue6 = ((Number) mutableState6.getValue()).intValue();
                mutableState6.setValue(Integer.valueOf(iIntValue6 != 0 ? iIntValue6 != 1 ? 0 : -1 : 1));
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 6:
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                MutableState mutableState7 = this.f36358d;
                int iIntValue7 = ((Number) mutableState7.getValue()).intValue();
                mutableState7.setValue(Integer.valueOf(iIntValue7 != 0 ? iIntValue7 != 1 ? 0 : -1 : 1));
                this.f36359f.setValue(0);
                break;
            case 7:
                int i2 = 0;
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                MutableState mutableState8 = this.f36359f;
                int iIntValue8 = ((Number) mutableState8.getValue()).intValue();
                if (iIntValue8 == 0) {
                    i2 = 1;
                } else if (iIntValue8 == 1) {
                    i2 = -1;
                }
                mutableState8.setValue(Integer.valueOf(i2));
                break;
            case 8:
                MutableState mutableState9 = this.f36356b;
                int iIntValue9 = ((Number) mutableState9.getValue()).intValue();
                mutableState9.setValue(Integer.valueOf(iIntValue9 != 0 ? iIntValue9 != 1 ? 0 : -1 : 1));
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 9:
                this.f36356b.setValue(0);
                MutableState mutableState10 = this.f36357c;
                int iIntValue10 = ((Number) mutableState10.getValue()).intValue();
                mutableState10.setValue(Integer.valueOf(iIntValue10 != 0 ? iIntValue10 != 1 ? 0 : -1 : 1));
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 10:
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                MutableState mutableState11 = this.f36358d;
                int iIntValue11 = ((Number) mutableState11.getValue()).intValue();
                mutableState11.setValue(Integer.valueOf(iIntValue11 != 0 ? iIntValue11 != 1 ? 0 : -1 : 1));
                this.f36359f.setValue(0);
                break;
            case 11:
                int i3 = 0;
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                MutableState mutableState12 = this.f36359f;
                int iIntValue12 = ((Number) mutableState12.getValue()).intValue();
                if (iIntValue12 == 0) {
                    i3 = 1;
                } else if (iIntValue12 == 1) {
                    i3 = -1;
                }
                mutableState12.setValue(Integer.valueOf(i3));
                break;
            case TYPE_BYTES_VALUE:
                MutableState mutableState13 = this.f36356b;
                int iIntValue13 = ((Number) mutableState13.getValue()).intValue();
                mutableState13.setValue(Integer.valueOf(iIntValue13 != 0 ? iIntValue13 != 1 ? 0 : -1 : 1));
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 13:
                this.f36356b.setValue(0);
                MutableState mutableState14 = this.f36357c;
                int iIntValue14 = ((Number) mutableState14.getValue()).intValue();
                mutableState14.setValue(Integer.valueOf(iIntValue14 != 0 ? iIntValue14 != 1 ? 0 : -1 : 1));
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 14:
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                MutableState mutableState15 = this.f36358d;
                int iIntValue15 = ((Number) mutableState15.getValue()).intValue();
                mutableState15.setValue(Integer.valueOf(iIntValue15 != 0 ? iIntValue15 != 1 ? 0 : -1 : 1));
                this.f36359f.setValue(0);
                break;
            case 15:
                int i4 = 0;
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                MutableState mutableState16 = this.f36359f;
                int iIntValue16 = ((Number) mutableState16.getValue()).intValue();
                if (iIntValue16 == 0) {
                    i4 = 1;
                } else if (iIntValue16 == 1) {
                    i4 = -1;
                }
                mutableState16.setValue(Integer.valueOf(i4));
                break;
            case 16:
                MutableState mutableState17 = this.f36356b;
                int iIntValue17 = ((Number) mutableState17.getValue()).intValue();
                mutableState17.setValue(Integer.valueOf(iIntValue17 != 0 ? iIntValue17 != 1 ? 0 : -1 : 1));
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 17:
                this.f36356b.setValue(0);
                MutableState mutableState18 = this.f36357c;
                int iIntValue18 = ((Number) mutableState18.getValue()).intValue();
                mutableState18.setValue(Integer.valueOf(iIntValue18 != 0 ? iIntValue18 != 1 ? 0 : -1 : 1));
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 18:
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                MutableState mutableState19 = this.f36358d;
                int iIntValue19 = ((Number) mutableState19.getValue()).intValue();
                mutableState19.setValue(Integer.valueOf(iIntValue19 != 0 ? iIntValue19 != 1 ? 0 : -1 : 1));
                this.f36359f.setValue(0);
                break;
            case 19:
                int i5 = 0;
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                MutableState mutableState20 = this.f36359f;
                int iIntValue20 = ((Number) mutableState20.getValue()).intValue();
                if (iIntValue20 == 0) {
                    i5 = 1;
                } else if (iIntValue20 == 1) {
                    i5 = -1;
                }
                mutableState20.setValue(Integer.valueOf(i5));
                break;
            case 20:
                MutableState mutableState21 = this.f36356b;
                int iIntValue21 = ((Number) mutableState21.getValue()).intValue();
                mutableState21.setValue(Integer.valueOf(iIntValue21 != 0 ? iIntValue21 != 1 ? 0 : -1 : 1));
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                this.f36356b.setValue(0);
                MutableState mutableState22 = this.f36357c;
                int iIntValue22 = ((Number) mutableState22.getValue()).intValue();
                mutableState22.setValue(Integer.valueOf(iIntValue22 != 0 ? iIntValue22 != 1 ? 0 : -1 : 1));
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 22:
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                MutableState mutableState23 = this.f36358d;
                int iIntValue23 = ((Number) mutableState23.getValue()).intValue();
                mutableState23.setValue(Integer.valueOf(iIntValue23 != 0 ? iIntValue23 != 1 ? 0 : -1 : 1));
                this.f36359f.setValue(0);
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                int i6 = 0;
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                MutableState mutableState24 = this.f36359f;
                int iIntValue24 = ((Number) mutableState24.getValue()).intValue();
                if (iIntValue24 == 0) {
                    i6 = 1;
                } else if (iIntValue24 == 1) {
                    i6 = -1;
                }
                mutableState24.setValue(Integer.valueOf(i6));
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                MutableState mutableState25 = this.f36356b;
                int iIntValue25 = ((Number) mutableState25.getValue()).intValue();
                mutableState25.setValue(Integer.valueOf(iIntValue25 != 0 ? iIntValue25 != 1 ? 0 : -1 : 1));
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                this.f36356b.setValue(0);
                MutableState mutableState26 = this.f36357c;
                int iIntValue26 = ((Number) mutableState26.getValue()).intValue();
                mutableState26.setValue(Integer.valueOf(iIntValue26 != 0 ? iIntValue26 != 1 ? 0 : -1 : 1));
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            case 26:
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                MutableState mutableState27 = this.f36358d;
                int iIntValue27 = ((Number) mutableState27.getValue()).intValue();
                mutableState27.setValue(Integer.valueOf(iIntValue27 != 0 ? iIntValue27 != 1 ? 0 : -1 : 1));
                this.f36359f.setValue(0);
                break;
            case 27:
                int i7 = 0;
                this.f36356b.setValue(0);
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                MutableState mutableState28 = this.f36359f;
                int iIntValue28 = ((Number) mutableState28.getValue()).intValue();
                if (iIntValue28 == 0) {
                    i7 = 1;
                } else if (iIntValue28 == 1) {
                    i7 = -1;
                }
                mutableState28.setValue(Integer.valueOf(i7));
                break;
            case 28:
                MutableState mutableState29 = this.f36356b;
                int iIntValue29 = ((Number) mutableState29.getValue()).intValue();
                mutableState29.setValue(Integer.valueOf(iIntValue29 != 0 ? iIntValue29 != 1 ? 0 : -1 : 1));
                this.f36357c.setValue(0);
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
            default:
                this.f36356b.setValue(0);
                MutableState mutableState30 = this.f36357c;
                int iIntValue30 = ((Number) mutableState30.getValue()).intValue();
                mutableState30.setValue(Integer.valueOf(iIntValue30 != 0 ? iIntValue30 != 1 ? 0 : -1 : 1));
                this.f36358d.setValue(0);
                this.f36359f.setValue(0);
                break;
        }
        return Unit.f51459a;
    }
}
