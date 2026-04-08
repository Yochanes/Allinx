package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ContextUtil {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Context m1589a(@NonNull Context context, @Nullable String str) {
            return context.createAttributionContext(str);
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static String m1590b(@NonNull Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Context m1587a(Context context) {
        String strM1590b;
        Context applicationContext = context.getApplicationContext();
        return (Build.VERSION.SDK_INT < 30 || (strM1590b = Api30Impl.m1590b(context)) == null) ? applicationContext : Api30Impl.m1589a(applicationContext, strM1590b);
    }

    /* JADX INFO: renamed from: b */
    public static Application m1588b(Context context) {
        String strM1590b;
        Context contextM1587a = m1587a(context);
        while (contextM1587a instanceof ContextWrapper) {
            if (contextM1587a instanceof Application) {
                return (Application) contextM1587a;
            }
            ContextWrapper contextWrapper = (ContextWrapper) contextM1587a;
            Context baseContext = contextWrapper.getBaseContext();
            contextM1587a = (Build.VERSION.SDK_INT < 30 || (strM1590b = Api30Impl.m1590b(contextWrapper)) == null) ? baseContext : Api30Impl.m1589a(baseContext, strM1590b);
        }
        return null;
    }
}
