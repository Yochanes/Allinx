package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/selects/SelectClause2Impl;", "P", "Q", "Lkotlinx/coroutines/selects/SelectClause2;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SelectClause2Impl<P, Q> implements SelectClause2<P, Q> {

    /* JADX INFO: renamed from: a */
    public final Channel f56502a;

    /* JADX INFO: renamed from: b */
    public final FunctionReferenceImpl f56503b;

    /* JADX INFO: renamed from: c */
    public final Function3 f56504c;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectClause2Impl(Channel channel, Function3 function3, Function3 function32) {
        this.f56502a = channel;
        this.f56503b = (FunctionReferenceImpl) function3;
        this.f56504c = function32;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: a */
    public final Function3 mo20894a() {
        return this.f56503b;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Function3 getF56504c() {
        return this.f56504c;
    }
}
