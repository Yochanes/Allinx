package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import androidx.annotation.RequiresApi;
import androidx.work.impl.utils.AbstractC2335a;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi
final class ResourcesLoaderUtils {
    private ResourcesLoaderUtils() {
    }

    public static boolean addResourcesLoaderToContext(Context context, Map<Integer, Integer> map) throws Throwable {
        ResourcesLoader resourcesLoaderCreate = ColorResourcesLoaderCreator.create(context, map);
        if (resourcesLoaderCreate == null) {
            return false;
        }
        AbstractC2335a.m12307p(context.getResources(), new ResourcesLoader[]{resourcesLoaderCreate});
        return true;
    }

    public static boolean isColorResource(int i) {
        return 28 <= i && i <= 31;
    }
}
