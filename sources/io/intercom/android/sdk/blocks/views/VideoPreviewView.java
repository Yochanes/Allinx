package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import org.jetbrains.annotations.NotNull;
import p007I.RunnableC0015a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class VideoPreviewView extends RelativeLayout {
    private static final int PLAY_ARROW_OFFSET_DP = 3;
    private static final int PLAY_BUTTON_DIAMETER_DP = 48;
    private final ProgressBar loadingSpinner;
    private final ImageView playButton;
    private final ImageView thumbnailImageView;

    public VideoPreviewView(@NonNull Context context, Provider<AppConfig> provider, StyleType styleType) {
        super(context);
        BlockUtils.createLayoutParams(this, -2, -2);
        BlockUtils.setDefaultMarginBottom(this);
        ImageView videoImageView = getVideoImageView(context);
        this.thumbnailImageView = videoImageView;
        ImageView playButtonView = getPlayButtonView(context);
        this.playButton = playButtonView;
        ProgressBar loadingSpinner = getLoadingSpinner();
        this.loadingSpinner = loadingSpinner;
        addView(videoImageView);
        addView(playButtonView);
        addView(loadingSpinner);
        int primaryColor = provider.get().getPrimaryColor();
        primaryColor = styleType == StyleType.POST ? ColorUtils.lightenColor(primaryColor) : primaryColor;
        if (ColorUtils.isColorLight(primaryColor)) {
            playButtonView.setColorFilter(context.getColor(C5101R.color.intercom_accessibility_black), PorterDuff.Mode.SRC_ATOP);
        } else {
            playButtonView.setColorFilter(primaryColor, PorterDuff.Mode.SRC_ATOP);
        }
        AccessibilityUtils accessibilityUtils = AccessibilityUtils.INSTANCE;
        accessibilityUtils.removeClickAbilityAnnouncement(this);
        accessibilityUtils.addClickAbilityAnnouncement(playButtonView);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15481a(VideoPreviewView videoPreviewView) {
        videoPreviewView.lambda$showFailedImage$0();
    }

    public static /* synthetic */ ProgressBar access$000(VideoPreviewView videoPreviewView) {
        return videoPreviewView.loadingSpinner;
    }

    public static /* synthetic */ ImageView access$100(VideoPreviewView videoPreviewView) {
        return videoPreviewView.thumbnailImageView;
    }

    public static /* synthetic */ void access$200(VideoPreviewView videoPreviewView) {
        videoPreviewView.updateThumbnailAspectRatio();
    }

    public static /* synthetic */ ImageView access$300(VideoPreviewView videoPreviewView) {
        return videoPreviewView.playButton;
    }

    private ProgressBar getLoadingSpinner() {
        return (ProgressBar) View.inflate(getContext(), C5101R.layout.intercom_progress_bar, null).findViewById(C5101R.id.progressBar);
    }

    private ImageView getPlayButtonView(Context context) {
        int iDpToPx = ScreenUtils.dpToPx(48.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(C5101R.drawable.intercom_play_arrow);
        imageView.setPadding(ScreenUtils.dpToPx(3.0f, context), 0, 0, 0);
        imageView.setBackgroundResource(C5101R.drawable.intercom_solid_circle);
        imageView.setVisibility(8);
        imageView.setId(C5101R.id.intercom_video_thumbnail_play_button);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(imageView);
        return imageView;
    }

    private ImageView getVideoImageView(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setId(C5101R.id.intercom_video_thumbnail);
        return imageView;
    }

    private void lambda$showFailedImage$0() {
        BackgroundUtils.setBackground(this.thumbnailImageView, getContext().getDrawable(C5101R.drawable.intercom_video_thumbnail_fallback));
    }

    private void updateThumbnailAspectRatio() {
        this.thumbnailImageView.getLayoutParams().height = (this.thumbnailImageView.getWidth() * 3) / 4;
    }

    public void displayThumbnail(String str) {
        this.loadingSpinner.setVisibility(0);
        this.thumbnailImageView.setVisibility(4);
        ImageRequest.Builder builder = new ImageRequest.Builder(getContext());
        builder.f33870c = str;
        builder.f33886s = Integer.valueOf(C5101R.drawable.intercom_video_thumbnail_fallback);
        builder.f33887t = null;
        builder.m12501c(C5101R.drawable.intercom_video_thumbnail_fallback);
        builder.m12500b();
        builder.m12504f(this.thumbnailImageView);
        builder.f33872e = new C51941();
        IntercomCoilKt.loadIntercomImage(getContext(), builder.m12499a());
    }

    public ImageView getThumbnailImageView() {
        return this.thumbnailImageView;
    }

    public void showFailedImage() {
        this.thumbnailImageView.post(new RunnableC0015a(this, 27));
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.views.VideoPreviewView$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C51941 implements ImageRequest.Listener {
        public C51941() {
        }

        @Override // coil.request.ImageRequest.Listener
        public void onError(@NonNull ImageRequest imageRequest, @NonNull ErrorResult errorResult) {
            VideoPreviewView.access$000(VideoPreviewView.this).setVisibility(8);
            VideoPreviewView.access$100(VideoPreviewView.this).setVisibility(0);
            VideoPreviewView.access$200(VideoPreviewView.this);
            VideoPreviewView.access$300(VideoPreviewView.this).setVisibility(8);
        }

        @Override // coil.request.ImageRequest.Listener
        public void onSuccess(@NonNull ImageRequest imageRequest, @NonNull SuccessResult successResult) {
            VideoPreviewView.access$000(VideoPreviewView.this).setVisibility(8);
            VideoPreviewView.access$100(VideoPreviewView.this).setVisibility(0);
            VideoPreviewView.access$200(VideoPreviewView.this);
            VideoPreviewView.access$100(VideoPreviewView.this).setColorFilter(VideoPreviewView.access$100(VideoPreviewView.this).getContext().getColor(C5101R.color.intercom_semi_transparent), PorterDuff.Mode.DARKEN);
            VideoPreviewView.access$300(VideoPreviewView.this).setVisibility(0);
        }

        @Override // coil.request.ImageRequest.Listener
        public void onCancel(@NotNull ImageRequest imageRequest) {
        }

        @Override // coil.request.ImageRequest.Listener
        public void onStart(@NotNull ImageRequest imageRequest) {
        }
    }
}
