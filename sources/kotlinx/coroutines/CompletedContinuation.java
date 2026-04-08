package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "R", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final /* data */ class CompletedContinuation<R> {

    /* JADX INFO: renamed from: a */
    public final Object f55270a;

    /* JADX INFO: renamed from: b */
    public final CancelHandler f55271b;

    /* JADX INFO: renamed from: c */
    public final Function3 f55272c;

    /* JADX INFO: renamed from: d */
    public final Object f55273d;

    /* JADX INFO: renamed from: e */
    public final Throwable f55274e;

    public CompletedContinuation(Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th) {
        this.f55270a = obj;
        this.f55271b = cancelHandler;
        this.f55272c = function3;
        this.f55273d = obj2;
        this.f55274e = th;
    }

    /* JADX INFO: renamed from: a */
    public static CompletedContinuation m20551a(CompletedContinuation completedContinuation, CancelHandler cancelHandler, CancellationException cancellationException, int i) {
        Object obj = completedContinuation.f55270a;
        if ((i & 2) != 0) {
            cancelHandler = completedContinuation.f55271b;
        }
        CancelHandler cancelHandler2 = cancelHandler;
        Function3 function3 = completedContinuation.f55272c;
        Object obj2 = completedContinuation.f55273d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = completedContinuation.f55274e;
        }
        completedContinuation.getClass();
        return new CompletedContinuation(obj, cancelHandler2, function3, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
        return Intrinsics.m18594b(this.f55270a, completedContinuation.f55270a) && Intrinsics.m18594b(this.f55271b, completedContinuation.f55271b) && Intrinsics.m18594b(this.f55272c, completedContinuation.f55272c) && Intrinsics.m18594b(this.f55273d, completedContinuation.f55273d) && Intrinsics.m18594b(this.f55274e, completedContinuation.f55274e);
    }

    public final int hashCode() {
        Object obj = this.f55270a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        CancelHandler cancelHandler = this.f55271b;
        int iHashCode2 = (iHashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        Function3 function3 = this.f55272c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.f55273d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f55274e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f55270a + ", cancelHandler=" + this.f55271b + ", onCancellation=" + this.f55272c + ", idempotentResume=" + this.f55273d + ", cancelCause=" + this.f55274e + ')';
    }

    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, Function3 function3, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : cancelHandler, (i & 4) != 0 ? null : function3, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
