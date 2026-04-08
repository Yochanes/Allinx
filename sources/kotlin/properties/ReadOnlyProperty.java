package kotlin.properties;

import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/properties/ReadOnlyProperty;", "T", "V", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface ReadOnlyProperty<T, V> {
    Object getValue(Object obj, KProperty kProperty);
}
