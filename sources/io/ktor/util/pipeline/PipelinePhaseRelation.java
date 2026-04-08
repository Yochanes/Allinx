package io.ktor.util.pipeline;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation;", "", "After", "Before", "Last", "Lio/ktor/util/pipeline/PipelinePhaseRelation$After;", "Lio/ktor/util/pipeline/PipelinePhaseRelation$Before;", "Lio/ktor/util/pipeline/PipelinePhaseRelation$Last;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class PipelinePhaseRelation {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation$After;", "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class After extends PipelinePhaseRelation {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation$Before;", "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Before extends PipelinePhaseRelation {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation$Last;", "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Last extends PipelinePhaseRelation {

        /* JADX INFO: renamed from: a */
        public static final Last f46640a = new Last();
    }
}
