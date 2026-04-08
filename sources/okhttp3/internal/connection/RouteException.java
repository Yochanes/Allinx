package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class RouteException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final IOException f57455a;

    /* JADX INFO: renamed from: b */
    public IOException f57456b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f57455a = iOException;
        this.f57456b = iOException;
    }
}
