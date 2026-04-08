package io.ktor.network.sockets;

import io.ktor.network.selector.SelectableBase;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.utils.p043io.ByteBufferChannel;
import io.ktor.utils.p043io.ByteWriteChannelKt;
import io.ktor.utils.p043io.ReaderJob;
import io.ktor.utils.p043io.WriterJob;
import java.nio.channels.ByteChannel;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u000e\b\u0000\u0010\u0003 \u0001*\u00020\u0001*\u00020\u00022\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/ktor/network/sockets/NIOSocketImpl;", "Ljava/nio/channels/ByteChannel;", "Ljava/nio/channels/SelectableChannel;", "S", "Lio/ktor/network/sockets/ReadWriteSocket;", "Lio/ktor/network/selector/SelectableBase;", "Lkotlinx/coroutines/CoroutineScope;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class NIOSocketImpl<S extends SelectableChannel & ByteChannel> extends SelectableBase implements ReadWriteSocket, CoroutineScope {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f46079p = 0;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f46080d;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f46081f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f46082g;

    /* JADX INFO: renamed from: i */
    public final JobImpl f46083i;

    /* JADX INFO: renamed from: j */
    public final SocketChannel f46084j;

    /* JADX INFO: renamed from: n */
    public final SelectorManager f46085n;

    /* JADX INFO: renamed from: o */
    public final SocketOptions.TCPClientSocketOptions f46086o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NIOSocketImpl(SocketChannel socketChannel, SelectorManager selector, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        super(socketChannel);
        Intrinsics.m18599g(selector, "selector");
        this.f46084j = socketChannel;
        this.f46085n = selector;
        this.f46086o = tCPClientSocketOptions;
        this.f46080d = new AtomicBoolean();
        this.f46081f = new AtomicReference();
        this.f46082g = new AtomicReference();
        this.f46083i = JobKt.m20598a();
    }

    @Override // io.ktor.network.sockets.AWritable
    /* JADX INFO: renamed from: a */
    public final ReaderJob mo17096a(ByteBufferChannel byteBufferChannel) {
        return (ReaderJob) m17105i("writing", byteBufferChannel, this.f46081f, new NIOSocketImpl$attachForWriting$1(this, byteBufferChannel));
    }

    @Override // io.ktor.network.selector.SelectableBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.ktor.utils.p043io.ByteChannel byteChannelMo17383h;
        if (this.f46080d.compareAndSet(false, true)) {
            ReaderJob readerJob = (ReaderJob) this.f46081f.get();
            if (readerJob != null && (byteChannelMo17383h = readerJob.mo17383h()) != null) {
                ByteWriteChannelKt.m17380a(byteChannelMo17383h);
            }
            WriterJob writerJob = (WriterJob) this.f46082g.get();
            if (writerJob != null) {
                Job.DefaultImpls.m20595a(writerJob);
            }
            m17106j();
        }
    }

    @Override // io.ktor.network.sockets.AReadable
    /* JADX INFO: renamed from: d */
    public final WriterJob mo17095d(ByteBufferChannel byteBufferChannel) {
        return (WriterJob) m17105i("reading", byteBufferChannel, this.f46082g, new NIOSocketImpl$attachForReading$1(this, byteBufferChannel));
    }

    @Override // io.ktor.network.selector.SelectableBase, kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        close();
    }

    @Override // io.ktor.network.selector.SelectableBase, io.ktor.network.selector.Selectable
    /* JADX INFO: renamed from: e */
    public SelectableChannel mo17086e() {
        return this.f46084j;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF46617f() {
        return this.f46083i;
    }

    /* JADX INFO: renamed from: i */
    public final Job m17105i(String str, ByteBufferChannel byteBufferChannel, AtomicReference atomicReference, Function0 function0) throws ClosedChannelException {
        AtomicBoolean atomicBoolean = this.f46080d;
        if (atomicBoolean.get()) {
            ClosedChannelException closedChannelException = new ClosedChannelException();
            byteBufferChannel.mo17293b(closedChannelException);
            throw closedChannelException;
        }
        Job job = (Job) function0.invoke();
        while (!atomicReference.compareAndSet(null, job)) {
            if (atomicReference.get() != null) {
                IllegalStateException illegalStateException = new IllegalStateException(str.concat(" channel has been already set"));
                job.mo17054i(null);
                throw illegalStateException;
            }
        }
        if (!atomicBoolean.get()) {
            byteBufferChannel.m17271Q(job);
            job.mo17055w0(new NIOSocketImpl$attachFor$1(this));
            return job;
        }
        ClosedChannelException closedChannelException2 = new ClosedChannelException();
        job.mo17054i(null);
        byteBufferChannel.mo17293b(closedChannelException2);
        throw closedChannelException2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17106j() {
        Throwable cause;
        Throwable cause2;
        CancellationException cancellationExceptionMo17051N;
        CancellationException cancellationExceptionMo17051N2;
        if (this.f46080d.get()) {
            AtomicReference atomicReference = this.f46081f;
            Job job = (Job) atomicReference.get();
            if (job == null || job.mo17052O0()) {
                AtomicReference atomicReference2 = this.f46082g;
                Job job2 = (Job) atomicReference2.get();
                if (job2 == null || job2.mo17052O0()) {
                    Job job3 = (Job) atomicReference.get();
                    Throwable th = null;
                    if (job3 == null) {
                        cause = null;
                    } else {
                        if (!job3.isCancelled()) {
                            job3 = null;
                        }
                        if (job3 != null && (cancellationExceptionMo17051N2 = job3.mo17051N()) != null) {
                            cause = cancellationExceptionMo17051N2.getCause();
                        }
                    }
                    Job job4 = (Job) atomicReference2.get();
                    if (job4 == null) {
                        cause2 = null;
                    } else {
                        if (!job4.isCancelled()) {
                            job4 = null;
                        }
                        if (job4 != null && (cancellationExceptionMo17051N = job4.mo17051N()) != null) {
                            cause2 = cancellationExceptionMo17051N.getCause();
                        }
                    }
                    SelectorManager selectorManager = this.f46085n;
                    try {
                        ((ByteChannel) mo17086e()).close();
                        super.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    selectorManager.mo17068M0(this);
                    if (cause == null) {
                        cause = cause2;
                    } else if (cause2 != null && cause != cause2) {
                        ExceptionsKt.m18297a(cause, cause2);
                    }
                    if (cause != null) {
                        if (th != null && cause != th) {
                            ExceptionsKt.m18297a(cause, th);
                        }
                        th = cause;
                    }
                    JobImpl jobImpl = this.f46083i;
                    if (th == null) {
                        jobImpl.mo20549a();
                    } else {
                        jobImpl.mo20550d(th);
                    }
                }
            }
        }
    }
}
