package androidx.compose.p013ui.platform;

import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class RenderNodeVerificationHelper28 {
    /* JADX INFO: renamed from: a */
    public static int m6174a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* JADX INFO: renamed from: b */
    public static int m6175b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* JADX INFO: renamed from: c */
    public static void m6176c(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    /* JADX INFO: renamed from: d */
    public static void m6177d(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }
}
