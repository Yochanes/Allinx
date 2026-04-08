package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import java.io.Closeable;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0004J!\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\f\u0010\u0010J%\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0011*\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18302d2 = {"Landroidx/lifecycle/ViewModel;", "", "", "onCleared", "()V", "clear$lifecycle_viewmodel_release", "clear", "", "key", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "(Ljava/io/Closeable;)V", "T", "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "impl", "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class ViewModel {

    @Nullable
    private final ViewModelImpl impl = new ViewModelImpl();

    public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            if (viewModelImpl.f25053d) {
                ViewModelImpl.m9194b(closeable);
                return;
            }
            synchronized (viewModelImpl.f25050a) {
                autoCloseable = (AutoCloseable) viewModelImpl.f25051b.put(key, closeable);
            }
            ViewModelImpl.m9194b(autoCloseable);
        }
    }

    @MainThread
    public final void clear$lifecycle_viewmodel_release() {
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null && !viewModelImpl.f25053d) {
            viewModelImpl.f25053d = true;
            synchronized (viewModelImpl.f25050a) {
                try {
                    Iterator it = viewModelImpl.f25051b.values().iterator();
                    while (it.hasNext()) {
                        ViewModelImpl.m9194b((AutoCloseable) it.next());
                    }
                    Iterator it2 = viewModelImpl.f25052c.iterator();
                    while (it2.hasNext()) {
                        ViewModelImpl.m9194b((AutoCloseable) it2.next());
                    }
                    viewModelImpl.f25052c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String key) {
        T t;
        Intrinsics.m18599g(key, "key");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl == null) {
            return null;
        }
        synchronized (viewModelImpl.f25050a) {
            t = (T) viewModelImpl.f25051b.get(key);
        }
        return t;
    }

    public void addCloseable(@NotNull AutoCloseable closeable) {
        Intrinsics.m18599g(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.m9195a(closeable);
        }
    }

    @Deprecated
    public /* synthetic */ void addCloseable(Closeable closeable) {
        Intrinsics.m18599g(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.m9195a(closeable);
        }
    }

    public void onCleared() {
    }
}
