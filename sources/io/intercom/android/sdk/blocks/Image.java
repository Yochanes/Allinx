package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.widget.ImageView;
import coil.request.ImageRequest;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ResizableImageView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class Image {
    private final StyleType style;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Image$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C51391 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$StyleType;

        static {
            int[] iArr = new int[StyleType.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$StyleType = iArr;
            try {
                iArr[StyleType.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.ADMIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.POST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.ARTICLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CONTAINER_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CHAT_FULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CAROUSEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public Image(StyleType styleType) {
        this.style = styleType;
    }

    private int calculateChatFullPadding(Context context) {
        Resources resources = context.getResources();
        return (int) (ScreenUtils.getScreenDimensions(context).x - (resources.getDimension(C5101R.dimen.intercom_chat_overlay_width) - (((resources.getDimension(C5101R.dimen.intercom_chat_overlay_padding_right) + resources.getDimension(C5101R.dimen.intercom_chat_overlay_text_margin_left)) + resources.getDimension(C5101R.dimen.intercom_chat_overlay_text_padding_left)) + resources.getDimension(C5101R.dimen.intercom_chat_overlay_text_padding_right))));
    }

    private int getTotalViewPadding(Context context) {
        Resources resources = context.getResources();
        switch (C51391.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            case 1:
            case 2:
            case 3:
                float dimension = resources.getDimension(C5101R.dimen.intercom_avatar_size);
                float dimension2 = resources.getDimension(C5101R.dimen.intercom_conversation_row_icon_spacer);
                float dimension3 = resources.getDimension(C5101R.dimen.intercom_conversation_row_margin);
                return (int) ((resources.getDimension(C5101R.dimen.intercom_cell_horizontal_padding) * 3.0f) + dimension + dimension2 + dimension3);
            case 4:
                return ((int) (resources.getDimension(C5101R.dimen.intercom_post_cell_padding) + resources.getDimension(C5101R.dimen.intercom_cell_content_padding))) * 2;
            case 5:
            case 6:
                return ((int) (resources.getDimension(C5101R.dimen.intercom_cell_content_padding) + resources.getDimension(C5101R.dimen.intercom_note_cell_padding) + resources.getDimension(C5101R.dimen.intercom_note_layout_margin))) * 2;
            case 7:
                return ((int) (resources.getDimension(C5101R.dimen.intercom_cell_content_padding) + resources.getDimension(C5101R.dimen.intercom_note_cell_padding) + resources.getDimension(C5101R.dimen.intercom_note_layout_margin))) * 2;
            case 8:
                return calculateChatFullPadding(context);
            case 9:
                return ((int) resources.getDimension(C5101R.dimen.intercom_carousel_padding)) * 2;
            default:
                return 0;
        }
    }

    public StyleType getStyle() {
        return this.style;
    }

    public void setBackground(ImageView imageView) {
        if (this.style == StyleType.CAROUSEL) {
            imageView.setBackgroundResource(C5101R.drawable.intercom_square_image_preview);
        } else {
            imageView.setBackgroundResource(C5101R.drawable.intercom_rounded_image_preview);
        }
    }

    public void setImageViewBounds(int i, int i2, ResizableImageView resizableImageView, ImageRequest.Builder builder) {
        int i3;
        resizableImageView.setTotalViewPadding(getTotalViewPadding(resizableImageView.getContext()));
        resizableImageView.setDisplayImageDimensions(i, i2);
        Point imageDimens = resizableImageView.getImageDimens();
        int i4 = imageDimens.x;
        if (i4 <= 0 || (i3 = imageDimens.y) <= 0) {
            return;
        }
        builder.m12503e(i4, i3);
    }
}
