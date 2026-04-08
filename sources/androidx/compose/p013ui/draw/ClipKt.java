package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.Shape;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ClipKt {
    /* JADX INFO: renamed from: a */
    public static final Modifier m4944a(Modifier modifier, Shape shape) {
        return GraphicsLayerModifierKt.m5207b(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, shape, true, 124927);
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m4945b(Modifier modifier) {
        return GraphicsLayerModifierKt.m5207b(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }
}
