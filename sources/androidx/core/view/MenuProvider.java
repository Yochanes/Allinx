package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface MenuProvider {
    /* JADX INFO: renamed from: a */
    boolean mo7745a(MenuItem menuItem);

    /* JADX INFO: renamed from: c */
    void mo7747c(Menu menu, MenuInflater menuInflater);

    /* JADX INFO: renamed from: b */
    default void mo7746b(Menu menu) {
    }

    /* JADX INFO: renamed from: d */
    default void mo7748d(Menu menu) {
    }
}
