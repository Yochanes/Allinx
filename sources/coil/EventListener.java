package coil;

import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m18302d2 = {"Lcoil/EventListener;", "Lcoil/request/ImageRequest$Listener;", "Factory", "Companion", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface EventListener extends ImageRequest.Listener {

    /* JADX INFO: renamed from: a */
    public static final EventListener$Companion$NONE$1 f33272a = new EventListener$Companion$NONE$1();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, m18302d2 = {"Lcoil/EventListener$Companion;", "", "Lcoil/EventListener;", "NONE", "Lcoil/EventListener;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Lcoil/EventListener$Factory;", "", "Companion", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface Factory {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, m18302d2 = {"Lcoil/EventListener$Factory$Companion;", "", "Lcoil/EventListener$Factory;", "NONE", "Lcoil/EventListener$Factory;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
        }
    }

    @Override // coil.request.ImageRequest.Listener
    default void onCancel(ImageRequest imageRequest) {
    }

    @Override // coil.request.ImageRequest.Listener
    default void onStart(ImageRequest imageRequest) {
    }

    @Override // coil.request.ImageRequest.Listener
    default void onError(ImageRequest imageRequest, ErrorResult errorResult) {
    }

    @Override // coil.request.ImageRequest.Listener
    default void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
    }
}
