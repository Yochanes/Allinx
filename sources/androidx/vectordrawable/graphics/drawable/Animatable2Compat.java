package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface Animatable2Compat extends Animatable {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AnimationCallback {
        Animatable2.AnimationCallback mPlatformCallback;

        /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C22341 extends Animatable2.AnimationCallback {
            public C22341() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public final void onAnimationEnd(Drawable drawable) {
                AnimationCallback.this.onAnimationEnd(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public final void onAnimationStart(Drawable drawable) {
                AnimationCallback.this.onAnimationStart(drawable);
            }
        }

        @RequiresApi
        public Animatable2.AnimationCallback getPlatformCallback() {
            if (this.mPlatformCallback == null) {
                this.mPlatformCallback = new C22341();
            }
            return this.mPlatformCallback;
        }

        public void onAnimationEnd(Drawable drawable) {
        }

        public void onAnimationStart(Drawable drawable) {
        }
    }
}
