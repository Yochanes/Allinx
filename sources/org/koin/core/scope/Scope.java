package org.koin.core.scope;

import android.content.ComponentCallbacks;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.ext.KClassExtKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@KoinDslMarker
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lorg/koin/core/scope/Scope;", "", "Lorg/koin/mp/Lockable;", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Scope {

    /* JADX INFO: renamed from: a */
    public final Qualifier f58246a;

    /* JADX INFO: renamed from: b */
    public final String f58247b;

    /* JADX INFO: renamed from: c */
    public final boolean f58248c;

    /* JADX INFO: renamed from: d */
    public final Koin f58249d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f58250e;

    /* JADX INFO: renamed from: f */
    public ComponentCallbacks f58251f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f58252g;

    /* JADX INFO: renamed from: h */
    public final ThreadLocal f58253h;

    /* JADX INFO: renamed from: i */
    public boolean f58254i;

    public Scope(Qualifier scopeQualifier, String id, boolean z2, Koin _koin) {
        Intrinsics.m18599g(scopeQualifier, "scopeQualifier");
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(_koin, "_koin");
        this.f58246a = scopeQualifier;
        this.f58247b = id;
        this.f58248c = z2;
        this.f58249d = _koin;
        this.f58250e = new ArrayList();
        this.f58252g = new ArrayList();
        this.f58253h = new ThreadLocal();
    }

    /* JADX INFO: renamed from: a */
    public final void m21811a() {
        Scope$close$1 scope$close$1 = new Scope$close$1(this);
        synchronized (this) {
            scope$close$1.invoke();
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m21812b(KClass clazz, Function0 function0) throws ClosedScopeException, NoBeanDefFoundException {
        Intrinsics.m18599g(clazz, "clazz");
        Koin koin = this.f58249d;
        Logger logger = koin.f58196c;
        Level level = Level.f58221a;
        if (!logger.m21807c(level)) {
            return m21814d(clazz, function0);
        }
        koin.f58196c.mo21787b(level, "|- '" + KClassExtKt.m21815a(clazz) + "' ...");
        long jNanoTime = System.nanoTime();
        Object objM21814d = m21814d(clazz, function0);
        double dNanoTime = ((double) (System.nanoTime() - jNanoTime)) / 1000000.0d;
        koin.f58196c.mo21787b(level, "|- '" + KClassExtKt.m21815a(clazz) + "' in " + dNanoTime + " ms");
        return objM21814d;
    }

    /* JADX INFO: renamed from: c */
    public final Object m21813c(KClass clazz, Function0 function0) {
        Koin koin = this.f58249d;
        Intrinsics.m18599g(clazz, "clazz");
        try {
            return m21812b(clazz, function0);
        } catch (ClosedScopeException unused) {
            koin.f58196c.m21806a("* Scope closed - no instance found for " + KClassExtKt.m21815a(clazz) + " on scope " + this);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            koin.f58196c.m21806a("* No instance found for type '" + KClassExtKt.m21815a(clazz) + "' on scope '" + this + '\'');
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m21814d(KClass clazz, Function0 function0) throws ClosedScopeException, NoBeanDefFoundException {
        ArrayDeque arrayDeque;
        ParametersHolder parametersHolder;
        if (this.f58254i) {
            String msg = "Scope '" + this.f58247b + "' is closed";
            Intrinsics.m18599g(msg, "msg");
            throw new ClosedScopeException(msg);
        }
        Object objM21813c = null;
        ParametersHolder parametersHolder2 = function0 != null ? (ParametersHolder) function0.invoke() : null;
        ThreadLocal threadLocal = this.f58253h;
        Koin koin = this.f58249d;
        if (parametersHolder2 != null) {
            Logger logger = koin.f58196c;
            Level level = Level.f58221a;
            Scope$resolveInstance$1 scope$resolveInstance$1 = new Scope$resolveInstance$1(parametersHolder2);
            logger.getClass();
            if (logger.m21807c(level)) {
                logger.mo21787b(level, (String) scope$resolveInstance$1.invoke());
            }
            arrayDeque = (ArrayDeque) threadLocal.get();
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                threadLocal.set(arrayDeque);
            }
            arrayDeque.addFirst(parametersHolder2);
        } else {
            arrayDeque = null;
        }
        InstanceContext instanceContext = new InstanceContext(koin.f58196c, this, parametersHolder2);
        InstanceRegistry instanceRegistry = koin.f58195b;
        instanceRegistry.getClass();
        Intrinsics.m18599g(clazz, "clazz");
        Qualifier scopeQualifier = this.f58246a;
        Intrinsics.m18599g(scopeQualifier, "scopeQualifier");
        InstanceFactory instanceFactory = (InstanceFactory) instanceRegistry.f58239b.get(BeanDefinitionKt.m21803a(clazz, scopeQualifier));
        Object objMo21804b = instanceFactory != null ? instanceFactory.mo21804b(instanceContext) : null;
        if (objMo21804b == null) {
            objMo21804b = null;
        }
        if (objMo21804b == null) {
            koin.f58196c.m21806a("|- ? t:'" + KClassExtKt.m21815a(clazz) + "' - q:'null' look in injected parameters");
            ArrayDeque arrayDeque2 = (ArrayDeque) threadLocal.get();
            objMo21804b = (arrayDeque2 == null || (parametersHolder = (ParametersHolder) arrayDeque2.m18327j()) == null) ? null : parametersHolder.mo21794a(clazz);
            if (objMo21804b == null) {
                if (!this.f58248c) {
                    koin.f58196c.m21806a("|- ? t:'" + KClassExtKt.m21815a(clazz) + "' - q:'null' look at scope source");
                    ComponentCallbacks componentCallbacks = this.f58251f;
                    if (componentCallbacks == null || !clazz.mo18589m(componentCallbacks) || (objMo21804b = this.f58251f) == null) {
                        objMo21804b = null;
                    }
                    if (objMo21804b == null) {
                        koin.f58196c.m21806a("|- ? t:'" + KClassExtKt.m21815a(clazz) + "' - q:'null' look in other scopes");
                        Iterator it = this.f58250e.iterator();
                        while (it.hasNext() && (objM21813c = ((Scope) it.next()).m21813c(clazz, function0)) == null) {
                        }
                        objMo21804b = objM21813c;
                        if (objMo21804b == null) {
                            if (function0 != null) {
                                threadLocal.remove();
                                koin.f58196c.m21806a("|- << parameters");
                            }
                            String msg2 = "No definition found for type '" + KClassExtKt.m21815a(clazz) + "'. Check your Modules configuration and add missing type and/or qualifier!";
                            Intrinsics.m18599g(msg2, "msg");
                            throw new NoBeanDefFoundException(msg2);
                        }
                    }
                }
            }
        }
        if (arrayDeque != null) {
            koin.f58196c.m21806a("| << parameters");
            if (arrayDeque.isEmpty()) {
                return objMo21804b;
            }
            arrayDeque.removeFirst();
        }
        return objMo21804b;
    }

    public final String toString() {
        return AbstractC0000a.m19p(new StringBuilder("['"), this.f58247b, "']");
    }
}
