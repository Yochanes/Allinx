package kotlinx.coroutines.selects;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\bR\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¨\u0006\t"}, m18302d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "Lkotlinx/atomicfu/AtomicRef;", "", "state", "ClauseData", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
@SourceDebugExtension
public class SelectImplementation<R> implements CancelHandler, SelectBuilder<R>, SelectInstanceInternal<R> {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56505g = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f56506a;

    /* JADX INFO: renamed from: c */
    public Object f56508c;
    private volatile /* synthetic */ Object state$volatile = SelectKt.f56528b;

    /* JADX INFO: renamed from: b */
    public ArrayList f56507b = new ArrayList(2);

    /* JADX INFO: renamed from: d */
    public int f56509d = -1;

    /* JADX INFO: renamed from: f */
    public Object f56510f = SelectKt.f56531e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class ClauseData {

        /* JADX INFO: renamed from: a */
        public final Object f56511a;

        /* JADX INFO: renamed from: b */
        public final Function3 f56512b;

        /* JADX INFO: renamed from: c */
        public final Function3 f56513c;

        /* JADX INFO: renamed from: d */
        public final Symbol f56514d;

        /* JADX INFO: renamed from: e */
        public final Function f56515e;

        /* JADX INFO: renamed from: f */
        public final Function3 f56516f;

        /* JADX INFO: renamed from: g */
        public Object f56517g;

        /* JADX INFO: renamed from: h */
        public int f56518h = -1;

        public ClauseData(Object obj, Function3 function3, Function3 function32, Symbol symbol, Function function, Function3 function33) {
            this.f56511a = obj;
            this.f56512b = function3;
            this.f56513c = function32;
            this.f56514d = symbol;
            this.f56515e = function;
            this.f56516f = function33;
        }

        /* JADX INFO: renamed from: a */
        public final void m20908a() {
            Object obj = this.f56517g;
            if (obj instanceof Segment) {
                ((Segment) obj).mo20714h(this.f56518h, SelectImplementation.this.f56506a);
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }
    }

    public SelectImplementation(CoroutineContext coroutineContext) {
        this.f56506a = coroutineContext;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* JADX INFO: renamed from: a */
    public final void mo20898a(DisposableHandle disposableHandle) {
        this.f56508c = disposableHandle;
    }

    @Override // kotlinx.coroutines.Waiter
    /* JADX INFO: renamed from: b */
    public final void mo20522b(Segment segment, int i) {
        this.f56508c = segment;
        this.f56509d = i;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* JADX INFO: renamed from: c */
    public final boolean mo20899c(Object obj, Object obj2) {
        return m20907l(obj, obj2) == 0;
    }

    @Override // kotlinx.coroutines.CancelHandler
    /* JADX INFO: renamed from: d */
    public final void mo20500d(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56505g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f56529c) {
                return;
            }
            Symbol symbol = SelectKt.f56530d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f56507b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ClauseData) it.next()).m20908a();
            }
            this.f56510f = SelectKt.f56531e;
            this.f56507b = null;
            return;
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* JADX INFO: renamed from: e */
    public final void mo20900e(Object obj) {
        this.f56510f = obj;
    }

    /* JADX INFO: renamed from: f */
    public final Object m20901f(ContinuationImpl continuationImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56505g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.f56510f;
        ArrayList<ClauseData> arrayList = this.f56507b;
        if (arrayList != null) {
            for (ClauseData clauseData2 : arrayList) {
                if (clauseData2 != clauseData) {
                    clauseData2.m20908a();
                }
            }
            atomicReferenceFieldUpdater.set(this, SelectKt.f56529c);
            this.f56510f = SelectKt.f56531e;
            this.f56507b = null;
        }
        Object objInvoke = clauseData.f56513c.invoke(clauseData.f56511a, clauseData.f56514d, obj2);
        clauseData.getClass();
        Symbol symbol = SelectKt.f56532f;
        Function function = clauseData.f56515e;
        return clauseData.f56514d == symbol ? ((Function1) function).invoke(continuationImpl) : ((Function2) function).invoke(objInvoke, continuationImpl);
    }

