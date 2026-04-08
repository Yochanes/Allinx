package com.engagelab.privates.common.business.lifecycle;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonService;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTLifecycleBusiness {
    private static final String TAG = "MTLifecycleBusiness";
    private static volatile MTLifecycleBusiness instance;
    private MTLifecycleListener lifecycleListener;
    private boolean init = false;
    private int activityFlag = 0;
    private boolean startServiceFlag = false;

    public static MTLifecycleBusiness getInstance() {
        if (instance == null) {
            synchronized (MTLifecycleBusiness.class) {
                instance = new MTLifecycleBusiness();
            }
        }
        return instance;
    }

    private void startCommonService(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && !this.startServiceFlag && MTGlobal.isNeedRemoteProcess) {
            this.startServiceFlag = true;
            MTCommonService commonService = MTGlobal.getCommonService(context);
            if (commonService == null) {
                return;
            }
            Intent intent = new Intent();
            intent.setClass(context, commonService.getClass());
            context.startService(intent);
        }
    }

    public void init(Context context) {
        if (this.init) {
            return;
        }
        this.init = true;
        MTLifecycleListener mTLifecycleListener = new MTLifecycleListener();
        this.lifecycleListener = mTLifecycleListener;
        ((Application) context).registerActivityLifecycleCallbacks(mTLifecycleListener);
    }

    public void onActivityResumed(Context context, Bundle bundle) {
        MTGlobal.setCurrentActivityName(bundle.getString(MTCommonConstants.Lifecycle.KEY_ACTIVITY));
    }

    public void onMainLifecycleState(Context context, Bundle bundle) {
        boolean z2 = bundle.getBoolean("state");
        MTGlobal.setLifecycleState(z2);
        if (z2) {
            if (this.activityFlag == 0) {
                startCommonService(context);
                MTCommonLog.m13010d(TAG, "toForeground currentActivity:" + MTGlobal.getCurrentActivityName());
                MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCommonConstants.MainWhat.TO_FOREGROUND, bundle);
                if (MTGlobal.isNeedRemoteProcess) {
                    MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCommonConstants.RemoteWhat.TO_FOREGROUND, bundle);
                }
            }
            this.activityFlag++;
            return;
        }
        int i = this.activityFlag;
        if (i > 0) {
            this.activityFlag = i - 1;
        }
        if (this.activityFlag == 0) {
            MTCommonLog.m13010d(TAG, "toBackground currentActivity:" + MTGlobal.getCurrentActivityName());
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCommonConstants.MainWhat.TO_BACKGROUND, bundle);
            if (MTGlobal.isNeedRemoteProcess) {
                MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCommonConstants.RemoteWhat.TO_BACKGROUND, bundle);
            }
        }
    }

    public void onRemoteLifecycleState(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        boolean z2 = bundle.getBoolean("state");
        MTGlobal.setCurrentActivityName(string);
        MTGlobal.setLifecycleState(z2);
        StringBuilder sb = new StringBuilder();
        sb.append(MTGlobal.getLifecycleState() ? "toForeground" : "toBackground");
        sb.append(" currentActivity:");
        sb.append(MTGlobal.getCurrentActivityName());
        MTCommonLog.m13010d(TAG, sb.toString());
    }

    public void release(Context context) {
        ((Application) context).unregisterActivityLifecycleCallbacks(this.lifecycleListener);
    }
}
