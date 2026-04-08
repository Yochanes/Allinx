package androidx.paging;

import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/PagingConfig;", "", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class PagingConfig {

    /* JADX INFO: renamed from: a */
    public final int f31083a;

    /* JADX INFO: renamed from: b */
    public final int f31084b;

    /* JADX INFO: renamed from: c */
    public final boolean f31085c;

    /* JADX INFO: renamed from: d */
    public final int f31086d;

    /* JADX INFO: renamed from: e */
    public final int f31087e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/paging/PagingConfig$Companion;", "", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public PagingConfig(int i, int i2) {
        int i3 = (i2 & 2) != 0 ? i : 0;
        boolean z2 = (i2 & 4) != 0;
        int i4 = (i2 & 8) != 0 ? i * 3 : 0;
        int i5 = (i2 & 16) != 0 ? Integer.MAX_VALUE : 0;
        this.f31083a = i;
        this.f31084b = i3;
        this.f31085c = z2;
        this.f31086d = i4;
        this.f31087e = i5;
        if (!z2 && i3 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i5 == Integer.MAX_VALUE || i5 >= (i3 * 2) + i) {
            return;
        }
        StringBuilder sbM24u = AbstractC0000a.m24u("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", ", prefetchDist=", ", maxSize=", i, i3);
        sbM24u.append(i5);
        throw new IllegalArgumentException(sbM24u.toString());
    }
}
