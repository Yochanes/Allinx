package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/material3/BottomAppBarState;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class BottomAppBarState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, BottomAppBarState, List<? extends Float>> {

    /* JADX INFO: renamed from: a */
    public static final BottomAppBarState$Companion$Saver$1 f12227a = new BottomAppBarState$Companion$Saver$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BottomAppBarState bottomAppBarState = (BottomAppBarState) obj2;
        return CollectionsKt.m18414O(Float.valueOf(bottomAppBarState.mo3880e()), Float.valueOf(bottomAppBarState.mo3877b()), Float.valueOf(bottomAppBarState.mo3878c()));
    }
}
