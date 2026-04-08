package androidx.compose.p013ui.text.font;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.platform.AbstractC1305a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@RequiresApi
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontWeightAdjustmentHelperApi31;", "", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)I", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FontWeightAdjustmentHelperApi31 {

    /* JADX INFO: renamed from: a */
    public static final FontWeightAdjustmentHelperApi31 f20304a = new FontWeightAdjustmentHelperApi31();

    @DoNotInline
    @RequiresApi
    /* JADX INFO: renamed from: a */
    public final int m6525a(@NotNull Context context) {
        return AbstractC1305a.m6198a(context.getResources().getConfiguration());
    }
}
