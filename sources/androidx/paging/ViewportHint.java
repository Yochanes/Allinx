package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/paging/ViewportHint;", "", "Access", "Initial", "Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint$Initial;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class ViewportHint {

    /* JADX INFO: renamed from: a */
    public final int f31369a;

    /* JADX INFO: renamed from: b */
    public final int f31370b;

    /* JADX INFO: renamed from: c */
    public final int f31371c;

    /* JADX INFO: renamed from: d */
    public final int f31372d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Access extends ViewportHint {

        /* JADX INFO: renamed from: e */
        public final int f31373e;

        /* JADX INFO: renamed from: f */
        public final int f31374f;

        public Access(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6);
            this.f31373e = i;
            this.f31374f = i2;
        }

        @Override // androidx.paging.ViewportHint
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Access)) {
                return false;
            }
            Access access = (Access) obj;
            if (this.f31373e == access.f31373e && this.f31374f == access.f31374f) {
                if (this.f31369a == access.f31369a) {
                    if (this.f31370b == access.f31370b) {
                        if (this.f31371c == access.f31371c) {
                            if (this.f31372d == access.f31372d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.paging.ViewportHint
        public final int hashCode() {
            return Integer.hashCode(this.f31374f) + Integer.hashCode(this.f31373e) + super.hashCode();
        }

        public final String toString() {
            return StringsKt.m20432d0("ViewportHint.Access(\n            |    pageOffset=" + this.f31373e + ",\n            |    indexInPage=" + this.f31374f + ",\n            |    presentedItemsBefore=" + this.f31369a + ",\n            |    presentedItemsAfter=" + this.f31370b + ",\n            |    originalPageOffsetFirst=" + this.f31371c + ",\n            |    originalPageOffsetLast=" + this.f31372d + ",\n            |)");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/ViewportHint$Initial;", "Landroidx/paging/ViewportHint;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Initial extends ViewportHint {
        public final String toString() {
            return StringsKt.m20432d0("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.f31369a + ",\n            |    presentedItemsAfter=" + this.f31370b + ",\n            |    originalPageOffsetFirst=" + this.f31371c + ",\n            |    originalPageOffsetLast=" + this.f31372d + ",\n            |)");
        }
    }

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
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ViewportHint(int i, int i2, int i3, int i4) {
        this.f31369a = i;
        this.f31370b = i2;
        this.f31371c = i3;
        this.f31372d = i4;
    }

    /* JADX INFO: renamed from: a */
    public final int m11420a(LoadType loadType) {
        Intrinsics.m18599g(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.f31369a;
        }
        if (iOrdinal == 2) {
            return this.f31370b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewportHint)) {
            return false;
        }
        ViewportHint viewportHint = (ViewportHint) obj;
        return this.f31369a == viewportHint.f31369a && this.f31370b == viewportHint.f31370b && this.f31371c == viewportHint.f31371c && this.f31372d == viewportHint.f31372d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f31372d) + Integer.hashCode(this.f31371c) + Integer.hashCode(this.f31370b) + Integer.hashCode(this.f31369a);
    }
}
