package androidx.loader.app;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.PrintWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class LoaderManager {

    /* JADX INFO: compiled from: Proguard */
    public interface LoaderCallbacks<D> {
    }

    /* JADX INFO: renamed from: b */
    public static LoaderManager m9196b(LifecycleOwner lifecycleOwner) {
        return new LoaderManagerImpl(lifecycleOwner, ((ViewModelStoreOwner) lifecycleOwner).getViewModelStore());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9197a(String str, PrintWriter printWriter);

    /* JADX INFO: renamed from: c */
    public abstract void mo9198c();
}
