package androidx.core.text.method;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.os.BuildCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LinkMovementMethodCompat extends LinkMovementMethod {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r2 <= r1.getLineRight(r0)) goto L18;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action;
        if (!BuildCompat.m7632b() && ((action = motionEvent.getAction()) == 1 || action == 0)) {
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y2 - textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX() + totalPaddingLeft;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            if (scrollY >= 0 && scrollY <= layout.getHeight()) {
                int lineForVertical = layout.getLineForVertical(scrollY);
                float f = scrollX;
                if (f >= layout.getLineLeft(lineForVertical)) {
                }
            }
            Selection.removeSelection(spannable);
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
