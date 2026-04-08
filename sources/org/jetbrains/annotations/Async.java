package org.jetbrains.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Async {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface Execute {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface Schedule {
    }
}
