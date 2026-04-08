package com.google.auto.value;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface AutoValue {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CopyAnnotations {
        Class<? extends Annotation>[] exclude() default {};
    }
}
