package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/properties/Delegates$vetoable$1", "Lkotlin/properties/ObservableProperty;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 176)
public final class Delegates$vetoable$1 extends ObservableProperty<Object> {
    @Override // kotlin.properties.ObservableProperty
    public final boolean beforeChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.m18599g(property, "property");
        throw null;
    }
}
