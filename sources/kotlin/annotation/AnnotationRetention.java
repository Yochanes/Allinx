package kotlin.annotation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AnnotationRetention {

    /* JADX INFO: renamed from: a */
    public static final AnnotationRetention f51462a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AnnotationRetention[] f51463b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f51464c;

    static {
        AnnotationRetention annotationRetention = new AnnotationRetention("SOURCE", 0);
        AnnotationRetention annotationRetention2 = new AnnotationRetention("BINARY", 1);
        AnnotationRetention annotationRetention3 = new AnnotationRetention("RUNTIME", 2);
        f51462a = annotationRetention3;
        AnnotationRetention[] annotationRetentionArr = {annotationRetention, annotationRetention2, annotationRetention3};
        f51463b = annotationRetentionArr;
        f51464c = EnumEntriesKt.m18563a(annotationRetentionArr);
    }

    public static AnnotationRetention valueOf(String str) {
        return (AnnotationRetention) Enum.valueOf(AnnotationRetention.class, str);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[]) f51463b.clone();
    }
}
