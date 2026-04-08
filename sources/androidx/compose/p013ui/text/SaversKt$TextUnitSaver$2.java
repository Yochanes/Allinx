package androidx.compose.p013ui.text;

import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/unit/TextUnit;", "it", "", "invoke-XNhUCwk"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SaversKt$TextUnitSaver$2 extends Lambda implements Function1<Object, TextUnit> {

    /* JADX INFO: renamed from: a */
    public static final SaversKt$TextUnitSaver$2 f20050a = new SaversKt$TextUnitSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.m18594b(obj, Boolean.FALSE)) {
            return new TextUnit(TextUnit.f20575c);
        }
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        Intrinsics.m18596d(f);
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        TextUnitType textUnitType = obj3 != null ? (TextUnitType) obj3 : null;
        Intrinsics.m18596d(textUnitType);
        return new TextUnit(TextUnitKt.m6681d(fFloatValue, textUnitType.f20577a));
    }
}
