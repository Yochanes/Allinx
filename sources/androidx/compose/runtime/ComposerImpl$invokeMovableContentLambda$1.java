package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ComposerImpl$invokeMovableContentLambda$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MovableContent f16288a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f16289b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$invokeMovableContentLambda$1(MovableContent movableContent, Object obj) {
        super(2);
        this.f16288a = movableContent;
        this.f16289b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (composer.mo4212E(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f16288a.getClass();
            throw null;
        }
        composer.mo4246x();
        return Unit.f51459a;
    }
}
