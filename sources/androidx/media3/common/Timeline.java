package androidx.media3.common;

import android.net.Uri;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class Timeline {

    /* JADX INFO: renamed from: a */
    public static final Timeline f25340a = new C17371();

    /* JADX INFO: renamed from: androidx.media3.common.Timeline$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C17371 extends Timeline {
        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: b */
        public final int mo9353b(Object obj) {
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: f */
        public final Period mo9354f(int i, Period period, boolean z2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: h */
        public final int mo9356h() {
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: l */
        public final Object mo9357l(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: n */
        public final Window mo9358n(int i, Window window, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: o */
        public final int mo9359o() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Period {

        /* JADX INFO: renamed from: a */
        public Object f25341a;

        /* JADX INFO: renamed from: b */
        public Object f25342b;

        /* JADX INFO: renamed from: c */
        public int f25343c;

        /* JADX INFO: renamed from: d */
        public long f25344d;

        /* JADX INFO: renamed from: e */
        public long f25345e;

        /* JADX INFO: renamed from: f */
        public boolean f25346f;

        /* JADX INFO: renamed from: g */
        public AdPlaybackState f25347g = AdPlaybackState.f25084c;

        static {
            AbstractC1610a.m8737o(0, 1, 2, 3, 4);
        }

        /* JADX INFO: renamed from: a */
        public final long m9369a(int i, int i2) {
            AdPlaybackState.AdGroup adGroupM9209a = this.f25347g.m9209a(i);
            if (adGroupM9209a.f25088a != -1) {
                return adGroupM9209a.f25093f[i2];
            }
            return -9223372036854775807L;
        }

        /* JADX INFO: renamed from: b */
        public final int m9370b(long j) {
            int i;
            AdPlaybackState.AdGroup adGroupM9209a;
            int i2;
            AdPlaybackState adPlaybackState = this.f25347g;
            long j2 = this.f25344d;
            adPlaybackState.getClass();
            if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
                int i3 = 0;
                while (true) {
                    i = adPlaybackState.f25086a;
                    if (i3 >= i) {
                        break;
                    }
                    adPlaybackState.m9209a(i3).getClass();
                    adPlaybackState.m9209a(i3).getClass();
                    if (0 > j && ((i2 = (adGroupM9209a = adPlaybackState.m9209a(i3)).f25088a) == -1 || adGroupM9209a.m9211a(-1) < i2)) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i) {
                    return i3;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: c */
        public final int m9371c(long j) {
            AdPlaybackState adPlaybackState = this.f25347g;
            int i = adPlaybackState.f25086a - 1;
            adPlaybackState.m9210b(i);
            while (i >= 0 && j != Long.MIN_VALUE) {
                adPlaybackState.m9209a(i).getClass();
                if (j >= 0) {
                    break;
                }
                i--;
            }
            if (i >= 0) {
                AdPlaybackState.AdGroup adGroupM9209a = adPlaybackState.m9209a(i);
                int i2 = adGroupM9209a.f25088a;
                if (i2 != -1) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = adGroupM9209a.f25092e[i3];
                        if (i4 != 0 && i4 != 1) {
                        }
                    }
                }
                return i;
            }
            return -1;
        }

        /* JADX INFO: renamed from: d */
        public final long m9372d(int i) {
            this.f25347g.m9209a(i).getClass();
            return 0L;
        }

        /* JADX INFO: renamed from: e */
        public final int m9373e(int i) {
            return this.f25347g.m9209a(i).m9211a(-1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            return Objects.equals(this.f25341a, period.f25341a) && Objects.equals(this.f25342b, period.f25342b) && this.f25343c == period.f25343c && this.f25344d == period.f25344d && this.f25345e == period.f25345e && this.f25346f == period.f25346f && Objects.equals(this.f25347g, period.f25347g);
        }

        /* JADX INFO: renamed from: f */
        public final boolean m9374f(int i) {
            AdPlaybackState adPlaybackState = this.f25347g;
            if (i != adPlaybackState.f25086a - 1) {
                return false;
            }
            adPlaybackState.m9210b(i);
            return false;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m9375g(int i) {
            this.f25347g.m9209a(i).getClass();
            return false;
        }

        /* JADX INFO: renamed from: h */
        public final void m9376h(Object obj, Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState, boolean z2) {
            this.f25341a = obj;
            this.f25342b = obj2;
            this.f25343c = i;
            this.f25344d = j;
            this.f25345e = j2;
            this.f25347g = adPlaybackState;
            this.f25346f = z2;
        }

        public final int hashCode() {
            Object obj = this.f25341a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f25342b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f25343c) * 31;
            long j = this.f25344d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f25345e;
            return this.f25347g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f25346f ? 1 : 0)) * 31);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public static final class RemotableTimeline extends Timeline {
        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: a */
        public final int mo9360a(boolean z2) {
            if (m9368p()) {
                return -1;
            }
            if (z2) {
                throw null;
            }
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: b */
        public final int mo9353b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: c */
        public final int mo9361c(boolean z2) {
            if (m9368p()) {
                return -1;
            }
            if (z2) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: e */
        public final int mo9363e(int i, int i2, boolean z2) {
            if (i2 == 1) {
                return i;
            }
            mo9361c(z2);
            if (i == -1) {
                if (i2 == 2) {
                    return mo9360a(z2);
                }
                return -1;
            }
            if (z2) {
                throw null;
            }
            return i + 1;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: f */
        public final Period mo9354f(int i, Period period, boolean z2) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: h */
        public final int mo9356h() {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: k */
        public final int mo9366k(int i, int i2, boolean z2) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo9360a(z2)) {
                if (z2) {
                    throw null;
                }
                return i - 1;
            }
            if (i2 != 2) {
                return -1;
            }
            mo9361c(z2);
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: l */
        public final Object mo9357l(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: n */
        public final Window mo9358n(int i, Window window, long j) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: o */
        public final int mo9359o() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Window {

        /* JADX INFO: renamed from: p */
        public static final Object f25348p = new Object();

        /* JADX INFO: renamed from: q */
        public static final MediaItem f25349q;

        /* JADX INFO: renamed from: b */
        public Object f25351b;

        /* JADX INFO: renamed from: d */
        public long f25353d;

        /* JADX INFO: renamed from: e */
        public long f25354e;

        /* JADX INFO: renamed from: f */
        public long f25355f;

        /* JADX INFO: renamed from: g */
        public boolean f25356g;

        /* JADX INFO: renamed from: h */
        public boolean f25357h;

        /* JADX INFO: renamed from: i */
        public MediaItem.LiveConfiguration f25358i;

        /* JADX INFO: renamed from: j */
        public boolean f25359j;

        /* JADX INFO: renamed from: k */
        public long f25360k;

        /* JADX INFO: renamed from: l */
        public long f25361l;

        /* JADX INFO: renamed from: m */
        public int f25362m;

        /* JADX INFO: renamed from: n */
        public int f25363n;

        /* JADX INFO: renamed from: o */
        public long f25364o;

        /* JADX INFO: renamed from: a */
        public Object f25350a = f25348p;

        /* JADX INFO: renamed from: c */
        public MediaItem f25352c = f25349q;

        static {
            MediaItem.Builder builder = new MediaItem.Builder();
            builder.f25221a = "androidx.media3.common.Timeline";
            builder.f25222b = Uri.EMPTY;
            f25349q = builder.m9320a();
            AbstractC1610a.m8737o(1, 2, 3, 4, 5);
            AbstractC1610a.m8737o(6, 7, 8, 9, 10);
            Util.m9594D(11);
            Util.m9594D(12);
            Util.m9594D(13);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m9377a() {
            return this.f25358i != null;
        }

        /* JADX INFO: renamed from: b */
        public final void m9378b(Object obj, MediaItem mediaItem, long j, long j2, long j3, boolean z2, boolean z3, MediaItem.LiveConfiguration liveConfiguration, long j4, long j5, int i, int i2, long j6) {
            MediaItem.LocalConfiguration localConfiguration;
            this.f25350a = obj;
            this.f25352c = mediaItem != null ? mediaItem : f25349q;
            this.f25351b = (mediaItem == null || (localConfiguration = mediaItem.f25216b) == null) ? null : localConfiguration.f25252g;
            this.f25353d = j;
            this.f25354e = j2;
            this.f25355f = j3;
            this.f25356g = z2;
            this.f25357h = z3;
            this.f25358i = liveConfiguration;
            this.f25360k = j4;
            this.f25361l = j5;
            this.f25362m = i;
            this.f25363n = i2;
            this.f25364o = j6;
            this.f25359j = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Objects.equals(this.f25350a, window.f25350a) && Objects.equals(this.f25352c, window.f25352c) && Objects.equals(this.f25358i, window.f25358i) && this.f25353d == window.f25353d && this.f25354e == window.f25354e && this.f25355f == window.f25355f && this.f25356g == window.f25356g && this.f25357h == window.f25357h && this.f25359j == window.f25359j && this.f25360k == window.f25360k && this.f25361l == window.f25361l && this.f25362m == window.f25362m && this.f25363n == window.f25363n && this.f25364o == window.f25364o;
        }

        public final int hashCode() {
            int iHashCode = (this.f25352c.hashCode() + ((this.f25350a.hashCode() + 217) * 31)) * 961;
            MediaItem.LiveConfiguration liveConfiguration = this.f25358i;
            int iHashCode2 = liveConfiguration == null ? 0 : liveConfiguration.hashCode();
            long j = this.f25353d;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f25354e;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f25355f;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f25356g ? 1 : 0)) * 31) + (this.f25357h ? 1 : 0)) * 31) + (this.f25359j ? 1 : 0)) * 31;
            long j4 = this.f25360k;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f25361l;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f25362m) * 31) + this.f25363n) * 31;
            long j6 = this.f25364o;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    static {
        Util.m9594D(0);
        Util.m9594D(1);
        Util.m9594D(2);
    }

    /* JADX INFO: renamed from: a */
    public int mo9360a(boolean z2) {
        return m9368p() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo9353b(Object obj);

    /* JADX INFO: renamed from: c */
    public int mo9361c(boolean z2) {
        if (m9368p()) {
            return -1;
        }
        return mo9359o() - 1;
    }

    /* JADX INFO: renamed from: d */
    public final int m9362d(int i, Period period, Window window, int i2, boolean z2) {
        int i3 = mo9354f(i, period, false).f25343c;
        if (mo9358n(i3, window, 0L).f25363n != i) {
            return i + 1;
        }
        int iMo9363e = mo9363e(i3, i2, z2);
        if (iMo9363e == -1) {
            return -1;
        }
        return mo9358n(iMo9363e, window, 0L).f25362m;
    }

    /* JADX INFO: renamed from: e */
    public int mo9363e(int i, int i2, boolean z2) {
        if (i2 == 0) {
            if (i == mo9361c(z2)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo9361c(z2) ? mo9360a(z2) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iMo9361c;
        if (this != obj) {
            if (obj instanceof Timeline) {
                Timeline timeline = (Timeline) obj;
                if (timeline.mo9359o() == mo9359o() && timeline.mo9356h() == mo9356h()) {
                    Window window = new Window();
                    Period period = new Period();
                    Window window2 = new Window();
                    Period period2 = new Period();
                    int i = 0;
                    while (true) {
                        if (i >= mo9359o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= mo9356h()) {
                                    int iMo9360a = mo9360a(true);
                                    if (iMo9360a == timeline.mo9360a(true) && (iMo9361c = mo9361c(true)) == timeline.mo9361c(true)) {
                                        while (iMo9360a != iMo9361c) {
                                            int iMo9363e = mo9363e(iMo9360a, 0, true);
                                            if (iMo9363e == timeline.mo9363e(iMo9360a, 0, true)) {
                                                iMo9360a = iMo9363e;
                                            }
                                        }
                                    }
                                } else {
                                    if (!mo9354f(i2, period, true).equals(timeline.mo9354f(i2, period2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!mo9358n(i, window, 0L).equals(timeline.mo9358n(i, window2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract Period mo9354f(int i, Period period, boolean z2);

    /* JADX INFO: renamed from: g */
    public Period mo9355g(Object obj, Period period) {
        return mo9354f(mo9353b(obj), period, true);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo9356h();

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int iMo9359o = mo9359o() + 217;
        for (int i = 0; i < mo9359o(); i++) {
            iMo9359o = (iMo9359o * 31) + mo9358n(i, window, 0L).hashCode();
        }
        int iMo9356h = mo9356h() + (iMo9359o * 31);
        for (int i2 = 0; i2 < mo9356h(); i2++) {
            iMo9356h = (iMo9356h * 31) + mo9354f(i2, period, true).hashCode();
        }
        int iMo9360a = mo9360a(true);
        while (iMo9360a != -1) {
            iMo9356h = (iMo9356h * 31) + iMo9360a;
            iMo9360a = mo9363e(iMo9360a, 0, true);
        }
        return iMo9356h;
    }

    /* JADX INFO: renamed from: i */
    public final Pair m9364i(Window window, Period period, int i, long j) {
        Pair pairM9365j = m9365j(window, period, i, j, 0L);
        pairM9365j.getClass();
        return pairM9365j;
    }

    /* JADX INFO: renamed from: j */
    public final Pair m9365j(Window window, Period period, int i, long j, long j2) {
        Assertions.m9462c(i, mo9359o());
        mo9358n(i, window, j2);
        if (j == -9223372036854775807L) {
            j = window.f25360k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = window.f25362m;
        mo9354f(i2, period, false);
        while (i2 < window.f25363n && period.f25345e != j) {
            int i3 = i2 + 1;
            if (mo9354f(i3, period, false).f25345e > j) {
                break;
            }
            i2 = i3;
        }
        mo9354f(i2, period, true);
        long jMin = j - period.f25345e;
        long j3 = period.f25344d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = period.f25342b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: k */
    public int mo9366k(int i, int i2, boolean z2) {
        if (i2 == 0) {
            if (i == mo9360a(z2)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo9360a(z2) ? mo9361c(z2) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo9357l(int i);

    /* JADX INFO: renamed from: m */
    public final Window m9367m(int i, Window window) {
        return mo9358n(i, window, 0L);
    }

    /* JADX INFO: renamed from: n */
    public abstract Window mo9358n(int i, Window window, long j);

    /* JADX INFO: renamed from: o */
    public abstract int mo9359o();

    /* JADX INFO: renamed from: p */
    public final boolean m9368p() {
        return mo9359o() == 0;
    }
}
