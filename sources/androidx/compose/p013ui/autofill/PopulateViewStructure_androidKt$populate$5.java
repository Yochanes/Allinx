package androidx.compose.p013ui.autofill;

import android.view.ViewStructure;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "", BlockAlignment.LEFT, "", VerticalAlignment.TOP, BlockAlignment.RIGHT, VerticalAlignment.BOTTOM, "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class PopulateViewStructure_androidKt$populate$5 extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewStructure f17309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopulateViewStructure_androidKt$populate$5(ViewStructure viewStructure) {
        super(4);
        this.f17309a = viewStructure;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f17309a.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return Unit.f51459a;
    }
}
