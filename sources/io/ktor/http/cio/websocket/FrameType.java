package io.ktor.http.cio.websocket;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m18302d2 = {"Lio/ktor/http/cio/websocket/FrameType;", "", "controlFrame", "", "opcode", "", "(Ljava/lang/String;IZI)V", "getControlFrame", "()Z", "getOpcode", "()I", "TEXT", "BINARY", "CLOSE", "PING", "PONG", "Companion", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum FrameType {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    PONG(true, 10);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final FrameType[] byOpcodeArray;
    private static final int maxOpcode;
    private final boolean controlFrame;
    private final int opcode;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\bH\u0086\u0002R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m18302d2 = {"Lio/ktor/http/cio/websocket/FrameType$Companion;", "", "()V", "byOpcodeArray", "", "Lio/ktor/http/cio/websocket/FrameType;", "[Lio/ktor/http/cio/websocket/FrameType;", "maxOpcode", "", "get", "opcode", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final FrameType get(int opcode) {
            int iAccess$getMaxOpcode$cp = FrameType.access$getMaxOpcode$cp();
            if (opcode >= 0 && iAccess$getMaxOpcode$cp >= opcode) {
                return FrameType.access$getByOpcodeArray$cp()[opcode];
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        FrameType frameType;
        FrameType[] frameTypeArrValues = values();
        if (frameTypeArrValues.length == 0) {
            frameType = null;
        } else {
            frameType = frameTypeArrValues[0];
            int length = frameTypeArrValues.length - 1;
            if (length != 0) {
                int i = frameType.opcode;
                if (1 <= length) {
                    int i2 = 1;
                    while (true) {
                        FrameType frameType2 = frameTypeArrValues[i2];
                        int i3 = frameType2.opcode;
                        if (i < i3) {
                            frameType = frameType2;
                            i = i3;
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        Intrinsics.m18596d(frameType);
        int i4 = frameType.opcode;
        maxOpcode = i4;
        int i5 = i4 + 1;
        FrameType[] frameTypeArr = new FrameType[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            FrameType[] frameTypeArrValues2 = values();
            int length2 = frameTypeArrValues2.length;
            FrameType frameType3 = null;
            int i7 = 0;
            boolean z2 = false;
            while (true) {
                if (i7 >= length2) {
                    if (!z2) {
                        break;
                    }
                } else {
                    FrameType frameType4 = frameTypeArrValues2[i7];
                    if (frameType4.opcode == i6) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        frameType3 = frameType4;
                    }
                    i7++;
                }
            }
            frameType3 = null;
            frameTypeArr[i6] = frameType3;
        }
        byOpcodeArray = frameTypeArr;
    }

    FrameType(boolean z2, int i) {
        this.controlFrame = z2;
        this.opcode = i;
    }

    public static final /* synthetic */ FrameType[] access$getByOpcodeArray$cp() {
        return byOpcodeArray;
    }

    public static final /* synthetic */ int access$getMaxOpcode$cp() {
        return maxOpcode;
    }

    public final boolean getControlFrame() {
        return this.controlFrame;
    }

    public final int getOpcode() {
        return this.opcode;
    }
}
