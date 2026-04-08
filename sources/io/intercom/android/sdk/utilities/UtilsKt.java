package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0003H\u0000¨\u0006\n"}, m18302d2 = {"readHostFromManifest", "", "context", "Landroid/content/Context;", "getServerRegionFromManifest", "", "getRegionCode", "id", "getLocaleCompat", "Ljava/util/Locale;", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class UtilsKt {
    @NotNull
    public static final Locale getLocaleCompat(@NotNull Context context) {
        Intrinsics.m18599g(context, "<this>");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        Intrinsics.m18596d(locale);
        return locale;
    }

    public static final int getRegionCode(@NotNull Context context, int i) {
        Intrinsics.m18599g(context, "context");
        return context.getResources().getInteger(i);
    }

    public static final int getServerRegionFromManifest(@NotNull Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.m18599g(context, "context");
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        Intrinsics.m18598f(applicationInfo, "getApplicationInfo(...)");
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            return bundle.getInt("io.intercom.android.sdk.server.region");
        }
        return 0;
    }

    @Nullable
    public static final String readHostFromManifest(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            Intrinsics.m18598f(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                return bundle.getString("io.intercom.android.sdk.host");
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
