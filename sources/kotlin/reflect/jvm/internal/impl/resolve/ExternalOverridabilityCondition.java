package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ExternalOverridabilityCondition {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Contract {

        /* JADX INFO: renamed from: a */
        public static final Contract f54329a;

        /* JADX INFO: renamed from: b */
        public static final Contract f54330b;

        /* JADX INFO: renamed from: c */
        public static final Contract f54331c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ Contract[] f54332d;

        static {
            Contract contract = new Contract("CONFLICTS_ONLY", 0);
            f54329a = contract;
            Contract contract2 = new Contract("SUCCESS_ONLY", 1);
            f54330b = contract2;
            Contract contract3 = new Contract("BOTH", 2);
            f54331c = contract3;
            f54332d = new Contract[]{contract, contract2, contract3};
        }

        public static Contract valueOf(String str) {
            return (Contract) Enum.valueOf(Contract.class, str);
        }

        public static Contract[] values() {
            return (Contract[]) f54332d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Result {

        /* JADX INFO: renamed from: a */
        public static final Result f54333a;

        /* JADX INFO: renamed from: b */
        public static final Result f54334b;

        /* JADX INFO: renamed from: c */
        public static final Result f54335c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ Result[] f54336d;

        static {
            Result result = new Result("OVERRIDABLE", 0);
            f54333a = result;
            Result result2 = new Result("CONFLICT", 1);
            Result result3 = new Result("INCOMPATIBLE", 2);
            f54334b = result3;
            Result result4 = new Result("UNKNOWN", 3);
            f54335c = result4;
            f54336d = new Result[]{result, result2, result3, result4};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) f54336d.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    Contract mo19186a();

    /* JADX INFO: renamed from: b */
    Result mo19187b(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor);
}
