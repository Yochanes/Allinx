package io.ktor.util.pipeline;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/pipeline/PipelineExecutor;", "R", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface PipelineExecutor<R> {
    /* JADX INFO: renamed from: a */
    Object mo17210a(Object obj, ContinuationImpl continuationImpl);
}
