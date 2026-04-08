package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class DevelopmentPlatformProvider {
    private static final String FLUTTER_ASSET_FILE = "flutter_assets/NOTICES.Z";
    private static final String FLUTTER_PLATFORM = "Flutter";
    private static final String UNITY_PLATFORM = "Unity";
    private static final String UNITY_VERSION_FIELD = "com.google.firebase.crashlytics.unity_version";
    private final Context context;

    @Nullable
    private DevelopmentPlatform developmentPlatform = null;

    /* JADX INFO: compiled from: Proguard */
    public class DevelopmentPlatform {

        @Nullable
        private final String developmentPlatform;

        @Nullable
        private final String developmentPlatformVersion;

        public /* synthetic */ DevelopmentPlatform(DevelopmentPlatformProvider developmentPlatformProvider, C46381 c46381) {
            this();
        }

        public static /* synthetic */ String access$000(DevelopmentPlatform developmentPlatform) {
            return developmentPlatform.developmentPlatform;
        }

        public static /* synthetic */ String access$100(DevelopmentPlatform developmentPlatform) {
            return developmentPlatform.developmentPlatformVersion;
        }

        private DevelopmentPlatform() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.access$300(DevelopmentPlatformProvider.this), DevelopmentPlatformProvider.UNITY_VERSION_FIELD, "string");
            if (resourcesIdentifier != 0) {
                this.developmentPlatform = DevelopmentPlatformProvider.UNITY_PLATFORM;
                String string = DevelopmentPlatformProvider.access$300(DevelopmentPlatformProvider.this).getResources().getString(resourcesIdentifier);
                this.developmentPlatformVersion = string;
                Logger.getLogger().m15167v("Unity Editor version is: " + string);
                return;
            }
            if (!DevelopmentPlatformProvider.access$400(DevelopmentPlatformProvider.this, DevelopmentPlatformProvider.FLUTTER_ASSET_FILE)) {
                this.developmentPlatform = null;
                this.developmentPlatformVersion = null;
            } else {
                this.developmentPlatform = DevelopmentPlatformProvider.FLUTTER_PLATFORM;
                this.developmentPlatformVersion = null;
                Logger.getLogger().m15167v("Development platform is: Flutter");
            }
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.context = context;
    }

    public static /* synthetic */ Context access$300(DevelopmentPlatformProvider developmentPlatformProvider) {
        return developmentPlatformProvider.context;
    }

    public static /* synthetic */ boolean access$400(DevelopmentPlatformProvider developmentPlatformProvider, String str) {
        return developmentPlatformProvider.assetFileExists(str);
    }

    private boolean assetFileExists(String str) {
        if (this.context.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private DevelopmentPlatform initDevelopmentPlatform() {
        if (this.developmentPlatform == null) {
            this.developmentPlatform = new DevelopmentPlatform(this, null);
        }
        return this.developmentPlatform;
    }

    public static boolean isUnity(Context context) {
        return CommonUtils.getResourcesIdentifier(context, UNITY_VERSION_FIELD, "string") != 0;
    }

    @Nullable
    public String getDevelopmentPlatform() {
        return DevelopmentPlatform.access$000(initDevelopmentPlatform());
    }

    @Nullable
    public String getDevelopmentPlatformVersion() {
        return DevelopmentPlatform.access$100(initDevelopmentPlatform());
    }
}
