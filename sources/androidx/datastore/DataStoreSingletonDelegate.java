package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¨\u0006\u0005"}, m18302d2 = {"Landroidx/datastore/DataStoreSingletonDelegate;", "T", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "datastore_release"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class DataStoreSingletonDelegate<T> implements ReadOnlyProperty<Context, DataStore<T>> {
    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        Context thisRef = (Context) obj;
        Intrinsics.m18599g(thisRef, "thisRef");
        Intrinsics.m18599g(property, "property");
        throw null;
    }
}
