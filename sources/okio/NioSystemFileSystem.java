package okio;

import io.intercom.android.sdk.utilities.AbstractC5852a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Path;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/NioSystemFileSystem;", "Lokio/JvmSystemFileSystem;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class NioSystemFileSystem extends JvmSystemFileSystem {
    /* JADX INFO: renamed from: o */
    public static Long m21667o(FileTime fileTime) {
        long jM16768b = AbstractC5852a.m16768b(fileTime);
        Long lValueOf = Long.valueOf(jM16768b);
        if (jM16768b != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    /* JADX INFO: renamed from: g */
    public FileMetadata mo21647g(Path path) {
        Path pathM21687a;
        Intrinsics.m18599g(path, "path");
        java.nio.file.Path pathM21685f = path.m21685f();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathM21685f, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathM21685f) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = Path.f57884b;
                pathM21687a = Path.Companion.m21687a(symbolicLink.toString());
            } else {
                pathM21687a = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM21667o = fileTimeCreationTime != null ? m21667o(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM21667o2 = fileTimeLastModifiedTime != null ? m21667o(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new FileMetadata(zIsRegularFile, zIsDirectory, pathM21687a, lValueOf, lM21667o, lM21667o2, fileTimeLastAccessTime != null ? m21667o(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.JvmSystemFileSystem
    /* JADX INFO: renamed from: l */
    public void mo21664l(Path source, Path target) throws IOException {
        Intrinsics.m18599g(source, "source");
        Intrinsics.m18599g(target, "target");
        try {
            Files.move(source.m21685f(), target.m21685f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.JvmSystemFileSystem
    public String toString() {
        return "NioSystemFileSystem";
    }
}
