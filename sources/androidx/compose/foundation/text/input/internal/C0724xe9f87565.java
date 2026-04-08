package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public /* synthetic */ class C0724xe9f87565 extends FunctionReferenceImpl implements Function1<View, InputMethodManagerImpl> {

    /* JADX INFO: renamed from: a */
    public static final C0724xe9f87565 f8981a = new C0724xe9f87565(1, InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new InputMethodManagerImpl((View) obj);
    }
}
