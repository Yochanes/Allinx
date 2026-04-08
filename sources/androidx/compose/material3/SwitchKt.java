package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.tokens.SwitchTokens;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"material3_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SwitchKt {

    /* JADX INFO: renamed from: a */
    public static final float f14756a;

    /* JADX INFO: renamed from: b */
    public static final float f14757b;

    /* JADX INFO: renamed from: c */
    public static final float f14758c;

    /* JADX INFO: renamed from: d */
    public static final float f14759d;

    /* JADX INFO: renamed from: e */
    public static final float f14760e;

    static {
        float f = SwitchTokens.f16064b;
        f14756a = f;
        f14757b = SwitchTokens.f16068f;
        f14758c = SwitchTokens.f16067e;
        float f2 = SwitchTokens.f16065c;
        f14759d = f2;
        f14760e = (f2 - f) / 2;
        new SnapSpec(0);
        new TweenSpec(100, (Easing) null, 6);
    }
}
