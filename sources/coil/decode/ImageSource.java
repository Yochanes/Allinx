package coil.decode;

import coil.annotation.ExperimentalCoilApi;
import java.io.Closeable;
import okio.BufferedSource;
import okio.Path;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lcoil/decode/ImageSource;", "Ljava/io/Closeable;", "Metadata", "Lcoil/decode/FileImageSource;", "Lcoil/decode/SourceImageSource;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class ImageSource implements Closeable {

    /* JADX INFO: compiled from: Proguard */
    @kotlin.Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/decode/ImageSource$Metadata;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @ExperimentalCoilApi
    public static abstract class Metadata {
    }

    /* JADX INFO: renamed from: a */
    public abstract Path mo12417a();

    /* JADX INFO: renamed from: b */
    public abstract Path mo12418b();

    /* JADX INFO: renamed from: d */
    public abstract Metadata mo12419d();

    /* JADX INFO: renamed from: g */
    public abstract BufferedSource mo12420g();
}
