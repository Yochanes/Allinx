package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public ViewPager f32441a;

    /* JADX INFO: renamed from: b */
    public int f32442b;

    /* JADX INFO: renamed from: c */
    public WeakReference f32443c;

    /* JADX INFO: compiled from: Proguard */
    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {

        /* JADX INFO: renamed from: a */
        public int f32444a;

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i) {
            this.f32444a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i, float f, int i2) {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i) {
            if (this.f32444a == 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: a */
        public Locale f32445a;

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f32445a);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        SingleLineAllCapsTransform singleLineAllCapsTransform = new SingleLineAllCapsTransform();
        singleLineAllCapsTransform.f32445a = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(singleLineAllCapsTransform);
    }

    /* JADX INFO: renamed from: a */
    public final void m12061a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(null);
            this.f32443c = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(null);
            this.f32443c = new WeakReference(pagerAdapter2);
        }
        ViewPager viewPager = this.f32441a;
        if (viewPager == null) {
            return;
        }
        int currentItem = viewPager.getCurrentItem();
        if (pagerAdapter2 != null) {
            pagerAdapter2.getCount();
        }
        if (currentItem >= 1 && pagerAdapter2 != null) {
            pagerAdapter2.getPageTitle(currentItem - 1);
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public void mo12060b(float f) {
        throw null;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f32442b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        if (viewPager.f32475b0 == null) {
            viewPager.f32475b0 = new ArrayList();
        }
        viewPager.f32475b0.add(null);
        this.f32441a = viewPager;
        WeakReference weakReference = this.f32443c;
        m12061a(weakReference != null ? (PagerAdapter) weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f32441a;
        if (viewPager != null) {
            m12061a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f32441a;
            viewPager2.getClass();
            ArrayList arrayList = viewPager2.f32475b0;
            if (arrayList != null) {
                arrayList.remove((Object) null);
            }
            this.f32441a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        if (this.f32441a != null) {
            mo12060b(0.0f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), -2);
        ViewGroup.getChildMeasureSpec(i, (int) (View.MeasureSpec.getSize(i) * 0.2f), -2);
        throw null;
    }

    public void setNonPrimaryAlpha(@FloatRange float f) {
        throw null;
    }

    public void setTextColor(@ColorInt int i) {
        throw null;
    }

    public void setTextSpacing(int i) {
        this.f32442b = i;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    public void setGravity(int i) {
    }
}
