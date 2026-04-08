package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Repeatable;
import kotlin.jvm.internal.RepeatableContainer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
@MustBeDocumented
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/annotation/RequiresExtension;", "", "", "extension", "version", "<init>", "(II)V", "annotation"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Repeatable
@Documented
@java.lang.annotation.Repeatable(Container.class)
public @interface RequiresExtension {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention
    @RepeatableContainer
    public @interface Container {
    }
}
