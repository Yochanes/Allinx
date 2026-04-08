package io.ktor.client.call;

import io.ktor.client.HttpClient;
import io.ktor.util.ByteChannelsKt;
import io.ktor.utils.p043io.ByteChannelCtorKt;
import io.ktor.utils.p043io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/call/SavedHttpCall;", "Lio/ktor/client/call/HttpClientCall;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class SavedHttpCall extends HttpClientCall {

    /* JADX INFO: renamed from: j */
    public ByteReadChannel f44922j;

    /* JADX INFO: renamed from: n */
    public final boolean f44923n;

    public SavedHttpCall(HttpClient httpClient) {
        super(httpClient);
        this.f44923n = true;
    }

    @Override // io.ktor.client.call.HttpClientCall
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF44923n() {
        return this.f44923n;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.call.HttpClientCall
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16850f(Continuation continuation) {
        SavedHttpCall$getResponseContent$1 savedHttpCall$getResponseContent$1;
        SavedHttpCall savedHttpCall;
        if (continuation instanceof SavedHttpCall$getResponseContent$1) {
            savedHttpCall$getResponseContent$1 = (SavedHttpCall$getResponseContent$1) continuation;
            int i = savedHttpCall$getResponseContent$1.f44925b;
            if ((i & Integer.MIN_VALUE) != 0) {
                savedHttpCall$getResponseContent$1.f44925b = i - Integer.MIN_VALUE;
            } else {
                savedHttpCall$getResponseContent$1 = new SavedHttpCall$getResponseContent$1(this, (ContinuationImpl) continuation);
            }
        }
        Object objM17164b = savedHttpCall$getResponseContent$1.f44924a;
        Object obj = CoroutineSingletons.f51584a;
        int i2 = savedHttpCall$getResponseContent$1.f44925b;
        if (i2 == 0) {
            ResultKt.m18313b(objM17164b);
            if (this.f44922j == null) {
                this.f44922j = m16849d().mo16859c();
            }
            ByteReadChannel byteReadChannel = this.f44922j;
            Intrinsics.m18596d(byteReadChannel);
            savedHttpCall$getResponseContent$1.f44927d = this;
            savedHttpCall$getResponseContent$1.f44925b = 1;
            objM17164b = ByteChannelsKt.m17164b(byteReadChannel, savedHttpCall$getResponseContent$1);
            if (objM17164b == obj) {
                return obj;
            }
            savedHttpCall = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            savedHttpCall = savedHttpCall$getResponseContent$1.f44927d;
            ResultKt.m18313b(objM17164b);
        }
        byte[] bArr = (byte[]) objM17164b;
        savedHttpCall.f44922j = ByteChannelCtorKt.m17344a(bArr);
        return ByteChannelCtorKt.m17344a(bArr);
    }
}
