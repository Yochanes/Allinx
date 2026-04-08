package coil.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.animation.AbstractC0455a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil.memory.MemoryCache;
import coil.request.Parameters;
import coil.size.Dimension;
import coil.size.DisplaySizeResolver;
import coil.size.Precision;
import coil.size.RealSizeResolver;
import coil.size.RealViewSizeResolver;
import coil.size.Scale;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.ViewSizeResolver;
import coil.target.ImageViewTarget;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transition.CrossfadeTransition;
import coil.transition.Transition;
import coil.util.Collections;
import coil.util.Requests;
import coil.util.Utils;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import okhttp3.Headers;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lcoil/request/ImageRequest;", "", "Listener", "Builder", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ImageRequest {

    /* JADX INFO: renamed from: A */
    public final Parameters f33834A;

    /* JADX INFO: renamed from: B */
    public final Integer f33835B;

    /* JADX INFO: renamed from: C */
    public final Drawable f33836C;

    /* JADX INFO: renamed from: D */
    public final Integer f33837D;

    /* JADX INFO: renamed from: E */
    public final Drawable f33838E;

    /* JADX INFO: renamed from: F */
    public final DefinedRequestOptions f33839F;

    /* JADX INFO: renamed from: G */
    public final DefaultRequestOptions f33840G;

    /* JADX INFO: renamed from: a */
    public final Context f33841a;

    /* JADX INFO: renamed from: b */
    public final Object f33842b;

    /* JADX INFO: renamed from: c */
    public final Target f33843c;

    /* JADX INFO: renamed from: d */
    public final Listener f33844d;

    /* JADX INFO: renamed from: e */
    public final MemoryCache.Key f33845e;

    /* JADX INFO: renamed from: f */
    public final String f33846f;

    /* JADX INFO: renamed from: g */
    public final Bitmap.Config f33847g;

    /* JADX INFO: renamed from: h */
    public final Precision f33848h;

    /* JADX INFO: renamed from: i */
    public final List f33849i;

    /* JADX INFO: renamed from: j */
    public final Transition.Factory f33850j;

    /* JADX INFO: renamed from: k */
    public final Headers f33851k;

    /* JADX INFO: renamed from: l */
    public final Tags f33852l;

    /* JADX INFO: renamed from: m */
    public final boolean f33853m;

    /* JADX INFO: renamed from: n */
    public final boolean f33854n;

    /* JADX INFO: renamed from: o */
    public final boolean f33855o;

    /* JADX INFO: renamed from: p */
    public final boolean f33856p;

    /* JADX INFO: renamed from: q */
    public final CachePolicy f33857q;

    /* JADX INFO: renamed from: r */
    public final CachePolicy f33858r;

    /* JADX INFO: renamed from: s */
    public final CachePolicy f33859s;

    /* JADX INFO: renamed from: t */
    public final CoroutineDispatcher f33860t;

    /* JADX INFO: renamed from: u */
    public final CoroutineDispatcher f33861u;

    /* JADX INFO: renamed from: v */
    public final CoroutineDispatcher f33862v;

    /* JADX INFO: renamed from: w */
    public final CoroutineDispatcher f33863w;

    /* JADX INFO: renamed from: x */
    public final Lifecycle f33864x;

    /* JADX INFO: renamed from: y */
    public final SizeResolver f33865y;

    /* JADX INFO: renamed from: z */
    public final Scale f33866z;

    public ImageRequest(Context context, Object obj, Target target, Listener listener, MemoryCache.Key key, String str, Bitmap.Config config, Precision precision, List list, Transition.Factory factory, Headers headers, Tags tags, boolean z2, boolean z3, boolean z4, boolean z5, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, Parameters parameters, Integer num, Drawable drawable, Integer num2, Drawable drawable2, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions) {
        this.f33841a = context;
        this.f33842b = obj;
        this.f33843c = target;
        this.f33844d = listener;
        this.f33845e = key;
        this.f33846f = str;
        this.f33847g = config;
        this.f33848h = precision;
        this.f33849i = list;
        this.f33850j = factory;
        this.f33851k = headers;
        this.f33852l = tags;
        this.f33853m = z2;
        this.f33854n = z3;
        this.f33855o = z4;
        this.f33856p = z5;
        this.f33857q = cachePolicy;
        this.f33858r = cachePolicy2;
        this.f33859s = cachePolicy3;
        this.f33860t = coroutineDispatcher;
        this.f33861u = coroutineDispatcher2;
        this.f33862v = coroutineDispatcher3;
        this.f33863w = coroutineDispatcher4;
        this.f33864x = lifecycle;
        this.f33865y = sizeResolver;
        this.f33866z = scale;
        this.f33834A = parameters;
        this.f33835B = num;
        this.f33836C = drawable;
        this.f33837D = num2;
        this.f33838E = drawable2;
        this.f33839F = definedRequestOptions;
        this.f33840G = defaultRequestOptions;
    }

    /* JADX INFO: renamed from: a */
    public static Builder m12498a(ImageRequest imageRequest) {
        Context context = imageRequest.f33841a;
        imageRequest.getClass();
        return new Builder(context, imageRequest);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        return Intrinsics.m18594b(this.f33841a, imageRequest.f33841a) && this.f33842b.equals(imageRequest.f33842b) && Intrinsics.m18594b(this.f33843c, imageRequest.f33843c) && Intrinsics.m18594b(this.f33844d, imageRequest.f33844d) && Intrinsics.m18594b(this.f33845e, imageRequest.f33845e) && Intrinsics.m18594b(this.f33846f, imageRequest.f33846f) && this.f33847g == imageRequest.f33847g && this.f33848h == imageRequest.f33848h && Intrinsics.m18594b(this.f33849i, imageRequest.f33849i) && Intrinsics.m18594b(this.f33850j, imageRequest.f33850j) && Intrinsics.m18594b(this.f33851k, imageRequest.f33851k) && Intrinsics.m18594b(this.f33852l, imageRequest.f33852l) && this.f33853m == imageRequest.f33853m && this.f33854n == imageRequest.f33854n && this.f33855o == imageRequest.f33855o && this.f33856p == imageRequest.f33856p && this.f33857q == imageRequest.f33857q && this.f33858r == imageRequest.f33858r && this.f33859s == imageRequest.f33859s && Intrinsics.m18594b(this.f33860t, imageRequest.f33860t) && Intrinsics.m18594b(this.f33861u, imageRequest.f33861u) && Intrinsics.m18594b(this.f33862v, imageRequest.f33862v) && Intrinsics.m18594b(this.f33863w, imageRequest.f33863w) && Intrinsics.m18594b(this.f33835B, imageRequest.f33835B) && Intrinsics.m18594b(this.f33836C, imageRequest.f33836C) && Intrinsics.m18594b(this.f33837D, imageRequest.f33837D) && Intrinsics.m18594b(this.f33838E, imageRequest.f33838E) && Intrinsics.m18594b(this.f33864x, imageRequest.f33864x) && this.f33865y.equals(imageRequest.f33865y) && this.f33866z == imageRequest.f33866z && Intrinsics.m18594b(this.f33834A, imageRequest.f33834A) && this.f33839F.equals(imageRequest.f33839F) && Intrinsics.m18594b(this.f33840G, imageRequest.f33840G);
    }

    public final int hashCode() {
        int iHashCode = (this.f33842b.hashCode() + (this.f33841a.hashCode() * 31)) * 31;
        Target target = this.f33843c;
        int iHashCode2 = (iHashCode + (target != null ? target.hashCode() : 0)) * 31;
        Listener listener = this.f33844d;
        int iHashCode3 = (iHashCode2 + (listener != null ? listener.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.f33845e;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f33846f;
        int iHashCode5 = (this.f33834A.f33912a.hashCode() + ((this.f33866z.hashCode() + ((this.f33865y.hashCode() + ((this.f33864x.hashCode() + ((this.f33863w.hashCode() + ((this.f33862v.hashCode() + ((this.f33861u.hashCode() + ((this.f33860t.hashCode() + ((this.f33859s.hashCode() + ((this.f33858r.hashCode() + ((this.f33857q.hashCode() + AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e((this.f33852l.f33927a.hashCode() + ((((this.f33850j.hashCode() + AbstractC0455a.m2233h(this.f33849i, (this.f33848h.hashCode() + ((this.f33847g.hashCode() + ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 29791, 31)) * 31) + Arrays.hashCode(this.f33851k.f57106a)) * 31)) * 31, 31, this.f33853m), 31, this.f33854n), 31, this.f33855o), 31, this.f33856p)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        Integer num = this.f33835B;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.f33836C;
        int iHashCode7 = (iHashCode6 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.f33837D;
        int iHashCode8 = (iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f33838E;
        return this.f33840G.hashCode() + ((this.f33839F.hashCode() + ((iHashCode8 + (drawable2 != null ? drawable2.hashCode() : 0)) * 29791)) * 31);
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Lcoil/request/ImageRequest$Listener;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface Listener {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class DefaultImpls {
        }

        default void onCancel(ImageRequest imageRequest) {
        }

        default void onStart(ImageRequest imageRequest) {
        }

        default void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        }

        default void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/request/ImageRequest$Builder;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: A */
        public Scale f33867A;

        /* JADX INFO: renamed from: a */
        public final Context f33868a;

        /* JADX INFO: renamed from: b */
        public DefaultRequestOptions f33869b;

        /* JADX INFO: renamed from: c */
        public Object f33870c;

        /* JADX INFO: renamed from: d */
        public Target f33871d;

        /* JADX INFO: renamed from: e */
        public Listener f33872e;

        /* JADX INFO: renamed from: f */
        public MemoryCache.Key f33873f;

        /* JADX INFO: renamed from: g */
        public String f33874g;

        /* JADX INFO: renamed from: h */
        public Precision f33875h;

        /* JADX INFO: renamed from: i */
        public List f33876i;

        /* JADX INFO: renamed from: j */
        public Transition.Factory f33877j;

        /* JADX INFO: renamed from: k */
        public final Headers.Builder f33878k;

        /* JADX INFO: renamed from: l */
        public final LinkedHashMap f33879l;

        /* JADX INFO: renamed from: m */
        public final boolean f33880m;

        /* JADX INFO: renamed from: n */
        public final boolean f33881n;

        /* JADX INFO: renamed from: o */
        public DefaultIoScheduler f33882o;

        /* JADX INFO: renamed from: p */
        public DefaultIoScheduler f33883p;

        /* JADX INFO: renamed from: q */
        public DefaultIoScheduler f33884q;

        /* JADX INFO: renamed from: r */
        public Parameters.Builder f33885r;

        /* JADX INFO: renamed from: s */
        public Integer f33886s;

        /* JADX INFO: renamed from: t */
        public Drawable f33887t;

        /* JADX INFO: renamed from: u */
        public Integer f33888u;

        /* JADX INFO: renamed from: v */
        public Drawable f33889v;

        /* JADX INFO: renamed from: w */
        public SizeResolver f33890w;

        /* JADX INFO: renamed from: x */
        public Scale f33891x;

        /* JADX INFO: renamed from: y */
        public Lifecycle f33892y;

        /* JADX INFO: renamed from: z */
        public SizeResolver f33893z;

        public Builder(Context context) {
            this.f33868a = context;
            this.f33869b = Requests.f33995a;
            this.f33870c = null;
            this.f33871d = null;
            this.f33872e = null;
            this.f33873f = null;
            this.f33874g = null;
            this.f33875h = null;
            this.f33876i = EmptyList.f51496a;
            this.f33877j = null;
            this.f33878k = null;
            this.f33879l = null;
            this.f33880m = true;
            this.f33881n = true;
            this.f33882o = null;
            this.f33883p = null;
            this.f33884q = null;
            this.f33885r = null;
            this.f33886s = null;
            this.f33887t = null;
            this.f33888u = null;
            this.f33889v = null;
            this.f33890w = null;
            this.f33891x = null;
            this.f33892y = null;
            this.f33893z = null;
            this.f33867A = null;
        }

        /* JADX INFO: renamed from: a */
        public final ImageRequest m12499a() {
            boolean z2;
            View viewMo12519b;
            ImageView.ScaleType scaleType;
            Object obj = this.f33870c;
            if (obj == null) {
                obj = NullRequestData.f33894a;
            }
            Object obj2 = obj;
            Target target = this.f33871d;
            Listener listener = this.f33872e;
            MemoryCache.Key key = this.f33873f;
            String str = this.f33874g;
            DefaultRequestOptions defaultRequestOptions = this.f33869b;
            Bitmap.Config config = defaultRequestOptions.f33813g;
            Precision precision = this.f33875h;
            if (precision == null) {
                precision = defaultRequestOptions.f33812f;
            }
            Precision precision2 = precision;
            List list = this.f33876i;
            Transition.Factory factory = this.f33877j;
            if (factory == null) {
                factory = defaultRequestOptions.f33811e;
            }
            Transition.Factory factory2 = factory;
            Headers.Builder builder = this.f33878k;
            Headers headersM21249e = builder != null ? builder.m21249e() : null;
            if (headersM21249e == null) {
                headersM21249e = Utils.f33998c;
            } else {
                Bitmap.Config[] configArr = Utils.f33996a;
            }
            Headers headers = headersM21249e;
            LinkedHashMap linkedHashMap = this.f33879l;
            Tags tags = linkedHashMap != null ? new Tags(Collections.m12526b(linkedHashMap)) : null;
            if (tags == null) {
                tags = Tags.f33926b;
            }
            Tags tags2 = tags;
            DefaultRequestOptions defaultRequestOptions2 = this.f33869b;
            boolean z3 = defaultRequestOptions2.f33814h;
            boolean z4 = defaultRequestOptions2.f33815i;
            CachePolicy cachePolicy = defaultRequestOptions2.f33819m;
            CachePolicy cachePolicy2 = defaultRequestOptions2.f33820n;
            CachePolicy cachePolicy3 = defaultRequestOptions2.f33821o;
            CoroutineDispatcher coroutineDispatcher = defaultRequestOptions2.f33807a;
            CoroutineDispatcher coroutineDispatcher2 = this.f33882o;
            if (coroutineDispatcher2 == null) {
                coroutineDispatcher2 = defaultRequestOptions2.f33808b;
            }
            CoroutineDispatcher coroutineDispatcher3 = coroutineDispatcher2;
            CoroutineDispatcher coroutineDispatcher4 = this.f33883p;
            if (coroutineDispatcher4 == null) {
                coroutineDispatcher4 = defaultRequestOptions2.f33809c;
            }
            CoroutineDispatcher coroutineDispatcher5 = coroutineDispatcher4;
            CoroutineDispatcher coroutineDispatcher6 = this.f33884q;
            if (coroutineDispatcher6 == null) {
                coroutineDispatcher6 = defaultRequestOptions2.f33810d;
            }
            CoroutineDispatcher coroutineDispatcher7 = coroutineDispatcher6;
            Lifecycle lifecycle = this.f33892y;
            Context context = this.f33868a;
            if (lifecycle == null) {
                Target target2 = this.f33871d;
                z2 = z3;
                Object context2 = target2 instanceof ViewTarget ? ((ViewTarget) target2).mo12519b().getContext() : context;
                while (true) {
                    if (context2 instanceof LifecycleOwner) {
                        lifecycle = ((LifecycleOwner) context2).getLifecycle();
                        break;
                    }
                    if (!(context2 instanceof ContextWrapper)) {
                        lifecycle = null;
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (lifecycle == null) {
                    lifecycle = GlobalLifecycle.f33832b;
                }
            } else {
                z2 = z3;
            }
            Lifecycle lifecycle2 = lifecycle;
            SizeResolver displaySizeResolver = this.f33890w;
            if (displaySizeResolver == null && (displaySizeResolver = this.f33893z) == null) {
                Target target3 = this.f33871d;
                if (target3 instanceof ViewTarget) {
                    View viewMo12519b2 = ((ViewTarget) target3).mo12519b();
                    displaySizeResolver = ((viewMo12519b2 instanceof ImageView) && ((scaleType = ((ImageView) viewMo12519b2).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? new RealSizeResolver(Size.f33955c) : new RealViewSizeResolver(viewMo12519b2);
                } else {
                    displaySizeResolver = new DisplaySizeResolver(context);
                }
            }
            SizeResolver sizeResolver = displaySizeResolver;
            Scale scale = this.f33891x;
            if (scale == null && (scale = this.f33867A) == null) {
                SizeResolver sizeResolver2 = this.f33890w;
                ViewSizeResolver viewSizeResolver = sizeResolver2 instanceof ViewSizeResolver ? (ViewSizeResolver) sizeResolver2 : null;
                if (viewSizeResolver == null || (viewMo12519b = viewSizeResolver.getF33950a()) == null) {
                    Target target4 = this.f33871d;
                    ViewTarget viewTarget = target4 instanceof ViewTarget ? (ViewTarget) target4 : null;
                    viewMo12519b = viewTarget != null ? viewTarget.mo12519b() : null;
                }
                if (viewMo12519b instanceof ImageView) {
                    Bitmap.Config[] configArr2 = Utils.f33996a;
                    ImageView.ScaleType scaleType2 = ((ImageView) viewMo12519b).getScaleType();
                    int i = scaleType2 == null ? -1 : Utils.WhenMappings.f33999a[scaleType2.ordinal()];
                    scale = (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.f33952b : Scale.f33951a;
                } else {
                    scale = Scale.f33952b;
                }
            }
            Scale scale2 = scale;
            Parameters.Builder builder2 = this.f33885r;
            Parameters parameters = builder2 != null ? new Parameters(Collections.m12526b(builder2.f33913a)) : null;
            if (parameters == null) {
                parameters = Parameters.f33911b;
            }
            return new ImageRequest(this.f33868a, obj2, target, listener, key, str, config, precision2, list, factory2, headers, tags2, this.f33880m, z2, z4, this.f33881n, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher3, coroutineDispatcher5, coroutineDispatcher7, lifecycle2, sizeResolver, scale2, parameters, this.f33886s, this.f33887t, this.f33888u, this.f33889v, new DefinedRequestOptions(this.f33890w, this.f33891x, this.f33882o, this.f33883p, this.f33884q, this.f33877j, this.f33875h), this.f33869b);
        }

        /* JADX INFO: renamed from: b */
        public final void m12500b() {
            this.f33877j = new CrossfadeTransition.Factory(100);
        }

        /* JADX INFO: renamed from: c */
        public final void m12501c(int i) {
            this.f33888u = Integer.valueOf(i);
            this.f33889v = null;
        }

        /* JADX INFO: renamed from: d */
        public final void m12502d() {
            this.f33892y = null;
            this.f33893z = null;
            this.f33867A = null;
        }

        /* JADX INFO: renamed from: e */
        public final void m12503e(int i, int i2) {
            this.f33890w = new RealSizeResolver(new Size(new Dimension.Pixels(i), new Dimension.Pixels(i2)));
            m12502d();
        }

        /* JADX INFO: renamed from: f */
        public final void m12504f(ImageView imageView) {
            this.f33871d = new ImageViewTarget(imageView);
            m12502d();
        }

        public Builder(Context context, ImageRequest imageRequest) {
            this.f33868a = context;
            this.f33869b = imageRequest.f33840G;
            this.f33870c = imageRequest.f33842b;
            this.f33871d = imageRequest.f33843c;
            this.f33872e = imageRequest.f33844d;
            this.f33873f = imageRequest.f33845e;
            this.f33874g = imageRequest.f33846f;
            DefinedRequestOptions definedRequestOptions = imageRequest.f33839F;
            this.f33875h = definedRequestOptions.f33828g;
            this.f33876i = imageRequest.f33849i;
            this.f33877j = definedRequestOptions.f33827f;
            this.f33878k = imageRequest.f33851k.m21242f();
            this.f33879l = MapsKt.m18492o(imageRequest.f33852l.f33927a);
            this.f33880m = imageRequest.f33853m;
            this.f33881n = imageRequest.f33856p;
            this.f33882o = definedRequestOptions.f33824c;
            this.f33883p = definedRequestOptions.f33825d;
            this.f33884q = definedRequestOptions.f33826e;
            Parameters parameters = imageRequest.f33834A;
            parameters.getClass();
            this.f33885r = new Parameters.Builder(parameters);
            this.f33886s = imageRequest.f33835B;
            this.f33887t = imageRequest.f33836C;
            this.f33888u = imageRequest.f33837D;
            this.f33889v = imageRequest.f33838E;
            this.f33890w = definedRequestOptions.f33822a;
            this.f33891x = definedRequestOptions.f33823b;
            if (imageRequest.f33841a == context) {
                this.f33892y = imageRequest.f33864x;
                this.f33893z = imageRequest.f33865y;
                this.f33867A = imageRequest.f33866z;
            } else {
                this.f33892y = null;
                this.f33893z = null;
                this.f33867A = null;
            }
        }
    }
}
