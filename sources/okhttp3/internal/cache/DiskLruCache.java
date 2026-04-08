package okhttp3.internal.cache;

import androidx.compose.p013ui.platform.AbstractC1313i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p044io.CloseableKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.p046io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DiskLruCache implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    public final FileSystem f57303a;

    /* JADX INFO: renamed from: b */
    public final File f57304b;

    /* JADX INFO: renamed from: c */
    public final File f57305c;

    /* JADX INFO: renamed from: d */
    public final File f57306d;

    /* JADX INFO: renamed from: f */
    public final File f57307f;

    /* JADX INFO: renamed from: g */
    public long f57308g;

    /* JADX INFO: renamed from: i */
    public RealBufferedSink f57309i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f57310j;

    /* JADX INFO: renamed from: n */
    public int f57311n;

    /* JADX INFO: renamed from: o */
    public boolean f57312o;

    /* JADX INFO: renamed from: p */
    public boolean f57313p;

    /* JADX INFO: renamed from: q */
    public boolean f57314q;

    /* JADX INFO: renamed from: r */
    public boolean f57315r;

    /* JADX INFO: renamed from: s */
    public boolean f57316s;

    /* JADX INFO: renamed from: t */
    public boolean f57317t;

    /* JADX INFO: renamed from: u */
    public long f57318u;

    /* JADX INFO: renamed from: v */
    public final TaskQueue f57319v;

    /* JADX INFO: renamed from: w */
    public final DiskLruCache$cleanupTask$1 f57320w;

    /* JADX INFO: renamed from: x */
    public static final Regex f57300x = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: y */
    public static final String f57301y = "CLEAN";

    /* JADX INFO: renamed from: z */
    public static final String f57302z = "DIRTY";

    /* JADX INFO: renamed from: A */
    public static final String f57298A = "REMOVE";

    /* JADX INFO: renamed from: B */
    public static final String f57299B = "READ";

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m18302d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lkotlin/text/Regex;", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public final class Editor {

        /* JADX INFO: renamed from: a */
        public final Entry f57321a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f57322b;

        /* JADX INFO: renamed from: c */
        public boolean f57323c;

        public Editor(Entry entry) {
            boolean[] zArr;
            this.f57321a = entry;
            if (entry.f57331e) {
                zArr = null;
            } else {
                DiskLruCache.this.getClass();
                zArr = new boolean[2];
            }
            this.f57322b = zArr;
        }

        /* JADX INFO: renamed from: a */
        public final void m21361a() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.f57323c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.m18594b(this.f57321a.f57333g, this)) {
                        diskLruCache.m21350b(this, false);
                    }
                    this.f57323c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m21362b() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.f57323c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.m18594b(this.f57321a.f57333g, this)) {
                        diskLruCache.m21350b(this, true);
                    }
                    this.f57323c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m21363c() {
            Entry entry = this.f57321a;
            if (Intrinsics.m18594b(entry.f57333g, this)) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (diskLruCache.f57313p) {
                    diskLruCache.m21350b(this, false);
                } else {
                    entry.f57332f = true;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final Sink m21364d(int i) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (this.f57323c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.m18594b(this.f57321a.f57333g, this)) {
                    return Okio.m21669b();
                }
                if (!this.f57321a.f57331e) {
                    boolean[] zArr = this.f57322b;
                    Intrinsics.m18596d(zArr);
                    zArr[i] = true;
                }
                try {
                    return new FaultHidingSink(FileSystem.f57677a.mo21498b((File) this.f57321a.f57330d.get(i)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return Okio.m21669b();
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class Entry {

        /* JADX INFO: renamed from: a */
        public final String f57327a;

        /* JADX INFO: renamed from: b */
        public final long[] f57328b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f57329c;

        /* JADX INFO: renamed from: d */
        public final ArrayList f57330d;

        /* JADX INFO: renamed from: e */
        public boolean f57331e;

        /* JADX INFO: renamed from: f */
        public boolean f57332f;

        /* JADX INFO: renamed from: g */
        public Editor f57333g;

        /* JADX INFO: renamed from: h */
        public int f57334h;

        /* JADX INFO: renamed from: i */
        public long f57335i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ DiskLruCache f57336j;

        public Entry(DiskLruCache diskLruCache, String key) {
            Intrinsics.m18599g(key, "key");
            this.f57336j = diskLruCache;
            this.f57327a = key;
            diskLruCache.getClass();
            this.f57328b = new long[2];
            this.f57329c = new ArrayList();
            this.f57330d = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.f57329c.add(new File(this.f57336j.f57304b, sb.toString()));
                sb.append(".tmp");
                this.f57330d.add(new File(this.f57336j.f57304b, sb.toString()));
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: a */
        public final Snapshot m21365a() {
            byte[] bArr = Util.f57274a;
            if (!this.f57331e) {
                return null;
            }
            DiskLruCache diskLruCache = this.f57336j;
            if (!diskLruCache.f57313p && (this.f57333g != null || this.f57332f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f57328b.clone();
            for (int i = 0; i < 2; i++) {
                try {
                    Source sourceMo21497a = FileSystem.f57677a.mo21497a((File) this.f57329c.get(i));
                    if (!diskLruCache.f57313p) {
                        this.f57334h++;
                        sourceMo21497a = new DiskLruCache$Entry$newSource$1(sourceMo21497a, diskLruCache, this);
                    }
                    arrayList.add(sourceMo21497a);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Util.m21320c((Source) it.next());
                    }
                    try {
                        diskLruCache.m21359x(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new Snapshot(this.f57336j, this.f57327a, this.f57335i, arrayList, jArr);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public final class Snapshot implements Closeable {

        /* JADX INFO: renamed from: a */
        public final String f57340a;

        /* JADX INFO: renamed from: b */
        public final long f57341b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f57342c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DiskLruCache f57343d;

        public Snapshot(DiskLruCache diskLruCache, String key, long j, ArrayList arrayList, long[] lengths) {
            Intrinsics.m18599g(key, "key");
            Intrinsics.m18599g(lengths, "lengths");
            this.f57343d = diskLruCache;
            this.f57340a = key;
            this.f57341b = j;
            this.f57342c = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.f57342c.iterator();
            while (it.hasNext()) {
                Util.m21320c((Source) it.next());
            }
        }
    }

    public DiskLruCache(File file, TaskRunner taskRunner) {
        FileSystem fileSystem = FileSystem.f57677a;
        Intrinsics.m18599g(taskRunner, "taskRunner");
        this.f57303a = fileSystem;
        this.f57304b = file;
        this.f57310j = new LinkedHashMap(0, 0.75f, true);
        this.f57319v = taskRunner.m21379e();
        this.f57320w = new DiskLruCache$cleanupTask$1(this, AbstractC0000a.m19p(new StringBuilder(), Util.f57280g, " Cache"));
        this.f57305c = new File(file, "journal");
        this.f57306d = new File(file, "journal.tmp");
        this.f57307f = new File(file, "journal.bkp");
    }

    /* JADX INFO: renamed from: C */
    public static void m21348C(String str) {
        if (!f57300x.m20398d(str)) {
            throw new IllegalArgumentException(AbstractC1313i.m6244a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m21349a() {
        if (this.f57315r) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m21350b(Editor editor, boolean z2) {
        Intrinsics.m18599g(editor, "editor");
        Entry entry = editor.f57321a;
        if (!Intrinsics.m18594b(entry.f57333g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z2 && !entry.f57331e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = editor.f57322b;
                Intrinsics.m18596d(zArr);
                if (!zArr[i]) {
                    editor.m21361a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!FileSystem.f57677a.mo21500d((File) entry.f57330d.get(i))) {
                    editor.m21361a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            File file = (File) entry.f57330d.get(i2);
            if (!z2 || entry.f57332f) {
                FileSystem.f57677a.mo21502f(file);
            } else {
                FileSystem fileSystem = FileSystem.f57677a;
                if (fileSystem.mo21500d(file)) {
                    File file2 = (File) entry.f57329c.get(i2);
                    fileSystem.mo21501e(file, file2);
                    long j = entry.f57328b[i2];
                    long jMo21504h = fileSystem.mo21504h(file2);
                    entry.f57328b[i2] = jMo21504h;
                    this.f57308g = (this.f57308g - j) + jMo21504h;
                }
            }
        }
        entry.f57333g = null;
        if (entry.f57332f) {
            m21359x(entry);
            return;
        }
        this.f57311n++;
        RealBufferedSink realBufferedSink = this.f57309i;
        Intrinsics.m18596d(realBufferedSink);
        if (entry.f57331e || z2) {
            entry.f57331e = true;
            realBufferedSink.mo21585Z(f57301y);
            realBufferedSink.writeByte(32);
            realBufferedSink.mo21585Z(entry.f57327a);
            for (long j2 : entry.f57328b) {
                realBufferedSink.writeByte(32);
                realBufferedSink.mo21579U0(j2);
            }
            realBufferedSink.writeByte(10);
            if (z2) {
                long j3 = this.f57318u;
                this.f57318u = 1 + j3;
                entry.f57335i = j3;
            }
        } else {
            this.f57310j.remove(entry.f57327a);
            realBufferedSink.mo21585Z(f57298A);
            realBufferedSink.writeByte(32);
            realBufferedSink.mo21585Z(entry.f57327a);
            realBufferedSink.writeByte(10);
        }
        realBufferedSink.flush();
        if (this.f57308g > 10485760 || m21354i()) {
            TaskQueue.m21369d(this.f57319v, this.f57320w);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f57314q && !this.f57315r) {
                Collection collectionValues = this.f57310j.values();
                Intrinsics.m18598f(collectionValues, "lruEntries.values");
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    Editor editor = entry.f57333g;
                    if (editor != null) {
                        editor.m21363c();
                    }
                }
                m21360z();
                RealBufferedSink realBufferedSink = this.f57309i;
                Intrinsics.m18596d(realBufferedSink);
                realBufferedSink.close();
                this.f57309i = null;
                this.f57315r = true;
                return;
            }
            this.f57315r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Editor m21351d(long j, String key) {
        try {
            Intrinsics.m18599g(key, "key");
            m21353h();
            m21349a();
            m21348C(key);
            Entry entry = (Entry) this.f57310j.get(key);
            if (j != -1 && (entry == null || entry.f57335i != j)) {
                return null;
            }
            if ((entry != null ? entry.f57333g : null) != null) {
                return null;
            }
            if (entry != null && entry.f57334h != 0) {
                return null;
            }
            if (!this.f57316s && !this.f57317t) {
                RealBufferedSink realBufferedSink = this.f57309i;
                Intrinsics.m18596d(realBufferedSink);
                realBufferedSink.mo21585Z(f57302z);
                realBufferedSink.writeByte(32);
                realBufferedSink.mo21585Z(key);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
                if (this.f57312o) {
                    return null;
                }
                if (entry == null) {
                    entry = new Entry(this, key);
                    this.f57310j.put(key, entry);
                }
                Editor editor = new Editor(entry);
                entry.f57333g = editor;
                return editor;
            }
            TaskQueue.m21369d(this.f57319v, this.f57320w);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f57314q) {
            m21349a();
            m21360z();
            RealBufferedSink realBufferedSink = this.f57309i;
            Intrinsics.m18596d(realBufferedSink);
            realBufferedSink.flush();
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Snapshot m21352g(String key) {
        Intrinsics.m18599g(key, "key");
        m21353h();
        m21349a();
        m21348C(key);
        Entry entry = (Entry) this.f57310j.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotM21365a = entry.m21365a();
        if (snapshotM21365a == null) {
            return null;
        }
        this.f57311n++;
        RealBufferedSink realBufferedSink = this.f57309i;
        Intrinsics.m18596d(realBufferedSink);
        realBufferedSink.mo21585Z(f57299B);
        realBufferedSink.writeByte(32);
        realBufferedSink.mo21585Z(key);
        realBufferedSink.writeByte(10);
        if (m21354i()) {
            TaskQueue.m21369d(this.f57319v, this.f57320w);
        }
        return snapshotM21365a;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m21353h() {
        boolean z2;
        try {
            byte[] bArr = Util.f57274a;
            if (this.f57314q) {
                return;
            }
            FileSystem fileSystem = FileSystem.f57677a;
            if (fileSystem.mo21500d(this.f57307f)) {
                if (fileSystem.mo21500d(this.f57305c)) {
                    fileSystem.mo21502f(this.f57307f);
                } else {
                    fileSystem.mo21501e(this.f57307f, this.f57305c);
                }
            }
            File file = this.f57307f;
            Intrinsics.m18599g(file, "file");
            Sink sinkMo21498b = fileSystem.mo21498b(file);
            try {
                fileSystem.mo21502f(file);
                sinkMo21498b.close();
                z2 = true;
            } catch (IOException unused) {
                sinkMo21498b.close();
                fileSystem.mo21502f(file);
                z2 = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m18567a(sinkMo21498b, th);
                    throw th2;
                }
            }
            this.f57313p = z2;
            if (FileSystem.f57677a.mo21500d(this.f57305c)) {
                try {
                    m21356k();
                    m21355j();
                    this.f57314q = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.f57701a;
                    Platform platform2 = Platform.f57701a;
                    String str = "DiskLruCache " + this.f57304b + " is corrupt: " + e.getMessage() + ", removing";
                    platform2.getClass();
                    Platform.m21519i(5, str, e);
                    try {
                        close();
                        FileSystem.f57677a.mo21499c(this.f57304b);
                        this.f57315r = false;
                        m21358u();
                        this.f57314q = true;
                    } catch (Throwable th3) {
                        this.f57315r = false;
                        throw th3;
                    }
                }
            }
            m21358u();
            this.f57314q = true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m21354i() {
        int i = this.f57311n;
        return i >= 2000 && i >= this.f57310j.size();
    }

    /* JADX INFO: renamed from: j */
    public final void m21355j() {
        File file = this.f57306d;
        FileSystem fileSystem = FileSystem.f57677a;
        fileSystem.mo21502f(file);
        Iterator it = this.f57310j.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.m18598f(next, "i.next()");
            Entry entry = (Entry) next;
            int i = 0;
            if (entry.f57333g == null) {
                while (i < 2) {
                    this.f57308g += entry.f57328b[i];
                    i++;
                }
            } else {
                entry.f57333g = null;
                while (i < 2) {
                    fileSystem.mo21502f((File) entry.f57329c.get(i));
                    fileSystem.mo21502f((File) entry.f57330d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m21356k() throws IOException {
        File file = this.f57305c;
        FileSystem fileSystem = FileSystem.f57677a;
        RealBufferedSource realBufferedSourceM21671d = Okio.m21671d(fileSystem.mo21497a(file));
        try {
            String strM21691C = realBufferedSourceM21671d.m21691C(Long.MAX_VALUE);
            String strM21691C2 = realBufferedSourceM21671d.m21691C(Long.MAX_VALUE);
            String strM21691C3 = realBufferedSourceM21671d.m21691C(Long.MAX_VALUE);
            String strM21691C4 = realBufferedSourceM21671d.m21691C(Long.MAX_VALUE);
            String strM21691C5 = realBufferedSourceM21671d.m21691C(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strM21691C) || !"1".equals(strM21691C2) || !Intrinsics.m18594b(String.valueOf(201105), strM21691C3) || !Intrinsics.m18594b(String.valueOf(2), strM21691C4) || strM21691C5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strM21691C + ", " + strM21691C2 + ", " + strM21691C4 + ", " + strM21691C5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m21357n(realBufferedSourceM21671d.m21691C(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f57311n = i - this.f57310j.size();
                    if (realBufferedSourceM21671d.m21694a()) {
                        this.f57309i = Okio.m21670c(new FaultHidingSink(fileSystem.mo21503g(file), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                    } else {
                        m21358u();
                    }
                    realBufferedSourceM21671d.close();
                    return;
                }
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m21357n(String str) throws IOException {
        String strSubstring;
        int iM20445u = StringsKt.m20445u(str, ' ', 0, 6);
        if (iM20445u == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iM20445u + 1;
        int iM20445u2 = StringsKt.m20445u(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f57310j;
        if (iM20445u2 == -1) {
            strSubstring = str.substring(i);
            Intrinsics.m18598f(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f57298A;
            if (iM20445u == str2.length() && StringsKt.m20416N(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM20445u2);
            Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = (Entry) linkedHashMap.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            linkedHashMap.put(strSubstring, entry);
        }
        if (iM20445u2 != -1) {
            String str3 = f57301y;
            if (iM20445u == str3.length() && StringsKt.m20416N(str, str3, false)) {
                String strSubstring2 = str.substring(iM20445u2 + 1);
                Intrinsics.m18598f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listM20414L = StringsKt.m20414L(strSubstring2, new char[]{' '});
                entry.f57331e = true;
                entry.f57333g = null;
                int size = listM20414L.size();
                entry.f57336j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listM20414L);
                }
                try {
                    int size2 = listM20414L.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        entry.f57328b[i2] = Long.parseLong((String) listM20414L.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listM20414L);
                }
            }
        }
        if (iM20445u2 == -1) {
            String str4 = f57302z;
            if (iM20445u == str4.length() && StringsKt.m20416N(str, str4, false)) {
                entry.f57333g = new Editor(entry);
                return;
            }
        }
        if (iM20445u2 == -1) {
            String str5 = f57299B;
            if (iM20445u == str5.length() && StringsKt.m20416N(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m21358u() {
        try {
            RealBufferedSink realBufferedSink = this.f57309i;
            if (realBufferedSink != null) {
                realBufferedSink.close();
            }
            RealBufferedSink realBufferedSinkM21670c = Okio.m21670c(FileSystem.f57677a.mo21498b(this.f57306d));
            try {
                realBufferedSinkM21670c.mo21585Z("libcore.io.DiskLruCache");
                realBufferedSinkM21670c.writeByte(10);
                realBufferedSinkM21670c.mo21585Z("1");
                realBufferedSinkM21670c.writeByte(10);
                realBufferedSinkM21670c.mo21579U0(201105);
                realBufferedSinkM21670c.writeByte(10);
                realBufferedSinkM21670c.mo21579U0(2);
                realBufferedSinkM21670c.writeByte(10);
                realBufferedSinkM21670c.writeByte(10);
                Iterator it = this.f57310j.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Entry entry = (Entry) it.next();
                    if (entry.f57333g != null) {
                        realBufferedSinkM21670c.mo21585Z(f57302z);
                        realBufferedSinkM21670c.writeByte(32);
                        realBufferedSinkM21670c.mo21585Z(entry.f57327a);
                        realBufferedSinkM21670c.writeByte(10);
                    } else {
                        realBufferedSinkM21670c.mo21585Z(f57301y);
                        realBufferedSinkM21670c.writeByte(32);
                        realBufferedSinkM21670c.mo21585Z(entry.f57327a);
                        for (long j : entry.f57328b) {
                            realBufferedSinkM21670c.writeByte(32);
                            realBufferedSinkM21670c.mo21579U0(j);
                        }
                        realBufferedSinkM21670c.writeByte(10);
                    }
                }
                realBufferedSinkM21670c.close();
                FileSystem fileSystem = FileSystem.f57677a;
                if (fileSystem.mo21500d(this.f57305c)) {
                    fileSystem.mo21501e(this.f57305c, this.f57307f);
                }
                fileSystem.mo21501e(this.f57306d, this.f57305c);
                fileSystem.mo21502f(this.f57307f);
                this.f57309i = Okio.m21670c(new FaultHidingSink(fileSystem.mo21503g(this.f57305c), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                this.f57312o = false;
                this.f57317t = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m21359x(Entry entry) {
        RealBufferedSink realBufferedSink;
        Intrinsics.m18599g(entry, "entry");
        boolean z2 = this.f57313p;
        String str = entry.f57327a;
        if (!z2) {
            if (entry.f57334h > 0 && (realBufferedSink = this.f57309i) != null) {
                realBufferedSink.mo21585Z(f57302z);
                realBufferedSink.writeByte(32);
                realBufferedSink.mo21585Z(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
            }
            if (entry.f57334h > 0 || entry.f57333g != null) {
                entry.f57332f = true;
                return;
            }
        }
        Editor editor = entry.f57333g;
        if (editor != null) {
            editor.m21363c();
        }
        for (int i = 0; i < 2; i++) {
            FileSystem.f57677a.mo21502f((File) entry.f57329c.get(i));
            long j = this.f57308g;
            long[] jArr = entry.f57328b;
            this.f57308g = j - jArr[i];
            jArr[i] = 0;
        }
        this.f57311n++;
        RealBufferedSink realBufferedSink2 = this.f57309i;
        if (realBufferedSink2 != null) {
            realBufferedSink2.mo21585Z(f57298A);
            realBufferedSink2.writeByte(32);
            realBufferedSink2.mo21585Z(str);
            realBufferedSink2.writeByte(10);
        }
        this.f57310j.remove(str);
        if (m21354i()) {
            TaskQueue.m21369d(this.f57319v, this.f57320w);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        m21359x(r1);
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21360z() {
        while (this.f57308g > 10485760) {
            for (Entry entry : this.f57310j.values()) {
                if (!entry.f57332f) {
                    break;
                }
            }
            return;
        }
        this.f57316s = false;
    }
}
