package androidx.paging;

import androidx.paging.LoadState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/LoadStates;", "", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class LoadStates {

    /* JADX INFO: renamed from: f */
    public static final LoadStates f30746f;

    /* JADX INFO: renamed from: a */
    public final LoadState f30747a;

    /* JADX INFO: renamed from: b */
    public final LoadState f30748b;

    /* JADX INFO: renamed from: c */
    public final LoadState f30749c;

    /* JADX INFO: renamed from: d */
    public final boolean f30750d;

    /* JADX INFO: renamed from: e */
    public final boolean f30751e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/LoadStates$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        LoadState.NotLoading notLoading = LoadState.NotLoading.f30745c;
        f30746f = new LoadStates(notLoading, notLoading, notLoading);
    }

    public LoadStates(LoadState loadState, LoadState loadState2, LoadState loadState3) {
        this.f30747a = loadState;
        this.f30748b = loadState2;
        this.f30749c = loadState3;
        this.f30750d = (loadState instanceof LoadState.Error) || (loadState3 instanceof LoadState.Error) || (loadState2 instanceof LoadState.Error);
        this.f30751e = (loadState instanceof LoadState.NotLoading) && (loadState3 instanceof LoadState.NotLoading) && (loadState2 instanceof LoadState.NotLoading);
    }

    /* JADX INFO: renamed from: a */
    public static LoadStates m11343a(LoadStates loadStates, int i) {
        LoadState loadState = LoadState.NotLoading.f30745c;
        LoadState loadState2 = (i & 1) != 0 ? loadStates.f30747a : loadState;
        LoadState loadState3 = (i & 2) != 0 ? loadStates.f30748b : loadState;
        if ((i & 4) != 0) {
            loadState = loadStates.f30749c;
        }
        loadStates.getClass();
        return new LoadStates(loadState2, loadState3, loadState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadStates)) {
            return false;
        }
        LoadStates loadStates = (LoadStates) obj;
        return Intrinsics.m18594b(this.f30747a, loadStates.f30747a) && Intrinsics.m18594b(this.f30748b, loadStates.f30748b) && Intrinsics.m18594b(this.f30749c, loadStates.f30749c);
    }

    public final int hashCode() {
        return this.f30749c.hashCode() + ((this.f30748b.hashCode() + (this.f30747a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f30747a + ", prepend=" + this.f30748b + ", append=" + this.f30749c + ')';
    }
}
