package coil;

import android.content.Context;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.util.ImageLoaderOptions;
import coil.util.Requests;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p002B.C0001a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Lcoil/ImageLoader;", "", "Builder", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface ImageLoader {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/ImageLoader$Builder;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final Context f33273a;

        /* JADX INFO: renamed from: b */
        public DefaultRequestOptions f33274b = Requests.f33995a;

        /* JADX INFO: renamed from: c */
        public ComponentRegistry f33275c = null;

        /* JADX INFO: renamed from: d */
        public final ImageLoaderOptions f33276d = new ImageLoaderOptions();

        public Builder(Context context) {
            this.f33273a = context.getApplicationContext();
        }

        /* JADX INFO: renamed from: a */
        public final RealImageLoader m12382a() {
            ComponentRegistry componentRegistry;
            DefaultRequestOptions defaultRequestOptions = this.f33274b;
            Lazy lazyM18299b = LazyKt.m18299b(new C2365a(this, 0));
            Lazy lazyM18299b2 = LazyKt.m18299b(new C2365a(this, 1));
            Lazy lazyM18299b3 = LazyKt.m18299b(new C0001a(8));
            ComponentRegistry componentRegistry2 = this.f33275c;
            if (componentRegistry2 == null) {
                EmptyList emptyList = EmptyList.f51496a;
                componentRegistry = new ComponentRegistry(emptyList, emptyList, emptyList, emptyList, emptyList);
            } else {
                componentRegistry = componentRegistry2;
            }
            return new RealImageLoader(this.f33273a, defaultRequestOptions, lazyM18299b, lazyM18299b2, lazyM18299b3, componentRegistry, this.f33276d);
        }
    }

    /* JADX INFO: renamed from: a */
    DefaultRequestOptions getF33281b();

    /* JADX INFO: renamed from: b */
    Disposable mo12380b(ImageRequest imageRequest);

    /* JADX INFO: renamed from: c */
    Object mo12381c(ImageRequest imageRequest, SuspendLambda suspendLambda);
}
