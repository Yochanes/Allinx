package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "distance", "invoke", "(F)Ljava/lang/Float;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class DrawerState$anchoredDraggableState$1 extends Lambda implements Function1<Float, Float> {

    /* JADX INFO: renamed from: a */
    public static final DrawerState$anchoredDraggableState$1 f13294a = new DrawerState$anchoredDraggableState$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        float f = NavigationDrawerKt.f13832a;
        return Float.valueOf(fFloatValue * 0.5f);
    }
}
