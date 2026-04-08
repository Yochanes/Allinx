package io.intercom.android.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.animation.AbstractC0455a;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.CustomAttributeValidator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UserAttributes {
    private static final String COMPANIES = "companies";
    private static final String CUSTOM_ATTRIBUTES = "custom_attributes";
    private static final String EMAIL = "email";
    private static final String LANGUAGE_OVERRIDE = "language_override";
    private static final String NAME = "name";
    private static final String PHONE = "phone";
    private static final String SIGNED_UP_AT = "signed_up_at";
    private static final Twig TWIG = LumberMill.getLogger();
    private static final String UNSUBSCRIBED_FROM_EMAILS = "unsubscribed_from_emails";
    private static final String USER_ID = "user_id";
    private final Map<String, Object> attributes;
    private final List<Map<String, Object>> companies;
    private final Map<String, Object> customAttributes;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        final Map<String, Object> attributes = new HashMap();
        final Map<String, Object> customAttributes = new HashMap();
        final List<Map<String, Object>> companies = new ArrayList();

        public UserAttributes build() {
            return new UserAttributes(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Builder.class != obj.getClass()) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (this.attributes.equals(builder.attributes) && this.customAttributes.equals(builder.customAttributes)) {
                return this.companies.equals(builder.companies);
            }
            return false;
        }

        public int hashCode() {
            return this.companies.hashCode() + ((this.customAttributes.hashCode() + (this.attributes.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder{attributes=");
            sb.append(this.attributes);
            sb.append(", customAttributes=");
            sb.append(this.customAttributes);
            sb.append(", companies=");
            return AbstractC0455a.m2242q(sb, this.companies, '}');
        }

        public Builder withCompany(@NonNull Company company) {
            if (company == null) {
                UserAttributes.access$000().m15314w("The company you provided was null", new Object[0]);
                return this;
            }
            this.companies.add(company.getAttributes());
            return this;
        }

        public Builder withCustomAttribute(@NonNull String str, @Nullable Object obj) {
            if (str == null) {
                UserAttributes.access$000().m15314w(AbstractC1610a.m8733k(obj, "The key you provided was null for the attribute "), new Object[0]);
                return this;
            }
            if (CustomAttributeValidator.isValid(obj)) {
                this.customAttributes.put(str, obj);
                return this;
            }
            Twig twigAccess$000 = UserAttributes.access$000();
            StringBuilder sbM23t = AbstractC0000a.m23t("The custom user attribute ", str, " was of type ");
            sbM23t.append(obj.getClass().getSimpleName());
            sbM23t.append(" We only accept the following types: ");
            sbM23t.append(CustomAttributeValidator.getAcceptedTypes());
            twigAccess$000.m15314w(sbM23t.toString(), new Object[0]);
            return this;
        }

        public Builder withCustomAttributes(@NonNull Map<String, ?> map) {
            if (map == null) {
                UserAttributes.access$000().m15314w("The map of attributes you provided was null.", new Object[0]);
                return this;
            }
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (CustomAttributeValidator.isValid(value)) {
                    this.customAttributes.put(entry.getKey(), value);
                } else {
                    UserAttributes.access$000().m15314w("The custom user attribute " + entry.getKey() + " was of type " + value.getClass().getSimpleName() + " We only accept the following types: " + CustomAttributeValidator.getAcceptedTypes(), new Object[0]);
                }
            }
            return this;
        }

        public Builder withEmail(@Nullable String str) {
            this.attributes.put("email", str);
            return this;
        }

        public Builder withLanguageOverride(@Nullable String str) {
            this.attributes.put(UserAttributes.LANGUAGE_OVERRIDE, str);
            return this;
        }

        public Builder withName(@Nullable String str) {
            this.attributes.put("name", str);
            return this;
        }

        public Builder withPhone(@Nullable String str) {
            this.attributes.put("phone", str);
            return this;
        }

        public Builder withSignedUpAt(@Nullable Long l) {
            this.attributes.put(UserAttributes.SIGNED_UP_AT, l);
            return this;
        }

        public Builder withUnsubscribedFromEmails(@Nullable Boolean bool) {
            this.attributes.put(UserAttributes.UNSUBSCRIBED_FROM_EMAILS, bool);
            return this;
        }

        public Builder withUserId(@Nullable String str) {
            this.attributes.put("user_id", str);
            return this;
        }

        public Builder withSignedUpAt(@Nullable Date date) {
            return withSignedUpAt(date == null ? null : Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(date.getTime())));
        }
    }

    public UserAttributes(Builder builder) {
        this.attributes = builder.attributes;
        this.customAttributes = builder.customAttributes;
        this.companies = builder.companies;
    }

    public static /* synthetic */ Twig access$000() {
        return TWIG;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserAttributes userAttributes = (UserAttributes) obj;
        if (this.attributes.equals(userAttributes.attributes) && this.customAttributes.equals(userAttributes.customAttributes)) {
            return this.companies.equals(userAttributes.companies);
        }
        return false;
    }

    public int hashCode() {
        return this.companies.hashCode() + ((this.customAttributes.hashCode() + (this.attributes.hashCode() * 31)) * 31);
    }

    public boolean isEmpty() {
        return this.attributes.isEmpty() && this.customAttributes.isEmpty() && this.companies.isEmpty();
    }

    public Map<String, Object> toMap() {
        if (!this.customAttributes.isEmpty()) {
            this.attributes.put(CUSTOM_ATTRIBUTES, this.customAttributes);
        }
        if (!this.companies.isEmpty()) {
            this.attributes.put(COMPANIES, this.companies);
        }
        return this.attributes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserAttributes{attributes=");
        sb.append(this.attributes);
        sb.append(", customAttributes=");
        sb.append(this.customAttributes);
        sb.append(", companies=");
        return AbstractC0455a.m2242q(sb, this.companies, '}');
    }
}
