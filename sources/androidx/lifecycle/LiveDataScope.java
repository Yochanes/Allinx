package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/lifecycle/LiveDataScope;", "T", "", "lifecycle-livedata_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface LiveDataScope<T> {
    Object emit(Object obj, Continuation continuation);
}
