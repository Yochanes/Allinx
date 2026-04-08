package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/WriterJob;", "Lkotlinx/coroutines/Job;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface WriterJob extends Job {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: g */
    ByteChannel mo17382g();
}
