package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable2Compat {

    /* JADX INFO: renamed from: c */
    public final Context f32333c;

    /* JADX INFO: renamed from: d */
    public Animator.AnimatorListener f32334d = null;

    /* JADX INFO: renamed from: f */
    public ArrayList f32335f = null;

    /* JADX INFO: renamed from: g */
    public final Drawable.Callback f32336g = new C22351();

    /* JADX INFO: renamed from: b */
    public final AnimatedVectorDrawableCompatState f32332b = new AnimatedVectorDrawableCompatState();

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C22351 implements Drawable.Callback {
        public C22351() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$2 */
    /* JADX INFO: compiled from: Proguard */
    class C22362 extends AnimatorListenerAdapter {
        public C22362() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.this;
            ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.f32335f);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationEnd(animatedVectorDrawableCompat);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.this;
            ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.f32335f);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationStart(animatedVectorDrawableCompat);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AnimatedVectorDrawableCompatState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public VectorDrawableCompat f32339a;

        /* JADX INFO: renamed from: b */
        public AnimatorSet f32340b;

        /* JADX INFO: renamed from: c */
        public ArrayList f32341c;

        /* JADX INFO: renamed from: d */
        public ArrayMap f32342d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public AnimatedVectorDrawableCompat(Context context) {
        this.f32333c = context;
    }

    /* JADX INFO: renamed from: a */
    public static AnimatedVectorDrawableCompat m12027a(Context context, int i) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = ResourcesCompat.f23171a;
        Drawable drawable = resources.getDrawable(i, theme);
        animatedVectorDrawableCompat.f32345a = drawable;
        drawable.setCallback(animatedVectorDrawableCompat.f32336g);
        new AnimatedVectorDrawableDelegateState(animatedVectorDrawableCompat.f32345a.getConstantState());
        return animatedVectorDrawableCompat;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12028b(Animatable2Compat.AnimationCallback animationCallback) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(animationCallback.getPlatformCallback());
            return;
        }
        if (animationCallback == null) {
            return;
        }
        if (this.f32335f == null) {
            this.f32335f = new ArrayList();
        }
        if (this.f32335f.contains(animationCallback)) {
            return;
        }
        this.f32335f.add(animationCallback);
        if (this.f32334d == null) {
            this.f32334d = new C22362();
        }
        this.f32332b.f32340b.addListener(this.f32334d);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12029c(Animatable2Compat.AnimationCallback animationCallback) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(animationCallback.getPlatformCallback());
        }
        ArrayList arrayList = this.f32335f;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(animationCallback);
        if (this.f32335f.size() == 0 && (animatorListener = this.f32334d) != null) {
            this.f32332b.f32340b.removeListener(animatorListener);
            this.f32334d = null;
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.f32332b;
        animatedVectorDrawableCompatState.f32339a.draw(canvas);
        if (animatedVectorDrawableCompatState.f32340b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f32345a;
        return drawable != null ? drawable.getAlpha() : this.f32332b.f32339a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f32332b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f32345a;
        return drawable != null ? drawable.getColorFilter() : this.f32332b.f32339a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f32345a != null) {
            return new AnimatedVectorDrawableDelegateState(this.f32345a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f32345a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f32332b.f32339a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f32345a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f32332b.f32339a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f32345a;
        return drawable != null ? drawable.getOpacity() : this.f32332b.f32339a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        if (r3.f32340b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        r3.f32340b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        r3.f32340b.playTogether(r3.f32341c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.f32332b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM7548d = TypedArrayUtils.m7548d(resources, theme, attributeSet, AndroidResources.f32329e);
                    int resourceId = typedArrayM7548d.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat vectorDrawableCompatM12030a = VectorDrawableCompat.m12030a(resources, resourceId, theme);
                        vectorDrawableCompatM12030a.f32351g = false;
                        vectorDrawableCompatM12030a.setCallback(this.f32336g);
                        VectorDrawableCompat vectorDrawableCompat = animatedVectorDrawableCompatState.f32339a;
                        if (vectorDrawableCompat != null) {
                            vectorDrawableCompat.setCallback(null);
                        }
                        animatedVectorDrawableCompatState.f32339a = vectorDrawableCompatM12030a;
                    }
                    typedArrayM7548d.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AndroidResources.f32330f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f32333c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(animatedVectorDrawableCompatState.f32339a.f32347b.f32397b.f32395o.get(string));
                        if (animatedVectorDrawableCompatState.f32341c == null) {
                            animatedVectorDrawableCompatState.f32341c = new ArrayList();
                            animatedVectorDrawableCompatState.f32342d = new ArrayMap(0);
                        }
                        animatedVectorDrawableCompatState.f32341c.add(animatorLoadAnimator);
                        animatedVectorDrawableCompatState.f32342d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f32345a;
        return drawable != null ? drawable.isAutoMirrored() : this.f32332b.f32339a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f32345a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f32332b.f32340b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f32345a;
        return drawable != null ? drawable.isStateful() : this.f32332b.f32339a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f32332b.f32339a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f32345a;
        return drawable != null ? drawable.setLevel(i) : this.f32332b.f32339a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f32345a;
        return drawable != null ? drawable.setState(iArr) : this.f32332b.f32339a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f32332b.f32339a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f32332b.f32339a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f32332b.f32339a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            DrawableCompat.m7606a(drawable, i);
        } else {
            this.f32332b.f32339a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            DrawableCompat.m7607b(drawable, colorStateList);
        } else {
            this.f32332b.f32339a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            DrawableCompat.m7608c(drawable, mode);
        } else {
            this.f32332b.f32339a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f32332b.f32339a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.f32332b;
        if (animatedVectorDrawableCompatState.f32340b.isStarted()) {
            return;
        }
        animatedVectorDrawableCompatState.f32340b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f32345a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f32332b.f32340b.end();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class AnimatedVectorDrawableDelegateState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f32343a;

        public AnimatedVectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f32343a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f32343a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f32343a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
            Drawable drawableNewDrawable = this.f32343a.newDrawable();
            animatedVectorDrawableCompat.f32345a = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f32336g);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
            Drawable drawableNewDrawable = this.f32343a.newDrawable(resources);
            animatedVectorDrawableCompat.f32345a = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f32336g);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
            Drawable drawableNewDrawable = this.f32343a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f32345a = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f32336g);
            return animatedVectorDrawableCompat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
