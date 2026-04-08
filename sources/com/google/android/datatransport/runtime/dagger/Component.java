package com.google.android.datatransport.runtime.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Factory {
    }

    Class<?>[] dependencies() default {};

    Class<?>[] modules() default {};
}
