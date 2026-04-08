package coil.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;
import coil.fetch.Fetcher;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcoil/fetch/BitmapFetcher;", "Lcoil/fetch/Fetcher;", "Factory", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BitmapFetcher implements Fetcher {

    /* JADX INFO: renamed from: a */
    public final Bitmap f33622a;

    /* JADX INFO: renamed from: b */
    public final Options f33623b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lcoil/fetch/BitmapFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/graphics/Bitmap;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Factory implements Fetcher.Factory<Bitmap> {
        @Override // coil.fetch.Fetcher.Factory
        /* JADX INFO: renamed from: a */
        public final Fetcher mo12458a(Object obj, Options options) {
            return new BitmapFetcher((Bitmap) obj, options);
        }
    }

    public BitmapFetcher(Bitmap bitmap, Options options) {
        this.f33622a = bitmap;
        this.f33623b = options;
    }

    @Override // coil.fetch.Fetcher
    /* JADX INFO: renamed from: a */
    public final Object mo12457a(Continuation continuation) {
        return new DrawableResult(new BitmapDrawable(this.f33623b.f33896a.getResources(), this.f33622a), false, DataSource.f33469b);
    }
}
