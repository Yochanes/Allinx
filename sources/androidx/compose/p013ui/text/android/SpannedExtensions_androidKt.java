package androidx.compose.p013ui.text.android;

import android.text.Spanned;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SpannedExtensions_androidKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m6431a(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
