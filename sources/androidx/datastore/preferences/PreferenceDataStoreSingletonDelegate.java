package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStore;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, m18302d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences_release"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class PreferenceDataStoreSingletonDelegate implements ReadOnlyProperty<Context, DataStore<Preferences>> {

    /* JADX INFO: renamed from: a */
    public final String f23804a;

    /* JADX INFO: renamed from: b */
    public final ReplaceFileCorruptionHandler f23805b;

    /* JADX INFO: renamed from: c */
    public final Function1 f23806c;

    /* JADX INFO: renamed from: d */
    public final CoroutineScope f23807d;

    /* JADX INFO: renamed from: e */
    public final Object f23808e;

    /* JADX INFO: renamed from: f */
    public volatile PreferenceDataStore f23809f;

    public PreferenceDataStoreSingletonDelegate(String name, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, CoroutineScope coroutineScope) {
        Intrinsics.m18599g(name, "name");
        this.f23804a = name;
        this.f23805b = replaceFileCorruptionHandler;
        this.f23806c = function1;
        this.f23807d = coroutineScope;
        this.f23808e = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        PreferenceDataStore preferenceDataStore;
        Context thisRef = (Context) obj;
        Intrinsics.m18599g(thisRef, "thisRef");
        Intrinsics.m18599g(property, "property");
        PreferenceDataStore preferenceDataStore2 = this.f23809f;
        if (preferenceDataStore2 != null) {
            return preferenceDataStore2;
        }
        synchronized (this.f23808e) {
            try {
                if (this.f23809f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    ReplaceFileCorruptionHandler replaceFileCorruptionHandler = this.f23805b;
                    Function1 function1 = this.f23806c;
                    Intrinsics.m18598f(applicationContext, "applicationContext");
                    this.f23809f = PreferenceDataStoreFactory.m8291a(replaceFileCorruptionHandler, (List) function1.invoke(applicationContext), this.f23807d, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
                }
                preferenceDataStore = this.f23809f;
                Intrinsics.m18596d(preferenceDataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferenceDataStore;
    }
}
