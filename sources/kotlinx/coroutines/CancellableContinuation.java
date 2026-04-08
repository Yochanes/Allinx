package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/CancellableContinuation;", "T", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SubclassOptInRequired
public interface CancellableContinuation<T> extends Continuation<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: A */
    void mo20510A(Object obj, Function1 function1);

    /* JADX INFO: renamed from: I */
    void mo20511I(Object obj);

    /* JADX INFO: renamed from: m */
    boolean mo20512m(Throwable th);

    /* JADX INFO: renamed from: s */
    Symbol mo20513s(Object obj, Function3 function3);

    /* JADX INFO: renamed from: y */
    void mo20514y(Object obj, Function3 function3);
}
