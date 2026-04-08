package io.intercom.android.sdk.models.carousel;

import io.intercom.android.sdk.models.carousel.Carousel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CarouselResponse extends CarouselResponse {
    private final Carousel.Builder carousel;

    public AutoValue_CarouselResponse(Carousel.Builder builder) {
        if (builder == null) {
            throw new NullPointerException("Null carousel");
        }
        this.carousel = builder;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselResponse
    public Carousel.Builder carousel() {
        return this.carousel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CarouselResponse) {
            return this.carousel.equals(((CarouselResponse) obj).carousel());
        }
        return false;
    }

    public int hashCode() {
        return this.carousel.hashCode() ^ 1000003;
    }

    public String toString() {
        return "CarouselResponse{carousel=" + this.carousel + "}";
    }
}
