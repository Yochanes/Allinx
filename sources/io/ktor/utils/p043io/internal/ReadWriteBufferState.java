package io.ktor.utils.p043io.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m18302d2 = {"Lio/ktor/utils/io/internal/ReadWriteBufferState;", "", "IdleEmpty", "IdleNonEmpty", "Initial", "Reading", "ReadingWriting", "Terminated", "Writing", "Lio/ktor/utils/io/internal/ReadWriteBufferState$IdleEmpty;", "Lio/ktor/utils/io/internal/ReadWriteBufferState$Initial;", "Lio/ktor/utils/io/internal/ReadWriteBufferState$IdleNonEmpty;", "Lio/ktor/utils/io/internal/ReadWriteBufferState$Reading;", "Lio/ktor/utils/io/internal/ReadWriteBufferState$Writing;", "Lio/ktor/utils/io/internal/ReadWriteBufferState$ReadingWriting;", "Lio/ktor/utils/io/internal/ReadWriteBufferState$Terminated;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class ReadWriteBufferState {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f47409a;

    /* JADX INFO: renamed from: b */
    public final RingBufferCapacity f47410b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/ReadWriteBufferState$IdleEmpty;", "Lio/ktor/utils/io/internal/ReadWriteBufferState;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class IdleEmpty extends ReadWriteBufferState {

        /* JADX INFO: renamed from: c */
        public static final IdleEmpty f47411c = new IdleEmpty(ReadWriteBufferStateKt.f47423a, ReadWriteBufferStateKt.f47424b);

        public final String toString() {
            return "IDLE(empty)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/ReadWriteBufferState$IdleNonEmpty;", "Lio/ktor/utils/io/internal/ReadWriteBufferState;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class IdleNonEmpty extends ReadWriteBufferState {

        /* JADX INFO: renamed from: c */
        public final Initial f47412c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdleNonEmpty(Initial initial) {
            super(initial.f47409a, initial.f47410b);
            Intrinsics.m18599g(initial, "initial");
            this.f47412c = initial;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: a */
        public final boolean mo17539a() {
            return true;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: d */
        public final ReadWriteBufferState mo17542d() {
            return this.f47412c.f47416f;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: e */
        public final ReadWriteBufferState mo17543e() {
            return this.f47412c.f47417g;
        }

        public final String toString() {
            return "IDLE(with buffer)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/ReadWriteBufferState$Initial;", "Lio/ktor/utils/io/internal/ReadWriteBufferState;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Initial extends ReadWriteBufferState {

        /* JADX INFO: renamed from: c */
        public final ByteBuffer f47413c;

        /* JADX INFO: renamed from: d */
        public final ByteBuffer f47414d;

        /* JADX INFO: renamed from: e */
        public final IdleNonEmpty f47415e;

        /* JADX INFO: renamed from: f */
        public final Reading f47416f;

        /* JADX INFO: renamed from: g */
        public final Writing f47417g;

        /* JADX INFO: renamed from: h */
        public final ReadingWriting f47418h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(int i, ByteBuffer backingBuffer) {
            super(backingBuffer, new RingBufferCapacity(backingBuffer.capacity() - i));
            Intrinsics.m18599g(backingBuffer, "backingBuffer");
            if (!(backingBuffer.position() == 0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (backingBuffer.limit() != backingBuffer.capacity()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ByteBuffer byteBufferDuplicate = backingBuffer.duplicate();
            Intrinsics.m18598f(byteBufferDuplicate, "backingBuffer.duplicate()");
            this.f47413c = byteBufferDuplicate;
            ByteBuffer byteBufferDuplicate2 = backingBuffer.duplicate();
            Intrinsics.m18598f(byteBufferDuplicate2, "backingBuffer.duplicate()");
            this.f47414d = byteBufferDuplicate2;
            this.f47415e = new IdleNonEmpty(this);
            this.f47416f = new Reading(this);
            this.f47417g = new Writing(this);
            this.f47418h = new ReadingWriting(this);
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: a */
        public final boolean mo17539a() {
            throw new IllegalStateException("Not available for initial state");
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ByteBuffer getF47414d() {
            return this.f47414d;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ByteBuffer getF47413c() {
            return this.f47413c;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: d */
        public final ReadWriteBufferState mo17542d() {
            return this.f47416f;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: e */
        public final ReadWriteBufferState mo17543e() {
            return this.f47417g;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/ReadWriteBufferState$Reading;", "Lio/ktor/utils/io/internal/ReadWriteBufferState;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Reading extends ReadWriteBufferState {

        /* JADX INFO: renamed from: c */
        public final Initial f47419c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reading(Initial initial) {
            super(initial.f47409a, initial.f47410b);
            Intrinsics.m18599g(initial, "initial");
            this.f47419c = initial;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: b */
        public final ByteBuffer getF47414d() {
            return this.f47419c.f47414d;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: e */
        public final ReadWriteBufferState mo17543e() {
            return this.f47419c.f47418h;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: f */
        public final ReadWriteBufferState mo17544f() {
            return this.f47419c.f47415e;
        }

        public final String toString() {
            return "Reading";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/ReadWriteBufferState$ReadingWriting;", "Lio/ktor/utils/io/internal/ReadWriteBufferState;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class ReadingWriting extends ReadWriteBufferState {

        /* JADX INFO: renamed from: c */
        public final Initial f47420c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadingWriting(Initial initial) {
            super(initial.f47409a, initial.f47410b);
            Intrinsics.m18599g(initial, "initial");
            this.f47420c = initial;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: b */
        public final ByteBuffer getF47414d() {
            return this.f47420c.f47414d;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: c */
        public final ByteBuffer getF47413c() {
            return this.f47420c.f47413c;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: f */
        public final ReadWriteBufferState mo17544f() {
            return this.f47420c.f47417g;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: g */
        public final ReadWriteBufferState mo17545g() {
            return this.f47420c.f47416f;
        }

        public final String toString() {
            return "Reading+Writing";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/ReadWriteBufferState$Terminated;", "Lio/ktor/utils/io/internal/ReadWriteBufferState;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Terminated extends ReadWriteBufferState {

        /* JADX INFO: renamed from: c */
        public static final Terminated f47421c = new Terminated(ReadWriteBufferStateKt.f47423a, ReadWriteBufferStateKt.f47424b);

        public final String toString() {
            return "Terminated";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/ReadWriteBufferState$Writing;", "Lio/ktor/utils/io/internal/ReadWriteBufferState;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Writing extends ReadWriteBufferState {

        /* JADX INFO: renamed from: c */
        public final Initial f47422c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Writing(Initial initial) {
            super(initial.f47409a, initial.f47410b);
            Intrinsics.m18599g(initial, "initial");
            this.f47422c = initial;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: c */
        public final ByteBuffer getF47413c() {
            return this.f47422c.f47413c;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: d */
        public final ReadWriteBufferState mo17542d() {
            return this.f47422c.f47418h;
        }

        @Override // io.ktor.utils.p043io.internal.ReadWriteBufferState
        /* JADX INFO: renamed from: g */
        public final ReadWriteBufferState mo17545g() {
            return this.f47422c.f47415e;
        }

        public final String toString() {
            return "Writing";
        }
    }

    public ReadWriteBufferState(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity) {
        this.f47409a = byteBuffer;
        this.f47410b = ringBufferCapacity;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo17539a() {
        return this instanceof IdleEmpty;
    }

    /* JADX INFO: renamed from: b */
    public ByteBuffer getF47414d() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    /* JADX INFO: renamed from: c */
    public ByteBuffer getF47413c() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    /* JADX INFO: renamed from: d */
    public ReadWriteBufferState mo17542d() {
        throw new IllegalStateException(("Reading is not available in state " + this).toString());
    }

    /* JADX INFO: renamed from: e */
    public ReadWriteBufferState mo17543e() {
        throw new IllegalStateException(("Writing is not available in state " + this).toString());
    }

    /* JADX INFO: renamed from: f */
    public ReadWriteBufferState mo17544f() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    /* JADX INFO: renamed from: g */
    public ReadWriteBufferState mo17545g() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }
}
