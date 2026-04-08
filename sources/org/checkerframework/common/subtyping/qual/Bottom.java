package org.checkerframework.common.subtyping.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations
@Documented
@SubtypeOf
public @interface Bottom {
}
