package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Ljava/io/IOException;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class DiskLruCache$Editor$newSink$1$1 extends Lambda implements Function1<IOException, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DiskLruCache f57325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DiskLruCache.Editor f57326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.f57325a = diskLruCache;
        this.f57326b = editor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IOException it = (IOException) obj;
        Intrinsics.m18599g(it, "it");
        DiskLruCache diskLruCache = this.f57325a;
        DiskLruCache.Editor editor = this.f57326b;
        synchronized (diskLruCache) {
            editor.m21363c();
        }
        return Unit.f51459a;
    }
}
