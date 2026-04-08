package io.intercom.android.sdk.models.carousel;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import io.intercom.android.sdk.utilities.NullSafety;
import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class Carousel {
    public static final int ENTITY_TYPE = 44;
    public static final Carousel NULL;
    public static final Builder NULL_BUILDER;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        Boolean dismissible;

        @Nullable
        String instance_id;

        @Nullable
        List<CarouselScreen.Builder> screens;

        public Carousel build() {
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.screens));
            List<CarouselScreen.Builder> list = this.screens;
            if (list != null) {
                for (CarouselScreen.Builder builder : list) {
                    if (builder != null) {
                        arrayList.add(builder.build());
                    }
                }
            }
            return Carousel.create(arrayList, NullSafety.valueOrDefault(this.dismissible, true), NullSafety.valueOrEmpty(this.instance_id));
        }

        public Builder withDismissible(Boolean bool) {
            this.dismissible = bool;
            return this;
        }

        public Builder withInstanceId(String str) {
            this.instance_id = str;
            return this;
        }

        public Builder withScreens(List<CarouselScreen.Builder> list) {
            this.screens = list;
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        NULL_BUILDER = builder;
        NULL = builder.build();
    }

    public static Carousel create(List<CarouselScreen> list, boolean z2, String str) {
        return new AutoValue_Carousel(list, z2, str);
    }

    public abstract String getInstanceId();

    public abstract List<CarouselScreen> getScreens();

    public abstract boolean isDismissible();
}
