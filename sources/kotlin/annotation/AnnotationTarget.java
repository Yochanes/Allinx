package kotlin.annotation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AnnotationTarget {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AnnotationTarget[] f51465a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f51466b;

    static {
        AnnotationTarget[] annotationTargetArr = {new AnnotationTarget("CLASS", 0), new AnnotationTarget("ANNOTATION_CLASS", 1), new AnnotationTarget("TYPE_PARAMETER", 2), new AnnotationTarget("PROPERTY", 3), new AnnotationTarget("FIELD", 4), new AnnotationTarget("LOCAL_VARIABLE", 5), new AnnotationTarget("VALUE_PARAMETER", 6), new AnnotationTarget("CONSTRUCTOR", 7), new AnnotationTarget("FUNCTION", 8), new AnnotationTarget("PROPERTY_GETTER", 9), new AnnotationTarget("PROPERTY_SETTER", 10), new AnnotationTarget("TYPE", 11), new AnnotationTarget("EXPRESSION", 12), new AnnotationTarget("FILE", 13), new AnnotationTarget("TYPEALIAS", 14)};
        f51465a = annotationTargetArr;
        f51466b = EnumEntriesKt.m18563a(annotationTargetArr);
    }

    public static AnnotationTarget valueOf(String str) {
        return (AnnotationTarget) Enum.valueOf(AnnotationTarget.class, str);
    }

    public static AnnotationTarget[] values() {
        return (AnnotationTarget[]) f51465a.clone();
    }
}
