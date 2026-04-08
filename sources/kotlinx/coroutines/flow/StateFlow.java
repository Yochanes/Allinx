package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.SubclassOptInRequired;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/flow/StateFlow;", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SubclassOptInRequired
public interface StateFlow<T> extends SharedFlow<T> {
    Object getValue();
}
