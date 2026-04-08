package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ContentAwareScrollView extends ScrollView {
    private Listener listener;

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
        void onBottomReached();

        void onScrollChanged(int i);
    }

    public ContentAwareScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Listener getListener() {
        return this.listener;
    }

    public boolean isAtBottom() {
        int bottom = getChildAt(0).getBottom();
        if (bottom == 0) {
            return false;
        }
        return getScrollY() + getBottom() >= bottom;
    }

    public void notifyListenerIfAtBottom() {
        if (this.listener == null || !isAtBottom()) {
            return;
        }
        this.listener.onBottomReached();
    }

    public void notifyListenerScrollChanged(int i) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onScrollChanged(i);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        notifyListenerIfAtBottom();
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        notifyListenerIfAtBottom();
        notifyListenerScrollChanged(i2);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
        notifyListenerIfAtBottom();
    }

    public ContentAwareScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContentAwareScrollView(Context context) {
        super(context);
    }
}
