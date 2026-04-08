package androidx.compose.p013ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.p013ui.text.LinkAnnotation;
import androidx.compose.p013ui.text.LinkInteractionListener;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/platform/ComposeClickableSpan;", "Landroid/text/style/ClickableSpan;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ComposeClickableSpan extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final LinkAnnotation f20478a;

    public ComposeClickableSpan(LinkAnnotation linkAnnotation) {
        this.f20478a = linkAnnotation;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        LinkAnnotation linkAnnotation = this.f20478a;
        LinkInteractionListener f19930c = linkAnnotation.getF19930c();
        if (f19930c != null) {
            f19930c.mo6356a(linkAnnotation);
        }
    }
}
