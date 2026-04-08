package androidx.compose.p013ui.text.android;

import android.text.Layout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/TextAlignmentAdapter;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextAlignmentAdapter {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f20147a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f20148b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (Intrinsics.m18594b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.m18594b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f20147a = alignment;
        f20148b = alignment2;
    }
}
