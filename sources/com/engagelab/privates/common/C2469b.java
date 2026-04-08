package com.engagelab.privates.common;

import android.content.Context;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;

/* JADX INFO: renamed from: com.engagelab.privates.common.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2469b {

    /* JADX INFO: renamed from: c */
    public static volatile C2469b f35116c;

    /* JADX INFO: renamed from: a */
    public long f35117a = 0;

    /* JADX INFO: renamed from: b */
    public long f35118b = 0;

    /* JADX INFO: renamed from: a */
    public static C2469b m12899a() {
        if (f35116c == null) {
            synchronized (C2469b.class) {
                f35116c = new C2469b();
            }
        }
        return f35116c;
    }

    /* JADX INFO: renamed from: b */
    public void m12901b(Context context) {
        if (C2485m.m13029c(context)) {
            if (!C2473d.m12935a().m12940b()) {
                MTCommonLog.m13010d("MTActiveBusiness", "re connect toForeground");
                MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.START_CONNECT, null);
            } else {
                if (this.f35118b == 0) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f35117a = jCurrentTimeMillis;
                if (jCurrentTimeMillis - this.f35118b < MTCoreGlobal.getHeartbeatInterval() / 2) {
                    return;
                }
                MTCommonLog.m13010d("MTActiveBusiness", "re heartbeat");
                C2473d.m12935a().m12945g(context);
                C2473d.m12935a().m12943e(context);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m12900a(Context context) {
        if (C2485m.m13029c(context)) {
            this.f35118b = System.currentTimeMillis();
        }
    }
}
