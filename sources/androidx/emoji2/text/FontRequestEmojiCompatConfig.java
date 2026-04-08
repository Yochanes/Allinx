package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {

    /* JADX INFO: renamed from: d */
    public static final FontProviderHelper f24321d = new FontProviderHelper();

    /* JADX INFO: compiled from: Proguard */
    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class FontProviderHelper {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {

        /* JADX INFO: renamed from: a */
        public final Context f24322a;

        /* JADX INFO: renamed from: b */
        public final FontRequest f24323b;

        /* JADX INFO: renamed from: c */
        public final FontProviderHelper f24324c;

        /* JADX INFO: renamed from: d */
        public final Object f24325d;

        /* JADX INFO: renamed from: e */
        public Handler f24326e;

        /* JADX INFO: renamed from: f */
        public ThreadPoolExecutor f24327f;

        /* JADX INFO: renamed from: g */
        public ThreadPoolExecutor f24328g;

        /* JADX INFO: renamed from: h */
        public EmojiCompat.MetadataRepoLoaderCallback f24329h;

        /* JADX INFO: renamed from: i */
        public ContentObserver f24330i;

        /* JADX INFO: renamed from: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1 */
        /* JADX INFO: compiled from: Proguard */
        class C16361 extends ContentObserver {
            @Override // android.database.ContentObserver
            public final void onChange(boolean z2, Uri uri) {
                throw null;
            }
        }

        public FontRequestMetadataLoader(Context context, FontRequest fontRequest) {
            FontProviderHelper fontProviderHelper = FontRequestEmojiCompatConfig.f24321d;
            this.f24325d = new Object();
            Preconditions.m7698e(context, "Context cannot be null");
            this.f24322a = context.getApplicationContext();
            this.f24323b = fontRequest;
            this.f24324c = fontProviderHelper;
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        /* JADX INFO: renamed from: a */
        public final void mo8796a(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            synchronized (this.f24325d) {
                this.f24329h = metadataRepoLoaderCallback;
            }
            synchronized (this.f24325d) {
                try {
                    if (this.f24329h == null) {
                        return;
                    }
                    if (this.f24327f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1637a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f24328g = threadPoolExecutor;
                        this.f24327f = threadPoolExecutor;
                    }
                    this.f24327f.execute(new RunnableC1639c(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m8805b() {
            synchronized (this.f24325d) {
                try {
                    this.f24329h = null;
                    ContentObserver contentObserver = this.f24330i;
                    if (contentObserver != null) {
                        FontProviderHelper fontProviderHelper = this.f24324c;
                        Context context = this.f24322a;
                        fontProviderHelper.getClass();
                        context.getContentResolver().unregisterContentObserver(contentObserver);
                        this.f24330i = null;
                    }
                    Handler handler = this.f24326e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f24326e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f24328g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f24327f = null;
                    this.f24328g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final FontsContractCompat.FontInfo m8806c() {
            try {
                FontProviderHelper fontProviderHelper = this.f24324c;
                Context context = this.f24322a;
                FontRequest fontRequest = this.f24323b;
                fontProviderHelper.getClass();
                FontsContractCompat.FontFamilyResult fontFamilyResultM7666a = FontsContractCompat.m7666a(context, fontRequest);
                int i = fontFamilyResultM7666a.f23296a;
                if (i != 0) {
                    throw new RuntimeException(AbstractC0000a.m10g(i, "fetchFonts failed (", ")"));
                }
                FontsContractCompat.FontInfo[] fontInfoArr = (FontsContractCompat.FontInfo[]) fontFamilyResultM7666a.f23297b.get(0);
                if (fontInfoArr == null || fontInfoArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return fontInfoArr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class RetryPolicy {
    }
}
