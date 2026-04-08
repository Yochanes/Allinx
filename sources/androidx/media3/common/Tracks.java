package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Tracks {

    /* JADX INFO: renamed from: b */
    public static final Tracks f25416b = new Tracks(ImmutableList.m14824of());

    /* JADX INFO: renamed from: a */
    public final ImmutableList f25417a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Group {

        /* JADX INFO: renamed from: a */
        public final int f25418a;

        /* JADX INFO: renamed from: b */
        public final TrackGroup f25419b;

        /* JADX INFO: renamed from: c */
        public final boolean f25420c;

        /* JADX INFO: renamed from: d */
        public final int[] f25421d;

        /* JADX INFO: renamed from: e */
        public final boolean[] f25422e;

        static {
            Util.m9594D(0);
            Util.m9594D(1);
            Util.m9594D(3);
            Util.m9594D(4);
        }

        public Group(TrackGroup trackGroup, boolean z2, int[] iArr, boolean[] zArr) {
            int i = trackGroup.f25365a;
            this.f25418a = i;
            boolean z3 = false;
            Assertions.m9460a(i == iArr.length && i == zArr.length);
            this.f25419b = trackGroup;
            if (z2 && i > 1) {
                z3 = true;
            }
            this.f25420c = z3;
            this.f25421d = (int[]) iArr.clone();
            this.f25422e = (boolean[]) zArr.clone();
        }

        /* JADX INFO: renamed from: a */
        public final Format m9391a(int i) {
            return this.f25419b.f25368d[i];
        }

        /* JADX INFO: renamed from: b */
        public final boolean m9392b(int i) {
            return this.f25421d[i] == 4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.f25420c == group.f25420c && this.f25419b.equals(group.f25419b) && Arrays.equals(this.f25421d, group.f25421d) && Arrays.equals(this.f25422e, group.f25422e)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f25422e) + ((Arrays.hashCode(this.f25421d) + (((this.f25419b.hashCode() * 31) + (this.f25420c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        Util.m9594D(0);
    }

    public Tracks(ImmutableList immutableList) {
        this.f25417a = ImmutableList.copyOf((Collection) immutableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final boolean m9390a(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.f25417a;
            if (i2 >= immutableList.size()) {
                return false;
            }
            Group group = (Group) immutableList.get(i2);
            if (Booleans.contains(group.f25422e, true) && group.f25419b.f25367c == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.f25417a.equals(((Tracks) obj).f25417a);
    }

    public final int hashCode() {
        return this.f25417a.hashCode();
    }
}
