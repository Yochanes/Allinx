package com.engagelab.privates.push.platform.google.callback;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.platform.google.business.MTGoogleBusiness;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTGoogleListener implements OnCompleteListener<String> {
    private static final String TAG = "MTGoogleListener";
    private final Context context;

    public MTGoogleListener(Context context) {
        this.context = context;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<String> task) {
        if (task == null) {
            MTCommonLog.m13010d(TAG, "onTokenFailed");
            MTGoogleBusiness.getInstance().onNode(this.context, 3003, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 1);
            return;
        }
        if (!task.isSuccessful()) {
            MTCommonLog.m13010d(TAG, "onTokenFailed " + task.getException());
            MTGoogleBusiness.getInstance().onNode(this.context, 3003, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 1);
            return;
        }
        String result = task.getResult();
        if (TextUtils.isEmpty(result)) {
            MTCommonLog.m13010d(TAG, "onTokenFailed:get token is empty");
            MTGoogleBusiness.getInstance().onNode(this.context, 3003, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 1);
        } else {
            MTCommonLog.m13010d(TAG, "onTokenSuccess:get token is " + result);
            MTGoogleBusiness.getInstance().onToken(this.context, result, 1);
        }
    }
}
