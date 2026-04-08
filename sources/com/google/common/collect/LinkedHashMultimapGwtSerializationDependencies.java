package com.google.common.collect;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
abstract class LinkedHashMultimapGwtSerializationDependencies<K, V> extends AbstractSetMultimap<K, V> {
    public LinkedHashMultimapGwtSerializationDependencies(Map<K, Collection<V>> map) {
        super(map);
    }
}
