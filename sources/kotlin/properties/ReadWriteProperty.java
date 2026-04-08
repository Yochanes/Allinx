package kotlin.properties;

import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/properties/ReadWriteProperty;", "T", "V", "Lkotlin/properties/ReadOnlyProperty;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface ReadWriteProperty<T, V> extends ReadOnlyProperty<T, V> {
    void setValue(Object obj, KProperty kProperty, Object obj2);
}
