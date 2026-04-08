package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;

/* JADX WARN: Method from annotation default annotation not found: allOf */
/* JADX WARN: Method from annotation default annotation not found: anyOf */
/* JADX WARN: Method from annotation default annotation not found: conditional */
/* JADX WARN: Method from annotation default annotation not found: value */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
@MustBeDocumented
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0002\u000b\fB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m18302d2 = {"Landroidx/annotation/RequiresPermission;", "", "", "value", "", "allOf", "anyOf", "", "conditional", "<init>", "(Ljava/lang/String;Lkotlin/Array;Lkotlin/Array;Z)V", "Read", "Write", "annotation"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Documented
public @interface RequiresPermission {

    /* JADX WARN: Method from annotation default annotation not found: value */
    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/annotation/RequiresPermission$Read;", "", "Landroidx/annotation/RequiresPermission;", "value", "<init>", "(Landroidx/annotation/RequiresPermission;)V", "annotation"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Read {
    }

    /* JADX WARN: Method from annotation default annotation not found: value */
    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/annotation/RequiresPermission$Write;", "", "Landroidx/annotation/RequiresPermission;", "value", "<init>", "(Landroidx/annotation/RequiresPermission;)V", "annotation"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Write {
    }
}
