package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SelectionRegistrarKt {

    /* JADX INFO: renamed from: a */
    public static final DynamicProvidableCompositionLocal f9888a = new DynamicProvidableCompositionLocal(SelectionRegistrarKt$LocalSelectionRegistrar$1.f9889a);

    /* JADX INFO: renamed from: a */
    public static final boolean m3643a(SelectionRegistrar selectionRegistrar, long j) {
        LongObjectMap longObjectMapMo3636d = selectionRegistrar.mo3636d();
        if (longObjectMapMo3636d != null) {
            return longObjectMapMo3636d.m1996a(j);
        }
        return false;
    }
}
