package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LazyListIntervalContent$item$1 extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6768a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListIntervalContent$item$1(Object obj) {
        super(1);
        this.f6768a = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Number) obj).intValue();
        return this.f6768a;
    }
}
