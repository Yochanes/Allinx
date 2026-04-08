package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoFileBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class VideoFile implements VideoFileBlock {
    private static final int PLAY_ARROW_OFFSET_DP = 3;
    private static final int PLAY_BUTTON_DIAMETER_DP = 36;
    private final Provider<AppConfig> appConfigProvider;
    private final MetricTracker metricTracker;
    private final StyleType style;

    public VideoFile(StyleType styleType, Provider<AppConfig> provider, MetricTracker metricTracker) {
        this.style = styleType;
        this.appConfigProvider = provider;
        this.metricTracker = metricTracker;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15479a(ImageView imageView, WebView webView, String str, View view) {
        lambda$addVideoFile$0(imageView, webView, str, view);
    }

    private ImageView getPlayButtonView(Context context) {
        int iDpToPx = ScreenUtils.dpToPx(36.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(C5101R.drawable.intercom_play_arrow);
        imageView.setPadding(ScreenUtils.dpToPx(3.0f, context), 0, 0, 0);
        imageView.setBackgroundResource(C5101R.drawable.intercom_solid_circle);
        imageView.setVisibility(0);
        imageView.setId(C5101R.id.intercom_video_thumbnail_play_button);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(imageView);
        return imageView;
    }

    private static /* synthetic */ void lambda$addVideoFile$0(ImageView imageView, WebView webView, String str, View view) {
        imageView.setVisibility(8);
        webView.loadUrl(str);
    }

    private View textFallback(String str, ViewGroup viewGroup) {
        ParagraphView paragraphView = new ParagraphView(viewGroup.getContext(), StyleType.ADMIN, BlockAlignment.LEFT, this.appConfigProvider.get());
        paragraphView.setText(HtmlCompat.fromHtml(str));
        return paragraphView;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.VideoFileBlock
    public View addVideoFile(String str, String str2, String str3, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str2)) {
            return textFallback(str, viewGroup);
        }
        RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
        WebView webView = new WebView(viewGroup.getContext());
        BlockUtils.createLayoutParams(webView, -1, 480);
        BlockUtils.setMarginBottom(webView, 16);
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(true);
        webView.loadUrl(str3);
        ImageView playButtonView = getPlayButtonView(viewGroup.getContext());
        playButtonView.setOnClickListener(new ViewOnClickListenerC5151b(playButtonView, webView, str2));
        relativeLayout.addView(webView);
        relativeLayout.addView(playButtonView);
        return relativeLayout;
    }
}
