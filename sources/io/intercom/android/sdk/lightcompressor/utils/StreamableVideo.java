package io.intercom.android.sdk.lightcompressor.utils;

import android.util.Log;
import com.engagelab.privates.push.constants.MTPushConstants;
import io.intercom.android.sdk.lightcompressor.data.AtomsKt;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/utils/StreamableVideo;", "", "<init>", "()V", MTPushConstants.Operation.KEY_TAG, "", "ATOM_PREAMBLE_SIZE", "", OpsMetricTracker.START, "", "in", "Ljava/io/File;", "out", "convert", "infile", "Ljava/nio/channels/FileChannel;", "outfile", "safeClose", "", "closeable", "Ljava/io/Closeable;", "readAndFill", "buffer", "Ljava/nio/ByteBuffer;", "position", "", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class StreamableVideo {
    private static final int ATOM_PREAMBLE_SIZE = 8;

    @NotNull
    public static final StreamableVideo INSTANCE = new StreamableVideo();

    @NotNull
    private static final String tag = "StreamableVideo";

    private StreamableVideo() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean convert(FileChannel infile, FileChannel outfile) throws Exception {
        boolean z2;
        ByteBuffer byteBuffer;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long jUInt32ToLong = 0;
        ByteBuffer byteBuffer2 = null;
        long jPosition = 0;
        int i = 0;
        while (true) {
            Intrinsics.m18596d(byteBufferOrder);
            if (!readAndFill(infile, byteBufferOrder)) {
                break;
            }
            jUInt32ToLong = NumbersUtilsKt.uInt32ToLong(byteBufferOrder.getInt());
            i = byteBufferOrder.getInt();
            if (i == AtomsKt.getFTYP_ATOM()) {
                int iUInt32ToInt = NumbersUtilsKt.uInt32ToInt(jUInt32ToLong);
                ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(iUInt32ToInt).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder.rewind();
                byteBufferOrder2.put(byteBufferOrder);
                if (infile.read(byteBufferOrder2) < iUInt32ToInt - 8) {
                    byteBuffer2 = byteBufferOrder2;
                    break;
                }
                byteBufferOrder2.flip();
                jPosition = infile.position();
                byteBuffer2 = byteBufferOrder2;
                z2 = false;
            } else {
                if (jUInt32ToLong == 1) {
                    byteBufferOrder.clear();
                    if (!readAndFill(infile, byteBufferOrder)) {
                        break;
                    }
                    jUInt32ToLong = NumbersUtilsKt.uInt64ToLong(byteBufferOrder.getLong());
                    byteBuffer = byteBuffer2;
                    z2 = false;
                    infile.position((infile.position() + jUInt32ToLong) - ((long) 16));
                } else {
                    byteBuffer = byteBuffer2;
                    z2 = false;
                    infile.position((infile.position() + jUInt32ToLong) - ((long) 8));
                }
                byteBuffer2 = byteBuffer;
            }
            if (i != AtomsKt.getFREE_ATOM() && i != AtomsKt.getJUNK_ATOM() && i != AtomsKt.getMDAT_ATOM() && i != AtomsKt.getMOOV_ATOM() && i != AtomsKt.getPNOT_ATOM() && i != AtomsKt.getSKIP_ATOM() && i != AtomsKt.getWIDE_ATOM() && i != AtomsKt.getPICT_ATOM() && i != AtomsKt.getUUID_ATOM() && i != AtomsKt.getFTYP_ATOM()) {
                Log.wtf(tag, "encountered non-QT top-level atom (is this a QuickTime file?)");
                break;
            }
            if (jUInt32ToLong < 8) {
                break;
            }
        }
        if (i != AtomsKt.getMOOV_ATOM()) {
            Log.wtf(tag, "last atom in file was not a moov atom");
            return z2;
        }
        int iUInt32ToInt2 = NumbersUtilsKt.uInt32ToInt(jUInt32ToLong);
        long j = iUInt32ToInt2;
        long size = infile.size() - j;
        ByteBuffer byteBufferOrder3 = ByteBuffer.allocate(iUInt32ToInt2).order(ByteOrder.BIG_ENDIAN);
        if (!readAndFill(infile, byteBufferOrder3, size)) {
            throw new Exception("failed to read moov atom");
        }
        if (byteBufferOrder3.getInt(12) == AtomsKt.getCMOV_ATOM()) {
            throw new Exception("this utility does not support compressed moov atoms yet");
        }
        for (int i2 = 8; byteBufferOrder3.remaining() >= i2; i2 = 8) {
            int iPosition = byteBufferOrder3.position();
            int i3 = byteBufferOrder3.getInt(iPosition + 4);
            if (i3 == AtomsKt.getSTCO_ATOM() || i3 == AtomsKt.getCO64_ATOM()) {
                long j2 = size;
                if (NumbersUtilsKt.uInt32ToLong(byteBufferOrder3.getInt(iPosition)) > byteBufferOrder3.remaining()) {
                    throw new Exception("bad atom size");
                }
                byteBufferOrder3.position(iPosition + 12);
                if (byteBufferOrder3.remaining() < 4) {
                    throw new Exception("malformed atom");
                }
                int iUInt32ToInt3 = NumbersUtilsKt.uInt32ToInt(byteBufferOrder3.getInt());
                if (i3 == AtomsKt.getSTCO_ATOM()) {
                    Log.i(tag, "patching stco atom...");
                    if (byteBufferOrder3.remaining() < iUInt32ToInt3 * 4) {
                        throw new Exception("bad atom size/element count");
                    }
                    for (?? r2 = z2; r2 < iUInt32ToInt3; r2++) {
                        int i4 = byteBufferOrder3.getInt(byteBufferOrder3.position());
                        int i5 = i4 + iUInt32ToInt2;
                        if (i4 < 0 && i5 >= 0) {
                            throw new Exception("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.");
                        }
                        byteBufferOrder3.putInt(i5);
                    }
                } else if (i3 == AtomsKt.getCO64_ATOM()) {
                    Log.wtf(tag, "patching co64 atom...");
                    if (byteBufferOrder3.remaining() < iUInt32ToInt3 * 8) {
                        throw new Exception("bad atom size/element count");
                    }
                    for (?? r22 = z2; r22 < iUInt32ToInt3; r22++) {
                        byteBufferOrder3.putLong(byteBufferOrder3.getLong(byteBufferOrder3.position()) + j);
                    }
                }
                size = j2;
            } else {
                byteBufferOrder3.position(byteBufferOrder3.position() + 1);
            }
        }
        long j3 = size;
        infile.position(jPosition);
        if (byteBuffer2 != null) {
            Log.i(tag, "writing ftyp atom...");
            byteBuffer2.rewind();
            outfile.write(byteBuffer2);
        }
        Log.i(tag, "writing moov atom...");
        byteBufferOrder3.rewind();
        outfile.write(byteBufferOrder3);
        Log.i(tag, "copying rest of file...");
        infile.transferTo(jPosition, j3 - jPosition, outfile);
        return true;
    }

    private final boolean readAndFill(FileChannel infile, ByteBuffer buffer) throws IOException {
        buffer.clear();
        int i = infile.read(buffer);
        buffer.flip();
        return i == buffer.capacity();
    }

    private final void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.wtf(tag, "Failed to close file: ");
            }
        }
    }

    public final boolean start(@Nullable File in, @NotNull File out) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileChannel channel;
        Intrinsics.m18599g(out, "out");
        Closeable closeable = null;
        try {
            fileInputStream = new FileInputStream(in);
            try {
                channel = fileInputStream.getChannel();
                fileOutputStream = new FileOutputStream(out);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            FileChannel channel2 = fileOutputStream.getChannel();
            Intrinsics.m18596d(channel);
            Intrinsics.m18596d(channel2);
            boolean zConvert = convert(channel, channel2);
            safeClose(fileInputStream);
            safeClose(fileOutputStream);
            if (!zConvert) {
                out.delete();
            }
            return zConvert;
        } catch (Throwable th3) {
            th = th3;
            closeable = fileInputStream;
            safeClose(closeable);
            safeClose(fileOutputStream);
            out.delete();
            throw th;
        }
    }

    private final boolean readAndFill(FileChannel infile, ByteBuffer buffer, long position) throws IOException {
        buffer.clear();
        int i = infile.read(buffer, position);
        buffer.flip();
        return i == buffer.capacity();
    }
}
