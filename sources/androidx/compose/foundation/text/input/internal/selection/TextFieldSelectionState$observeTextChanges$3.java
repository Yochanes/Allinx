package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends FunctionReferenceImpl implements Function2<TextFieldCharSequence, CharSequence, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final TextFieldSelectionState$observeTextChanges$3 f9334a = new TextFieldSelectionState$observeTextChanges$3(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(StringsKt.m20437m(((TextFieldCharSequence) obj).f8798b, (CharSequence) obj2));
    }
}
