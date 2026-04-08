package com.exchange.allin.push;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.core.api.MTCorePrivatesApi;
import com.engagelab.privates.push.api.CustomMessage;
import com.engagelab.privates.push.api.NotificationMessage;
import com.engagelab.privates.push.api.PlatformTokenMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/push/EngagelabPushReceiver;", "Lcom/engagelab/privates/common/component/MTCommonReceiver;", "<init>", "()V", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class EngagelabPushReceiver extends MTCommonReceiver {

    /* JADX INFO: renamed from: b */
    public final String f35419b = "PushReceiver";

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public final void onConnectStatus(Context context, boolean z2) {
        Intrinsics.m18599g(context, "context");
        if (z2) {
            Log.e(this.f35419b, "onConnectStatus: " + MTCorePrivatesApi.getRegistrationId(context));
        }
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public final void onCustomMessage(Context context, CustomMessage customMessage) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(customMessage, "customMessage");
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public final void onNotificationArrived(Context context, NotificationMessage notificationMessage) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(notificationMessage, "notificationMessage");
        Log.e(this.f35419b, "onNotificationArrived: " + notificationMessage.getContent());
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public final void onNotificationClicked(Context context, NotificationMessage notificationMessage) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(notificationMessage, "notificationMessage");
        Log.e(this.f35419b, "onNotificationClicked: " + notificationMessage.getContent());
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public final void onNotificationDeleted(Context context, NotificationMessage notificationMessage) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(notificationMessage, "notificationMessage");
        Log.e(this.f35419b, "onNotificationDeleted: " + notificationMessage.getContent());
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public final void onNotificationStatus(Context context, boolean z2) {
        Intrinsics.m18599g(context, "context");
        Log.e(this.f35419b, "onNotificationStatus: " + z2);
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public final void onPlatformToken(Context context, PlatformTokenMessage platformTokenMessage) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(platformTokenMessage, "platformTokenMessage");
        Log.e(this.f35419b, "onPlatformToken: " + platformTokenMessage.getRegion());
    }
}
