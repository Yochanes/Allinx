package androidx.compose.material;

import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Size;", "invoke-uvyYCjk", "(J)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends Lambda implements Function1<Size, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f11541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f11542b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(MutableState mutableState, float f) {
        super(1);
        this.f11541a = f;
        this.f11542b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = ((Size) obj).f17538a;
        float fM5083d = Size.m5083d(j);
        float f = this.f11541a;
        float f2 = fM5083d * f;
        float fM5081b = Size.m5081b(j) * f;
        MutableState mutableState = this.f11542b;
        if (Size.m5083d(((Size) mutableState.getF20325a()).f17538a) != f2 || Size.m5081b(((Size) mutableState.getF20325a()).f17538a) != fM5081b) {
            mutableState.setValue(new Size(SizeKt.m5086a(f2, fM5081b)));
        }
        return Unit.f51459a;
    }
}
