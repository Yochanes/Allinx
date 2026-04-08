package androidx.compose.material3;

import androidx.compose.p013ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f13378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FocusRequester f13379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1(boolean z2, FocusRequester focusRequester) {
        super(0);
        this.f13378a = z2;
        this.f13379b = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f13378a) {
            this.f13379b.m5003b();
        }
        return Unit.f51459a;
    }
}
