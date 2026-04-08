package androidx.paging;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Landroidx/paging/PagedList;", "", "T", "Ljava/util/AbstractList;", "BoundaryCallback", "Builder", "Callback", "Companion", "Config", "LoadStateManager", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@Deprecated
@SourceDebugExtension
public abstract class PagedList<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f31060d = 0;

    /* JADX INFO: renamed from: a */
    public final PagedStorage f31061a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f31062b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f31063c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/PagedList$BoundaryCallback;", "", "T", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @MainThread
    public static abstract class BoundaryCallback<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u0001*\b\b\u0002\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagedList$Builder;", "", "Key", "Value", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @Deprecated
    public static final class Builder<Key, Value> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/PagedList$Callback;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class Callback {
        /* JADX INFO: renamed from: a */
        public abstract void mo11319a();

        /* JADX INFO: renamed from: b */
        public abstract void mo11320b();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/PagedList$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagedList$Config;", "", "Builder", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Config {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/PagedList$Config$Builder;", "", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Builder {

            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/paging/PagedList$Config$Builder$Companion;", "", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
            public static final class Companion {
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/PagedList$Config$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/PagedList$LoadStateManager;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @RestrictTo
    public static abstract class LoadStateManager {

        /* JADX INFO: renamed from: a */
        public LoadState f31067a;

        /* JADX INFO: renamed from: b */
        public LoadState f31068b;

        /* JADX INFO: renamed from: c */
        public LoadState f31069c;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo11318a(LoadType loadType, LoadState loadState);

        /* JADX INFO: renamed from: b */
        public final void m11387b(LoadType type, LoadState state) {
            Intrinsics.m18599g(type, "type");
            Intrinsics.m18599g(state, "state");
            int iOrdinal = type.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        if (Intrinsics.m18594b(this.f31069c, state)) {
                            return;
                        } else {
                            this.f31069c = state;
                        }
                    }
                } else if (Intrinsics.m18594b(this.f31068b, state)) {
                    return;
                } else {
                    this.f31068b = state;
                }
            } else if (Intrinsics.m18594b(this.f31067a, state)) {
                return;
            } else {
                this.f31067a = state;
            }
            mo11318a(type, state);
        }
    }

    public PagedList(PagingSource pagingSource, PagedStorage pagedStorage) {
        Intrinsics.m18599g(null, "coroutineScope");
        Intrinsics.m18599g(null, "notifyDispatcher");
        Intrinsics.m18599g(null, "config");
        this.f31061a = pagedStorage;
        this.f31062b = new ArrayList();
        this.f31063c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m11385a(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.m18432g0(this.f31062b).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.mo11319a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11386c(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.m18432g0(this.f31062b).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.mo11320b();
                throw null;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f31061a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31061a.getSize();
    }
}
