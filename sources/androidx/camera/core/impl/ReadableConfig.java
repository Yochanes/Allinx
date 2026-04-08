package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.compose.foundation.text.C0708a;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface ReadableConfig extends Config {
    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: a */
    default Object mo1464a(Config.Option option) {
        return mo1029n().mo1464a(option);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: c */
    default boolean mo1465c(Config.Option option) {
        return mo1029n().mo1465c(option);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: d */
    default Object mo1466d(Config.Option option, Config.OptionPriority optionPriority) {
        return mo1029n().mo1466d(option, optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: e */
    default Set mo1467e() {
        return mo1029n().mo1467e();
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: f */
    default Object mo1468f(Config.Option option, Object obj) {
        return mo1029n().mo1468f(option, obj);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: g */
    default Config.OptionPriority mo1469g(Config.Option option) {
        return mo1029n().mo1469g(option);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: h */
    default Set mo1470h(Config.Option option) {
        return mo1029n().mo1470h(option);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: i */
    default void mo1471i(C0708a c0708a) {
        mo1029n().mo1471i(c0708a);
    }

    /* JADX INFO: renamed from: n */
    Config mo1029n();
}
