package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextDecoration;", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SaversKt$TextDecorationSaver$2 extends Lambda implements Function1<Object, TextDecoration> {

    /* JADX INFO: renamed from: a */
    public static final SaversKt$TextDecorationSaver$2 f20040a = new SaversKt$TextDecorationSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Int");
        return new TextDecoration(((Integer) obj).intValue());
    }
}
