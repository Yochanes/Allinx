package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: capitalization */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE, ElementType.TYPE, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface Nls {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Capitalization {

        /* JADX INFO: renamed from: a */
        public static final Capitalization f58174a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Capitalization[] f58175b;

        static {
            Capitalization capitalization = new Capitalization("NotSpecified", 0);
            f58174a = capitalization;
            f58175b = new Capitalization[]{capitalization, new Capitalization("Title", 1), new Capitalization("Sentence", 2)};
        }

        public static Capitalization valueOf(String str) {
            return (Capitalization) Enum.valueOf(Capitalization.class, str);
        }

        public static Capitalization[] values() {
            return (Capitalization[]) f58175b.clone();
        }
    }
}
