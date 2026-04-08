package io.ktor.http.cio;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/ktor/http/cio/MultipartEvent;", "", "Epilogue", "MultipartPart", "Preamble", "Lio/ktor/http/cio/MultipartEvent$Preamble;", "Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "Lio/ktor/http/cio/MultipartEvent$Epilogue;", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class MultipartEvent {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/cio/MultipartEvent$Epilogue;", "Lio/ktor/http/cio/MultipartEvent;", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Epilogue extends MultipartEvent {
        @Override // io.ktor.http.cio.MultipartEvent
        /* JADX INFO: renamed from: a */
        public final void mo17019a() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "Lio/ktor/http/cio/MultipartEvent;", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class MultipartPart extends MultipartEvent {
        @Override // io.ktor.http.cio.MultipartEvent
        /* JADX INFO: renamed from: a */
        public final void mo17019a() {
            new MultipartEvent$MultipartPart$release$1(this);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/cio/MultipartEvent$Preamble;", "Lio/ktor/http/cio/MultipartEvent;", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Preamble extends MultipartEvent {
        @Override // io.ktor.http.cio.MultipartEvent
        /* JADX INFO: renamed from: a */
        public final void mo17019a() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo17019a();
}
