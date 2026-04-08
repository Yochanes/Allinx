package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.WrappedDrawable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class AppCompatProgressBarHelper {

    /* JADX INFO: renamed from: c */
    public static final int[] f1140c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final AbsSeekBar f1141a;

    /* JADX INFO: renamed from: b */
    public Bitmap f1142b;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    public AppCompatProgressBarHelper(AbsSeekBar absSeekBar) {
        this.f1141a = absSeekBar;
    }

    /* JADX INFO: renamed from: a */
    public void mo559a(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = this.f1141a;
        TintTypedArray tintTypedArrayM704f = TintTypedArray.m704f(absSeekBar.getContext(), attributeSet, f1140c, i, 0);
        Drawable drawableM707c = tintTypedArrayM704f.m707c(0);
        if (drawableM707c != null) {
            if (drawableM707c instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM707c;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM560b = m560b(animationDrawable.getFrame(i2), true);
                    drawableM560b.setLevel(10000);
                    animationDrawable2.addFrame(drawableM560b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableM707c = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableM707c);
        }
        Drawable drawableM707c2 = tintTypedArrayM704f.m707c(1);
        if (drawableM707c2 != null) {
            absSeekBar.setProgressDrawable(m560b(drawableM707c2, false));
        }
        tintTypedArrayM704f.m709g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Drawable m560b(Drawable drawable, boolean z2) {
        if (drawable instanceof WrappedDrawable) {
            WrappedDrawable wrappedDrawable = (WrappedDrawable) drawable;
            Drawable drawableMo7627b = wrappedDrawable.mo7627b();
            if (drawableMo7627b != null) {
                wrappedDrawable.mo7626a(m560b(drawableMo7627b, z2));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m560b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1142b == null) {
                    this.f1142b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
