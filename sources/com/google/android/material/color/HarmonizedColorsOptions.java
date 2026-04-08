package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.C3734R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class HarmonizedColorsOptions {

    @AttrRes
    private final int colorAttributeToHarmonizeWith;

    @Nullable
    private final HarmonizedColorAttributes colorAttributes;

    @NonNull
    @ColorRes
    private final int[] colorResourceIds;

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        @Nullable
        private HarmonizedColorAttributes colorAttributes;

        @NonNull
        @ColorRes
        private int[] colorResourceIds = new int[0];

        @AttrRes
        private int colorAttributeToHarmonizeWith = C3734R.attr.colorPrimary;

        public static /* synthetic */ int[] access$000(Builder builder) {
            return builder.colorResourceIds;
        }

        public static /* synthetic */ HarmonizedColorAttributes access$100(Builder builder) {
            return builder.colorAttributes;
        }

        public static /* synthetic */ int access$200(Builder builder) {
            return builder.colorAttributeToHarmonizeWith;
        }

        @NonNull
        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this, null);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributeToHarmonizeWith(@AttrRes int i) {
            this.colorAttributeToHarmonizeWith = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributes(@Nullable HarmonizedColorAttributes harmonizedColorAttributes) {
            this.colorAttributes = harmonizedColorAttributes;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorResourceIds(@NonNull @ColorRes int[] iArr) {
            this.colorResourceIds = iArr;
            return this;
        }
    }

    public /* synthetic */ HarmonizedColorsOptions(Builder builder, C38061 c38061) {
        this(builder);
    }

    @NonNull
    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    @AttrRes
    public int getColorAttributeToHarmonizeWith() {
        return this.colorAttributeToHarmonizeWith;
    }

    @Nullable
    public HarmonizedColorAttributes getColorAttributes() {
        return this.colorAttributes;
    }

    @NonNull
    @ColorRes
    public int[] getColorResourceIds() {
        return this.colorResourceIds;
    }

    @StyleRes
    public int getThemeOverlayResourceId(@StyleRes int i) {
        HarmonizedColorAttributes harmonizedColorAttributes = this.colorAttributes;
        return (harmonizedColorAttributes == null || harmonizedColorAttributes.getThemeOverlay() == 0) ? i : this.colorAttributes.getThemeOverlay();
    }

    private HarmonizedColorsOptions(Builder builder) {
        this.colorResourceIds = Builder.access$000(builder);
        this.colorAttributes = Builder.access$100(builder);
        this.colorAttributeToHarmonizeWith = Builder.access$200(builder);
    }
}
