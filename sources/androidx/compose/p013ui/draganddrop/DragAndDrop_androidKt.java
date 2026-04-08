package androidx.compose.p013ui.draganddrop;

import android.view.DragEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DragAndDrop_androidKt {
    /* JADX INFO: renamed from: a */
    public static final long m4936a(DragAndDropEvent dragAndDropEvent) {
        DragEvent dragEvent = dragAndDropEvent.f17359a;
        float x = dragEvent.getX();
        float y2 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y2)) & 4294967295L);
    }
}
