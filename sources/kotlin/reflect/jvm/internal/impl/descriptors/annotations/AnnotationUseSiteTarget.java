package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum AnnotationUseSiteTarget {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* JADX INFO: renamed from: a */
    public final String f52330a;

    AnnotationUseSiteTarget(String str) {
        this.f52330a = str == null ? CapitalizeDecapitalizeKt.m20333c(name()) : str;
    }
}
