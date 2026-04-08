package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences-core"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class MutablePreferences extends Preferences {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f23824a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f23825b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.MutablePreferences$toString$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m18302d2 = {"<anonymous>", "", "entry", "", "Landroidx/datastore/preferences/core/Preferences$Key;", ""}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
    final class C15371 extends Lambda implements Function1<Map.Entry<Preferences.Key<?>, Object>, CharSequence> {

        /* JADX INFO: renamed from: a */
        public static final C15371 f23826a = new C15371(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Intrinsics.m18599g(entry, "entry");
            return "  " + ((Preferences.Key) entry.getKey()).f23832a + " = " + entry.getValue();
        }
    }

    public MutablePreferences(LinkedHashMap linkedHashMap, boolean z2) {
        this.f23824a = linkedHashMap;
        this.f23825b = new AtomicBoolean(z2);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    /* JADX INFO: renamed from: a */
    public final Map mo8287a() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f23824a);
        Intrinsics.m18598f(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // androidx.datastore.preferences.core.Preferences
    /* JADX INFO: renamed from: b */
    public final Object mo8288b(Preferences.Key key) {
        Intrinsics.m18599g(key, "key");
        return this.f23824a.get(key);
    }

    /* JADX INFO: renamed from: c */
    public final void m8289c() {
        if (this.f23825b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8290d(Preferences.Key key, Object obj) {
        Intrinsics.m18599g(key, "key");
        m8289c();
        LinkedHashMap linkedHashMap = this.f23824a;
        if (obj == null) {
            m8289c();
            linkedHashMap.remove(key);
        } else {
            if (!(obj instanceof Set)) {
                linkedHashMap.put(key, obj);
                return;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.m18399B0((Iterable) obj));
            Intrinsics.m18598f(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MutablePreferences)) {
            return false;
        }
        return Intrinsics.m18594b(this.f23824a, ((MutablePreferences) obj).f23824a);
    }

    public final int hashCode() {
        return this.f23824a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.m18409J(this.f23824a.entrySet(), ",\n", "{\n", "\n}", C15371.f23826a, 24);
    }

    public /* synthetic */ MutablePreferences(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
