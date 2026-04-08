package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ReportDrawnComposition$observeReporter$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.BooleanRef f184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f185b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnComposition$observeReporter$1(Ref.BooleanRef booleanRef, Function0 function0) {
        super(0);
        this.f184a = booleanRef;
        this.f185b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f184a.f51655a = ((Boolean) this.f185b.invoke()).booleanValue();
        return Unit.f51459a;
    }
}
