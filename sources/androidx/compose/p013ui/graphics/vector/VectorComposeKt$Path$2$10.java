package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.StrokeCap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/vector/PathComponent;", "it", "Landroidx/compose/ui/graphics/StrokeCap;", "invoke-CSYIeUk", "(Landroidx/compose/ui/graphics/vector/PathComponent;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class VectorComposeKt$Path$2$10 extends Lambda implements Function2<PathComponent, StrokeCap, Unit> {

    /* JADX INFO: renamed from: a */
    public static final VectorComposeKt$Path$2$10 f18118a = new VectorComposeKt$Path$2$10(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PathComponent pathComponent = (PathComponent) obj;
        pathComponent.f18004h = ((StrokeCap) obj2).f17676a;
        pathComponent.f18011o = true;
        pathComponent.m5501c();
        return Unit.f51459a;
    }
}
