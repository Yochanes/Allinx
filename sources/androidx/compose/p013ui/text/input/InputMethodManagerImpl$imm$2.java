package androidx.compose.p013ui.text.input;

import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroid/view/inputmethod/InputMethodManager;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class InputMethodManagerImpl$imm$2 extends Lambda implements Function0<InputMethodManager> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InputMethodManagerImpl f20378a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(InputMethodManagerImpl inputMethodManagerImpl) {
        super(0);
        this.f20378a = inputMethodManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object systemService = this.f20378a.f20375a.getContext().getSystemService("input_method");
        Intrinsics.m18597e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
