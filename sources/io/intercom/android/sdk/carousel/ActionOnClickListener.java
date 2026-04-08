package io.intercom.android.sdk.carousel;

import android.view.View;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.intercom.android.sdk.models.carousel.ScreenAction;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class ActionOnClickListener implements View.OnClickListener {
    private final CarouselListener listener;
    private final ScreenAction screenAction;

    public ActionOnClickListener(ScreenAction screenAction, CarouselListener carouselListener) {
        this.screenAction = screenAction;
        this.listener = carouselListener;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onClick(View view) {
        byte b2;
        if (this.screenAction.isPermissionAction()) {
            this.listener.requestPermissions(this.screenAction);
            return;
        }
        String type = this.screenAction.getType();
        switch (type.hashCode()) {
            case -1573653227:
                b2 = !type.equals(ActionType.START_CHAT) ? (byte) -1 : (byte) 2;
                break;
            case -567202649:
                if (type.equals(ActionType.CONTINUE)) {
                    b2 = 4;
                    break;
                }
                break;
            case 3321850:
                if (type.equals(ActionType.LINK)) {
                    b2 = 1;
                    break;
                }
                break;
            case 3532159:
                if (type.equals(ActionType.SKIP)) {
                    b2 = 3;
                    break;
                }
                break;
            case 1671672458:
                if (type.equals(ActionType.DISMISS)) {
                    b2 = 0;
                    break;
                }
                break;
        }
        if (b2 == 0) {
            this.listener.trackActionButtonTappedStats();
            this.listener.dismissCarousel(MetricTracker.Context.FROM_CTA);
            return;
        }
        if (b2 == 1) {
            this.listener.trackActionButtonTappedStats();
            this.listener.openLink(this.screenAction.getUri());
        } else if (b2 == 2) {
            this.listener.trackActionButtonTappedStats();
            this.listener.startChat();
        } else if (b2 != 3) {
            this.listener.selectNextScreen(MetricTracker.Context.FROM_CTA);
        } else {
            this.listener.skipPermissionScreen();
        }
    }
}
