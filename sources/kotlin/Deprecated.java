package kotlin;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.MustBeDocumented;

/* JADX WARN: Method from annotation default annotation not found: level */
/* JADX WARN: Method from annotation default annotation not found: replaceWith */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@MustBeDocumented
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m18302d2 = {"Lkotlin/Deprecated;", "", "", "message", "Lkotlin/ReplaceWith;", "replaceWith", "Lkotlin/DeprecationLevel;", FirebaseAnalytics.Param.LEVEL, "<init>", "(Ljava/lang/String;Lkotlin/ReplaceWith;Lkotlin/DeprecationLevel;)V", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@kotlin.annotation.Target
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Deprecated {
}
