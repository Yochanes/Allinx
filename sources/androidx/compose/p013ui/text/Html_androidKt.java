package androidx.compose.p013ui.text;

import android.text.Layout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Html_androidKt {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
