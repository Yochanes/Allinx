package androidx.constraintlayout.compose;

import androidx.compose.p013ui.semantics.SemanticsPropertyKey;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"constraintlayout-compose_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ToolingUtilsKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ KProperty[] f21034a = {Reflection.f51660a.mo18615e(new MutablePropertyReference1Impl(ToolingUtilsKt.class, "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", 1))};

    /* JADX INFO: renamed from: b */
    public static final SemanticsPropertyKey f21035b = new SemanticsPropertyKey("DesignInfoProvider");

    /* JADX INFO: renamed from: a */
    public static final void m6786a(SemanticsPropertyReceiver semanticsPropertyReceiver, DesignInfoProvider designInfoProvider) {
        KProperty kProperty = f21034a[0];
        SemanticsPropertyKey semanticsPropertyKey = f21035b;
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey, designInfoProvider);
    }
}
