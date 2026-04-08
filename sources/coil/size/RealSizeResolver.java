package coil.size;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/size/RealSizeResolver;", "Lcoil/size/SizeResolver;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class RealSizeResolver implements SizeResolver {

    /* JADX INFO: renamed from: a */
    public final Size f33949a;

    public RealSizeResolver(Size size) {
        this.f33949a = size;
    }

    @Override // coil.size.SizeResolver
    /* JADX INFO: renamed from: a */
    public final Object mo12395a(Continuation continuation) {
        return this.f33949a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RealSizeResolver) {
            return Intrinsics.m18594b(this.f33949a, ((RealSizeResolver) obj).f33949a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33949a.hashCode();
    }
}
