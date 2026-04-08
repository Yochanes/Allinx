package androidx.compose.foundation.text;

import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/text/TextLinkScope$shapeForRange$1$1", "Landroidx/compose/ui/graphics/Shape;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextLinkScope$shapeForRange$1$1 implements Shape {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AndroidPath f8733a;

    public TextLinkScope$shapeForRange$1$1(AndroidPath androidPath) {
        this.f8733a = androidPath;
    }

    @Override // androidx.compose.p013ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo21914createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        return new Outline.Generic(this.f8733a);
    }
}
