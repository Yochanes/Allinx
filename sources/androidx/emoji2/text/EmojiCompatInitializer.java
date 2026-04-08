package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.annotation.RequiresApi;
import androidx.core.os.TraceCompat;
import androidx.emoji2.text.ConcurrencyHelpers;
import androidx.emoji2.text.EmojiCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$1 */
    /* JADX INFO: compiled from: Proguard */
    class C16341 implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Lifecycle f24298a;

        public C16341(EmojiCompatInitializer emojiCompatInitializer, Lifecycle lifecycle) {
            this.f24298a = lifecycle;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            (Build.VERSION.SDK_INT >= 28 ? ConcurrencyHelpers.Handler28Impl.m8777a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new LoadEmojiCompatRunnable(), 500L);
            this.f24298a.mo9125c(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class BackgroundDefaultConfig extends EmojiCompat.Config {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class BackgroundDefaultLoader implements EmojiCompat.MetadataRepoLoader {

        /* JADX INFO: renamed from: a */
        public final Context f24299a;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$1 */
        /* JADX INFO: compiled from: Proguard */
        class C16351 extends EmojiCompat.MetadataRepoLoaderCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ EmojiCompat.MetadataRepoLoaderCallback f24300a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f24301b;

            public C16351(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
                this.f24300a = metadataRepoLoaderCallback;
                this.f24301b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            /* JADX INFO: renamed from: a */
            public final void mo8794a(Throwable th) {
                ThreadPoolExecutor threadPoolExecutor = this.f24301b;
                try {
                    this.f24300a.mo8794a(th);
                } finally {
                    threadPoolExecutor.shutdown();
                }
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            /* JADX INFO: renamed from: b */
            public final void mo8795b(MetadataRepo metadataRepo) {
                ThreadPoolExecutor threadPoolExecutor = this.f24301b;
                try {
                    this.f24300a.mo8795b(metadataRepo);
                } finally {
                    threadPoolExecutor.shutdown();
                }
            }
        }

        public BackgroundDefaultLoader(Context context) {
            this.f24299a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        /* JADX INFO: renamed from: a */
        public final void mo8796a(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1637a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new RunnableC1638b(this, metadataRepoLoaderCallback, threadPoolExecutor));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LoadEmojiCompatRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = TraceCompat.f23262a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.m8785g()) {
                    EmojiCompat.m8782a().m8789h();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i2 = TraceCompat.f23262a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Object objM11947b;
        BackgroundDefaultConfig backgroundDefaultConfig = new BackgroundDefaultConfig(new BackgroundDefaultLoader(context));
        backgroundDefaultConfig.f24294b = 1;
        if (EmojiCompat.f24279k == null) {
            synchronized (EmojiCompat.f24278j) {
                try {
                    if (EmojiCompat.f24279k == null) {
                        EmojiCompat.f24279k = new EmojiCompat(backgroundDefaultConfig);
                    }
                } finally {
                }
            }
        }
        AppInitializer appInitializerM11945c = AppInitializer.m11945c(context);
        appInitializerM11945c.getClass();
        synchronized (AppInitializer.f32150e) {
            try {
                objM11947b = appInitializerM11945c.f32151a.get(ProcessLifecycleInitializer.class);
                if (objM11947b == null) {
                    objM11947b = appInitializerM11945c.m11947b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        Lifecycle lifecycle = ((LifecycleOwner) objM11947b).getLifecycle();
        lifecycle.mo9123a(new C16341(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
