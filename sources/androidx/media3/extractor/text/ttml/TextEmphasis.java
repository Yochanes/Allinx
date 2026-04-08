package androidx.media3.extractor.text.ttml;

import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TextEmphasis {

    /* JADX INFO: renamed from: d */
    public static final Pattern f29223d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e */
    public static final ImmutableSet f29224e = ImmutableSet.m14874of("auto", "none");

    /* JADX INFO: renamed from: f */
    public static final ImmutableSet f29225f = ImmutableSet.m14875of("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g */
    public static final ImmutableSet f29226g = ImmutableSet.m14874of("filled", "open");

    /* JADX INFO: renamed from: h */
    public static final ImmutableSet f29227h = ImmutableSet.m14875of("after", "before", "outside");

    /* JADX INFO: renamed from: a */
    public final int f29228a;

    /* JADX INFO: renamed from: b */
    public final int f29229b;

    /* JADX INFO: renamed from: c */
    public final int f29230c;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public TextEmphasis(int i, int i2, int i3) {
        this.f29228a = i;
        this.f29229b = i2;
        this.f29230c = i3;
    }
}
