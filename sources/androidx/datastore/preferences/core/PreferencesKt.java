package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"datastore-preferences-core"}, m18303k = 2, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class PreferencesKt {
    /* JADX INFO: renamed from: a */
    public static final Object m8292a(DataStore dataStore, Function2 function2, ContinuationImpl continuationImpl) {
        return dataStore.mo8246a(new PreferencesKt$edit$2(function2, null), continuationImpl);
    }
}
