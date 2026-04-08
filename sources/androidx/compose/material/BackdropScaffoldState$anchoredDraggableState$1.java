package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class BackdropScaffoldState$anchoredDraggableState$1 extends Lambda implements Function1<Float, Float> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BackdropScaffoldState f10222a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState$anchoredDraggableState$1(BackdropScaffoldState backdropScaffoldState) {
        super(1);
        this.f10222a = backdropScaffoldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Number) obj).floatValue();
        return Float.valueOf(BackdropScaffoldState.m3698a(this.f10222a).mo2551X0(BackdropScaffoldKt.f10165b));
    }
}
