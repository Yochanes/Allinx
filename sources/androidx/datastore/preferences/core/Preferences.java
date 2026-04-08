package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/datastore/preferences/core/Preferences;", "", "Key", "Pair", "datastore-preferences-core"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public abstract class Preferences {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/datastore/preferences/core/Preferences$Key;", "T", "", "datastore-preferences-core"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
    public static final class Key<T> {

        /* JADX INFO: renamed from: a */
        public final String f23832a;

        public Key(String name) {
            Intrinsics.m18599g(name, "name");
            this.f23832a = name;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            return Intrinsics.m18594b(this.f23832a, ((Key) obj).f23832a);
        }

        public final int hashCode() {
            return this.f23832a.hashCode();
        }

        /* JADX INFO: renamed from: toString, reason: from getter */
        public final String getF23832a() {
            return this.f23832a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/datastore/preferences/core/Preferences$Pair;", "T", "", "datastore-preferences-core"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
    public static final class Pair<T> {
    }

    /* JADX INFO: renamed from: a */
    public abstract Map mo8287a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo8288b(Key key);
}
