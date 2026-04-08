package androidx.appcompat.widget;

import android.view.MenuItem;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PopupMenu {

    /* JADX INFO: renamed from: androidx.appcompat.widget.PopupMenu$2 */
    /* JADX INFO: compiled from: Proguard */
    class C01252 implements PopupWindow.OnDismissListener {
        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.PopupMenu$3 */
    /* JADX INFO: compiled from: Proguard */
    class C01263 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        /* JADX INFO: renamed from: b */
        public final ShowableListMenu mo439b() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* JADX INFO: renamed from: c */
        public final boolean mo440c() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* JADX INFO: renamed from: d */
        public final boolean mo517d() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnDismissListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnMenuItemClickListener {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.PopupMenu$1 */
    /* JADX INFO: compiled from: Proguard */
    class C01241 implements MenuBuilder.Callback {
        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            throw null;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }
}
