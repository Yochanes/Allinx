package androidx.compose.p013ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.p013ui.autofill.AbstractC1212a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/AndroidImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidImageBitmap implements ImageBitmap {

    /* JADX INFO: renamed from: a */
    public final Bitmap f17547a;

    public AndroidImageBitmap(Bitmap bitmap) {
        this.f17547a = bitmap;
    }

    /* JADX INFO: renamed from: a */
    public final int m5114a() {
        Bitmap.Config config = this.f17547a.getConfig();
        Intrinsics.m18596d(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || config != AbstractC1212a.m4888a()) {
            return (i < 26 || config != AbstractC1212a.m4911x()) ? 0 : 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    public final void m5115b() {
        this.f17547a.prepareToDraw();
    }

    @Override // androidx.compose.p013ui.graphics.ImageBitmap
    public final int getHeight() {
        return this.f17547a.getHeight();
    }

    @Override // androidx.compose.p013ui.graphics.ImageBitmap
    public final int getWidth() {
        return this.f17547a.getWidth();
    }
}
