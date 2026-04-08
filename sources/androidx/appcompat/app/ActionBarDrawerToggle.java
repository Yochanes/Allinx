package androidx.appcompat.app;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* JADX INFO: renamed from: androidx.appcompat.app.ActionBarDrawerToggle$1 */
    /* JADX INFO: compiled from: Proguard */
    class ViewOnClickListenerC00541 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Delegate {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface DelegateProvider {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FrameworkActionBarDelegate implements Delegate {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ToolbarCompatDelegate implements Delegate {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerSlide(View view, float f) {
        throw null;
    }
}
