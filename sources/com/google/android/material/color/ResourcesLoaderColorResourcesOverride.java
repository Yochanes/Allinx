package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.C3734R;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi
class ResourcesLoaderColorResourcesOverride implements ColorResourcesOverride {

    /* JADX INFO: compiled from: Proguard */
    public static class ResourcesLoaderColorResourcesOverrideSingleton {
        private static final ResourcesLoaderColorResourcesOverride INSTANCE = new ResourcesLoaderColorResourcesOverride(null);

        private ResourcesLoaderColorResourcesOverrideSingleton() {
        }

        public static /* synthetic */ ResourcesLoaderColorResourcesOverride access$000() {
            return INSTANCE;
        }
    }

    public /* synthetic */ ResourcesLoaderColorResourcesOverride(C38071 c38071) {
        this();
    }

    public static ColorResourcesOverride getInstance() {
        return ResourcesLoaderColorResourcesOverrideSingleton.access$000();
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(Context context, Map<Integer, Integer> map) {
        if (!ResourcesLoaderUtils.addResourcesLoaderToContext(context, map)) {
            return false;
        }
        ThemeUtils.applyThemeOverlay(context, C3734R.style.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    @NonNull
    public Context wrapContextIfPossible(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, C3734R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return ResourcesLoaderUtils.addResourcesLoaderToContext(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    private ResourcesLoaderColorResourcesOverride() {
    }
}
