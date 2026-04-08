package io.intercom.android.sdk.utilities;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ViewUtils {

    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.ViewUtils$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewTreeObserverOnGlobalLayoutListenerC58511 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ Runnable val$runnable;
        final /* synthetic */ View val$view;

        public ViewTreeObserverOnGlobalLayoutListenerC58511(View view, Runnable runnable) {
            this.val$view = view;
            this.val$runnable = runnable;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewUtils.removeGlobalLayoutListener(this.val$view, this);
            this.val$runnable.run();
        }
    }

    public static void removeGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void waitForViewAttachment(View view, Runnable runnable) {
        if (view.getHeight() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC58511(view, runnable));
        } else {
            runnable.run();
        }
    }
}
