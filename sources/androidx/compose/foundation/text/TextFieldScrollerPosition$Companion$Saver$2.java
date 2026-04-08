package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "restored", "", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextFieldScrollerPosition$Companion$Saver$2 extends Lambda implements Function1<List<? extends Object>, TextFieldScrollerPosition> {

    /* JADX INFO: renamed from: a */
    public static final TextFieldScrollerPosition$Companion$Saver$2 f8696a = new TextFieldScrollerPosition$Companion$Saver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(1);
        Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        Orientation orientation = ((Boolean) obj2).booleanValue() ? Orientation.f5829a : Orientation.f5830b;
        Object obj3 = list.get(0);
        Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.Float");
        return new TextFieldScrollerPosition(orientation, ((Float) obj3).floatValue());
    }
}
