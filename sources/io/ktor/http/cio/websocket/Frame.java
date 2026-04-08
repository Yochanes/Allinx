package io.ktor.http.cio.websocket;

import io.intercom.android.sdk.models.AttributeType;
import io.ktor.util.NIOKt;
import io.ktor.utils.p043io.charsets.CharsetJVMKt;
import io.ktor.utils.p043io.core.BytePacketBuilder;
import io.ktor.utils.p043io.core.ByteReadPacket;
import io.ktor.utils.p043io.core.OutputPrimitivesKt;
import io.ktor.utils.p043io.core.PacketJVMKt;
import io.ktor.utils.p043io.core.StringsKt;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.DisposableHandle;
import org.jetbrains.annotations.NotNull;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \"2\u00020\u0001:\u0006 !\"#$%BG\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u0006\u0010\u001d\u001a\u00020\u0000J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017\u0082\u0001\u0005&'()*¨\u0006+"}, m18302d2 = {"Lio/ktor/http/cio/websocket/Frame;", "", "fin", "", "frameType", "Lio/ktor/http/cio/websocket/FrameType;", "data", "", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "rsv1", "rsv2", "rsv3", "(ZLio/ktor/http/cio/websocket/FrameType;[BLkotlinx/coroutines/DisposableHandle;ZZZ)V", "buffer", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", "getData", "()[B", "getDisposableHandle", "()Lkotlinx/coroutines/DisposableHandle;", "getFin", "()Z", "getFrameType", "()Lio/ktor/http/cio/websocket/FrameType;", "getRsv1", "getRsv2", "getRsv3", "copy", "toString", "", "Binary", "Close", "Companion", "Ping", "Pong", "Text", "Lio/ktor/http/cio/websocket/Frame$Binary;", "Lio/ktor/http/cio/websocket/Frame$Text;", "Lio/ktor/http/cio/websocket/Frame$Close;", "Lio/ktor/http/cio/websocket/Frame$Ping;", "Lio/ktor/http/cio/websocket/Frame$Pong;", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class Frame {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] Empty = new byte[0];

    @NotNull
    private final ByteBuffer buffer;

    @NotNull
    private final byte[] data;

    @NotNull
    private final DisposableHandle disposableHandle;
    private final boolean fin;

    @NotNull
    private final FrameType frameType;
    private final boolean rsv1;
    private final boolean rsv2;
    private final boolean rsv3;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m18302d2 = {"Lio/ktor/http/cio/websocket/Frame$Binary;", "Lio/ktor/http/cio/websocket/Frame;", "fin", "", "buffer", "Ljava/nio/ByteBuffer;", "(ZLjava/nio/ByteBuffer;)V", "data", "", "(Z[B)V", "packet", "Lio/ktor/utils/io/core/ByteReadPacket;", "(ZLio/ktor/utils/io/core/ByteReadPacket;)V", "rsv1", "rsv2", "rsv3", "(Z[BZZZ)V", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Binary extends Frame {
        public /* synthetic */ Binary(boolean z2, byte[] bArr, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z2, bArr, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z2, @NotNull byte[] data, boolean z3, boolean z4, boolean z5) {
            super(z2, FrameType.BINARY, data, NonDisposableHandle.INSTANCE, z3, z4, z5, null);
            Intrinsics.m18599g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z2, @NotNull ByteBuffer buffer) {
            this(z2, NIOKt.m17173b(buffer));
            Intrinsics.m18599g(buffer, "buffer");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z2, @NotNull byte[] data) {
            this(z2, data, false, false, false);
            Intrinsics.m18599g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z2, @NotNull ByteReadPacket packet) {
            this(z2, StringsKt.m17509c(packet));
            Intrinsics.m18599g(packet, "packet");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0016¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\r\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m18302d2 = {"Lio/ktor/http/cio/websocket/Frame$Close;", "Lio/ktor/http/cio/websocket/Frame;", "reason", "Lio/ktor/http/cio/websocket/CloseReason;", "(Lio/ktor/http/cio/websocket/CloseReason;)V", "packet", "Lio/ktor/utils/io/core/ByteReadPacket;", "(Lio/ktor/utils/io/core/ByteReadPacket;)V", "()V", "buffer", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", "data", "", "([B)V", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Close extends Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Close(@NotNull byte[] data) {
            super(true, FrameType.CLOSE, data, NonDisposableHandle.INSTANCE, false, false, false, null);
            Intrinsics.m18599g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(@NotNull ByteReadPacket packet) {
            this(StringsKt.m17509c(packet));
            Intrinsics.m18599g(packet, "packet");
        }

        public Close() {
            this(Frame.access$getEmpty$cp());
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(@NotNull ByteBuffer buffer) {
            this(NIOKt.m17173b(buffer));
            Intrinsics.m18599g(buffer, "buffer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Close(@NotNull CloseReason reason) {
            Intrinsics.m18599g(reason, "reason");
            BytePacketBuilder bytePacketBuilderM17503a = PacketJVMKt.m17503a();
            try {
                OutputPrimitivesKt.m17502a(bytePacketBuilderM17503a, reason.getCode());
                StringsKt.m17511e(bytePacketBuilderM17503a, reason.getMessage());
                this(bytePacketBuilderM17503a.m17484L());
            } catch (Throwable th) {
                bytePacketBuilderM17503a.close();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m18302d2 = {"Lio/ktor/http/cio/websocket/Frame$Companion;", "", "()V", "Empty", "", "byType", "Lio/ktor/http/cio/websocket/Frame;", "fin", "", "frameType", "Lio/ktor/http/cio/websocket/FrameType;", "buffer", "Ljava/nio/ByteBuffer;", "data", "rsv1", "rsv2", "rsv3", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[FrameType.values().length];
                $EnumSwitchMapping$0 = iArr;
                FrameType frameType = FrameType.BINARY;
                iArr[frameType.ordinal()] = 1;
                FrameType frameType2 = FrameType.TEXT;
                iArr[frameType2.ordinal()] = 2;
                FrameType frameType3 = FrameType.CLOSE;
                iArr[frameType3.ordinal()] = 3;
                FrameType frameType4 = FrameType.PING;
                iArr[frameType4.ordinal()] = 4;
                FrameType frameType5 = FrameType.PONG;
                iArr[frameType5.ordinal()] = 5;
                int[] iArr2 = new int[FrameType.values().length];
                $EnumSwitchMapping$1 = iArr2;
                iArr2[frameType.ordinal()] = 1;
                iArr2[frameType2.ordinal()] = 2;
                iArr2[frameType3.ordinal()] = 3;
                iArr2[frameType4.ordinal()] = 4;
                iArr2[frameType5.ordinal()] = 5;
            }
        }

        private Companion() {
        }

        @NotNull
        public final Frame byType(boolean fin, @NotNull FrameType frameType, @NotNull byte[] data) {
            Intrinsics.m18599g(frameType, "frameType");
            Intrinsics.m18599g(data, "data");
            int i = WhenMappings.$EnumSwitchMapping$0[frameType.ordinal()];
            if (i == 1) {
                return new Binary(fin, data);
            }
            if (i == 2) {
                return new Text(fin, data);
            }
            if (i == 3) {
                return new Close(data);
            }
            if (i == 4) {
                return new Ping(data);
            }
            if (i == 5) {
                return new Pong(data, NonDisposableHandle.INSTANCE);
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Frame byType(boolean fin, @NotNull FrameType frameType, @NotNull byte[] data, boolean rsv1, boolean rsv2, boolean rsv3) {
            Intrinsics.m18599g(frameType, "frameType");
            Intrinsics.m18599g(data, "data");
            int i = WhenMappings.$EnumSwitchMapping$1[frameType.ordinal()];
            if (i == 1) {
                return new Binary(fin, data, rsv1, rsv2, rsv3);
            }
            if (i == 2) {
                return new Text(fin, data, rsv1, rsv2, rsv3);
            }
            if (i == 3) {
                return new Close(data);
            }
            if (i == 4) {
                return new Ping(data);
            }
            if (i == 5) {
                return new Pong(data, NonDisposableHandle.INSTANCE);
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        public final Frame byType(boolean fin, @NotNull FrameType frameType, @NotNull ByteBuffer buffer) {
            Intrinsics.m18599g(frameType, "frameType");
            Intrinsics.m18599g(buffer, "buffer");
            return byType(fin, frameType, NIOKt.m17173b(buffer));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m18302d2 = {"Lio/ktor/http/cio/websocket/Frame$Ping;", "Lio/ktor/http/cio/websocket/Frame;", "packet", "Lio/ktor/utils/io/core/ByteReadPacket;", "(Lio/ktor/utils/io/core/ByteReadPacket;)V", "buffer", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", "data", "", "([B)V", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Ping extends Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ping(@NotNull byte[] data) {
            super(true, FrameType.PING, data, NonDisposableHandle.INSTANCE, false, false, false, null);
            Intrinsics.m18599g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(@NotNull ByteReadPacket packet) {
            this(StringsKt.m17509c(packet));
            Intrinsics.m18599g(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(@NotNull ByteBuffer buffer) {
            this(NIOKt.m17173b(buffer));
            Intrinsics.m18599g(buffer, "buffer");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m18302d2 = {"Lio/ktor/http/cio/websocket/Frame$Pong;", "Lio/ktor/http/cio/websocket/Frame;", "packet", "Lio/ktor/utils/io/core/ByteReadPacket;", "(Lio/ktor/utils/io/core/ByteReadPacket;)V", "buffer", "Ljava/nio/ByteBuffer;", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "(Ljava/nio/ByteBuffer;Lkotlinx/coroutines/DisposableHandle;)V", "(Ljava/nio/ByteBuffer;)V", "data", "", "([BLkotlinx/coroutines/DisposableHandle;)V", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Pong extends Frame {
        public /* synthetic */ Pong(byte[] bArr, DisposableHandle disposableHandle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, (i & 2) != 0 ? NonDisposableHandle.INSTANCE : disposableHandle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pong(@NotNull byte[] data, @NotNull DisposableHandle disposableHandle) {
            super(true, FrameType.PONG, data, disposableHandle, false, false, false, null);
            Intrinsics.m18599g(data, "data");
            Intrinsics.m18599g(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(@NotNull ByteReadPacket packet) {
            this(StringsKt.m17509c(packet), NonDisposableHandle.INSTANCE);
            Intrinsics.m18599g(packet, "packet");
        }

        public /* synthetic */ Pong(ByteBuffer byteBuffer, DisposableHandle disposableHandle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(byteBuffer, (i & 2) != 0 ? NonDisposableHandle.INSTANCE : disposableHandle);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(@NotNull ByteBuffer buffer, @NotNull DisposableHandle disposableHandle) {
            this(NIOKt.m17173b(buffer), disposableHandle);
            Intrinsics.m18599g(buffer, "buffer");
            Intrinsics.m18599g(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(@NotNull ByteBuffer buffer) {
            this(NIOKt.m17173b(buffer), NonDisposableHandle.INSTANCE);
            Intrinsics.m18599g(buffer, "buffer");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m18302d2 = {"Lio/ktor/http/cio/websocket/Frame$Text;", "Lio/ktor/http/cio/websocket/Frame;", "fin", "", "data", "", "(Z[B)V", AttributeType.TEXT, "", "(Ljava/lang/String;)V", "packet", "Lio/ktor/utils/io/core/ByteReadPacket;", "(ZLio/ktor/utils/io/core/ByteReadPacket;)V", "buffer", "Ljava/nio/ByteBuffer;", "(ZLjava/nio/ByteBuffer;)V", "rsv1", "rsv2", "rsv3", "(Z[BZZZ)V", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Text extends Frame {
        public /* synthetic */ Text(boolean z2, byte[] bArr, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z2, bArr, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(boolean z2, @NotNull byte[] data, boolean z3, boolean z4, boolean z5) {
            super(z2, FrameType.TEXT, data, NonDisposableHandle.INSTANCE, z3, z4, z5, null);
            Intrinsics.m18599g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z2, @NotNull byte[] data) {
            this(z2, data, false, false, false);
            Intrinsics.m18599g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z2, @NotNull ByteReadPacket packet) {
            this(z2, StringsKt.m17509c(packet));
            Intrinsics.m18599g(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z2, @NotNull ByteBuffer buffer) {
            this(z2, NIOKt.m17173b(buffer));
            Intrinsics.m18599g(buffer, "buffer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Text(@NotNull String text) {
            Intrinsics.m18599g(text, "text");
            CharsetEncoder charsetEncoderNewEncoder = Charsets.f55167a.newEncoder();
            Intrinsics.m18598f(charsetEncoderNewEncoder, "charset.newEncoder()");
            this(true, CharsetJVMKt.m17415c(charsetEncoderNewEncoder, text, text.length()));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ Frame(boolean r9, io.ktor.http.cio.websocket.FrameType r10, byte[] r11, kotlinx.coroutines.DisposableHandle r12, boolean r13, boolean r14, boolean r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L6
            io.ktor.http.cio.websocket.NonDisposableHandle r12 = io.ktor.http.cio.websocket.NonDisposableHandle.INSTANCE
        L6:
            r4 = r12
            r12 = r16 & 16
            r0 = 0
            if (r12 == 0) goto Le
            r5 = r0
            goto Lf
        Le:
            r5 = r13
        Lf:
            r12 = r16 & 32
            if (r12 == 0) goto L15
            r6 = r0
            goto L16
        L15:
            r6 = r14
        L16:
            r12 = r16 & 64
            if (r12 == 0) goto L20
            r7 = r0
            r1 = r9
            r2 = r10
            r3 = r11
            r0 = r8
            goto L25
        L20:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
        L25:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.websocket.Frame.<init>(boolean, io.ktor.http.cio.websocket.FrameType, byte[], kotlinx.coroutines.DisposableHandle, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static final /* synthetic */ byte[] access$getEmpty$cp() {
        return Empty;
    }

    @NotNull
    public final Frame copy() {
        Companion companion = INSTANCE;
        boolean z2 = this.fin;
        FrameType frameType = this.frameType;
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.m18598f(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return companion.byType(z2, frameType, bArrCopyOf);
    }

    @NotNull
    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final DisposableHandle getDisposableHandle() {
        return this.disposableHandle;
    }

    public final boolean getFin() {
        return this.fin;
    }

    @NotNull
    public final FrameType getFrameType() {
        return this.frameType;
    }

    public final boolean getRsv1() {
        return this.rsv1;
    }

    public final boolean getRsv2() {
        return this.rsv2;
    }

    public final boolean getRsv3() {
        return this.rsv3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Frame ");
        sb.append(this.frameType);
        sb.append(" (fin=");
        sb.append(this.fin);
        sb.append(", buffer len = ");
        return AbstractC0000a.m17n(sb, this.data.length, ')');
    }

    private Frame(boolean z2, FrameType frameType, byte[] bArr, DisposableHandle disposableHandle, boolean z3, boolean z4, boolean z5) {
        this.fin = z2;
        this.frameType = frameType;
        this.data = bArr;
        this.disposableHandle = disposableHandle;
        this.rsv1 = z3;
        this.rsv2 = z4;
        this.rsv3 = z5;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.m18598f(byteBufferWrap, "ByteBuffer.wrap(data)");
        this.buffer = byteBufferWrap;
    }

    public /* synthetic */ Frame(boolean z2, FrameType frameType, byte[] bArr, DisposableHandle disposableHandle, boolean z3, boolean z4, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, frameType, bArr, disposableHandle, z3, z4, z5);
    }
}
