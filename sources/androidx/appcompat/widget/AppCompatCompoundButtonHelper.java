package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class AppCompatCompoundButtonHelper {

    /* JADX INFO: renamed from: a */
    public final CompoundButton f1097a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f1098b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f1099c = null;

    /* JADX INFO: renamed from: d */
    public boolean f1100d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1101e = false;

    /* JADX INFO: renamed from: f */
    public boolean f1102f;

    public AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.f1097a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public final void m538a() {
        CompoundButton compoundButton = this.f1097a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1100d || this.f1101e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f1100d) {
                    drawableMutate.setTintList(this.f1098b);
                }
                if (this.f1101e) {
                    drawableMutate.setTintMode(this.f1099c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m539b(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f1097a;
        Context context = compoundButton.getContext();
        int[] iArr = R.styleable.f274m;
        TintTypedArray tintTypedArrayM704f = TintTypedArray.m704f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = tintTypedArrayM704f.f1413b;
        ViewCompat.m7807z(compoundButton, compoundButton.getContext(), iArr, attributeSet, tintTypedArrayM704f.f1413b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AppCompatResources.m395a(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AppCompatResources.m395a(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AppCompatResources.m395a(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(tintTypedArrayM704f.m705a(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(DrawableUtils.m649c(typedArray.getInt(3, -1), null));
            }
            tintTypedArrayM704f.m709g();
        } catch (Throwable th) {
            tintTypedArrayM704f.m709g();
            throw th;
        }
    }
}
