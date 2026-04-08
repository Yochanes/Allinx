package androidx.media3.common;

import android.text.TextUtils;
import androidx.compose.animation.AbstractC0455a;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Format {

    /* JADX INFO: renamed from: O */
    public static final /* synthetic */ int f25133O = 0;

    /* JADX INFO: renamed from: A */
    public final int f25134A;

    /* JADX INFO: renamed from: B */
    public final ColorInfo f25135B;

    /* JADX INFO: renamed from: C */
    public final int f25136C;

    /* JADX INFO: renamed from: D */
    public final int f25137D;

    /* JADX INFO: renamed from: E */
    public final int f25138E;

    /* JADX INFO: renamed from: F */
    public final int f25139F;

    /* JADX INFO: renamed from: G */
    public final int f25140G;

    /* JADX INFO: renamed from: H */
    public final int f25141H;

    /* JADX INFO: renamed from: I */
    public final int f25142I;

    /* JADX INFO: renamed from: J */
    public final int f25143J;

    /* JADX INFO: renamed from: K */
    public final int f25144K;

    /* JADX INFO: renamed from: L */
    public final int f25145L;

    /* JADX INFO: renamed from: M */
    public final int f25146M;

    /* JADX INFO: renamed from: N */
    public int f25147N;

    /* JADX INFO: renamed from: a */
    public final String f25148a;

    /* JADX INFO: renamed from: b */
    public final String f25149b;

    /* JADX INFO: renamed from: c */
    public final ImmutableList f25150c;

    /* JADX INFO: renamed from: d */
    public final String f25151d;

    /* JADX INFO: renamed from: e */
    public final int f25152e;

    /* JADX INFO: renamed from: f */
    public final int f25153f;

    /* JADX INFO: renamed from: g */
    public final int f25154g;

    /* JADX INFO: renamed from: h */
    public final int f25155h;

    /* JADX INFO: renamed from: i */
    public final int f25156i;

    /* JADX INFO: renamed from: j */
    public final int f25157j;

    /* JADX INFO: renamed from: k */
    public final String f25158k;

    /* JADX INFO: renamed from: l */
    public final Metadata f25159l;

    /* JADX INFO: renamed from: m */
    public final String f25160m;

    /* JADX INFO: renamed from: n */
    public final String f25161n;

    /* JADX INFO: renamed from: o */
    public final int f25162o;

    /* JADX INFO: renamed from: p */
    public final int f25163p;

    /* JADX INFO: renamed from: q */
    public final List f25164q;

    /* JADX INFO: renamed from: r */
    public final DrmInitData f25165r;

    /* JADX INFO: renamed from: s */
    public final long f25166s;

    /* JADX INFO: renamed from: t */
    public final boolean f25167t;

    /* JADX INFO: renamed from: u */
    public final int f25168u;

    /* JADX INFO: renamed from: v */
    public final int f25169v;

    /* JADX INFO: renamed from: w */
    public final float f25170w;

    /* JADX INFO: renamed from: x */
    public final int f25171x;

    /* JADX INFO: renamed from: y */
    public final float f25172y;

    /* JADX INFO: renamed from: z */
    public final byte[] f25173z;

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public static final class Builder {

        /* JADX INFO: renamed from: A */
        public ColorInfo f25174A;

        /* JADX INFO: renamed from: F */
        public int f25179F;

        /* JADX INFO: renamed from: G */
        public int f25180G;

        /* JADX INFO: renamed from: a */
        public String f25186a;

        /* JADX INFO: renamed from: b */
        public String f25187b;

        /* JADX INFO: renamed from: d */
        public String f25189d;

        /* JADX INFO: renamed from: e */
        public int f25190e;

        /* JADX INFO: renamed from: f */
        public int f25191f;

        /* JADX INFO: renamed from: j */
        public String f25195j;

        /* JADX INFO: renamed from: k */
        public Metadata f25196k;

        /* JADX INFO: renamed from: l */
        public String f25197l;

        /* JADX INFO: renamed from: m */
        public String f25198m;

        /* JADX INFO: renamed from: p */
        public List f25201p;

        /* JADX INFO: renamed from: q */
        public DrmInitData f25202q;

        /* JADX INFO: renamed from: s */
        public boolean f25204s;

        /* JADX INFO: renamed from: w */
        public int f25208w;

        /* JADX INFO: renamed from: y */
        public byte[] f25210y;

        /* JADX INFO: renamed from: c */
        public ImmutableList f25188c = ImmutableList.m14824of();

        /* JADX INFO: renamed from: h */
        public int f25193h = -1;

        /* JADX INFO: renamed from: i */
        public int f25194i = -1;

        /* JADX INFO: renamed from: n */
        public int f25199n = -1;

        /* JADX INFO: renamed from: o */
        public int f25200o = -1;

        /* JADX INFO: renamed from: r */
        public long f25203r = Long.MAX_VALUE;

        /* JADX INFO: renamed from: t */
        public int f25205t = -1;

        /* JADX INFO: renamed from: u */
        public int f25206u = -1;

        /* JADX INFO: renamed from: v */
        public float f25207v = -1.0f;

        /* JADX INFO: renamed from: x */
        public float f25209x = 1.0f;

        /* JADX INFO: renamed from: z */
        public int f25211z = -1;

        /* JADX INFO: renamed from: B */
        public int f25175B = -1;

        /* JADX INFO: renamed from: C */
        public int f25176C = -1;

        /* JADX INFO: renamed from: D */
        public int f25177D = -1;

        /* JADX INFO: renamed from: E */
        public int f25178E = -1;

        /* JADX INFO: renamed from: H */
        public int f25181H = -1;

        /* JADX INFO: renamed from: I */
        public int f25182I = 1;

        /* JADX INFO: renamed from: J */
        public int f25183J = -1;

        /* JADX INFO: renamed from: K */
        public int f25184K = -1;

        /* JADX INFO: renamed from: L */
        public int f25185L = 0;

        /* JADX INFO: renamed from: g */
        public int f25192g = 0;

        /* JADX INFO: renamed from: a */
        public final Format m9250a() {
            return new Format(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface CueReplacementBehavior {
    }

    static {
        new Builder().m9250a();
        Util.m9594D(0);
        Util.m9594D(1);
        Util.m9594D(2);
        Util.m9594D(3);
        Util.m9594D(4);
        AbstractC1610a.m8737o(5, 6, 7, 8, 9);
        AbstractC1610a.m8737o(10, 11, 12, 13, 14);
        AbstractC1610a.m8737o(15, 16, 17, 18, 19);
        AbstractC1610a.m8737o(20, 21, 22, 23, 24);
        AbstractC1610a.m8737o(25, 26, 27, 28, 29);
        AbstractC1610a.m8737o(30, 31, 32, 33, 34);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Format(Builder builder) {
        boolean z2;
        String str;
        this.f25148a = builder.f25186a;
        String strM9599I = Util.m9599I(builder.f25189d);
        this.f25151d = strM9599I;
        if (builder.f25188c.isEmpty() && builder.f25187b != null) {
            this.f25150c = ImmutableList.m14825of(new Label(strM9599I, builder.f25187b));
            this.f25149b = builder.f25187b;
        } else if (!builder.f25188c.isEmpty() && builder.f25187b == null) {
            ImmutableList immutableList = builder.f25188c;
            this.f25150c = immutableList;
            Iterator<E> it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((Label) immutableList.get(0)).f25213b;
                    break;
                }
                Label label = (Label) it.next();
                if (TextUtils.equals(label.f25212a, strM9599I)) {
                    str = label.f25213b;
                    break;
                }
            }
            this.f25149b = str;
        } else if (builder.f25188c.isEmpty() && builder.f25187b == null) {
            z2 = true;
            Assertions.m9464e(z2);
            this.f25150c = builder.f25188c;
            this.f25149b = builder.f25187b;
        } else {
            for (int i = 0; i < builder.f25188c.size(); i++) {
                if (((Label) builder.f25188c.get(i)).f25213b.equals(builder.f25187b)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            Assertions.m9464e(z2);
            this.f25150c = builder.f25188c;
            this.f25149b = builder.f25187b;
        }
        this.f25152e = builder.f25190e;
        Assertions.m9465f(builder.f25192g == 0 || (builder.f25191f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f25153f = builder.f25191f;
        this.f25154g = builder.f25192g;
        int i2 = builder.f25193h;
        this.f25155h = i2;
        int i3 = builder.f25194i;
        this.f25156i = i3;
        this.f25157j = i3 != -1 ? i3 : i2;
        this.f25158k = builder.f25195j;
        this.f25159l = builder.f25196k;
        this.f25160m = builder.f25197l;
        this.f25161n = builder.f25198m;
        this.f25162o = builder.f25199n;
        this.f25163p = builder.f25200o;
        List list = builder.f25201p;
        this.f25164q = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = builder.f25202q;
        this.f25165r = drmInitData;
        this.f25166s = builder.f25203r;
        this.f25167t = builder.f25204s;
        this.f25168u = builder.f25205t;
        this.f25169v = builder.f25206u;
        this.f25170w = builder.f25207v;
        int i4 = builder.f25208w;
        this.f25171x = i4 == -1 ? 0 : i4;
        float f = builder.f25209x;
        this.f25172y = f == -1.0f ? 1.0f : f;
        this.f25173z = builder.f25210y;
        this.f25134A = builder.f25211z;
        this.f25135B = builder.f25174A;
        this.f25136C = builder.f25175B;
        this.f25137D = builder.f25176C;
        this.f25138E = builder.f25177D;
        this.f25139F = builder.f25178E;
        int i5 = builder.f25179F;
        this.f25140G = i5 == -1 ? 0 : i5;
        int i6 = builder.f25180G;
        this.f25141H = i6 != -1 ? i6 : 0;
        this.f25142I = builder.f25181H;
        this.f25143J = builder.f25182I;
        this.f25144K = builder.f25183J;
        this.f25145L = builder.f25184K;
        int i7 = builder.f25185L;
        if (i7 != 0 || drmInitData == null) {
            this.f25146M = i7;
        } else {
            this.f25146M = 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m9247c(Format format) {
        String str;
        String str2;
        int i;
        if (format == null) {
            return "null";
        }
        Joiner joinerM14760on = Joiner.m14760on(',');
        StringBuilder sbM2244s = AbstractC0455a.m2244s("id=");
        sbM2244s.append(format.f25148a);
        sbM2244s.append(", mimeType=");
        sbM2244s.append(format.f25161n);
        String str3 = format.f25160m;
        if (str3 != null) {
            sbM2244s.append(", container=");
            sbM2244s.append(str3);
        }
        int i2 = format.f25157j;
        if (i2 != -1) {
            sbM2244s.append(", bitrate=");
            sbM2244s.append(i2);
        }
        String str4 = format.f25158k;
        if (str4 != null) {
            sbM2244s.append(", codecs=");
            sbM2244s.append(str4);
        }
        DrmInitData drmInitData = format.f25165r;
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i3 = 0; i3 < drmInitData.f25124d; i3++) {
                UUID uuid = drmInitData.f25121a[i3].f25126b;
                if (uuid.equals(C1724C.f25100b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C1724C.f25101c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C1724C.f25103e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C1724C.f25102d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C1724C.f25099a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbM2244s.append(", drm=[");
            joinerM14760on.appendTo(sbM2244s, (Iterable<? extends Object>) linkedHashSet);
            sbM2244s.append(']');
        }
        int i4 = format.f25168u;
        if (i4 != -1 && (i = format.f25169v) != -1) {
            sbM2244s.append(", res=");
            sbM2244s.append(i4);
            sbM2244s.append("x");
            sbM2244s.append(i);
        }
        float f = format.f25172y;
        if (!DoubleMath.fuzzyEquals(f, 1.0d, 0.001d)) {
            sbM2244s.append(", par=");
            Object[] objArr = {Float.valueOf(f)};
            int i5 = Util.f25665a;
            sbM2244s.append(String.format(Locale.US, "%.3f", objArr));
        }
        ColorInfo colorInfo = format.f25135B;
        if (colorInfo != null) {
            int i6 = colorInfo.f25110f;
            int i7 = colorInfo.f25109e;
            if ((i7 != -1 && i6 != -1) || colorInfo.m9238d()) {
                sbM2244s.append(", color=");
                if (colorInfo.m9238d()) {
                    String strM9233b = ColorInfo.m9233b(colorInfo.f25105a);
                    String strM9232a = ColorInfo.m9232a(colorInfo.f25106b);
                    String strM9234c = ColorInfo.m9234c(colorInfo.f25107c);
                    Locale locale = Locale.US;
                    str2 = strM9233b + RemoteSettings.FORWARD_SLASH_STRING + strM9232a + RemoteSettings.FORWARD_SLASH_STRING + strM9234c;
                } else {
                    str2 = "NA/NA/NA";
                }
                sbM2244s.append(str2 + RemoteSettings.FORWARD_SLASH_STRING + ((i7 == -1 || i6 == -1) ? "NA/NA" : i7 + RemoteSettings.FORWARD_SLASH_STRING + i6));
            }
        }
        float f2 = format.f25170w;
        if (f2 != -1.0f) {
            sbM2244s.append(", fps=");
            sbM2244s.append(f2);
        }
        int i8 = format.f25136C;
        if (i8 != -1) {
            sbM2244s.append(", maxSubLayers=");
            sbM2244s.append(i8);
        }
        int i9 = format.f25137D;
        if (i9 != -1) {
            sbM2244s.append(", channels=");
            sbM2244s.append(i9);
        }
        int i10 = format.f25138E;
        if (i10 != -1) {
            sbM2244s.append(", sample_rate=");
            sbM2244s.append(i10);
        }
        String str5 = format.f25151d;
        if (str5 != null) {
            sbM2244s.append(", language=");
            sbM2244s.append(str5);
        }
        ImmutableList immutableList = format.f25150c;
        if (!immutableList.isEmpty()) {
            sbM2244s.append(", labels=[");
            joinerM14760on.appendTo(sbM2244s, (Iterable<? extends Object>) Lists.transform(immutableList, new C1743b(0)));
            sbM2244s.append("]");
        }
        int i11 = format.f25152e;
        if (i11 != 0) {
            sbM2244s.append(", selectionFlags=[");
            int i12 = Util.f25665a;
            ArrayList arrayList = new ArrayList();
            if ((i11 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i11 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            joinerM14760on.appendTo(sbM2244s, (Iterable<? extends Object>) arrayList);
            sbM2244s.append("]");
        }
        int i13 = format.f25153f;
        if (i13 != 0) {
            sbM2244s.append(", roleFlags=[");
            int i14 = Util.f25665a;
            ArrayList arrayList2 = new ArrayList();
            if ((i13 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i13 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i13 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i13 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i13 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i13 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i13 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i13 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i13 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i13 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i13 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i13 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i13 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i13 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i13 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            joinerM14760on.appendTo(sbM2244s, (Iterable<? extends Object>) arrayList2);
            sbM2244s.append("]");
        }
        if ((32768 & i13) != 0) {
            sbM2244s.append(", auxiliaryTrackType=");
            int i15 = Util.f25665a;
            int i16 = format.f25154g;
            if (i16 == 0) {
                str = "undefined";
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbM2244s.append(str);
        }
        return sbM2244s.toString();
    }

    /* JADX INFO: renamed from: a */
    public final Builder m9248a() {
        Builder builder = new Builder();
        builder.f25186a = this.f25148a;
        builder.f25187b = this.f25149b;
        builder.f25188c = this.f25150c;
        builder.f25189d = this.f25151d;
        builder.f25190e = this.f25152e;
        builder.f25191f = this.f25153f;
        builder.f25193h = this.f25155h;
        builder.f25194i = this.f25156i;
        builder.f25195j = this.f25158k;
        builder.f25196k = this.f25159l;
        builder.f25197l = this.f25160m;
        builder.f25198m = this.f25161n;
        builder.f25199n = this.f25162o;
        builder.f25200o = this.f25163p;
        builder.f25201p = this.f25164q;
        builder.f25202q = this.f25165r;
        builder.f25203r = this.f25166s;
        builder.f25204s = this.f25167t;
        builder.f25205t = this.f25168u;
        builder.f25206u = this.f25169v;
        builder.f25207v = this.f25170w;
        builder.f25208w = this.f25171x;
        builder.f25209x = this.f25172y;
        builder.f25210y = this.f25173z;
        builder.f25211z = this.f25134A;
        builder.f25174A = this.f25135B;
        builder.f25175B = this.f25136C;
        builder.f25176C = this.f25137D;
        builder.f25177D = this.f25138E;
        builder.f25178E = this.f25139F;
        builder.f25179F = this.f25140G;
        builder.f25180G = this.f25141H;
        builder.f25181H = this.f25142I;
        builder.f25182I = this.f25143J;
        builder.f25183J = this.f25144K;
        builder.f25184K = this.f25145L;
        builder.f25185L = this.f25146M;
        return builder;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9249b(Format format) {
        List list = this.f25164q;
        if (list.size() != format.f25164q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) format.f25164q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.f25147N;
        return (i2 == 0 || (i = format.f25147N) == 0 || i2 == i) && this.f25152e == format.f25152e && this.f25153f == format.f25153f && this.f25154g == format.f25154g && this.f25155h == format.f25155h && this.f25156i == format.f25156i && this.f25162o == format.f25162o && this.f25166s == format.f25166s && this.f25168u == format.f25168u && this.f25169v == format.f25169v && this.f25171x == format.f25171x && this.f25134A == format.f25134A && this.f25136C == format.f25136C && this.f25137D == format.f25137D && this.f25138E == format.f25138E && this.f25139F == format.f25139F && this.f25140G == format.f25140G && this.f25141H == format.f25141H && this.f25142I == format.f25142I && this.f25144K == format.f25144K && this.f25145L == format.f25145L && this.f25146M == format.f25146M && Float.compare(this.f25170w, format.f25170w) == 0 && Float.compare(this.f25172y, format.f25172y) == 0 && Objects.equals(this.f25148a, format.f25148a) && Objects.equals(this.f25149b, format.f25149b) && this.f25150c.equals(format.f25150c) && Objects.equals(this.f25158k, format.f25158k) && Objects.equals(this.f25160m, format.f25160m) && Objects.equals(this.f25161n, format.f25161n) && Objects.equals(this.f25151d, format.f25151d) && Arrays.equals(this.f25173z, format.f25173z) && Objects.equals(this.f25159l, format.f25159l) && Objects.equals(this.f25135B, format.f25135B) && Objects.equals(this.f25165r, format.f25165r) && m9249b(format);
    }

    public final int hashCode() {
        if (this.f25147N == 0) {
            String str = this.f25148a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25149b;
            int iHashCode2 = (this.f25150c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f25151d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f25152e) * 31) + this.f25153f) * 31) + this.f25154g) * 31) + this.f25155h) * 31) + this.f25156i) * 31;
            String str4 = this.f25158k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f25159l;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 961;
            String str5 = this.f25160m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f25161n;
            this.f25147N = ((((((((((((((((((((((Float.floatToIntBits(this.f25172y) + ((((Float.floatToIntBits(this.f25170w) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f25162o) * 31) + ((int) this.f25166s)) * 31) + this.f25168u) * 31) + this.f25169v) * 31)) * 31) + this.f25171x) * 31)) * 31) + this.f25134A) * 31) + this.f25136C) * 31) + this.f25137D) * 31) + this.f25138E) * 31) + this.f25139F) * 31) + this.f25140G) * 31) + this.f25141H) * 31) + this.f25142I) * 31) + this.f25144K) * 31) + this.f25145L) * 31) + this.f25146M;
        }
        return this.f25147N;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f25148a);
        sb.append(", ");
        sb.append(this.f25149b);
        sb.append(", ");
        sb.append(this.f25160m);
        sb.append(", ");
        sb.append(this.f25161n);
        sb.append(", ");
        sb.append(this.f25158k);
        sb.append(", ");
        sb.append(this.f25157j);
        sb.append(", ");
        sb.append(this.f25151d);
        sb.append(", [");
        sb.append(this.f25168u);
        sb.append(", ");
        sb.append(this.f25169v);
        sb.append(", ");
        sb.append(this.f25170w);
        sb.append(", ");
        sb.append(this.f25135B);
        sb.append("], [");
        sb.append(this.f25137D);
        sb.append(", ");
        return AbstractC0000a.m11h(this.f25138E, "])", sb);
    }
}
