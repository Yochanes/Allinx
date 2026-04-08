package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/JvmSystemFileSystem;", "Lokio/FileSystem;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class JvmSystemFileSystem extends FileSystem {
    /* JADX INFO: renamed from: n */
    public static ArrayList m21662n(Path path, boolean z2) throws IOException {
        File fileM21684e = path.m21684e();
        String[] list = fileM21684e.list();
        if (list == null) {
            if (!z2) {
                return null;
            }
            if (fileM21684e.exists()) {
                throw new IOException("failed to list " + path);
            }
            throw new FileNotFoundException("no such file: " + path);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.m18596d(str);
            arrayList.add(path.m21683d(str));
        }
        CollectionsKt.m18443m0(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    /* JADX INFO: renamed from: a */
    public void mo21641a(Path path) throws IOException {
        Intrinsics.m18599g(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileM21684e = path.m21684e();
        if (fileM21684e.delete() || !fileM21684e.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // okio.FileSystem
    /* JADX INFO: renamed from: d */
    public List mo21644d(Path dir) throws IOException {
        Intrinsics.m18599g(dir, "dir");
        ArrayList arrayListM21662n = m21662n(dir, true);
        Intrinsics.m18596d(arrayListM21662n);
        return arrayListM21662n;
    }

    @Override // okio.FileSystem
    /* JADX INFO: renamed from: e */
    public List mo21645e(Path dir) {
        Intrinsics.m18599g(dir, "dir");
        return m21662n(dir, false);
    }

    @Override // okio.FileSystem
    /* JADX INFO: renamed from: g */
    public FileMetadata mo21647g(Path path) {
        Intrinsics.m18599g(path, "path");
        File fileM21684e = path.m21684e();
        boolean zIsFile = fileM21684e.isFile();
        boolean zIsDirectory = fileM21684e.isDirectory();
        long jLastModified = fileM21684e.lastModified();
        long length = fileM21684e.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileM21684e.exists()) {
            return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // okio.FileSystem
    /* JADX INFO: renamed from: h */
    public FileHandle mo21648h(Path path) {
        return new JvmFileHandle(new RandomAccessFile(path.m21684e(), "r"));
    }

    @Override // okio.FileSystem
    /* JADX INFO: renamed from: i */
    public Sink mo12450i(Path file) {
        Intrinsics.m18599g(file, "file");
        return Okio.m21674g(file.m21684e());
    }

    @Override // okio.FileSystem
    /* JADX INFO: renamed from: j */
    public Source mo21649j(Path file) {
        Intrinsics.m18599g(file, "file");
        return Okio.m21676i(file.m21684e());
    }

    /* JADX INFO: renamed from: k */
    public Sink mo21663k(Path file) {
        Intrinsics.m18599g(file, "file");
        File fileM21684e = file.m21684e();
        Logger logger = Okio__JvmOkioKt.f57879a;
        return new OutputStreamSink(new FileOutputStream(fileM21684e, true), new Timeout());
    }

    /* JADX INFO: renamed from: l */
    public void mo21664l(Path source, Path target) throws IOException {
        Intrinsics.m18599g(source, "source");
        Intrinsics.m18599g(target, "target");
        if (source.m21684e().renameTo(target.m21684e())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    /* JADX INFO: renamed from: m */
    public void mo21665m(Path path) throws IOException {
        if (path.m21684e().mkdir()) {
            return;
        }
        FileMetadata fileMetadataMo21647g = mo21647g(path);
        if (fileMetadataMo21647g == null || !fileMetadataMo21647g.f57855b) {
            throw new IOException("failed to create directory: " + path);
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
