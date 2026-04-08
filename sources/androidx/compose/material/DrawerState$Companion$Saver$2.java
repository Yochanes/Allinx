package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/material/DrawerState;", "it", "Landroidx/compose/material/DrawerValue;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DrawerState$Companion$Saver$2 extends Lambda implements Function1<DrawerValue, DrawerState> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f10588a = DrawerKt$rememberDrawerState$1.f10583a;

    public DrawerState$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new DrawerState((DrawerValue) obj);
    }
}