    /* JADX INFO: renamed from: g */
    public Object mo20902g(Continuation continuation) {
        return f56505g.get(this) instanceof ClauseData ? m20901f((ContinuationImpl) continuation) : m20903h((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m20903h(ContinuationImpl continuationImpl) {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        Object obj;
        SelectImplementation<R> selectImplementation;
        if (continuationImpl instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) continuationImpl;
            int i = selectImplementation$doSelectSuspend$1.f56523d;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.f56523d = i - Integer.MIN_VALUE;
            } else {
                selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuationImpl);
            }
        }
        Object obj2 = selectImplementation$doSelectSuspend$1.f56521b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = selectImplementation$doSelectSuspend$1.f56523d;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            selectImplementation$doSelectSuspend$1.f56520a = this;
            selectImplementation$doSelectSuspend$1.f56523d = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(selectImplementation$doSelectSuspend$1));
            cancellableContinuationImpl.m20534p();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56505g;
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                Symbol symbol = SelectKt.f56528b;
                obj = Unit.f51459a;
                if (obj3 == symbol) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, cancellableContinuationImpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    cancellableContinuationImpl.m20537t(this);
                    break loop0;
                }
                if (obj3 instanceof List) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, symbol)) {
                            Iterator it = ((Iterable) obj3).iterator();
                            while (it.hasNext()) {
                                ClauseData clauseDataM20904i = m20904i(it.next());
                                Intrinsics.m18596d(clauseDataM20904i);
                                clauseDataM20904i.f56517g = null;
                                clauseDataM20904i.f56518h = -1;
                                m20906k(clauseDataM20904i, true);
                            }
                        } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                } else {
                    if (!(obj3 instanceof ClauseData)) {
                        throw new IllegalStateException(("unexpected state: " + obj3).toString());
                    }
                    ClauseData clauseData = (ClauseData) obj3;
                    Object obj4 = this.f56510f;
                    Function3 function3 = clauseData.f56516f;
                    cancellableContinuationImpl.mo20514y(obj, function3 != null ? (Function3) function3.invoke(this, clauseData.f56514d, obj4) : null);
                }
            }
            Object objM20533o = cancellableContinuationImpl.m20533o();
            if (objM20533o == CoroutineSingletons.f51584a) {
                obj = objM20533o;
            }
            if (obj != coroutineSingletons) {
                selectImplementation = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj2);
            return obj2;
        }
        selectImplementation = selectImplementation$doSelectSuspend$1.f56520a;
        ResultKt.m18313b(obj2);
        selectImplementation$doSelectSuspend$1.f56520a = null;
        selectImplementation$doSelectSuspend$1.f56523d = 2;
        Object objM20901f = selectImplementation.m20901f(selectImplementation$doSelectSuspend$1);
        return objM20901f == coroutineSingletons ? coroutineSingletons : objM20901f;
    }

    /* JADX INFO: renamed from: i */
    public final ClauseData m20904i(Object obj) {
        ArrayList arrayList = this.f56507b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ClauseData) next).f56511a == obj) {
                obj2 = next;
                break;
            }
        }
        ClauseData clauseData = (ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: renamed from: j */
    public void mo20905j(SelectClause1 selectClause1, Function2 function2) {
        m20906k(new ClauseData(selectClause1.getF56496a(), selectClause1.getF56497b(), selectClause1.getF56498c(), null, function2, selectClause1.mo20896c()), false);
    }

    /* JADX INFO: renamed from: k */
    public final void m20906k(ClauseData clauseData, boolean z2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56505g;
        if (atomicReferenceFieldUpdater.get(this) instanceof ClauseData) {
            return;
        }
        Object obj = clauseData.f56511a;
        if (!z2) {
            ArrayList arrayList = this.f56507b;
            Intrinsics.m18596d(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((ClauseData) it.next()).f56511a == obj) {
                        throw new IllegalStateException(AbstractC1610a.m8733k(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        clauseData.f56512b.invoke(obj, this, clauseData.f56514d);
        if (this.f56510f != SelectKt.f56531e) {
            atomicReferenceFieldUpdater.set(this, clauseData);
            return;
        }
        if (!z2) {
            ArrayList arrayList2 = this.f56507b;
            Intrinsics.m18596d(arrayList2);
            arrayList2.add(clauseData);
        }
        clauseData.f56517g = this.f56508c;
        clauseData.f56518h = this.f56509d;
        this.f56508c = null;
        this.f56509d = -1;
    }

    /* JADX INFO: renamed from: l */
    public final int m20907l(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56505g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof CancellableContinuation)) {
                if (Intrinsics.m18594b(obj3, SelectKt.f56529c) || (obj3 instanceof ClauseData)) {
                    return 3;
                }
                if (Intrinsics.m18594b(obj3, SelectKt.f56530d)) {
                    return 2;
                }
                if (Intrinsics.m18594b(obj3, SelectKt.f56528b)) {
                    List listM18413N = CollectionsKt.m18413N(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listM18413N)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListM18426a0 = CollectionsKt.m18426a0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListM18426a0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            ClauseData clauseDataM20904i = m20904i(obj);
            if (clauseDataM20904i != null) {
                Function3 function3 = clauseDataM20904i.f56516f;
                Function3 function32 = function3 != null ? (Function3) function3.invoke(this, clauseDataM20904i.f56514d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, clauseDataM20904i)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                CancellableContinuation cancellableContinuation = (CancellableContinuation) obj3;
                this.f56510f = obj2;
                Function3 function33 = SelectKt.f56527a;
                Symbol symbolMo20513s = cancellableContinuation.mo20513s(Unit.f51459a, function32);
                if (symbolMo20513s == null) {
                    this.f56510f = SelectKt.f56531e;
                    return 2;
                }
                cancellableContinuation.mo20511I(symbolMo20513s);
                return 0;
            }
            continue;
        }
    }
}
