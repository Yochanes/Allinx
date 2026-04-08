package androidx.compose.p013ui.semantics;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SemanticsConfigurationKt {
    /* JADX INFO: renamed from: a */
    public static final Object m6268a(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey semanticsPropertyKey) {
        SemanticsConfigurationKt$getOrNull$1 semanticsConfigurationKt$getOrNull$1 = SemanticsConfigurationKt$getOrNull$1.f19768a;
        Object objM2109e = semanticsConfiguration.f19764a.m2109e(semanticsPropertyKey);
        return objM2109e == null ? semanticsConfigurationKt$getOrNull$1.invoke() : objM2109e;
    }
}
