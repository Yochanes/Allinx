package coil.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import androidx.compose.p013ui.autofill.AbstractC1212a;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.decode.DecodeUtils;
import coil.size.Scale;
import coil.transform.AnimatedTransformation;
import coil.transform.PixelOpacity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcoil/drawable/MovieDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;", "Companion", "coil-gif_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MovieDrawable extends Drawable implements Animatable2Compat {

    /* JADX INFO: renamed from: a */
    public final Movie f33594a;

    /* JADX INFO: renamed from: b */
    public final Bitmap.Config f33595b;

    /* JADX INFO: renamed from: c */
    public final Scale f33596c;

    /* JADX INFO: renamed from: j */
    public Canvas f33601j;

    /* JADX INFO: renamed from: n */
    public Bitmap f33602n;

    /* JADX INFO: renamed from: q */
    public float f33605q;

    /* JADX INFO: renamed from: r */
    public float f33606r;

    /* JADX INFO: renamed from: s */
    public boolean f33607s;

    /* JADX INFO: renamed from: t */
    public long f33608t;

    /* JADX INFO: renamed from: u */
    public long f33609u;

    /* JADX INFO: renamed from: w */
    public AnimatedTransformation f33611w;

    /* JADX INFO: renamed from: x */
    public Picture f33612x;

    /* JADX INFO: renamed from: z */
    public boolean f33614z;

    /* JADX INFO: renamed from: d */
    public final Paint f33597d = new Paint(3);

    /* JADX INFO: renamed from: f */
    public final ArrayList f33598f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final Rect f33599g = new Rect();

    /* JADX INFO: renamed from: i */
    public final Rect f33600i = new Rect();

    /* JADX INFO: renamed from: o */
    public float f33603o = 1.0f;

    /* JADX INFO: renamed from: p */
    public float f33604p = 1.0f;

    /* JADX INFO: renamed from: v */
    public int f33610v = -1;

    /* JADX INFO: renamed from: y */
    public PixelOpacity f33613y = PixelOpacity.f33968a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lcoil/drawable/MovieDrawable$Companion;", "", "", "REPEAT_INFINITE", "I", "coil-gif_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public MovieDrawable(Movie movie, Bitmap.Config config, Scale scale) {
        this.f33594a = movie;
        this.f33595b = config;
        this.f33596c = scale;
        if (Build.VERSION.SDK_INT >= 26 && config == AbstractC1212a.m4911x()) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12455a(Canvas canvas) {
        Canvas canvas2 = this.f33601j;
        Bitmap bitmap = this.f33602n;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.f33603o;
            canvas2.scale(f, f);
            Movie movie = this.f33594a;
            Paint paint = this.f33597d;
            movie.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.f33612x;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.f33605q, this.f33606r);
                float f2 = this.f33604p;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12456b(Rect rect) {
        Rect rect2 = this.f33599g;
        if (Intrinsics.m18594b(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.f33594a;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        Scale scale = this.f33596c;
        double dM12416a = DecodeUtils.m12416a(iWidth2, iHeight2, iWidth, iHeight, scale);
        if (!this.f33614z && dM12416a > 1.0d) {
            dM12416a = 1.0d;
        }
        float f = (float) dM12416a;
        this.f33603o = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.f33595b);
        Bitmap bitmap = this.f33602n;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f33602n = bitmapCreateBitmap;
        this.f33601j = new Canvas(bitmapCreateBitmap);
        if (this.f33614z) {
            this.f33604p = 1.0f;
            this.f33605q = 0.0f;
            this.f33606r = 0.0f;
            return;
        }
        float fM12416a = (float) DecodeUtils.m12416a(i, i2, iWidth, iHeight, scale);
        this.f33604p = fM12416a;
        float f2 = iWidth - (i * fM12416a);
        float f3 = 2;
        this.f33605q = (f2 / f3) + rect.left;
        this.f33606r = ((iHeight - (fM12416a * i2)) / f3) + rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Movie movie = this.f33594a;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z2 = false;
        } else {
            if (this.f33607s) {
                this.f33609u = SystemClock.uptimeMillis();
            }
            int i = (int) (this.f33609u - this.f33608t);
            int i2 = i / iDuration;
            int i3 = this.f33610v;
            z2 = i3 == -1 || i2 <= i3;
            if (z2) {
                iDuration = i - (i2 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.f33614z) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.f33600i;
            rect.set(0, 0, width, height);
            m12456b(rect);
            int iSave = canvas.save();
            try {
                float f = 1 / this.f33603o;
                canvas.scale(f, f);
                m12455a(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        } else {
            m12456b(getBounds());
            m12455a(canvas);
        }
        if (this.f33607s && z2) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f33594a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f33594a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f33597d.getAlpha() != 255) {
            return -3;
        }
        PixelOpacity pixelOpacity = this.f33613y;
        if (pixelOpacity != PixelOpacity.f33970c) {
            return (pixelOpacity == PixelOpacity.f33968a && this.f33594a.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f33607s;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Invalid alpha: ").toString());
        }
        this.f33597d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33597d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f33607s) {
            return;
        }
        this.f33607s = true;
        this.f33608t = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f33598f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f33607s) {
            this.f33607s = false;
            ArrayList arrayList = this.f33598f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationEnd(this);
            }
        }
    }
}
