package androidx.navigation;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/FloatNavType;", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FloatNavType extends NavType<Float> {
    @Override // androidx.navigation.NavType
    public final Object get(Bundle bundle, String str) {
        Intrinsics.m18599g(bundle, "bundle");
        return Float.valueOf(SavedStateReader.m11861c(bundle, str));
    }

    @Override // androidx.navigation.NavType
    public final String getName() {
        return AttributeType.FLOAT;
    }

    @Override // androidx.navigation.NavType
    public final Object parseValue(String value) {
        Intrinsics.m18599g(value, "value");
        return Float.valueOf(Float.parseFloat(value));
    }

    @Override // androidx.navigation.NavType
    public final void put(Bundle bundle, String key, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Intrinsics.m18599g(bundle, "bundle");
        Intrinsics.m18599g(key, "key");
        bundle.putFloat(key, fFloatValue);
    }
}
