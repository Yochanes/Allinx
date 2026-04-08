package kotlinx.coroutines;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/Empty;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class Empty implements Incomplete {

    /* JADX INFO: renamed from: a */
    public final boolean f55299a;

    public Empty(boolean z2) {
        this.f55299a = z2;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: getList */
    public final NodeList getF55338a() {
        return null;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: isActive, reason: from getter */
    public final boolean getF55299a() {
        return this.f55299a;
    }

    public final String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("Empty{"), this.f55299a ? "Active" : "New", '}');
    }
}
