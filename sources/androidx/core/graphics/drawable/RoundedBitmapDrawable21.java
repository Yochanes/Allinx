package androidx.core.graphics.drawable;

import android.graphics.Outline;
import android.view.Gravity;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Gravity.apply(0, 0, 0, getBounds(), null, 0);
        throw null;
    }
}
