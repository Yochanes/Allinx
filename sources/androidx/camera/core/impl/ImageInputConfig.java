package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Config;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface ImageInputConfig extends ReadableConfig {

    /* JADX INFO: renamed from: e */
    public static final Config.Option f2728e = new AutoValue_Config_Option("camerax.core.imageInput.inputFormat", Integer.TYPE, null);

    /* JADX INFO: renamed from: f */
    public static final Config.Option f2729f = new AutoValue_Config_Option("camerax.core.imageInput.inputDynamicRange", DynamicRange.class, null);

    /* JADX INFO: compiled from: Proguard */
    public interface Builder<B> {
    }

    /* JADX INFO: renamed from: l */
    default DynamicRange m1491l() {
        DynamicRange dynamicRange = (DynamicRange) mo1468f(f2729f, DynamicRange.f2246c);
        dynamicRange.getClass();
        return dynamicRange;
    }

    /* JADX INFO: renamed from: p */
    default int mo1490p() {
        return ((Integer) mo1464a(f2728e)).intValue();
    }

    /* JADX INFO: renamed from: r */
    default boolean m1492r() {
        return mo1465c(f2729f);
    }
}
