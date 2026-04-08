package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class BackHandlerKt$BackHandler$1$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 f136a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$1$1(BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1, boolean z2) {
        super(0);
        this.f136a = backHandlerKt$BackHandler$backCallback$1$1;
        this.f137b = z2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = this.f136a;
        backHandlerKt$BackHandler$backCallback$1$1.f90a = this.f137b;
        ?? r0 = backHandlerKt$BackHandler$backCallback$1$1.f92c;
        if (r0 != 0) {
            r0.invoke();
        }
        return Unit.f51459a;
    }
}
