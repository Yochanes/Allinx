package io.intercom.android.sdk.api;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class UserUpdateRequest {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        Map<String, Object> attributes;
        boolean isNewSession = false;
        boolean isSentFromBackground = true;
        boolean isInternalUpdate = false;

        public UserUpdateRequest build() {
            HashMap map = new HashMap();
            Map<String, Object> map2 = this.attributes;
            if (map2 != null) {
                map.putAll(map2);
            }
            return new AutoValue_UserUpdateRequest(this.isNewSession, this.isSentFromBackground, this.isInternalUpdate, map);
        }

        public Builder isInternalUpdate(boolean z2) {
            this.isInternalUpdate = z2;
            return this;
        }

        public Builder isNewSession(boolean z2) {
            this.isNewSession = z2;
            return this;
        }

        public Builder isSentFromBackground(boolean z2) {
            this.isSentFromBackground = z2;
            return this;
        }

        public Builder withAttributes(@Nullable Map<String, Object> map) {
            this.attributes = map;
            return this;
        }
    }

    public static UserUpdateRequest create(boolean z2, boolean z3, @Nullable Map<String, Object> map, boolean z4) {
        return new Builder().isNewSession(z2).isSentFromBackground(z3).withAttributes(map).isInternalUpdate(z4).build();
    }

    public abstract Map<String, Object> getAttributes();

    public abstract boolean isInternalUpdate();

    public abstract boolean isNewSession();

    public abstract boolean isSentFromBackground();

    public boolean isValidUpdate() {
        return isInternalUpdate() || !getAttributes().isEmpty();
    }

    public static UserUpdateRequest create(boolean z2, boolean z3, boolean z4) {
        return create(z2, z3, null, z4);
    }
}
