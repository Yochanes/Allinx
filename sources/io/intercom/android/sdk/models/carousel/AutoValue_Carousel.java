package io.intercom.android.sdk.models.carousel;

import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Carousel extends Carousel {
    private final boolean dismissible;
    private final String instanceId;
    private final List<CarouselScreen> screens;

    public AutoValue_Carousel(List<CarouselScreen> list, boolean z2, String str) {
        if (list == null) {
            throw new NullPointerException("Null screens");
        }
        this.screens = list;
        this.dismissible = z2;
        if (str == null) {
            throw new NullPointerException("Null instanceId");
        }
        this.instanceId = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Carousel) {
            Carousel carousel = (Carousel) obj;
            if (this.screens.equals(carousel.getScreens()) && this.dismissible == carousel.isDismissible() && this.instanceId.equals(carousel.getInstanceId())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.carousel.Carousel
    public String getInstanceId() {
        return this.instanceId;
    }

    @Override // io.intercom.android.sdk.models.carousel.Carousel
    public List<CarouselScreen> getScreens() {
        return this.screens;
    }

    public int hashCode() {
        return ((((this.screens.hashCode() ^ 1000003) * 1000003) ^ (this.dismissible ? 1231 : 1237)) * 1000003) ^ this.instanceId.hashCode();
    }

    @Override // io.intercom.android.sdk.models.carousel.Carousel
    public boolean isDismissible() {
        return this.dismissible;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Carousel{screens=");
        sb.append(this.screens);
        sb.append(", dismissible=");
        sb.append(this.dismissible);
        sb.append(", instanceId=");
        return AbstractC0000a.m19p(sb, this.instanceId, "}");
    }
}
