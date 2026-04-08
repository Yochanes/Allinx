package androidx.compose.p013ui.semantics;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "it", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SemanticsPropertiesKt$getScrollViewportLength$1 extends Lambda implements Function1<List<Float>, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f19840a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsPropertiesKt$getScrollViewportLength$1(Function0 function0) {
        super(1);
        this.f19840a = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        List list = (List) obj;
        Float f = (Float) this.f19840a.invoke();
        if (f == null) {
            z2 = false;
        } else {
            list.add(f);
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
