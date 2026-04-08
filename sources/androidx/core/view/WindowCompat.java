package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCompat {

    /* JADX INFO: compiled from: Proguard */
    public static class Api16Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
        /* JADX INFO: renamed from: a */
        public static void m7874a(Window window, boolean z2) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api35Impl {
        /* JADX INFO: renamed from: a */
        public static void m7875a(Window window, boolean z2) {
            window.setDecorFitsSystemWindows(z2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7873a(Window window, boolean z2) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            Api35Impl.m7875a(window, z2);
        } else {
            if (i >= 30) {
                Api30Impl.m7874a(window, z2);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }
}
