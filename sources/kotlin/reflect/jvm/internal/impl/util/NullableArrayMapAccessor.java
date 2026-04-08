package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements ReadOnlyProperty<AbstractArrayMapOwner<K, V>, V> {
    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        AbstractArrayMapOwner thisRef = (AbstractArrayMapOwner) obj;
        Intrinsics.m18599g(thisRef, "thisRef");
        Intrinsics.m18599g(property, "property");
        return thisRef.mo20322c().get(this.f55018b);
    }
}
