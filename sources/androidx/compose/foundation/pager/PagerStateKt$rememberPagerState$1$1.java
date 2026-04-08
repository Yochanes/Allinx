package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/DefaultPagerState;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class PagerStateKt$rememberPagerState$1$1 extends Lambda implements Function0<DefaultPagerState> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7897a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f7898b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function0 f7899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerStateKt$rememberPagerState$1$1(int i, float f, Function0 function0) {
        super(0);
        this.f7897a = i;
        this.f7898b = f;
        this.f7899c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DefaultPagerState(this.f7897a, this.f7898b, this.f7899c);
    }
}
