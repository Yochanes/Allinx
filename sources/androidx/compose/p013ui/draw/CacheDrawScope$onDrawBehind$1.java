package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class CacheDrawScope$onDrawBehind$1 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f17391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$onDrawBehind$1(Function1 function1) {
        super(1);
        this.f17391a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        this.f17391a.invoke(contentDrawScope);
        contentDrawScope.mo5369C1();
        return Unit.f51459a;
    }
}
