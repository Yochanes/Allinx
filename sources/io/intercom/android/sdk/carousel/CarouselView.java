package io.intercom.android.sdk.carousel;

import io.intercom.android.sdk.models.carousel.Carousel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface CarouselView {
    void logEmptyCarouselError();

    void logUserNotRegisteredError();

    void showGenericError();

    void showLoading();

    void showNotFoundError();

    void showSuccess(Carousel carousel);
}
