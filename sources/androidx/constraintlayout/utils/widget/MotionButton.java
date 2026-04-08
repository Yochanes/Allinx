package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: a */
    public float f22573a;

    /* JADX INFO: renamed from: b */
    public float f22574b;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.MotionButton$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14121 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.MotionButton$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C14132 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    public float getRound() {
        return this.f22574b;
    }

    public float getRoundPercent() {
        return this.f22573a;
    }

    @RequiresApi
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f22574b = f;
            float f2 = this.f22573a;
            this.f22573a = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z2 = this.f22574b != f;
        this.f22574b = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            getWidth();
            getHeight();
            throw null;
        }
        setClipToOutline(false);
        if (z2) {
            invalidateOutline();
        }
    }

    @RequiresApi
    public void setRoundPercent(float f) {
        boolean z2 = this.f22573a != f;
        this.f22573a = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z2) {
            invalidateOutline();
        }
    }
}
