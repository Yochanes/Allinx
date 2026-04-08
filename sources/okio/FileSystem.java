package okio;

import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Path;
import okio.internal.ResourceFileSystem;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokio/FileSystem;", "", "Companion", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class FileSystem {

    /* JADX INFO: renamed from: a */
    public static final JvmSystemFileSystem f57862a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Lokio/FileSystem$Companion;", "", "Lokio/FileSystem;", "RESOURCES", "Lokio/FileSystem;", "SYSTEM", "Lokio/Path;", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        JvmSystemFileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        f57862a = jvmSystemFileSystem;
        String str = Path.f57884b;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.m18598f(property, "getProperty(...)");
        Path.Companion.m21687a(property);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        Intrinsics.m18598f(classLoader, "getClassLoader(...)");
        new ResourceFileSystem(classLoader);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21641a(Path path);

    /* JADX INFO: renamed from: b */
    public final void m21642b(Path path) {
        Intrinsics.m18599g(path, "path");
        mo21641a(path);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21643c(Path path) {
        Intrinsics.m18599g(path, "path");
        return mo21647g(path) != null;
    }

    /* JADX INFO: renamed from: d */
    public abstract List mo21644d(Path path);

    /* JADX INFO: renamed from: e */
    public abstract List mo21645e(Path path);

    /* JADX INFO: renamed from: f */
    public final FileMetadata m21646f(Path path) throws FileNotFoundException {
        Intrinsics.m18599g(path, "path");
        FileMetadata fileMetadataMo21647g = mo21647g(path);
        if (fileMetadataMo21647g != null) {
            return fileMetadataMo21647g;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    /* JADX INFO: renamed from: g */
    public abstract FileMetadata mo21647g(Path path);

    /* JADX INFO: renamed from: h */
    public abstract FileHandle mo21648h(Path path);

    /* JADX INFO: renamed from: i */
    public abstract Sink mo12450i(Path path);

    /* JADX INFO: renamed from: j */
    public abstract Source mo21649j(Path path);
}
