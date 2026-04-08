package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import androidx.os.SavedStateReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"androidx/navigation/serialization/InternalNavType$DoubleType$1", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class InternalNavType$DoubleType$1 extends NavType<Double> {
    @Override // androidx.navigation.NavType
    public final Object get(Bundle bundle, String str) {
        Intrinsics.m18599g(bundle, "bundle");
        return Double.valueOf(SavedStateReader.m11860b(bundle, str));
    }

    @Override // androidx.navigation.NavType
    public final String getName() {
        return "double";
    }

    @Override // androidx.navigation.NavType
    public final Object parseValue(String value) {
        Intrinsics.m18599g(value, "value");
        return Double.valueOf(Double.parseDouble(value));
    }

    @Override // androidx.navigation.NavType
    public final void put(Bundle bundle, String key, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        Intrinsics.m18599g(bundle, "bundle");
        Intrinsics.m18599g(key, "key");
        bundle.putDouble(key, dDoubleValue);
    }
}
