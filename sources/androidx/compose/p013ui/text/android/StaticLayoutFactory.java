package androidx.compose.p013ui.text.android;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.activity.AbstractC0050i;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import p011a.AbstractC0024a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@InternalPlatformTextApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class StaticLayoutFactory {
    /* JADX INFO: renamed from: a */
    public static StaticLayout m6432a(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z2, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            InlineClassHelperKt.m6567a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            InlineClassHelperKt.m6567a("invalid end value");
        }
        if (i3 < 0) {
            InlineClassHelperKt.m6567a("invalid maxLines value");
        }
        if (i < 0) {
            InlineClassHelperKt.m6567a("invalid width value");
        }
        if (i4 < 0) {
            InlineClassHelperKt.m6567a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z2);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            AbstractC1329b.m6471u(builderObtain, i5);
        }
        if (i10 >= 28) {
            AbstractC0050i.m213r(builderObtain);
        }
        if (i10 >= 33) {
            AbstractC0024a.m98t(builderObtain, AbstractC0024a.m82d(AbstractC0024a.m76B(AbstractC0024a.m81c(AbstractC0024a.m80b(), i7), i8)));
        }
        if (i10 >= 35) {
            AbstractC1330c.m6484h(builderObtain);
        }
        return builderObtain.build();
    }
}
