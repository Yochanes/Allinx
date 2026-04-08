package io.intercom.android.sdk.identity;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.logger.LumberMill;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Registration {

    @Nullable
    private UserAttributes attributes;
    private final Twig twig = LumberMill.getLogger();
    private String email = "";
    private String userId = "";
    private Validity validity = Validity.NOT_SET;

    /* JADX INFO: compiled from: Proguard */
    public enum Validity {
        NOT_SET,
        INVALID,
        VALID
    }

    public static Registration create() {
        return new Registration();
    }

    private void updateState(boolean z2) {
        Validity validity = this.validity;
        if (validity == Validity.NOT_SET || validity == Validity.VALID) {
            this.validity = z2 ? Validity.VALID : Validity.INVALID;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Registration registration = (Registration) obj;
            if (!this.email.equals(registration.email) || !this.userId.equals(registration.userId)) {
                return false;
            }
            UserAttributes userAttributes = this.attributes;
            UserAttributes userAttributes2 = registration.attributes;
            if (userAttributes != null) {
                return userAttributes.equals(userAttributes2);
            }
            if (userAttributes2 == null) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public UserAttributes getAttributes() {
        return this.attributes;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iM5b = AbstractC0000a.m5b(this.email.hashCode() * 31, 31, this.userId);
        UserAttributes userAttributes = this.attributes;
        return iM5b + (userAttributes != null ? userAttributes.hashCode() : 0);
    }

    public boolean isValidRegistration() {
        return Validity.VALID.equals(this.validity);
    }

    public String toString() {
        return "Registration{email='" + this.email + "', userId='" + this.userId + "', attributes=" + this.attributes + '}';
    }

    public Registration withEmail(@NonNull String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z2 = !zIsEmpty;
        if (zIsEmpty) {
            this.twig.m15305e("Email cannot be null or empty", new Object[0]);
        } else {
            this.email = str;
        }
        updateState(z2);
        return this;
    }

    public Registration withUserAttributes(@NonNull UserAttributes userAttributes) {
        if (userAttributes == null) {
            this.validity = Validity.INVALID;
            this.twig.m15305e("Registration.withUserAttributes method failed: the attributes Map provided is null", new Object[0]);
            return this;
        }
        if (!userAttributes.isEmpty()) {
            this.attributes = userAttributes;
            return this;
        }
        this.validity = Validity.INVALID;
        this.twig.m15305e("Registration.withUserAttributes method failed: the attributes Map provided is empty", new Object[0]);
        return this;
    }

    public Registration withUserId(@NonNull String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z2 = !zIsEmpty;
        if (zIsEmpty) {
            this.twig.m15305e("UserId cannot be null or empty", new Object[0]);
        } else {
            this.userId = str;
        }
        updateState(z2);
        return this;
    }
}
