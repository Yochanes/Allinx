package androidx.camera.core.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface IoConfig extends ReadableConfig {

    /* JADX INFO: renamed from: A */
    public static final Config.Option f2981A = Config.Option.m1472a(Executor.class, "camerax.core.io.ioExecutor");

    /* JADX INFO: compiled from: Proguard */
    public interface Builder<B> {
    }
}
