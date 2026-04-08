package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.activity.AbstractC0050i;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class DisplayCutoutCompat {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f23370a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        /* JADX INFO: renamed from: a */
        public static int m7723a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* JADX INFO: renamed from: b */
        public static int m7724b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* JADX INFO: renamed from: c */
        public static int m7725c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* JADX INFO: renamed from: d */
        public static int m7726d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
        /* JADX INFO: renamed from: a */
        public static Insets m7727a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api31Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
    }

    public DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.f23370a = displayCutout;
    }

    /* JADX INFO: renamed from: a */
    public final androidx.core.graphics.Insets m7722a() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.Insets.m7563c(Api30Impl.m7727a(this.f23370a)) : androidx.core.graphics.Insets.f23199e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f23370a, ((DisplayCutoutCompat) obj).f23370a);
    }

    public final int hashCode() {
        return AbstractC0050i.m197b(this.f23370a);
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f23370a + "}";
    }
}
