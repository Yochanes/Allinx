package io.ktor.http.cio.websocket;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.cio.websocket.Frame;
import io.ktor.util.NIOKt;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.p043io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ActorKt;
import kotlinx.coroutines.channels.ActorScope;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u001a.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u001a3\u0010\u0017\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m18302d2 = {"PingerCoroutineName", "Lkotlinx/coroutines/CoroutineName;", "PongerCoroutineName", "encodeOrFail", "", "Ljava/nio/charset/CharsetEncoder;", "buffer", "Ljava/nio/ByteBuffer;", FirebaseAnalytics.Param.CONTENT, "", "pinger", "Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/http/cio/websocket/Frame$Pong;", "Lkotlinx/coroutines/CoroutineScope;", "outgoing", "Lio/ktor/http/cio/websocket/Frame;", "periodMillis", "", "timeoutMillis", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "ponger", "Lio/ktor/http/cio/websocket/Frame$Ping;", "sendPing", "encoder", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/nio/ByteBuffer;Ljava/nio/charset/CharsetEncoder;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-http-cio"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class PingPongKt {
    private static final CoroutineName PongerCoroutineName = new CoroutineName("ws-ponger");
    private static final CoroutineName PingerCoroutineName = new CoroutineName("ws-pinger");

    /* JADX INFO: renamed from: io.ktor.http.cio.websocket.PingPongKt$pinger$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class C59141 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ CompletableJob $actorJob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59141(CompletableJob completableJob) {
            super(1);
            this.$actorJob = completableJob;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f51459a;
        }

        public final void invoke(@Nullable Throwable th) {
            this.$actorJob.mo17054i(null);
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.cio.websocket.PingPongKt$ponger$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ActorScope;", "Lio/ktor/http/cio/websocket/Frame$Ping;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 4, 2})
    @DebugMetadata(m18558c = "io.ktor.http.cio.websocket.PingPongKt$ponger$1", m18559f = "PingPong.kt", m18560l = {147, 37}, m18561m = "invokeSuspend")
    public static final class C59161 extends SuspendLambda implements Function2<ActorScope<Frame.Ping>, Continuation<? super Unit>, Object> {
        final /* synthetic */ SendChannel $outgoing;
        final /* synthetic */ ObjectPool $pool;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59161(ObjectPool objectPool, SendChannel sendChannel, Continuation continuation) {
            super(2, continuation);
            this.$pool = objectPool;
            this.$outgoing = sendChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.m18599g(completion, "completion");
            C59161 c59161 = new C59161(this.$pool, this.$outgoing, completion);
            c59161.L$0 = obj;
            return c59161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((C59161) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
        
            if (r12.mo11415w(r8, r11) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #1 {all -> 0x0023, blocks: (B:7:0x001c, B:18:0x0050, B:22:0x0066, B:24:0x006e, B:14:0x003e, B:17:0x004a), top: B:38:0x0006, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[Catch: ClosedSendChannelException -> 0x00c5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {ClosedSendChannelException -> 0x00c5, blocks: (B:27:0x00bb, B:31:0x00c1, B:32:0x00c4, B:29:0x00bf, B:7:0x001c, B:18:0x0050, B:22:0x0066, B:24:0x006e, B:14:0x003e, B:17:0x004a), top: B:38:0x0006, inners: #0, #1 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b8 -> B:8:0x001f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            ReceiveChannel receiveChannel;
            ChannelIterator it;
            Throwable th;
            C59161 c59161;
            C59161 c591612;
            Throwable th2;
            ChannelIterator channelIterator;
            Object objMo20706a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i = this.label;
            try {
                try {
                } finally {
                }
            } catch (ClosedSendChannelException unused) {
            }
            if (i == 0) {
                ResultKt.m18313b(obj);
                receiveChannel = (ActorScope) this.L$0;
                it = receiveChannel.iterator();
                th = null;
                c59161 = this;
                this.L$0 = c59161;
                this.L$1 = receiveChannel;
                this.L$2 = th;
                this.L$3 = it;
                this.label = 1;
                objMo20706a = it.mo20706a(c59161);
                if (objMo20706a != coroutineSingletons) {
                }
            } else if (i == 1) {
                channelIterator = (ChannelIterator) this.L$3;
                th2 = (Throwable) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                c591612 = (C59161) this.L$0;
                ResultKt.m18313b(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (ChannelIterator) this.L$3;
                th2 = (Throwable) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                c591612 = (C59161) this.L$0;
                ResultKt.m18313b(obj);
                it = channelIterator;
                th = th2;
                c59161 = c591612;
                this.L$0 = c59161;
                this.L$1 = receiveChannel;
                this.L$2 = th;
                this.L$3 = it;
                this.label = 1;
                objMo20706a = it.mo20706a(c59161);
                if (objMo20706a != coroutineSingletons) {
                    return coroutineSingletons;
                }
                Throwable th3 = th;
                channelIterator = it;
                obj = objMo20706a;
                c591612 = c59161;
                th2 = th3;
                if (((Boolean) obj).booleanValue()) {
                    ChannelsKt.m20720a(receiveChannel, th2);
                    return Unit.f51459a;
                }
                ByteBuffer buffer = ((Frame.Ping) channelIterator.next()).getBuffer();
                ObjectPool pool = this.$pool;
                int iRemaining = buffer.remaining();
                Intrinsics.m18599g(pool, "pool");
                ByteBuffer byteBuffer = (ByteBuffer) pool.mo17488G();
                byteBuffer.limit(iRemaining);
                ByteBuffer byteBufferSlice = buffer.slice();
                Intrinsics.m18598f(byteBufferSlice, "this@copy.slice()");
                NIOKt.m17172a(byteBufferSlice, byteBuffer, Integer.MAX_VALUE);
                byteBuffer.flip();
                SendChannel sendChannel = this.$outgoing;
                Frame.Pong pong = new Frame.Pong(byteBuffer, new PingPongKt$ponger$1$invokeSuspend$$inlined$consumeEach$lambda$1(byteBuffer, this));
                this.L$0 = c591612;
                this.L$1 = receiveChannel;
                this.L$2 = th2;
                this.L$3 = channelIterator;
                this.label = 2;
            }
        }
    }

    private static final void encodeOrFail(CharsetEncoder charsetEncoder, ByteBuffer byteBuffer, String str) throws CharacterCodingException {
        CoderResult coderResultEncode = charsetEncoder.encode(CharBuffer.wrap(str), byteBuffer, true);
        if (coderResultEncode.isError()) {
            coderResultEncode.throwException();
        } else if (coderResultEncode.isOverflow()) {
            coderResultEncode.throwException();
        }
    }

    @NotNull
    public static final SendChannel<Frame.Pong> pinger(@NotNull CoroutineScope pinger, @NotNull SendChannel<? super Frame> outgoing, long j, long j2, @NotNull ObjectPool<ByteBuffer> pool) {
        Intrinsics.m18599g(pinger, "$this$pinger");
        Intrinsics.m18599g(outgoing, "outgoing");
        Intrinsics.m18599g(pool, "pool");
        JobImpl jobImplM20598a = JobKt.m20598a();
        SendChannel<Frame.Pong> sendChannelM20660a = ActorKt.m20660a(pinger, CoroutineContext.Element.DefaultImpls.m18553c(jobImplM20598a, PingerCoroutineName), Integer.MAX_VALUE, CoroutineStart.f55282b, new PingPongKt$pinger$result$1(pool, j, j2, outgoing, null), 8);
        CoroutineContext.Element elementMo2464u = pinger.getF44934g().mo2464u(Job.Key.f55324a);
        Intrinsics.m18596d(elementMo2464u);
        ((Job) elementMo2464u).mo17055w0(new C59141(jobImplM20598a));
        return sendChannelM20660a;
    }

    public static SendChannel pinger$default(CoroutineScope coroutineScope, SendChannel sendChannel, long j, long j2, ObjectPool objectPool, int i, Object obj) {
        if ((i & 8) != 0) {
            objectPool = ByteBufferPoolKt.f46495a;
        }
        return pinger(coroutineScope, sendChannel, j, j2, objectPool);
    }

    @NotNull
    public static final SendChannel<Frame.Ping> ponger(@NotNull CoroutineScope ponger, @NotNull SendChannel<? super Frame.Pong> outgoing, @NotNull ObjectPool<ByteBuffer> pool) {
        Intrinsics.m18599g(ponger, "$this$ponger");
        Intrinsics.m18599g(outgoing, "outgoing");
        Intrinsics.m18599g(pool, "pool");
        return ActorKt.m20660a(ponger, PongerCoroutineName, 5, CoroutineStart.f55282b, new C59161(pool, outgoing, null), 8);
    }

    public static SendChannel ponger$default(CoroutineScope coroutineScope, SendChannel sendChannel, ObjectPool objectPool, int i, Object obj) {
        if ((i & 2) != 0) {
            objectPool = ByteBufferPoolKt.f46495a;
        }
        return ponger(coroutineScope, sendChannel, objectPool);
    }

    public static final Object sendPing(SendChannel<? super Frame.Ping> sendChannel, ByteBuffer byteBuffer, CharsetEncoder charsetEncoder, String str, Continuation<? super Unit> continuation) throws CharacterCodingException {
        byteBuffer.clear();
        charsetEncoder.reset();
        encodeOrFail(charsetEncoder, byteBuffer, str);
        byteBuffer.flip();
        Object objMo11415w = sendChannel.mo11415w(new Frame.Ping(byteBuffer), continuation);
        return objMo11415w == CoroutineSingletons.f51584a ? objMo11415w : Unit.f51459a;
    }
}
