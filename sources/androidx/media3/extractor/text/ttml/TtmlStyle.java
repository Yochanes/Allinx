package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TtmlStyle {

    /* JADX INFO: renamed from: a */
    public String f29268a;

    /* JADX INFO: renamed from: b */
    public int f29269b;

    /* JADX INFO: renamed from: c */
    public boolean f29270c;

    /* JADX INFO: renamed from: d */
    public int f29271d;

    /* JADX INFO: renamed from: e */
    public boolean f29272e;

    /* JADX INFO: renamed from: k */
    public float f29278k;

    /* JADX INFO: renamed from: l */
    public String f29279l;

    /* JADX INFO: renamed from: o */
    public Layout.Alignment f29282o;

    /* JADX INFO: renamed from: p */
    public Layout.Alignment f29283p;

    /* JADX INFO: renamed from: r */
    public TextEmphasis f29285r;

    /* JADX INFO: renamed from: t */
    public String f29287t;

    /* JADX INFO: renamed from: u */
    public String f29288u;

    /* JADX INFO: renamed from: f */
    public int f29273f = -1;

    /* JADX INFO: renamed from: g */
    public int f29274g = -1;

    /* JADX INFO: renamed from: h */
    public int f29275h = -1;

    /* JADX INFO: renamed from: i */
    public int f29276i = -1;

    /* JADX INFO: renamed from: j */
    public int f29277j = -1;

    /* JADX INFO: renamed from: m */
    public int f29280m = -1;

    /* JADX INFO: renamed from: n */
    public int f29281n = -1;

    /* JADX INFO: renamed from: q */
    public int f29284q = -1;

    /* JADX INFO: renamed from: s */
    public float f29286s = Float.MAX_VALUE;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    /* JADX INFO: renamed from: a */
    public final void m11021a(TtmlStyle ttmlStyle) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.f29270c && ttmlStyle.f29270c) {
                this.f29269b = ttmlStyle.f29269b;
                this.f29270c = true;
            }
            if (this.f29275h == -1) {
                this.f29275h = ttmlStyle.f29275h;
            }
            if (this.f29276i == -1) {
                this.f29276i = ttmlStyle.f29276i;
            }
            if (this.f29268a == null && (str = ttmlStyle.f29268a) != null) {
                this.f29268a = str;
            }
            if (this.f29273f == -1) {
                this.f29273f = ttmlStyle.f29273f;
            }
            if (this.f29274g == -1) {
                this.f29274g = ttmlStyle.f29274g;
            }
            if (this.f29281n == -1) {
                this.f29281n = ttmlStyle.f29281n;
            }
            if (this.f29282o == null && (alignment2 = ttmlStyle.f29282o) != null) {
                this.f29282o = alignment2;
            }
            if (this.f29283p == null && (alignment = ttmlStyle.f29283p) != null) {
                this.f29283p = alignment;
            }
            if (this.f29284q == -1) {
                this.f29284q = ttmlStyle.f29284q;
            }
            if (this.f29277j == -1) {
                this.f29277j = ttmlStyle.f29277j;
                this.f29278k = ttmlStyle.f29278k;
            }
            if (this.f29285r == null) {
                this.f29285r = ttmlStyle.f29285r;
            }
            if (this.f29286s == Float.MAX_VALUE) {
                this.f29286s = ttmlStyle.f29286s;
            }
            if (this.f29287t == null) {
                this.f29287t = ttmlStyle.f29287t;
            }
            if (this.f29288u == null) {
                this.f29288u = ttmlStyle.f29288u;
            }
            if (!this.f29272e && ttmlStyle.f29272e) {
                this.f29271d = ttmlStyle.f29271d;
                this.f29272e = true;
            }
            if (this.f29280m != -1 || (i = ttmlStyle.f29280m) == -1) {
                return;
            }
            this.f29280m = i;
        }
    }
}
