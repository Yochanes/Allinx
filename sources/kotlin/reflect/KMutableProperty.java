package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/reflect/KMutableProperty;", "V", "Lkotlin/reflect/KProperty;", "Setter", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface KMutableProperty<V> extends KProperty<V> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m18302d2 = {"Lkotlin/reflect/KMutableProperty$Setter;", "V", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public interface Setter<V> extends KProperty.Accessor<V>, KFunction<Unit> {
    }

    /* JADX INFO: renamed from: d */
    Setter mo18608d();
}
