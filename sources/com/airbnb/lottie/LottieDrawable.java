package com.airbnb.lottie;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.LayerParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.AbstractC2433a;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieThreadFactory;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: N */
    public static final ThreadPoolExecutor f34057N = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new LottieThreadFactory());

    /* JADX INFO: renamed from: A */
    public RectF f34058A;

    /* JADX INFO: renamed from: B */
    public LPaint f34059B;

    /* JADX INFO: renamed from: C */
    public Rect f34060C;

    /* JADX INFO: renamed from: D */
    public Rect f34061D;

    /* JADX INFO: renamed from: E */
    public RectF f34062E;

    /* JADX INFO: renamed from: F */
    public RectF f34063F;

    /* JADX INFO: renamed from: G */
    public Matrix f34064G;

    /* JADX INFO: renamed from: H */
    public Matrix f34065H;

    /* JADX INFO: renamed from: I */
    public AsyncUpdates f34066I;

    /* JADX INFO: renamed from: J */
    public final Semaphore f34067J;

    /* JADX INFO: renamed from: K */
    public final RunnableC2408f f34068K;

    /* JADX INFO: renamed from: L */
    public float f34069L;

    /* JADX INFO: renamed from: M */
    public boolean f34070M;

    /* JADX INFO: renamed from: a */
    public LottieComposition f34071a;

    /* JADX INFO: renamed from: b */
    public final LottieValueAnimator f34072b;

    /* JADX INFO: renamed from: c */
    public final boolean f34073c;

    /* JADX INFO: renamed from: d */
    public OnVisibleAction f34074d;

    /* JADX INFO: renamed from: f */
    public final ArrayList f34075f;

    /* JADX INFO: renamed from: g */
    public ImageAssetManager f34076g;

    /* JADX INFO: renamed from: i */
    public FontAssetManager f34077i;

    /* JADX INFO: renamed from: j */
    public Map f34078j;

    /* JADX INFO: renamed from: n */
    public boolean f34079n;

    /* JADX INFO: renamed from: o */
    public boolean f34080o;

    /* JADX INFO: renamed from: p */
    public boolean f34081p;

    /* JADX INFO: renamed from: q */
    public CompositionLayer f34082q;

    /* JADX INFO: renamed from: r */
    public int f34083r;

    /* JADX INFO: renamed from: s */
    public boolean f34084s;

    /* JADX INFO: renamed from: t */
    public boolean f34085t;

    /* JADX INFO: renamed from: u */
    public RenderMode f34086u;

    /* JADX INFO: renamed from: v */
    public boolean f34087v;

    /* JADX INFO: renamed from: w */
    public final Matrix f34088w;

    /* JADX INFO: renamed from: x */
    public Bitmap f34089x;

    /* JADX INFO: renamed from: y */
    public Canvas f34090y;

    /* JADX INFO: renamed from: z */
    public Rect f34091z;

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieDrawable$1 */
    /* JADX INFO: compiled from: Proguard */
    class C23911 extends LottieValueCallback<Object> {
        @Override // com.airbnb.lottie.value.LottieValueCallback
        /* JADX INFO: renamed from: a */
        public final Object mo12553a(LottieFrameInfo lottieFrameInfo) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface LazyCompositionTask {
        void run();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class OnVisibleAction {

        /* JADX INFO: renamed from: a */
        public static final OnVisibleAction f34092a;

        /* JADX INFO: renamed from: b */
        public static final OnVisibleAction f34093b;

        /* JADX INFO: renamed from: c */
        public static final OnVisibleAction f34094c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ OnVisibleAction[] f34095d;

        static {
            OnVisibleAction onVisibleAction = new OnVisibleAction("NONE", 0);
            f34092a = onVisibleAction;
            OnVisibleAction onVisibleAction2 = new OnVisibleAction("PLAY", 1);
            f34093b = onVisibleAction2;
            OnVisibleAction onVisibleAction3 = new OnVisibleAction("RESUME", 2);
            f34094c = onVisibleAction3;
            f34095d = new OnVisibleAction[]{onVisibleAction, onVisibleAction2, onVisibleAction3};
        }

        public static OnVisibleAction valueOf(String str) {
            return (OnVisibleAction) Enum.valueOf(OnVisibleAction.class, str);
        }

        public static OnVisibleAction[] values() {
            return (OnVisibleAction[]) f34095d.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        lottieValueAnimator.f34868d = 1.0f;
        lottieValueAnimator.f34869f = false;
        lottieValueAnimator.f34870g = 0L;
        lottieValueAnimator.f34871i = 0.0f;
        lottieValueAnimator.f34872j = 0.0f;
        lottieValueAnimator.f34873n = 0;
        lottieValueAnimator.f34874o = -2.1474836E9f;
        lottieValueAnimator.f34875p = 2.1474836E9f;
        lottieValueAnimator.f34877r = false;
        this.f34072b = lottieValueAnimator;
        this.f34073c = true;
        this.f34074d = OnVisibleAction.f34092a;
        this.f34075f = new ArrayList();
        this.f34080o = false;
        this.f34081p = true;
        this.f34083r = 255;
        this.f34086u = RenderMode.f34108a;
        this.f34087v = false;
        this.f34088w = new Matrix();
        this.f34066I = AsyncUpdates.f34023a;
        C2414l c2414l = new C2414l(this);
        this.f34067J = new Semaphore(1);
        this.f34068K = new RunnableC2408f(this, 1);
        this.f34069L = -3.4028235E38f;
        this.f34070M = false;
        lottieValueAnimator.addUpdateListener(c2414l);
    }

    /* JADX INFO: renamed from: d */
    public static void m12567d(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12568a() {
        return this.f34073c;
    }

    /* JADX INFO: renamed from: b */
    public final void m12569b() {
        LottieComposition lottieComposition = this.f34071a;
        if (lottieComposition == null) {
            return;
        }
        JsonReader.Options options = LayerParser.f34795a;
        Rect rect = lottieComposition.f34048j;
        List list = Collections.EMPTY_LIST;
        CompositionLayer compositionLayer = new CompositionLayer(this, new Layer(list, lottieComposition, "__container", -1L, Layer.LayerType.f34711a, -1L, null, list, new AnimatableTransform(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, Layer.MatteType.f34715a, null, false, null, null), lottieComposition.f34047i, lottieComposition);
        this.f34082q = compositionLayer;
        if (this.f34084s) {
            compositionLayer.mo12664n(true);
        }
        this.f34082q.f34681I = this.f34081p;
    }

    /* JADX INFO: renamed from: c */
    public final void m12570c() {
        LottieComposition lottieComposition = this.f34071a;
        if (lottieComposition == null) {
            return;
        }
        RenderMode renderMode = this.f34086u;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = lottieComposition.f34052n;
        int i2 = lottieComposition.f34053o;
        int iOrdinal = renderMode.ordinal();
        boolean z3 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z2 && i < 28) || i2 > 4 || i <= 25))) {
            z3 = true;
        }
        this.f34087v = z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        CompositionLayer compositionLayer = this.f34082q;
        if (compositionLayer == null) {
            return;
        }
        boolean z2 = this.f34066I == AsyncUpdates.f34024b;
        ThreadPoolExecutor threadPoolExecutor = f34057N;
        Semaphore semaphore = this.f34067J;
        RunnableC2408f runnableC2408f = this.f34068K;
        LottieValueAnimator lottieValueAnimator = this.f34072b;
        if (z2) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (z2) {
                    semaphore.release();
                    if (compositionLayer.f34680H != lottieValueAnimator.m12738c()) {
                        threadPoolExecutor.execute(runnableC2408f);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                if (z2) {
                    semaphore.release();
                    if (compositionLayer.f34680H != lottieValueAnimator.m12738c()) {
                        threadPoolExecutor.execute(runnableC2408f);
                    }
                }
                throw th;
            }
        }
        if (z2 && m12579m()) {
            m12578l(lottieValueAnimator.m12738c());
        }
        if (this.f34087v) {
            m12574h(canvas, compositionLayer);
        } else {
            m12571e(canvas);
        }
        this.f34070M = false;
        if (z2) {
            semaphore.release();
            if (compositionLayer.f34680H != lottieValueAnimator.m12738c()) {
                threadPoolExecutor.execute(runnableC2408f);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12571e(Canvas canvas) {
        CompositionLayer compositionLayer = this.f34082q;
        LottieComposition lottieComposition = this.f34071a;
        if (compositionLayer == null || lottieComposition == null) {
            return;
        }
        Matrix matrix = this.f34088w;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preScale(r3.width() / lottieComposition.f34048j.width(), r3.height() / lottieComposition.f34048j.height());
            matrix.preTranslate(r3.left, r3.top);
        }
        compositionLayer.mo12587f(canvas, matrix, this.f34083r);
    }

    /* JADX INFO: renamed from: f */
    public final void m12572f() {
        this.f34075f.clear();
        LottieValueAnimator lottieValueAnimator = this.f34072b;
        lottieValueAnimator.m12742h(true);
        Iterator it = lottieValueAnimator.f34861c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(lottieValueAnimator);
        }
        if (isVisible()) {
            return;
        }
        this.f34074d = OnVisibleAction.f34092a;
    }

    /* JADX INFO: renamed from: g */
    public final void m12573g() {
        if (this.f34082q == null) {
            this.f34075f.add(new C2413k(this, 1));
            return;
        }
        m12570c();
        boolean zM12568a = m12568a();
        OnVisibleAction onVisibleAction = OnVisibleAction.f34092a;
        LottieValueAnimator lottieValueAnimator = this.f34072b;
        if (zM12568a || lottieValueAnimator.getRepeatCount() == 0) {
            if (isVisible()) {
                lottieValueAnimator.f34877r = true;
                boolean zM12741f = lottieValueAnimator.m12741f();
                for (Animator.AnimatorListener animatorListener : lottieValueAnimator.f34860b) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        AbstractC2433a.m12772o(animatorListener, lottieValueAnimator, zM12741f);
                    } else {
                        animatorListener.onAnimationStart(lottieValueAnimator);
                    }
                }
                lottieValueAnimator.m12743i((int) (lottieValueAnimator.m12741f() ? lottieValueAnimator.m12739d() : lottieValueAnimator.m12740e()));
                lottieValueAnimator.f34870g = 0L;
                lottieValueAnimator.f34873n = 0;
                if (lottieValueAnimator.f34877r) {
                    lottieValueAnimator.m12742h(false);
                    Choreographer.getInstance().postFrameCallback(lottieValueAnimator);
                }
                this.f34074d = onVisibleAction;
            } else {
                this.f34074d = OnVisibleAction.f34093b;
            }
        }
        if (m12568a()) {
            return;
        }
        m12577k((int) (lottieValueAnimator.f34868d < 0.0f ? lottieValueAnimator.m12740e() : lottieValueAnimator.m12739d()));
        lottieValueAnimator.m12742h(true);
        lottieValueAnimator.m12730a(lottieValueAnimator.m12741f());
        if (isVisible()) {
            return;
        }
        this.f34074d = onVisibleAction;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f34083r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.f34071a;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.f34048j.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.f34071a;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.f34048j.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12574h(Canvas canvas, CompositionLayer compositionLayer) {
        boolean z2;
        if (this.f34071a == null || compositionLayer == null) {
            return;
        }
        if (this.f34090y == null) {
            this.f34090y = new Canvas();
            this.f34063F = new RectF();
            this.f34064G = new Matrix();
            this.f34065H = new Matrix();
            this.f34091z = new Rect();
            this.f34058A = new RectF();
            this.f34059B = new LPaint();
            this.f34060C = new Rect();
            this.f34061D = new Rect();
            this.f34062E = new RectF();
        }
        canvas.getMatrix(this.f34064G);
        canvas.getClipBounds(this.f34091z);
        Rect rect = this.f34091z;
        this.f34058A.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f34064G.mapRect(this.f34058A);
        m12567d(this.f34091z, this.f34058A);
        if (this.f34081p) {
            this.f34063F.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            compositionLayer.mo12586d(this.f34063F, null, false);
        }
        this.f34064G.mapRect(this.f34063F);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.f34063F;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z2 = !((ViewGroup) parent).getClipChildren();
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            RectF rectF2 = this.f34063F;
            Rect rect2 = this.f34091z;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.f34063F.width());
        int iCeil2 = (int) Math.ceil(this.f34063F.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        Bitmap bitmap = this.f34089x;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.f34089x.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.f34089x = bitmapCreateBitmap;
            this.f34090y.setBitmap(bitmapCreateBitmap);
            this.f34070M = true;
        } else if (this.f34089x.getWidth() > iCeil || this.f34089x.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f34089x, 0, 0, iCeil, iCeil2);
            this.f34089x = bitmapCreateBitmap2;
            this.f34090y.setBitmap(bitmapCreateBitmap2);
            this.f34070M = true;
        }
        if (this.f34070M) {
            Matrix matrix = this.f34088w;
            matrix.set(this.f34064G);
            matrix.preScale(fWidth, fHeight);
            RectF rectF3 = this.f34063F;
            matrix.postTranslate(-rectF3.left, -rectF3.top);
            this.f34089x.eraseColor(0);
            compositionLayer.mo12587f(this.f34090y, matrix, this.f34083r);
            this.f34064G.invert(this.f34065H);
            this.f34065H.mapRect(this.f34062E, this.f34063F);
            m12567d(this.f34061D, this.f34062E);
        }
        this.f34060C.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f34089x, this.f34060C, this.f34061D, this.f34059B);
    }

    /* JADX INFO: renamed from: i */
    public final void m12575i() {
        if (this.f34082q == null) {
            this.f34075f.add(new C2413k(this, 0));
            return;
        }
        m12570c();
        boolean zM12568a = m12568a();
        OnVisibleAction onVisibleAction = OnVisibleAction.f34092a;
        LottieValueAnimator lottieValueAnimator = this.f34072b;
        if (zM12568a || lottieValueAnimator.getRepeatCount() == 0) {
            if (isVisible()) {
                lottieValueAnimator.f34877r = true;
                lottieValueAnimator.m12742h(false);
                Choreographer.getInstance().postFrameCallback(lottieValueAnimator);
                lottieValueAnimator.f34870g = 0L;
                if (lottieValueAnimator.m12741f() && lottieValueAnimator.f34872j == lottieValueAnimator.m12740e()) {
                    lottieValueAnimator.m12743i(lottieValueAnimator.m12739d());
                } else if (!lottieValueAnimator.m12741f() && lottieValueAnimator.f34872j == lottieValueAnimator.m12739d()) {
                    lottieValueAnimator.m12743i(lottieValueAnimator.m12740e());
                }
                Iterator it = lottieValueAnimator.f34861c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(lottieValueAnimator);
                }
                this.f34074d = onVisibleAction;
            } else {
                this.f34074d = OnVisibleAction.f34094c;
            }
        }
        if (m12568a()) {
            return;
        }
        m12577k((int) (lottieValueAnimator.f34868d < 0.0f ? lottieValueAnimator.m12740e() : lottieValueAnimator.m12739d()));
        lottieValueAnimator.m12742h(true);
        lottieValueAnimator.m12730a(lottieValueAnimator.m12741f());
        if (isVisible()) {
            return;
        }
        this.f34074d = onVisibleAction;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f34070M) {
            return;
        }
        this.f34070M = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        LottieValueAnimator lottieValueAnimator = this.f34072b;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.f34877r;
    }

    /* JADX INFO: renamed from: j */
    public final void m12576j(LottieComposition lottieComposition) {
        if (this.f34071a == lottieComposition) {
            return;
        }
        this.f34070M = true;
        LottieValueAnimator lottieValueAnimator = this.f34072b;
        if (lottieValueAnimator.f34877r) {
            lottieValueAnimator.cancel();
            if (!isVisible()) {
                this.f34074d = OnVisibleAction.f34092a;
            }
        }
        this.f34071a = null;
        this.f34082q = null;
        this.f34076g = null;
        this.f34069L = -3.4028235E38f;
        lottieValueAnimator.f34876q = null;
        lottieValueAnimator.f34874o = -2.1474836E9f;
        lottieValueAnimator.f34875p = 2.1474836E9f;
        invalidateSelf();
        this.f34071a = lottieComposition;
        m12569b();
        boolean z2 = lottieValueAnimator.f34876q == null;
        lottieValueAnimator.f34876q = lottieComposition;
        if (z2) {
            lottieValueAnimator.m12744j(Math.max(lottieValueAnimator.f34874o, lottieComposition.f34049k), Math.min(lottieValueAnimator.f34875p, lottieComposition.f34050l));
        } else {
            lottieValueAnimator.m12744j((int) lottieComposition.f34049k, (int) lottieComposition.f34050l);
        }
        float f = lottieValueAnimator.f34872j;
        lottieValueAnimator.f34872j = 0.0f;
        lottieValueAnimator.f34871i = 0.0f;
        lottieValueAnimator.m12743i((int) f);
        lottieValueAnimator.m12731b();
        m12578l(lottieValueAnimator.getAnimatedFraction());
        ArrayList arrayList = this.f34075f;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            LazyCompositionTask lazyCompositionTask = (LazyCompositionTask) it.next();
            if (lazyCompositionTask != null) {
                lazyCompositionTask.run();
            }
            it.remove();
        }
        arrayList.clear();
        lottieComposition.f34039a.getClass();
        m12570c();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m12577k(int i) {
        if (this.f34071a == null) {
            this.f34075f.add(new C2423n(this, i));
        } else {
            this.f34072b.m12743i(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m12578l(float f) {
        LottieComposition lottieComposition = this.f34071a;
        if (lottieComposition == null) {
            this.f34075f.add(new C2415m(this, f));
        } else {
            this.f34072b.m12743i(MiscUtils.m12748d(lottieComposition.f34049k, lottieComposition.f34050l, f));
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m12579m() {
        LottieComposition lottieComposition = this.f34071a;
        if (lottieComposition == null) {
            return false;
        }
        float f = this.f34069L;
        float fM12738c = this.f34072b.m12738c();
        this.f34069L = fM12738c;
        return Math.abs(fM12738c - f) * lottieComposition.m12555b() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f34083r = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Logger.m12736b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z2, z3);
        OnVisibleAction onVisibleAction = OnVisibleAction.f34094c;
        if (z2) {
            OnVisibleAction onVisibleAction2 = this.f34074d;
            if (onVisibleAction2 == OnVisibleAction.f34093b) {
                m12573g();
                return visible;
            }
            if (onVisibleAction2 == onVisibleAction) {
                m12575i();
                return visible;
            }
        } else {
            if (this.f34072b.f34877r) {
                m12572f();
                this.f34074d = onVisibleAction;
                return visible;
            }
            if (zIsVisible) {
                this.f34074d = OnVisibleAction.f34092a;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m12573g();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f34075f.clear();
        LottieValueAnimator lottieValueAnimator = this.f34072b;
        lottieValueAnimator.m12742h(true);
        lottieValueAnimator.m12730a(lottieValueAnimator.m12741f());
        if (isVisible()) {
            return;
        }
        this.f34074d = OnVisibleAction.f34092a;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
