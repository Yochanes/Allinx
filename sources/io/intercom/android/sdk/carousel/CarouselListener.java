package io.intercom.android.sdk.carousel;

import io.intercom.android.sdk.models.carousel.ScreenAction;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface CarouselListener {
    void dismissCarousel(String str);

    void openLink(String str);

    void requestPermissions(ScreenAction screenAction);

    void selectNextScreen(String str);

    void skipPermissionScreen();

    void startChat();

    void trackActionButtonTappedStats();
}
