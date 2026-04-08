package com.king.ultraswiperefresh.theme;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.king.ultraswiperefresh.NestedScrollMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/king/ultraswiperefresh/theme/UltraSwipeRefreshConfig;", "", "refresh_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class UltraSwipeRefreshConfig {

    /* JADX INFO: renamed from: a */
    public final NestedScrollMode f43276a;

    /* JADX INFO: renamed from: b */
    public final NestedScrollMode f43277b;

    /* JADX INFO: renamed from: c */
    public final boolean f43278c;

    /* JADX INFO: renamed from: d */
    public final boolean f43279d;

    /* JADX INFO: renamed from: e */
    public final float f43280e;

    /* JADX INFO: renamed from: f */
    public final float f43281f;

    /* JADX INFO: renamed from: g */
    public final float f43282g;

    /* JADX INFO: renamed from: h */
    public final float f43283h;

    /* JADX INFO: renamed from: i */
    public final float f43284i;

    /* JADX INFO: renamed from: j */
    public final long f43285j;

    /* JADX INFO: renamed from: k */
    public final boolean f43286k;

    /* JADX INFO: renamed from: l */
    public final Function3 f43287l;

    /* JADX INFO: renamed from: m */
    public final Function3 f43288m;

    /* JADX INFO: renamed from: n */
    public final Function3 f43289n;

    public UltraSwipeRefreshConfig(NestedScrollMode headerScrollMode, NestedScrollMode footerScrollMode, boolean z2, boolean z3, float f, float f2, float f3, float f4, float f5, long j, boolean z4, Function3 headerIndicator, Function3 footerIndicator, Function3 contentContainer) {
        Intrinsics.m18599g(headerScrollMode, "headerScrollMode");
        Intrinsics.m18599g(footerScrollMode, "footerScrollMode");
        Intrinsics.m18599g(headerIndicator, "headerIndicator");
        Intrinsics.m18599g(footerIndicator, "footerIndicator");
        Intrinsics.m18599g(contentContainer, "contentContainer");
        this.f43276a = headerScrollMode;
        this.f43277b = footerScrollMode;
        this.f43278c = z2;
        this.f43279d = z3;
        this.f43280e = f;
        this.f43281f = f2;
        this.f43282g = f3;
        this.f43283h = f4;
        this.f43284i = f5;
        this.f43285j = j;
        this.f43286k = z4;
        this.f43287l = headerIndicator;
        this.f43288m = footerIndicator;
        this.f43289n = contentContainer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UltraSwipeRefreshConfig)) {
            return false;
        }
        UltraSwipeRefreshConfig ultraSwipeRefreshConfig = (UltraSwipeRefreshConfig) obj;
        return this.f43276a == ultraSwipeRefreshConfig.f43276a && this.f43277b == ultraSwipeRefreshConfig.f43277b && this.f43278c == ultraSwipeRefreshConfig.f43278c && this.f43279d == ultraSwipeRefreshConfig.f43279d && Float.compare(this.f43280e, ultraSwipeRefreshConfig.f43280e) == 0 && Float.compare(this.f43281f, ultraSwipeRefreshConfig.f43281f) == 0 && Float.compare(this.f43282g, ultraSwipeRefreshConfig.f43282g) == 0 && Float.compare(this.f43283h, ultraSwipeRefreshConfig.f43283h) == 0 && Float.compare(this.f43284i, ultraSwipeRefreshConfig.f43284i) == 0 && this.f43285j == ultraSwipeRefreshConfig.f43285j && this.f43286k == ultraSwipeRefreshConfig.f43286k && Intrinsics.m18594b(this.f43287l, ultraSwipeRefreshConfig.f43287l) && Intrinsics.m18594b(this.f43288m, ultraSwipeRefreshConfig.f43288m) && Intrinsics.m18594b(this.f43289n, ultraSwipeRefreshConfig.f43289n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f43277b.hashCode() + (this.f43276a.hashCode() * 31)) * 31;
        boolean z2 = this.f43278c;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i = (iHashCode + r3) * 31;
        boolean z3 = this.f43279d;
        ?? r32 = z3;
        if (z3) {
            r32 = 1;
        }
        int iM2231f = AbstractC0455a.m2231f(this.f43285j, AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a((i + r32) * 31, this.f43280e, 31), this.f43281f, 31), this.f43282g, 31), this.f43283h, 31), this.f43284i, 31), 31);
        boolean z4 = this.f43286k;
        return this.f43289n.hashCode() + ((this.f43288m.hashCode() + ((this.f43287l.hashCode() + ((iM2231f + (z4 ? 1 : z4)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UltraSwipeRefreshConfig(headerScrollMode=" + this.f43276a + ", footerScrollMode=" + this.f43277b + ", refreshEnabled=" + this.f43278c + ", loadMoreEnabled=" + this.f43279d + ", refreshTriggerRate=" + this.f43280e + ", loadMoreTriggerRate=" + this.f43281f + ", headerMaxOffsetRate=" + this.f43282g + ", footerMaxOffsetRate=" + this.f43283h + ", dragMultiplier=" + this.f43284i + ", finishDelayMillis=" + this.f43285j + ", vibrateEnabled=" + this.f43286k + ", headerIndicator=" + this.f43287l + ", footerIndicator=" + this.f43288m + ", contentContainer=" + this.f43289n + ')';
    }
}
