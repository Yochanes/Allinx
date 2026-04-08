package com.google.gson;

import com.google.gson.internal.ReflectionAccessFilterHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface ReflectionAccessFilter {
    public static final ReflectionAccessFilter BLOCK_INACCESSIBLE_JAVA = new C47911();
    public static final ReflectionAccessFilter BLOCK_ALL_JAVA = new C47922();
    public static final ReflectionAccessFilter BLOCK_ALL_ANDROID = new C47933();
    public static final ReflectionAccessFilter BLOCK_ALL_PLATFORM = new C47944();

    /* JADX INFO: renamed from: com.google.gson.ReflectionAccessFilter$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C47911 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult check(Class<?> cls) {
            return ReflectionAccessFilterHelper.isJavaType(cls) ? FilterResult.BLOCK_INACCESSIBLE : FilterResult.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_INACCESSIBLE_JAVA";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.ReflectionAccessFilter$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C47922 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult check(Class<?> cls) {
            return ReflectionAccessFilterHelper.isJavaType(cls) ? FilterResult.BLOCK_ALL : FilterResult.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_JAVA";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.ReflectionAccessFilter$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C47933 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult check(Class<?> cls) {
            return ReflectionAccessFilterHelper.isAndroidType(cls) ? FilterResult.BLOCK_ALL : FilterResult.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_ANDROID";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.ReflectionAccessFilter$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C47944 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult check(Class<?> cls) {
            return ReflectionAccessFilterHelper.isAnyPlatformType(cls) ? FilterResult.BLOCK_ALL : FilterResult.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_PLATFORM";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum FilterResult {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    FilterResult check(Class<?> cls);
}
