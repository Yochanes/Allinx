package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil.RealImageLoader;
import coil.memory.MemoryCache;
import coil.network.EmptyNetworkObserver;
import coil.network.NetworkObserver;
import coil.network.NetworkObserverKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcoil/util/SystemCallbacks;", "Landroid/content/ComponentCallbacks2;", "Lcoil/network/NetworkObserver$Listener;", "Companion", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SystemCallbacks implements ComponentCallbacks2, NetworkObserver.Listener {

    /* JADX INFO: renamed from: a */
    public final WeakReference f34015a;

    /* JADX INFO: renamed from: b */
    public Context f34016b;

    /* JADX INFO: renamed from: c */
    public NetworkObserver f34017c;

    /* JADX INFO: renamed from: d */
    public boolean f34018d;

    /* JADX INFO: renamed from: f */
    public boolean f34019f = true;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Lcoil/util/SystemCallbacks$Companion;", "", "", "TAG", "Ljava/lang/String;", "ONLINE", "OFFLINE", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public SystemCallbacks(RealImageLoader realImageLoader) {
        this.f34015a = new WeakReference(realImageLoader);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12542a() {
        try {
            RealImageLoader realImageLoader = (RealImageLoader) this.f34015a.get();
            if (realImageLoader == null) {
                m12543b();
            } else if (this.f34017c == null) {
                NetworkObserver networkObserverM12493a = realImageLoader.f33285f.f34008b ? NetworkObserverKt.m12493a(realImageLoader.f33280a, this) : new EmptyNetworkObserver();
                this.f34017c = networkObserverM12493a;
                this.f34019f = networkObserverM12493a.mo12492a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12543b() {
        try {
            if (this.f34018d) {
                return;
            }
            this.f34018d = true;
            Context context = this.f34016b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            NetworkObserver networkObserver = this.f34017c;
            if (networkObserver != null) {
                networkObserver.shutdown();
            }
            this.f34015a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((RealImageLoader) this.f34015a.get()) == null) {
            m12543b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        RealImageLoader realImageLoader = (RealImageLoader) this.f34015a.get();
        if (realImageLoader != null) {
            MemoryCache memoryCache = (MemoryCache) realImageLoader.f33282c.getValue();
            if (memoryCache != null) {
                memoryCache.mo12482b(i);
            }
        } else {
            m12543b();
        }
    }
}
