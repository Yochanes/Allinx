package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CheckResult {

    /* JADX INFO: renamed from: a */
    public final boolean f55024a;

    /* JADX INFO: compiled from: Proguard */
    public static final class IllegalFunctionName extends CheckResult {

        /* JADX INFO: renamed from: b */
        public static final IllegalFunctionName f55025b = new IllegalFunctionName(false);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IllegalSignature extends CheckResult {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SuccessCheck extends CheckResult {

        /* JADX INFO: renamed from: b */
        public static final SuccessCheck f55026b = new SuccessCheck(true);
    }

    public CheckResult(boolean z2) {
        this.f55024a = z2;
    }
}
