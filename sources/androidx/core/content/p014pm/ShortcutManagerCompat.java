package androidx.core.content.p014pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.p014pm.ShortcutInfoCompatSaver;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ShortcutManagerCompat {

    /* JADX INFO: renamed from: a */
    public static volatile ShortcutInfoCompatSaver f23141a;

    /* JADX INFO: renamed from: b */
    public static volatile ArrayList f23142b;

    /* JADX INFO: renamed from: androidx.core.content.pm.ShortcutManagerCompat$1 */
    /* JADX INFO: compiled from: Proguard */
    class C14291 extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api25Impl {
        /* JADX INFO: renamed from: a */
        public static String m7513a(List list) {
            Iterator it = list.iterator();
            int rank = -1;
            String id = null;
            while (it.hasNext()) {
                ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShortcutMatchFlags {
    }

    /* JADX INFO: renamed from: a */
    public static List m7508a(Context context) {
        Bundle bundle;
        String string;
        if (f23142b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((ShortcutInfoChangeListener) Class.forName(string, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f23142b == null) {
                f23142b = arrayList;
            }
        }
        return f23142b;
    }

    /* JADX INFO: renamed from: b */
    public static ShortcutInfoCompatSaver m7509b(Context context) {
        if (f23141a == null) {
            try {
                f23141a = (ShortcutInfoCompatSaver) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f23141a == null) {
                f23141a = new ShortcutInfoCompatSaver.NoopImpl();
            }
        }
        return f23141a;
    }

    /* JADX INFO: renamed from: c */
    public static void m7510c(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        IconCompat iconCompat;
        int i;
        InputStream inputStreamM7618h;
        Bitmap bitmapDecodeStream;
        IconCompat iconCompatM7612b;
        int i2 = Build.VERSION.SDK_INT;
        int iM7514a = i2 >= 25 ? AbstractC1430a.m7514a(AbstractC1430a.m7515b(context.getSystemService(AbstractC1430a.m7516c()))) : 5;
        if (iM7514a == 0) {
            return;
        }
        if (i2 <= 29 && (iconCompat = shortcutInfoCompat.f23132h) != null && (((i = iconCompat.f23229a) == 6 || i == 4) && (inputStreamM7618h = iconCompat.m7618h(context)) != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM7618h)) != null)) {
            if (i == 6) {
                iconCompatM7612b = new IconCompat(5);
                iconCompatM7612b.f23230b = bitmapDecodeStream;
            } else {
                iconCompatM7612b = IconCompat.m7612b(bitmapDecodeStream);
            }
            shortcutInfoCompat.f23132h = iconCompatM7612b;
        }
        if (i2 >= 30) {
            AbstractC0025b.m122n(AbstractC1430a.m7515b(context.getSystemService(AbstractC1430a.m7516c())), shortcutInfoCompat.m7505b());
        } else if (i2 >= 25) {
            ShortcutManager shortcutManagerM7515b = AbstractC1430a.m7515b(context.getSystemService(AbstractC1430a.m7516c()));
            if (AbstractC1430a.m7522i(shortcutManagerM7515b)) {
                return;
            }
            List listM7517d = AbstractC1430a.m7517d(shortcutManagerM7515b);
            if (listM7517d.size() >= iM7514a) {
                AbstractC1430a.m7520g(shortcutManagerM7515b, Arrays.asList(Api25Impl.m7513a(listM7517d)));
            }
            AbstractC1430a.m7526m(shortcutManagerM7515b, Arrays.asList(shortcutInfoCompat.m7505b()));
        }
        try {
            m7509b(context).getClass();
            ArrayList<ShortcutInfoCompat> arrayList = new ArrayList();
            if (arrayList.size() >= iM7514a) {
                int i3 = -1;
                String str = null;
                for (ShortcutInfoCompat shortcutInfoCompat2 : arrayList) {
                    int i4 = shortcutInfoCompat2.f23137m;
                    if (i4 > i3) {
                        str = shortcutInfoCompat2.f23126b;
                        i3 = i4;
                    }
                }
                Arrays.asList(str);
            }
            Arrays.asList(shortcutInfoCompat);
            for (ShortcutInfoChangeListener shortcutInfoChangeListener : (ArrayList) m7508a(context)) {
                Collections.singletonList(shortcutInfoCompat);
                shortcutInfoChangeListener.getClass();
            }
            m7511d(context, shortcutInfoCompat.f23126b);
        } catch (Exception unused) {
            for (ShortcutInfoChangeListener shortcutInfoChangeListener2 : (ArrayList) m7508a(context)) {
                Collections.singletonList(shortcutInfoCompat);
                shortcutInfoChangeListener2.getClass();
            }
            m7511d(context, shortcutInfoCompat.f23126b);
        } catch (Throwable th) {
            for (ShortcutInfoChangeListener shortcutInfoChangeListener3 : (ArrayList) m7508a(context)) {
                Collections.singletonList(shortcutInfoCompat);
                shortcutInfoChangeListener3.getClass();
            }
            m7511d(context, shortcutInfoCompat.f23126b);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7511d(Context context, String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            AbstractC1430a.m7519f(AbstractC1430a.m7515b(context.getSystemService(AbstractC1430a.m7516c())), str);
        }
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : (ArrayList) m7508a(context)) {
            Collections.singletonList(str);
            shortcutInfoChangeListener.getClass();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7512e(Context context, List list) {
        if (Build.VERSION.SDK_INT <= 32) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ShortcutInfoCompat) it.next()).getClass();
            }
            list = arrayList;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ShortcutInfoCompat) it2.next()).m7505b());
            }
            if (!AbstractC1430a.m7523j(AbstractC1430a.m7515b(context.getSystemService(AbstractC1430a.m7516c())), arrayList2)) {
                return;
            }
        }
        m7509b(context).getClass();
        m7509b(context).getClass();
        Iterator it3 = ((ArrayList) m7508a(context)).iterator();
        while (it3.hasNext()) {
            ((ShortcutInfoChangeListener) it3.next()).getClass();
        }
    }
}
