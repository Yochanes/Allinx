package com.chiclaim.android.downloader.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.chiclaim.android.downloader.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0014J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m18302d2 = {"Lcom/chiclaim/android/downloader/widget/MaxHeightScrollView;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "maxHeight", "defaultMaxHeight", "initAttrs", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setMaxHeight", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class MaxHeightScrollView extends ScrollView {
    private int maxHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightScrollView(@NotNull Context context) {
        super(context);
        Intrinsics.m18599g(context, "context");
        this.maxHeight = -1;
        initAttrs(null);
    }

    private final int defaultMaxHeight() {
        return getContext().getResources().getDisplayMetrics().heightPixels / 2;
    }

    private final void initAttrs(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.f35076a);
            this.maxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.maxHeight == -1) {
            this.maxHeight = defaultMaxHeight();
        }
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.maxHeight, Integer.MIN_VALUE));
    }

    public final void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m18599g(context, "context");
        this.maxHeight = -1;
        initAttrs(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.m18599g(context, "context");
        this.maxHeight = -1;
        initAttrs(attributeSet);
    }
}
