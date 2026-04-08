package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LayoutModifierKt {
    /* JADX INFO: renamed from: a */
    public static final Modifier m5643a(Modifier modifier, Function3 function3) {
        return modifier.then(new LayoutElement(function3));
    }
}
