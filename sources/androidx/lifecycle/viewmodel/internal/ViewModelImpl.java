package androidx.lifecycle.viewmodel.internal;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ViewModelImpl {

    /* JADX INFO: renamed from: a */
    public final SynchronizedObject f25050a = new SynchronizedObject();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f25051b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f25052c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public volatile boolean f25053d;

    /* JADX INFO: renamed from: b */
    public static void m9194b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9195a(AutoCloseable closeable) {
        Intrinsics.m18599g(closeable, "closeable");
        if (this.f25053d) {
            m9194b(closeable);
            return;
        }
        synchronized (this.f25050a) {
            this.f25052c.add(closeable);
        }
    }
}
