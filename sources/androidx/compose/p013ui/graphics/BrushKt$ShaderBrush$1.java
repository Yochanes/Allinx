package androidx.compose.p013ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/graphics/BrushKt$ShaderBrush$1", "Landroidx/compose/ui/graphics/ShaderBrush;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BrushKt$ShaderBrush$1 extends ShaderBrush {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Shader f17569c;

    public BrushKt$ShaderBrush$1(Shader shader) {
        this.f17569c = shader;
    }

    @Override // androidx.compose.p013ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: b */
    public final Shader mo5175b(long j) {
        return this.f17569c;
    }
}
