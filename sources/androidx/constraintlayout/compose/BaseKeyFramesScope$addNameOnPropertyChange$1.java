package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/constraintlayout/compose/BaseKeyFramesScope$addNameOnPropertyChange$1", "Lkotlin/properties/ObservableProperty;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class BaseKeyFramesScope$addNameOnPropertyChange$1 extends ObservableProperty<NamedPropertyOrValue> {
    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        NamedPropertyOrValue namedPropertyOrValue = (NamedPropertyOrValue) obj2;
        kProperty.getName();
        if (namedPropertyOrValue != null) {
            throw null;
        }
    }
}
