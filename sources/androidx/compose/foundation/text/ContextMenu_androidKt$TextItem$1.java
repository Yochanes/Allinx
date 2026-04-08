package androidx.compose.foundation.text;

import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 176)
public final class ContextMenu_androidKt$TextItem$1 extends Lambda implements Function2<Composer, Integer, String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextContextMenuItems f8237a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$TextItem$1(TextContextMenuItems textContextMenuItems) {
        super(2);
        this.f8237a = textContextMenuItems;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.mo4221N(-1744780674);
        String strM6257a = StringResources_androidKt.m6257a(composer, this.f8237a.f8589a);
        composer.mo4213F();
        return strM6257a;
    }
}
