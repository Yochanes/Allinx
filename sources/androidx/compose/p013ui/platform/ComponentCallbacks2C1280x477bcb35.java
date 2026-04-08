package androidx.compose.p013ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.compose.p013ui.res.ImageVectorCache;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1", "Landroid/content/ComponentCallbacks2;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ComponentCallbacks2C1280x477bcb35 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Configuration f19259a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageVectorCache f19260b;

    public ComponentCallbacks2C1280x477bcb35(Configuration configuration, ImageVectorCache imageVectorCache) {
        this.f19259a = configuration;
        this.f19260b = imageVectorCache;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f19259a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f19260b.f19665a.entrySet().iterator();
        while (it.hasNext()) {
            ImageVectorCache.ImageVectorEntry imageVectorEntry = (ImageVectorCache.ImageVectorEntry) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (imageVectorEntry == null || Configuration.needNewResources(iUpdateFrom, imageVectorEntry.f19667b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f19260b.f19665a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.f19260b.f19665a.clear();
    }
}
