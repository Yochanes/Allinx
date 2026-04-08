package com.google.android.material.color;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.color.utilities.QuantizerCelebi;
import com.google.android.material.color.utilities.Score;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class DynamicColorsOptions {
    private static final DynamicColors.Precondition ALWAYS_ALLOW = new C38041();
    private static final DynamicColors.OnAppliedCallback NO_OP_CALLBACK = new C38052();

    @Nullable
    private Integer contentBasedSeedColor;

    @NonNull
    private final DynamicColors.OnAppliedCallback onAppliedCallback;

    @NonNull
    private final DynamicColors.Precondition precondition;

    @StyleRes
    private final int themeOverlay;

    /* JADX INFO: renamed from: com.google.android.material.color.DynamicColorsOptions$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C38041 implements DynamicColors.Precondition {
        @Override // com.google.android.material.color.DynamicColors.Precondition
        public boolean shouldApplyDynamicColors(@NonNull Activity activity, int i) {
            return true;
        }
    }

    public /* synthetic */ DynamicColorsOptions(Builder builder, C38041 c38041) {
        this(builder);
    }

    public static /* synthetic */ DynamicColors.Precondition access$500() {
        return ALWAYS_ALLOW;
    }

    public static /* synthetic */ DynamicColors.OnAppliedCallback access$600() {
        return NO_OP_CALLBACK;
    }

    private static int extractSeedColorFromImage(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return Score.score(QuantizerCelebi.quantize(iArr, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)).get(0).intValue();
    }

    @Nullable
    public Integer getContentBasedSeedColor() {
        return this.contentBasedSeedColor;
    }

    @NonNull
    public DynamicColors.OnAppliedCallback getOnAppliedCallback() {
        return this.onAppliedCallback;
    }

    @NonNull
    public DynamicColors.Precondition getPrecondition() {
        return this.precondition;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        @Nullable
        private Bitmap contentBasedSourceBitmap;

        @Nullable
        private Integer contentBasedSourceColor;

        @StyleRes
        private int themeOverlay;

        @NonNull
        private DynamicColors.Precondition precondition = DynamicColorsOptions.access$500();

        @NonNull
        private DynamicColors.OnAppliedCallback onAppliedCallback = DynamicColorsOptions.access$600();

        public static /* synthetic */ int access$000(Builder builder) {
            return builder.themeOverlay;
        }

        public static /* synthetic */ DynamicColors.Precondition access$100(Builder builder) {
            return builder.precondition;
        }

        public static /* synthetic */ DynamicColors.OnAppliedCallback access$200(Builder builder) {
            return builder.onAppliedCallback;
        }

        public static /* synthetic */ Integer access$300(Builder builder) {
            return builder.contentBasedSourceColor;
        }

        public static /* synthetic */ Bitmap access$400(Builder builder) {
            return builder.contentBasedSourceBitmap;
        }

        @NonNull
        public DynamicColorsOptions build() {
            return new DynamicColorsOptions(this, null);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setContentBasedSource(@NonNull Bitmap bitmap) {
            this.contentBasedSourceBitmap = bitmap;
            this.contentBasedSourceColor = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOnAppliedCallback(@NonNull DynamicColors.OnAppliedCallback onAppliedCallback) {
            this.onAppliedCallback = onAppliedCallback;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPrecondition(@NonNull DynamicColors.Precondition precondition) {
            this.precondition = precondition;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setThemeOverlay(@StyleRes int i) {
            this.themeOverlay = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setContentBasedSource(@ColorInt int i) {
            this.contentBasedSourceBitmap = null;
            this.contentBasedSourceColor = Integer.valueOf(i);
            return this;
        }
    }

    private DynamicColorsOptions(Builder builder) {
        this.themeOverlay = Builder.access$000(builder);
        this.precondition = Builder.access$100(builder);
        this.onAppliedCallback = Builder.access$200(builder);
        if (Builder.access$300(builder) != null) {
            this.contentBasedSeedColor = Builder.access$300(builder);
        } else if (Builder.access$400(builder) != null) {
            this.contentBasedSeedColor = Integer.valueOf(extractSeedColorFromImage(Builder.access$400(builder)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.DynamicColorsOptions$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C38052 implements DynamicColors.OnAppliedCallback {
        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public void onApplied(@NonNull Activity activity) {
        }
    }
}
