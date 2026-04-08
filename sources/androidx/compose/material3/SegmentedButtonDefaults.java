package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/SegmentedButtonDefaults;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SegmentedButtonDefaults {

    /* JADX INFO: renamed from: a */
    public static final SegmentedButtonDefaults f14361a = new SegmentedButtonDefaults();

    /* JADX INFO: renamed from: b */
    public static final float f14362b;

    static {
        float f = OutlinedSegmentedButtonTokens.f15968a;
        float f2 = OutlinedSegmentedButtonTokens.f15968a;
        f14362b = OutlinedSegmentedButtonTokens.f15969b;
    }

    /* JADX INFO: renamed from: a */
    public final void m4024a(Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(-1273041460);
        if ((i & 3) == 2 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            IconKt.m3962b(CheckKt.m3819a(), null, SizeKt.m2826n(Modifier.Companion.f17180a, f14362b), 0L, composerImplMo4239q, 48, 8);
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new SegmentedButtonDefaults$ActiveIcon$1(this, i);
        }
    }
}
