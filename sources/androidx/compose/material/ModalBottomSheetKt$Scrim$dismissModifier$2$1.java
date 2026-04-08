package androidx.compose.material;

import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ModalBottomSheetKt$Scrim$dismissModifier$2$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f10747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f10748b;

    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C08991 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0 f10749a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08991(Function0 function0) {
            super(0);
            this.f10749a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.f10749a.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$dismissModifier$2$1(String str, Function0 function0) {
        super(1);
        this.f10747a = str;
        this.f10748b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.m6298j(this.f10747a, semanticsPropertyReceiver);
        SemanticsPropertiesKt.m6295g(semanticsPropertyReceiver, new C08991(this.f10748b));
        return Unit.f51459a;
    }
}
