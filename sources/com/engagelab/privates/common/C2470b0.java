package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObserver;
import com.engagelab.privates.push.constants.MTPushConstants;

/* JADX INFO: renamed from: com.engagelab.privates.common.b0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2470b0 {

    /* JADX INFO: renamed from: d */
    public static volatile C2470b0 f35119d;

    /* JADX INFO: renamed from: a */
    public Bundle f35120a;

    /* JADX INFO: renamed from: b */
    public boolean f35121b = false;

    /* JADX INFO: renamed from: c */
    public boolean f35122c = false;

    /* JADX INFO: renamed from: a */
    public static C2470b0 m12902a() {
        if (f35119d == null) {
            synchronized (C2470b0.class) {
                f35119d = new C2470b0();
            }
        }
        return f35119d;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m12906b(Context context, Bundle bundle) {
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.OTH_SOUND_MESSAGE, bundle);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m12904a(Context context, Bundle bundle) {
        Bundle bundle2;
        try {
            MTCommonLog.m13010d("MTSoundBusiness", "on_tcp_connected init:" + this.f35121b);
            if (this.f35121b) {
                return;
            }
            m12903a(context);
            if (bundle != null && (bundle2 = this.f35120a) != null) {
                bundle.putAll(bundle2);
            }
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.OTH_SOUND_INIT, bundle);
            this.f35121b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12903a(Context context) {
        try {
            MTCommonPrivatesApi.observer(context, (MTObserver) Class.forName("com.engagelab.privates.push.oth.sound.OTHSound").newInstance());
            this.f35122c = true;
        } catch (Throwable unused) {
            MTCommonLog.m13010d("MTSoundBusiness", "not integrated OTHSound.aar");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m12905a(Context context, boolean z2) {
        try {
            MTCommonLog.m13010d("MTSoundBusiness", "setEnablePushTextToSpeech");
            Bundle bundle = new Bundle();
            bundle.putBoolean(MTPushConstants.OTHConfig.OTH_SOUND_ENABLE_SET, z2);
            if (this.f35121b && this.f35122c) {
                MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.OTH_SOUND_ENABLE_SET, bundle);
            } else {
                this.f35120a = bundle;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
