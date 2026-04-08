package androidx.media3.common.util;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.core.view.AbstractC1463a;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.NetworkTypeObserver.Receiver;
import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: renamed from: androidx.media3.common.util.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1750c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f25681b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f25682c;

    public /* synthetic */ RunnableC1750c(int i, Object obj, Object obj2) {
        this.f25680a = i;
        this.f25682c = obj;
        this.f25681b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.f25680a) {
            case 0:
                NetworkTypeObserver networkTypeObserver = (NetworkTypeObserver) this.f25682c;
                networkTypeObserver.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f25681b).registerReceiver(networkTypeObserver.new Receiver(), intentFilter);
                break;
            case 1:
                NetworkTypeObserver networkTypeObserver2 = NetworkTypeObserver.this;
                networkTypeObserver2.getClass();
                Context context = (Context) this.f25681b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case TYPE_BYTES_VALUE:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Util.f25665a >= 29) {
                                            i = 9;
                                        }
                                        break;
                                }
                            } else if (type != 1) {
                                if (type != 4 && type != 5) {
                                    if (type != 6) {
                                        i = type != 9 ? 8 : 7;
                                    }
                                }
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Util.f25665a < 31 || i != 5) {
                    networkTypeObserver2.m9522d(i);
                } else {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(AttributeType.PHONE);
                        telephonyManager.getClass();
                        NetworkTypeObserver.Api31.DisplayInfoCallback displayInfoCallback = new NetworkTypeObserver.Api31.DisplayInfoCallback(networkTypeObserver2);
                        AbstractC1463a.m7995t(telephonyManager, networkTypeObserver2.f25627a, displayInfoCallback);
                        AbstractC1463a.m7994s(telephonyManager, displayInfoCallback);
                    } catch (RuntimeException unused2) {
                        networkTypeObserver2.m9522d(5);
                        return;
                    }
                }
                break;
            default:
                BackgroundThreadStateHandler backgroundThreadStateHandler = (BackgroundThreadStateHandler) this.f25682c;
                backgroundThreadStateHandler.getClass();
                Object obj = this.f25681b;
                Object obj2 = backgroundThreadStateHandler.f25577d;
                backgroundThreadStateHandler.f25577d = obj;
                if (!obj2.equals(obj)) {
                    backgroundThreadStateHandler.f25576c.mo9468a(obj2, obj);
                }
                break;
        }
    }
}
