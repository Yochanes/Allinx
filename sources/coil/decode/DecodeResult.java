package coil.decode;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/decode/DecodeResult;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DecodeResult {

    /* JADX INFO: renamed from: a */
    public final Drawable f33474a;

    /* JADX INFO: renamed from: b */
    public final boolean f33475b;

    public DecodeResult(Drawable drawable, boolean z2) {
        this.f33474a = drawable;
        this.f33475b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecodeResult)) {
            return false;
        }
        DecodeResult decodeResult = (DecodeResult) obj;
        return Intrinsics.m18594b(this.f33474a, decodeResult.f33474a) && this.f33475b == decodeResult.f33475b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33475b) + (this.f33474a.hashCode() * 31);
    }
}
