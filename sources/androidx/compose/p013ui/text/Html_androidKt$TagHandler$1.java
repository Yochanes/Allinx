package androidx.compose.p013ui.text;

import android.text.Editable;
import android.text.Html;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/text/Html_androidKt$TagHandler$1", "Landroid/text/Html$TagHandler;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Html_androidKt$TagHandler$1 implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z2, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z2 || !Intrinsics.m18594b(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new AnnotationContentHandler(xMLReader.getContentHandler(), editable));
    }
}
