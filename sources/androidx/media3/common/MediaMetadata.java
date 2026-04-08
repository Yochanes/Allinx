package androidx.media3.common;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.common.collect.ImmutableList;
import com.google.zxing.aztec.encoder.Encoder;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Objects;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadata {

    /* JADX INFO: renamed from: B */
    public static final MediaMetadata f25257B;

    /* JADX INFO: renamed from: A */
    public final ImmutableList f25258A;

    /* JADX INFO: renamed from: a */
    public final CharSequence f25259a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f25260b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f25261c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f25262d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f25263e;

    /* JADX INFO: renamed from: f */
    public final byte[] f25264f;

    /* JADX INFO: renamed from: g */
    public final Integer f25265g;

    /* JADX INFO: renamed from: h */
    public final Integer f25266h;

    /* JADX INFO: renamed from: i */
    public final Integer f25267i;

    /* JADX INFO: renamed from: j */
    public final Integer f25268j;

    /* JADX INFO: renamed from: k */
    public final Boolean f25269k;

    /* JADX INFO: renamed from: l */
    public final Integer f25270l;

    /* JADX INFO: renamed from: m */
    public final Integer f25271m;

    /* JADX INFO: renamed from: n */
    public final Integer f25272n;

    /* JADX INFO: renamed from: o */
    public final Integer f25273o;

    /* JADX INFO: renamed from: p */
    public final Integer f25274p;

    /* JADX INFO: renamed from: q */
    public final Integer f25275q;

    /* JADX INFO: renamed from: r */
    public final Integer f25276r;

    /* JADX INFO: renamed from: s */
    public final CharSequence f25277s;

    /* JADX INFO: renamed from: t */
    public final CharSequence f25278t;

    /* JADX INFO: renamed from: u */
    public final CharSequence f25279u;

    /* JADX INFO: renamed from: v */
    public final Integer f25280v;

    /* JADX INFO: renamed from: w */
    public final Integer f25281w;

    /* JADX INFO: renamed from: x */
    public final CharSequence f25282x;

    /* JADX INFO: renamed from: y */
    public final CharSequence f25283y;

    /* JADX INFO: renamed from: z */
    public final Integer f25284z;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public CharSequence f25285a;

        /* JADX INFO: renamed from: b */
        public CharSequence f25286b;

        /* JADX INFO: renamed from: c */
        public CharSequence f25287c;

        /* JADX INFO: renamed from: d */
        public CharSequence f25288d;

        /* JADX INFO: renamed from: e */
        public CharSequence f25289e;

        /* JADX INFO: renamed from: f */
        public byte[] f25290f;

        /* JADX INFO: renamed from: g */
        public Integer f25291g;

        /* JADX INFO: renamed from: h */
        public Integer f25292h;

        /* JADX INFO: renamed from: i */
        public Integer f25293i;

        /* JADX INFO: renamed from: j */
        public Integer f25294j;

        /* JADX INFO: renamed from: k */
        public Boolean f25295k;

        /* JADX INFO: renamed from: l */
        public Integer f25296l;

        /* JADX INFO: renamed from: m */
        public Integer f25297m;

        /* JADX INFO: renamed from: n */
        public Integer f25298n;

        /* JADX INFO: renamed from: o */
        public Integer f25299o;

        /* JADX INFO: renamed from: p */
        public Integer f25300p;

        /* JADX INFO: renamed from: q */
        public Integer f25301q;

        /* JADX INFO: renamed from: r */
        public CharSequence f25302r;

        /* JADX INFO: renamed from: s */
        public CharSequence f25303s;

        /* JADX INFO: renamed from: t */
        public CharSequence f25304t;

        /* JADX INFO: renamed from: u */
        public Integer f25305u;

        /* JADX INFO: renamed from: v */
        public Integer f25306v;

        /* JADX INFO: renamed from: w */
        public CharSequence f25307w;

        /* JADX INFO: renamed from: x */
        public CharSequence f25308x;

        /* JADX INFO: renamed from: y */
        public Integer f25309y;

        /* JADX INFO: renamed from: z */
        public ImmutableList f25310z;

        /* JADX INFO: renamed from: a */
        public final void m9324a(int i, byte[] bArr) {
            if (this.f25290f == null || i == 3 || !Objects.equals(this.f25291g, 3)) {
                this.f25290f = (byte[]) bArr.clone();
                this.f25291g = Integer.valueOf(i);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FolderType {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PictureType {
    }

    static {
        Builder builder = new Builder();
        builder.f25310z = ImmutableList.m14824of();
        f25257B = new MediaMetadata(builder);
        AbstractC1610a.m8737o(0, 1, 2, 3, 4);
        AbstractC1610a.m8737o(5, 6, 8, 9, 10);
        AbstractC1610a.m8737o(11, 12, 13, 14, 15);
        AbstractC1610a.m8737o(16, 17, 18, 19, 20);
        AbstractC1610a.m8737o(21, 22, 23, 24, 25);
        AbstractC1610a.m8737o(26, 27, 28, 29, 30);
        AbstractC1610a.m8737o(31, 32, 33, 34, 1000);
    }

    public MediaMetadata(Builder builder) {
        Boolean boolValueOf = builder.f25295k;
        Integer numValueOf = builder.f25294j;
        Integer numValueOf2 = builder.f25309y;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case TYPE_BYTES_VALUE:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            i = 4;
                            break;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            i = 5;
                            break;
                        case BuildConfig.VERSION_CODE /* 25 */:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z2 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z2);
            if (z2 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.f25259a = builder.f25285a;
        this.f25260b = builder.f25286b;
        this.f25261c = builder.f25287c;
        this.f25262d = builder.f25288d;
        this.f25263e = builder.f25289e;
        this.f25264f = builder.f25290f;
        this.f25265g = builder.f25291g;
        this.f25266h = builder.f25292h;
        this.f25267i = builder.f25293i;
        this.f25268j = numValueOf;
        this.f25269k = boolValueOf;
        Integer num = builder.f25296l;
        this.f25270l = num;
        this.f25271m = num;
        this.f25272n = builder.f25297m;
        this.f25273o = builder.f25298n;
        this.f25274p = builder.f25299o;
        this.f25275q = builder.f25300p;
        this.f25276r = builder.f25301q;
        this.f25277s = builder.f25302r;
        this.f25278t = builder.f25303s;
        this.f25279u = builder.f25304t;
        this.f25280v = builder.f25305u;
        this.f25281w = builder.f25306v;
        this.f25282x = builder.f25307w;
        this.f25283y = builder.f25308x;
        this.f25284z = numValueOf2;
        this.f25258A = builder.f25310z;
    }

    /* JADX INFO: renamed from: a */
    public final Builder m9323a() {
        Builder builder = new Builder();
        builder.f25285a = this.f25259a;
        builder.f25286b = this.f25260b;
        builder.f25287c = this.f25261c;
        builder.f25288d = this.f25262d;
        builder.f25289e = this.f25263e;
        builder.f25290f = this.f25264f;
        builder.f25291g = this.f25265g;
        builder.f25292h = this.f25266h;
        builder.f25293i = this.f25267i;
        builder.f25294j = this.f25268j;
        builder.f25295k = this.f25269k;
        builder.f25296l = this.f25271m;
        builder.f25297m = this.f25272n;
        builder.f25298n = this.f25273o;
        builder.f25299o = this.f25274p;
        builder.f25300p = this.f25275q;
        builder.f25301q = this.f25276r;
        builder.f25302r = this.f25277s;
        builder.f25303s = this.f25278t;
        builder.f25304t = this.f25279u;
        builder.f25305u = this.f25280v;
        builder.f25306v = this.f25281w;
        builder.f25307w = this.f25282x;
        builder.f25308x = this.f25283y;
        builder.f25309y = this.f25284z;
        builder.f25310z = this.f25258A;
        return builder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return Objects.equals(this.f25259a, mediaMetadata.f25259a) && Objects.equals(this.f25260b, mediaMetadata.f25260b) && Objects.equals(this.f25261c, mediaMetadata.f25261c) && Objects.equals(this.f25262d, mediaMetadata.f25262d) && Objects.equals(this.f25263e, mediaMetadata.f25263e) && Arrays.equals(this.f25264f, mediaMetadata.f25264f) && Objects.equals(this.f25265g, mediaMetadata.f25265g) && Objects.equals(this.f25266h, mediaMetadata.f25266h) && Objects.equals(this.f25267i, mediaMetadata.f25267i) && Objects.equals(this.f25268j, mediaMetadata.f25268j) && Objects.equals(this.f25269k, mediaMetadata.f25269k) && Objects.equals(this.f25271m, mediaMetadata.f25271m) && Objects.equals(this.f25272n, mediaMetadata.f25272n) && Objects.equals(this.f25273o, mediaMetadata.f25273o) && Objects.equals(this.f25274p, mediaMetadata.f25274p) && Objects.equals(this.f25275q, mediaMetadata.f25275q) && Objects.equals(this.f25276r, mediaMetadata.f25276r) && Objects.equals(this.f25277s, mediaMetadata.f25277s) && Objects.equals(this.f25278t, mediaMetadata.f25278t) && Objects.equals(this.f25279u, mediaMetadata.f25279u) && Objects.equals(this.f25280v, mediaMetadata.f25280v) && Objects.equals(this.f25281w, mediaMetadata.f25281w) && Objects.equals(this.f25282x, mediaMetadata.f25282x) && Objects.equals(this.f25283y, mediaMetadata.f25283y) && Objects.equals(this.f25284z, mediaMetadata.f25284z) && Objects.equals(this.f25258A, mediaMetadata.f25258A);
    }

    public final int hashCode() {
        return Objects.hash(this.f25259a, this.f25260b, this.f25261c, this.f25262d, null, null, this.f25263e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f25264f)), this.f25265g, null, this.f25266h, this.f25267i, this.f25268j, this.f25269k, null, this.f25271m, this.f25272n, this.f25273o, this.f25274p, this.f25275q, this.f25276r, this.f25277s, this.f25278t, this.f25279u, this.f25280v, this.f25281w, this.f25282x, null, this.f25283y, this.f25284z, true, this.f25258A);
    }
}
