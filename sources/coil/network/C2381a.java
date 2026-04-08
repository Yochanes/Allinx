package coil.network;

import com.google.common.net.HttpHeaders;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import okhttp3.CacheControl;
import okhttp3.MediaType;

/* JADX INFO: renamed from: coil.network.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2381a implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CacheResponse f33798b;

    public /* synthetic */ C2381a(CacheResponse cacheResponse, int i) {
        this.f33797a = i;
        this.f33798b = cacheResponse;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CacheResponse cacheResponse = this.f33798b;
        switch (this.f33797a) {
            case 0:
                CacheControl cacheControl = CacheControl.f57013n;
                return CacheControl.Companion.m21186a(cacheResponse.f33779f);
            default:
                String strM21240c = cacheResponse.f33779f.m21240c(HttpHeaders.CONTENT_TYPE);
                if (strM21240c == null) {
                    return null;
                }
                Pattern pattern = MediaType.f57127d;
                return MediaType.Companion.m21284b(strM21240c);
        }
    }
}
