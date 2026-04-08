package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/CombinedLoadStates;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CombinedLoadStates {

    /* JADX INFO: renamed from: a */
    public final LoadState f30592a;

    /* JADX INFO: renamed from: b */
    public final LoadState f30593b;

    /* JADX INFO: renamed from: c */
    public final LoadState f30594c;

    /* JADX INFO: renamed from: d */
    public final LoadStates f30595d;

    /* JADX INFO: renamed from: e */
    public final LoadStates f30596e;

    /* JADX INFO: renamed from: f */
    public final boolean f30597f;

    /* JADX INFO: renamed from: g */
    public final boolean f30598g;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CombinedLoadStates(LoadState refresh, LoadState prepend, LoadState append, LoadStates source, LoadStates loadStates) {
        boolean z2;
        Intrinsics.m18599g(refresh, "refresh");
        Intrinsics.m18599g(prepend, "prepend");
        Intrinsics.m18599g(append, "append");
        Intrinsics.m18599g(source, "source");
        this.f30592a = refresh;
        this.f30593b = prepend;
        this.f30594c = append;
        this.f30595d = source;
        this.f30596e = loadStates;
        boolean z3 = false;
        if (source.f30751e) {
            if (loadStates != null ? loadStates.f30751e : true) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        this.f30597f = z2;
        if (source.f30750d) {
            z3 = true;
        } else {
            if (loadStates != null ? loadStates.f30750d : false) {
            }
        }
        this.f30598g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedLoadStates.class != obj.getClass()) {
            return false;
        }
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) obj;
        return Intrinsics.m18594b(this.f30592a, combinedLoadStates.f30592a) && Intrinsics.m18594b(this.f30593b, combinedLoadStates.f30593b) && Intrinsics.m18594b(this.f30594c, combinedLoadStates.f30594c) && Intrinsics.m18594b(this.f30595d, combinedLoadStates.f30595d) && Intrinsics.m18594b(this.f30596e, combinedLoadStates.f30596e);
    }

    public final int hashCode() {
        int iHashCode = (this.f30595d.hashCode() + ((this.f30594c.hashCode() + ((this.f30593b.hashCode() + (this.f30592a.hashCode() * 31)) * 31)) * 31)) * 31;
        LoadStates loadStates = this.f30596e;
        return iHashCode + (loadStates != null ? loadStates.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f30592a + ", prepend=" + this.f30593b + ", append=" + this.f30594c + ", source=" + this.f30595d + ", mediator=" + this.f30596e + ')';
    }
}
