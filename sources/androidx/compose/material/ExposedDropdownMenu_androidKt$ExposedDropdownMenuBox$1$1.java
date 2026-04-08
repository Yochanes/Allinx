package androidx.compose.material;

import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.runtime.MutableIntState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "newHeight", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C08801 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MutableIntState f10606a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08801(MutableIntState mutableIntState) {
            super(1);
            this.f10606a = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            this.f10606a.mo4393q(((Number) obj).intValue());
            return Unit.f51459a;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((LayoutCoordinates) obj).mo5624a();
        throw null;
    }
}
