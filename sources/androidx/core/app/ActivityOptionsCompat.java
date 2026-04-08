package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ActivityOptionsCompat {

    /* JADX INFO: compiled from: Proguard */
    public static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {

        /* JADX INFO: renamed from: a */
        public final ActivityOptions f22944a;

        public ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.f22944a = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        /* JADX INFO: renamed from: b */
        public final Bundle mo7396b() {
            return this.f22944a.toBundle();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api34Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BackgroundActivityStartMode {
    }

    /* JADX INFO: renamed from: a */
    public static ActivityOptionsCompat m7395a(Activity activity, View view) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity, view, LightBoxActivity.TRANSITION_KEY));
    }

    /* JADX INFO: renamed from: b */
    public Bundle mo7396b() {
        return null;
    }
}
