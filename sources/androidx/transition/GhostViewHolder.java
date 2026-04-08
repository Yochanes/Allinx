package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class GhostViewHolder extends FrameLayout {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static float m11970a(View view) {
            return view.getZ();
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            throw null;
        }
    }
}
