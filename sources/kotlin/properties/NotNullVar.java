package kotlin.properties;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/properties/NotNullVar;", "", "T", "Lkotlin/properties/ReadWriteProperty;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class NotNullVar<T> implements ReadWriteProperty<Object, T> {

    /* JADX INFO: renamed from: a */
    public Object f51667a;

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        Intrinsics.m18599g(property, "property");
        Object obj2 = this.f51667a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object obj, KProperty property, Object value) {
        Intrinsics.m18599g(property, "property");
        Intrinsics.m18599g(value, "value");
        this.f51667a = value;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NotNullProperty(");
        if (this.f51667a != null) {
            str = "value=" + this.f51667a;
        } else {
            str = "value not initialized yet";
        }
        return AbstractC0455a.m2241p(sb, str, ')');
    }
}
