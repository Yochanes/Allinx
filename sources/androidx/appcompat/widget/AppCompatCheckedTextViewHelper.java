package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
class AppCompatCheckedTextViewHelper {

    /* JADX INFO: renamed from: a */
    public final AppCompatCheckedTextView f1091a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f1092b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f1093c = null;

    /* JADX INFO: renamed from: d */
    public boolean f1094d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1095e = false;

    /* JADX INFO: renamed from: f */
    public boolean f1096f;

    public AppCompatCheckedTextViewHelper(AppCompatCheckedTextView appCompatCheckedTextView) {
        this.f1091a = appCompatCheckedTextView;
    }

    /* JADX INFO: renamed from: a */
    public final void m537a() {
        AppCompatCheckedTextView appCompatCheckedTextView = this.f1091a;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1094d || this.f1095e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f1094d) {
                    drawableMutate.setTintList(this.f1092b);
                }
                if (this.f1095e) {
                    drawableMutate.setTintMode(this.f1093c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
