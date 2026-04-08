package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ActionBarBackgroundDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f927a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    public ActionBarBackgroundDrawable(ActionBarContainer actionBarContainer) {
        this.f927a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f927a;
        if (actionBarContainer.f935j) {
            Drawable drawable = actionBarContainer.f934i;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f932f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f933g;
        if (drawable3 == null || !actionBarContainer.f936n) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f927a;
        if (actionBarContainer.f935j) {
            if (actionBarContainer.f934i != null) {
                actionBarContainer.f932f.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f932f;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
