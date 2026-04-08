package coil.util;

import coil.size.Size;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/util/ImmutableHardwareBitmapService;", "Lcoil/util/HardwareBitmapService;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class ImmutableHardwareBitmapService implements HardwareBitmapService {

    /* JADX INFO: renamed from: a */
    public final boolean f34012a;

    public ImmutableHardwareBitmapService(boolean z2) {
        this.f34012a = z2;
    }

    @Override // coil.util.HardwareBitmapService
    /* JADX INFO: renamed from: a */
    public final boolean mo12540a(Size size) {
        return this.f34012a;
    }

    @Override // coil.util.HardwareBitmapService
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF34012a() {
        return this.f34012a;
    }
}
