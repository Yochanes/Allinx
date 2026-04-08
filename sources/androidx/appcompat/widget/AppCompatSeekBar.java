package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.exchange.allin.R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* JADX INFO: renamed from: a */
    public final AppCompatSeekBarHelper f1150a;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        ThemeUtils.m697a(this, getContext());
        AppCompatSeekBarHelper appCompatSeekBarHelper = new AppCompatSeekBarHelper(this);
        this.f1150a = appCompatSeekBarHelper;
        appCompatSeekBarHelper.mo559a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatSeekBarHelper appCompatSeekBarHelper = this.f1150a;
        Drawable drawable = appCompatSeekBarHelper.f1152e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        AppCompatSeekBar appCompatSeekBar = appCompatSeekBarHelper.f1151d;
        if (drawable.setState(appCompatSeekBar.getDrawableState())) {
            appCompatSeekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1150a.f1152e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1150a.m564d(canvas);
    }
}
