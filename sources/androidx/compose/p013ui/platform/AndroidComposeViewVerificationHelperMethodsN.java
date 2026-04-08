package androidx.compose.p013ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.input.pointer.AndroidPointerIcon;
import androidx.compose.p013ui.input.pointer.AndroidPointerIconType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsN;", "", "Landroid/view/View;", "view", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "a", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PointerIcon;)V", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AndroidComposeViewVerificationHelperMethodsN {

    /* JADX INFO: renamed from: a */
    public static final AndroidComposeViewVerificationHelperMethodsN f19231a = new AndroidComposeViewVerificationHelperMethodsN();

    /* JADX INFO: renamed from: b */
    public static PointerIcon m6084b(Context context, androidx.compose.p013ui.input.pointer.PointerIcon pointerIcon) {
        if (!(pointerIcon instanceof AndroidPointerIcon)) {
            return pointerIcon instanceof AndroidPointerIconType ? PointerIcon.getSystemIcon(context, ((AndroidPointerIconType) pointerIcon).f18243b) : PointerIcon.getSystemIcon(context, 1000);
        }
        ((AndroidPointerIcon) pointerIcon).getClass();
        return null;
    }

    @DoNotInline
    @RequiresApi
    /* JADX INFO: renamed from: a */
    public final void m6085a(@NotNull View view, @Nullable androidx.compose.p013ui.input.pointer.PointerIcon icon) {
        PointerIcon pointerIconM6084b = m6084b(view.getContext(), icon);
        if (Intrinsics.m18594b(view.getPointerIcon(), pointerIconM6084b)) {
            return;
        }
        view.setPointerIcon(pointerIconM6084b);
    }
}
