package com.engagelab.privates.common.business.lifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.constants.MTCommonConstants;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public class MTLifecycleListener implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString(MTCommonConstants.Lifecycle.KEY_ACTIVITY, activity.getComponentName().getClassName());
        MTCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), MTCommonConstants.MainWhat.ON_ACTIVITY_CREATED, bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString(MTCommonConstants.Lifecycle.KEY_ACTIVITY, activity.getComponentName().getClassName());
        MTCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), MTCommonConstants.MainWhat.ON_ACTIVITY_DESTROYED, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString(MTCommonConstants.Lifecycle.KEY_ACTIVITY, activity.getComponentName().getClassName());
        MTCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), MTCommonConstants.MainWhat.ON_ACTIVITY_PAUSED, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString(MTCommonConstants.Lifecycle.KEY_ACTIVITY, activity.getComponentName().getClassName());
        MTCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), MTCommonConstants.MainWhat.ON_ACTIVITY_RESUMED, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString(MTCommonConstants.Lifecycle.KEY_ACTIVITY, activity.getComponentName().getClassName());
        bundle.putBoolean("state", true);
        MTCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), MTCommonConstants.MainWhat.ON_LIFECYCLE_CHANGED, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString(MTCommonConstants.Lifecycle.KEY_ACTIVITY, activity.getComponentName().getClassName());
        bundle.putBoolean("state", false);
        MTCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), MTCommonConstants.MainWhat.ON_LIFECYCLE_CHANGED, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
