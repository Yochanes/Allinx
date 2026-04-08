package androidx.paging;

import androidx.paging.LoadState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/MutableLoadStateCollection;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MutableLoadStateCollection {

    /* JADX INFO: renamed from: a */
    public LoadState f30770a;

    /* JADX INFO: renamed from: b */
    public LoadState f30771b;

    /* JADX INFO: renamed from: c */
    public LoadState f30772c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MutableLoadStateCollection() {
        LoadState.NotLoading notLoading = LoadState.NotLoading.f30745c;
        this.f30770a = notLoading;
        this.f30771b = notLoading;
        this.f30772c = notLoading;
    }

    /* JADX INFO: renamed from: a */
    public final LoadState m11348a(LoadType loadType) {
        Intrinsics.m18599g(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            return this.f30770a;
        }
        if (iOrdinal == 1) {
            return this.f30771b;
        }
        if (iOrdinal == 2) {
            return this.f30772c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final void m11349b(LoadStates states) {
        Intrinsics.m18599g(states, "states");
        this.f30770a = states.f30747a;
        this.f30772c = states.f30749c;
        this.f30771b = states.f30748b;
    }

    /* JADX INFO: renamed from: c */
    public final void m11350c(LoadType type, LoadState loadState) {
        Intrinsics.m18599g(type, "type");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            this.f30770a = loadState;
        } else if (iOrdinal == 1) {
            this.f30771b = loadState;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f30772c = loadState;
        }
    }

    /* JADX INFO: renamed from: d */
    public final LoadStates m11351d() {
        return new LoadStates(this.f30770a, this.f30771b, this.f30772c);
    }
}
