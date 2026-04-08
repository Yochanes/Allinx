package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class SupportActionModeWrapper extends android.view.ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f672a;

    /* JADX INFO: renamed from: b */
    public final ActionMode f673b;

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class CallbackWrapper implements ActionMode.Callback {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f674a;

        /* JADX INFO: renamed from: b */
        public final Context f675b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f676c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final SimpleArrayMap f677d = new SimpleArrayMap(0);

        public CallbackWrapper(Context context, ActionMode.Callback callback) {
            this.f675b = context;
            this.f674a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* JADX INFO: renamed from: a */
        public final void mo316a(ActionMode actionMode) {
            this.f674a.onDestroyActionMode(m421e(actionMode));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* JADX INFO: renamed from: b */
        public final boolean mo317b(ActionMode actionMode, Menu menu) {
            SupportActionModeWrapper supportActionModeWrapperM421e = m421e(actionMode);
            SimpleArrayMap simpleArrayMap = this.f677d;
            Menu menuWrapperICS = (Menu) simpleArrayMap.get(menu);
            if (menuWrapperICS == null) {
                menuWrapperICS = new MenuWrapperICS(this.f675b, (SupportMenu) menu);
                simpleArrayMap.put(menu, menuWrapperICS);
            }
            return this.f674a.onPrepareActionMode(supportActionModeWrapperM421e, menuWrapperICS);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* JADX INFO: renamed from: c */
        public final boolean mo318c(ActionMode actionMode, MenuBuilder menuBuilder) {
            SupportActionModeWrapper supportActionModeWrapperM421e = m421e(actionMode);
            SimpleArrayMap simpleArrayMap = this.f677d;
            Menu menuWrapperICS = (Menu) simpleArrayMap.get(menuBuilder);
            if (menuWrapperICS == null) {
                menuWrapperICS = new MenuWrapperICS(this.f675b, menuBuilder);
                simpleArrayMap.put(menuBuilder, menuWrapperICS);
            }
            return this.f674a.onCreateActionMode(supportActionModeWrapperM421e, menuWrapperICS);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* JADX INFO: renamed from: d */
        public final boolean mo319d(ActionMode actionMode, MenuItem menuItem) {
            return this.f674a.onActionItemClicked(m421e(actionMode), new MenuItemWrapperICS(this.f675b, (SupportMenuItem) menuItem));
        }

        /* JADX INFO: renamed from: e */
        public final SupportActionModeWrapper m421e(ActionMode actionMode) {
            ArrayList arrayList = this.f676c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                SupportActionModeWrapper supportActionModeWrapper = (SupportActionModeWrapper) arrayList.get(i);
                if (supportActionModeWrapper != null && supportActionModeWrapper.f673b == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.f675b, actionMode);
            arrayList.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }
    }

    public SupportActionModeWrapper(Context context, ActionMode actionMode) {
        this.f672a = context;
        this.f673b = actionMode;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f673b.mo351a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f673b.mo352b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuWrapperICS(this.f672a, this.f673b.mo353c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f673b.mo354d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f673b.mo355e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f673b.f658a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f673b.mo356f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f673b.f659b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f673b.mo357g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f673b.mo358h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f673b.mo359i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f673b.mo361k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f673b.f658a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f673b.mo363m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f673b.mo364n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f673b.mo360j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f673b.mo362l(i);
    }
}
