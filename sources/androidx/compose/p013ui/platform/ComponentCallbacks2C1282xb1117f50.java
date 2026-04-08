package androidx.compose.p013ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.compose.p013ui.res.ResourceIdCache;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1", "Landroid/content/ComponentCallbacks2;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ComponentCallbacks2C1282xb1117f50 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ResourceIdCache f19265a;

    public ComponentCallbacks2C1282xb1117f50(ResourceIdCache resourceIdCache) {
        this.f19265a = resourceIdCache;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ResourceIdCache resourceIdCache = this.f19265a;
        synchronized (resourceIdCache) {
            resourceIdCache.f19670a.m2023c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        ResourceIdCache resourceIdCache = this.f19265a;
        synchronized (resourceIdCache) {
            resourceIdCache.f19670a.m2023c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ResourceIdCache resourceIdCache = this.f19265a;
        synchronized (resourceIdCache) {
            resourceIdCache.f19670a.m2023c();
        }
    }
}
