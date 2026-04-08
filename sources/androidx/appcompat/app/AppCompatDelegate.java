package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import androidx.collection.IndexBasedArrayIterator;
import androidx.core.os.LocaleListCompat;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* JADX INFO: renamed from: a */
    public static final SerialExecutor f391a = new SerialExecutor(new ThreadPerTaskExecutor());

    /* JADX INFO: renamed from: b */
    public static int f392b = -100;

    /* JADX INFO: renamed from: c */
    public static LocaleListCompat f393c = null;

    /* JADX INFO: renamed from: d */
    public static LocaleListCompat f394d = null;

    /* JADX INFO: renamed from: f */
    public static Boolean f395f = null;

    /* JADX INFO: renamed from: g */
    public static boolean f396g = false;

    /* JADX INFO: renamed from: i */
    public static final ArraySet f397i = new ArraySet(0);

    /* JADX INFO: renamed from: j */
    public static final Object f398j = new Object();

    /* JADX INFO: renamed from: n */
    public static final Object f399n = new Object();

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static LocaleList m287a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static LocaleList m288a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m289b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NightMode {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SerialExecutor implements Executor {

        /* JADX INFO: renamed from: a */
        public final Object f400a = new Object();

        /* JADX INFO: renamed from: b */
        public final ArrayDeque f401b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        public final Executor f402c;

        /* JADX INFO: renamed from: d */
        public Runnable f403d;

        public SerialExecutor(Executor executor) {
            this.f402c = executor;
        }

        /* JADX INFO: renamed from: a */
        public final void m290a() {
            synchronized (this.f400a) {
                try {
                    Runnable runnable = (Runnable) this.f401b.poll();
                    this.f403d = runnable;
                    if (runnable != null) {
                        ((ThreadPerTaskExecutor) this.f402c).execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.f400a) {
                try {
                    this.f401b.add(new RunnableC0082b(this, runnable));
                    if (this.f403d == null) {
                        m290a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ThreadPerTaskExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m259l(Context context) {
        if (f395f == null) {
            try {
                int i = AppLocalesMetadataHolderService.f505a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AppLocalesMetadataHolderService.Api24Impl.m338a() | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).metaData;
                if (bundle != null) {
                    f395f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f395f = Boolean.FALSE;
            }
        }
        return f395f.booleanValue();
    }

    /* JADX INFO: renamed from: t */
    public static void m260t(AppCompatDelegate appCompatDelegate) {
        synchronized (f398j) {
            try {
                Iterator it = f397i.iterator();
                while (true) {
                    IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
                    if (indexBasedArrayIterator.hasNext()) {
                        AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) indexBasedArrayIterator.next()).get();
                        if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                            indexBasedArrayIterator.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo261A(CharSequence charSequence);

    /* JADX INFO: renamed from: B */
    public abstract ActionMode mo262B(ActionMode.Callback callback);

    /* JADX INFO: renamed from: a */
    public abstract void mo263a(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo264b();

    /* JADX INFO: renamed from: d */
    public abstract View mo266d(int i);

    /* JADX INFO: renamed from: e */
    public Context mo267e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public abstract ActionBarDrawerToggle.Delegate mo268f();

    /* JADX INFO: renamed from: g */
    public int mo269g() {
        return -100;
    }

    /* JADX INFO: renamed from: h */
    public abstract MenuInflater mo270h();

    /* JADX INFO: renamed from: i */
    public abstract ActionBar mo271i();

    /* JADX INFO: renamed from: j */
    public abstract void mo272j();

    /* JADX INFO: renamed from: k */
    public abstract void mo273k();

    /* JADX INFO: renamed from: m */
    public abstract void mo274m(Configuration configuration);

    /* JADX INFO: renamed from: n */
    public abstract void mo275n();

    /* JADX INFO: renamed from: o */
    public abstract void mo276o();

    /* JADX INFO: renamed from: p */
    public abstract void mo277p();

    /* JADX INFO: renamed from: q */
    public abstract void mo278q();

    /* JADX INFO: renamed from: r */
    public abstract void mo279r();

    /* JADX INFO: renamed from: s */
    public abstract void mo280s();

    /* JADX INFO: renamed from: u */
    public abstract boolean mo281u(int i);

    /* JADX INFO: renamed from: v */
    public abstract void mo282v(int i);

    /* JADX INFO: renamed from: w */
    public abstract void mo283w(View view);

    /* JADX INFO: renamed from: x */
    public abstract void mo284x(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: y */
    public abstract void mo285y(Toolbar toolbar);

    /* JADX INFO: renamed from: c */
    public Context mo265c(Context context) {
        return context;
    }

    /* JADX INFO: renamed from: z */
    public void mo286z(int i) {
    }
}
