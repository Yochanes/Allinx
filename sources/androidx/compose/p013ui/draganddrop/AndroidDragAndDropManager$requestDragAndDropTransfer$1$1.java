package androidx.compose.p013ui.draganddrop;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AndroidDragAndDropManager$requestDragAndDropTransfer$1$1 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.BooleanRef f17353a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDragAndDropManager$requestDragAndDropTransfer$1$1(Ref.BooleanRef booleanRef) {
        super(0);
        this.f17353a = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.f17353a.f51655a);
    }
}
