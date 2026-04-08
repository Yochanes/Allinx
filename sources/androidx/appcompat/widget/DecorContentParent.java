package androidx.appcompat.widget;

import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface DecorContentParent {
    /* JADX INFO: renamed from: a */
    boolean mo501a();

    /* JADX INFO: renamed from: b */
    void mo502b();

    /* JADX INFO: renamed from: c */
    boolean mo503c();

    /* JADX INFO: renamed from: d */
    void mo504d(MenuBuilder menuBuilder, MenuPresenter.Callback callback);

    /* JADX INFO: renamed from: e */
    boolean mo505e();

    /* JADX INFO: renamed from: f */
    boolean mo506f();

    /* JADX INFO: renamed from: g */
    boolean mo507g();

    /* JADX INFO: renamed from: h */
    void mo508h(int i);

    /* JADX INFO: renamed from: i */
    void mo509i();

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
