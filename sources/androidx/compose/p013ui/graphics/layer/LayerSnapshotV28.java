package androidx.compose.p013ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV28;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "GraphicsLayerPicture", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LayerSnapshotV28 implements LayerSnapshotImpl {

    /* JADX INFO: renamed from: a */
    public static final LayerSnapshotV28 f17911a = new LayerSnapshotV28();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV28$GraphicsLayerPicture;", "Landroid/graphics/Picture;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class GraphicsLayerPicture extends Picture {
        @Override // android.graphics.Picture
        public final Canvas beginRecording(int i, int i2) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public final void draw(Canvas canvas) {
            AndroidCanvas_androidKt.m5110a(canvas);
            throw null;
        }

        @Override // android.graphics.Picture
        public final int getHeight() {
            throw null;
        }

        @Override // android.graphics.Picture
        public final int getWidth() {
            throw null;
        }

        @Override // android.graphics.Picture
        public final boolean requiresHardwareAcceleration() {
            return true;
        }

        @Override // android.graphics.Picture
        public final void endRecording() {
        }
    }
}
