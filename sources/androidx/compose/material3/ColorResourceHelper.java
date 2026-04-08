package androidx.compose.material3;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, m18302d2 = {"Landroidx/compose/material3/ColorResourceHelper;", "", "Landroid/content/Context;", "context", "", "id", "Landroidx/compose/ui/graphics/Color;", "a", "(Landroid/content/Context;I)J", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ColorResourceHelper {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public final long m3902a(@NotNull Context context, @ColorRes int id) {
        return ColorKt.m5193b(context.getResources().getColor(id, context.getTheme()));
    }
}
