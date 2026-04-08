package androidx.compose.p013ui.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/ParagraphInfo;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class MultiParagraphKt$findParagraphByIndex$2$1 extends Lambda implements Function1<ParagraphInfo, CharSequence> {

    /* JADX INFO: renamed from: a */
    public static final MultiParagraphKt$findParagraphByIndex$2$1 f19955a = new MultiParagraphKt$findParagraphByIndex$2$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        StringBuilder sb = new StringBuilder("[");
        sb.append(paragraphInfo.f19957b);
        sb.append(", ");
        return AbstractC0000a.m17n(sb, paragraphInfo.f19958c, ')');
    }
}
