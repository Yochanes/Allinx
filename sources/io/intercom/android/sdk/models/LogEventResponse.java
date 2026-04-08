package io.intercom.android.sdk.models;

import androidx.annotation.Nullable;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.Carousel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LogEventResponse extends UsersResponse {
    private final Carousel carousel;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends UsersResponse.Builder {

        @Nullable
        Carousel.Builder carousel;

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public /* bridge */ /* synthetic */ BaseResponse build() {
            return build();
        }

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public /* bridge */ /* synthetic */ UsersResponse build() {
            return build();
        }

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public LogEventResponse build() {
            return new LogEventResponse(this);
        }
    }

    public LogEventResponse(Builder builder) {
        super(builder);
        Carousel.Builder builder2 = builder.carousel;
        this.carousel = (builder2 == null ? new Carousel.Builder() : builder2).build();
    }

    public Carousel getCarousel() {
        return this.carousel;
    }
}
