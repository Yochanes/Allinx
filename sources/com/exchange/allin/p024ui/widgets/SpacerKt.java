package com.exchange.allin.p024ui.widgets;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.navigation.compose.C2024h;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"app_localRelease"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class SpacerKt {
    /* JADX INFO: renamed from: a */
    public static final void m14146a(Composer composer, int i) {
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6554a;
        ComposerImpl composerImplMo4239q = composer.mo4239q(-645639022);
        if ((i & 3) == 2 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            androidx.compose.foundation.layout.SpacerKt.m2836a(composerImplMo4239q, rowScopeInstance.mo2761a(Modifier.Companion.f17180a, 1.0f, true));
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C2024h(i, 16);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14147b(Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(557561258);
        if ((i & 3) == 2 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            androidx.compose.foundation.layout.SpacerKt.m2836a(composerImplMo4239q, ColumnScope.m2756a(Modifier.Companion.f17180a));
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C2024h(i, 17);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m14148c(float f, Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(1204278588);
        if ((i & 3) == 2 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            androidx.compose.foundation.layout.SpacerKt.m2836a(composerImplMo4239q, SizeKt.m2830r(Modifier.Companion.f17180a, f));
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C3548r(f, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m14149d(float f, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplMo4239q = composer.mo4239q(-54585106);
        if ((i & 6) == 0) {
            i2 = (composerImplMo4239q.mo4230h(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            androidx.compose.foundation.layout.SpacerKt.m2836a(composerImplMo4239q, SizeKt.m2818f(Modifier.Companion.f17180a, f));
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C3549s(f, i);
        }
    }
}
