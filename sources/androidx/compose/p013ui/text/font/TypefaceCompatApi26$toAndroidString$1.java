package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.text.font.FontVariation;
import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "setting", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TypefaceCompatApi26$toAndroidString$1 extends Lambda implements Function1<FontVariation.Setting, CharSequence> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Density f20314a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceCompatApi26$toAndroidString$1(Density density) {
        super(1);
        this.f20314a = density;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FontVariation.Setting setting = (FontVariation.Setting) obj;
        StringBuilder sb = new StringBuilder("'null' ");
        setting.getClass();
        sb.append(setting.mo6522a(this.f20314a));
        return sb.toString();
    }
}
