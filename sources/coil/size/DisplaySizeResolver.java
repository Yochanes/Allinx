package coil.size;

import android.content.Context;
import android.util.DisplayMetrics;
import coil.size.Dimension;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/size/DisplaySizeResolver;", "Lcoil/size/SizeResolver;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DisplaySizeResolver implements SizeResolver {

    /* JADX INFO: renamed from: a */
    public final Context f33943a;

    public DisplaySizeResolver(Context context) {
        this.f33943a = context;
    }

    @Override // coil.size.SizeResolver
    /* JADX INFO: renamed from: a */
    public final Object mo12395a(Continuation continuation) {
        DisplayMetrics displayMetrics = this.f33943a.getResources().getDisplayMetrics();
        Dimension.Pixels pixels = new Dimension.Pixels(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new Size(pixels, pixels);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DisplaySizeResolver) {
            return Intrinsics.m18594b(this.f33943a, ((DisplaySizeResolver) obj).f33943a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33943a.hashCode();
    }
}
