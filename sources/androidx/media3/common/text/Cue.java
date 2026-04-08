package androidx.media3.common.text;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Cue {

    /* JADX INFO: renamed from: A */
    public static final String f25500A;

    /* JADX INFO: renamed from: B */
    public static final String f25501B;

    /* JADX INFO: renamed from: C */
    public static final String f25502C;

    /* JADX INFO: renamed from: D */
    public static final String f25503D;

    /* JADX INFO: renamed from: E */
    public static final String f25504E;

    /* JADX INFO: renamed from: F */
    public static final String f25505F;

    /* JADX INFO: renamed from: G */
    public static final String f25506G;

    /* JADX INFO: renamed from: H */
    public static final String f25507H;

    /* JADX INFO: renamed from: I */
    public static final String f25508I;

    /* JADX INFO: renamed from: J */
    public static final String f25509J;

    /* JADX INFO: renamed from: r */
    public static final String f25510r;

    /* JADX INFO: renamed from: s */
    public static final String f25511s;

    /* JADX INFO: renamed from: t */
    public static final String f25512t;

    /* JADX INFO: renamed from: u */
    public static final String f25513u;

    /* JADX INFO: renamed from: v */
    public static final String f25514v;

    /* JADX INFO: renamed from: w */
    public static final String f25515w;

    /* JADX INFO: renamed from: x */
    public static final String f25516x;

    /* JADX INFO: renamed from: y */
    public static final String f25517y;

    /* JADX INFO: renamed from: z */
    public static final String f25518z;

    /* JADX INFO: renamed from: a */
    public final CharSequence f25519a;

    /* JADX INFO: renamed from: b */
    public final Layout.Alignment f25520b;

    /* JADX INFO: renamed from: c */
    public final Layout.Alignment f25521c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f25522d;

    /* JADX INFO: renamed from: e */
    public final float f25523e;

    /* JADX INFO: renamed from: f */
    public final int f25524f;

    /* JADX INFO: renamed from: g */
    public final int f25525g;

    /* JADX INFO: renamed from: h */
    public final float f25526h;

    /* JADX INFO: renamed from: i */
    public final int f25527i;

    /* JADX INFO: renamed from: j */
    public final float f25528j;

    /* JADX INFO: renamed from: k */
    public final float f25529k;

    /* JADX INFO: renamed from: l */
    public final boolean f25530l;

    /* JADX INFO: renamed from: m */
    public final int f25531m;

    /* JADX INFO: renamed from: n */
    public final int f25532n;

    /* JADX INFO: renamed from: o */
    public final float f25533o;

    /* JADX INFO: renamed from: p */
    public final int f25534p;

    /* JADX INFO: renamed from: q */
    public final float f25535q;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public CharSequence f25536a = null;

        /* JADX INFO: renamed from: b */
        public Bitmap f25537b = null;

        /* JADX INFO: renamed from: c */
        public Layout.Alignment f25538c = null;

        /* JADX INFO: renamed from: d */
        public Layout.Alignment f25539d = null;

        /* JADX INFO: renamed from: e */
        public float f25540e = -3.4028235E38f;

        /* JADX INFO: renamed from: f */
        public int f25541f = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: g */
        public int f25542g = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: h */
        public float f25543h = -3.4028235E38f;

        /* JADX INFO: renamed from: i */
        public int f25544i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j */
        public int f25545j = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: k */
        public float f25546k = -3.4028235E38f;

        /* JADX INFO: renamed from: l */
        public float f25547l = -3.4028235E38f;

        /* JADX INFO: renamed from: m */
        public float f25548m = -3.4028235E38f;

        /* JADX INFO: renamed from: n */
        public boolean f25549n = false;

        /* JADX INFO: renamed from: o */
        public int f25550o = -16777216;

        /* JADX INFO: renamed from: p */
        public int f25551p = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: q */
        public float f25552q;

        /* JADX INFO: renamed from: a */
        public final Cue m9457a() {
            return new Cue(this.f25536a, this.f25538c, this.f25539d, this.f25537b, this.f25540e, this.f25541f, this.f25542g, this.f25543h, this.f25544i, this.f25545j, this.f25546k, this.f25547l, this.f25548m, this.f25549n, this.f25550o, this.f25551p, this.f25552q);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    static {
        Builder builder = new Builder();
        builder.f25536a = "";
        builder.m9457a();
        int i = Util.f25665a;
        f25510r = Integer.toString(0, 36);
        f25511s = Integer.toString(17, 36);
        f25512t = Integer.toString(1, 36);
        f25513u = Integer.toString(2, 36);
        f25514v = Integer.toString(3, 36);
        f25515w = Integer.toString(18, 36);
        f25516x = Integer.toString(4, 36);
        f25517y = Integer.toString(5, 36);
        f25518z = Integer.toString(6, 36);
        f25500A = Integer.toString(7, 36);
        f25501B = Integer.toString(8, 36);
        f25502C = Integer.toString(9, 36);
        f25503D = Integer.toString(10, 36);
        f25504E = Integer.toString(11, 36);
        f25505F = Integer.toString(12, 36);
        f25506G = Integer.toString(13, 36);
        f25507H = Integer.toString(14, 36);
        f25508I = Integer.toString(15, 36);
        f25509J = Integer.toString(16, 36);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            Assertions.m9460a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f25519a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f25519a = charSequence.toString();
        } else {
            this.f25519a = null;
        }
        this.f25520b = alignment;
        this.f25521c = alignment2;
        this.f25522d = bitmap;
        this.f25523e = f;
        this.f25524f = i;
        this.f25525g = i2;
        this.f25526h = f2;
        this.f25527i = i3;
        this.f25528j = f4;
        this.f25529k = f5;
        this.f25530l = z2;
        this.f25531m = i5;
        this.f25532n = i4;
        this.f25533o = f3;
        this.f25534p = i6;
        this.f25535q = f6;
    }

    /* JADX INFO: renamed from: b */
    public static Cue m9454b(Bundle bundle) {
        Builder builder = new Builder();
        CharSequence charSequence = bundle.getCharSequence(f25510r);
        if (charSequence != null) {
            builder.f25536a = charSequence;
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(f25511s);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                for (Bundle bundle2 : parcelableArrayList) {
                    int i = bundle2.getInt(CustomSpanBundler.f25555a);
                    int i2 = bundle2.getInt(CustomSpanBundler.f25556b);
                    int i3 = bundle2.getInt(CustomSpanBundler.f25557c);
                    int i4 = bundle2.getInt(CustomSpanBundler.f25558d, -1);
                    Bundle bundle3 = bundle2.getBundle(CustomSpanBundler.f25559e);
                    if (i4 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(RubySpan.f25560c);
                        string.getClass();
                        spannableStringValueOf.setSpan(new RubySpan(string, bundle3.getInt(RubySpan.f25561d)), i, i2, i3);
                    } else if (i4 == 2) {
                        bundle3.getClass();
                        spannableStringValueOf.setSpan(new TextEmphasisSpan(bundle3.getInt(TextEmphasisSpan.f25564d), bundle3.getInt(TextEmphasisSpan.f25565e), bundle3.getInt(TextEmphasisSpan.f25566f)), i, i2, i3);
                    } else if (i4 == 3) {
                        spannableStringValueOf.setSpan(new HorizontalTextInVerticalContextSpan(), i, i2, i3);
                    } else if (i4 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(VoiceSpan.f25570b);
                        string2.getClass();
                        spannableStringValueOf.setSpan(new VoiceSpan(string2), i, i2, i3);
                    }
                }
                builder.f25536a = spannableStringValueOf;
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f25512t);
        if (alignment != null) {
            builder.f25538c = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f25513u);
        if (alignment2 != null) {
            builder.f25539d = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f25514v);
        if (bitmap != null) {
            builder.f25537b = bitmap;
        } else {
            byte[] byteArray = bundle.getByteArray(f25515w);
            if (byteArray != null) {
                builder.f25537b = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
        }
        String str = f25516x;
        if (bundle.containsKey(str)) {
            String str2 = f25517y;
            if (bundle.containsKey(str2)) {
                float f = bundle.getFloat(str);
                int i5 = bundle.getInt(str2);
                builder.f25540e = f;
                builder.f25541f = i5;
            }
        }
        String str3 = f25518z;
        if (bundle.containsKey(str3)) {
            builder.f25542g = bundle.getInt(str3);
        }
        String str4 = f25500A;
        if (bundle.containsKey(str4)) {
            builder.f25543h = bundle.getFloat(str4);
        }
        String str5 = f25501B;
        if (bundle.containsKey(str5)) {
            builder.f25544i = bundle.getInt(str5);
        }
        String str6 = f25503D;
        if (bundle.containsKey(str6)) {
            String str7 = f25502C;
            if (bundle.containsKey(str7)) {
                float f2 = bundle.getFloat(str6);
                int i6 = bundle.getInt(str7);
                builder.f25546k = f2;
                builder.f25545j = i6;
            }
        }
        String str8 = f25504E;
        if (bundle.containsKey(str8)) {
            builder.f25547l = bundle.getFloat(str8);
        }
        String str9 = f25505F;
        if (bundle.containsKey(str9)) {
            builder.f25548m = bundle.getFloat(str9);
        }
        String str10 = f25506G;
        if (bundle.containsKey(str10)) {
            builder.f25550o = bundle.getInt(str10);
            builder.f25549n = true;
        }
        if (!bundle.getBoolean(f25507H, false)) {
            builder.f25549n = false;
        }
        String str11 = f25508I;
        if (bundle.containsKey(str11)) {
            builder.f25551p = bundle.getInt(str11);
        }
        String str12 = f25509J;
        if (bundle.containsKey(str12)) {
            builder.f25552q = bundle.getFloat(str12);
        }
        return builder.m9457a();
    }

    /* JADX INFO: renamed from: a */
    public final Builder m9455a() {
        Builder builder = new Builder();
        builder.f25536a = this.f25519a;
        builder.f25537b = this.f25522d;
        builder.f25538c = this.f25520b;
        builder.f25539d = this.f25521c;
        builder.f25540e = this.f25523e;
        builder.f25541f = this.f25524f;
        builder.f25542g = this.f25525g;
        builder.f25543h = this.f25526h;
        builder.f25544i = this.f25527i;
        builder.f25545j = this.f25532n;
        builder.f25546k = this.f25533o;
        builder.f25547l = this.f25528j;
        builder.f25548m = this.f25529k;
        builder.f25549n = this.f25530l;
        builder.f25550o = this.f25531m;
        builder.f25551p = this.f25534p;
        builder.f25552q = this.f25535q;
        return builder;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m9456c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f25519a;
        if (charSequence != null) {
            bundle.putCharSequence(f25510r, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = CustomSpanBundler.f25555a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (RubySpan rubySpan : (RubySpan[]) spanned.getSpans(0, spanned.length(), RubySpan.class)) {
                    rubySpan.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(RubySpan.f25560c, rubySpan.f25562a);
                    bundle2.putInt(RubySpan.f25561d, rubySpan.f25563b);
                    arrayList.add(CustomSpanBundler.m9458a(spanned, rubySpan, 1, bundle2));
                }
                for (TextEmphasisSpan textEmphasisSpan : (TextEmphasisSpan[]) spanned.getSpans(0, spanned.length(), TextEmphasisSpan.class)) {
                    textEmphasisSpan.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(TextEmphasisSpan.f25564d, textEmphasisSpan.f25567a);
                    bundle3.putInt(TextEmphasisSpan.f25565e, textEmphasisSpan.f25568b);
                    bundle3.putInt(TextEmphasisSpan.f25566f, textEmphasisSpan.f25569c);
                    arrayList.add(CustomSpanBundler.m9458a(spanned, textEmphasisSpan, 2, bundle3));
                }
                for (HorizontalTextInVerticalContextSpan horizontalTextInVerticalContextSpan : (HorizontalTextInVerticalContextSpan[]) spanned.getSpans(0, spanned.length(), HorizontalTextInVerticalContextSpan.class)) {
                    arrayList.add(CustomSpanBundler.m9458a(spanned, horizontalTextInVerticalContextSpan, 3, null));
                }
                for (VoiceSpan voiceSpan : (VoiceSpan[]) spanned.getSpans(0, spanned.length(), VoiceSpan.class)) {
                    voiceSpan.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(VoiceSpan.f25570b, voiceSpan.f25571a);
                    arrayList.add(CustomSpanBundler.m9458a(spanned, voiceSpan, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f25511s, arrayList);
                }
            }
        }
        bundle.putSerializable(f25512t, this.f25520b);
        bundle.putSerializable(f25513u, this.f25521c);
        bundle.putFloat(f25516x, this.f25523e);
        bundle.putInt(f25517y, this.f25524f);
        bundle.putInt(f25518z, this.f25525g);
        bundle.putFloat(f25500A, this.f25526h);
        bundle.putInt(f25501B, this.f25527i);
        bundle.putInt(f25502C, this.f25532n);
        bundle.putFloat(f25503D, this.f25533o);
        bundle.putFloat(f25504E, this.f25528j);
        bundle.putFloat(f25505F, this.f25529k);
        bundle.putBoolean(f25507H, this.f25530l);
        bundle.putInt(f25506G, this.f25531m);
        bundle.putInt(f25508I, this.f25534p);
        bundle.putFloat(f25509J, this.f25535q);
        Bitmap bitmap = this.f25522d;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Assertions.m9464e(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f25515w, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        if (!TextUtils.equals(this.f25519a, cue.f25519a) || this.f25520b != cue.f25520b || this.f25521c != cue.f25521c) {
            return false;
        }
        Bitmap bitmap = cue.f25522d;
        Bitmap bitmap2 = this.f25522d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f25523e == cue.f25523e && this.f25524f == cue.f25524f && this.f25525g == cue.f25525g && this.f25526h == cue.f25526h && this.f25527i == cue.f25527i && this.f25528j == cue.f25528j && this.f25529k == cue.f25529k && this.f25530l == cue.f25530l && this.f25531m == cue.f25531m && this.f25532n == cue.f25532n && this.f25533o == cue.f25533o && this.f25534p == cue.f25534p && this.f25535q == cue.f25535q;
    }

    public final int hashCode() {
        Float fValueOf = Float.valueOf(this.f25523e);
        Integer numValueOf = Integer.valueOf(this.f25524f);
        Integer numValueOf2 = Integer.valueOf(this.f25525g);
        Float fValueOf2 = Float.valueOf(this.f25526h);
        Integer numValueOf3 = Integer.valueOf(this.f25527i);
        Float fValueOf3 = Float.valueOf(this.f25528j);
        Float fValueOf4 = Float.valueOf(this.f25529k);
        Boolean boolValueOf = Boolean.valueOf(this.f25530l);
        Integer numValueOf4 = Integer.valueOf(this.f25531m);
        Integer numValueOf5 = Integer.valueOf(this.f25532n);
        Float fValueOf5 = Float.valueOf(this.f25533o);
        Integer numValueOf6 = Integer.valueOf(this.f25534p);
        Float fValueOf6 = Float.valueOf(this.f25535q);
        return Objects.hash(this.f25519a, this.f25520b, this.f25521c, this.f25522d, fValueOf, numValueOf, numValueOf2, fValueOf2, numValueOf3, fValueOf3, fValueOf4, boolValueOf, numValueOf4, numValueOf5, fValueOf5, numValueOf6, fValueOf6);
    }
}
