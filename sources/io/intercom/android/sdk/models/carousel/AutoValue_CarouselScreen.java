package io.intercom.android.sdk.models.carousel;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CarouselScreen extends CarouselScreen {
    private final List<ScreenAction> actions;
    private final String backgroundColor;
    private final List<Block> blocks;

    /* JADX INFO: renamed from: id */
    private final String f44375id;
    private final String textColor;
    private final String verticalAlignment;

    public AutoValue_CarouselScreen(String str, String str2, String str3, List<Block> list, List<ScreenAction> list2, String str4) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f44375id = str;
        if (str2 == null) {
            throw new NullPointerException("Null backgroundColor");
        }
        this.backgroundColor = str2;
        if (str3 == null) {
            throw new NullPointerException("Null textColor");
        }
        this.textColor = str3;
        if (list == null) {
            throw new NullPointerException("Null blocks");
        }
        this.blocks = list;
        if (list2 == null) {
            throw new NullPointerException("Null actions");
        }
        this.actions = list2;
        if (str4 == null) {
            throw new NullPointerException("Null verticalAlignment");
        }
        this.verticalAlignment = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CarouselScreen) {
            CarouselScreen carouselScreen = (CarouselScreen) obj;
            if (this.f44375id.equals(carouselScreen.getId()) && this.backgroundColor.equals(carouselScreen.getBackgroundColor()) && this.textColor.equals(carouselScreen.getTextColor()) && this.blocks.equals(carouselScreen.getBlocks()) && this.actions.equals(carouselScreen.getActions()) && this.verticalAlignment.equals(carouselScreen.getVerticalAlignment())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public List<ScreenAction> getActions() {
        return this.actions;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public String getId() {
        return this.f44375id;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public String getTextColor() {
        return this.textColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselScreen
    public String getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        return ((((((((((this.f44375id.hashCode() ^ 1000003) * 1000003) ^ this.backgroundColor.hashCode()) * 1000003) ^ this.textColor.hashCode()) * 1000003) ^ this.blocks.hashCode()) * 1000003) ^ this.actions.hashCode()) * 1000003) ^ this.verticalAlignment.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CarouselScreen{id=");
        sb.append(this.f44375id);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", blocks=");
        sb.append(this.blocks);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", verticalAlignment=");
        return AbstractC0000a.m19p(sb, this.verticalAlignment, "}");
    }
}
