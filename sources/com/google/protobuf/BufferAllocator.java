package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = new C48791();

    /* JADX INFO: renamed from: com.google.protobuf.BufferAllocator$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C48791 extends BufferAllocator {
        @Override // com.google.protobuf.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int i) {
            return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(i));
        }

        @Override // com.google.protobuf.BufferAllocator
        public AllocatedBuffer allocateHeapBuffer(int i) {
            return AllocatedBuffer.wrap(new byte[i]);
        }
    }

    public static BufferAllocator unpooled() {
        return UNPOOLED;
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int i);

    public abstract AllocatedBuffer allocateHeapBuffer(int i);
}
