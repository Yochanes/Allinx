package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface CameraConfig extends ReadableConfig {

    /* JADX INFO: renamed from: a */
    public static final Config.Option f2634a = new AutoValue_Config_Option("camerax.core.camera.useCaseConfigFactory", UseCaseConfigFactory.class, null);

    /* JADX INFO: renamed from: b */
    public static final Config.Option f2635b = new AutoValue_Config_Option("camerax.core.camera.compatibilityId", Identifier.class, null);

    /* JADX INFO: renamed from: c */
    public static final Config.Option f2636c = new AutoValue_Config_Option("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);

    /* JADX INFO: renamed from: d */
    public static final Config.Option f2637d = new AutoValue_Config_Option("camerax.core.camera.SessionProcessor", SessionProcessor.class, null);

    /* JADX INFO: compiled from: Proguard */
    public interface Builder<B> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequiredRule {
    }

    static {
        new AutoValue_Config_Option("camerax.core.camera.isZslDisabled", Boolean.class, null);
    }

    /* JADX INFO: renamed from: A */
    default int m1437A() {
        return ((Integer) mo1468f(f2636c, 0)).intValue();
    }

    /* JADX INFO: renamed from: F */
    default SessionProcessor m1438F() {
        return (SessionProcessor) mo1468f(f2637d, null);
    }

    /* JADX INFO: renamed from: M */
    Identifier mo1439M();

    /* JADX INFO: renamed from: j */
    default UseCaseConfigFactory m1440j() {
        return (UseCaseConfigFactory) mo1468f(f2634a, UseCaseConfigFactory.f2819a);
    }
}
