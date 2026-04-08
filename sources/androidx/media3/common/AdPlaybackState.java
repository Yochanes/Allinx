package androidx.media3.common;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AdPlaybackState {

    /* JADX INFO: renamed from: c */
    public static final AdPlaybackState f25084c = new AdPlaybackState(new AdGroup[0]);

    /* JADX INFO: renamed from: d */
    public static final AdGroup f25085d;

    /* JADX INFO: renamed from: a */
    public final int f25086a;

    /* JADX INFO: renamed from: b */
    public final AdGroup[] f25087b;

    /* JADX INFO: compiled from: Proguard */
    public static final class AdGroup {

        /* JADX INFO: renamed from: a */
        public final int f25088a;

        /* JADX INFO: renamed from: b */
        public final int f25089b;

        /* JADX INFO: renamed from: c */
        public final Uri[] f25090c;

        /* JADX INFO: renamed from: d */
        public final MediaItem[] f25091d;

        /* JADX INFO: renamed from: e */
        public final int[] f25092e;

        /* JADX INFO: renamed from: f */
        public final long[] f25093f;

        /* JADX INFO: renamed from: g */
        public final String[] f25094g;

        static {
            AbstractC1610a.m8737o(0, 1, 2, 3, 4);
            AbstractC1610a.m8737o(5, 6, 7, 8, 9);
            Util.m9594D(10);
        }

        public AdGroup(int i, int i2, int[] iArr, MediaItem[] mediaItemArr, long[] jArr, String[] strArr) {
            Uri uri;
            int i3 = 0;
            Assertions.m9460a(iArr.length == mediaItemArr.length);
            this.f25088a = i;
            this.f25089b = i2;
            this.f25092e = iArr;
            this.f25091d = mediaItemArr;
            this.f25093f = jArr;
            this.f25090c = new Uri[mediaItemArr.length];
            while (true) {
                Uri[] uriArr = this.f25090c;
                if (i3 >= uriArr.length) {
                    this.f25094g = strArr;
                    return;
                }
                MediaItem mediaItem = mediaItemArr[i3];
                if (mediaItem == null) {
                    uri = null;
                } else {
                    MediaItem.LocalConfiguration localConfiguration = mediaItem.f25216b;
                    localConfiguration.getClass();
                    uri = localConfiguration.f25246a;
                }
                uriArr[i3] = uri;
                i3++;
            }
        }

        /* JADX INFO: renamed from: a */
        public final int m9211a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f25092e;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AdGroup.class != obj.getClass()) {
                return false;
            }
            AdGroup adGroup = (AdGroup) obj;
            return this.f25088a == adGroup.f25088a && this.f25089b == adGroup.f25089b && Arrays.equals(this.f25091d, adGroup.f25091d) && Arrays.equals(this.f25092e, adGroup.f25092e) && Arrays.equals(this.f25093f, adGroup.f25093f) && Arrays.equals(this.f25094g, adGroup.f25094g);
        }

        public final int hashCode() {
            int i = ((this.f25088a * 31) + this.f25089b) * 31;
            int i2 = (int) 0;
            return (((((Arrays.hashCode(this.f25093f) + ((Arrays.hashCode(this.f25092e) + ((Arrays.hashCode(this.f25091d) + ((i + i2) * 31)) * 31)) * 31)) * 31) + i2) * 961) + Arrays.hashCode(this.f25094g)) * 31;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    static {
        AdGroup adGroup = new AdGroup(-1, -1, new int[0], new MediaItem[0], new long[0], new String[0]);
        int[] iArr = adGroup.f25092e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = adGroup.f25093f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f25085d = new AdGroup(0, adGroup.f25089b, iArrCopyOf, (MediaItem[]) Arrays.copyOf(adGroup.f25091d, 0), jArrCopyOf, (String[]) Arrays.copyOf(adGroup.f25094g, 0));
        Util.m9594D(1);
        Util.m9594D(2);
        Util.m9594D(3);
        Util.m9594D(4);
    }

    public AdPlaybackState(AdGroup[] adGroupArr) {
        this.f25086a = adGroupArr.length;
        this.f25087b = adGroupArr;
    }

    /* JADX INFO: renamed from: a */
    public final AdGroup m9209a(int i) {
        return i < 0 ? f25085d : this.f25087b[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9210b(int i) {
        if (i != this.f25086a - 1) {
            return false;
        }
        m9209a(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return this.f25086a == adPlaybackState.f25086a && Arrays.equals(this.f25087b, adPlaybackState.f25087b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25087b) + (((((this.f25086a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            AdGroup[] adGroupArr = this.f25087b;
            if (i >= adGroupArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            adGroupArr[i].getClass();
            for (int i2 = 0; i2 < adGroupArr[i].f25092e.length; i2++) {
                sb.append("ad(state=");
                int i3 = adGroupArr[i].f25092e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(adGroupArr[i].f25093f[i2]);
                sb.append(')');
                if (i2 < adGroupArr[i].f25092e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < adGroupArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
