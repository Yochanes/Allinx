package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m18302d2 = {"getDeviceIdentifier", "", "context", "Landroid/content/Context;", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DeviceIdentifierHolderKt {
    @NotNull
    public static final String getDeviceIdentifier(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        Intrinsics.m18598f(sharedPreferences, "getSharedPreferences(...)");
        String string = sharedPreferences.getString("device_identifier", "");
        if (string != null && !StringsKt.m20448x(string)) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        Intrinsics.m18598f(string2, "toString(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("device_identifier", string2);
        editorEdit.apply();
        return string2;
    }
}
