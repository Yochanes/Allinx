package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.PreconditionAnnotation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@PreconditionAnnotation
@Documented
@Repeatable(List.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresNonNull {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @PreconditionAnnotation
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
    }
}
