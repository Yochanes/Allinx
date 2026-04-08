package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "view", "Landroid/view/View;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class C0718xe9f2d9da extends Lambda implements Function1<View, ComposeInputMethodManager> {

    /* JADX INFO: renamed from: a */
    public static final C0718xe9f2d9da f8867a = new C0718xe9f2d9da(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        return Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImplApi34(view) : new ComposeInputMethodManagerImplApi24(view);
    }
}
