package coil.disk;

import coil.disk.DiskCache;
import coil.disk.DiskLruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import okio.ByteString;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Path;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lcoil/disk/RealDiskCache;", "Lcoil/disk/DiskCache;", "RealSnapshot", "RealEditor", "Companion", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RealDiskCache implements DiskCache {

    /* JADX INFO: renamed from: a */
    public final JvmSystemFileSystem f33579a;

    /* JADX INFO: renamed from: b */
    public final DiskLruCache f33580b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Lcoil/disk/RealDiskCache$Companion;", "", "", "ENTRY_METADATA", "I", "ENTRY_DATA", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/disk/RealDiskCache$RealEditor;", "Lcoil/disk/DiskCache$Editor;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class RealEditor implements DiskCache.Editor {

        /* JADX INFO: renamed from: a */
        public final DiskLruCache.Editor f33581a;

        public RealEditor(DiskLruCache.Editor editor) {
            this.f33581a = editor;
        }

        @Override // coil.disk.DiskCache.Editor
        /* JADX INFO: renamed from: a */
        public final DiskCache.Snapshot mo12432a() {
            DiskLruCache.Snapshot snapshotM12438d;
            DiskLruCache.Editor editor = this.f33581a;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                editor.m12447a(true);
                snapshotM12438d = diskLruCache.m12438d(editor.f33560a.f33564a);
            }
            if (snapshotM12438d != null) {
                return new RealSnapshot(snapshotM12438d);
            }
            return null;
        }

        @Override // coil.disk.DiskCache.Editor
        public final void abort() {
            this.f33581a.m12447a(false);
        }

        @Override // coil.disk.DiskCache.Editor
        public final Path getData() {
            return this.f33581a.m12448b(1);
        }

        @Override // coil.disk.DiskCache.Editor
        public final Path getMetadata() {
            return this.f33581a.m12448b(0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/disk/RealDiskCache$RealSnapshot;", "Lcoil/disk/DiskCache$Snapshot;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class RealSnapshot implements DiskCache.Snapshot {

        /* JADX INFO: renamed from: a */
        public final DiskLruCache.Snapshot f33582a;

        public RealSnapshot(DiskLruCache.Snapshot snapshot) {
            this.f33582a = snapshot;
        }

        @Override // coil.disk.DiskCache.Snapshot
        /* JADX INFO: renamed from: X */
        public final DiskCache.Editor mo12433X() {
            DiskLruCache.Editor editorM12437b;
            DiskLruCache.Snapshot snapshot = this.f33582a;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                snapshot.close();
                editorM12437b = diskLruCache.m12437b(snapshot.f33573a.f33564a);
            }
            if (editorM12437b != null) {
                return new RealEditor(editorM12437b);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f33582a.close();
        }

        @Override // coil.disk.DiskCache.Snapshot
        public final Path getData() {
            DiskLruCache.Snapshot snapshot = this.f33582a;
            if (snapshot.f33574b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) snapshot.f33573a.f33566c.get(1);
        }

        @Override // coil.disk.DiskCache.Snapshot
        public final Path getMetadata() {
            DiskLruCache.Snapshot snapshot = this.f33582a;
            if (snapshot.f33574b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) snapshot.f33573a.f33566c.get(0);
        }
    }

    public RealDiskCache(long j, DefaultIoScheduler defaultIoScheduler, JvmSystemFileSystem jvmSystemFileSystem, Path path) {
        this.f33579a = jvmSystemFileSystem;
        this.f33580b = new DiskLruCache(j, defaultIoScheduler, jvmSystemFileSystem, path);
    }

    @Override // coil.disk.DiskCache
    /* JADX INFO: renamed from: a */
    public final DiskCache.Editor mo12428a(String str) {
        ByteString.Companion companion = ByteString.f57840d;
        DiskLruCache.Editor editorM12437b = this.f33580b.m12437b(ByteString.Companion.m21633c(str).mo21616c("SHA-256").mo21618e());
        if (editorM12437b != null) {
            return new RealEditor(editorM12437b);
        }
        return null;
    }

    @Override // coil.disk.DiskCache
    /* JADX INFO: renamed from: b */
    public final DiskCache.Snapshot mo12429b(String str) {
        ByteString.Companion companion = ByteString.f57840d;
        DiskLruCache.Snapshot snapshotM12438d = this.f33580b.m12438d(ByteString.Companion.m21633c(str).mo21616c("SHA-256").mo21618e());
        if (snapshotM12438d != null) {
            return new RealSnapshot(snapshotM12438d);
        }
        return null;
    }

    @Override // coil.disk.DiskCache
    /* JADX INFO: renamed from: c */
    public final FileSystem mo12430c() {
        return this.f33579a;
    }
}
