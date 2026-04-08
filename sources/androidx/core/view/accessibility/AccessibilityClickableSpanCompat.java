package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f23499a;

    /* JADX INFO: renamed from: b */
    public final AccessibilityNodeInfoCompat f23500b;

    /* JADX INFO: renamed from: c */
    public final int f23501c;

    public AccessibilityClickableSpanCompat(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
        this.f23499a = i;
        this.f23500b = accessibilityNodeInfoCompat;
        this.f23501c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f23499a);
        this.f23500b.f23504a.performAction(this.f23501c, bundle);
    }
}
