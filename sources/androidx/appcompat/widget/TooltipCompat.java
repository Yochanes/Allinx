package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class TooltipCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m734a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m733a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m734a(view, charSequence);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler = TooltipCompatHandler.f1465p;
        if (tooltipCompatHandler != null && tooltipCompatHandler.f1467a == view) {
            TooltipCompatHandler.m735b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new TooltipCompatHandler(view, charSequence);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler2 = TooltipCompatHandler.f1466q;
        if (tooltipCompatHandler2 != null && tooltipCompatHandler2.f1467a == view) {
            tooltipCompatHandler2.m736a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
