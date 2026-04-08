package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lcoil/target/ImageViewTarget;", "Lcoil/target/GenericViewTarget;", "Landroid/widget/ImageView;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* JADX INFO: renamed from: b */
    public final ImageView f33966b;

    public ImageViewTarget(ImageView imageView) {
        this.f33966b = imageView;
    }

    @Override // coil.target.ViewTarget
    /* JADX INFO: renamed from: b */
    public final View mo12519b() {
        return this.f33966b;
    }

    @Override // coil.target.GenericViewTarget, coil.transition.TransitionTarget
    /* JADX INFO: renamed from: c */
    public final Drawable mo12399c() {
        return this.f33966b.getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    /* JADX INFO: renamed from: d */
    public final void mo12516d(Drawable drawable) {
        this.f33966b.setImageDrawable(drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageViewTarget) {
            return Intrinsics.m18594b(this.f33966b, ((ImageViewTarget) obj).f33966b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33966b.hashCode();
    }
}
