package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class FullScreenInAppPresenter {

    /* JADX INFO: renamed from: io.intercom.android.sdk.activities.FullScreenInAppPresenter$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C51041 extends AnimatorListenerAdapter {
        final /* synthetic */ Activity val$activity;

        public C51041(Activity activity) {
            this.val$activity = activity;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.val$activity.finish();
            this.val$activity.overridePendingTransition(0, 0);
        }
    }

    public void closeWindow(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        decorView.setAlpha(1.0f);
        decorView.animate().alpha(0.0f).setDuration(200L).setListener(new C51041(activity)).start();
    }
}
