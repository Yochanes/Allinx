package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "Match", "ResultColumn", "Solution", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
@SourceDebugExtension
public final class AmbiguousColumnResolver {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Match {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class ResultColumn {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ((ResultColumn) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ResultColumn(name=null, index=0)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "Companion", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Solution implements Comparable<Solution> {

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int f31842d = 0;

        /* JADX INFO: renamed from: a */
        public final List f31843a;

        /* JADX INFO: renamed from: b */
        public final int f31844b;

        /* JADX INFO: renamed from: c */
        public final int f31845c;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        @SourceDebugExtension
        public static final class Companion {
        }

        static {
            new Solution(EmptyList.f51496a, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public Solution(List matches, int i, int i2) {
            Intrinsics.m18599g(matches, "matches");
            this.f31843a = matches;
            this.f31844b = i;
            this.f31845c = i2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Solution solution) {
            Solution other = solution;
            Intrinsics.m18599g(other, "other");
            int iM18601i = Intrinsics.m18601i(this.f31845c, other.f31845c);
            return iM18601i != 0 ? iM18601i : Intrinsics.m18601i(this.f31844b, other.f31844b);
        }
    }
}
