package androidx.compose.p013ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewTranslationCallback;", "Landroid/view/translation/ViewTranslationCallback;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final AndroidComposeViewTranslationCallback f19229a = new AndroidComposeViewTranslationCallback();

    public final boolean onClearTranslation(View view) {
        Intrinsics.m18597e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager().m4920g();
        return true;
    }

    public final boolean onHideTranslation(View view) {
        Intrinsics.m18597e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager().m4921h();
        return true;
    }

    public final boolean onShowTranslation(View view) {
        Intrinsics.m18597e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager().m4922k();
        return true;
    }
}
