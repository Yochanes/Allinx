package io.intercom.android.sdk.blocks.lib.models;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.models.carousel.Appearance;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class BlockMetadata {
    public static BlockMetadata NULL = new Builder().build();

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        Appearance.Builder appearance;

        @Nullable
        Boolean isFirstObject;

        @Nullable
        Boolean isLastObject;

        public BlockMetadata build() {
            Appearance.Builder builder = this.appearance;
            return BlockMetadata.create(NullSafety.valueOrDefault(this.isFirstObject, false), NullSafety.valueOrDefault(this.isLastObject, false), builder == null ? Appearance.NULL : builder.build());
        }

        public Builder isFirstObject(Boolean bool) {
            this.isFirstObject = bool;
            return this;
        }

        public Builder isLastObject(Boolean bool) {
            this.isLastObject = bool;
            return this;
        }

        public Builder withAppearance(Appearance.Builder builder) {
            this.appearance = builder;
            return this;
        }
    }

    public static BlockMetadata create(boolean z2, boolean z3, Appearance appearance) {
        return new AutoValue_BlockMetadata(z2, z3, appearance);
    }

    public abstract Appearance getAppearance();

    public abstract boolean isFirstObject();

    public abstract boolean isLastObject();

    public boolean isSingleObject() {
        return isFirstObject() && isLastObject();
    }
}
