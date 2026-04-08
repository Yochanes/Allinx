package coil.compose;

import androidx.compose.runtime.Stable;
import coil.ImageLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/compose/AsyncImageState;", "", "coil-compose-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AsyncImageState {

    /* JADX INFO: renamed from: a */
    public final Object f33358a;

    /* JADX INFO: renamed from: b */
    public final EqualityDelegate f33359b;

    /* JADX INFO: renamed from: c */
    public final ImageLoader f33360c;

    public AsyncImageState(Object obj, EqualityDelegate equalityDelegate, ImageLoader imageLoader) {
        this.f33358a = obj;
        this.f33359b = equalityDelegate;
        this.f33360c = imageLoader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImageState)) {
            return false;
        }
        AsyncImageState asyncImageState = (AsyncImageState) obj;
        return this.f33359b.equals(this.f33358a, asyncImageState.f33358a) && Intrinsics.m18594b(this.f33360c, asyncImageState.f33360c);
    }

    public final int hashCode() {
        return this.f33360c.hashCode() + (this.f33359b.hashCode(this.f33358a) * 31);
    }
}
