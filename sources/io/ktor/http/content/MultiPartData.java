package io.ktor.http.content;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/content/MultiPartData;", "", "Empty", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface MultiPartData {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/MultiPartData$Empty;", "Lio/ktor/http/content/MultiPartData;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Empty implements MultiPartData {
        @Override // io.ktor.http.content.MultiPartData
        /* JADX INFO: renamed from: a */
        public final Object mo16997a(ContinuationImpl continuationImpl) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo16997a(ContinuationImpl continuationImpl);
}
