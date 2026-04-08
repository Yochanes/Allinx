package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class NavUtils {
    /* JADX INFO: renamed from: a */
    public static Intent m7404a(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM7406c = m7406c(context, componentName);
        if (strM7406c == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM7406c);
        return m7406c(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m7405b(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM7406c = m7406c(appCompatActivity, appCompatActivity.getComponentName());
            if (strM7406c == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, strM7406c);
            try {
                return m7406c(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM7406c + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m7406c(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
