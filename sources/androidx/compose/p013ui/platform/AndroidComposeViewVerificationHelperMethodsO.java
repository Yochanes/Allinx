package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsO;", "", "Landroid/view/View;", "view", "", "focusable", "", "defaultFocusHighlightEnabled", "", "a", "(Landroid/view/View;IZ)V", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AndroidComposeViewVerificationHelperMethodsO {

    /* JADX INFO: renamed from: a */
    public static final AndroidComposeViewVerificationHelperMethodsO f19232a = new AndroidComposeViewVerificationHelperMethodsO();

    @DoNotInline
    @RequiresApi
    /* JADX INFO: renamed from: a */
    public final void m6086a(@NotNull View view, int focusable, boolean defaultFocusHighlightEnabled) {
        AbstractC1314j.m6245a(focusable, view);
        AbstractC1314j.m6246b(view, defaultFocusHighlightEnabled);
    }
}
