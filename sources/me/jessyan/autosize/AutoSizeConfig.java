package me.jessyan.autosize;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Field;
import me.jessyan.autosize.external.ExternalAdaptManager;
import me.jessyan.autosize.unit.Subunits;
import me.jessyan.autosize.unit.UnitsManager;
import me.jessyan.autosize.utils.AutoSizeLog;
import me.jessyan.autosize.utils.Preconditions;
import me.jessyan.autosize.utils.ScreenUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoSizeConfig {
    public static final boolean DEPENDENCY_ANDROIDX = findClassByClassName("androidx.fragment.app.FragmentActivity");
    public static final boolean DEPENDENCY_SUPPORT = findClassByClassName("androidx.fragment.app.FragmentActivity");
    private static final String KEY_DESIGN_HEIGHT_IN_DP = "design_height_in_dp";
    private static final String KEY_DESIGN_WIDTH_IN_DP = "design_width_in_dp";
    private static volatile AutoSizeConfig sInstance;
    private boolean isCustomFragment;
    private boolean isExcludeFontScale;
    private boolean isMiui;
    private boolean isStop;
    private boolean isVertical;
    private ActivityLifecycleCallbacksImpl mActivityLifecycleCallbacks;
    private Application mApplication;
    private int mDesignHeightInDp;
    private int mDesignWidthInDp;
    private int mInitDensityDpi;
    private float mInitScaledDensity;
    private int mInitScreenHeightDp;
    private int mInitScreenWidthDp;
    private float mInitXdpi;
    private onAdaptListener mOnAdaptListener;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mStatusBarHeight;
    private Field mTmpMetricsField;
    private float privateFontScale;
    private ExternalAdaptManager mExternalAdaptManager = new ExternalAdaptManager();
    private UnitsManager mUnitsManager = new UnitsManager();
    private float mInitDensity = -1.0f;
    private boolean isBaseOnWidth = true;
    private boolean isUseDeviceSize = true;

    /* JADX INFO: renamed from: me.jessyan.autosize.AutoSizeConfig$2 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC63512 implements Runnable {
        final /* synthetic */ Context val$context;

        public RunnableC63512(Context context) {
            this.val$context = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bundle bundle;
            try {
                ApplicationInfo applicationInfo = this.val$context.getPackageManager().getApplicationInfo(this.val$context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                    return;
                }
                if (bundle.containsKey(AutoSizeConfig.KEY_DESIGN_WIDTH_IN_DP)) {
                    AutoSizeConfig.access$402(AutoSizeConfig.this, ((Integer) applicationInfo.metaData.get(AutoSizeConfig.KEY_DESIGN_WIDTH_IN_DP)).intValue());
                }
                if (applicationInfo.metaData.containsKey(AutoSizeConfig.KEY_DESIGN_HEIGHT_IN_DP)) {
                    AutoSizeConfig.access$502(AutoSizeConfig.this, ((Integer) applicationInfo.metaData.get(AutoSizeConfig.KEY_DESIGN_HEIGHT_IN_DP)).intValue());
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private AutoSizeConfig() {
    }

    public static /* synthetic */ float access$000(AutoSizeConfig autoSizeConfig) {
        return autoSizeConfig.mInitScaledDensity;
    }

    public static /* synthetic */ float access$002(AutoSizeConfig autoSizeConfig, float f) {
        autoSizeConfig.mInitScaledDensity = f;
        return f;
    }

    public static /* synthetic */ boolean access$102(AutoSizeConfig autoSizeConfig, boolean z2) {
        autoSizeConfig.isVertical = z2;
        return z2;
    }

    public static /* synthetic */ int access$202(AutoSizeConfig autoSizeConfig, int i) {
        autoSizeConfig.mScreenWidth = i;
        return i;
    }

    public static /* synthetic */ int access$302(AutoSizeConfig autoSizeConfig, int i) {
        autoSizeConfig.mScreenHeight = i;
        return i;
    }

    public static /* synthetic */ int access$402(AutoSizeConfig autoSizeConfig, int i) {
        autoSizeConfig.mDesignWidthInDp = i;
        return i;
    }

    public static /* synthetic */ int access$502(AutoSizeConfig autoSizeConfig, int i) {
        autoSizeConfig.mDesignHeightInDp = i;
        return i;
    }

    private static boolean findClassByClassName(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static AutoSizeConfig getInstance() {
        if (sInstance == null) {
            synchronized (AutoSizeConfig.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new AutoSizeConfig();
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    private void getMetaData(Context context) {
        new Thread(new RunnableC63512(context)).start();
    }

    public Application getApplication() {
        Preconditions.checkNotNull(this.mApplication, "Please call the AutoSizeConfig#init() first");
        return this.mApplication;
    }

    public int getDesignHeightInDp() {
        Preconditions.checkArgument(this.mDesignHeightInDp > 0, "you must set design_height_in_dp  in your AndroidManifest file");
        return this.mDesignHeightInDp;
    }

    public int getDesignWidthInDp() {
        Preconditions.checkArgument(this.mDesignWidthInDp > 0, "you must set design_width_in_dp  in your AndroidManifest file");
        return this.mDesignWidthInDp;
    }

    public ExternalAdaptManager getExternalAdaptManager() {
        return this.mExternalAdaptManager;
    }

    public float getInitDensity() {
        return this.mInitDensity;
    }

    public int getInitDensityDpi() {
        return this.mInitDensityDpi;
    }

    public float getInitScaledDensity() {
        return this.mInitScaledDensity;
    }

    public int getInitScreenHeightDp() {
        return this.mInitScreenHeightDp;
    }

    public int getInitScreenWidthDp() {
        return this.mInitScreenWidthDp;
    }

    public float getInitXdpi() {
        return this.mInitXdpi;
    }

    public onAdaptListener getOnAdaptListener() {
        return this.mOnAdaptListener;
    }

    public float getPrivateFontScale() {
        return this.privateFontScale;
    }

    public int getScreenHeight() {
        return isUseDeviceSize() ? this.mScreenHeight : this.mScreenHeight - this.mStatusBarHeight;
    }

    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    public Field getTmpMetricsField() {
        return this.mTmpMetricsField;
    }

    public UnitsManager getUnitsManager() {
        return this.mUnitsManager;
    }

    public AutoSizeConfig init(Application application) {
        return init(application, true, null);
    }

    public boolean isBaseOnWidth() {
        return this.isBaseOnWidth;
    }

    public boolean isCustomFragment() {
        return this.isCustomFragment;
    }

    public boolean isExcludeFontScale() {
        return this.isExcludeFontScale;
    }

    public boolean isMiui() {
        return this.isMiui;
    }

    public boolean isStop() {
        return this.isStop;
    }

    public boolean isUseDeviceSize() {
        return this.isUseDeviceSize;
    }

    public boolean isVertical() {
        return this.isVertical;
    }

    public void restart() {
        Preconditions.checkNotNull(this.mActivityLifecycleCallbacks, "Please call the AutoSizeConfig#init() first");
        synchronized (AutoSizeConfig.class) {
            try {
                if (this.isStop) {
                    this.mApplication.registerActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
                    this.isStop = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AutoSizeConfig setAutoAdaptStrategy(AutoAdaptStrategy autoAdaptStrategy) {
        Preconditions.checkNotNull(autoAdaptStrategy, "autoAdaptStrategy == null");
        Preconditions.checkNotNull(this.mActivityLifecycleCallbacks, "Please call the AutoSizeConfig#init() first");
        this.mActivityLifecycleCallbacks.setAutoAdaptStrategy(new WrapperAutoAdaptStrategy(autoAdaptStrategy));
        return this;
    }

    public AutoSizeConfig setBaseOnWidth(boolean z2) {
        this.isBaseOnWidth = z2;
        return this;
    }

    public AutoSizeConfig setCustomFragment(boolean z2) {
        this.isCustomFragment = z2;
        return this;
    }

    public AutoSizeConfig setDesignHeightInDp(int i) {
        Preconditions.checkArgument(i > 0, "designHeightInDp must be > 0");
        this.mDesignHeightInDp = i;
        return this;
    }

    public AutoSizeConfig setDesignWidthInDp(int i) {
        Preconditions.checkArgument(i > 0, "designWidthInDp must be > 0");
        this.mDesignWidthInDp = i;
        return this;
    }

    public AutoSizeConfig setExcludeFontScale(boolean z2) {
        this.isExcludeFontScale = z2;
        return this;
    }

    public AutoSizeConfig setLog(boolean z2) {
        AutoSizeLog.setDebug(z2);
        return this;
    }

    public AutoSizeConfig setOnAdaptListener(onAdaptListener onadaptlistener) {
        Preconditions.checkNotNull(onadaptlistener, "onAdaptListener == null");
        this.mOnAdaptListener = onadaptlistener;
        return this;
    }

    public AutoSizeConfig setPrivateFontScale(float f) {
        this.privateFontScale = f;
        return this;
    }

    public AutoSizeConfig setScreenHeight(int i) {
        Preconditions.checkArgument(i > 0, "screenHeight must be > 0");
        this.mScreenHeight = i;
        return this;
    }

    public AutoSizeConfig setScreenWidth(int i) {
        Preconditions.checkArgument(i > 0, "screenWidth must be > 0");
        this.mScreenWidth = i;
        return this;
    }

    public AutoSizeConfig setStatusBarHeight(int i) {
        Preconditions.checkArgument(i > 0, "statusBarHeight must be > 0");
        this.mStatusBarHeight = i;
        return this;
    }

    public AutoSizeConfig setUseDeviceSize(boolean z2) {
        this.isUseDeviceSize = z2;
        return this;
    }

    public AutoSizeConfig setVertical(boolean z2) {
        this.isVertical = z2;
        return this;
    }

    public void stop(Activity activity) {
        Preconditions.checkNotNull(this.mActivityLifecycleCallbacks, "Please call the AutoSizeConfig#init() first");
        synchronized (AutoSizeConfig.class) {
            try {
                if (!this.isStop) {
                    this.mApplication.unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
                    AutoSize.cancelAdapt(activity);
                    this.isStop = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AutoSizeConfig init(Application application, boolean z2) {
        return init(application, z2, null);
    }

    public AutoSizeConfig init(Application application, boolean z2, AutoAdaptStrategy autoAdaptStrategy) {
        Preconditions.checkArgument(this.mInitDensity == -1.0f, "AutoSizeConfig#init() can only be called once");
        Preconditions.checkNotNull(application, "application == null");
        this.mApplication = application;
        this.isBaseOnWidth = z2;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (getInstance().getUnitsManager().getSupportSubunits() == Subunits.NONE) {
            this.mDesignWidthInDp = 360;
            this.mDesignHeightInDp = 640;
        } else {
            this.mDesignWidthInDp = 1080;
            this.mDesignHeightInDp = 1920;
        }
        getMetaData(application);
        this.isVertical = application.getResources().getConfiguration().orientation == 1;
        int[] screenSize = ScreenUtils.getScreenSize(application);
        this.mScreenWidth = screenSize[0];
        this.mScreenHeight = screenSize[1];
        this.mStatusBarHeight = ScreenUtils.getStatusBarHeight();
        AutoSizeLog.m21167d("designWidthInDp = " + this.mDesignWidthInDp + ", designHeightInDp = " + this.mDesignHeightInDp + ", screenWidth = " + this.mScreenWidth + ", screenHeight = " + this.mScreenHeight);
        this.mInitDensity = displayMetrics.density;
        this.mInitDensityDpi = displayMetrics.densityDpi;
        this.mInitScaledDensity = displayMetrics.scaledDensity;
        this.mInitXdpi = displayMetrics.xdpi;
        this.mInitScreenWidthDp = configuration.screenWidthDp;
        this.mInitScreenHeightDp = configuration.screenHeightDp;
        application.registerComponentCallbacks(new ComponentCallbacksC63501(application));
        AutoSizeLog.m21167d("initDensity = " + this.mInitDensity + ", initScaledDensity = " + this.mInitScaledDensity);
        if (autoAdaptStrategy == null) {
            autoAdaptStrategy = new DefaultAutoAdaptStrategy();
        }
        ActivityLifecycleCallbacksImpl activityLifecycleCallbacksImpl = new ActivityLifecycleCallbacksImpl(new WrapperAutoAdaptStrategy(autoAdaptStrategy));
        this.mActivityLifecycleCallbacks = activityLifecycleCallbacksImpl;
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacksImpl);
        if ("MiuiResources".equals(application.getResources().getClass().getSimpleName()) || "XResources".equals(application.getResources().getClass().getSimpleName())) {
            this.isMiui = true;
            try {
                Field declaredField = Resources.class.getDeclaredField("mTmpMetrics");
                this.mTmpMetricsField = declaredField;
                declaredField.setAccessible(true);
                return this;
            } catch (Exception unused) {
                this.mTmpMetricsField = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: me.jessyan.autosize.AutoSizeConfig$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ComponentCallbacksC63501 implements ComponentCallbacks {
        final /* synthetic */ Application val$application;

        public ComponentCallbacksC63501(Application application) {
            this.val$application = application;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            if (configuration != null) {
                if (configuration.fontScale > 0.0f) {
                    AutoSizeConfig.access$002(AutoSizeConfig.this, Resources.getSystem().getDisplayMetrics().scaledDensity);
                    AutoSizeLog.m21167d("initScaledDensity = " + AutoSizeConfig.access$000(AutoSizeConfig.this) + " on ConfigurationChanged");
                }
                AutoSizeConfig.access$102(AutoSizeConfig.this, configuration.orientation == 1);
                int[] screenSize = ScreenUtils.getScreenSize(this.val$application);
                AutoSizeConfig.access$202(AutoSizeConfig.this, screenSize[0]);
                AutoSizeConfig.access$302(AutoSizeConfig.this, screenSize[1]);
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }
}
