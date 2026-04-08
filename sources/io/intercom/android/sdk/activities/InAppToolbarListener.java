package io.intercom.android.sdk.activities;

import android.app.Activity;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class InAppToolbarListener implements IntercomToolbar.Listener {
    private final Activity activity;

    public InAppToolbarListener(Activity activity) {
        this.activity = activity;
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onCloseClicked() {
        this.activity.onBackPressed();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onInboxClicked() {
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onToolbarClicked() {
    }
}
