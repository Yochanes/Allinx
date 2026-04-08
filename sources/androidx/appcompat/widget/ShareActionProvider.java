package androidx.appcompat.widget;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ShareActionProvider extends ActionProvider {

    /* JADX INFO: compiled from: Proguard */
    public interface OnShareTargetSelectedListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public class ShareActivityChooserModelPolicy implements ActivityChooserModel.OnChooseActivityListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            throw null;
        }
    }

    @Override // androidx.core.view.ActionProvider
    /* JADX INFO: renamed from: c */
    public final View mo478c() {
        new ActivityChooserView();
        throw null;
    }

    @Override // androidx.core.view.ActionProvider
    /* JADX INFO: renamed from: f */
    public final void mo481f(SubMenuBuilder subMenuBuilder) {
        subMenuBuilder.clear();
        ActivityChooserModel.m521b();
        throw null;
    }
}
