package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.privacysandbox.ads.adservices.customaudience.AbstractC2096a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class ColorContrast {
    private static final float HIGH_CONTRAST_THRESHOLD = 0.6666667f;
    private static final float MEDIUM_CONTRAST_THRESHOLD = 0.33333334f;

    private ColorContrast() {
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull ColorContrastOptions colorContrastOptions) {
        if (isContrastAvailable()) {
            application.registerActivityLifecycleCallbacks(new ColorContrastActivityLifecycleCallbacks(colorContrastOptions));
        }
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity, @NonNull ColorContrastOptions colorContrastOptions) {
        int contrastThemeOverlayResourceId;
        if (isContrastAvailable() && (contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(activity, colorContrastOptions)) != 0) {
            ThemeUtils.applyThemeOverlay(activity, contrastThemeOverlayResourceId);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getContrastThemeOverlayResourceId(Context context, ColorContrastOptions colorContrastOptions) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (!isContrastAvailable() || uiModeManager == null) {
            return 0;
        }
        float fM11438a = AbstractC2096a.m11438a(uiModeManager);
        int mediumContrastThemeOverlay = colorContrastOptions.getMediumContrastThemeOverlay();
        int highContrastThemeOverlay = colorContrastOptions.getHighContrastThemeOverlay();
        if (fM11438a >= HIGH_CONTRAST_THRESHOLD) {
            return highContrastThemeOverlay == 0 ? mediumContrastThemeOverlay : highContrastThemeOverlay;
        }
        if (fM11438a < MEDIUM_CONTRAST_THRESHOLD) {
            return 0;
        }
        if (mediumContrastThemeOverlay == 0) {
        }
    }

    @ChecksSdkIntAtLeast
    public static boolean isContrastAvailable() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @NonNull ColorContrastOptions colorContrastOptions) {
        int contrastThemeOverlayResourceId;
        return (isContrastAvailable() && (contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(context, colorContrastOptions)) != 0) ? new ContextThemeWrapper(context, contrastThemeOverlayResourceId) : context;
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class ColorContrastActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private final Set<Activity> activitiesInStack = new LinkedHashSet();
        private final ColorContrastOptions colorContrastOptions;

        @Nullable
        private UiModeManager$ContrastChangeListener contrastChangeListener;

        /* JADX INFO: renamed from: com.google.android.material.color.ColorContrast$ColorContrastActivityLifecycleCallbacks$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C37991 implements UiModeManager$ContrastChangeListener {
            public C37991() {
            }

            public void onContrastChanged(float f) {
                Iterator it = ColorContrastActivityLifecycleCallbacks.access$000(ColorContrastActivityLifecycleCallbacks.this).iterator();
                while (it.hasNext()) {
                    ((Activity) it.next()).recreate();
                }
            }
        }

        public ColorContrastActivityLifecycleCallbacks(ColorContrastOptions colorContrastOptions) {
            this.colorContrastOptions = colorContrastOptions;
        }

        public static /* synthetic */ Set access$000(ColorContrastActivityLifecycleCallbacks colorContrastActivityLifecycleCallbacks) {
            return colorContrastActivityLifecycleCallbacks.activitiesInStack;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            this.activitiesInStack.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager == null || this.contrastChangeListener == null || !this.activitiesInStack.isEmpty()) {
                return;
            }
            AbstractC2096a.m11458u(uiModeManager, this.contrastChangeListener);
            this.contrastChangeListener = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.activitiesInStack.isEmpty() && this.contrastChangeListener == null) {
                this.contrastChangeListener = new C37991();
                AbstractC3808a.m14509b(uiModeManager, ContextCompat.m7486c(activity.getApplicationContext()), this.contrastChangeListener);
            }
            this.activitiesInStack.add(activity);
            if (uiModeManager != null) {
                ColorContrast.applyToActivityIfAvailable(activity, this.colorContrastOptions);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }
}
