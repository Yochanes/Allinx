package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/instance/InstanceContext;", "", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class InstanceContext {

    /* JADX INFO: renamed from: a */
    public final Logger f58213a;

    /* JADX INFO: renamed from: b */
    public final Scope f58214b;

    /* JADX INFO: renamed from: c */
    public final ParametersHolder f58215c;

    public InstanceContext(Logger logger, Scope scope, ParametersHolder parametersHolder) {
        Intrinsics.m18599g(logger, "logger");
        Intrinsics.m18599g(scope, "scope");
        this.f58213a = logger;
        this.f58214b = scope;
        this.f58215c = parametersHolder;
    }
}
