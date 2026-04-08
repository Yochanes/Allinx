package androidx.compose.p013ui.semantics;

import androidx.compose.p013ui.Modifier;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SemanticsModifierKt {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f19769a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public static final Modifier m6269a(Modifier modifier, Function1 function1) {
        return modifier.then(new ClearAndSetSemanticsElement(function1));
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m6270b(Modifier modifier, boolean z2, Function1 function1) {
        return modifier.then(new AppendedSemanticsElement(function1, z2));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Modifier m6271c(Modifier modifier, Function1 function1) {
        return m6270b(modifier, false, function1);
    }
}
