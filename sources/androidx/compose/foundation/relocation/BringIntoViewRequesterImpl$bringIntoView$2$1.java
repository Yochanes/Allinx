package androidx.compose.foundation.relocation;

import androidx.compose.p013ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BringIntoViewRequesterImpl$bringIntoView$2$1 extends Lambda implements Function0<Rect> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Rect f7917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$2$1(Rect rect) {
        super(0);
        this.f7917a = rect;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f7917a;
    }
}
