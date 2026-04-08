package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenuItem;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemCompat {

    /* JADX INFO: renamed from: androidx.core.view.MenuItemCompat$1 */
    /* JADX INFO: compiled from: Proguard */
    class MenuItemOnActionExpandListenerC14521 implements MenuItem.OnActionExpandListener {
        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            throw null;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        /* JADX INFO: renamed from: a */
        public static void m7739a(MenuItem menuItem, char c2, int i) {
            menuItem.setAlphabeticShortcut(c2, i);
        }

        /* JADX INFO: renamed from: b */
        public static void m7740b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        /* JADX INFO: renamed from: c */
        public static void m7741c(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        public static void m7742d(MenuItem menuItem, PorterDuff.Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        /* JADX INFO: renamed from: e */
        public static void m7743e(MenuItem menuItem, char c2, int i) {
            menuItem.setNumericShortcut(c2, i);
        }

        /* JADX INFO: renamed from: f */
        public static void m7744f(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public interface OnActionExpandListener {
    }

    /* JADX INFO: renamed from: a */
    public static void m7733a(MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setAlphabeticShortcut(c2, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m7739a(menuItem, c2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7734b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m7740b(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7735c(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m7741c(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7736d(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m7742d(menuItem, mode);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7737e(MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setNumericShortcut(c2, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m7743e(menuItem, c2, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7738f(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m7744f(menuItem, charSequence);
        }
    }
}
