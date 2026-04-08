package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a */
    public int f1485a;

    /* JADX INFO: renamed from: b */
    public int f1486b;

    /* JADX INFO: renamed from: c */
    public WeakReference f1487c;

    /* JADX INFO: renamed from: d */
    public LayoutInflater f1488d;

    /* JADX INFO: renamed from: f */
    public OnInflateListener f1489f;

    /* JADX INFO: compiled from: Proguard */
    public interface OnInflateListener {
        /* JADX INFO: renamed from: a */
        void m739a();
    }

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1485a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f261B, 0, 0);
        this.f1486b = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f1485a = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: a */
    public final View m738a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1485a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f1488d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f1485a, viewGroup, false);
        int i = this.f1486b;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f1487c = new WeakReference(viewInflate);
        OnInflateListener onInflateListener = this.f1489f;
        if (onInflateListener != null) {
            onInflateListener.m739a();
        }
        return viewInflate;
    }

    public int getInflatedId() {
        return this.f1486b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1488d;
    }

    public int getLayoutResource() {
        return this.f1485a;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1486b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1488d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1485a = i;
    }

    public void setOnInflateListener(OnInflateListener onInflateListener) {
        this.f1489f = onInflateListener;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f1487c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m738a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }
}
