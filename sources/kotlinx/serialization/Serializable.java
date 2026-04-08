package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.TYPE_USE})
@MustBeDocumented
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Lkotlinx/serialization/Serializable;", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "with", "<init>", "(Lkotlin/reflect/KClass;)V", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@kotlin.annotation.Target
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Serializable {
    Class with() default KSerializer.class;
}
