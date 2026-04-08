package kotlinx.coroutines;

import java.lang.Throwable;
import kotlin.Metadata;
import kotlinx.coroutines.CopyableThrowable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0000\bg\u0018\u0000*\u0012\b\u0000\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/CopyableThrowable;", "", "T", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalCoroutinesApi
public interface CopyableThrowable<T extends Throwable & CopyableThrowable<T>> {
    Throwable createCopy();
}
