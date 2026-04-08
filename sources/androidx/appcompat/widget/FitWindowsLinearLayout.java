package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.FitWindowsViewGroup;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class FitWindowsLinearLayout extends LinearLayout implements FitWindowsViewGroup {

    /* JADX INFO: renamed from: a */
    public FitWindowsViewGroup.OnFitSystemWindowsListener f1280a;

    public FitWindowsLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener = this.f1280a;
        if (onFitSystemWindowsListener != null) {
            onFitSystemWindowsListener.mo313a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener) {
        this.f1280a = onFitSystemWindowsListener;
    }
}
