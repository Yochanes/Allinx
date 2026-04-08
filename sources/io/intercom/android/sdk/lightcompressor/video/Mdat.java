package io.intercom.android.sdk.lightcompressor.video;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.mp4parser.Box;
import org.mp4parser.IsoFile;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/video/Mdat;", "Lorg/mp4parser/Box;", "<init>", "()V", "contentSize", "", "dataOffset", "getSize", "getOffset", "setDataOffset", "", "offset", "setContentSize", "getContentSize", "getType", "", "isSmallBox", "", "getBox", "writableByteChannel", "Ljava/nio/channels/WritableByteChannel;", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Mdat implements Box {
    private long contentSize = 1073741824;
    private long dataOffset;

    private final boolean isSmallBox(long contentSize) {
        return contentSize + ((long) 8) < 4294967296L;
    }

    @Override // org.mp4parser.Box
    public void getBox(@NotNull WritableByteChannel writableByteChannel) throws IOException {
        Intrinsics.m18599g(writableByteChannel, "writableByteChannel");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        long size = getSize();
        if (!isSmallBox(size) || size < 0 || size > 4294967296L) {
            byteBufferAllocate.putInt((int) 1);
        } else {
            byteBufferAllocate.putInt((int) size);
        }
        byteBufferAllocate.put(IsoFile.m21819g("mdat"));
        if (isSmallBox(size)) {
            byteBufferAllocate.put(new byte[8]);
        } else {
            if (size < 0) {
                size = 1;
            }
            byteBufferAllocate.putLong(size);
        }
        byteBufferAllocate.rewind();
        writableByteChannel.write(byteBufferAllocate);
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    /* JADX INFO: renamed from: getOffset, reason: from getter */
    public final long getDataOffset() {
        return this.dataOffset;
    }

    @Override // org.mp4parser.Box
    public long getSize() {
        return ((long) 16) + this.contentSize;
    }

    @NotNull
    public String getType() {
        return "mdat";
    }

    public final void setContentSize(long contentSize) {
        this.contentSize = contentSize;
    }

    public final void setDataOffset(long offset) {
        this.dataOffset = offset;
    }
}
