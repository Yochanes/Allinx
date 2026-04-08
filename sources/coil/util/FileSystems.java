package coil.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: renamed from: coil.util.-FileSystems, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"coil-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmName
public final class FileSystems {
    /* JADX INFO: renamed from: a */
    public static final void m12527a(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.mo21644d(path)) {
                try {
                    if (fileSystem.m21646f(path2).f57855b) {
                        m12527a(fileSystem, path2);
                    }
                    fileSystem.mo21641a(path2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
