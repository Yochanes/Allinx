package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class SynchronizedCaptureSessionBaseImpl extends SynchronizedCaptureSession.StateCallback implements SynchronizedCaptureSession, SynchronizedCaptureSessionOpener.OpenerImpl {

    /* JADX INFO: renamed from: b */
    public final CaptureSessionRepository f1873b;

    /* JADX INFO: renamed from: c */
    public final Handler f1874c;

    /* JADX INFO: renamed from: d */
    public final Executor f1875d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f1876e;

    /* JADX INFO: renamed from: f */
    public SynchronizedCaptureSession.StateCallback f1877f;

    /* JADX INFO: renamed from: g */
    public CameraCaptureSessionCompat f1878g;

    /* JADX INFO: renamed from: h */
    public ListenableFuture f1879h;

    /* JADX INFO: renamed from: i */
    public CallbackToFutureAdapter.Completer f1880i;

    /* JADX INFO: renamed from: j */
    public FutureChain f1881j;

    /* JADX INFO: renamed from: a */
    public final Object f1872a = new Object();

    /* JADX INFO: renamed from: k */
    public List f1882k = null;

    /* JADX INFO: renamed from: l */
    public boolean f1883l = false;

    /* JADX INFO: renamed from: m */
    public boolean f1884m = false;

    /* JADX INFO: renamed from: n */
    public boolean f1885n = false;

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C01821 implements FutureCallback<Void> {
        public C01821() {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            SynchronizedCaptureSession synchronizedCaptureSession;
            SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
            synchronizedCaptureSessionBaseImpl.m1062u();
            CaptureSessionRepository captureSessionRepository = synchronizedCaptureSessionBaseImpl.f1873b;
            Iterator it = captureSessionRepository.m1009a().iterator();
            while (it.hasNext() && (synchronizedCaptureSession = (SynchronizedCaptureSession) it.next()) != synchronizedCaptureSessionBaseImpl) {
                synchronizedCaptureSession.mo1049e();
            }
            synchronized (captureSessionRepository.f1755b) {
                captureSessionRepository.f1758e.remove(synchronizedCaptureSessionBaseImpl);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$2 */
    /* JADX INFO: compiled from: Proguard */
    class C01832 extends CameraCaptureSession.StateCallback {
        public C01832() {
        }

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
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(CameraCaptureSession cameraCaptureSession) {
            SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
            synchronizedCaptureSessionBaseImpl.m1061t(cameraCaptureSession);
            synchronizedCaptureSessionBaseImpl.mo1055l(synchronizedCaptureSessionBaseImpl);
        }

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
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
            synchronizedCaptureSessionBaseImpl.m1061t(cameraCaptureSession);
            synchronizedCaptureSessionBaseImpl.mo1056m(synchronizedCaptureSessionBaseImpl);
        }

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
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(CameraCaptureSession cameraCaptureSession) {
            SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
            synchronizedCaptureSessionBaseImpl.m1061t(cameraCaptureSession);
            synchronizedCaptureSessionBaseImpl.mo1057n(synchronizedCaptureSessionBaseImpl);
        }

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
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            CallbackToFutureAdapter.Completer completer;
            try {
                SynchronizedCaptureSessionBaseImpl.this.m1061t(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.mo1005o(synchronizedCaptureSessionBaseImpl);
                synchronized (SynchronizedCaptureSessionBaseImpl.this.f1872a) {
                    Preconditions.m7698e(SynchronizedCaptureSessionBaseImpl.this.f1880i, "OpenCaptureSession completer should not null");
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                    completer = synchronizedCaptureSessionBaseImpl2.f1880i;
                    synchronizedCaptureSessionBaseImpl2.f1880i = null;
                }
                completer.m6744d(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (SynchronizedCaptureSessionBaseImpl.this.f1872a) {
                    Preconditions.m7698e(SynchronizedCaptureSessionBaseImpl.this.f1880i, "OpenCaptureSession completer should not null");
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                    CallbackToFutureAdapter.Completer completer2 = synchronizedCaptureSessionBaseImpl3.f1880i;
                    synchronizedCaptureSessionBaseImpl3.f1880i = null;
                    completer2.m6744d(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

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
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            CallbackToFutureAdapter.Completer completer;
            try {
                SynchronizedCaptureSessionBaseImpl.this.m1061t(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.mo1006p(synchronizedCaptureSessionBaseImpl);
                synchronized (SynchronizedCaptureSessionBaseImpl.this.f1872a) {
                    Preconditions.m7698e(SynchronizedCaptureSessionBaseImpl.this.f1880i, "OpenCaptureSession completer should not null");
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                    completer = synchronizedCaptureSessionBaseImpl2.f1880i;
                    synchronizedCaptureSessionBaseImpl2.f1880i = null;
                }
                completer.m6742b(null);
            } catch (Throwable th) {
                synchronized (SynchronizedCaptureSessionBaseImpl.this.f1872a) {
                    Preconditions.m7698e(SynchronizedCaptureSessionBaseImpl.this.f1880i, "OpenCaptureSession completer should not null");
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                    CallbackToFutureAdapter.Completer completer2 = synchronizedCaptureSessionBaseImpl3.f1880i;
                    synchronizedCaptureSessionBaseImpl3.f1880i = null;
                    completer2.m6742b(null);
                    throw th;
                }
            }
        }

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
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(CameraCaptureSession cameraCaptureSession) {
            SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
            synchronizedCaptureSessionBaseImpl.m1061t(cameraCaptureSession);
            synchronizedCaptureSessionBaseImpl.mo1007q(synchronizedCaptureSessionBaseImpl);
        }

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
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
            synchronizedCaptureSessionBaseImpl.m1061t(cameraCaptureSession);
            synchronizedCaptureSessionBaseImpl.mo1058s(synchronizedCaptureSessionBaseImpl, surface);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Surface m1063a(CameraCaptureSession cameraCaptureSession) {
            return cameraCaptureSession.getInputSurface();
        }
    }

    public SynchronizedCaptureSessionBaseImpl(CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f1873b = captureSessionRepository;
        this.f1874c = handler;
        this.f1875d = executor;
        this.f1876e = scheduledExecutorService;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    /* JADX INFO: renamed from: a */
    public final void mo1046a() throws CameraAccessException {
        Preconditions.m7698e(this.f1878g, "Need to call openCaptureSession before using this API.");
        this.f1878g.m1085c().abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    /* JADX INFO: renamed from: c */
    public final void mo1048c() throws CameraAccessException {
        Preconditions.m7698e(this.f1878g, "Need to call openCaptureSession before using this API.");
        this.f1878g.m1085c().stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        Preconditions.m7698e(this.f1878g, "Need to call openCaptureSession before using this API.");
        CaptureSessionRepository captureSessionRepository = this.f1873b;
        synchronized (captureSessionRepository.f1755b) {
            captureSessionRepository.f1757d.add(this);
        }
        this.f1878g.m1085c().close();
        this.f1875d.execute(new RunnableC0211l(this, 4));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    /* JADX INFO: renamed from: d */
    public ListenableFuture mo1059d(ArrayList arrayList) {
        synchronized (this.f1872a) {
            try {
                if (this.f1884m) {
                    return Futures.m1628e(new CancellationException("Opener is disabled"));
                }
                FutureChain futureChainM1623a = FutureChain.m1623a(DeferrableSurfaces.m1484c(arrayList, this.f1875d, this.f1876e));
                C0221v c0221v = new C0221v(2, this, arrayList);
                Executor executor = this.f1875d;
                futureChainM1623a.getClass();
                FutureChain futureChain = (FutureChain) Futures.m1635l(futureChainM1623a, c0221v, executor);
                this.f1881j = futureChain;
                return Futures.m1631h(futureChain);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    /* JADX INFO: renamed from: e */
    public final void mo1049e() {
        m1062u();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    /* JADX INFO: renamed from: f */
    public final CameraCaptureSessionCompat mo1050f() {
        this.f1878g.getClass();
        return this.f1878g;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    /* JADX INFO: renamed from: g */
    public final int mo1051g(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.m7698e(this.f1878g, "Need to call openCaptureSession before using this API.");
        return this.f1878g.m1083a(arrayList, this.f1875d, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    /* JADX INFO: renamed from: h */
    public final CameraDevice mo1052h() {
        this.f1878g.getClass();
        return this.f1878g.m1085c().getDevice();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    /* JADX INFO: renamed from: i */
    public int mo1053i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.m7698e(this.f1878g, "Need to call openCaptureSession before using this API.");
        return this.f1878g.m1084b(captureRequest, this.f1875d, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    /* JADX INFO: renamed from: j */
    public ListenableFuture mo1060j(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        synchronized (this.f1872a) {
            try {
                if (this.f1884m) {
                    return Futures.m1628e(new CancellationException("Opener is disabled"));
                }
                CaptureSessionRepository captureSessionRepository = this.f1873b;
                synchronized (captureSessionRepository.f1755b) {
                    captureSessionRepository.f1758e.add(this);
                }
                ListenableFuture listenableFutureM6740a = CallbackToFutureAdapter.m6740a(new C0171E(this, list, new CameraDeviceCompat(cameraDevice, this.f1874c), sessionConfigurationCompat));
                this.f1879h = listenableFutureM6740a;
                Futures.m1624a(listenableFutureM6740a, new C01821(), CameraXExecutors.m1615a());
                return Futures.m1631h(this.f1879h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    /* JADX INFO: renamed from: k */
    public ListenableFuture mo1054k() {
        return Futures.m1630g(null);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: l */
    public final void mo1055l(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f1877f);
        this.f1877f.mo1055l(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: m */
    public final void mo1056m(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f1877f);
        this.f1877f.mo1056m(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: n */
    public void mo1057n(SynchronizedCaptureSession synchronizedCaptureSession) {
        ListenableFuture listenableFuture;
        synchronized (this.f1872a) {
            try {
                if (this.f1883l) {
                    listenableFuture = null;
                } else {
                    this.f1883l = true;
                    Preconditions.m7698e(this.f1879h, "Need to call openCaptureSession before using this API.");
                    listenableFuture = this.f1879h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m1062u();
        if (listenableFuture != null) {
            listenableFuture.addListener(new RunnableC0170D(this, synchronizedCaptureSession, 0), CameraXExecutors.m1615a());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: o */
    public final void mo1005o(SynchronizedCaptureSession synchronizedCaptureSession) {
        SynchronizedCaptureSession synchronizedCaptureSession2;
        Objects.requireNonNull(this.f1877f);
        m1062u();
        CaptureSessionRepository captureSessionRepository = this.f1873b;
        Iterator it = captureSessionRepository.m1009a().iterator();
        while (it.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it.next()) != this) {
            synchronizedCaptureSession2.mo1049e();
        }
        synchronized (captureSessionRepository.f1755b) {
            captureSessionRepository.f1758e.remove(this);
        }
        this.f1877f.mo1005o(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: p */
    public void mo1006p(SynchronizedCaptureSession synchronizedCaptureSession) {
        SynchronizedCaptureSession synchronizedCaptureSession2;
        Objects.requireNonNull(this.f1877f);
        CaptureSessionRepository captureSessionRepository = this.f1873b;
        synchronized (captureSessionRepository.f1755b) {
            captureSessionRepository.f1756c.add(this);
            captureSessionRepository.f1758e.remove(this);
        }
        Iterator it = captureSessionRepository.m1009a().iterator();
        while (it.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it.next()) != this) {
            synchronizedCaptureSession2.mo1049e();
        }
        this.f1877f.mo1006p(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: q */
    public final void mo1007q(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f1877f);
        this.f1877f.mo1007q(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: r */
    public final void mo1008r(SynchronizedCaptureSession synchronizedCaptureSession) {
        ListenableFuture listenableFuture;
        synchronized (this.f1872a) {
            try {
                if (this.f1885n) {
                    listenableFuture = null;
                } else {
                    this.f1885n = true;
                    Preconditions.m7698e(this.f1879h, "Need to call openCaptureSession before using this API.");
                    listenableFuture = this.f1879h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (listenableFuture != null) {
            listenableFuture.addListener(new RunnableC0170D(this, synchronizedCaptureSession, 1), CameraXExecutors.m1615a());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: s */
    public final void mo1058s(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        Objects.requireNonNull(this.f1877f);
        this.f1877f.mo1058s(synchronizedCaptureSession, surface);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    public boolean stop() {
        boolean z2;
        boolean z3;
        try {
            synchronized (this.f1872a) {
                try {
                    if (!this.f1884m) {
                        FutureChain futureChain = this.f1881j;
                        futureChain = futureChain != null ? futureChain : null;
                        this.f1884m = true;
                    }
                    synchronized (this.f1872a) {
                        z2 = this.f1879h != null;
                    }
                    z3 = !z2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z3;
        } finally {
            if (futureChain != null) {
                futureChain.cancel(true);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m1061t(CameraCaptureSession cameraCaptureSession) {
        if (this.f1878g == null) {
            this.f1878g = new CameraCaptureSessionCompat(cameraCaptureSession, this.f1874c);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1062u() {
        synchronized (this.f1872a) {
            try {
                List list = this.f1882k;
                if (list != null) {
                    DeferrableSurfaces.m1482a(list);
                    this.f1882k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    /* JADX INFO: renamed from: b */
    public final SynchronizedCaptureSession.StateCallback mo1047b() {
        return this;
    }
}
