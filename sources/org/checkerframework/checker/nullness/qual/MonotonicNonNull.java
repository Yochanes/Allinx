package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.MonotonicQualifier;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE_USE})
@MonotonicQualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf
public @interface MonotonicNonNull {
}
