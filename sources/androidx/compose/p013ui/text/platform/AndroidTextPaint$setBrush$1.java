package androidx.compose.p013ui.text.platform;

import android.graphics.Shader;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.ShaderBrush;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AndroidTextPaint$setBrush$1 extends Lambda implements Function0<Shader> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Brush f20475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f20476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextPaint$setBrush$1(Brush brush, long j) {
        super(0);
        this.f20475a = brush;
        this.f20476b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((ShaderBrush) this.f20475a).mo5175b(this.f20476b);
    }
}
