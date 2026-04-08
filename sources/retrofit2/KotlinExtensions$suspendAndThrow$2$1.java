package retrofit2;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "run"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class KotlinExtensions$suspendAndThrow$2$1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Continuation f59327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f59328b;

    public KotlinExtensions$suspendAndThrow$2$1(Throwable th, Continuation continuation) {
        this.f59327a = continuation;
        this.f59328b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IntrinsicsKt.m18556b(this.f59327a).resumeWith(ResultKt.m18312a(this.f59328b));
    }
}
