package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class StateListDrawableCompat extends DrawableContainerCompat {

    /* JADX INFO: renamed from: s */
    public StateListState f653s;

    /* JADX INFO: renamed from: t */
    public boolean f654t;

    /* JADX INFO: compiled from: Proguard */
    public static class StateListState extends DrawableContainerCompat.DrawableContainerState {

        /* JADX INFO: renamed from: I */
        public int[][] f655I;

        public StateListState(StateListState stateListState, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
            super(stateListState, stateListDrawableCompat, resources);
            if (stateListState != null) {
                this.f655I = stateListState.f655I;
            } else {
                this.f655I = new int[this.f621g.length][];
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        /* JADX INFO: renamed from: d */
        public void mo401d() {
            int[][] iArr = this.f655I;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f655I[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f655I = iArr2;
        }

        /* JADX INFO: renamed from: e */
        public final int m412e(int[] iArr) {
            int[][] iArr2 = this.f655I;
            int i = this.f622h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new StateListDrawableCompat(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new StateListDrawableCompat(this, resources);
        }
    }

    public StateListDrawableCompat(StateListState stateListState, Resources resources) {
        mo397e(new StateListState(stateListState, this, resources));
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ DrawableContainerCompat.DrawableContainerState mo396b() {
        return mo398f();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* JADX INFO: renamed from: e */
    public void mo397e(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.mo397e(drawableContainerState);
        if (drawableContainerState instanceof StateListState) {
            this.f653s = (StateListState) drawableContainerState;
        }
    }

    /* JADX INFO: renamed from: f */
    public StateListState mo398f() {
        return new StateListState(this.f653s, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f654t) {
            super.mutate();
            this.f653s.mo401d();
            this.f654t = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iM412e = this.f653s.m412e(iArr);
        if (iM412e < 0) {
            iM412e = this.f653s.m412e(StateSet.WILD_CARD);
        }
        return m407d(iM412e) || zOnStateChange;
    }
}
