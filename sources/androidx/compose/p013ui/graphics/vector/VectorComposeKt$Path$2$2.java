package androidx.compose.p013ui.graphics.vector;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/vector/PathComponent;", "it", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class VectorComposeKt$Path$2$2 extends Lambda implements Function2<PathComponent, List<? extends PathNode>, Unit> {

    /* JADX INFO: renamed from: a */
    public static final VectorComposeKt$Path$2$2 f18123a = new VectorComposeKt$Path$2$2(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PathComponent pathComponent = (PathComponent) obj;
        pathComponent.f18000d = (List) obj2;
        pathComponent.f18010n = true;
        pathComponent.m5501c();
        return Unit.f51459a;
    }
}
