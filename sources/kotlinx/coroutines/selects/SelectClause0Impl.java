package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/selects/SelectClause0Impl;", "Lkotlinx/coroutines/selects/SelectClause0;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SelectClause0Impl implements SelectClause0 {

    /* JADX INFO: renamed from: a */
    public final Object f56496a;

    /* JADX INFO: renamed from: b */
    public final Function3 f56497b;

    /* JADX INFO: renamed from: c */
    public final Function3 f56498c;

    public SelectClause0Impl(Object obj) {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.f56495a;
        this.f56496a = obj;
        this.f56497b = onTimeout$selectClause$1;
        Function3 function3 = SelectKt.f56527a;
        this.f56498c = SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.f56533a;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Function3 getF56497b() {
        return this.f56497b;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getF56496a() {
        return this.f56496a;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: c */
    public final Function3 mo20896c() {
        return null;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Function3 getF56498c() {
        return this.f56498c;
    }
}
