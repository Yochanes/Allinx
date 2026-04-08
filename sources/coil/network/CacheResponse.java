package coil.network;

import android.graphics.Bitmap;
import coil.util.Utils;
import java.io.EOFException;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Response;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/network/CacheResponse;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class CacheResponse {

    /* JADX INFO: renamed from: a */
    public final Object f33774a;

    /* JADX INFO: renamed from: b */
    public final Object f33775b;

    /* JADX INFO: renamed from: c */
    public final long f33776c;

    /* JADX INFO: renamed from: d */
    public final long f33777d;

    /* JADX INFO: renamed from: e */
    public final boolean f33778e;

    /* JADX INFO: renamed from: f */
    public final Headers f33779f;

    public CacheResponse(RealBufferedSource realBufferedSource) throws EOFException {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f51423c;
        this.f33774a = LazyKt.m18298a(lazyThreadSafetyMode, new C2381a(this, 0));
        this.f33775b = LazyKt.m18298a(lazyThreadSafetyMode, new C2381a(this, 1));
        this.f33776c = Long.parseLong(realBufferedSource.m21691C(Long.MAX_VALUE));
        this.f33777d = Long.parseLong(realBufferedSource.m21691C(Long.MAX_VALUE));
        this.f33778e = Integer.parseInt(realBufferedSource.m21691C(Long.MAX_VALUE)) > 0;
        int i = Integer.parseInt(realBufferedSource.m21691C(Long.MAX_VALUE));
        Headers.Builder builder = new Headers.Builder();
        for (int i2 = 0; i2 < i; i2++) {
            String strM21691C = realBufferedSource.m21691C(Long.MAX_VALUE);
            Bitmap.Config[] configArr = Utils.f33996a;
            int iM20445u = StringsKt.m20445u(strM21691C, ':', 0, 6);
            if (iM20445u == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strM21691C).toString());
            }
            String strSubstring = strM21691C.substring(0, iM20445u);
            Intrinsics.m18598f(strSubstring, "substring(...)");
            String string = StringsKt.m20430b0(strSubstring).toString();
            String strSubstring2 = strM21691C.substring(iM20445u + 1);
            Intrinsics.m18598f(strSubstring2, "substring(...)");
            builder.m21248d(string, strSubstring2);
        }
        this.f33779f = builder.m21249e();
    }

    /* JADX INFO: renamed from: a */
    public final void m12488a(RealBufferedSink realBufferedSink) {
        realBufferedSink.mo21579U0(this.f33776c);
        realBufferedSink.writeByte(10);
        realBufferedSink.mo21579U0(this.f33777d);
        realBufferedSink.writeByte(10);
        realBufferedSink.mo21579U0(this.f33778e ? 1L : 0L);
        realBufferedSink.writeByte(10);
        Headers headers = this.f33779f;
        realBufferedSink.mo21579U0(headers.size());
        realBufferedSink.writeByte(10);
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            realBufferedSink.mo21585Z(headers.m21241e(i));
            realBufferedSink.mo21585Z(": ");
            realBufferedSink.mo21585Z(headers.m21243g(i));
            realBufferedSink.writeByte(10);
        }
    }

    public CacheResponse(Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f51423c;
        this.f33774a = LazyKt.m18298a(lazyThreadSafetyMode, new C2381a(this, 0));
        this.f33775b = LazyKt.m18298a(lazyThreadSafetyMode, new C2381a(this, 1));
        this.f33776c = response.f57239p;
        this.f33777d = response.f57240q;
        this.f33778e = response.f57233f != null;
        this.f33779f = response.f57234g;
    }
}
