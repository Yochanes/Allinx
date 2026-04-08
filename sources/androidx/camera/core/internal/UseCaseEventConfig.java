package androidx.camera.core.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface UseCaseEventConfig extends ReadableConfig {

    /* JADX INFO: renamed from: E */
    public static final Config.Option f2995E = Config.Option.m1472a(UseCase.EventCallback.class, "camerax.core.useCaseEventCallback");

    /* JADX INFO: compiled from: Proguard */
    public interface Builder<B> {
    }

    /* JADX INFO: renamed from: k */
    default UseCase.EventCallback m1660k() {
        return (UseCase.EventCallback) mo1468f(f2995E, null);
    }
}
