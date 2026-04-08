package io.intercom.android.sdk.views;

import android.view.View;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ActiveStatePresenter {
    private static final String ENGLISH_LOCALE = "en";

    public void presentStateDot(boolean z2, View view, AppConfig appConfig) {
        if (ENGLISH_LOCALE.equals(appConfig.getLocale())) {
            BackgroundUtils.setBackground(view, new ActiveStateDrawable(view.getContext().getColor(z2 ? C5101R.color.intercom_active_state : C5101R.color.intercom_away_state), view.getContext().getColor(C5101R.color.intercom_white), view.getResources().getDisplayMetrics().density * 1.0f));
        } else {
            view.setBackgroundResource(0);
        }
    }
}
