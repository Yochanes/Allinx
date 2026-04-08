package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6335b implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56372a;

    public /* synthetic */ C6335b(int i) {
        this.f56372a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56372a) {
            case 0:
                ThreadState threadState = (ThreadState) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (element instanceof ThreadContextElement) {
                    ThreadContextElement threadContextElement = (ThreadContextElement) element;
                    Object objMo4794V0 = threadContextElement.mo4794V0(threadState.f56365a);
                    int i = threadState.f56368d;
                    threadState.f56366b[i] = objMo4794V0;
                    threadState.f56368d = i + 1;
                    threadState.f56367c[i] = threadContextElement;
                }
                return threadState;
            case 1:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (!(element2 instanceof ThreadContextElement)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? element2 : Integer.valueOf(iIntValue + 1);
            default:
                ThreadContextElement threadContextElement2 = (ThreadContextElement) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (threadContextElement2 != null) {
                    return threadContextElement2;
                }
                if (element3 instanceof ThreadContextElement) {
                    return (ThreadContextElement) element3;
                }
                return null;
        }
    }
}
