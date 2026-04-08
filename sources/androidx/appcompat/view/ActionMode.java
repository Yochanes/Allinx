package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActionMode {

    /* JADX INFO: renamed from: a */
    public Object f658a;

    /* JADX INFO: renamed from: b */
    public boolean f659b;

    /* JADX INFO: compiled from: Proguard */
    public interface Callback {
        /* JADX INFO: renamed from: a */
        void mo316a(ActionMode actionMode);

        /* JADX INFO: renamed from: b */
        boolean mo317b(ActionMode actionMode, Menu menu);

        /* JADX INFO: renamed from: c */
        boolean mo318c(ActionMode actionMode, MenuBuilder menuBuilder);

        /* JADX INFO: renamed from: d */
        boolean mo319d(ActionMode actionMode, MenuItem menuItem);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo351a();

    /* JADX INFO: renamed from: b */
    public abstract View mo352b();

    /* JADX INFO: renamed from: c */
    public abstract MenuBuilder mo353c();

    /* JADX INFO: renamed from: d */
    public abstract MenuInflater mo354d();

    /* JADX INFO: renamed from: e */
    public abstract CharSequence mo355e();

    /* JADX INFO: renamed from: f */
    public abstract CharSequence mo356f();

    /* JADX INFO: renamed from: g */
    public abstract void mo357g();

    /* JADX INFO: renamed from: h */
    public boolean mo358h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo359i(View view);

    /* JADX INFO: renamed from: j */
    public abstract void mo360j(int i);

    /* JADX INFO: renamed from: k */
    public abstract void mo361k(CharSequence charSequence);

    /* JADX INFO: renamed from: l */
    public abstract void mo362l(int i);

    /* JADX INFO: renamed from: m */
    public abstract void mo363m(CharSequence charSequence);

    /* JADX INFO: renamed from: n */
    public void mo364n(boolean z2) {
        this.f659b = z2;
    }
}
