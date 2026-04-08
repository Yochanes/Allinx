package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import androidx.compose.animation.AbstractC0455a;
import coil.size.Scale;
import coil.size.Size;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/request/Options;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Options {

    /* JADX INFO: renamed from: a */
    public final Context f33896a;

    /* JADX INFO: renamed from: b */
    public final Bitmap.Config f33897b;

    /* JADX INFO: renamed from: c */
    public final ColorSpace f33898c;

    /* JADX INFO: renamed from: d */
    public final Size f33899d;

    /* JADX INFO: renamed from: e */
    public final Scale f33900e;

    /* JADX INFO: renamed from: f */
    public final boolean f33901f;

    /* JADX INFO: renamed from: g */
    public final boolean f33902g;

    /* JADX INFO: renamed from: h */
    public final boolean f33903h;

    /* JADX INFO: renamed from: i */
    public final String f33904i;

    /* JADX INFO: renamed from: j */
    public final Headers f33905j;

    /* JADX INFO: renamed from: k */
    public final Tags f33906k;

    /* JADX INFO: renamed from: l */
    public final Parameters f33907l;

    /* JADX INFO: renamed from: m */
    public final CachePolicy f33908m;

    /* JADX INFO: renamed from: n */
    public final CachePolicy f33909n;

    /* JADX INFO: renamed from: o */
    public final CachePolicy f33910o;

    public Options(Context context, Bitmap.Config config, ColorSpace colorSpace, Size size, Scale scale, boolean z2, boolean z3, boolean z4, String str, Headers headers, Tags tags, Parameters parameters, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f33896a = context;
        this.f33897b = config;
        this.f33898c = colorSpace;
        this.f33899d = size;
        this.f33900e = scale;
        this.f33901f = z2;
        this.f33902g = z3;
        this.f33903h = z4;
        this.f33904i = str;
        this.f33905j = headers;
        this.f33906k = tags;
        this.f33907l = parameters;
        this.f33908m = cachePolicy;
        this.f33909n = cachePolicy2;
        this.f33910o = cachePolicy3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        if (Intrinsics.m18594b(this.f33896a, options.f33896a) && this.f33897b == options.f33897b) {
            return (Build.VERSION.SDK_INT < 26 || Intrinsics.m18594b(this.f33898c, options.f33898c)) && Intrinsics.m18594b(this.f33899d, options.f33899d) && this.f33900e == options.f33900e && this.f33901f == options.f33901f && this.f33902g == options.f33902g && this.f33903h == options.f33903h && Intrinsics.m18594b(this.f33904i, options.f33904i) && Intrinsics.m18594b(this.f33905j, options.f33905j) && Intrinsics.m18594b(this.f33906k, options.f33906k) && Intrinsics.m18594b(this.f33907l, options.f33907l) && this.f33908m == options.f33908m && this.f33909n == options.f33909n && this.f33910o == options.f33910o;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f33897b.hashCode() + (this.f33896a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f33898c;
        int iM2230e = AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e((this.f33900e.hashCode() + ((this.f33899d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f33901f), 31, this.f33902g), 31, this.f33903h);
        String str = this.f33904i;
        return this.f33910o.hashCode() + ((this.f33909n.hashCode() + ((this.f33908m.hashCode() + ((this.f33907l.f33912a.hashCode() + ((this.f33906k.f33927a.hashCode() + ((((iM2230e + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f33905j.f57106a)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
