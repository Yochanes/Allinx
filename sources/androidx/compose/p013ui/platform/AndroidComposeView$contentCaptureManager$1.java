package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.compose.p013ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.p013ui.platform.coreshims.ViewCompatShims;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements Function0<ContentCaptureSessionCompat> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        View view = (View) this.receiver;
        Function1 function1 = AndroidComposeView_androidKt.f19233a;
        ViewCompatShims.m6220c(view);
        return ViewCompatShims.m6219b(view);
    }
}
