package androidx.privacysandbox.ads.adservices.adid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdId;", "", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class AdId {

    /* JADX INFO: renamed from: a */
    public final String f31406a;

    /* JADX INFO: renamed from: b */
    public final boolean f31407b;

    public AdId(String str, boolean z2) {
        this.f31406a = str;
        this.f31407b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        return Intrinsics.m18594b(this.f31406a, adId.f31406a) && this.f31407b == adId.f31407b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31407b) + (this.f31406a.hashCode() * 31);
    }

    public final String toString() {
        return "AdId: adId=" + this.f31406a + ", isLimitAdTrackingEnabled=" + this.f31407b;
    }
}
