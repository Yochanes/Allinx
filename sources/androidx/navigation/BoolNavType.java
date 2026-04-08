package androidx.navigation;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/BoolNavType;", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BoolNavType extends NavType<Boolean> {
    @Override // androidx.navigation.NavType
    public final Object get(Bundle bundle, String str) {
        Intrinsics.m18599g(bundle, "bundle");
        if (!bundle.containsKey(str) || SavedStateReader.m11869k(bundle, str)) {
            return null;
        }
        return Boolean.valueOf(SavedStateReader.m11859a(bundle, str));
    }

    @Override // androidx.navigation.NavType
    public final String getName() {
        return AttributeType.BOOLEAN;
    }

    @Override // androidx.navigation.NavType
    public final Object parseValue(String value) {
        boolean z2;
        Intrinsics.m18599g(value, "value");
        if (value.equals("true")) {
            z2 = true;
        } else {
            if (!value.equals("false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // androidx.navigation.NavType
    public final void put(Bundle bundle, String key, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Intrinsics.m18599g(bundle, "bundle");
        Intrinsics.m18599g(key, "key");
        bundle.putBoolean(key, zBooleanValue);
    }
}
