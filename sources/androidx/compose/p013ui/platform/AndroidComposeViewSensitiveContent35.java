package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewSensitiveContent35;", "", "Landroid/view/View;", "view", "", "isSensitiveContent", "", "a", "(Landroid/view/View;Z)V", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AndroidComposeViewSensitiveContent35 {

    /* JADX INFO: renamed from: a */
    public static final AndroidComposeViewSensitiveContent35 f19227a = new AndroidComposeViewSensitiveContent35();

    @DoNotInline
    @RequiresApi
    /* JADX INFO: renamed from: a */
    public final void m6080a(@NotNull View view, boolean isSensitiveContent) {
        if (isSensitiveContent) {
            AbstractC1312h.m6242a(view);
        } else {
            AbstractC1312h.m6243b(view);
        }
    }
}
