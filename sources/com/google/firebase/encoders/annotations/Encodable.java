package com.google.firebase.encoders.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Encodable {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Field {
        boolean inline() default false;

        String name() default "";
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Ignore {
    }
}
