package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Check {

    /* JADX INFO: compiled from: Proguard */
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static String m20328a(Check check, JavaMethodDescriptor javaMethodDescriptor) {
            if (check.mo20326b(javaMethodDescriptor)) {
                return null;
            }
            return check.mo20325a();
        }
    }

    /* JADX INFO: renamed from: a */
    String mo20325a();

    /* JADX INFO: renamed from: b */
    boolean mo20326b(JavaMethodDescriptor javaMethodDescriptor);

    /* JADX INFO: renamed from: c */
    String mo20327c(JavaMethodDescriptor javaMethodDescriptor);
}
