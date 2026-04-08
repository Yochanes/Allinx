package androidx.compose.foundation.text;

import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "invoke-nOcc-ac", "()J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TextLinkScope$textRange$1$1 extends Lambda implements Function0<IntOffset> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IntRect f8735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$textRange$1$1(IntRect intRect) {
        super(0);
        this.f8735a = intRect;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new IntOffset(this.f8735a.m6660c());
    }
}
