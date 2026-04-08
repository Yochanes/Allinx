package androidx.compose.p013ui.text;

import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotationType;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AnnotationType {

    /* JADX INFO: renamed from: a */
    public static final AnnotationType f19910a;

    /* JADX INFO: renamed from: b */
    public static final AnnotationType f19911b;

    /* JADX INFO: renamed from: c */
    public static final AnnotationType f19912c;

    /* JADX INFO: renamed from: d */
    public static final AnnotationType f19913d;

    /* JADX INFO: renamed from: f */
    public static final AnnotationType f19914f;

    /* JADX INFO: renamed from: g */
    public static final AnnotationType f19915g;

    /* JADX INFO: renamed from: i */
    public static final AnnotationType f19916i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AnnotationType[] f19917j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ EnumEntries f19918n;

    static {
        AnnotationType annotationType = new AnnotationType("Paragraph", 0);
        f19910a = annotationType;
        AnnotationType annotationType2 = new AnnotationType("Span", 1);
        f19911b = annotationType2;
        AnnotationType annotationType3 = new AnnotationType("VerbatimTts", 2);
        f19912c = annotationType3;
        AnnotationType annotationType4 = new AnnotationType("Url", 3);
        f19913d = annotationType4;
        AnnotationType annotationType5 = new AnnotationType(HttpHeaders.LINK, 4);
        f19914f = annotationType5;
        AnnotationType annotationType6 = new AnnotationType("Clickable", 5);
        f19915g = annotationType6;
        AnnotationType annotationType7 = new AnnotationType("String", 6);
        f19916i = annotationType7;
        AnnotationType[] annotationTypeArr = {annotationType, annotationType2, annotationType3, annotationType4, annotationType5, annotationType6, annotationType7};
        f19917j = annotationTypeArr;
        f19918n = EnumEntriesKt.m18563a(annotationTypeArr);
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) f19917j.clone();
    }
}
