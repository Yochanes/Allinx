package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@RequiresApi
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewTranslationCallbackS;", "", "Landroid/view/View;", "view", "", "b", "(Landroid/view/View;)V", "a", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidComposeViewTranslationCallbackS {

    /* JADX INFO: renamed from: a */
    public static final AndroidComposeViewTranslationCallbackS f19230a = new AndroidComposeViewTranslationCallbackS();

    @DoNotInline
    @RequiresApi
    /* JADX INFO: renamed from: a */
    public final void m6082a(@NotNull View view) {
        AbstractC1305a.m6199b(view);
    }

    @DoNotInline
    @RequiresApi
    /* JADX INFO: renamed from: b */
    public final void m6083b(@NotNull View view) {
        AndroidComposeViewTranslationCallback androidComposeViewTranslationCallback = AndroidComposeViewTranslationCallback.f19229a;
        AndroidComposeViewTranslationCallback androidComposeViewTranslationCallback2 = AndroidComposeViewTranslationCallback.f19229a;
        AbstractC1305a.m6200c(view, AndroidComposeViewTranslationCallback.f19229a);
    }
}
