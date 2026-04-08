package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface DecorToolbar {
    /* JADX INFO: renamed from: a */
    boolean mo629a();

    /* JADX INFO: renamed from: b */
    void mo630b();

    /* JADX INFO: renamed from: c */
    boolean mo631c();

    void collapseActionView();

    /* JADX INFO: renamed from: d */
    void mo632d(MenuBuilder menuBuilder, MenuPresenter.Callback callback);

    /* JADX INFO: renamed from: e */
    boolean mo633e();

    /* JADX INFO: renamed from: f */
    boolean mo634f();

    /* JADX INFO: renamed from: g */
    boolean mo635g();

    Context getContext();

    CharSequence getTitle();

    /* JADX INFO: renamed from: h */
    void mo636h();

    /* JADX INFO: renamed from: i */
    boolean mo637i();

    /* JADX INFO: renamed from: j */
    void mo638j(int i);

    /* JADX INFO: renamed from: k */
    void mo639k();

    /* JADX INFO: renamed from: l */
    void mo640l(int i);

    /* JADX INFO: renamed from: m */
    ViewPropertyAnimatorCompat mo641m(int i, long j);

    /* JADX INFO: renamed from: n */
    void mo642n(int i);

    /* JADX INFO: renamed from: o */
    int mo643o();

    /* JADX INFO: renamed from: p */
    void mo644p();

    /* JADX INFO: renamed from: q */
    void mo645q();

    /* JADX INFO: renamed from: r */
    void mo646r(boolean z2);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
