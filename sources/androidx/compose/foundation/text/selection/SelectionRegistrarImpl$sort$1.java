package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "a", "Landroidx/compose/foundation/text/selection/Selectable;", "b", "invoke", "(Landroidx/compose/foundation/text/selection/Selectable;Landroidx/compose/foundation/text/selection/Selectable;)Ljava/lang/Integer;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class SelectionRegistrarImpl$sort$1 extends Lambda implements Function2<Selectable, Selectable, Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LayoutCoordinates f9887a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionRegistrarImpl$sort$1(LayoutCoordinates layoutCoordinates) {
        super(2);
        this.f9887a = layoutCoordinates;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LayoutCoordinates layoutCoordinatesMo3576j = ((Selectable) obj).mo3576j();
        LayoutCoordinates layoutCoordinatesMo3576j2 = ((Selectable) obj2).mo3576j();
        LayoutCoordinates layoutCoordinates = this.f9887a;
        long jMo5617C = layoutCoordinatesMo3576j != null ? layoutCoordinates.mo5617C(layoutCoordinatesMo3576j, 0L) : 0L;
        long jMo5617C2 = layoutCoordinatesMo3576j2 != null ? layoutCoordinates.mo5617C(layoutCoordinatesMo3576j2, 0L) : 0L;
        int i = (int) (jMo5617C & 4294967295L);
        int i2 = (int) (4294967295L & jMo5617C2);
        return Integer.valueOf(Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) ? ComparisonsKt.m18545a(Float.valueOf(Float.intBitsToFloat((int) (jMo5617C >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jMo5617C2 >> 32)))) : ComparisonsKt.m18545a(Float.valueOf(Float.intBitsToFloat(i)), Float.valueOf(Float.intBitsToFloat(i2))));
    }
}
