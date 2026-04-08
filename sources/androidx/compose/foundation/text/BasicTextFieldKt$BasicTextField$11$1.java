package androidx.compose.foundation.text;

import androidx.compose.p013ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/TextFieldValue;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BasicTextFieldKt$BasicTextField$11$1 extends Lambda implements Function1<TextFieldValue, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextFieldValue f8024a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f8025b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$11$1(TextFieldValue textFieldValue, Function1 function1) {
        super(1);
        this.f8024a = textFieldValue;
        this.f8025b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (!Intrinsics.m18594b(this.f8024a, textFieldValue)) {
            this.f8025b.invoke(textFieldValue);
        }
        return Unit.f51459a;
    }
}
