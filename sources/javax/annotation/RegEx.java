package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.TypeQualifierValidator;

/* JADX WARN: Method from annotation default annotation not found: when */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Syntax
@TypeQualifierNickname
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface RegEx {

    /* JADX INFO: compiled from: Proguard */
    public static class Checker implements TypeQualifierValidator<RegEx> {
    }
}
