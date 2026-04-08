package io.intercom.android.sdk.blocks;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntentUtils;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class Video implements VideoBlock {
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;
    private final Twig twig = LumberMill.getLogger();

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C51451 implements Callback {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ String val$thumbnailUrl;
            final /* synthetic */ String val$videoUrl;

            public AnonymousClass1(String str, String str2) {
                this.val$videoUrl = str;
                this.val$thumbnailUrl = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C51451 c51451 = C51451.this;
                Video.this.createThumbnail(c51451.val$previewView, this.val$videoUrl, this.val$thumbnailUrl);
            }
        }

        public C51451(VideoPreviewView videoPreviewView, String str, ImageView imageView) {
            this.val$previewView = videoPreviewView;
            this.val$id = str;
            this.val$videoImageView = imageView;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (!response.m21308d()) {
                this.val$previewView.showFailedImage();
                return;
            }
            this.val$videoImageView.post(new AnonymousClass1("https://fast.wistia.net/embed/iframe/" + this.val$id, Video.access$000(Video.this, response)));
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C51462 implements Callback {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        public C51462(VideoPreviewView videoPreviewView, ImageView imageView, String str) {
            this.val$previewView = videoPreviewView;
            this.val$videoImageView = imageView;
            this.val$id = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m15477a(C51462 c51462, VideoPreviewView videoPreviewView, String str, String str2) {
            c51462.lambda$onResponse$0(videoPreviewView, str, str2);
        }

        private /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String str, String str2) {
            Video.this.createThumbnail(videoPreviewView, AbstractC0000a.m13j("https://player.vimeo.com/video/", str), str2);
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            C51462 c51462;
            if (response.m21308d()) {
                ResponseBody responseBody = response.f57235i;
                try {
                    if (responseBody != null) {
                        try {
                            c51462 = this;
                            try {
                                this.val$videoImageView.post(new RunnableC5150a(c51462, this.val$previewView, this.val$id, new JSONArray(responseBody.m21313g()).getJSONObject(0).getString("thumbnail_large"), 0));
                                responseBody.close();
                            } catch (IOException e) {
                                e = e;
                                Video.access$100(Video.this).internal("ErrorObject", "Couldn't read response body: " + e.getMessage());
                                responseBody.close();
                            } catch (JSONException e2) {
                                e = e2;
                                e.printStackTrace();
                                responseBody.close();
                            }
                        } catch (IOException e3) {
                            e = e3;
                            c51462 = this;
                        } catch (JSONException e4) {
                            e = e4;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            responseBody.close();
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C51473 implements Callback {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        public C51473(VideoPreviewView videoPreviewView, String str, ImageView imageView) {
            this.val$previewView = videoPreviewView;
            this.val$id = str;
            this.val$videoImageView = imageView;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m15478a(C51473 c51473, VideoPreviewView videoPreviewView, String str, String str2) {
            c51473.lambda$onResponse$0(videoPreviewView, str, str2);
        }

        private /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String str, String str2) {
            Video.this.createThumbnail(videoPreviewView, str, str2);
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (!response.m21308d()) {
                this.val$previewView.showFailedImage();
                return;
            }
            this.val$videoImageView.post(new RunnableC5150a(this, this.val$previewView, "https://www.useloom.com/embed/" + this.val$id, Video.access$000(Video.this, response), 1));
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$4 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnClickListenerC51484 implements View.OnClickListener {
        final /* synthetic */ ImageView val$imageView;
        final /* synthetic */ String val$videoUrl;

        public ViewOnClickListenerC51484(String str, ImageView imageView) {
            this.val$videoUrl = str;
            this.val$imageView = imageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.val$videoUrl));
            intent.setFlags(268435456);
            IntentUtils.safelyOpenIntent(this.val$imageView.getContext(), intent);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$5 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C51495 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider;

        static {
            int[] iArr = new int[VideoProvider.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider = iArr;
            try {
                iArr[VideoProvider.WISTIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.YOUTUBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.VIMEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.LOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Video(StyleType styleType, Api api, Provider<AppConfig> provider) {
        this.style = styleType;
        this.api = api;
        this.appConfigProvider = provider;
    }

    public static /* synthetic */ String access$000(Video video, Response response) {
        return video.getThumbnailUrlFromOembedResponse(response);
    }

    public static /* synthetic */ Twig access$100(Video video) {
        return video.twig;
    }

    private void addClickListenerOnThumbnailView(ImageView imageView, String str) {
        if (this.style != StyleType.CHAT_FULL) {
            imageView.setOnClickListener(new ViewOnClickListenerC51484(str, imageView));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getThumbnailUrlFromOembedResponse(Response response) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(response.f57235i.m21313g());
                    response.f57235i.close();
                    jSONObject = jSONObject2;
                } catch (JSONException e) {
                    e.printStackTrace();
                    String strOptString = jSONObject.optString("thumbnail_url");
                    int iIndexOf = strOptString.indexOf("?image_crop_resized");
                    if (iIndexOf > 0) {
                    }
                }
            } catch (IOException e2) {
                this.twig.internal("ErrorObject", "Couldn't read response body: " + e2.getMessage());
                String strOptString2 = jSONObject.optString("thumbnail_url");
                int iIndexOf2 = strOptString2.indexOf("?image_crop_resized");
                if (iIndexOf2 > 0) {
                }
            }
            String strOptString22 = jSONObject.optString("thumbnail_url");
            int iIndexOf22 = strOptString22.indexOf("?image_crop_resized");
            return iIndexOf22 > 0 ? strOptString22.substring(0, iIndexOf22) : strOptString22;
        } finally {
            response.f57235i.close();
        }
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock
    public View addVideo(String str, VideoProvider videoProvider, String str2, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        WebView webView = new WebView(viewGroup.getContext());
        BlockUtils.createLayoutParams(webView, -1, 480);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(VideoUrlUtilKt.getEmbedUrl(videoProvider, str2));
        return webView;
    }

    public void createThumbnail(VideoPreviewView videoPreviewView, String str, String str2) {
        videoPreviewView.displayThumbnail(str2);
        addClickListenerOnThumbnailView(videoPreviewView.getThumbnailImageView(), str);
    }

    @VisibleForTesting
    public void fetchThumbnail(VideoProvider videoProvider, String str, VideoPreviewView videoPreviewView) {
        ImageView thumbnailImageView = videoPreviewView.getThumbnailImageView();
        int i = C51495.$SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[videoProvider.ordinal()];
        if (i == 1) {
            this.api.getVideo(AbstractC0000a.m13j("https://fast.wistia.com/oembed?url=https://home.wistia.com/medias/", str), new C51451(videoPreviewView, str, thumbnailImageView));
            return;
        }
        if (i == 2) {
            createThumbnail(videoPreviewView, AbstractC0000a.m13j("https://www.youtube.com/watch?v=", str), AbstractC0000a.m3D("https://img.youtube.com/vi/", str, "/default.jpg"));
            return;
        }
        if (i == 3) {
            this.api.getVideo(AbstractC0000a.m3D("https://vimeo.com/api/v2/video/", str, ".json"), new C51462(videoPreviewView, thumbnailImageView, str));
        } else {
            if (i != 4) {
                return;
            }
            this.api.getVideo(AbstractC0000a.m13j("https://www.useloom.com/v1/oembed?url=https://www.useloom.com/embed/", str), new C51473(videoPreviewView, str, thumbnailImageView));
        }
    }
}
