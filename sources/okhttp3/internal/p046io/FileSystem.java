package okhttp3.internal.p046io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface FileSystem {

    /* JADX INFO: renamed from: a */
    public static final FileSystem f57677a = new Companion.SystemFileSystem();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0006"}, m18302d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "Lokhttp3/internal/io/FileSystem;", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.p046io.FileSystem
            /* JADX INFO: renamed from: a */
            public final Source mo21497a(File file) {
                Intrinsics.m18599g(file, "file");
                return Okio.m21676i(file);
            }

            @Override // okhttp3.internal.p046io.FileSystem
            /* JADX INFO: renamed from: b */
            public final Sink mo21498b(File file) {
                Intrinsics.m18599g(file, "file");
                try {
                    return Okio.m21674g(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.m21674g(file);
                }
            }

            @Override // okhttp3.internal.p046io.FileSystem
            /* JADX INFO: renamed from: c */
            public final void mo21499c(File file) throws IOException {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        mo21499c(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            @Override // okhttp3.internal.p046io.FileSystem
            /* JADX INFO: renamed from: d */
            public final boolean mo21500d(File file) {
                Intrinsics.m18599g(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.p046io.FileSystem
            /* JADX INFO: renamed from: e */
            public final void mo21501e(File from, File to) throws IOException {
                Intrinsics.m18599g(from, "from");
                Intrinsics.m18599g(to, "to");
                mo21502f(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.p046io.FileSystem
            /* JADX INFO: renamed from: f */
            public final void mo21502f(File file) throws IOException {
                Intrinsics.m18599g(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.p046io.FileSystem
            /* JADX INFO: renamed from: g */
            public final Sink mo21503g(File file) {
                Intrinsics.m18599g(file, "file");
                try {
                    return Okio.m21668a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.m21668a(file);
                }
            }

            @Override // okhttp3.internal.p046io.FileSystem
            /* JADX INFO: renamed from: h */
            public final long mo21504h(File file) {
                Intrinsics.m18599g(file, "file");
                return file.length();
            }

            public final String toString() {
                return "FileSystem.SYSTEM";
            }
        }
    }

    /* JADX INFO: renamed from: a */
    Source mo21497a(File file);

    /* JADX INFO: renamed from: b */
    Sink mo21498b(File file);

    /* JADX INFO: renamed from: c */
    void mo21499c(File file);

    /* JADX INFO: renamed from: d */
    boolean mo21500d(File file);

    /* JADX INFO: renamed from: e */
    void mo21501e(File file, File file2);

    /* JADX INFO: renamed from: f */
    void mo21502f(File file);

    /* JADX INFO: renamed from: g */
    Sink mo21503g(File file);

    /* JADX INFO: renamed from: h */
    long mo21504h(File file);
}
