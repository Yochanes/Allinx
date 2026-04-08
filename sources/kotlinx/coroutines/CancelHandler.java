package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/NotCompleted;", "UserSupplied", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface CancelHandler extends NotCompleted {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/CancelHandler$UserSupplied;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class UserSupplied implements CancelHandler {

        /* JADX INFO: renamed from: a */
        public final Function1 f55260a;

        public UserSupplied(Function1 function1) {
            this.f55260a = function1;
        }

        @Override // kotlinx.coroutines.CancelHandler
        /* JADX INFO: renamed from: d */
        public final void mo20500d(Throwable th) {
            this.f55260a.invoke(th);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.f55260a.getClass().getSimpleName() + '@' + DebugStringsKt.m20565a(this) + ']';
        }
    }

    /* JADX INFO: renamed from: d */
    void mo20500d(Throwable th);
}
