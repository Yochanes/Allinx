package androidx.compose.p013ui;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/Modifier$Element;", "invoke", "(Landroidx/compose/ui/Modifier$Element;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ComposedModifierKt$materializeImpl$1 extends Lambda implements Function1<Modifier.Element, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final ComposedModifierKt$materializeImpl$1 f17176a = new ComposedModifierKt$materializeImpl$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(!(((Modifier.Element) obj) instanceof ComposedModifier));
    }
}
