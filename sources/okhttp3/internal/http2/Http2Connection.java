package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Http2Stream;
import okio.Buffer;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Http2Connection implements Closeable {

    /* JADX INFO: renamed from: F */
    public static final Settings f57553F;

    /* JADX INFO: renamed from: A */
    public long f57554A;

    /* JADX INFO: renamed from: B */
    public final Socket f57555B;

    /* JADX INFO: renamed from: C */
    public final Http2Writer f57556C;

    /* JADX INFO: renamed from: D */
    public final ReaderRunnable f57557D;

    /* JADX INFO: renamed from: E */
    public final LinkedHashSet f57558E;

    /* JADX INFO: renamed from: a */
    public final Listener f57559a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f57560b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final String f57561c;

    /* JADX INFO: renamed from: d */
    public int f57562d;

    /* JADX INFO: renamed from: f */
    public int f57563f;

    /* JADX INFO: renamed from: g */
    public boolean f57564g;

    /* JADX INFO: renamed from: i */
    public final TaskRunner f57565i;

    /* JADX INFO: renamed from: j */
    public final TaskQueue f57566j;

    /* JADX INFO: renamed from: n */
    public final TaskQueue f57567n;

    /* JADX INFO: renamed from: o */
    public final TaskQueue f57568o;

    /* JADX INFO: renamed from: p */
    public final PushObserver f57569p;

    /* JADX INFO: renamed from: q */
    public long f57570q;

    /* JADX INFO: renamed from: r */
    public long f57571r;

    /* JADX INFO: renamed from: s */
    public long f57572s;

    /* JADX INFO: renamed from: t */
    public long f57573t;

    /* JADX INFO: renamed from: u */
    public long f57574u;

    /* JADX INFO: renamed from: v */
    public final Settings f57575v;

    /* JADX INFO: renamed from: w */
    public Settings f57576w;

    /* JADX INFO: renamed from: x */
    public long f57577x;

    /* JADX INFO: renamed from: y */
    public long f57578y;

    /* JADX INFO: renamed from: z */
    public long f57579z;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final TaskRunner f57580a;

        /* JADX INFO: renamed from: b */
        public Socket f57581b;

        /* JADX INFO: renamed from: c */
        public String f57582c;

        /* JADX INFO: renamed from: d */
        public RealBufferedSource f57583d;

        /* JADX INFO: renamed from: e */
        public RealBufferedSink f57584e;

        /* JADX INFO: renamed from: f */
        public Listener f57585f;

        /* JADX INFO: renamed from: g */
        public final PushObserver f57586g;

        public Builder(TaskRunner taskRunner) {
            Intrinsics.m18599g(taskRunner, "taskRunner");
            this.f57580a = taskRunner;
            this.f57585f = Listener.f57587a;
            this.f57586g = PushObserver.f57673a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m18302d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class Listener {

        /* JADX INFO: renamed from: a */
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 f57587a = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "Lokhttp3/internal/http2/Http2Connection$Listener;", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        /* JADX INFO: renamed from: a */
        public void mo21403a(Http2Connection connection, Settings settings) {
            Intrinsics.m18599g(connection, "connection");
            Intrinsics.m18599g(settings, "settings");
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo21404b(Http2Stream http2Stream);
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m18302d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {

        /* JADX INFO: renamed from: a */
        public final Http2Reader f57588a;

        public ReaderRunnable(Http2Reader http2Reader) {
            this.f57588a = http2Reader;
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
        
            if (r19 == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
        
            r4.m21480i(okhttp3.internal.Util.f57275b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m21465a(boolean z2, int i, RealBufferedSource source, int i2) throws EOFException {
            boolean z3;
            long j;
            boolean z4;
            Intrinsics.m18599g(source, "source");
            Http2Connection.this.getClass();
            long j2 = 0;
            if (!(i != 0 && (i & 1) == 0)) {
                Http2Stream http2StreamM21458d = Http2Connection.this.m21458d(i);
                if (http2StreamM21458d != null) {
                    byte[] bArr = Util.f57274a;
                    Http2Stream.FramingSource framingSource = http2StreamM21458d.f57644i;
                    long j3 = i2;
                    framingSource.getClass();
                    long j4 = j3;
                    while (true) {
                        if (j4 <= j2) {
                            byte[] bArr2 = Util.f57274a;
                            Http2Stream.this.f57637b.m21461i(j3);
                            break;
                        }
                        synchronized (Http2Stream.this) {
                            z3 = framingSource.f57655b;
                            j = j2;
                            z4 = framingSource.f57657d.f57830b + j4 > framingSource.f57654a;
                        }
                        if (z4) {
                            source.m21693L(j4);
                            Http2Stream.this.m21476e(ErrorCode.FLOW_CONTROL_ERROR);
                            break;
                        }
                        if (z3) {
                            source.m21693L(j4);
                            break;
                        }
                        long jMo12415J0 = source.mo12415J0(framingSource.f57656c, j4);
                        if (jMo12415J0 == -1) {
                            throw new EOFException();
                        }
                        j4 -= jMo12415J0;
                        Http2Stream http2Stream = Http2Stream.this;
                        synchronized (http2Stream) {
                            try {
                                if (framingSource.f57658f) {
                                    framingSource.f57656c.m21586a();
                                } else {
                                    Buffer buffer = framingSource.f57657d;
                                    boolean z5 = buffer.f57830b == j;
                                    buffer.mo21600q0(framingSource.f57656c);
                                    if (z5) {
                                        http2Stream.notifyAll();
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        j2 = j;
                    }
                } else {
                    Http2Connection.this.m21463k(i, ErrorCode.PROTOCOL_ERROR);
                    long j5 = i2;
                    Http2Connection.this.m21461i(j5);
                    source.m21693L(j5);
                }
            } else {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.getClass();
                Buffer buffer2 = new Buffer();
                long j6 = i2;
                source.m21692H(j6);
                source.mo12415J0(buffer2, j6);
                http2Connection.f57567n.m21372c(new Http2Connection$pushDataLater$$inlined$execute$default$1(http2Connection.f57561c + '[' + i + "] onData", http2Connection, i, buffer2, i2, z2), 0L);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m21466b(int i, List list, boolean z2) {
            Http2Connection.this.getClass();
            if (i != 0 && (i & 1) == 0) {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.getClass();
                http2Connection.f57567n.m21372c(new Http2Connection$pushHeadersLater$$inlined$execute$default$1(http2Connection.f57561c + '[' + i + "] onHeaders", http2Connection, i, list, z2), 0L);
                return;
            }
            Http2Connection http2Connection2 = Http2Connection.this;
            synchronized (http2Connection2) {
                Http2Stream http2StreamM21458d = http2Connection2.m21458d(i);
                if (http2StreamM21458d != null) {
                    http2StreamM21458d.m21480i(Util.m21340w(list), z2);
                    return;
                }
                if (http2Connection2.f57564g) {
                    return;
                }
                if (i <= http2Connection2.f57562d) {
                    return;
                }
                if (i % 2 == http2Connection2.f57563f % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i, http2Connection2, false, z2, Util.m21340w(list));
                http2Connection2.f57562d = i;
                http2Connection2.f57560b.put(Integer.valueOf(i), http2Stream);
                http2Connection2.f57565i.m21379e().m21372c(new C6361x937effeb(http2Connection2.f57561c + '[' + i + "] onStream", http2Connection2, http2Stream), 0L);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m21467c(int i, List list) {
            Http2Connection http2Connection = Http2Connection.this;
            http2Connection.getClass();
            synchronized (http2Connection) {
                if (http2Connection.f57558E.contains(Integer.valueOf(i))) {
                    http2Connection.m21463k(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.f57558E.add(Integer.valueOf(i));
                http2Connection.f57567n.m21372c(new Http2Connection$pushRequestLater$$inlined$execute$default$1(http2Connection.f57561c + '[' + i + "] onRequest", http2Connection, i, list), 0L);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.Http2Connection] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            Throwable th;
            ErrorCode errorCode;
            ?? r0 = Http2Connection.this;
            Http2Reader http2Reader = this.f57588a;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ?? r3 = 1;
            IOException e = null;
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                    errorCode = errorCode2;
                }
                if (!http2Reader.m21468a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } while (http2Reader.m21468a(false, this));
                errorCode = ErrorCode.NO_ERROR;
                try {
                    errorCode2 = ErrorCode.CANCEL;
                    r0.m21456a(errorCode, errorCode2, null);
                    r3 = errorCode;
                } catch (IOException e3) {
                    e = e3;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    r0.m21456a(errorCode2, errorCode2, e);
                    r3 = errorCode;
                }
                Util.m21320c(http2Reader);
                return Unit.f51459a;
            } catch (Throwable th4) {
                th = th4;
            }
            r3 = errorCode2;
            r0.m21456a(r3, errorCode2, e);
            Util.m21320c(http2Reader);
            throw th;
        }
    }

    static {
        Settings settings = new Settings();
        settings.m21496c(7, 65535);
        settings.m21496c(5, 16384);
        f57553F = settings;
    }

    public Http2Connection(Builder builder) {
        this.f57559a = builder.f57585f;
        String str = builder.f57582c;
        if (str == null) {
            Intrinsics.m18606n("connectionName");
            throw null;
        }
        this.f57561c = str;
        this.f57563f = 3;
        TaskRunner taskRunner = builder.f57580a;
        this.f57565i = taskRunner;
        this.f57566j = taskRunner.m21379e();
        this.f57567n = taskRunner.m21379e();
        this.f57568o = taskRunner.m21379e();
        this.f57569p = PushObserver.f57673a;
        Settings settings = new Settings();
        settings.m21496c(7, 16777216);
        this.f57575v = settings;
        this.f57576w = f57553F;
        this.f57554A = r0.m21494a();
        Socket socket = builder.f57581b;
        if (socket == null) {
            Intrinsics.m18606n("socket");
            throw null;
        }
        this.f57555B = socket;
        RealBufferedSink realBufferedSink = builder.f57584e;
        if (realBufferedSink == null) {
            Intrinsics.m18606n("sink");
            throw null;
        }
        this.f57556C = new Http2Writer(realBufferedSink);
        RealBufferedSource realBufferedSource = builder.f57583d;
        if (realBufferedSource == null) {
            Intrinsics.m18606n("source");
            throw null;
        }
        this.f57557D = new ReaderRunnable(new Http2Reader(realBufferedSource));
        this.f57558E = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public final void m21456a(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        byte[] bArr = Util.f57274a;
        try {
            m21460h(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f57560b.isEmpty()) {
                array = null;
            } else {
                array = this.f57560b.values().toArray(new Http2Stream[0]);
                this.f57560b.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.m21474c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f57556C.close();
        } catch (IOException unused3) {
        }
        try {
            this.f57555B.close();
        } catch (IOException unused4) {
        }
        this.f57566j.m21374f();
        this.f57567n.m21374f();
        this.f57568o.m21374f();
    }

    /* JADX INFO: renamed from: b */
    public final void m21457b(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        m21456a(errorCode, errorCode, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m21456a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Http2Stream m21458d(int i) {
        return (Http2Stream) this.f57560b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.f57556C.flush();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Http2Stream m21459g(int i) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f57560b.remove(Integer.valueOf(i));
        notifyAll();
        return http2Stream;
    }

    /* JADX INFO: renamed from: h */
    public final void m21460h(ErrorCode errorCode) {
        synchronized (this.f57556C) {
            synchronized (this) {
                if (this.f57564g) {
                    return;
                }
                this.f57564g = true;
                this.f57556C.m21489g(this.f57562d, errorCode, Util.f57274a);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m21461i(long j) {
        long j2 = this.f57577x + j;
        this.f57577x = j2;
        long j3 = j2 - this.f57578y;
        if (j3 >= this.f57575v.m21494a() / 2) {
            m21464n(0, j3);
            this.f57578y += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f57556C.f57664c);
        r6 = r2;
        r8.f57579z += r6;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21462j(int i, boolean z2, Buffer buffer, long j) {
        int iMin;
        long j2;
        if (j == 0) {
            this.f57556C.m21487b(z2, i, buffer, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.f57579z;
                            long j4 = this.f57554A;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.f57560b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.f57556C.m21487b(z2 && j == 0, i, buffer, iMin);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m21463k(int i, ErrorCode errorCode) {
        this.f57566j.m21372c(new Http2Connection$writeSynResetLater$$inlined$execute$default$1(this.f57561c + '[' + i + "] writeSynReset", this, i, errorCode), 0L);
    }

    /* JADX INFO: renamed from: n */
    public final void m21464n(int i, long j) {
        this.f57566j.m21372c(new C6363x3eab89f6(this.f57561c + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
