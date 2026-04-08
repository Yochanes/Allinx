package io.ktor.client.request.forms;

import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.p043io.ByteWriteChannel;
import io.ktor.utils.p043io.ByteWriteChannelKt;
import io.ktor.utils.p043io.core.Input;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/request/forms/MultiPartFormDataContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class MultiPartFormDataContent extends OutgoingContent.WriteChannelContent {
    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a */
    public final Long mo16864a() {
        return null;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b */
    public final ContentType getF45174a() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #2 {all -> 0x0049, blocks: (B:18:0x0045, B:28:0x0079, B:30:0x007f, B:35:0x009a, B:45:0x00bd, B:52:0x00e6, B:53:0x00e9), top: B:73:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[Catch: all -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0049, blocks: (B:18:0x0045, B:28:0x0079, B:30:0x007f, B:35:0x009a, B:45:0x00bd, B:52:0x00e6, B:53:0x00e9), top: B:73:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16929d(ByteWriteChannel byteWriteChannel, Continuation continuation) {
        MultiPartFormDataContent$writeTo$1 multiPartFormDataContent$writeTo$1;
        ?? r7;
        PreparedPart preparedPart;
        ByteWriteChannel byteWriteChannel2;
        Iterator it;
        MultiPartFormDataContent multiPartFormDataContent;
        if (continuation instanceof MultiPartFormDataContent$writeTo$1) {
            multiPartFormDataContent$writeTo$1 = (MultiPartFormDataContent$writeTo$1) continuation;
            int i = multiPartFormDataContent$writeTo$1.f45516b;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiPartFormDataContent$writeTo$1.f45516b = i - Integer.MIN_VALUE;
            } else {
                multiPartFormDataContent$writeTo$1 = new MultiPartFormDataContent$writeTo$1(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = multiPartFormDataContent$writeTo$1.f45515a;
        ?? r1 = CoroutineSingletons.f51584a;
        try {
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            byteWriteChannel = byteWriteChannel2;
        }
        switch (multiPartFormDataContent$writeTo$1.f45516b) {
            case 0:
                ResultKt.m18313b(obj);
                throw null;
            case 1:
                Iterator it2 = multiPartFormDataContent$writeTo$1.f45521i;
                PreparedPart preparedPart2 = (PreparedPart) multiPartFormDataContent$writeTo$1.f45520g;
                ByteWriteChannel byteWriteChannel3 = multiPartFormDataContent$writeTo$1.f45519f;
                MultiPartFormDataContent multiPartFormDataContent2 = (MultiPartFormDataContent) multiPartFormDataContent$writeTo$1.f45518d;
                try {
                    ResultKt.m18313b(obj);
                    preparedPart2.getClass();
                    multiPartFormDataContent$writeTo$1.f45518d = multiPartFormDataContent2;
                    multiPartFormDataContent$writeTo$1.f45519f = byteWriteChannel3;
                    multiPartFormDataContent$writeTo$1.f45520g = preparedPart2;
                    multiPartFormDataContent$writeTo$1.f45521i = it2;
                    multiPartFormDataContent$writeTo$1.f45516b = 2;
                    try {
                        ByteWriteChannelKt.m17381b(byteWriteChannel3, null, multiPartFormDataContent$writeTo$1);
                        throw null;
                    } catch (Throwable th4) {
                        th = th4;
                        byteWriteChannel = byteWriteChannel3;
                        try {
                            byteWriteChannel.mo17293b(th);
                            r7 = byteWriteChannel;
                            return Unit.f51459a;
                        } finally {
                            ByteWriteChannelKt.m17380a(byteWriteChannel);
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                break;
            case 2:
                Iterator it3 = multiPartFormDataContent$writeTo$1.f45521i;
                PreparedPart preparedPart3 = (PreparedPart) multiPartFormDataContent$writeTo$1.f45520g;
                ByteWriteChannel byteWriteChannel4 = multiPartFormDataContent$writeTo$1.f45519f;
                MultiPartFormDataContent multiPartFormDataContent3 = (MultiPartFormDataContent) multiPartFormDataContent$writeTo$1.f45518d;
                ResultKt.m18313b(obj);
                byte[] bArr = FormDataContentKt.f45509a;
                multiPartFormDataContent$writeTo$1.f45518d = multiPartFormDataContent3;
                multiPartFormDataContent$writeTo$1.f45519f = byteWriteChannel4;
                multiPartFormDataContent$writeTo$1.f45520g = preparedPart3;
                multiPartFormDataContent$writeTo$1.f45521i = it3;
                multiPartFormDataContent$writeTo$1.f45516b = 3;
                if (ByteWriteChannelKt.m17381b(byteWriteChannel4, bArr, multiPartFormDataContent$writeTo$1) != r1) {
                    preparedPart = preparedPart3;
                    preparedPart.getClass();
                    throw null;
                }
                return r1;
            case 3:
                preparedPart = (PreparedPart) multiPartFormDataContent$writeTo$1.f45520g;
                ByteWriteChannel byteWriteChannel5 = multiPartFormDataContent$writeTo$1.f45519f;
                ResultKt.m18313b(obj);
                preparedPart.getClass();
                throw null;
            case 4:
                Input input = (Input) multiPartFormDataContent$writeTo$1.f45521i;
                Iterator it4 = (Iterator) multiPartFormDataContent$writeTo$1.f45520g;
                byteWriteChannel2 = multiPartFormDataContent$writeTo$1.f45519f;
                MultiPartFormDataContent multiPartFormDataContent4 = (MultiPartFormDataContent) multiPartFormDataContent$writeTo$1.f45518d;
                try {
                    ResultKt.m18313b(obj);
                    input.close();
                    byte[] bArr2 = FormDataContentKt.f45509a;
                    multiPartFormDataContent$writeTo$1.f45518d = multiPartFormDataContent4;
                    multiPartFormDataContent$writeTo$1.f45519f = byteWriteChannel2;
                    multiPartFormDataContent$writeTo$1.f45520g = it4;
                    multiPartFormDataContent$writeTo$1.f45521i = null;
                    multiPartFormDataContent$writeTo$1.f45516b = 5;
                    if (ByteWriteChannelKt.m17381b(byteWriteChannel2, bArr2, multiPartFormDataContent$writeTo$1) != r1) {
                        it = it4;
                        r1 = byteWriteChannel2;
                        multiPartFormDataContent = multiPartFormDataContent4;
                        try {
                            if (it.hasNext()) {
                                multiPartFormDataContent.getClass();
                                multiPartFormDataContent$writeTo$1.f45518d = r1;
                                multiPartFormDataContent$writeTo$1.f45519f = null;
                                multiPartFormDataContent$writeTo$1.f45520g = null;
                                multiPartFormDataContent$writeTo$1.f45516b = 6;
                                ByteWriteChannelKt.m17381b(r1, null, multiPartFormDataContent$writeTo$1);
                                throw null;
                            }
                            PreparedPart preparedPart4 = (PreparedPart) it.next();
                            multiPartFormDataContent.getClass();
                            multiPartFormDataContent$writeTo$1.f45518d = multiPartFormDataContent;
                            multiPartFormDataContent$writeTo$1.f45519f = r1;
                            multiPartFormDataContent$writeTo$1.f45520g = preparedPart4;
                            multiPartFormDataContent$writeTo$1.f45521i = it;
                            multiPartFormDataContent$writeTo$1.f45516b = 1;
                            ByteWriteChannelKt.m17381b(r1, null, multiPartFormDataContent$writeTo$1);
                            throw null;
                        } catch (Throwable th6) {
                            th = th6;
                            byteWriteChannel = r1;
                            byteWriteChannel.mo17293b(th);
                            r7 = byteWriteChannel;
                            return Unit.f51459a;
                        }
                    }
                    return r1;
                } catch (Throwable th7) {
                    input.close();
                    throw th7;
                }
            case 5:
                it = (Iterator) multiPartFormDataContent$writeTo$1.f45520g;
                ByteWriteChannel byteWriteChannel6 = multiPartFormDataContent$writeTo$1.f45519f;
                multiPartFormDataContent = (MultiPartFormDataContent) multiPartFormDataContent$writeTo$1.f45518d;
                ResultKt.m18313b(obj);
                r1 = byteWriteChannel6;
                if (it.hasNext()) {
                }
                break;
            case 6:
                ByteWriteChannel byteWriteChannel7 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.f45518d;
                ResultKt.m18313b(obj);
                r7 = byteWriteChannel7;
                return Unit.f51459a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
