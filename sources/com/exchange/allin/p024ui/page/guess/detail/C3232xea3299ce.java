package com.exchange.allin.p024ui.page.guess.detail;

import com.exchange.allin.data.GuessTopicVote;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.guess.detail.GuessDetailViewModel$topicVoteList$1$invokeSuspend$$inlined$sortedByDescending$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C3232xea3299ce<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a(Long.valueOf(((GuessTopicVote) obj2).getCreatedAt()), Long.valueOf(((GuessTopicVote) obj).getCreatedAt()));
    }
}
