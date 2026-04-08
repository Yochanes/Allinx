package kotlinx.coroutines.selects;

import java.util.Collections;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/selects/UnbiasedSelectImplementation;", "R", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
@SourceDebugExtension
public class UnbiasedSelectImplementation<R> extends SelectImplementation<R> {
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // kotlinx.coroutines.selects.SelectImplementation
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo20902g(Continuation continuation) {
        Collections.shuffle(null);
        throw null;
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    /* JADX INFO: renamed from: j */
    public final void mo20905j(SelectClause1 selectClause1, Function2 function2) {
        throw null;
    }
}
