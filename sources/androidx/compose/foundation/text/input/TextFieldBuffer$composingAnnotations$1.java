package androidx.compose.foundation.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TextFieldBuffer$composingAnnotations$1 extends Lambda implements Function1<Integer, AnnotatedString.Range<AnnotatedString.Annotation>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextFieldCharSequence f8796a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldBuffer$composingAnnotations$1(TextFieldCharSequence textFieldCharSequence) {
        super(1);
        this.f8796a = textFieldCharSequence;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return (AnnotatedString.Range) this.f8796a.f8797a.get(((Number) obj).intValue());
    }
}
