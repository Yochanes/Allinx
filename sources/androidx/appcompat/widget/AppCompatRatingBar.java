package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.exchange.allin.R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* JADX INFO: renamed from: a */
    public final AppCompatProgressBarHelper f1149a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        ThemeUtils.m697a(this, getContext());
        AppCompatProgressBarHelper appCompatProgressBarHelper = new AppCompatProgressBarHelper(this);
        this.f1149a = appCompatProgressBarHelper;
        appCompatProgressBarHelper.mo559a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f1149a.f1142b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
