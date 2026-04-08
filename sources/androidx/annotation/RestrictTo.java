package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
@MustBeDocumented
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m18302d2 = {"Landroidx/annotation/RestrictTo;", "", "", "Landroidx/annotation/RestrictTo$Scope;", "value", "<init>", "(Lkotlin/Array;)V", "Scope", "annotation"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Documented
public @interface RestrictTo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/annotation/RestrictTo$Scope;", "", "annotation"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Scope {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Scope[] f256a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumEntries f257b;

        static {
            Scope[] scopeArr = {new Scope("LIBRARY", 0), new Scope("LIBRARY_GROUP", 1), new Scope("LIBRARY_GROUP_PREFIX", 2), new Scope("GROUP_ID", 3), new Scope("TESTS", 4), new Scope("SUBCLASSES", 5)};
            f256a = scopeArr;
            f257b = EnumEntriesKt.m18563a(scopeArr);
        }

        public static Scope valueOf(String str) {
            return (Scope) Enum.valueOf(Scope.class, str);
        }

        public static Scope[] values() {
            return (Scope[]) f256a.clone();
        }
    }
}
