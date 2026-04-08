package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.SubclassOptInRequired;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/CompletableDeferred;", "T", "Lkotlinx/coroutines/Deferred;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SubclassOptInRequired
public interface CompletableDeferred<T> extends Deferred<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: B0 */
    boolean m20545B0(Object obj);

    /* JADX INFO: renamed from: d */
    boolean mo20546d(Throwable th);
}
