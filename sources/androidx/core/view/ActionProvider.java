package androidx.core.view;

import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ShareActionProvider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActionProvider {

    /* JADX INFO: renamed from: a */
    public SubUiVisibilityListener f23346a;

    /* JADX INFO: renamed from: b */
    public VisibilityListener f23347b;

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public interface SubUiVisibilityListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface VisibilityListener {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo476a() {
        return this instanceof ShareActionProvider;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo477b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract View mo478c();

    /* JADX INFO: renamed from: d */
    public View mo479d(MenuItemImpl menuItemImpl) {
        return mo478c();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo480e() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo482g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void mo483h(VisibilityListener visibilityListener) {
        if (this.f23347b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f23347b = visibilityListener;
    }

    /* JADX INFO: renamed from: f */
    public void mo481f(SubMenuBuilder subMenuBuilder) {
    }
}
