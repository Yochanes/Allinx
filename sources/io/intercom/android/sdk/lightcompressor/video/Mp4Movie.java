package io.intercom.android.sdk.lightcompressor.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mp4parser.support.Matrix;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u001b\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u0015¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\fJ\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/video/Mp4Movie;", "", "<init>", "()V", "matrix", "Lorg/mp4parser/support/Matrix;", "kotlin.jvm.PlatformType", "Lorg/mp4parser/support/Matrix;", "tracks", "Ljava/util/ArrayList;", "Lio/intercom/android/sdk/lightcompressor/video/Track;", "cacheFile", "Ljava/io/File;", "getMatrix", "setCacheFile", "", "file", "setRotation", "angle", "", "getTracks", "Lkotlin/collections/ArrayList;", "()Ljava/util/ArrayList;", "getCacheFile", "addSample", "trackIndex", "offset", "", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "addTrack", "mediaFormat", "Landroid/media/MediaFormat;", "isAudio", "", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Mp4Movie {

    @Nullable
    private File cacheFile;
    private Matrix matrix = Matrix.f59266j;

    @NotNull
    private final ArrayList<Track> tracks = new ArrayList<>();

    public final void addSample(int trackIndex, long offset, @NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.m18599g(bufferInfo, "bufferInfo");
        if (trackIndex < 0 || trackIndex >= this.tracks.size()) {
            return;
        }
        Track track = this.tracks.get(trackIndex);
        Intrinsics.m18598f(track, "get(...)");
        track.addSample(offset, bufferInfo);
    }

    public final int addTrack(@NotNull MediaFormat mediaFormat, boolean isAudio) {
        Intrinsics.m18599g(mediaFormat, "mediaFormat");
        ArrayList<Track> arrayList = this.tracks;
        arrayList.add(new Track(arrayList.size(), mediaFormat, isAudio));
        return this.tracks.size() - 1;
    }

    @Nullable
    public final File getCacheFile() {
        return this.cacheFile;
    }

    @Nullable
    public final Matrix getMatrix() {
        return this.matrix;
    }

    @NotNull
    public final ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public final void setCacheFile(@NotNull File file) {
        Intrinsics.m18599g(file, "file");
        this.cacheFile = file;
    }

    public final void setRotation(int angle) {
        if (angle == 0) {
            this.matrix = Matrix.f59266j;
            return;
        }
        if (angle == 90) {
            this.matrix = Matrix.f59267k;
        } else if (angle == 180) {
            this.matrix = Matrix.f59268l;
        } else {
            if (angle != 270) {
                return;
            }
            this.matrix = Matrix.f59269m;
        }
    }
}
