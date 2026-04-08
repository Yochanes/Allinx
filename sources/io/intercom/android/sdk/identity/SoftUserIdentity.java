package io.intercom.android.sdk.identity;

import android.text.TextUtils;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
abstract class SoftUserIdentity {
    static final SoftUserIdentity NONE = create("", "", "", "", "", "", "", "");

    public static SoftUserIdentity create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new AutoValue_SoftUserIdentity(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public abstract String anonymousId();

    public abstract String email();

    public abstract String encryptedUserId();

    public abstract String fingerprint();

    public abstract String hmac();

    public abstract String intercomId();

    public boolean isPresent() {
        return !equals(NONE);
    }

    public boolean isSameUser(Registration registration) {
        String userId = registration.getUserId();
        String email = registration.getEmail();
        boolean z2 = (TextUtils.isEmpty(userId) && TextUtils.isEmpty(email)) ? false : true;
        if (!TextUtils.isEmpty(userId)) {
            z2 = z2 && userId.equals(userId());
        }
        return !TextUtils.isEmpty(email) ? z2 && email.equals(email()) : z2;
    }

    public abstract String jwt();

    public abstract String userId();
}
