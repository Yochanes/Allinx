package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.os.BuildCompat;
import androidx.privacysandbox.ads.adservices.customaudience.AbstractC2096a;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.material.C3734R;
import com.google.android.material.color.DynamicColorsOptions;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.SchemeContent;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class DynamicColors {
    private static final DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION;
    private static final Map<String, DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_BRANDS;
    private static final Map<String, DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
    private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = {C3734R.attr.dynamicColorThemeOverlay};

    @SuppressLint({"PrivateApi"})
    private static final DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION;
    private static final String TAG;
    private static final int USE_DEFAULT_THEME_OVERLAY = 0;

    /* JADX INFO: renamed from: com.google.android.material.color.DynamicColors$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C38021 implements DeviceSupportCondition {
        @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
        public boolean isSupported() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.DynamicColors$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C38032 implements DeviceSupportCondition {
        private Long version;

        @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
        public boolean isSupported() {
            if (this.version == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                    l.longValue();
                    this.version = l;
                } catch (Exception unused) {
                    this.version = -1L;
                }
            }
            return this.version.longValue() >= 40100;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface DeviceSupportCondition {
        boolean isSupported();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnAppliedCallback {
        void onApplied(@NonNull Activity activity);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Precondition {
        boolean shouldApplyDynamicColors(@NonNull Activity activity, @StyleRes int i);
    }

    static {
        C38021 c38021 = new C38021();
        DEFAULT_DEVICE_SUPPORT_CONDITION = c38021;
        C38032 c38032 = new C38032();
        SAMSUNG_DEVICE_SUPPORT_CONDITION = c38032;
        HashMap map = new HashMap();
        map.put("fcnt", c38021);
        map.put("google", c38021);
        map.put("hmd global", c38021);
        map.put("infinix", c38021);
        map.put("infinix mobility limited", c38021);
        map.put("itel", c38021);
        map.put("kyocera", c38021);
        map.put("lenovo", c38021);
        map.put("lge", c38021);
        map.put(MTPushConstants.Manufacturer.MEIZU, c38021);
        map.put("motorola", c38021);
        map.put("nothing", c38021);
        map.put(MTPushConstants.Manufacturer.ONEPLUS, c38021);
        map.put(MTPushConstants.Manufacturer.OPPO, c38021);
        map.put(MTPushConstants.Manufacturer.REALME, c38021);
        map.put("robolectric", c38021);
        map.put("samsung", c38032);
        map.put("sharp", c38021);
        map.put("shift", c38021);
        map.put("sony", c38021);
        map.put("tcl", c38021);
        map.put("tecno", c38021);
        map.put("tecno mobile limited", c38021);
        map.put(MTPushConstants.Manufacturer.VIVO, c38021);
        map.put("wingtech", c38021);
        map.put(MTPushConstants.Manufacturer.XIAOMI, c38021);
        DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", c38021);
        map2.put("jio", c38021);
        DYNAMIC_COLOR_SUPPORTED_BRANDS = Collections.unmodifiableMap(map2);
        TAG = "DynamicColors";
    }

    private DynamicColors() {
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity) {
        applyToActivityIfAvailable(activity);
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().build());
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().build());
    }

    private static int getDefaultThemeOverlay(@NonNull Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static float getSystemContrast(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || Build.VERSION.SDK_INT < 34) {
            return 0.0f;
        }
        return AbstractC2096a.m11438a(uiModeManager);
    }

    @ChecksSdkIntAtLeast
    @SuppressLint({"DefaultLocale"})
    public static boolean isDynamicColorAvailable() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return false;
        }
        int i2 = BuildCompat.f23252a;
        if (i >= 33) {
            return true;
        }
        if (i >= 32) {
            String CODENAME = Build.VERSION.CODENAME;
            Intrinsics.m18598f(CODENAME, "CODENAME");
            if (BuildCompat.m7631a("Tiramisu")) {
                return true;
            }
        }
        Map<String, DeviceSupportCondition> map = DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        DeviceSupportCondition deviceSupportCondition = map.get(str.toLowerCase(locale));
        if (deviceSupportCondition == null) {
            deviceSupportCondition = DYNAMIC_COLOR_SUPPORTED_BRANDS.get(Build.BRAND.toLowerCase(locale));
        }
        return deviceSupportCondition != null && deviceSupportCondition.isSupported();
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context) {
        return wrapContextIfAvailable(context, 0);
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity, @StyleRes int i) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @StyleRes int i) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        if (isDynamicColorAvailable()) {
            int defaultThemeOverlay = dynamicColorsOptions.getContentBasedSeedColor() == null ? dynamicColorsOptions.getThemeOverlay() == 0 ? getDefaultThemeOverlay(activity, DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE) : dynamicColorsOptions.getThemeOverlay() : 0;
            if (dynamicColorsOptions.getPrecondition().shouldApplyDynamicColors(activity, defaultThemeOverlay)) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialColors.isLightTheme(activity), getSystemContrast(activity));
                    ColorResourcesOverride colorResourcesOverride = ColorResourcesOverride.getInstance();
                    if (colorResourcesOverride == null || !colorResourcesOverride.applyIfPossible(activity, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent))) {
                        return;
                    }
                } else {
                    ThemeUtils.applyThemeOverlay(activity, defaultThemeOverlay);
                }
                dynamicColorsOptions.getOnAppliedCallback().onApplied(activity);
            }
        }
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @StyleRes int i) {
        return wrapContextIfAvailable(context, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity, @NonNull Precondition precondition) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        if (isDynamicColorAvailable()) {
            int themeOverlay = dynamicColorsOptions.getThemeOverlay();
            if (themeOverlay == 0) {
                themeOverlay = getDefaultThemeOverlay(context, DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE);
            }
            if (themeOverlay != 0) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialColors.isLightTheme(context), getSystemContrast(context));
                    ColorResourcesOverride colorResourcesOverride = ColorResourcesOverride.getInstance();
                    if (colorResourcesOverride != null) {
                        return colorResourcesOverride.wrapContextIfPossible(context, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent));
                    }
                }
                return new ContextThemeWrapper(context, themeOverlay);
            }
        }
        return context;
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @StyleRes int i, @NonNull Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i).setPrecondition(precondition).build());
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        application.registerActivityLifecycleCallbacks(new DynamicColorsActivityLifecycleCallbacks(dynamicColorsOptions));
    }

    /* JADX INFO: compiled from: Proguard */
    public static class DynamicColorsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private final DynamicColorsOptions dynamicColorsOptions;

        public DynamicColorsActivityLifecycleCallbacks(@NonNull DynamicColorsOptions dynamicColorsOptions) {
            this.dynamicColorsOptions = dynamicColorsOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            DynamicColors.applyToActivityIfAvailable(activity, this.dynamicColorsOptions);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
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
