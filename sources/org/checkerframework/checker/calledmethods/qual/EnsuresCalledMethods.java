package org.checkerframework.checker.calledmethods.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.InheritedAnnotation;
import org.checkerframework.framework.qual.PostconditionAnnotation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@PostconditionAnnotation
@InheritedAnnotation
@Repeatable(List.class)
public @interface EnsuresCalledMethods {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @PostconditionAnnotation
    @InheritedAnnotation
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
    }
}
