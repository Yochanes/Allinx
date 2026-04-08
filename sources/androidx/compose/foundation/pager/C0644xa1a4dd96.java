package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/PagerLayoutIntervalContent;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class C0644xa1a4dd96 extends Lambda implements Function0<PagerLayoutIntervalContent> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f7695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f7696b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function0 f7697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0644xa1a4dd96(MutableState mutableState, MutableState mutableState2, Function0 function0) {
        super(0);
        this.f7695a = mutableState;
        this.f7696b = mutableState2;
        this.f7697c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new PagerLayoutIntervalContent((Function4) this.f7695a.getF20325a(), (Function1) this.f7696b.getF20325a(), ((Number) this.f7697c.invoke()).intValue());
    }
}
