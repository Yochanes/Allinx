package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"androidx/compose/foundation/text/input/internal/undo/TextUndoOperation$Companion$Saver$1", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextUndoOperation$Companion$Saver$1 implements Saver<TextUndoOperation, Object> {
    @Override // androidx.compose.runtime.saveable.Saver
    /* JADX INFO: renamed from: a */
    public final Object mo3288a(Object obj) {
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.String");
        Object obj4 = list.get(2);
        Intrinsics.m18597e(obj4, "null cannot be cast to non-null type kotlin.String");
        Object obj5 = list.get(3);
        Intrinsics.m18597e(obj5, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        Intrinsics.m18597e(obj6, "null cannot be cast to non-null type kotlin.Int");
        long jM6410a = TextRangeKt.m6410a(iIntValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        Intrinsics.m18597e(obj7, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        Intrinsics.m18597e(obj8, "null cannot be cast to non-null type kotlin.Int");
        long jM6410a2 = TextRangeKt.m6410a(iIntValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        Intrinsics.m18597e(obj9, "null cannot be cast to non-null type kotlin.Long");
        return new TextUndoOperation(iIntValue, (String) obj3, (String) obj4, jM6410a, jM6410a2, ((Long) obj9).longValue(), false, 64);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    /* JADX INFO: renamed from: b */
    public final Object mo3289b(SaverScope saverScope, Object obj) {
        TextUndoOperation textUndoOperation = (TextUndoOperation) obj;
        Integer numValueOf = Integer.valueOf(textUndoOperation.f9410a);
        int i = TextRange.f20116c;
        long j = textUndoOperation.f9413d;
        Integer numValueOf2 = Integer.valueOf((int) (j >> 32));
        Integer numValueOf3 = Integer.valueOf((int) (j & 4294967295L));
        long j2 = textUndoOperation.f9414e;
        return CollectionsKt.m18414O(numValueOf, textUndoOperation.f9411b, textUndoOperation.f9412c, numValueOf2, numValueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (4294967295L & j2)), Long.valueOf(textUndoOperation.f9415f));
    }
}
