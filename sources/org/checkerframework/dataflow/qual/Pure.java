package org.checkerframework.dataflow.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Pure {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Kind {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Kind[] f58156a = {new Kind("SIDE_EFFECT_FREE", 0), new Kind("DETERMINISTIC", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Kind EF5;

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f58156a.clone();
        }
    }
}
