package io.ktor.client.request.forms;

import io.ktor.utils.p043io.ByteWriteChannel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@"}, m18302d2 = {"writeTo", "", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.client.request.forms.MultiPartFormDataContent", m18559f = "FormDataContent.kt", m18560l = {109, 110, 111, 114, 117, 120}, m18561m = "writeTo")
final class MultiPartFormDataContent$writeTo$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45515a;

    /* JADX INFO: renamed from: b */
    public int f45516b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MultiPartFormDataContent f45517c;

    /* JADX INFO: renamed from: d */
    public Object f45518d;

    /* JADX INFO: renamed from: f */
    public ByteWriteChannel f45519f;

    /* JADX INFO: renamed from: g */
    public Object f45520g;

    /* JADX INFO: renamed from: i */
    public Iterator f45521i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPartFormDataContent$writeTo$1(MultiPartFormDataContent multiPartFormDataContent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f45517c = multiPartFormDataContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f45515a = obj;
        this.f45516b |= Integer.MIN_VALUE;
        return this.f45517c.mo16929d(null, this);
    }
}
