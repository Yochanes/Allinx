package androidx.camera.core.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface TargetConfig<T> extends ReadableConfig {

    /* JADX INFO: renamed from: B */
    public static final Config.Option f2992B = Config.Option.m1472a(String.class, "camerax.core.target.name");

    /* JADX INFO: renamed from: C */
    public static final Config.Option f2993C = Config.Option.m1472a(Class.class, "camerax.core.target.class");

    /* JADX INFO: compiled from: Proguard */
    public interface Builder<T, B> {
    }

    /* JADX INFO: renamed from: J */
    default String m1658J() {
        return (String) mo1464a(f2992B);
    }

    /* JADX INFO: renamed from: y */
    default String m1659y(String str) {
        return (String) mo1468f(f2992B, str);
    }
}
