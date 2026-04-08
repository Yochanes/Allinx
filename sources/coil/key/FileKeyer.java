package coil.key;

import coil.request.Options;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lcoil/key/FileKeyer;", "Lcoil/key/Keyer;", "Ljava/io/File;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class FileKeyer implements Keyer<File> {

    /* JADX INFO: renamed from: a */
    public final boolean f33751a;

    public FileKeyer(boolean z2) {
        this.f33751a = z2;
    }

    @Override // coil.key.Keyer
    /* JADX INFO: renamed from: a */
    public final String mo12473a(Object obj, Options options) {
        File file = (File) obj;
        if (!this.f33751a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
