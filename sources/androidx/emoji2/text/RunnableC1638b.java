package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: androidx.emoji2.text.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1638b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EmojiCompatInitializer.BackgroundDefaultLoader f24350a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EmojiCompat.MetadataRepoLoaderCallback f24351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ThreadPoolExecutor f24352c;

    public /* synthetic */ RunnableC1638b(EmojiCompatInitializer.BackgroundDefaultLoader backgroundDefaultLoader, EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
        this.f24350a = backgroundDefaultLoader;
        this.f24351b = metadataRepoLoaderCallback;
        this.f24352c = threadPoolExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EmojiCompatInitializer.BackgroundDefaultLoader backgroundDefaultLoader = this.f24350a;
        EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = this.f24351b;
        ThreadPoolExecutor threadPoolExecutor = this.f24352c;
        backgroundDefaultLoader.getClass();
        try {
            FontRequestEmojiCompatConfig fontRequestEmojiCompatConfigM8778a = DefaultEmojiCompatConfig.m8778a(backgroundDefaultLoader.f24299a);
            if (fontRequestEmojiCompatConfigM8778a == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = (FontRequestEmojiCompatConfig.FontRequestMetadataLoader) fontRequestEmojiCompatConfigM8778a.f24293a;
            synchronized (fontRequestMetadataLoader.f24325d) {
                fontRequestMetadataLoader.f24327f = threadPoolExecutor;
            }
            fontRequestEmojiCompatConfigM8778a.f24293a.mo8796a(new EmojiCompatInitializer.BackgroundDefaultLoader.C16351(metadataRepoLoaderCallback, threadPoolExecutor));
        } catch (Throwable th) {
            metadataRepoLoaderCallback.mo8794a(th);
            threadPoolExecutor.shutdown();
        }
    }
}
