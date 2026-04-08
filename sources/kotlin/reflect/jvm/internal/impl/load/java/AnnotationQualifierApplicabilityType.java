package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum AnnotationQualifierApplicabilityType {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PARAMETER("TYPE_PARAMETER");


    /* JADX INFO: renamed from: a */
    public final String f52703a;

    AnnotationQualifierApplicabilityType(String str) {
        this.f52703a = str;
    }
}
