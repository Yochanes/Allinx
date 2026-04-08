package coil.compose;

import androidx.compose.animation.AbstractC0455a;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"coil/compose/EqualityDelegateKt$DefaultModelEqualityDelegate$1", "Lcoil/compose/EqualityDelegate;", "coil-compose-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class EqualityDelegateKt$DefaultModelEqualityDelegate$1 implements EqualityDelegate {
    @Override // coil.compose.EqualityDelegate
    public final boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (!(obj instanceof ImageRequest) || !(obj2 instanceof ImageRequest)) {
            return Intrinsics.m18594b(obj, obj2);
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        ImageRequest imageRequest2 = (ImageRequest) obj2;
        return Intrinsics.m18594b(imageRequest.f33841a, imageRequest2.f33841a) && imageRequest.f33842b.equals(imageRequest2.f33842b) && Intrinsics.m18594b(imageRequest.f33845e, imageRequest2.f33845e) && Intrinsics.m18594b(imageRequest.f33846f, imageRequest2.f33846f) && imageRequest.f33847g == imageRequest2.f33847g && Intrinsics.m18594b(imageRequest.f33849i, imageRequest2.f33849i) && Intrinsics.m18594b(imageRequest.f33851k, imageRequest2.f33851k) && imageRequest.f33853m == imageRequest2.f33853m && imageRequest.f33854n == imageRequest2.f33854n && imageRequest.f33855o == imageRequest2.f33855o && imageRequest.f33856p == imageRequest2.f33856p && imageRequest.f33857q == imageRequest2.f33857q && imageRequest.f33858r == imageRequest2.f33858r && imageRequest.f33859s == imageRequest2.f33859s && imageRequest.f33865y.equals(imageRequest2.f33865y) && imageRequest.f33866z == imageRequest2.f33866z && imageRequest.f33848h == imageRequest2.f33848h && Intrinsics.m18594b(imageRequest.f33834A, imageRequest2.f33834A);
    }

    @Override // coil.compose.EqualityDelegate
    public final int hashCode(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        int iHashCode = (imageRequest.f33842b.hashCode() + (imageRequest.f33841a.hashCode() * 31)) * 961;
        MemoryCache.Key key = imageRequest.f33845e;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = imageRequest.f33846f;
        return imageRequest.f33834A.f33912a.hashCode() + ((imageRequest.f33848h.hashCode() + ((imageRequest.f33866z.hashCode() + ((imageRequest.f33865y.hashCode() + ((imageRequest.f33859s.hashCode() + ((imageRequest.f33858r.hashCode() + ((imageRequest.f33857q.hashCode() + AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e((AbstractC0455a.m2233h(imageRequest.f33849i, (imageRequest.f33847g.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 961, 31) + Arrays.hashCode(imageRequest.f33851k.f57106a)) * 31, 31, imageRequest.f33853m), 31, imageRequest.f33854n), 31, imageRequest.f33855o), 31, imageRequest.f33856p)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
