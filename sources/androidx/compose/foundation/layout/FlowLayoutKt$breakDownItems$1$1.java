package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "placeable", "Landroidx/compose/ui/layout/Placeable;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class FlowLayoutKt$breakDownItems$1$1 extends Lambda implements Function1<Placeable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f6397a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$breakDownItems$1$1(Ref.ObjectRef objectRef) {
        super(1);
        this.f6397a = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f6397a.f51659a = (Placeable) obj;
        return Unit.f51459a;
    }
}
