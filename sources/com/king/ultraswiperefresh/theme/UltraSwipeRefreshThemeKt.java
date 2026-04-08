package com.king.ultraswiperefresh.theme;

import androidx.compose.foundation.OverscrollConfigurationKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"refresh_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class UltraSwipeRefreshThemeKt {
    /* JADX INFO: renamed from: a */
    public static final void m15395a(Function2 function2, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplMo4239q = composer.mo4239q(232282407);
        if ((i & 14) == 0) {
            i2 = (composerImplMo4239q.mo4235m(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            CompositionLocalKt.m4355b(new ProvidedValue[]{OverscrollConfigurationKt.getLocalOverscrollConfiguration().mo4359b(null)}, function2, composerImplMo4239q, ((i2 << 3) & 112) | 8);
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y == null) {
            return;
        }
        recomposeScopeImplM4267Y.f16451d = new UltraSwipeRefreshThemeKt$NoOverscrollEffect$1(function2, i);
    }
}
