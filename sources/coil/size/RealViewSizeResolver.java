package coil.size;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lcoil/size/RealViewSizeResolver;", "Landroid/view/View;", "T", "Lcoil/size/ViewSizeResolver;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class RealViewSizeResolver<T extends View> implements ViewSizeResolver<T> {

    /* JADX INFO: renamed from: a */
    public final View f33950a;

    public RealViewSizeResolver(View view) {
        this.f33950a = view;
    }

    @Override // coil.size.ViewSizeResolver
    /* JADX INFO: renamed from: b, reason: from getter */
    public final View getF33950a() {
        return this.f33950a;
    }

    @Override // coil.size.ViewSizeResolver
    /* JADX INFO: renamed from: e */
    public final boolean mo12513e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RealViewSizeResolver) {
            return Intrinsics.m18594b(this.f33950a, ((RealViewSizeResolver) obj).f33950a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f33950a.hashCode() * 31);
    }
}
