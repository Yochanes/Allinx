package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "", "NestedPrefetchScopeImpl", "PrefetchHandle", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LazyLayoutPrefetchState {

    /* JADX INFO: renamed from: a */
    public final PrefetchScheduler f7350a;

    /* JADX INFO: renamed from: b */
    public final Lambda f7351b;

    /* JADX INFO: renamed from: c */
    public final PrefetchMetrics f7352c = new PrefetchMetrics();

    /* JADX INFO: renamed from: d */
    public PrefetchHandleProvider f7353d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$NestedPrefetchScopeImpl;", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public final class NestedPrefetchScopeImpl implements NestedPrefetchScope {

        /* JADX INFO: renamed from: a */
        public final ArrayList f7354a = new ArrayList();

        public NestedPrefetchScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* JADX INFO: renamed from: a */
        public final void mo3071a(int i) {
            long j = LazyLayoutPrefetchStateKt.f7356a;
            LazyLayoutPrefetchState lazyLayoutPrefetchState = LazyLayoutPrefetchState.this;
            PrefetchHandleProvider prefetchHandleProvider = lazyLayoutPrefetchState.f7353d;
            if (prefetchHandleProvider == null) {
                return;
            }
            this.f7354a.add(prefetchHandleProvider.new HandleAndRequestImpl(i, j, lazyLayoutPrefetchState.f7352c));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "", "Landroidx/compose/foundation/lazy/layout/DummyHandle;", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface PrefetchHandle {
        /* JADX INFO: renamed from: b */
        void mo3026b();

        void cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, Function1 function1) {
        this.f7350a = prefetchScheduler;
        this.f7351b = (Lambda) function1;
    }

    /* JADX INFO: renamed from: a */
    public final PrefetchHandle m3070a(int i, long j) {
        PrefetchHandleProvider prefetchHandleProvider = this.f7353d;
        if (prefetchHandleProvider == null) {
            return DummyHandle.f7185a;
        }
        PrefetchHandleProvider.HandleAndRequestImpl handleAndRequestImpl = prefetchHandleProvider.new HandleAndRequestImpl(i, j, this.f7352c);
        prefetchHandleProvider.f7443c.mo3022a(handleAndRequestImpl);
        return handleAndRequestImpl;
    }
}
