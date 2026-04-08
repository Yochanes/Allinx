package androidx.compose.p013ui.text.android;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextLayout_androidKt {

    /* JADX INFO: renamed from: a */
    public static final TextAndroidCanvas f20167a = new TextAndroidCanvas();

    /* JADX INFO: renamed from: b */
    public static final long f20168b;

    static {
        long j = 0;
        f20168b = (j & 4294967295L) | (j << 32);
    }

    /* JADX INFO: renamed from: a */
    public static final TextDirectionHeuristic m6446a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
