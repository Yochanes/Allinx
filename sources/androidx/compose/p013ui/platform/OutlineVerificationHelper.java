package androidx.compose.p013ui.platform;

import android.graphics.Outline;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Landroidx/compose/ui/platform/OutlineVerificationHelper;", "", "Landroid/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Path;", "path", "", "a", "(Landroid/graphics/Outline;Landroidx/compose/ui/graphics/Path;)V", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@RequiresApi
@SourceDebugExtension
public final class OutlineVerificationHelper {

    /* JADX INFO: renamed from: a */
    public static final OutlineVerificationHelper f19486a = new OutlineVerificationHelper();

    @DoNotInline
    /* JADX INFO: renamed from: a */
    public final void m6168a(@NotNull Outline outline, @NotNull Path path) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        AbstractC0025b.m123o(outline, ((AndroidPath) path).f17555a);
    }
}
