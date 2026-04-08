package kotlin.reflect.jvm.internal.impl.utils;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DFS {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.DFS$1 */
    /* JADX INFO: compiled from: Proguard */
    final class C62341 extends AbstractNodeHandler<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f55089a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean[] f55090b;

        public C62341(Function1 function1, boolean[] zArr) {
            this.f55089a = function1;
            this.f55090b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: a */
        public final Object mo18868a() {
            return Boolean.valueOf(this.f55090b[0]);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: c */
        public final boolean mo18672c(Object obj) {
            boolean zBooleanValue = ((Boolean) this.f55089a.invoke(obj)).booleanValue();
            boolean[] zArr = this.f55090b;
            if (zBooleanValue) {
                zArr[0] = true;
            }
            return !zArr[0];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: a */
        public final Object mo18868a() {
            throw new IllegalStateException("@NotNull method kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler.result must not return null");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Neighbors<N> {
        /* JADX INFO: renamed from: a */
        Iterable mo18671a(Object obj);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface NodeHandler<N, R> {
        /* JADX INFO: renamed from: a */
        Object mo18868a();

        /* JADX INFO: renamed from: b */
        void mo19974b(Object obj);

        /* JADX INFO: renamed from: c */
        boolean mo18672c(Object obj);
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Visited<N> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class VisitedWithSet<N> implements Visited<N> {

        /* JADX INFO: renamed from: a */
        public final HashSet f55091a = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public static Object m20338a(Collection collection, Neighbors neighbors, AbstractNodeHandler abstractNodeHandler) {
        VisitedWithSet visitedWithSet = new VisitedWithSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m20339b(it.next(), neighbors, visitedWithSet, abstractNodeHandler);
        }
        return abstractNodeHandler.mo18868a();
    }

    /* JADX INFO: renamed from: b */
    public static void m20339b(Object obj, Neighbors neighbors, VisitedWithSet visitedWithSet, AbstractNodeHandler abstractNodeHandler) {
        if (obj != null) {
            if (visitedWithSet.f55091a.add(obj) && abstractNodeHandler.mo18672c(obj)) {
                Iterator it = neighbors.mo18671a(obj).iterator();
                while (it.hasNext()) {
                    m20339b(it.next(), neighbors, visitedWithSet, abstractNodeHandler);
                }
                abstractNodeHandler.mo19974b(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[0] = "neighbors";
                break;
            case 2:
            case TYPE_BYTES_VALUE:
            case 16:
            case 19:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case TYPE_BYTES_VALUE:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m20340c(Collection collection, Neighbors neighbors, Function1 function1) {
        return (Boolean) m20338a(collection, neighbors, new C62341(function1, new boolean[1]));
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AbstractNodeHandler<N, R> implements NodeHandler<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: c */
        public boolean mo18672c(Object obj) {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: b */
        public void mo19974b(Object obj) {
        }
    }
}
