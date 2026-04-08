package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ErrorReporter {

    /* JADX INFO: renamed from: a */
    public static final ErrorReporter f54560a = new C61861();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C61861 implements ErrorReporter {
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m20020c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        /* JADX INFO: renamed from: a */
        public final void mo19111a(ClassDescriptor classDescriptor, ArrayList arrayList) {
            if (classDescriptor != null) {
                return;
            }
            m20020c(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        /* JADX INFO: renamed from: b */
        public final void mo19112b(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor != null) {
                return;
            }
            m20020c(2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo19111a(ClassDescriptor classDescriptor, ArrayList arrayList);

    /* JADX INFO: renamed from: b */
    void mo19112b(CallableMemberDescriptor callableMemberDescriptor);
}
