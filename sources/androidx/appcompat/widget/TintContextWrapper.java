package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class TintContextWrapper extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public static final Object f1407a = null;

    /* JADX INFO: renamed from: a */
    public static void m702a(Context context) {
        if ((context instanceof TintContextWrapper) || (context.getResources() instanceof TintResources) || (context.getResources() instanceof VectorEnabledTintResources)) {
            return;
        }
        int i = VectorEnabledTintResources.f1484a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return null;
    }
}
