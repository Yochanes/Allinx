package io.ktor.http.cio.websocket;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@WebSocketInternalAPI
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R$\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0006R\u001e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0006R\u001e\u0010 \u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0006R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m18302d2 = {"Lio/ktor/http/cio/websocket/FrameParser;", "", "()V", "bodyReady", "", "getBodyReady", "()Z", "<set-?>", "fin", "getFin", "frameType", "Lio/ktor/http/cio/websocket/FrameType;", "getFrameType", "()Lio/ktor/http/cio/websocket/FrameType;", "lastOpcode", "", "", "length", "getLength", "()J", "lengthLength", "mask", "getMask", "maskKey", "getMaskKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "opcode", "rsv1", "getRsv1", "rsv2", "getRsv2", "rsv3", "getRsv3", "state", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/ktor/http/cio/websocket/FrameParser$State;", "kotlin.jvm.PlatformType", "bodyComplete", "", "frame", "bb", "Ljava/nio/ByteBuffer;", "handleStep", "parseHeader1", "parseLength", "parseMaskKey", "State", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class FrameParser {
    private boolean fin;
    private int lastOpcode;
    private long length;
    private int lengthLength;
    private boolean mask;

    @Nullable
    private Integer maskKey;
    private int opcode;
    private boolean rsv1;
    private boolean rsv2;
    private boolean rsv3;
    private final AtomicReference<State> state = new AtomicReference<>(State.HEADER0);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/ktor/http/cio/websocket/FrameParser$State;", "", "(Ljava/lang/String;I)V", "HEADER0", "LENGTH", "MASK_KEY", "BODY", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public enum State {
        HEADER0,
        LENGTH,
        MASK_KEY,
        BODY
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[State.HEADER0.ordinal()] = 1;
            iArr[State.LENGTH.ordinal()] = 2;
            iArr[State.MASK_KEY.ordinal()] = 3;
            iArr[State.BODY.ordinal()] = 4;
        }
    }

    private final boolean handleStep(ByteBuffer bb) {
        State state = this.state.get();
        Intrinsics.m18596d(state);
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return parseHeader1(bb);
        }
        if (i == 2) {
            return parseLength(bb);
        }
        if (i == 3) {
            return parseMaskKey(bb);
        }
        if (i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean parseHeader1(ByteBuffer bb) {
        int i = 0;
        if (bb.remaining() < 2) {
            return false;
        }
        byte b2 = bb.get();
        byte b3 = bb.get();
        this.fin = (b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        this.rsv1 = (b2 & SignedBytes.MAX_POWER_OF_TWO) != 0;
        this.rsv2 = (b2 & 32) != 0;
        this.rsv3 = (b2 & Ascii.DLE) != 0;
        int i2 = b2 & Ascii.f42543SI;
        if (i2 == 0) {
            i2 = this.lastOpcode;
        }
        this.opcode = i2;
        if (!getFrameType().getControlFrame()) {
            this.lastOpcode = this.opcode;
        }
        boolean z2 = (b3 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        this.mask = z2;
        int i3 = b3 & Ascii.DEL;
        if (i3 == 126) {
            i = 2;
        } else if (i3 == 127) {
            i = 8;
        }
        this.lengthLength = i;
        this.length = i == 0 ? i3 : 0L;
        if (i > 0) {
            this.state.set(State.LENGTH);
        } else if (z2) {
            this.state.set(State.MASK_KEY);
        } else {
            this.state.set(State.BODY);
        }
        return true;
    }

    private final boolean parseLength(ByteBuffer bb) {
        long j;
        int iRemaining = bb.remaining();
        int i = this.lengthLength;
        if (iRemaining < i) {
            return false;
        }
        if (i == 2) {
            j = ((long) bb.getShort()) & 65535;
        } else {
            if (i != 8) {
                throw new IllegalStateException();
            }
            j = bb.getLong();
        }
        this.length = j;
        this.state.set(this.mask ? State.MASK_KEY : State.BODY);
        return true;
    }

    private final boolean parseMaskKey(ByteBuffer bb) {
        if (bb.remaining() < 4) {
            return false;
        }
        this.maskKey = Integer.valueOf(bb.getInt());
        this.state.set(State.BODY);
        return true;
    }

    public final void bodyComplete() {
        AtomicReference<State> atomicReference = this.state;
        State state = State.BODY;
        State state2 = State.HEADER0;
        while (!atomicReference.compareAndSet(state, state2)) {
            if (atomicReference.get() != state) {
                throw new IllegalStateException("It should be state BODY but it is " + this.state.get());
            }
        }
        this.opcode = 0;
        this.length = 0L;
        this.lengthLength = 0;
        this.maskKey = null;
    }

    public final void frame(@NotNull ByteBuffer bb) {
        Intrinsics.m18599g(bb, "bb");
        if (Intrinsics.m18594b(bb.order(), ByteOrder.BIG_ENDIAN)) {
            while (handleStep(bb)) {
            }
        } else {
            throw new IllegalArgumentException(("Buffer order should be BIG_ENDIAN but it is " + bb.order()).toString());
        }
    }

    public final boolean getBodyReady() {
        return this.state.get() == State.BODY;
    }

    public final boolean getFin() {
        return this.fin;
    }

    @NotNull
    public final FrameType getFrameType() {
        FrameType frameType = FrameType.INSTANCE.get(this.opcode);
        if (frameType != null) {
            return frameType;
        }
        throw new IllegalStateException("Unsupported opcode " + Integer.toHexString(this.opcode));
    }

    public final long getLength() {
        return this.length;
    }

    public final boolean getMask() {
        return this.mask;
    }

    @Nullable
    public final Integer getMaskKey() {
        return this.maskKey;
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
}
