package io.intercom.android.sdk.utilities;

import android.content.res.Resources;
import io.intercom.android.sdk.C5101R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m18302d2 = {"getErrorStringFromCode", "", "Landroid/content/res/Resources;", "errorCode", "", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AttributeCollectorValidatorKt {
    @NotNull
    public static final String getErrorStringFromCode(@NotNull Resources resources, int i) {
        Intrinsics.m18599g(resources, "<this>");
        switch (i) {
            case 1:
                String string = resources.getString(C5101R.string.intercom_string_is_incorrect);
                Intrinsics.m18598f(string, "getString(...)");
                return string;
            case 2:
                String string2 = resources.getString(C5101R.string.intercom_that_email_address_doesnt_look_quite_right);
                Intrinsics.m18598f(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = resources.getString(C5101R.string.intercom_that_number_doesnt_look_quite_right);
                Intrinsics.m18598f(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = resources.getString(C5101R.string.intercom_that_number_needs_a_prefix);
                Intrinsics.m18598f(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = resources.getString(C5101R.string.intercom_that_number_has_too_many_digits);
                Intrinsics.m18598f(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = resources.getString(C5101R.string.intercom_that_country_code_doesnt_look_quite_right);
                Intrinsics.m18598f(string6, "getString(...)");
                return string6;
            case 7:
                String string7 = resources.getString(C5101R.string.intercom_that_number_is_missing_a_few_digits);
                Intrinsics.m18598f(string7, "getString(...)");
                return string7;
            default:
                return "";
        }
    }
}
