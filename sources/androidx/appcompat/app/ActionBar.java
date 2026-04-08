package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActionBar {

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DisplayOptions {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NavigationMode {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnMenuVisibilityListener {
        /* JADX INFO: renamed from: a */
        void m250a();
    }

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public interface OnNavigationListener {
    }

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public static abstract class Tab {
    }

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public interface TabListener {
    }

    /* JADX INFO: renamed from: f */
    public boolean mo235f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo236g() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo238i();

    /* JADX INFO: renamed from: j */
    public Context mo239j() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo240k() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo243n(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo244o(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo245p() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public ActionMode mo249t(ActionMode.Callback callback) {
        return null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f288a;

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f288a = 0;
            this.f288a = layoutParams.f288a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f288a = 0;
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo241l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo242m() {
    }

    /* JADX INFO: renamed from: h */
    public void mo237h(boolean z2) {
    }

    /* JADX INFO: renamed from: q */
    public void mo246q(boolean z2) {
    }

    /* JADX INFO: renamed from: r */
    public void mo247r(boolean z2) {
    }

    /* JADX INFO: renamed from: s */
    public void mo248s(CharSequence charSequence) {
    }
}
